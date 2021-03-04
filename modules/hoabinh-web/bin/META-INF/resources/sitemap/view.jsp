<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@ include file="/sitemap/init.jsp" %>

<script>
	//var data=[];
	//data=JSON.parse('${data}');	
	YUI().use(
		  'aui-tree-view',
		  function(Y) {
		    // Create an array object for the tree root and child nodes
		    var children = [
		      {		         
		    	  children: [
			          {
			            label: '<a href="/web/guest/chinh-quyen">Chính quyền</a>',
			            leaf: true	            
			          },{
			            label: '<a href="/web/guest/doanh-nghiep">Doanh nghiệp</a>',
			            leaf: true
			          },{
			            label: '<a href="/web/guest/nguoi-dan">Người dân</a>',
			            leaf: true
			          },{
			            label: '<a href="/web/guest/du-khach">Du khách</a>',
			            leaf: true
			          }
		        ],
		        expanded: true,
		        label: '<a href="/web/guest/home">Trang chủ</a>'
		      },{		    	  
		    	expanded: false,
		    	label: '<a href="http://dichvucong.hoabinh.gov.vn/hoabinh-portal/" target="_blank">Hành chính công điện tử</a>'
		      },{
		    	  children: [
			          {
			            label: '<a href="/web/guest/du-thao-van-ban">Dự thảo văn bản</a>',
			            leaf: true
			          }  
		      		],
				expanded: true,
				label: '<a href="/web/guest/van-ban-chi-dao-dieu-hanh">Văn bản chỉ đạo điều hành</a>'
		      },{
				expanded: false,
				label: '<a href="/web/guest/dia-chi">Địa chí</a>'
		      },{
				expanded: false,
				label: '<a href="/web/guest/so-do-trang">Sitemap</a>'
		      },{
				expanded: false,
				label: '<a href="/web/guest/lien-he">Liên hệ</a>'
		      },{
		    	  expanded: false,
				  label: '<a href="/web/guest/hoi-dap">Hỏi đáp</a>'
		      }
		    ];

		    // Create a TreeView Component
		    new Y.TreeView(
		      {
		        boundingBox: '#myTreeView',
		        children: children
		      }
		    ).render();
		  }
		);
</script>
<div class="box_border">
	<div id="myTreeView"></div>
</div>