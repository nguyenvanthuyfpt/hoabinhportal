package vn.gov.hoabinh.util;

import java.util.Date;
import java.util.List;

import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.rss.FeedItems;
import vn.gov.hoabinh.rss.Item;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil;

public class Rss4CMS {

	public static FeedItems buildRssItems(ThemeDisplay themeDisplay, String categoryId, String entryURL, int quantity)
			throws Exception {

		FeedItems feedItems = new FeedItems();

		Layout layout = themeDisplay.getLayout();
		long companyId = themeDisplay.getCompanyId();
		long groupId = layout.getGroupId();
		String language = themeDisplay.getLanguageId();

		List<VcmsArticle> list = null;
		try {
			long statusId = 704;
					// VcmsStatusLocalServiceUtil.getByC_G_A(companyId, groupId, true).getStatusId();
			list = VcmsArticleLocalServiceUtil.getArticleBy_G_L_S_C(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, categoryId, true, 0, quantity);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (list != null) {
			// DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

			for (int i = 0; i < list.size(); i++) {
				VcmsArticle article = (VcmsArticle) list.get(i);

				String id = article.getArticleId();
				String title = article.getTitle();
				String description = article.getLead();

				String logo = "";
				String logoDesc = "";
				String imageType = "";

				/*
				 * long imageId =
				 * Long.parseLong(WebKeysExt.VCMS_ARTICLE_SMALL_IMAGE_KEY +
				 * article.getArticleId());
				 * 
				 * if (Validator.isNotNull(article.getImage())) { logo =
				 * themeDisplay.getPortalURL() + "/image/images?img_id=" +
				 * article.getImage(); logoDesc = article.getImageTitle(); }
				 */

				String content = article.getContent();

				String link = entryURL;
				link += "/" + article.getArticleId();

				String author = article.getAuthor();
				String source = article.getSource();

				Date pubDate = null;
				if (Validator.isNotNull(article.getPublishedDate()))
					pubDate = article.getPublishedDate();

				String attachs = "";

				/*
				 * if (article.getHasAttachment()) {
				 * 
				 * List attachmentList = AttachmentLocalServiceUtil
				 * .getAttachments(Long.parseLong(article.getArticleId()),
				 * VcmsArticle.class);
				 * 
				 * for (int j = 0; j < attachmentList.size(); j++) {
				 * 
				 * Attachment att = (Attachment) attachmentList.get(j);
				 * DLFileEntry entry = null;
				 * 
				 * try { entry = (DLFileEntry)
				 * DLFileEntryLocalServiceUtil.getFileEntry(att.getFileEntryId()
				 * ); } catch (NoSuchFileEntryException ex) {
				 * System.out.println("Not exist file entry..."); }
				 * 
				 * if (Validator.isNotNull(entry)) {
				 * 
				 * long folderId = entry.getFolderId(); String name =
				 * entry.getName(); String fileExtension =
				 * entry.getTitleWithExtension();
				 * 
				 * String extension =
				 * fileExtension.substring(fileExtension.lastIndexOf(".") + 1,
				 * fileExtension.length());
				 * 
				 * attachs += "<div><a href=\"" + themeDisplay.getPortalURL() +
				 * "/c/document_library/get_file?p_l_id=" +
				 * themeDisplay.getPlid() + "&folderId=" + folderId + "&name=" +
				 * name + "\">";
				 * 
				 * attachs += entry.getTitleWithExtension();
				 * 
				 * attachs += "</a></div>"; } } }
				 */

				if ((title != null && title.length() > 0) && (link != null && link.length() > 0)) {

					// Create RSS Items
					Item item = new Item();
					item.setId(id);
					item.setTitle(title);
					item.setLogo(logo);
					item.setLogoDesc(logoDesc);
					item.setDescription(description);
					item.setContent(content);
					item.setLink(link);
					item.setCategory(categoryId);
					item.setPubDate(pubDate);
					item.setAuthor(author);
					item.setSource(source);
					item.setLanguage(language);
					item.setAttachs(attachs);

					// Collection of RSS items
					feedItems.addItem(item);
				}
			}
		}
		return feedItems;
	}

}
