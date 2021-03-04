package vn.gov.hoabinh.portlet.contactview;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.VContact;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VContactLocalService;
import vn.gov.hoabinh.util.UploadFileUtils;

@Component(
		property = { 
			"javax.portlet.name=vn_gov_hoabinh_contactview",
			"mvc.command.name=add_contact" }, 
		service = MVCActionCommand.class
)
public class ContactActionCommand extends BaseMVCActionCommand {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	private VContactLocalService contactService;

	@Reference(unbind = "-")
	public void setContactService(VContactLocalService contactService) {
		this.contactService = contactService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VContact.class.getName(), actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long plid = serviceContext.getPlid();
		String guestName = ParamUtil.getString(actionRequest, "guestName");
		String email = ParamUtil.getString(actionRequest, "email");
		String title = ParamUtil.getString(actionRequest, "title");
		String address = ParamUtil.getString(actionRequest, "address");
		String phone = ParamUtil.getString(actionRequest, "phone");
		String fax = ParamUtil.getString(actionRequest, "fax");
		String content = ParamUtil.getString(actionRequest, "content");
		boolean hasAttach = false;
		int status = 0;
		long userId = serviceContext.getUserId();
		
		try {
			boolean checkCaptcha = validateCaptcha(actionRequest, actionResponse);
			if (checkCaptcha) {
				VContact contact = contactService.addContact(groupId, companyId, plid, guestName, email, title, address, phone, fax, content,
						hasAttach, status, userId);
				
				// Process attachment				
				List<FileEntry> listFiles = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "attachment");
				if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
					for (FileEntry fileEntry : listFiles) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, contact.getId(), 
								VContact.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
				}
				
				if (Validator.isNotNull(listFiles) && listFiles.size()>0) {
					contact.setHasAttach(true);
					contactService.updateContact(contact);
				}
				
				sendRedirect(actionRequest, actionResponse);
				actionResponse.setRenderParameter("contact", guestName);
				actionResponse.setRenderParameter("jspPage", "/contactview/success.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				// SessionMessages.add(actionRequest, "portlet.common.action.successfully");
			} else {
				log.info("CHECK CAPTCHA");
			}
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("jspPage","/contactview/view.jsp");
		}
		
	}
	
	@ProcessAction(name = "validateCaptcha")
    public boolean validateCaptcha(ActionRequest actionRequest,
            ActionResponse actionResponse) throws IOException, PortletException {
		boolean retval = true;
        try {
            CaptchaUtil.check(actionRequest);
        } catch (CaptchaException e) {
        	retval = false;
            SessionErrors.add(actionRequest, "portlet.common.captcha.invalid");
            actionResponse.setRenderParameter("jspPage","/contactview/view.jsp");
        }
        return retval;
    }
}
