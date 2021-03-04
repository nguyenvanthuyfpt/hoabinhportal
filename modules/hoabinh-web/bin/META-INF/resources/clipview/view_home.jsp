<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.model.Clip"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.ClipLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@ include file="/clipview/init.jsp" %>
<div>
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home"><liferay-ui:message key="portlet.common.clip" /></a></li>
    <li><a data-toggle="tab" href="#menu1"><liferay-ui:message key="portlet.common.image" /></a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      	<%@ include file="/clipview/clip.jsp" %>
    </div>
    <div id="menu1" class="tab-pane fade">
      <%@ include file="/clipview/image.jsp" %> 
    </div>
  </div>
</div>


