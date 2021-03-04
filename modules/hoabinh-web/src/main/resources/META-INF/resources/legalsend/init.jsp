<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>

<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="vn.gov.hoabinh.util.LayoutPortletUtil" %>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<%@page import="vn.gov.hoabinh.model.*" %>
<%@page import="vn.gov.hoabinh.service.*" %>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%@page import="vn.gov.hoabinh.configuration.LegalSendConfig"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%	
	PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest,liferayPortletResponse);
	String currentURL = currentURLObj.toString();
	String redirect = ParamUtil.getString(request, "redirect");
	SimpleDateFormat sdf_dmy = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	PortletURL draftURL = null;
	String plidSelected = "0";
	String pageSelected = StringPool.BLANK;
	String portletSelected = "vn_gov_hoabinh_portlet_legalsend_LegalSendPortlet";
	String numSel = "5";
	try {
		if (!"0".equals(plidSelected) && Validator.isNotNull(plidSelected)) {			
			plid = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), false, "/gui-du-thao").getPlid();
			if (plid!=0) {
				draftURL = PortletURLFactoryUtil.create(request, "vn_gov_hoabinh_portlet_legalsend_LegalSendPortlet", plid, PortletRequest.RENDER_PHASE);
			}
		} else {
			draftURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		}
	} catch (Exception ex) {
	}
	
	LegalSendConfig configuration = (LegalSendConfig)renderRequest.getAttribute(LegalSendConfig.class.getName());
	if (Validator.isNotNull(configuration)) {
		numSel = portletPreferences.getValue("numSel", configuration.numSel());
	} else {
		numSel = portletPreferences.getValue("numSel", "20");
	}
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
%>