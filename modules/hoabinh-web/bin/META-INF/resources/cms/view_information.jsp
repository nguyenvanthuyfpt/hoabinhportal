<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<aui:row>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.cms.information.article">
				<aui:row>
						<aui:col>
							<ul>
								<li><liferay-ui:message key="portlet.cms.article.draft" /> : <%= VcmsArticleLocalServiceUtil.countArticlesByL_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 0) %></li>
								<% for(VcmsStatus status :listStatus) { %>
								<li><%=status.getName() %> : <%= VcmsArticleLocalServiceUtil.countArticlesByL_S(groupId, PortalConstant.DEFAULT_LANGUAGE, status.getStatusId()) %></li>
								<% } %>
							</ul>
						</aui:col>
					</aui:row>
					
					
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.cms.information.orther">
				<aui:row>
					<aui:col>
						<ul>
							<li><liferay-ui:message key="portlet.cms.statistics.portion.category" /> : <%= VcmsPortionLocalServiceUtil.countByG_L_C(groupId, PortalConstant.DEFAULT_LANGUAGE, true) %></li>
							<li><liferay-ui:message key="portlet.cms.statistics.portion.no-category" /> : <%= VcmsPortionLocalServiceUtil.countByG_L_C(groupId, PortalConstant.DEFAULT_LANGUAGE, false) %></li>
							<li><liferay-ui:message key="portlet.cms.statistics.category" /> : <%= VcmsCategoryLocalServiceUtil.countByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE) %></li>
						</ul>
					</aui:col>
				</aui:row>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
</aui:row>