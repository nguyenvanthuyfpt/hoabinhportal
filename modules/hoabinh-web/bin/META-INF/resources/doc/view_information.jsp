<aui:row>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.legal.information.document">
				<aui:row>
						<aui:col>
							<ul>
								<li><liferay-ui:message key="portlet.legal.document.approval-pending" /> <%=docPendingApprove %></li>
								<li><liferay-ui:message key="portlet.legal.document.publish-pending" /> <%=docPendingPublish %></li>
								<li><liferay-ui:message key="portlet.legal.document.published" /> <%=docPublished %></li>
							</ul>
						</aui:col>
					</aui:row>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.legal.information.reject">
				&nbsp;
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
</aui:row>