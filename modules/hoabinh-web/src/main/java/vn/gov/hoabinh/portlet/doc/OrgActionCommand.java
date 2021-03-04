package vn.gov.hoabinh.portlet.doc;

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

import vn.gov.hoabinh.model.vdocOrg;
import vn.gov.hoabinh.service.vdocOrgLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(property = { "javax.portlet.name=vn_gov_hoabinh_doc",
		"mvc.command.name=crud_org" }, service = MVCActionCommand.class)
public class OrgActionCommand extends BaseMVCActionCommand {

	vdocOrgLocalService orgService;

	@Reference(unbind = "-")
	public void setOrgService(vdocOrgLocalService orgService) {
		this.orgService = orgService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(vdocOrg.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		String orgId = ParamUtil.getString(actionRequest, "orgId", "0");
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
		String parentId = ParamUtil.getString(actionRequest, "parentId", "0");
		int position = ParamUtil.getInteger(actionRequest, "position");
		long userId = serviceContext.getUserId();
		String code = ParamUtil.getString(actionRequest, "code");
		String address = ParamUtil.getString(actionRequest, "address");
		String phone = ParamUtil.getString(actionRequest, "phone");
		String fax = ParamUtil.getString(actionRequest, "fax");
		String listparent = ParamUtil.getString(actionRequest, "listparent");
		boolean statusOrg = ParamUtil.getBoolean(actionRequest, "statusOrg", true);
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				orgService.addOrg(groupId, language, userId, companyId, parentId, code, name, description, address,
						phone, fax, statusOrg, position, listparent);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				orgService.updateOrg(orgId, groupId, language, userId, parentId, code, name, description, address,
						phone, fax, statusOrg, position, listparent, themeDisplay);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				orgService.deletevdocOrg(orgId);
			}
			actionResponse.setRenderParameter("tabs1", "portlet.doc.general-manage");
			actionResponse.setRenderParameter("tabs2", "portlet.doc.org");
			actionResponse.setRenderParameter("jspPage", "/doc/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/doc/view.jsp");
		}
	}
}
