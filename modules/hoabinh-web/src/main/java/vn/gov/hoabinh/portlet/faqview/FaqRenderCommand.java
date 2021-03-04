package vn.gov.hoabinh.portlet.faqview;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(immediate = true, property = { 
		"javax.portlet.name=vn_gov_hoabinh_portlet_faqview_FaqViewPortlet",
		"mvc.command.name=view_detail" }, 
	service = MVCRenderCommand.class)

public class FaqRenderCommand implements MVCRenderCommand {
	public final static String VIEW_QUESTION = "/faqview/view_detail.jsp";

	public final static String ERROR = "/faqview/error.jsp";

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		try {
			long questionId = ParamUtil.getLong(renderRequest, "questionId", -1L);
		} catch (Exception e) {
			return ERROR;
		}
		return VIEW_QUESTION;
	}
}
