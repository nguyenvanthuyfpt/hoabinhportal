package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.AdvViewConfig")
public interface AdvViewConfig {
	@Meta.AD(required = false)
	public String documentUrl();
	
	@Meta.AD(required = false)
	public String link();
	
	@Meta.AD(required = false)
	public String width();
	
	@Meta.AD(required = false)
	public String height();
	
	@Meta.AD(required = false)
	public String categorySel();
	
	@Meta.AD(required = false)
	public String styleSel();
	
	@Meta.AD(required = false)
	public String itemSel();
}
