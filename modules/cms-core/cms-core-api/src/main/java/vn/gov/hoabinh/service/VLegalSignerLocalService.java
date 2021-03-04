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

package vn.gov.hoabinh.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.VLegalSigner;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VLegalSigner. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSignerLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalSignerLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalSignerLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalSignerLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalSignerLocalServiceUtil} to access the v legal signer local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalSignerLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery dynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public int countSignerByGroupId(long groupId) throws SystemException;

	/**
	* Returns the number of v legal signers.
	*
	* @return the number of v legal signers
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalSignersCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getAllByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getAllSigner()
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getAllSignerByG_L(long groupId, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getSignerByGroupId(long groupId) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getSignerByGroupId(long groupId, int begin, int end)
		throws SystemException;

	/**
	* Returns a range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of v legal signers
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSigner> getVLegalSigners(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public VLegalSigner addSigner(long groupId, java.lang.String firstName,
		java.lang.String lastName, java.lang.String language,
		boolean statusSigner, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal signer to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSigner the v legal signer
	* @return the v legal signer that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalSigner addVLegalSigner(VLegalSigner vLegalSigner);

	/**
	* Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	*
	* @param sigId the primary key for the new v legal signer
	* @return the new v legal signer
	*/
	public VLegalSigner createVLegalSigner(java.lang.String sigId);

	/**
	* Deletes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer that was removed
	* @throws PortalException if a v legal signer with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalSigner deleteVLegalSigner(java.lang.String sigId)
		throws PortalException;

	/**
	* Deletes the v legal signer from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSigner the v legal signer
	* @return the v legal signer that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalSigner deleteVLegalSigner(VLegalSigner vLegalSigner);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSigner fetchVLegalSigner(java.lang.String sigId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSigner getSigner(java.lang.String sigId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSigner getSigner(long groupId, java.lang.String sigId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the v legal signer with the primary key.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer
	* @throws PortalException if a v legal signer with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSigner getVLegalSigner(java.lang.String sigId)
		throws PortalException;

	public VLegalSigner updateSigner(long groupId, java.lang.String sigId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String language, boolean statusSigner)
		throws PortalException, SystemException, RemoteException;

	public VLegalSigner updateSigner(VLegalSigner vSigner)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the v legal signer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalSigner the v legal signer
	* @return the v legal signer that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalSigner updateVLegalSigner(VLegalSigner vLegalSigner);

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PortalException, SystemException;

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws PortalException, SystemException;

	public void addEntryResources(VLegalSigner entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PortalException, SystemException;

	public void addEntryResources(VLegalSigner entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws PortalException, SystemException;

	public void deleteSigner(java.lang.String sigId)
		throws PortalException, SystemException, RemoteException;
}