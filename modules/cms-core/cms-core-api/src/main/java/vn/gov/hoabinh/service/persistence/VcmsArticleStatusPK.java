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
public class VcmsArticleStatusPK implements Comparable<VcmsArticleStatusPK>,
	Serializable {
	public long statusId;
	public String articleId;
	public String categoryId;

	public VcmsArticleStatusPK() {
	}

	public VcmsArticleStatusPK(long statusId, String articleId,
		String categoryId) {
		this.statusId = statusId;
		this.articleId = articleId;
		this.categoryId = categoryId;
	}

	public long getStatusId() {
		return statusId;
	}

	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public int compareTo(VcmsArticleStatusPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (statusId < pk.statusId) {
			value = -1;
		}
		else if (statusId > pk.statusId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = articleId.compareTo(pk.articleId);

		if (value != 0) {
			return value;
		}

		value = categoryId.compareTo(pk.categoryId);

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

		if (!(obj instanceof VcmsArticleStatusPK)) {
			return false;
		}

		VcmsArticleStatusPK pk = (VcmsArticleStatusPK)obj;

		if ((statusId == pk.statusId) && (articleId.equals(pk.articleId)) &&
				(categoryId.equals(pk.categoryId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, statusId);
		hashCode = HashUtil.hash(hashCode, articleId);
		hashCode = HashUtil.hash(hashCode, categoryId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("statusId");
		sb.append(StringPool.EQUAL);
		sb.append(statusId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("articleId");
		sb.append(StringPool.EQUAL);
		sb.append(articleId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("categoryId");
		sb.append(StringPool.EQUAL);
		sb.append(categoryId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}