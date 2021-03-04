package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.CounterConfig")
public interface CounterConfig {
	@Meta.AD(required = false)
	public String displayTotalMonth();
	
	@Meta.AD(required = false)
	public String displayTotalDay();
	
	@Meta.AD(required = false)
	public String displayTotalOnline();
	
}
