package vn.gov.hoabinh.portlet.doc;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.gov.hoabinh.model.vdocField;
import vn.gov.hoabinh.model.vdocOrg;
import vn.gov.hoabinh.service.vdocFieldLocalServiceUtil;
import vn.gov.hoabinh.service.vdocOrgLocalServiceUtil;

public class DocUtils {
	public static String getListParent(String orgId) throws PortalException, SystemException, RemoteException {
		StringBuffer sb = new StringBuffer();
		sb.append(orgId);
		getParent(sb, orgId);
		return sb.toString();
	}

	public static void getParent(StringBuffer sb, String orgId)
			throws PortalException, SystemException, RemoteException {
		vdocOrg vOrg = vdocOrgLocalServiceUtil.getOrg(orgId);
		if (!vOrg.getParentId().equals("0")) {
			sb.append("," + vOrg.getParentId());
			getParent(sb, vOrg.getParentId());
		}
	}

	public static String getListParentField(String fieldId) throws PortalException, SystemException, RemoteException {
		StringBuffer sb = new StringBuffer();
		sb.append(fieldId);
		getParentField(sb, fieldId);
		return sb.toString();
	}

	public static void getParentField(StringBuffer sb, String fieldId)
			throws PortalException, SystemException, RemoteException {
		vdocField vField = vdocFieldLocalServiceUtil.getField(fieldId);
		if (!vField.getParentId().equals("0")) {
			sb.append("," + vField.getParentId());
			getParentField(sb, vField.getParentId());
		}
	}
}
