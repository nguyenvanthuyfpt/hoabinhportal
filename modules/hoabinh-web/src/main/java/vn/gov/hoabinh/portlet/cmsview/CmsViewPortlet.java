package vn.gov.hoabinh.portlet.cmsview;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.polls.model.PollsVote;
import com.liferay.polls.service.PollsVoteLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.model.VcmsDiscussion;
import vn.gov.hoabinh.rss.Channel;
import vn.gov.hoabinh.rss.ChannelImage;
import vn.gov.hoabinh.rss.FeedDocument;
import vn.gov.hoabinh.rss.FeedItems;
import vn.gov.hoabinh.service.VcmsArticleRatingLocalService;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsDiscussionLocalService;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.Rss4CMS;

@Component(
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Cms View Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/cmsview/view.jsp",
		"javax.portlet.init-param.config-template=/cmsview/configuration.jsp",
		"com.liferay.portlet.header-portlet-javascript=/js/cms.js",
		"com.liferay.portlet.header-portlet-javascript=/js/addthis_widget.js",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class CmsViewPortlet extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(this.getClass());

	VcmsDiscussionLocalService discussionService;
	
	VcmsArticleRatingLocalService ratingServcie; 
	
	PollsVoteLocalService pollsVoteService;
	
	String voted = "";
	
	Map<String, String> mapVoted = new HashMap<String, String>();

	@Reference(unbind = "-")
	public void setDiscussionService(VcmsDiscussionLocalService discussionService) {
		this.discussionService = discussionService;
	}
	
	@Reference(unbind = "-")
	public void setPollsVoteService(PollsVoteLocalService pollsVoteService) {
		this.pollsVoteService = pollsVoteService;
	}
	
	@Reference(unbind = "-")
	public void setRatingServcie(VcmsArticleRatingLocalService ratingServcie) {
		this.ratingServcie = ratingServcie;
	}

	public static String HOME_PAGE = "http://www.hoabinh.gov.vn";
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		String cmd = resourceRequest.getParameter("cmd");
		String stars = resourceRequest.getParameter("stars");
		String articleId = resourceRequest.getParameter("articleId");
		String session = resourceRequest.getRequestedSessionId();
		String ratingInfo = "";
		
		if ("check".equals(cmd)) {
			try {
				ratingInfo = getRatingInfo(articleId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			jsonObject.put("ratingInfo", ratingInfo);
			writer.write(jsonObject.toString());
		} else if ("vote".equals(cmd)) {			
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			jsonObject.put("articleId", articleId);
			jsonObject.put("stars", stars);
			
			try {
				ratingServcie.deleteRatingByA_S(Long.parseLong(articleId), session);
				ratingServcie.addRating(Long.parseLong(articleId), Integer.parseInt(stars), session);
				ratingInfo = getRatingInfo(articleId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsonObject.put("ratingInfo", ratingInfo);
	        writer.write(jsonObject.toString());
		}		
	}
	
	public String getRatingInfo (String articleId) throws Exception {
		String ratingInfo = "(0 ";
		try {
			double avg = ratingServcie.getAvgRating(Long.parseLong(articleId));
			int numRating = ratingServcie.countRatingByA_R(Long.parseLong(articleId));
			ratingInfo = "" + avg + "/5 (" + numRating + "";
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ratingInfo;
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}
	
	@ProcessAction (name ="exportRss")
	public void exportRss(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
			HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(actionRequest);
			HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(actionResponse);
			exportRSS(httpRequest, httpResponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction (name ="changeLayout")
	public void changeLayout(ActionRequest actionRequest, ActionResponse actionResponse){
		try {
			String plid = ParamUtil.getString(actionRequest, "plid");
			actionResponse.setRenderParameter("plid", plid);
			actionResponse.setRenderParameter("jspPage", "/cmsview/configuration.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction (name ="add_comment")
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception{
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(VcmsDiscussion.class.getName(), actionRequest);
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
			
			String title = ParamUtil.getString(actionRequest, "title");
			String visitorName = ParamUtil.getString(actionRequest, "visitorName");
			String visitorEmail = ParamUtil.getString(actionRequest, "visitorEmail");
			String visitorPhone = ParamUtil.getString(actionRequest, "visitorPhone");
			long groupId = serviceContext.getScopeGroupId();
			long companyId = themeDisplay.getCompanyId();
			String articleId = ParamUtil.getString(actionRequest, "articleId");
			String content = ParamUtil.getString(actionRequest, "content");
			boolean hasAttachment = false;
			String language = PortalConstant.DEFAULT_LANGUAGE;
			try {
				discussionService.addDiscussion(visitorName, visitorEmail, visitorPhone, groupId, companyId, articleId,
						title, content, hasAttachment, language);
			} catch (SystemException | PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			actionResponse.setRenderParameter("sender", visitorName);
			actionResponse.setRenderParameter("actionReq", "add_comment");
			actionResponse.setRenderParameter("jspPage", "/cmsview/success.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction (name ="add_vote")
	public void addVote(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception{
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(VcmsDiscussion.class.getName(), actionRequest);
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
			
			long voteId = CounterLocalServiceUtil.increment(PollsVote.class.toString());
			long questionId = ParamUtil.getLong(actionRequest, "questionId");
			long choiceId = ParamUtil.getLong(actionRequest, "choiceId");
			PollsVote pollsVote =  pollsVoteService.createPollsVote(voteId);
			pollsVote.setGroupId(themeDisplay.getScopeGroupId());
			pollsVote.setCompanyId(themeDisplay.getCompanyId());
			pollsVote.setUserId(themeDisplay.getUserId());
			pollsVote.setUserName(themeDisplay.getDefaultUser().getScreenName());
			pollsVote.setCreateDate(new Date());
			pollsVote.setQuestionId(questionId);
			pollsVote.setChoiceId(choiceId);
			pollsVote.setVoteDate(new Date());
			pollsVoteService.addPollsVote(pollsVote);
			
			// actionResponse.setRenderParameter("actionReq", "add_vote");
			// actionResponse.setRenderParameter("jspPage", "/cmsview/success.jsp");
			// SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction (name ="changePortion")
	public void changePortion(ActionRequest actionRequest, ActionResponse actionResponse){
		try {
			String portionId = ParamUtil.getString(actionRequest, "portionId");
			actionResponse.setRenderParameter("plid", portionId);
			actionResponse.setRenderParameter("jspPage", "/cmsview/configuration.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction (name ="searchArticle")
	public void searchArticle(ActionRequest actionRequest, ActionResponse actionResponse){
		try {
			String categoryId = ParamUtil.getString(actionRequest, "categoryId");
			String publishDate = ParamUtil.getString(actionRequest, "publishDate");
			actionResponse.setRenderParameter("categoryId", categoryId);
			actionResponse.setRenderParameter("publishDate", publishDate);
			actionResponse.setRenderParameter("jspPage", "/cmsview/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String exportRSS(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		String language = themeDisplay.getLanguageId();
		long plid = ParamUtil.getLong(request, "p_l_id");
		String portletId = ParamUtil.getString(request, "portletId", "0");
		String serverHost = request.getServerName();
		int serverPort = request.getServerPort();
		int quantity = ParamUtil.getInteger(request, "quantity", 20);

		if (Validator.isNotNull(serverHost)) {
			HOME_PAGE = "http";
			HOME_PAGE += "://" + serverHost;
			if (serverPort != 80)
				HOME_PAGE += ":" + serverPort;
		}

		String categoryId = ParamUtil.get(request, "categoryId", "0");

		PortletURL entryURL = null;
		// new PortletURLFactoryUtil.create(request, portletId, plid, PortletRequest.RENDER_PHASE);
		
		String urlImage = themeDisplay.getPortalURL() + "/HN-theme/images/HN_image/banner.jpg";

		VcmsCategory category = null;
		try {
			category = VcmsCategoryLocalServiceUtil.getCategory(categoryId);

			/*entryURL.setParameter("struts_action", "/vcmsviewcontent/view");
			entryURL.setParameter("categoryId", categoryId);
			entryURL.setParameter(
					"cat_parent",
					(category.getParentId().equals("0")) ? category
							.getCategoryId() : category.getParentId());*/

		} catch (Exception ex) {
		}

		// Create new RSS Channel
		Channel channel = new Channel();

		channel.setTitle(category.getName());
		channel.setLink(themeDisplay.getPortalURL());
		channel.setDescription(themeDisplay.getCompany().getName());
		channel.setCopyright("Copyright by HoaBinh Portal.");
		channel.setGenerator("RSS Engine - Copyright by HoaBinh Portal.");
		channel.setLanguage(language);
		channel.setTtl("60");
		channel.setImage(new ChannelImage(themeDisplay.getCompany().getName(),
				urlImage, HOME_PAGE));

		// Fill the Channel with Rss Items collection
		FeedItems feedItems = Rss4CMS.buildRssItems(themeDisplay, categoryId, "", quantity);

		// rssDocument.buildRssItems(rss, catId, langCode);
		channel.setItems(feedItems);

		// Create FeedDocument with default constructor
		FeedDocument feedDoc = new FeedDocument();

		// Put the Channel into the FeedDocument
		feedDoc.setChannel(channel);

		return feedDoc.toString();
	}

	public String getVoted() {
		return voted;
	}

	public void setVoted(String voted) {
		this.voted = voted;
	}

	public Map<String, String> getMapVoted() {
		return mapVoted;
	}

	public void setMapVoted(Map<String, String> mapVoted) {
		this.mapVoted = mapVoted;
	}

	private static final Log _log = LogFactoryUtil.getLog(CmsViewPortlet.class);
}