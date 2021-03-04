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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException;
import vn.gov.hoabinh.model.VcmsArticleVersion;

/**
 * The persistence interface for the vcms article version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleVersionPersistenceImpl
 * @see VcmsArticleVersionUtil
 * @generated
 */
@ProviderType
public interface VcmsArticleVersionPersistence extends BasePersistence<VcmsArticleVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsArticleVersionUtil} to access the vcms article version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms article versions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId);

	/**
	* Returns a range of all the vcms article versions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @return the range of matching vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId, int start, int end);

	/**
	* Returns an ordered range of all the vcms article versions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article versions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article version
	* @throws NoSuchVcmsArticleVersionException if a matching vcms article version could not be found
	*/
	public VcmsArticleVersion findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws NoSuchVcmsArticleVersionException;

	/**
	* Returns the first vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article version, or <code>null</code> if a matching vcms article version could not be found
	*/
	public VcmsArticleVersion fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator);

	/**
	* Returns the last vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article version
	* @throws NoSuchVcmsArticleVersionException if a matching vcms article version could not be found
	*/
	public VcmsArticleVersion findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws NoSuchVcmsArticleVersionException;

	/**
	* Returns the last vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article version, or <code>null</code> if a matching vcms article version could not be found
	*/
	public VcmsArticleVersion fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator);

	/**
	* Returns the vcms article versions before and after the current vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleVersionId the primary key of the current vcms article version
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article version
	* @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	*/
	public VcmsArticleVersion[] findByArticle_PrevAndNext(
		long articleVersionId, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws NoSuchVcmsArticleVersionException;

	/**
	* Removes all the vcms article versions where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms article versions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article versions
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Caches the vcms article version in the entity cache if it is enabled.
	*
	* @param vcmsArticleVersion the vcms article version
	*/
	public void cacheResult(VcmsArticleVersion vcmsArticleVersion);

	/**
	* Caches the vcms article versions in the entity cache if it is enabled.
	*
	* @param vcmsArticleVersions the vcms article versions
	*/
	public void cacheResult(
		java.util.List<VcmsArticleVersion> vcmsArticleVersions);

	/**
	* Creates a new vcms article version with the primary key. Does not add the vcms article version to the database.
	*
	* @param articleVersionId the primary key for the new vcms article version
	* @return the new vcms article version
	*/
	public VcmsArticleVersion create(long articleVersionId);

	/**
	* Removes the vcms article version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version that was removed
	* @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	*/
	public VcmsArticleVersion remove(long articleVersionId)
		throws NoSuchVcmsArticleVersionException;

	public VcmsArticleVersion updateImpl(VcmsArticleVersion vcmsArticleVersion);

	/**
	* Returns the vcms article version with the primary key or throws a {@link NoSuchVcmsArticleVersionException} if it could not be found.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version
	* @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	*/
	public VcmsArticleVersion findByPrimaryKey(long articleVersionId)
		throws NoSuchVcmsArticleVersionException;

	/**
	* Returns the vcms article version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version, or <code>null</code> if a vcms article version with the primary key could not be found
	*/
	public VcmsArticleVersion fetchByPrimaryKey(long articleVersionId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsArticleVersion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms article versions.
	*
	* @return the vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findAll();

	/**
	* Returns a range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @return the range of vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article versions
	*/
	public java.util.List<VcmsArticleVersion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleVersion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms article versions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms article versions.
	*
	* @return the number of vcms article versions
	*/
	public int countAll();
}