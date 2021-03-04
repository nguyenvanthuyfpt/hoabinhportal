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

import vn.gov.hoabinh.exception.NoSuchvdocLevelException;
import vn.gov.hoabinh.model.vdocLevel;

/**
 * The persistence interface for the vdoc level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.vdocLevelPersistenceImpl
 * @see vdocLevelUtil
 * @generated
 */
@ProviderType
public interface vdocLevelPersistence extends BasePersistence<vdocLevel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocLevelUtil} to access the vdoc level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc levels
	*/
	public java.util.List<vdocLevel> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @return the range of matching vdoc levels
	*/
	public java.util.List<vdocLevel> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc levels
	*/
	public java.util.List<vdocLevel> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc levels
	*/
	public java.util.List<vdocLevel> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc level
	* @throws NoSuchvdocLevelException if a matching vdoc level could not be found
	*/
	public vdocLevel findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator)
		throws NoSuchvdocLevelException;

	/**
	* Returns the first vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc level, or <code>null</code> if a matching vdoc level could not be found
	*/
	public vdocLevel fetchByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator);

	/**
	* Returns the last vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc level
	* @throws NoSuchvdocLevelException if a matching vdoc level could not be found
	*/
	public vdocLevel findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator)
		throws NoSuchvdocLevelException;

	/**
	* Returns the last vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc level, or <code>null</code> if a matching vdoc level could not be found
	*/
	public vdocLevel fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator);

	/**
	* Returns the vdoc levels before and after the current vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param levelId the primary key of the current vdoc level
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc level
	* @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	*/
	public vdocLevel[] findByG_L_PrevAndNext(java.lang.String levelId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator)
		throws NoSuchvdocLevelException;

	/**
	* Removes all the vdoc levels where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vdoc levels where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc levels
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Caches the vdoc level in the entity cache if it is enabled.
	*
	* @param vdocLevel the vdoc level
	*/
	public void cacheResult(vdocLevel vdocLevel);

	/**
	* Caches the vdoc levels in the entity cache if it is enabled.
	*
	* @param vdocLevels the vdoc levels
	*/
	public void cacheResult(java.util.List<vdocLevel> vdocLevels);

	/**
	* Creates a new vdoc level with the primary key. Does not add the vdoc level to the database.
	*
	* @param levelId the primary key for the new vdoc level
	* @return the new vdoc level
	*/
	public vdocLevel create(java.lang.String levelId);

	/**
	* Removes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level that was removed
	* @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	*/
	public vdocLevel remove(java.lang.String levelId)
		throws NoSuchvdocLevelException;

	public vdocLevel updateImpl(vdocLevel vdocLevel);

	/**
	* Returns the vdoc level with the primary key or throws a {@link NoSuchvdocLevelException} if it could not be found.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level
	* @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	*/
	public vdocLevel findByPrimaryKey(java.lang.String levelId)
		throws NoSuchvdocLevelException;

	/**
	* Returns the vdoc level with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level, or <code>null</code> if a vdoc level with the primary key could not be found
	*/
	public vdocLevel fetchByPrimaryKey(java.lang.String levelId);

	@Override
	public java.util.Map<java.io.Serializable, vdocLevel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vdoc levels.
	*
	* @return the vdoc levels
	*/
	public java.util.List<vdocLevel> findAll();

	/**
	* Returns a range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @return the range of vdoc levels
	*/
	public java.util.List<vdocLevel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc levels
	*/
	public java.util.List<vdocLevel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc levels
	*/
	public java.util.List<vdocLevel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLevel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vdoc levels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vdoc levels.
	*
	* @return the number of vdoc levels
	*/
	public int countAll();
}