package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;
@Meta.OCD(id = "vn.gov.hoabinh.configuration.CmsConfig")
public interface CmsConfig {
	@Meta.AD(required = false)
	public String linkWebService();
}
