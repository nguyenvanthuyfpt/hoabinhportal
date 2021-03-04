package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.LinkViewConfig")
public interface LinkViewConfig {
	@Meta.AD(required = false)
	public String styleSel();
	
	@Meta.AD(required = false)
	public String linkGroupSel();
}
