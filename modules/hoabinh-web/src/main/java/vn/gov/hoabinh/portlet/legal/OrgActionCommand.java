package vn.gov.hoabinh.portlet.legal;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.gov.hoabinh.model.VLegalOrg;
import vn.gov.hoabinh.service.VLegalOrgLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(
		property = { 
			"javax.portlet.name=vn_gov_hoabinh_legal",
			"mvc.command.name=crud_org" 
		}, 
		service = MVCActionCommand.class
)
public class OrgActionCommand extends BaseMVCActionCommand {
	
	VLegalOrgLocalService orgService;

	@Reference(unbind = "-")
	public void setOrgService(VLegalOrgLocalService orgService) {
		this.orgService = orgService;
	}
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalOrg.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long plid = serviceContext.getPlid();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		boolean status = ParamUtil.getBoolean(actionRequest, "status", true);
		String orgId = ParamUtil.getString(actionRequest, "orgId", "0");
		boolean rssable = ParamUtil.getBoolean(actionRequest, "rssable", true);
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
		String parentId = ParamUtil.getString(actionRequest, "parentId", "0");
		int position = ParamUtil.getInteger(actionRequest, "position");
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				orgService.addOrg(groupId, name, description, language, rssable, status, parentId, themeDisplay);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				orgService.updateOrg(groupId, orgId, name, description, language, rssable, status, parentId, position);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				orgService.deleteOrg(orgId);
			}

			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/legal/view.jsp");
		}
	}
}
