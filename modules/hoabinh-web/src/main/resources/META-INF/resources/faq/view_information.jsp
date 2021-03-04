<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil"%>
<aui:row>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.faq.information.summary">
				<aui:row>
						<aui:col>
							<ul>
							<li><liferay-ui:message key="portlet.faq.category.num" /> : <%= FAQCategoryLocalServiceUtil.countByG_L(groupId, "vi_VN") %></li>
								<li><liferay-ui:message key="portlet.faq.question.un-approve" /> : 0</li>
								<li><liferay-ui:message key="portlet.faq.question.approve" /> : 0</li>
							</ul>
						</aui:col>
					</aui:row>	
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.faq.information.orther">
				<aui:row>
					<aui:col>
						<ul>
							<li><liferay-ui:message key="portlet.faq.answer.un-approve" /> : <%= FAQAnswerLocalServiceUtil.countByApprove(false) %></li>
							<li><liferay-ui:message key="portlet.faq.answer.approve" /> : <%= FAQAnswerLocalServiceUtil.countByApprove(true) %></li>
						</ul>
					</aui:col>
				</aui:row>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
</aui:row>