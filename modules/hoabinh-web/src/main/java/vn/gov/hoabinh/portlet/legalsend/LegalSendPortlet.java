package vn.gov.hoabinh.portlet.legalsend;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.service.VLegalDraftDocumentLocalService;
import vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService;

@Component(configurationPid = "vn.gov.hoabinh.configuration.LegalSendConfig", 
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Legal Send Portlet",
		"javax.portlet.name=vn_gov_hoabinh_portlet_legalsend_LegalSendPortlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/legalsend/view.jsp",
		"javax.portlet.init-param.config-template=/legalsend/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
	}, service = Portlet.class)
public class LegalSendPortlet extends MVCPortlet {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	VLegalDraftDocumentLocalService legalDraftDocumentLocalService;
	VLegalSuggestDocumentLocalService legalSuggestDocumentLocalService; 
	
	@Reference(unbind = "-")
	public void setLegalDraftDocumentLocalService(VLegalDraftDocumentLocalService legalDraftDocumentLocalService) {
		this.legalDraftDocumentLocalService = legalDraftDocumentLocalService;
	}
	
	@Reference(unbind = "-")
	public void setLegalSuggestDocumentLocalService(VLegalSuggestDocumentLocalService legalSuggestDocumentLocalService) {
		this.legalSuggestDocumentLocalService = legalSuggestDocumentLocalService;
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub

		super.doView(renderRequest, renderResponse);
	}
	
    @Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {
        try {
            CaptchaUtil.serveImage(resourceRequest, resourceResponse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void searchDraft(ActionRequest actionRequest, ActionResponse actionResponse){
		String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
		String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
		String keywords = ParamUtil.getString(actionRequest, "keywords", StringPool.BLANK);
		
		String hasSearch = ParamUtil.getString(actionRequest, "hasSearch");
		String fromPromul = ParamUtil.getString(actionRequest, "fromPromul");
		String toPromul = ParamUtil.getString(actionRequest, "toPromul");
		String fromEffect = ParamUtil.getString(actionRequest, "fromEffect");
		String toEffect = ParamUtil.getString(actionRequest, "toEffect");
		String fromExpire = ParamUtil.getString(actionRequest, "fromExpire");
		String toExpire = ParamUtil.getString(actionRequest, "toExpire");
		
		try {
			actionResponse.setRenderParameter("hasSearch", "true");
			actionResponse.setRenderParameter("fieldId", fieldId);
			actionResponse.setRenderParameter("typeId", typeId);
			actionResponse.setRenderParameter("keywords", keywords);
			
			actionResponse.setRenderParameter("fromPromul", fromPromul);
			actionResponse.setRenderParameter("toPromul", toPromul);
			
			actionResponse.setRenderParameter("fromEffect", fromEffect);
			actionResponse.setRenderParameter("toEffect", toEffect);
			
			actionResponse.setRenderParameter("fromExpire", fromExpire);
			actionResponse.setRenderParameter("toExpire", toExpire);
			actionResponse.setRenderParameter("jspPage", "/legalsend/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(LegalSendPortlet.class);
}