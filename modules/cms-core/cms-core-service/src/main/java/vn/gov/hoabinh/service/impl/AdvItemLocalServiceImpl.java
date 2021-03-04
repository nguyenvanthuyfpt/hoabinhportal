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
import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.service.base.AdvItemLocalServiceBaseImpl;

/**
 * The implementation of the adv item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.AdvItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.AdvItemLocalServiceUtil
 */
@ProviderType
public class AdvItemLocalServiceImpl extends AdvItemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.AdvItemLocalServiceUtil} to access the adv item
	 * local service.
	 */

	public AdvItem addItem(long groupId, long companyId, long plid, String name, String description, String url,
			boolean isTargetBlank, String txtMouseOver, boolean status, long typeId, long folderId, Date expriedDate)
			throws PortalException, SystemException, RemoteException {

		long itemId = CounterLocalServiceUtil.increment(AdvItem.class.getName());
		AdvItem item = advItemPersistence.create(itemId);

		item.setGroupId(groupId);
		item.setCompanyId(companyId);
		item.setCreateDate(new Date());
		item.setName(name);
		item.setDescription(description);
		item.setUrl(url);
		item.setIsTargetBlank(isTargetBlank);
		item.setTxtMouseOver(txtMouseOver);
		item.setStatus(status);
		item.setTypeId(typeId);
		item.setFolderId(folderId);
		item.setExpriedDate(expriedDate);
		advItemPersistence.update(item);
		
		return item;
	}

	public AdvItem updateItem(long itemId, long groupId, long companyId, String name, String description, String url,
			boolean isTargetBlank, String txtMouseOver, boolean status, long typeId, long folderId, Date expriedDate)
			throws PortalException, SystemException, RemoteException {

		AdvItem item = advItemPersistence.findByPrimaryKey(itemId);

		item.setGroupId(groupId);
		item.setCompanyId(companyId);
		item.setModifiedDate(new Date());
		item.setName(name);
		item.setDescription(description);
		item.setUrl(url);
		item.setIsTargetBlank(isTargetBlank);
		item.setTxtMouseOver(txtMouseOver);
		item.setStatus(status);
		item.setTypeId(typeId);
		item.setFolderId(folderId);
		item.setExpriedDate(expriedDate);

		advItemPersistence.update(item);
		return item;
	}

	public AdvItem updateItem(AdvItem advItem) throws PortalException, SystemException, RemoteException {

		return updateItem(advItem.getItemId(), advItem.getGroupId(), advItem.getCompanyId(), advItem.getName(),
				advItem.getDescription(), advItem.getUrl(), advItem.getIsTargetBlank(), advItem.getTxtMouseOver(),
				advItem.getStatus(), advItem.getTypeId(), advItem.getFolderId(), advItem.getExpriedDate());

	}

	public void deleteItem(long itemId) throws PortalException, SystemException, RemoteException {

		AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
		advItemPersistence.remove(item);
	}

	public void deleteItembyType(long typeId) throws PortalException, SystemException, RemoteException {
		advItemPersistence.removeByT(typeId);
	}

	public AdvItem getItem(long itemId) throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByPrimaryKey(itemId);
	}

	public List<AdvItem> getAllbyType(long typeId) throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByT(typeId);
	}

	public List<AdvItem> getItemByG(long groupId) throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByG(groupId);
	}

	public List<AdvItem> getItemByG(long groupId, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByG(groupId, start, end);
	}

	public int countItemByG(long groupId) throws PortalException, SystemException, RemoteException {
		return advItemPersistence.countByG(groupId);
	}

	public List<AdvItem> getItemByG_S(long groupId, boolean status)
			throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByG_S(groupId, status);
	}

	public List<AdvItem> getItemByG_S(long groupId, boolean status, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByG_S(groupId, status, start, end);
	}

	public int countItemByG_S(long groupId, boolean status) throws PortalException, SystemException, RemoteException {
		return advItemPersistence.countByG_S(groupId, status);
	}

	public List<AdvItem> getItemByG_T_S(long groupId, long typeId, boolean status)
			throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByG_T_S(groupId, typeId, status);
	}

	public List<AdvItem> getItemByG_T_S(long groupId, long typeId, boolean status, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return advItemPersistence.findByG_T_S(groupId, typeId, status, begin, end);
	}

	public int countItemByG_T_S(long groupId, long typeId, boolean status)
			throws PortalException, SystemException, RemoteException {
		return advItemPersistence.countByG_T_S(groupId, typeId, status);
	}

	public int countItemByG_T(long groupId, long typeId) throws PortalException, SystemException, RemoteException {
		return advItemPersistence.countByG_T(groupId, typeId);
	}
	
	public List<AdvItem> searchItem(long groupId, long typeId, String desc, int status, int start, int end) {
		DynamicQuery dynamicQuery = buildSearch(groupId, typeId, desc, status, false);
		return advItemPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	public int countItem(long groupId, long typeId, String desc, int status) {
		DynamicQuery dynamicQuery = buildSearch(groupId, typeId, desc, status, true);
		return (int) advItemPersistence.countWithDynamicQuery(dynamicQuery);
	}
	
	public DynamicQuery buildSearch(long groupId, long typeId, String desc, int status, boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		
		if (typeId>0) {
			junction.add(PropertyFactoryUtil.forName("typeId").eq(typeId));
		}
		
		
		if (Validator.isNotNull(desc) && !"".equals(desc)) {
			junction.add(PropertyFactoryUtil.forName("description").like("%"+desc+"%"));
		}
		
		if (status>-1) {
			junction.add(PropertyFactoryUtil.forName("status").eq((status==1)?true:false));
		}
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("createDate"));	
		}
		return dynamicQuery.add(junction);
	}
}