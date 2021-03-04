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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VLegalSignerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSignerLocalService
 * @generated
 */
@ProviderType
public class VLegalSignerLocalServiceWrapper implements VLegalSignerLocalService,
	ServiceWrapper<VLegalSignerLocalService> {
	public VLegalSignerLocalServiceWrapper(
		VLegalSignerLocalService vLegalSignerLocalService) {
		_vLegalSignerLocalService = vLegalSignerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalSignerLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSignerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSignerLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countSignerByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalSignerLocalService.countSignerByGroupId(groupId);
	}

	/**
	* Returns the number of v legal signers.
	*
	* @return the number of v legal signers
	*/
	@Override
	public int getVLegalSignersCount() {
		return _vLegalSignerLocalService.getVLegalSignersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalSignerLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vLegalSignerLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vLegalSignerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vLegalSignerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getAllByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.getAllByG_L_S(groupId, language,
			statusSigner);
	}

	@Override
	public java.util.List getAllSigner()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.getAllSigner();
	}

	@Override
	public java.util.List getAllSignerByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.getAllSignerByG_L(groupId, language);
	}

	@Override
	public java.util.List getSignerByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalSignerLocalService.getSignerByGroupId(groupId);
	}

	@Override
	public java.util.List getSignerByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalSignerLocalService.getSignerByGroupId(groupId, begin, end);
	}

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
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSigner> getVLegalSigners(
		int start, int end) {
		return _vLegalSignerLocalService.getVLegalSigners(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vLegalSignerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vLegalSignerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner addSigner(long groupId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.addSigner(groupId, firstName,
			lastName, language, statusSigner, themeDisplay);
	}

	/**
	* Adds the v legal signer to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSigner the v legal signer
	* @return the v legal signer that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSigner addVLegalSigner(
		vn.gov.hoabinh.model.VLegalSigner vLegalSigner) {
		return _vLegalSignerLocalService.addVLegalSigner(vLegalSigner);
	}

	/**
	* Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	*
	* @param sigId the primary key for the new v legal signer
	* @return the new v legal signer
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSigner createVLegalSigner(
		java.lang.String sigId) {
		return _vLegalSignerLocalService.createVLegalSigner(sigId);
	}

	/**
	* Deletes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer that was removed
	* @throws PortalException if a v legal signer with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSigner deleteVLegalSigner(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSignerLocalService.deleteVLegalSigner(sigId);
	}

	/**
	* Deletes the v legal signer from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSigner the v legal signer
	* @return the v legal signer that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSigner deleteVLegalSigner(
		vn.gov.hoabinh.model.VLegalSigner vLegalSigner) {
		return _vLegalSignerLocalService.deleteVLegalSigner(vLegalSigner);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner fetchVLegalSigner(
		java.lang.String sigId) {
		return _vLegalSignerLocalService.fetchVLegalSigner(sigId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner getSigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.getSigner(sigId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner getSigner(long groupId,
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.getSigner(groupId, sigId);
	}

	/**
	* Returns the v legal signer with the primary key.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer
	* @throws PortalException if a v legal signer with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSigner getVLegalSigner(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSignerLocalService.getVLegalSigner(sigId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner updateSigner(long groupId,
		java.lang.String sigId, java.lang.String firstName,
		java.lang.String lastName, java.lang.String language,
		boolean statusSigner)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.updateSigner(groupId, sigId,
			firstName, lastName, language, statusSigner);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner updateSigner(
		vn.gov.hoabinh.model.VLegalSigner vSigner)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSignerLocalService.updateSigner(vSigner);
	}

	/**
	* Updates the v legal signer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalSigner the v legal signer
	* @return the v legal signer that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSigner updateVLegalSigner(
		vn.gov.hoabinh.model.VLegalSigner vLegalSigner) {
		return _vLegalSignerLocalService.updateVLegalSigner(vLegalSigner);
	}

	@Override
	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalSignerLocalService.addEntryResources(entryId,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalSignerLocalService.addEntryResources(entryId,
			communityPermissions, guestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalSigner entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalSignerLocalService.addEntryResources(entry,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalSigner entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalSignerLocalService.addEntryResources(entry,
			communityPermissions, guestPermissions);
	}

	@Override
	public void deleteSigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalSignerLocalService.deleteSigner(sigId);
	}

	@Override
	public VLegalSignerLocalService getWrappedService() {
		return _vLegalSignerLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalSignerLocalService vLegalSignerLocalService) {
		_vLegalSignerLocalService = vLegalSignerLocalService;
	}

	private VLegalSignerLocalService _vLegalSignerLocalService;
}