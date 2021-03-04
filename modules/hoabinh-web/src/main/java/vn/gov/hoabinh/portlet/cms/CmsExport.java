package vn.gov.hoabinh.portlet.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.model.VcmsStatus;
import vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil;

public class CmsExport {
	public static String[] columnNamesReportCategory = { "#", "Category", "Approve pendding", "Approved", "Published" };
	public static String[] columnNamesReportUser = { "#", "UserName", "Fullname", "Total article create-by", "Total article modified-by", "Total article published-by" };
	public static final String CSV_SEPARATOR = ",";

	public static void exportHTMLCSVData(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		String tableHTML = ParamUtil.getString(resourceRequest, "tableHTMLDataInput");
		StringBundler sb = new StringBundler();
		Document doc = Jsoup.parseBodyFragment(tableHTML);
		Elements cells = doc.getElementsByTag("th");
		for (Element cell : cells) {
			sb.append(getCSVFormattedValue(String.valueOf(cell.text())));
			sb.append(CSV_SEPARATOR);
		}
		sb.setIndex(sb.index() - 1);
		sb.append(CharPool.NEW_LINE);
		Elements rows = doc.getElementsByTag("tr");
		for (Element row : rows) {
			Elements tdcells = row.getElementsByTag("td");
			for (Element cell : tdcells) {
				sb.append(getCSVFormattedValue(String.valueOf(cell.text())));
				sb.append(CSV_SEPARATOR);
			}
			sb.setIndex(sb.index() - 1);
			sb.append(CharPool.NEW_LINE);
		}
		String fileName = "portalUsers.csv";
		byte[] bytes = sb.toString().getBytes();
		String contentType = ContentTypes.APPLICATION_TEXT;
		PortletResponseUtil.sendFile(resourceRequest, resourceResponse, fileName, bytes, contentType);
	}

	public static void exportReportByCategory(List<VcmsCategory> listCategory, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		StringBundler sb = new StringBundler();
		long groupId = (long) resourceRequest.getAttribute("groupId");
		String language = (String) resourceRequest.getAttribute("language");
		List<VcmsStatus> listStatus = VcmsStatusLocalServiceUtil.getByGroupId(groupId);
		for (String columnName : columnNamesReportCategory) {
			sb.append(getCSVFormattedValue(columnName));
			sb.append(CSV_SEPARATOR);
		}
		sb.setIndex(sb.index() - 1);
		sb.append(CharPool.NEW_LINE);
		int stt = 1;
		for (VcmsCategory category : listCategory) {
			sb.append(getCSVFormattedValue(String.valueOf(stt++)));
			sb.append(CSV_SEPARATOR);
			sb.append(getCSVFormattedValue(category.getName()));
			sb.append(CSV_SEPARATOR);
			for (VcmsStatus status:listStatus) {
				sb.append(getCSVFormattedValue(String.valueOf(VcmsArticleLocalServiceUtil.countReportCategory(groupId, language, status.getStatusId(), category.getCategoryId()))));
				sb.append(CSV_SEPARATOR);	
			}
			sb.setIndex(sb.index() - 1);
			sb.append(CharPool.NEW_LINE);
		}

		String fileName = "reportByCategory.csv";
		byte[] bytes = sb.toString().getBytes();
		String contentType = ContentTypes.APPLICATION_TEXT;
		resourceResponse.setCharacterEncoding(StringPool.UTF8);
		resourceResponse.setContentType(ContentTypes.TEXT_CSV_UTF8);
		PortletResponseUtil.sendFile(resourceRequest, resourceResponse, fileName, bytes, contentType);
	}
	
	public static void exportReportByUser(List<User> listUser, ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		long groupId = (long) resourceRequest.getAttribute("groupId");
		String language = (String) resourceRequest.getAttribute("language");
		StringBundler sb = new StringBundler();
		for (String columnName : columnNamesReportUser) {
			sb.append(getCSVFormattedValue(columnName));
			sb.append(CSV_SEPARATOR);
		}
		sb.setIndex(sb.index() - 1);
		sb.append(CharPool.NEW_LINE);
		int stt = 1;
		for (User user : listUser) {
			if (!user.getDefaultUser()) {
				sb.append(getCSVFormattedValue(String.valueOf(stt++)));
				sb.append(CSV_SEPARATOR);
				sb.append(getCSVFormattedValue(user.getScreenName()));
				sb.append(CSV_SEPARATOR);
				sb.append(getCSVFormattedValue(user.getFirstName()+ " " + user.getLastName()));
				sb.append(CSV_SEPARATOR);
				sb.append(getCSVFormattedValue(String.valueOf(VcmsArticleLocalServiceUtil.countReportUser(groupId, language, String.valueOf(user.getUserId()), "create"))));
				sb.append(CSV_SEPARATOR);
				sb.append(getCSVFormattedValue(String.valueOf(VcmsArticleLocalServiceUtil.countReportUser(groupId, language, String.valueOf(user.getUserId()), "modify"))));
				sb.append(CSV_SEPARATOR);
				sb.append(getCSVFormattedValue(String.valueOf(VcmsArticleLocalServiceUtil.countReportUser(groupId, language, String.valueOf(user.getUserId()), "published"))));
				sb.append(CSV_SEPARATOR);
				sb.setIndex(sb.index() - 1);
				sb.append(CharPool.NEW_LINE);
			}
		}

		String fileName = "reportByUser.csv";
		byte[] bytes = sb.toString().getBytes();
		String contentType = ContentTypes.APPLICATION_TEXT;
		resourceResponse.setCharacterEncoding(StringPool.UTF8);
		resourceResponse.setContentType(ContentTypes.TEXT_CSV_UTF8);
		PortletResponseUtil.sendFile(resourceRequest, resourceResponse, fileName, bytes, contentType);
	}

	public static String getCSVFormattedValue(String value) {
		StringBundler sb = new StringBundler(3);
		sb.append(CharPool.QUOTE);
		sb.append(StringUtil.replace(value, CharPool.QUOTE, StringPool.DOUBLE_QUOTE));
		sb.append(CharPool.QUOTE);
		return sb.toString();
	}
	
	public static void exportRecordSetToCSV_TEST(ResourceResponse resourceResponse) {        
        HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(resourceResponse);
        String sFileName = "TestFile.csv";
        String contentType = "application/vnd.ms-excel";
        String contentDisposition = "attachment; filename=\"" + HttpUtil.encodeURL(sFileName, true);
        
        httpResponse.setHeader(HttpHeaders.CONTENT_DISPOSITION, contentDisposition);
        httpResponse.setContentType(contentType);
        
        try {            
            OutputStream out = httpResponse.getOutputStream();
                        
            out.write("Ho va ten".getBytes(Charset.forName("UTF-8")));
            out.write(",".getBytes());
            out.write("Age".getBytes(Charset.forName("UTF-8")));
            out.write("\n".getBytes());
            
            out.write("User 1".getBytes(Charset.forName("UTF-8")));
            out.write(",".getBytes());
            out.write("35".getBytes(Charset.forName("UTF-8")));
            out.write("\n".getBytes());
            
            out.write("User 2".getBytes(Charset.forName("UTF-8")));
            out.write(",".getBytes());
            out.write("40".getBytes(Charset.forName("UTF-8")));
            out.write("\n".getBytes());
                                    
            out.flush();
            
        } catch (IOException e) {            
            e.printStackTrace();
            
        }
    }
}
