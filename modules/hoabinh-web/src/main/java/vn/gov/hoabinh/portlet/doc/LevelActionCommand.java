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
import com.liferay.portal.kernel.util.ParamUtil;

import vn.gov.hoabinh.model.vdocField;
import vn.gov.hoabinh.service.vdocLevelLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(property = { "javax.portlet.name=vn_gov_hoabinh_doc",
		"mvc.command.name=crud_level" }, service = MVCActionCommand.class)
public class LevelActionCommand extends BaseMVCActionCommand {

	Log log = LogFactoryUtil.getLog(this.getClass());

	vdocLevelLocalService levelLocalService;

	@Reference(unbind = "-")
	public void setLevelService(vdocLevelLocalService levelService) {
		this.levelLocalService = levelService;
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
			String levelId = ParamUtil.getString(actionRequest, "levelId", "0");
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			int position = ParamUtil.getInteger(actionRequest, "position", 0);

			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				levelLocalService.addLevel(groupId, userId, language, name, description, position);

			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				levelLocalService.updateLevel(levelId, groupId, userId, language, name, description, position);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				levelLocalService.deletevdocLevel(levelId);
			}
			actionResponse.setRenderParameter("tabs1", "portlet.doc.general-manage");
			actionResponse.setRenderParameter("tabs2", "portlet.doc.level");
			actionResponse.setRenderParameter("jspPage", "/doc/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/doc/view.jsp");
		}
	}
}
