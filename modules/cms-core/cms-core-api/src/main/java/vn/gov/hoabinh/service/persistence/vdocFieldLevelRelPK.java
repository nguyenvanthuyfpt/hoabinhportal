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
public class vdocFieldLevelRelPK implements Comparable<vdocFieldLevelRelPK>,
	Serializable {
	public String fieldId;
	public String levelId;

	public vdocFieldLevelRelPK() {
	}

	public vdocFieldLevelRelPK(String fieldId, String levelId) {
		this.fieldId = fieldId;
		this.levelId = levelId;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getLevelId() {
		return levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	@Override
	public int compareTo(vdocFieldLevelRelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = fieldId.compareTo(pk.fieldId);

		if (value != 0) {
			return value;
		}

		value = levelId.compareTo(pk.levelId);

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

		if (!(obj instanceof vdocFieldLevelRelPK)) {
			return false;
		}

		vdocFieldLevelRelPK pk = (vdocFieldLevelRelPK)obj;

		if ((fieldId.equals(pk.fieldId)) && (levelId.equals(pk.levelId))) {
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
		hashCode = HashUtil.hash(hashCode, levelId);

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
		sb.append("levelId");
		sb.append(StringPool.EQUAL);
		sb.append(levelId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}