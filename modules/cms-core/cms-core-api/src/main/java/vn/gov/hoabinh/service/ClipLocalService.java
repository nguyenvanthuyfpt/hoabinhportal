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
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.Clip;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for Clip. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ClipLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.ClipLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.ClipLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ClipLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClipLocalServiceUtil} to access the clip local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.ClipLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildSearch(long groupId, java.lang.String clipTypeId,
		java.lang.String name, java.lang.String title, boolean active,
		boolean isCount);

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

	public int countByClipTypeId(java.lang.String clipTypeId)
		throws java.lang.Exception;

	public int countClip(long groupId, java.lang.String clipTypeId,
		java.lang.String name, java.lang.String title, boolean active);

	public int countClipByG_L(long groupId, java.lang.String language)
		throws java.lang.Exception;

	public int countClipByG_L_A(long groupId, java.lang.String language,
		boolean active) throws java.lang.Exception;

	public int countClipByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId) throws java.lang.Exception;

	public int countClipDisplay(java.lang.String[] clipTypeIds);

	/**
	* Returns the number of clips.
	*
	* @return the number of clips
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getClipsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<Clip> findByClipTypeId(java.lang.String clipTypeId)
		throws java.lang.Exception;

	public List<Clip> findByClipTypeId(java.lang.String clipTypeId, int start,
		int end) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipByG_L(long groupId, java.lang.String language)
		throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipByG_L(long groupId, java.lang.String language,
		int begin, int end) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipByG_L_A(long groupId, java.lang.String language,
		boolean active) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipByG_L_A(long groupId, java.lang.String language,
		boolean active, int begin, int end) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId, int begin, int end)
		throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClipDisplay(java.lang.String[] clipTypeIds, int start,
		int end);

	/**
	* Returns a range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of clips
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> getClips(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Clip> searchClip(long groupId, java.lang.String clipTypeId,
		java.lang.String name, java.lang.String title, boolean active,
		int start, int end);

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

	public Clip addClip(long groupId, java.lang.String language, long plid,
		long companyId, long userId, java.lang.String clipTypeId,
		java.lang.String url, java.lang.String image, java.lang.String name,
		java.lang.String title, java.lang.String description, boolean active)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the clip to the database. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Clip addClip(Clip clip);

	/**
	* Creates a new clip with the primary key. Does not add the clip to the database.
	*
	* @param id the primary key for the new clip
	* @return the new clip
	*/
	public Clip createClip(java.lang.String id);

	/**
	* Deletes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip
	* @return the clip that was removed
	* @throws PortalException if a clip with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Clip deleteClip(java.lang.String id) throws PortalException;

	/**
	* Deletes the clip from the database. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Clip deleteClip(Clip clip);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Clip fetchClip(java.lang.String id);

	/**
	* Returns the clip with the primary key.
	*
	* @param id the primary key of the clip
	* @return the clip
	* @throws PortalException if a clip with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Clip getClip(java.lang.String id) throws PortalException;

	public Clip increaseHitCount(java.lang.String clipId)
		throws PortalException, SystemException;

	public Clip increaseHitCountView(java.lang.String clipId)
		throws PortalException, SystemException;

	public Clip updateClip(java.lang.String clipId, long groupId,
		java.lang.String language, java.lang.String title,
		java.lang.String name, java.lang.String description,
		java.lang.String url, java.lang.String image,
		java.lang.String clipTypeId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the clip in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Clip updateClip(Clip clip);

	public void deleteClip(long clipId) throws java.lang.Exception;
}