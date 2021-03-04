package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.CmsViewConfig")
public interface CmsViewConfig {
	@Meta.AD(required = false)
	public String plidSelected();
	
	@Meta.AD(required = false)
	public String pageSelected();

	@Meta.AD(required = false)
	public String portletSelected();
	
	@Meta.AD(required = false)
	public String categorySel();
	
	@Meta.AD(required = false)
	public String styleSel();
	
	@Meta.AD(required = false)
	public String numSel();
	
	@Meta.AD(required = false)
	public String categorySelected();
	
	@Meta.AD(required = false)
	public String portionId();
	
	@Meta.AD(required = false)
	public String displayRss();
	
	@Meta.AD(required = false)
	public String numArticleImg();
	
	@Meta.AD(required = false)
	public String numArticleNext();
}
