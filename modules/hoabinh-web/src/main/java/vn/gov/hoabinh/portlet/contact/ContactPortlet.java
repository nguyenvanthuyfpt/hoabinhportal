package vn.gov.hoabinh.portlet.contact;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.VContact;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VContactLocalService;
import vn.gov.hoabinh.service.VContactLocalServiceUtil;
import vn.gov.hoabinh.util.PortalConstant;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Contact Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/contact/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ContactPortlet extends MVCPortlet {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	VContactLocalService contactService;
	
	@Reference(unbind = "-")
	public void setContactService(VContactLocalService contactService) {
		this.contactService = contactService;
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}
	
	@ProcessAction (name ="addOrUpdateContact")
	public void addOrUpdateAdvItem(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(VContact.class.getName(), actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();
			
			String cmd = ParamUtil.getString(actionRequest, "cmd");
			long Id = ParamUtil.getLong(actionRequest, "Id", 0);
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
			
			if (Validator.isNotNull(cmd)) {
				VContact contact = VContactLocalServiceUtil.getContact(Id);
				contact.setStatus(PortalConstant.ACTION_APPROVE.equals(cmd)?1:2);
				contactService.updateContact(contact);
			} else {
				if (Id == 0) {
					contactService.addContact(groupId, companyId, plid, guestName, email, title, address, phone, fax,
							content, hasAttach, status, userId);
				} else {
					contactService.updateContact(Id, groupId, companyId, guestName, email, title, address, phone, fax,
							content, hasAttach, status);
				}				
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name = "deleteContact")
	public void deleteContact(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception { 
		try {
			String Id = ParamUtil.getString(actionRequest, "Id");
			VContactLocalServiceUtil.deleteContact(Long.parseLong(Id));
			AttachmentLocalServiceUtil.deleteAttachments(VContact.class, Long.parseLong(Id));
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}

}