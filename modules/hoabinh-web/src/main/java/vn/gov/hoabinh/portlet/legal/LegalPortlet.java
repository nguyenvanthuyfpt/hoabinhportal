package vn.gov.hoabinh.portlet.legal;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Legal Portlet",
		"javax.portlet.name=vn_gov_hoabinh_legal",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/legal/view.jsp",
		"com.liferay.portlet.header-portlet-javascript=/js/legal.js",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LegalPortlet extends MVCPortlet {
	Log log = LogFactoryUtil.getLog(this.getClass());

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}
	
	@ProcessAction(name = "searchDocument") 
	public void searchDocument(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String tabs2 = ParamUtil.getString(actionRequest, "tabs2", StringPool.BLANK);
			String keyword = ParamUtil.getString(actionRequest, "keyword", StringPool.BLANK);
			String orgId = ParamUtil.getString(actionRequest, "orgId", "0");
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
			String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
			String signerId = ParamUtil.getString(actionRequest, "signerId", "0");
			String hasSearch = ParamUtil.getString(actionRequest, "hasSearch", StringPool.BLANK);
			
			boolean isNumber = ParamUtil.getBoolean(actionRequest, "isNumber", false);
			boolean isSymbol = ParamUtil.getBoolean(actionRequest, "isSymbol", false); 
			boolean isSummary = ParamUtil.getBoolean(actionRequest, "isSummary", true); 
			boolean isContent = ParamUtil.getBoolean(actionRequest, "isNumber", false);
			boolean isDatePromul = ParamUtil.getBoolean(actionRequest, "isDatePromul", false);
			boolean isDateEffective = ParamUtil.getBoolean(actionRequest, "isDateEffective", false);
			boolean isDateExpire = ParamUtil.getBoolean(actionRequest, "isDateExpire", false);
			
			actionResponse.setRenderParameter("keyword", keyword);
			actionResponse.setRenderParameter("orgId", String.valueOf(orgId));
			actionResponse.setRenderParameter("fieldId", String.valueOf(fieldId));
			actionResponse.setRenderParameter("typeId", String.valueOf(typeId));
			actionResponse.setRenderParameter("signerId", String.valueOf(signerId));
			actionResponse.setRenderParameter("search", hasSearch);
			
			actionResponse.setRenderParameter("isNumber", String.valueOf(isNumber));
			actionResponse.setRenderParameter("isSymbol", String.valueOf(isSymbol));
			actionResponse.setRenderParameter("isSummary", String.valueOf(isSummary));
			actionResponse.setRenderParameter("isContent", String.valueOf(isContent));
			actionResponse.setRenderParameter("isDatePromul", String.valueOf(isDatePromul));
			actionResponse.setRenderParameter("isDateEffective", String.valueOf(isDateEffective));
			actionResponse.setRenderParameter("isDateExpire", String.valueOf(isDateExpire));
			
			actionResponse.setRenderParameter("tabs1", "portlet.legal.document");
			actionResponse.setRenderParameter("tabs2", tabs2);
			actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "searchDraft") 
	public void searchDraft(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String keyword = ParamUtil.getString(actionRequest, "keyword", StringPool.BLANK);
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
			String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
			String statusDraft = ParamUtil.getString(actionRequest, "statusDraft", StringPool.BLANK);
			String hasSearch = ParamUtil.getString(actionRequest, "hasSearch", StringPool.BLANK);
			
			actionResponse.setRenderParameter("keyword", keyword);
			actionResponse.setRenderParameter("fieldId", fieldId);
			actionResponse.setRenderParameter("typeId", typeId);
			actionResponse.setRenderParameter("statusDraft", statusDraft);
			actionResponse.setRenderParameter("search", hasSearch);
			
			actionResponse.setRenderParameter("tabs1", "portlet.legal.draft");
			actionResponse.setRenderParameter("tabs2", "portlet.legal.draft.document");
			actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "searchSugguest") 
	public void searchSugguest(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String keyword = ParamUtil.getString(actionRequest, "keyword", StringPool.BLANK);
			String status = ParamUtil.getString(actionRequest, "status", StringPool.BLANK);
			String hasSearch = ParamUtil.getString(actionRequest, "hasSearch", StringPool.BLANK);
			
			actionResponse.setRenderParameter("keyword", keyword);
			actionResponse.setRenderParameter("status", status);
			actionResponse.setRenderParameter("search", hasSearch);
			
			actionResponse.setRenderParameter("tabs1", "portlet.legal.draft");
			actionResponse.setRenderParameter("tabs2", "portlet.legal.draft.suggest");
			actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
}