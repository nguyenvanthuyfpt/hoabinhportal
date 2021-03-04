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
import vn.gov.hoabinh.service.VcmsTypeLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(
		property = { 
				"javax.portlet.name=vn_gov_hoabinh_cms",
				"mvc.command.name=crud_type" }, 
		service = MVCActionCommand.class
)
public class TypeActionCommand extends BaseMVCActionCommand {
	
	VcmsTypeLocalService typeService;

	@Reference(unbind = "-")
	public void setTypeService(VcmsTypeLocalService typeService) {
		this.typeService = typeService;
	}
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VcmsPortion.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long plid = serviceContext.getPlid();
		
		long typeId = ParamUtil.getLong(actionRequest, "typeId");
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String code = ParamUtil.getString(actionRequest, "code");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		String language = PortalConstant.DEFAULT_LANGUAGE;
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				typeService.addType(groupId, companyId, plid, code, name, description, language);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				typeService.updateType(typeId, groupId, companyId, code, name, description, language);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				typeService.deleteType(typeId);
			}
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath","/cms/view.jsp");
		}
	}

	
}
