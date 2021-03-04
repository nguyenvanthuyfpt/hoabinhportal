package vn.gov.hoabinh.portlet.legalview;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(immediate = true, property = { 
		"javax.portlet.name=vn_gov_hoabinh_portlet_legalview_LegalViewPortlet",
		"mvc.command.name=view_detail" }, 
	service = MVCRenderCommand.class)

public class LegalRenderCommand implements MVCRenderCommand {
	public final static String VIEW_DOCUMENT = "/legalview/view_detail.jsp";

	public final static String ERROR = "/legalview/error.jsp";

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		try {
			long documentId = ParamUtil.getLong(renderRequest, "leaveId", -1L);
		} catch (Exception e) {
			return ERROR;
		}
		return VIEW_DOCUMENT;
	}
}
