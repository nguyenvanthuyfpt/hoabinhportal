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

import vn.gov.hoabinh.model.VLegalType;
import vn.gov.hoabinh.service.VLegalTypeLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(property = { 
		"javax.portlet.name=vn_gov_hoabinh_legal",
		"mvc.command.name=crud_type" }, 
			service = MVCActionCommand.class)
public class TypeActionCommand extends BaseMVCActionCommand {

	VLegalTypeLocalService typeService;

	@Reference(unbind = "-")
	public void setTypeService(VLegalTypeLocalService typeService) {
		this.typeService = typeService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalType.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String name = ParamUtil.getString(actionRequest, "cmd");
		String description = ParamUtil.getString(actionRequest, "cmd");
		boolean status = ParamUtil.getBoolean(actionRequest, "status");
		boolean rssable = ParamUtil.getBoolean(actionRequest, "rssable");
		String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
		int position = ParamUtil.getInteger(actionRequest, "position", 1);
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
		VLegalType type = null;
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				typeService.addType(groupId, name, description, language, status, rssable, themeDisplay);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				type = typeService.getType(typeId);
				type = typeService.updateType(groupId, typeId, language, name, description, position, status, rssable);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				typeService.deleteType(typeId);
			}

			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/legal/view.jsp");
		}
	}
}
