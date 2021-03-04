package vn.gov.hoabinh.portlet.legal;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.gov.hoabinh.model.VLegalField;
import vn.gov.hoabinh.service.VLegalFieldLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(
	property = { 
		"javax.portlet.name=vn_gov_hoabinh_legal",
		"mvc.command.name=crud_field" 
	}, 
	service = MVCActionCommand.class
)
public class FieldActionCommand extends BaseMVCActionCommand {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	VLegalFieldLocalService fieldService;

	@Reference(unbind = "-")
	public void setFieldService(VLegalFieldLocalService fieldService) {
		this.fieldService = fieldService;
	}
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalField.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		
		try {
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			boolean status = ParamUtil.getBoolean(actionRequest, "status", true);
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
			boolean rssable = ParamUtil.getBoolean(actionRequest, "rssable", true);
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				fieldService.addField(groupId, name, description, language, status, rssable, themeDisplay);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				fieldService.updateField(groupId, fieldId, name, description, language, status, rssable);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				fieldService.deleteField(fieldId);
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath","/legal/view.jsp");
		}
	}
}
