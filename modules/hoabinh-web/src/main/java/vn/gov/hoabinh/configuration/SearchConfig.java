package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.SearchConfig")
public interface SearchConfig {
	
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
}
