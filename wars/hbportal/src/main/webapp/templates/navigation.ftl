<nav class="${nav_css_class} navbar navbar-expand-lg navbar-light navbar site-navigation" id="navigation" role="navigation">
	<div id="navbar" class="navbar-inner navbar-collapse">
		<#if is_english>
			<ul aria-label="<@liferay.language key="site-pages" />" class="navbar-nav fl" role="menubar">
				<li>
					<a title="${home_page}" role="menuitem" href="/web/guest/english" data-redirect="false" class="">
						<i class="icon-home"></i>
						<span class="nav-item-label">&nbsp;${home_page}</span>
					</a>
				</li>
			</ul>			
			<ul class="menu-right fr">
				<li class="share-hover">
					<a title="${en_share_text}" role="menuitem" href="#" data-redirect="false" class="">
						<i class="icon-share"></i>
						<span class="nav-item-label">&nbsp;${en_share_text}</span>
					</a>
					<span id="share">
						<ul class="list-share">
						</ul>
					</span>
				</li>
				<li>
					<a title="Tiếng Việt" role="menuitem" href="/web/guest/home" data-redirect="false" class="">
						<i class="icon-home"></i>
						<span class="nav-item-label">${vi_text}</span>
					</a>
				</li>
			</ul>			
		<#else>
			<ul aria-label="<@liferay.language key="site-pages" />" class="navbar-nav fl" role="menubar">
				<#list nav_items as nav_item>
					<#assign
						nav_item_attr_has_popup = ""
						nav_item_attr_selected = ""
						nav_item_css_class = ""
						nav_item_layout = nav_item.getLayout()
					/>
		
					<#if nav_item.isSelected()>
						<#assign
							nav_item_attr_has_popup = "aria-haspopup='true'"
							nav_item_attr_selected = "aria-selected='true'"
							nav_item_css_class = "selected"
						/>
					</#if>
		
					<li ${nav_item_attr_selected} class="${nav_item_css_class}" id="layout_${nav_item.getLayoutId()}" role="presentation">
						<a aria-labelledby="layout_${nav_item.getLayoutId()}" ${nav_item_attr_has_popup} href="${nav_item.getURL()}" ${nav_item.getTarget()} role="menuitem"><span><@liferay_theme["layout-icon"] layout=nav_item_layout /> ${nav_item.getName()}</span></a>
		
						<#if nav_item.hasChildren()>
							<ul class="child-menu" role="menu">
								<#list nav_item.getChildren() as nav_child>
									<#assign
										nav_child_attr_selected = ""
										nav_child_css_class = ""
									/>
		
									<#if nav_item.isSelected()>
										<#assign
											nav_child_attr_selected = "aria-selected='true'"
											nav_child_css_class = "selected"
										/>
									</#if>
		
									<li ${nav_child_attr_selected} class="${nav_child_css_class}" id="layout_${nav_child.getLayoutId()}" role="presentation">
										<a aria-labelledby="layout_${nav_child.getLayoutId()}" href="${nav_child.getURL()}" ${nav_child.getTarget()} role="menuitem">${nav_child.getName()}</a>
									</li>
								</#list>
							</ul>
						</#if>
					</li>
				</#list>
			</ul>
			<#if group_id==20147>
			<ul class="menu-right fr">
				<li>
					<a title="${vi_sitemap_text}" role="menuitem" href="/web/guest/so-do-trang" data-redirect="false" class="">
						<i class="icon-sitemap"></i>
						<span class="nav-item-label">&nbsp;${vi_sitemap_text}</span>
					</a>
				</li>
				<li>
					<a title="${vi_faq_text}" role="menuitem" href="/web/guest/hoi-dap" data-redirect="false" class="">
						<i class="icon-question-sign"></i>
						<span class="nav-item-label">&nbsp;${vi_faq_text}</span>
					</a>
				</li>
				<li class="share-hover">
					<a title="${vi_share_text}" role="menuitem" href="#" data-redirect="false" class="">
						<i class="icon-share"></i>
						<span class="nav-item-label">&nbsp;${vi_share_text}</span>
					</a>
					<span id="share">
						<ul class="list-share">
						</ul>
					</span>
				</li>
				<li>
					<a title="English" role="menuitem" href="/web/guest/english" data-redirect="false" class="">
						<i class="icon-home"></i>
						<span class="nav-item-label">&nbsp;English</span>
					</a>
				</li>
				
				<#if is_signed_in>
					<li>
						<a title="Đăng xuất" role="menuitem" href="/c/portal/logout" data-redirect="false" class="">
							<i class="icon-signout"></i>
							<span class="nav-item-label">&nbsp;</span>
						</a>
					</li>
				<#else>
					<li>
						<a title="Đăng nhập" role="menuitem" href="/c/portal/login" data-redirect="false" class="">
							<i class="icon-signin"></i>
							<span class="nav-item-label">&nbsp;</span>
						</a>
					</li>
				</#if>
				
			</ul>
			<#else>
			<ul class="menu-right fr">
				<#if is_signed_in>
					<li>
						<a title="Đăng xuất" role="menuitem" href="/c/portal/logout" data-redirect="false" class="">
							<i class="icon-signout"></i>
							<span class="nav-item-label">&nbsp;</span>
						</a>
					</li>
				<#else>
					<li>
						<a title="Đăng nhập" role="menuitem" href="/c/portal/login" data-redirect="false" class="">
							<i class="icon-signin"></i>
							<span class="nav-item-label">&nbsp;</span>
						</a>
					</li>
				</#if>
			</ul>	
			</#if>
		</#if>
	</div>
</nav>

<script>
	Liferay.Data.NAV_LIST_SELECTOR = '.navbar-inner .nav-collapse > ul';
</script>