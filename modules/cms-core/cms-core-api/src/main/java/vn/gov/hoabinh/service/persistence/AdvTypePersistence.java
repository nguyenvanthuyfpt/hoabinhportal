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

import vn.gov.hoabinh.exception.NoSuchAdvTypeException;
import vn.gov.hoabinh.model.AdvType;

/**
 * The persistence interface for the adv type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.AdvTypePersistenceImpl
 * @see AdvTypeUtil
 * @generated
 */
@ProviderType
public interface AdvTypePersistence extends BasePersistence<AdvType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvTypeUtil} to access the adv type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the adv types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching adv types
	*/
	public java.util.List<AdvType> findByG(long groupId);

	/**
	* Returns a range of all the adv types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @return the range of matching adv types
	*/
	public java.util.List<AdvType> findByG(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the adv types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv types
	*/
	public java.util.List<AdvType> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator);

	/**
	* Returns an ordered range of all the adv types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv types
	*/
	public java.util.List<AdvType> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv type
	* @throws NoSuchAdvTypeException if a matching adv type could not be found
	*/
	public AdvType findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator)
		throws NoSuchAdvTypeException;

	/**
	* Returns the first adv type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv type, or <code>null</code> if a matching adv type could not be found
	*/
	public AdvType fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator);

	/**
	* Returns the last adv type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv type
	* @throws NoSuchAdvTypeException if a matching adv type could not be found
	*/
	public AdvType findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator)
		throws NoSuchAdvTypeException;

	/**
	* Returns the last adv type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv type, or <code>null</code> if a matching adv type could not be found
	*/
	public AdvType fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator);

	/**
	* Returns the adv types before and after the current adv type in the ordered set where groupId = &#63;.
	*
	* @param typeId the primary key of the current adv type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv type
	* @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	*/
	public AdvType[] findByG_PrevAndNext(long typeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator)
		throws NoSuchAdvTypeException;

	/**
	* Removes all the adv types where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByG(long groupId);

	/**
	* Returns the number of adv types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching adv types
	*/
	public int countByG(long groupId);

	/**
	* Caches the adv type in the entity cache if it is enabled.
	*
	* @param advType the adv type
	*/
	public void cacheResult(AdvType advType);

	/**
	* Caches the adv types in the entity cache if it is enabled.
	*
	* @param advTypes the adv types
	*/
	public void cacheResult(java.util.List<AdvType> advTypes);

	/**
	* Creates a new adv type with the primary key. Does not add the adv type to the database.
	*
	* @param typeId the primary key for the new adv type
	* @return the new adv type
	*/
	public AdvType create(long typeId);

	/**
	* Removes the adv type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the adv type
	* @return the adv type that was removed
	* @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	*/
	public AdvType remove(long typeId) throws NoSuchAdvTypeException;

	public AdvType updateImpl(AdvType advType);

	/**
	* Returns the adv type with the primary key or throws a {@link NoSuchAdvTypeException} if it could not be found.
	*
	* @param typeId the primary key of the adv type
	* @return the adv type
	* @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	*/
	public AdvType findByPrimaryKey(long typeId) throws NoSuchAdvTypeException;

	/**
	* Returns the adv type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the adv type
	* @return the adv type, or <code>null</code> if a adv type with the primary key could not be found
	*/
	public AdvType fetchByPrimaryKey(long typeId);

	@Override
	public java.util.Map<java.io.Serializable, AdvType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the adv types.
	*
	* @return the adv types
	*/
	public java.util.List<AdvType> findAll();

	/**
	* Returns a range of all the adv types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @return the range of adv types
	*/
	public java.util.List<AdvType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the adv types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of adv types
	*/
	public java.util.List<AdvType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator);

	/**
	* Returns an ordered range of all the adv types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of adv types
	*/
	public java.util.List<AdvType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the adv types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of adv types.
	*
	* @return the number of adv types
	*/
	public int countAll();
}