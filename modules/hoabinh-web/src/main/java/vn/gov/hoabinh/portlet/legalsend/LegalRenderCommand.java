package vn.gov.hoabinh.portlet.legalsend;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(immediate = true, property = { 
		"javax.portlet.name=vn_gov_hoabinh_portlet_legalsend_LegalSendPortlet",
		"mvc.command.name=view_detail" }, 
	service = MVCRenderCommand.class)

public class LegalRenderCommand implements MVCRenderCommand {
	
	public final static String SEND_SUGGUESTION = "/legalsend/send_suggestion.jsp";
	
	public final static String VIEW_DETAIL_DRAFT = "/legalsend/view_detail.jsp";
	
	public final static String SEARCH_DRAFT = "/legalsend/view.jsp";

	public final static String ERROR = "/legalsend/error.jsp";

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String path = "";
		try {
			String draftId = ParamUtil.getString(renderRequest, "draftId");
			String cmd = ParamUtil.getString(renderRequest, "cmd");
			if ("view_draft".equals(cmd)) {
				path = VIEW_DETAIL_DRAFT;
			} else if ("send_sugguest".equals(cmd)) {
				path = SEND_SUGGUESTION;
			} else if ("search_draft".equals(cmd)) {
				path = SEARCH_DRAFT;
			}
		} catch (Exception e) {
			return ERROR;
		}
		return path;
	}
}
