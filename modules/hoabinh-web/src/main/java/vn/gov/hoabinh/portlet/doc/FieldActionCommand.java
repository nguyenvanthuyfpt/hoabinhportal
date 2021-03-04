package vn.gov.hoabinh.portlet.doc;

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

import vn.gov.hoabinh.model.vdocField;
import vn.gov.hoabinh.service.vdocFieldLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(property = { "javax.portlet.name=vn_gov_hoabinh_doc",
		"mvc.command.name=crud_field" }, service = MVCActionCommand.class)
public class FieldActionCommand extends BaseMVCActionCommand {

	Log log = LogFactoryUtil.getLog(this.getClass());

	vdocFieldLocalService fieldLocalService;

	@Reference(unbind = "-")
	public void setFieldService(vdocFieldLocalService fieldService) {
		this.fieldLocalService = fieldService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(vdocField.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long userId = serviceContext.getUserId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");

		try {
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");

			String parentId = ParamUtil.getString(actionRequest, "parentId");
			boolean statusField = ParamUtil.getBoolean(actionRequest, "statusField", true);
			int position = ParamUtil.getInteger(actionRequest, "position", 0);
			String listparent = ParamUtil.getString(actionRequest, "listparent");
			String levels = ParamUtil.getString(actionRequest, "levels");

			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				fieldLocalService.addField(groupId, userId, language, parentId, name, description, statusField, position,
						listparent, levels);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				fieldLocalService.updateField(fieldId, groupId, userId, language, parentId, name, description, statusField,
						position, listparent, levels, themeDisplay);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				fieldLocalService.deleteField(fieldId, themeDisplay);
			}
			actionResponse.setRenderParameter("tabs1", "portlet.doc.general-manage");
			actionResponse.setRenderParameter("tabs2", "portlet.doc.field");
			actionResponse.setRenderParameter("jspPage", "/doc/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/doc/view.jsp");
		}
	}
}
