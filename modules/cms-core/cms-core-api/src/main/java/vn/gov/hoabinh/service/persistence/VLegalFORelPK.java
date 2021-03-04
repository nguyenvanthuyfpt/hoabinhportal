/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gov.hoabinh.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class VLegalFORelPK implements Comparable<VLegalFORelPK>, Serializable {
	public String fieldId;
	public String orgId;

	public VLegalFORelPK() {
	}

	public VLegalFORelPK(String fieldId, String orgId) {
		this.fieldId = fieldId;
		this.orgId = orgId;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	@Override
	public int compareTo(VLegalFORelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = fieldId.compareTo(pk.fieldId);

		if (value != 0) {
			return value;
		}

		value = orgId.compareTo(pk.orgId);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFORelPK)) {
			return false;
		}

		VLegalFORelPK pk = (VLegalFORelPK)obj;

		if ((fieldId.equals(pk.fieldId)) && (orgId.equals(pk.orgId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, fieldId);
		hashCode = HashUtil.hash(hashCode, orgId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("fieldId");
		sb.append(StringPool.EQUAL);
		sb.append(fieldId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("orgId");
		sb.append(StringPool.EQUAL);
		sb.append(orgId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}