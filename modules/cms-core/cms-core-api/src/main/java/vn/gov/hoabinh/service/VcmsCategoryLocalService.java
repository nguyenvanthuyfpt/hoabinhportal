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

import vn.gov.hoabinh.model.VcmsCategory;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VcmsCategory. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategoryLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VcmsCategoryLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsCategoryLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VcmsCategoryLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsCategoryLocalServiceUtil} to access the vcms category local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsCategoryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildSearchCategory(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String parentId, java.lang.String keyword, int hasHref,
		int hasImage, int isRss, boolean isCount);

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

	public int countByG_L(long groupId, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	public int countCategoriesByP_P(long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId)
		throws PortalException, SystemException, RemoteException;

	public int countCategoriesByParent(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws PortalException, SystemException, RemoteException;

	public int countCategorySearch(long groupId, java.lang.String language,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String keyword, int hasHref, int hasImage, int isRss);

	/**
	* Returns the number of vcms categories.
	*
	* @return the number of vcms categories
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVcmsCategoriesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VcmsCategory> getCategoriesByP_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoriesByP_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoriesByParent(long groupId,
		java.lang.String language, java.lang.String parentId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoriesByParent(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoriesByPortion(long groupId,
		java.lang.String language, java.lang.String portionId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoryByG_L(long groupId,
		java.lang.String language);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoryByG_L(long groupId,
		java.lang.String language, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategoryMenu(java.lang.String[] categoryIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getCategorySearch(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String parentId, java.lang.String keyword, int hasHref,
		int hasImage, int isRss, int start, int end) throws java.lang.Exception;

	/**
	* Returns a range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of vcms categories
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCategory> getVcmsCategories(int start, int end);

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

	public VcmsCategory addCategory(long groupId, long companyId, long plid,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String name, java.lang.String description, boolean anchored,
		java.lang.String href, java.lang.String language, boolean hasImage,
		java.lang.String image, boolean rssable)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vcms category to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCategory the vcms category
	* @return the vcms category that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsCategory addVcmsCategory(VcmsCategory vcmsCategory);

	/**
	* Creates a new vcms category with the primary key. Does not add the vcms category to the database.
	*
	* @param categoryId the primary key for the new vcms category
	* @return the new vcms category
	*/
	public VcmsCategory createVcmsCategory(java.lang.String categoryId);

	/**
	* Deletes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category that was removed
	* @throws PortalException if a vcms category with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsCategory deleteVcmsCategory(java.lang.String categoryId)
		throws PortalException;

	/**
	* Deletes the vcms category from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCategory the vcms category
	* @return the vcms category that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsCategory deleteVcmsCategory(VcmsCategory vcmsCategory);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsCategory fetchVcmsCategory(java.lang.String categoryId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsCategory getCategory(java.lang.String categoryId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the vcms category with the primary key.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category
	* @throws PortalException if a vcms category with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsCategory getVcmsCategory(java.lang.String categoryId)
		throws PortalException;

	public VcmsCategory updateCategory(long groupId, long companyId,
		java.lang.String categoryId, java.lang.String portionId,
		java.lang.String parentId, java.lang.String name,
		java.lang.String description, boolean anchored, java.lang.String href,
		java.lang.String language, boolean hasImage, java.lang.String image,
		int position, int userHit, boolean rssable)
		throws PortalException, SystemException, RemoteException;

	public VcmsCategory updateCategory(VcmsCategory category)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the vcms category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsCategory the vcms category
	* @return the vcms category that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsCategory updateVcmsCategory(VcmsCategory vcmsCategory);

	public void changePortion(java.lang.String parentId, long groupId,
		java.lang.String portionId, java.lang.String language)
		throws SystemException;

	public void deleteCategory(java.lang.String categoryId)
		throws PortalException, SystemException, RemoteException;
}