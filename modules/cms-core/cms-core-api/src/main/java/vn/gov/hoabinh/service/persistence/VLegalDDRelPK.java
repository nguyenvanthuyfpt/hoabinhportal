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
public class VLegalDDRelPK implements Comparable<VLegalDDRelPK>, Serializable {
	public long departmentId;
	public String docId;

	public VLegalDDRelPK() {
	}

	public VLegalDDRelPK(long departmentId, String docId) {
		this.departmentId = departmentId;
		this.docId = docId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	@Override
	public int compareTo(VLegalDDRelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (departmentId < pk.departmentId) {
			value = -1;
		}
		else if (departmentId > pk.departmentId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = docId.compareTo(pk.docId);

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

		if (!(obj instanceof VLegalDDRelPK)) {
			return false;
		}

		VLegalDDRelPK pk = (VLegalDDRelPK)obj;

		if ((departmentId == pk.departmentId) && (docId.equals(pk.docId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, departmentId);
		hashCode = HashUtil.hash(hashCode, docId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("departmentId");
		sb.append(StringPool.EQUAL);
		sb.append(departmentId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("docId");
		sb.append(StringPool.EQUAL);
		sb.append(docId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}