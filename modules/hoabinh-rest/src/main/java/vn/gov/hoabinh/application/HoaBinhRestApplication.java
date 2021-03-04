package vn.gov.hoabinh.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.constants.Key;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.service.VcmsArticleLocalService;
import vn.gov.hoabinh.service.VcmsStatusLocalService;

@ApplicationPath("/")
@Component(immediate = true, service = Application.class)
public class HoaBinhRestApplication extends Application {

	private VcmsArticleLocalService articleLocalServcice;

	private VcmsStatusLocalService statusLocalService;
	
	@Reference(unbind = "-")
	public void setArticleLocalServcice(VcmsArticleLocalService articleLocalServcice) {
		this.articleLocalServcice = articleLocalServcice;
	}
	
	@Reference(unbind = "-")
	public void setStatusLocalService(VcmsStatusLocalService statusLocalService) {
		this.statusLocalService = statusLocalService;
	}

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	// 01.Add new article
	@POST
	@Path("/article")
	@Produces(MediaType.APPLICATION_JSON)
	public String addArticle(
			@HeaderParam("access_token") String access_token,
			@FormParam("title") String title, 
			@FormParam("lead") String lead,
			@FormParam("content") String content, 
			@FormParam("author") String author,
			@FormParam("source") String source, 
			@FormParam("categoryId") String categoryId) {
		VcmsArticle article = null;
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		try {
			long groupId = 0;
			String language = "";
			long companyId = PortalUtil.getDefaultCompanyId();
			Group group = GroupLocalServiceUtil.getGroup(companyId, "Guest");
			
			if (Validator.isNotNull(group)) {
				groupId = group.getGroupId();
				language = group.getDefaultLanguageId();
			}
			String userId = "0";
			long plid = 0;
			boolean hasImage = false;
			String imageTitle = "";
			String image = "";
			boolean hasAttachment = false;
			if (Key.accessToken.equals(access_token)) {
				article = articleLocalServcice.addArticle(groupId, companyId, userId, plid, title, lead, content,
						hasImage, imageTitle, image, language, hasAttachment, false, "", 0, author, source, categoryId);

				if (article != null) {
					jsonObject.put("code", Response.Status.CREATED.getStatusCode());
					jsonObject.put("message", Response.Status.CREATED.toString() + " articleId="+article.getArticleId());
				}
			} else {
				jsonObject.put("code", Response.Status.FORBIDDEN.getStatusCode());
				jsonObject.put("message", Response.Status.FORBIDDEN.toString());
			}
		} catch (Exception e) {
			jsonObject.put("code", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			jsonObject.put("message", Response.Status.INTERNAL_SERVER_ERROR.toString());
		}
		return jsonObject.toJSONString();
	}

	// 02.Update article
	@PUT
	@Path("/article/{articleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateArticle(
			@HeaderParam("access_token") String access_token,
			@FormParam("title") String title, 
			@FormParam("lead") String lead,
			@FormParam("content") String content, 
			@FormParam("author") String author,
			@FormParam("source") String source, 
			@FormParam("categoryId") String categoryId,
			@PathParam("articleId") String articleId) {
		VcmsArticle article = null;
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		try {
			if (Key.accessToken.equals(access_token)) {
				article = articleLocalServcice.getArticle(articleId);
				if (article != null) {
					article.setTitle(title);
					article.setLead(lead);
					article.setContent(content);
					article.setAuthor(author);
					article.setSource(source);
					articleLocalServcice.updateArticle(article);	
					jsonObject.put("code", Response.Status.OK.getStatusCode());
					jsonObject.put("message", "Update " + Response.Status.OK.toString() + " with articleId=" + articleId);
				} else {
					jsonObject.put("code", Response.Status.NOT_FOUND.getStatusCode());
					jsonObject.put("message", Response.Status.NOT_FOUND.toString());
				}
			} else {
				jsonObject.put("code", Response.Status.FORBIDDEN.getStatusCode());
				jsonObject.put("message", Response.Status.FORBIDDEN.toString());
			}
			
			
		} catch (Exception e) {
			jsonObject.put("code", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			jsonObject.put("message", Response.Status.INTERNAL_SERVER_ERROR.toString());
		}
		return jsonObject.toJSONString();
	}

	// 03.Unpublish article
	@PUT
	@Path("/article/un-publish/{articleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String unpublishArticle(
			@HeaderParam("access_token") String access_token,
			@PathParam("articleId") String articleId) {
		VcmsArticle article = null;
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		try {
			if (Key.accessToken.equals(access_token)) {
				article = articleLocalServcice.getArticle(articleId);
				if (article != null) {
					long statusId = article.getStatus();
					boolean isStatusPublish = statusLocalService.isStatusPublisher(statusId);
					
					if (isStatusPublish) {
						article.setStatus(0);
						articleLocalServcice.updateArticle(article);	
						jsonObject.put("code", Response.Status.OK.getStatusCode());
						jsonObject.put("message", "Un publish " + Response.Status.OK.toString() + " with articleId="+articleId);
					} else {
						jsonObject.put("code", Response.Status.OK.getStatusCode());
						jsonObject.put("message", "Article with articleId="+articleId + " has not been published!");
					}
					
				} else {
					jsonObject.put("code", Response.Status.NOT_FOUND.getStatusCode());
					jsonObject.put("message", Response.Status.NOT_FOUND.toString());
				}
			} else {
				jsonObject.put("code", Response.Status.FORBIDDEN.getStatusCode());
				jsonObject.put("message", Response.Status.FORBIDDEN.toString());
			}
			
		} catch (Exception e) {
			jsonObject.put("code", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			jsonObject.put("message", Response.Status.INTERNAL_SERVER_ERROR.toString());
		}
		return jsonObject.toJSONString();
	}

	// 04.Get List article
	@GET
	@Path("/article")
	@Produces(MediaType.APPLICATION_JSON)
	public String getArticle(
			@HeaderParam("access_token") String access_token,
			@DefaultValue("0") @QueryParam("begin") int begin, 
			@DefaultValue("20") @QueryParam("end") int end) {
		List<VcmsArticle> listArticle = new ArrayList<VcmsArticle>();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		JSONArray jsonArr = JSONFactoryUtil.createJSONArray();
		try {
			
			if (Key.accessToken.equals(access_token)) {
				listArticle = articleLocalServcice.getArticleBy_G_L_S_C(20147, "vi_VN", 704, "0", true, begin, end);

				if (Validator.isNotNull(listArticle) && listArticle.size() > 0) {
					for (VcmsArticle article : listArticle) {
						jsonObject = JSONFactoryUtil.createJSONObject();
						jsonObject.put("articleId", article.getArticleId());
						jsonObject.put("title", article.getTitle());
						jsonObject.put("lead", article.getLead());
						jsonObject.put("content", article.getContent());
						jsonArr.put(jsonObject);
					}
				}
			} else {
				jsonObject.put("code", Response.Status.FORBIDDEN.getStatusCode());
				jsonObject.put("message", Response.Status.FORBIDDEN.toString());
			}
		} catch (Exception e) {
			jsonObject.put("code", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			jsonObject.put("message", Response.Status.INTERNAL_SERVER_ERROR.toString());
		}
		return jsonArr.toJSONString();
	}
	
	// 05.Add calendar
	@POST
	@Path("/calendar")
	@Produces(MediaType.APPLICATION_JSON)
	public String addCalendar(
			@HeaderParam("access_token") String access_token,
			@FormParam("title") String title, 
			@FormParam("lead") String lead,
			@FormParam("content") String content, 
			@FormParam("categoryId") String categoryId) {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		VcmsArticle article = null;
		try {
			long groupId = 0;
			String language = "";
			long companyId = PortalUtil.getDefaultCompanyId();
			Group group = GroupLocalServiceUtil.getGroup(companyId, "Guest");
			
			if (Validator.isNotNull(group)) {
				groupId = group.getGroupId();
				language = group.getDefaultLanguageId();
			}
			
			String userId = "0";
			long plid = 0;
			boolean hasImage = false, hasAttachment = false;
			String imageTitle = "", image = "", author = "", source = "";
			
			if (Key.accessToken.equals(access_token)) {
				article = articleLocalServcice.addArticle(groupId, companyId, userId, plid, title, lead, content,
						hasImage, imageTitle, image, language, hasAttachment, false, "", 0, author, source, categoryId);

				if (article != null) {
					jsonObject.put("code", Response.Status.CREATED.getStatusCode());
					jsonObject.put("message", Response.Status.CREATED.toString() + " calendarId="+article.getArticleId());
				}
			} else {
				jsonObject.put("code", Response.Status.FORBIDDEN.getStatusCode());
				jsonObject.put("message", Response.Status.FORBIDDEN.toString());
			}
		} catch (Exception e) {
			jsonObject.put("code", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			jsonObject.put("message", Response.Status.INTERNAL_SERVER_ERROR.toString());
		}
		return jsonObject.toJSONString();
	}
	
	// 06.Get article/calendar
	@GET
	@Path("/article/{articleId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getInfor(
			@HeaderParam("access_token") String access_token,
			@PathParam("articleId") String articleId) {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		VcmsArticle article = null;
		try {
			if (Key.accessToken.equals(access_token)) {
				article = articleLocalServcice.getArticle(articleId);
				if (Validator.isNotNull(article)) {					
					jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("articleId", article.getArticleId());
					jsonObject.put("title", article.getTitle());
					jsonObject.put("lead", article.getLead());
					jsonObject.put("content", article.getContent());
					jsonObject.put("language", article.getLanguage());
					jsonObject.put("groupId", article.getGroupId());
					jsonObject.put("status", article.getStatus());
				}
			} else {
				jsonObject.put("code", Response.Status.FORBIDDEN.getStatusCode());
				jsonObject.put("message", Response.Status.FORBIDDEN.toString());
			}
		} catch (Exception e) {
			jsonObject.put("code", Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			jsonObject.put("message", Response.Status.INTERNAL_SERVER_ERROR.toString());
		}
		return jsonObject.toJSONString();
	}
}