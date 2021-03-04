package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.DocViewConfig")
public interface DocViewConfig {
	@Meta.AD(required = false)
	public String pageSel();

	@Meta.AD(required = false)
	public String portletSel();
	
	@Meta.AD(required = false)
	public String categorySel();
	
	@Meta.AD(required = false)
	public String styleSel();
}
