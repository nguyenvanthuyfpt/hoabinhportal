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

import vn.gov.hoabinh.model.VLegalSigner;
import vn.gov.hoabinh.service.VLegalSignerLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(
		property = { 
			"javax.portlet.name=vn_gov_hoabinh_legal",
			"mvc.command.name=crud_signer" 
		}, 
		service = MVCActionCommand.class
)
public class SignerActionCommand extends BaseMVCActionCommand {
	
	VLegalSignerLocalService signerService;

	@Reference(unbind = "-")
	public void setSignerService(VLegalSignerLocalService signerService) {
		this.signerService = signerService;
	}
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalSigner.class.getName(), actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String sigId = ParamUtil.getString(actionRequest, "sigId", "0");
		boolean statusSigner = ParamUtil.getBoolean(actionRequest, "statusSigner", true);
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
		VLegalSigner signer = null;
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				signer = signerService.addSigner(groupId, firstName, lastName, language, statusSigner, themeDisplay);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				signer = signerService.getSigner(sigId);
				signerService.updateSigner(groupId, sigId, firstName, lastName, language, statusSigner);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				signerService.deleteSigner(sigId);
			}
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/legal/view.jsp");
		}
	}
}
