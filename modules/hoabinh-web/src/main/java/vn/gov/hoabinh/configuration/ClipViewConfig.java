package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.ClipViewConfig")
public interface ClipViewConfig {
	
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
	
	@Meta.AD( deflt = "400", required = false)
	public String width();
	
	@Meta.AD( deflt = "280", required = false)
	public String height();
	
	@Meta.AD(required = false)
	public String url();
	
	// Image
	@Meta.AD(required = false)
	public String imgPlidSelected();
	
	@Meta.AD(required = false)
	public String imgPageSelected();
	
	@Meta.AD(required = false)
	public String imgPortletSelected();
	
	@Meta.AD(required = false)
	public String folderSel();
}
