package vn.gov.hoabinh.portlet.cms;

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
import com.liferay.portal.kernel.util.ParamUtil;

import vn.gov.hoabinh.model.VcmsPortion;
import vn.gov.hoabinh.service.VcmsPortionLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(
		property = { 
				"javax.portlet.name=vn_gov_hoabinh_cms",
				"mvc.command.name=crud_portion" }, 
		service = MVCActionCommand.class
)
public class PortionActionCommand extends BaseMVCActionCommand {
	
	VcmsPortionLocalService portionService;

	@Reference(unbind = "-")
	public void setPortionService(VcmsPortionLocalService portionService) {
		this.portionService = portionService;
	}
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VcmsPortion.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long plid = serviceContext.getPlid();
		
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String portionId = ParamUtil.getString(actionRequest, "portionId", "0");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		String language = PortalConstant.DEFAULT_LANGUAGE;
		String code = ParamUtil.getString(actionRequest, "code");
		boolean categorizable = ParamUtil.getBoolean(actionRequest, "categorizable", false);
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				portionService.addPortion(groupId, companyId, plid, code, name, description, categorizable, language);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				portionService.updatePortion(portionId, groupId, companyId, code, name, description, categorizable,
						language);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				portionService.deletePortion(portionId);
			}
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
			actionResponse.setRenderParameter("tabs1", "portlet.cms.general-manage");
			actionResponse.setRenderParameter("tabs2", "portlet.cms.portion");
			actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath","/cms/view.jsp");
		}
	}
}
