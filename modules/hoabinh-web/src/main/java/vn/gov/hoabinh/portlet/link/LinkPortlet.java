package vn.gov.hoabinh.portlet.link;

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
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.AdvType;
import vn.gov.hoabinh.service.LinkGroupLocalService;
import vn.gov.hoabinh.service.LinksLocalService;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Link Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/link/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LinkPortlet extends MVCPortlet {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	LinksLocalService linksService;
	LinkGroupLocalService linkGroupService;
	
	@Reference(unbind = "-")	
	public void setLinksService(LinksLocalService linksService) {
		this.linksService = linksService;
	}

	@Reference(unbind = "-")
	public void setLinkGroupService(LinkGroupLocalService linkGroupService) {
		this.linkGroupService = linkGroupService;
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
	
	// LinkGroup
	@ProcessAction (name ="addOrUpdateLinkGroup")
	public void addOrUpdateLinkGroup(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(AdvType.class.getName(), actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();
			
			long linkgroupId = ParamUtil.getLong(actionRequest, "linkgroupId", 0);
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			int position = ParamUtil.getInteger(actionRequest, "position",  0);
			long userId = serviceContext.getUserId();
			
			if (linkgroupId == 0) {
				linkGroupService.addLinkGroup(groupId, companyId, plid, name, description, position, userId);
			} else {
				linkGroupService.updateLinkGroup(linkgroupId, groupId, companyId, name, description, position);
			}
			actionResponse.setRenderParameter("tabs1", "portlet.link.group");
			actionResponse.setRenderParameter("jspPage", "/link/view.jsp");
			sendRedirect(actionRequest, actionResponse);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	// Links
	@ProcessAction (name ="addOrUpdateLinks")
	public void addOrUpdateLinks(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(AdvType.class.getName(), actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();
			
			long linkId = ParamUtil.getLong(actionRequest, "linkId", 0);
			long linkgroupId = ParamUtil.getLong(actionRequest, "linkgroupId", 0);
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			int position = ParamUtil.getInteger(actionRequest, "position",  0);
			long userId = serviceContext.getUserId();
			String image = ParamUtil.getString(actionRequest, "image");
			String url = ParamUtil.getString(actionRequest, "url");
			
			if (linkId == 0) {
				linksService.addLinks(groupId, companyId, plid, linkgroupId, name, description, image, url, position,
						userId);
			} else {
				linksService.updateLinks(linkId, groupId, companyId, linkgroupId, name, description, image, url,
						position);
			}
			
			actionResponse.setRenderParameter("tabs1", "portlet.link.linkitem");
			actionResponse.setRenderParameter("jspPage", "/link/view.jsp");
			sendRedirect(actionRequest, actionResponse);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name ="deleteLink")
	public void deleteLinks(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("deleteLinks");
		try {
			long linkId = ParamUtil.getLong(actionRequest, "linkId", 0);
			linksService.deleteLink(linkId);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name ="deleteLinkGroup")
	public void deleteLinkGroup(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("deleteLinkGroup");
		try {
			long linkgroupId = ParamUtil.getLong(actionRequest, "linkgroupId", 0);
			linkGroupService.deleteLinkGroup(linkgroupId);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "searchLink") 
	public void searchItem(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String keyword = ParamUtil.getString(actionRequest, "keyword", StringPool.BLANK);
			String linkGroupId = ParamUtil.getString(actionRequest, "linkGroupId");
			
			actionResponse.setRenderParameter("keyword", keyword);
			actionResponse.setRenderParameter("linkGroupId", linkGroupId);
			actionResponse.setRenderParameter("search", "true");
			
			actionResponse.setRenderParameter("tabs1", "portlet.link.linkitem");
			actionResponse.setRenderParameter("jspPage", "/link/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
}