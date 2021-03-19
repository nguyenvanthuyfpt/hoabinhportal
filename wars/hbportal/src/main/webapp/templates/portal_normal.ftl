<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title} - ${company_name}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	
	<@liferay_util["include"] page=top_head_include />
	<@liferay.js file_name="${themeDisplay.getPathThemeJavaScript()}/social-buttons-share.js" />
	<@liferay.js file_name="${themeDisplay.getPathThemeJavaScript()}/owl.carousel.min.js" />
	<@liferay.js file_name="${themeDisplay.getPathThemeJavaScript()}/customs.js" />	
	
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<script type="text/javascript">
	function submitFm() {		
		var keyword = document.getElementById("keyword").value;
	    var url = '${searchURL}';
	    document.forms["fm"].action=url+"&_vn_gov_hoabinh_portlet_search_SearchPortlet_keyword="+keyword;
	    document.forms["fm"].submit();
	}
</script>

<div class="container-fluid" id="wrapper">
	<header id="banner" role="banner">
		<div class="banner">
			${banner_img}
			<a id="logo" href="/">
				<img class="img-responsive" style="-webkit-user-select: none;margin: auto;" src="${images_folder}/hoabinh/${banner_img}">				
	    	</a>
	    </div>
	    
	    <#--<div class="box-search">
            <div>
                <input type="text" name="isearch" id="isearch" class="bg-search" placeholder="Tìm kiếm">
                <input type="button" name="btnSearch" id="btnSearch" value="Tìm kiếm">
            </div>
        </div>-->
	    
	    <div class="btn-common-close" style="display: none;"></div>
    	
    	<div class="button-mobile">
	    	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
		          <span class="navbar-toggler-icon"></span>
	        </button>
        </div> 
               
        <div class="button-menu">
        	<#--<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span>-->
        	<button type="button" class="catmenu-toggle collapsed">
		          <span class="navbar-toggler-icon" onclick="openNav()"></span>
	        </button> 
        </div>
           	   	
    	<#if has_navigation && is_setup_complete>
			<#include "${full_templates_path}/navigation.ftl" />
		</#if>
		<form id="fm" action="${searchURL}" method="post" name="vn_gov_hoabinh_portlet_search_SearchPortlet"  onsubmit="submitFm();">
		<div class="date-time">			
			<#if is_english>
				<span class="fl">${day_text_en}, Day ${cur_datetime}</span>
			<#else>
				<span class="fl">${day_text}, ${languageUtil.get(locale, "day")} ${cur_datetime}</span>
			</#if>			
			<span class="fr">
				<input type="textbox" class="input-search" id="keyword" name="keyword" placeholder="Tìm kiếm"/>
			</span>
		</div>
		</form>
    </header>
    
    <#if group_id==20147>
    <div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<div class="menu-cms">
		<ul>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=11901">Chỉ đạo điều hành</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=11903">Hoạt động lãnh đạo tỉnh</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2313">Chính trị</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2314">Kinh tế</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2312">Thời sự trong ngày</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2422">Tin từ các đơn vị</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2315">Thế giới</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2316">Giáo dục</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2317">Văn hóa</a></li>
			<li><a href="/web/guest/cms?p_p_id=vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ&p_p_lifecycle=0&p_p_col_id=column-2&p_p_col_count=5&_vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_awnZtg0lFMNJ_categoryId=2318">Quốc phòng - An ninh</a></li>
		</ul>	
		</div>
		<div><a href="/web/guest/chinh-quyen"><img class="img-responsive" alt="" src="/documents/20147/678413/upload_00000351.jpg/bd9edf25-028c-91b4-d0d4-26eebc32558c?version=1.0" style=" "></a></div>
		<div><a href="/web/guest/doanh-nghiep"><img class="img-responsive" alt="" src="/documents/20147/678413/upload_00000315.jpg/ec426672-2fb5-7ab0-e614-6b5b049d711c?version=1.0" style=" "></a></div>
		<div><a href="/web/guest/du-khach"><img class="img-responsive" alt="" src="/documents/20147/678413/upload_00000279.jpg/bf94154b-fa24-29e7-dc78-38696581969b?version=1.0" style=" "></a></div>
		<div><a href="/web/guest/nguoi-dan"><img class="img-responsive" alt="" src="/documents/20147/678413/upload_00000260.jpg/c29dda7d-b147-ae76-c5fc-647a07d83101?version=1.0" style=" "></a></div>
	</div>
	</#if>
    
	<div id="content" class="content content_main_bbn">
		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}
			${portletDisplay.setTitle(the_title)}
			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</div>
	
	<div id="button" title="Scroll to Top" style="position: fixed; bottom: 5px; right: 5px; opacity: 1; cursor: pointer;"><img src="${images_folder}/hoabinh/icon_gototop.png"></div>
	
	<footer id="footer" role="contentinfo" class="footer" style="width:100%">
		<div class="copyright">
			<#if is_english>
			<p>
				HOA BINH PROVINCE PORTAL<br/>
				Publish License No: 216 Ministry of Information and Communications, Date: 21/12/2009<br/>
				Responsible: Mr Nguyen Hoang Thu, Head of Hoa Binh Department of Information and Communications<br/>
				Address : Tran Hung Dao St, TP Hoa Binh, Hoa Binh Province - Tel: (0218)3602213 - Fax : (0218)3895595<br/>
				Copyright © 2010 www.hoabinh.gov.vn. All rights reserved.
			</p>
			<#else>
			<p>
				CỔNG THÔNG TIN ĐIỆN TỬ TỈNH HÒA BÌNH<br/>
				Số giấy phép: 216 Bộ Thông tin và Truyền thông, cấp ngày 21/12/2009.<br/>
				Chịu trách nhiệm chính: Nguyễn Hoàng Thư, Giám đốc Sở Thông tin và Truyền thông, tỉnh Hòa Bình<br/>
				Địa chỉ: đường Trần Hưng Đạo, TP Hòa Bình, tỉnh Hòa Bình. Điện thoại: (0218)3602213. Fax: (0218)3895595.<br/>
				Ghi rõ nguồn Cổng thông tin điện tử Tỉnh Hòa Bình (www.hoabinh.gov.vn) khi trích dẫn tin từ địa chỉ này.
			</p>
			</#if>
		</div>
	</footer>
</div>
<@liferay_util["include"] page=body_bottom_include />
<@liferay_util["include"] page=bottom_include />

</body>

</html>
<script>
    $("#share").socialButtonsShare({
        socialNetworks: ["facebook", "googleplus", "linkedin", "twitter", "pinterest", "wordpress"],
        url: window.location.href,
        text: "",
        sharelabel: false,
        verticalAlign: true
    }
		, {
		    facebook: {
		        title: "Chia sẻ trang trên FB"
		    },
		    twitter: {
		        title: "Chia sẻ trang trên Twitter"
		    },
		    googleplus: {
		        title: "Chia sẻ trang trên Google+"
		    },
		    linkedin: {
		        title: "Chia sẻ trang trên Linkedin"
		    },
		    pinterest: {
		        title: "Chia sẻ trang trên Pinterest"
		    },
		    wordpress: {
		        title: "Chia sẻ trang trên WordPress"
		    }
		});
	
	$("#share-article").socialButtonsShare({
        socialNetworks: ["facebook", "googleplus", "linkedin", "twitter", "pinterest", "wordpress"],
        url: window.location.href,
        text: "",
        sharelabel: false,
        verticalAlign: false
    }
		, {
		    facebook: {
		        title: "Chia sẻ trang trên FB"
		    },
		    twitter: {
		        title: "Chia sẻ trang trên Twitter"
		    },
		    googleplus: {
		        title: "Chia sẻ trang trên Google+"
		    },
		    linkedin: {
		        title: "Chia sẻ trang trên Linkedin"
		    },
		    pinterest: {
		        title: "Chia sẻ trang trên Pinterest"
		    },
		    wordpress: {
		        title: "Chia sẻ trang trên WordPress"
		    }
		});
		
function openNav() {
 	document.getElementById("mySidenav").style.width = "300px";
}

function closeNav() {
 	document.getElementById("mySidenav").style.width = "0";
}

</script>
