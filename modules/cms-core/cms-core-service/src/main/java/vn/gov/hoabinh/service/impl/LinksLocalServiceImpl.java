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

package vn.gov.hoabinh.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.Links;
import vn.gov.hoabinh.service.base.LinksLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.LinksUtil;

/**
 * The implementation of the links local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.LinksLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinksLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.LinksLocalServiceUtil
 */
@ProviderType
public class LinksLocalServiceImpl extends LinksLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.LinksLocalServiceUtil} to access the links local
	 * service.
	 */

	public Links addLinks(long groupId, long companyId, long plid, long linkgroupId, String name, String description,
			String image, String url, int position, long userId) throws PortalException, SystemException {

		// _validate(name, url);

		long linkId = CounterLocalServiceUtil.increment(Links.class.getName());

		Links link = LinksUtil.create(linkId);
		link.setCompanyId(companyId);
		link.setGroupId(groupId);

		link.setLinkgroupId(linkgroupId);
		link.setName(name);
		link.setDescription(description);
		link.setImage(image);
		link.setUrl(url);
		link.setCreatedDate(new Date());
		link.setPosition(1);

		linksPersistence.update(link);

		return link;
	}

	public Links updateLinks(long linkId, long groupId, long companyId, long linkgroupId, String name,
			String description, String image, String url, int position) throws PortalException, SystemException {

		Links link = linksPersistence.findByPrimaryKey(linkId);

		link.setCompanyId(companyId);
		link.setGroupId(groupId);

		link.setLinkgroupId(linkgroupId);
		link.setName(name);
		link.setDescription(description);
		link.setImage(image);
		link.setUrl(url);

		link.setModifiedDate(new Date());
		link.setPosition(position);

		linksPersistence.update(link);

		return link;
	}

	public Links updateLink(Links link) throws PortalException, SystemException {
		return updateLinks(link.getLinkId(), link.getGroupId(), link.getCompanyId(), link.getLinkgroupId(),
				link.getName(), link.getDescription(), link.getImage(), link.getUrl(), link.getPosition());
	}

	public void deleteLink(long linkId) throws PortalException, SystemException {

		Links link = linksPersistence.findByPrimaryKey(linkId);

		linksPersistence.remove(link);
	}

	public List<Links> getByLinkGroupId(long linkGroupId) throws PortalException, SystemException {
		return linksPersistence.findBylinkgroupId(linkGroupId);
	}

	public List<Links> getByGroupId(long groupId) throws PortalException, SystemException {
		return linksPersistence.findByGroupId(groupId);
	}

	public List<Links> getByGroupId(long groupId, int start, int end) throws PortalException, SystemException {
		return linksPersistence.findByGroupId(groupId, start, end);
	}

	public int countByGroupId(long groupId) throws PortalException, SystemException {
		return linksPersistence.countByGroupId(groupId);
	}

	public int countByLinkG_GL(long groupId, long linkGroupId) throws PortalException, SystemException {
		return linksPersistence.countByG_LG(groupId, linkGroupId);
	}

	public List<Links> getByLinkG_GL(long groupId, long linkGroupId) throws PortalException, SystemException {

		return linksPersistence.findByG_LG(groupId, linkGroupId);
	}

	public List<Links> getByLinkG_GL(long groupId, long linkGroupId, int start, int end)
			throws PortalException, SystemException {
		return linksPersistence.findByG_LG(groupId, linkGroupId, start, end);
	}

	public int countLinkSearch(long groupId, long linkGroupId, String keyword) throws PortalException, SystemException {
		DynamicQuery dynamicQuery = buildSearch(groupId, linkGroupId, keyword, true);
		return (int) linksPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public List<Links> searchItem(long groupId, long linkGroupId, String keyword, int start, int end) {
		DynamicQuery dynamicQuery = buildSearch(groupId, linkGroupId, keyword, false);
		return linksPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	public DynamicQuery buildSearch(long groupId, long linkGroupId, String keyword, boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		if (linkGroupId > 0) {
			junction.add(PropertyFactoryUtil.forName("linkgroupId").eq(linkGroupId));
		}

		if (Validator.isNotNull(keyword) && !"".equals(keyword)) {
			junction.add(PropertyFactoryUtil.forName("name").like("%" + keyword + "%"));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Links.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
		}
		return dynamicQuery.add(junction);
	}
}