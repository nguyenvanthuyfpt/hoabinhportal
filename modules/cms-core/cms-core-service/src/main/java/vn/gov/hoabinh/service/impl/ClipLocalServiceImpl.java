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

import java.rmi.RemoteException;
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
import vn.gov.hoabinh.exception.NoSuchClipException;
import vn.gov.hoabinh.model.Clip;
import vn.gov.hoabinh.service.base.ClipLocalServiceBaseImpl;

/**
 * The implementation of the clip local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.ClipLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.ClipLocalServiceUtil
 */
@ProviderType
public class ClipLocalServiceImpl extends ClipLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.ClipLocalServiceUtil} to access the clip local
	 * service.
	 */

	public Clip addClip(long groupId, String language, long plid, long companyId, long userId, String clipTypeId,
			String url, String image, String name, String title, String description, boolean active)
			throws PortalException, SystemException, RemoteException {

		String Id = Long.toString(CounterLocalServiceUtil.increment(Clip.class.getName()));

		Clip vClip = clipPersistence.create(Id);
		vClip.setGroupId(groupId);
		vClip.setLanguage(language);
		vClip.setCompanyId(companyId);
		vClip.setClipTypeId(clipTypeId);
		vClip.setUrl(url);
		vClip.setImage(image);
		vClip.setName(name);
		vClip.setTitle(title);
		vClip.setDescription(description);
		vClip.setActive(active);

		vClip.setCreatedDate(new Date());
		vClip.setUserId(userId);

		vClip = clipPersistence.update(vClip);
		return vClip;
	}

	public Clip updateClip(String clipId, long groupId, String language, String title, String name, String description,
			String url, String image, String clipTypeId) throws PortalException, SystemException, RemoteException {
		Clip vClip = clipPersistence.findByPrimaryKey(clipId);
		vClip.setGroupId(groupId);
		vClip.setLanguage(language);
		vClip.setTitle(title);
		vClip.setName(name);
		vClip.setDescription(description);
		vClip.setUrl(url);
		vClip.setImage(image);
		vClip.setClipTypeId(clipTypeId);
		vClip.setModifiedDate(new Date());

		vClip = clipPersistence.update(vClip);
		return vClip;
	}

	public void deleteClip(long clipId) throws Exception {
		clipPersistence.remove(clipId);
	}

	public Clip increaseHitCount(String clipId) throws PortalException, SystemException {
		Clip vclip = clipPersistence.findByPrimaryKey(clipId);
		int hitCount = vclip.getHitcount();
		++hitCount;
		vclip.setHitcount(hitCount);
		clipPersistence.update(vclip);
		return vclip;
	}

	public Clip increaseHitCountView(String clipId) throws PortalException, SystemException {
		Clip vclip = clipPersistence.findByPrimaryKey(clipId);
		int hitCountview = vclip.getHitcountview();
		++hitCountview;
		vclip.setHitcountview(hitCountview);
		clipPersistence.update(vclip);
		return vclip;
	}

	public List<Clip> getClipByG_L(long groupId, String language) throws Exception {
		return clipPersistence.findByG_L(groupId, language);
	}

	public List<Clip> getClipByG_L(long groupId, String language, int begin, int end) throws Exception {
		return clipPersistence.findByG_L(groupId, language, begin, end);
	}

	public int countClipByG_L(long groupId, String language) throws Exception {
		return clipPersistence.countByG_L(groupId, language);
	}

	public List<Clip> getClipByG_L_T(long groupId, String language, String clipTypeId) throws Exception {
		return clipPersistence.findByG_L_T(groupId, language, clipTypeId);
	}

	public List<Clip> getClipByG_L_T(long groupId, String language, String clipTypeId, int begin, int end)
			throws Exception {
		return clipPersistence.findByG_L_T(groupId, language, clipTypeId, begin, end);
	}

	public int countClipByG_L_T(long groupId, String language, String clipTypeId) throws Exception {
		return clipPersistence.countByG_L_T(groupId, language, clipTypeId);
	}

	public List<Clip> getClipByG_L_A(long groupId, String language, boolean active) throws Exception {
		return clipPersistence.findByG_L_A(groupId, language, active);
	}

	public List<Clip> getClipByG_L_A(long groupId, String language, boolean active, int begin, int end)
			throws Exception {
		return clipPersistence.findByG_L_A(groupId, language, active, begin, end);
	}

	public int countClipByG_L_A(long groupId, String language, boolean active) throws Exception {
		return clipPersistence.countByG_L_A(groupId, language, active);
	}

	public Clip getClip(String clipId) throws NoSuchClipException {
		return clipPersistence.findByPrimaryKey(clipId);
	}

	public List<Clip> findByClipTypeId(String clipTypeId) throws Exception {
		return clipPersistence.findByClipTypeId(clipTypeId);
	}

	public List<Clip> findByClipTypeId(String clipTypeId, int start, int end) throws Exception {
		return clipPersistence.findByClipTypeId(clipTypeId, start, end);
	}

	public int countByClipTypeId(String clipTypeId) throws Exception {
		return clipPersistence.countByClipTypeId(clipTypeId);
	}

	public List<Clip> searchClip(long groupId, String clipTypeId, String name, String title, boolean active, int start,
			int end) {
		DynamicQuery dynamicQuery = buildSearch(groupId, clipTypeId, name, title, active, false);
		return clipPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	public int countClip(long groupId, String clipTypeId, String name, String title, boolean active) {
		DynamicQuery dynamicQuery = buildSearch(groupId, clipTypeId, name, title, active, true);
		return (int) clipPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public int countClipDisplay(String[] clipTypeIds) {
		return clipPersistence.countByClipDisplay(clipTypeIds);
	}

	public List<Clip> getClipDisplay(String[] clipTypeIds, int start, int end) {
		return clipPersistence.findByClipDisplay(clipTypeIds, start, end);
	}

	public DynamicQuery buildSearch(long groupId, String clipTypeId, String name, String title, boolean active,
			boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		if (Validator.isNotNull(clipTypeId) && !"0".equals(clipTypeId)) {
			junction.add(PropertyFactoryUtil.forName("clipTypeId").eq(clipTypeId));
		}

		if (Validator.isNotNull(name) && !"".equals(name)) {
			junction.add(PropertyFactoryUtil.forName("name").like("%" + name + "%"));
		}

		if (Validator.isNotNull(title) && !"".equals(title)) {
			junction.add(PropertyFactoryUtil.forName("title").like("%" + title + "%"));
		}

		if (active) {
			junction.add(PropertyFactoryUtil.forName("active").eq(active));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Clip.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
		}
		return dynamicQuery.add(junction);
	}
}