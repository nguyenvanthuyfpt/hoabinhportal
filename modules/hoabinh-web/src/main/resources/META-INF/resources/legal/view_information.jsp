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
					
					<aui:row>
						<aui:col>
							<ul>
								<li><liferay-ui:message key="portlet.legal.draft.count.approval-pending" /> <%=draftPendingApprove %></li>
								<li><liferay-ui:message key="portlet.legal.draft.count.publish-pending" /> <%=draftPendingPublish %></li>
								<li><liferay-ui:message key="portlet.legal.draft.count.published" /> <%=draftPublished %></li>
								<li><liferay-ui:message key="portlet.legal.draft.count.expired" /> <%=draftExpired%></li>
							</ul>
						</aui:col>
					</aui:row>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.legal.information.reject">
				<div>
					<ul>
					<% if(Validator.isNotNull(listAttached)) {
						for(VLegalAttachedMessage message:listAttached) {		
					%>
						<li><%=message.getContent() %></li>
					<% }} %>
					</ul>
				</div>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
</aui:row>