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
import vn.gov.hoabinh.model.Clip;
import vn.gov.hoabinh.model.VContact;
import vn.gov.hoabinh.service.base.VContactLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VContactUtil;

/**
 * The implementation of the v contact local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VContactLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VContactLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VContactLocalServiceUtil
 */
@ProviderType
public class VContactLocalServiceImpl extends VContactLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VContactLocalServiceUtil} to access the v contact
	 * local service.
	 */

	public static final int RECEIVED_PENDING = 0;

	public static final int RECEIVED = 1;

	public static final int DECLINE = 2;

	public VContact addContact(long groupId, long companyId, long plid, String guestName, String email, String title,
			String address, String phone, String fax, String content, boolean hasAttach, int status, long userId)
			throws PortalException, SystemException, RemoteException {

		long Id = CounterLocalServiceUtil.increment(VContact.class.getName());
		
		VContact contact = VContactUtil.create(Id);

		contact.setGroupId(groupId);
		contact.setCompanyId(companyId);

		contact.setCreatedDate(new Date());
		contact.setGuestName(guestName);
		contact.setEmail(email);
		contact.setTitle(title);
		contact.setAddress(address);
		contact.setPhone(phone);
		contact.setFax(fax);
		contact.setContent(content);
		contact.setHasAttach(hasAttach);
		contact.setStatus(RECEIVED_PENDING);

		VContactUtil.update(contact);
		return contact;
	}

	public VContact updateContact(long Id, long groupId, long companyId, String guestName, String email, String title,
			String address, String phone, String fax, String content, boolean hasAttach, int status)
			throws PortalException, SystemException, RemoteException {

		VContact contact = VContactUtil.findByPrimaryKey(Id);

		contact.setGroupId(groupId);
		contact.setCompanyId(companyId);

		contact.setModifiedDate(new Date());
		contact.setGuestName(guestName);
		contact.setEmail(email);
		contact.setTitle(title);
		contact.setAddress(address);
		contact.setPhone(phone);
		contact.setFax(fax);
		contact.setContent(content);
		contact.setHasAttach(hasAttach);
		contact.setStatus(status);

		VContactUtil.update(contact);
		return contact;
	}

	public VContact updateContact(VContact contact) throws PortalException, SystemException, RemoteException {
		return updateContact(contact.getId(), contact.getGroupId(), contact.getCompanyId(), contact.getGuestName(),
				contact.getEmail(), contact.getTitle(), contact.getAddress(), contact.getPhone(), contact.getFax(),
				contact.getContent(), contact.getHasAttach(), contact.getStatus());

	}

	public void deleteContact(long Id) throws PortalException, SystemException, RemoteException {

		VContact contact = VContactUtil.findByPrimaryKey(Id);
		vContactPersistence.remove(contact);
	}

	public List<VContact> getAll() throws PortalException, SystemException, RemoteException {
		return vContactPersistence.findAll();
	}

	public List<VContact> getByStatus(int status) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.findByStatus(status);
	}
	
	public int countByG_S(long groupId, int status) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.countByG_S(groupId, status);
	}

	public List<VContact> getByG_S(long groupId, int status) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.findByG_S(groupId, status);
	}

	public List<VContact> getByG_S(long groupId, int status, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return vContactPersistence.findByG_S(groupId, status, start, end);
	}
	
	public int countContactByG (long groupId) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.countByG(groupId);
	}
	
	public List<VContact> getContactByG (long groupId) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.findByG(groupId);
	}
	
	public List<VContact> getContactByG (long groupId, int start, int end) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.findByG(groupId, start, end);
	}
	
	public VContact getContact(long Id) throws PortalException, SystemException, RemoteException {
		return vContactPersistence.fetchByPrimaryKey(Id);
	}
	
	public DynamicQuery buildSearch(long groupId, String guestName, String email, String title, String address, String phone, int status , boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		if (Validator.isNotNull(guestName)) {
			junction.add(PropertyFactoryUtil.forName("guestName").like("%" + guestName + "%"));
		}
		
		if (Validator.isNotNull(email)) {
			junction.add(PropertyFactoryUtil.forName("email").like("%" + email + "%"));
		}

		if (Validator.isNotNull(title)) {
			junction.add(PropertyFactoryUtil.forName("title").like("%" + title + "%"));
		}
		
		if (Validator.isNotNull(address)) {
			junction.add(PropertyFactoryUtil.forName("address").like("%" + address + "%"));
		}
		
		if (Validator.isNotNull(phone)) {
			junction.add(PropertyFactoryUtil.forName("phone").like("%" + phone + "%"));
		}

		junction.add(PropertyFactoryUtil.forName("active").eq(status));

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VContact.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
		}
		return dynamicQuery.add(junction);
	}
	
	public List<VContact> searchContact(long groupId, String guestName, String email, String title, String address, String phone, int status, int start, int end) {
		DynamicQuery dynamicQuery = buildSearch(groupId, guestName, email, title, address, phone, status, false);
		return vContactPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}
	
	public int countContact(long groupId, String guestName, String email, String title, String address, String phone, int status) {
		DynamicQuery dynamicQuery = buildSearch(groupId, guestName, email, title, address, phone, status, false);
		return (int)vContactPersistence.countWithDynamicQuery(dynamicQuery);
	}
}