
<%@ include file="/faqview/init.jsp" %>

<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<% 
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = Integer.parseInt(numSel);
	String msgEmpty = "khong-co-du-lieu";
	
	List<FAQCategory> categories = FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	
	Date fromDate = new Date();
	Date toDate = new Date();
	boolean isFromTo = false;
	boolean approved = true;
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	SearchContainer<FAQQuestion> searchContainer = new SearchContainer<FAQQuestion>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	
	int total = FAQQuestionLocalServiceUtil.countApprovedQuestions(groupId);
	List<FAQQuestion> questions = new ArrayList<FAQQuestion>();	
	if(total > 0){
		searchContainer.setTotal(total);
		int start = searchContainer.getStart();
		int end = searchContainer.getEnd();
		questions = FAQQuestionLocalServiceUtil.getApprovedQuestions(groupId, start, end);
	}
%>

<div class="box_bg">
	<h3 class="title-list-news"><span class="title-t1"><liferay-ui:message key="portlet.common.faq" /></span></h3>
	<div>
		<ul class="list_visitor" style="margin: 0 0 0 0!important;padding-inline-start:0;">
			<%  
				if (Validator.isNotNull(questions) && questions.size()>0){
					for (FAQQuestion question : questions) {
						questionURL.setParameter("questionId", String.valueOf(question.getId()));
			%>
			<li style="color: #000;border-bottom: 1px solid #eae6e6;list-style: none;">				
				<div class="text">
					<div class="title_v">
						<%-- <a href="<%=questionURL.toString()%>"><%=question.getTitle()%>
							<span class="time"><%=FormatData.parseDateToTringType3(question.getSentDate()) %></span>
						</a> --%>
						
						<liferay-ui:icon
						    iconCssClass="icon-question-sign"
						    label="<%= true %>"
						    message="<%=question.getTitle()%>"
						    url="<%= questionURL.toString() %>"
						/>
						<span class="time"><%=FormatData.parseDateToTringType3(question.getSentDate()) %></span>
						<%-- <br/>
						<liferay-ui:icon
						    iconCssClass="icon-ok-sign"
						    label="<%= true %>"
						    message="<%=question.getTitle()%>"
						    url="<%= questionURL.toString() %>"
						/> --%>
					</div>
				</div>
			</li>
			<% 	
					}
				}
			%> 
		</ul>
	</div>
</div>
