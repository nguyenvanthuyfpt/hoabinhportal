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

import vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException;
import vn.gov.hoabinh.model.VcmsArticleType;

/**
 * The persistence interface for the vcms article type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleTypePersistenceImpl
 * @see VcmsArticleTypeUtil
 * @generated
 */
@ProviderType
public interface VcmsArticleTypePersistence extends BasePersistence<VcmsArticleType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsArticleTypeUtil} to access the vcms article type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms article types where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByType(long typeId);

	/**
	* Returns a range of all the vcms article types where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByType(long typeId, int start,
		int end);

	/**
	* Returns an ordered range of all the vcms article types where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByType(long typeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article types where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByType(long typeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public VcmsArticleType findByType_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the first vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public VcmsArticleType fetchByType_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns the last vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public VcmsArticleType findByType_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the last vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public VcmsArticleType fetchByType_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns the vcms article types before and after the current vcms article type in the ordered set where typeId = &#63;.
	*
	* @param vcmsArticleTypePK the primary key of the current vcms article type
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article type
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public VcmsArticleType[] findByType_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK,
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Removes all the vcms article types where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public void removeByType(long typeId);

	/**
	* Returns the number of vcms article types where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching vcms article types
	*/
	public int countByType(long typeId);

	/**
	* Returns all the vcms article types where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByArticle(
		java.lang.String articleId);

	/**
	* Returns a range of all the vcms article types where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByArticle(
		java.lang.String articleId, int start, int end);

	/**
	* Returns an ordered range of all the vcms article types where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article types where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article types
	*/
	public java.util.List<VcmsArticleType> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public VcmsArticleType findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the first vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public VcmsArticleType fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns the last vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public VcmsArticleType findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the last vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public VcmsArticleType fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns the vcms article types before and after the current vcms article type in the ordered set where articleId = &#63;.
	*
	* @param vcmsArticleTypePK the primary key of the current vcms article type
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article type
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public VcmsArticleType[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Removes all the vcms article types where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms article types where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article types
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Returns the vcms article type where typeId = &#63; and articleId = &#63; or throws a {@link NoSuchVcmsArticleTypeException} if it could not be found.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public VcmsArticleType findByT_A(long typeId, java.lang.String articleId)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public VcmsArticleType fetchByT_A(long typeId, java.lang.String articleId);

	/**
	* Returns the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public VcmsArticleType fetchByT_A(long typeId, java.lang.String articleId,
		boolean retrieveFromCache);

	/**
	* Removes the vcms article type where typeId = &#63; and articleId = &#63; from the database.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the vcms article type that was removed
	*/
	public VcmsArticleType removeByT_A(long typeId, java.lang.String articleId)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the number of vcms article types where typeId = &#63; and articleId = &#63;.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the number of matching vcms article types
	*/
	public int countByT_A(long typeId, java.lang.String articleId);

	/**
	* Caches the vcms article type in the entity cache if it is enabled.
	*
	* @param vcmsArticleType the vcms article type
	*/
	public void cacheResult(VcmsArticleType vcmsArticleType);

	/**
	* Caches the vcms article types in the entity cache if it is enabled.
	*
	* @param vcmsArticleTypes the vcms article types
	*/
	public void cacheResult(java.util.List<VcmsArticleType> vcmsArticleTypes);

	/**
	* Creates a new vcms article type with the primary key. Does not add the vcms article type to the database.
	*
	* @param vcmsArticleTypePK the primary key for the new vcms article type
	* @return the new vcms article type
	*/
	public VcmsArticleType create(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK);

	/**
	* Removes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type that was removed
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public VcmsArticleType remove(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws NoSuchVcmsArticleTypeException;

	public VcmsArticleType updateImpl(VcmsArticleType vcmsArticleType);

	/**
	* Returns the vcms article type with the primary key or throws a {@link NoSuchVcmsArticleTypeException} if it could not be found.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public VcmsArticleType findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws NoSuchVcmsArticleTypeException;

	/**
	* Returns the vcms article type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type, or <code>null</code> if a vcms article type with the primary key could not be found
	*/
	public VcmsArticleType fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK);

	@Override
	public java.util.Map<java.io.Serializable, VcmsArticleType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms article types.
	*
	* @return the vcms article types
	*/
	public java.util.List<VcmsArticleType> findAll();

	/**
	* Returns a range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of vcms article types
	*/
	public java.util.List<VcmsArticleType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article types
	*/
	public java.util.List<VcmsArticleType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article types
	*/
	public java.util.List<VcmsArticleType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms article types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms article types.
	*
	* @return the number of vcms article types
	*/
	public int countAll();
}