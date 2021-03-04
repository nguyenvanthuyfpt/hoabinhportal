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

import vn.gov.hoabinh.exception.NoSuchAdvItemException;
import vn.gov.hoabinh.model.AdvItem;

/**
 * The persistence interface for the adv item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.AdvItemPersistenceImpl
 * @see AdvItemUtil
 * @generated
 */
@ProviderType
public interface AdvItemPersistence extends BasePersistence<AdvItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvItemUtil} to access the adv item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the adv items where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByG(long groupId);

	/**
	* Returns a range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public java.util.List<AdvItem> findByG(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByG_PrevAndNext(long itemId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByG(long groupId);

	/**
	* Returns the number of adv items where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching adv items
	*/
	public int countByG(long groupId);

	/**
	* Returns all the adv items where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByT(long typeId);

	/**
	* Returns a range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public java.util.List<AdvItem> findByT(long typeId, int start, int end);

	/**
	* Returns an ordered range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByT(long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns an ordered range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByT(long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByT_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByT_First(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByT_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByT_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where typeId = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByT_PrevAndNext(long itemId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public void removeByT(long typeId);

	/**
	* Returns the number of adv items where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching adv items
	*/
	public int countByT(long typeId);

	/**
	* Returns all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByG_T(long groupId, long typeId);

	/**
	* Returns a range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_T(long groupId, long typeId,
		int start, int end);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_T(long groupId, long typeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_T(long groupId, long typeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_T_First(long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_T_First(long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_T_Last(long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_T_Last(long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByG_T_PrevAndNext(long itemId, long groupId,
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	*/
	public void removeByG_T(long groupId, long typeId);

	/**
	* Returns the number of adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the number of matching adv items
	*/
	public int countByG_T(long groupId, long typeId);

	/**
	* Returns all the adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByG_S(long groupId, boolean status);

	/**
	* Returns a range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_S(long groupId, boolean status,
		int start, int end);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_S(long groupId, boolean status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_S(long groupId, boolean status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_S_First(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_S_First(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_S_Last(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_S_Last(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByG_S_PrevAndNext(long itemId, long groupId,
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByG_S(long groupId, boolean status);

	/**
	* Returns the number of adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching adv items
	*/
	public int countByG_S(long groupId, boolean status);

	/**
	* Returns all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @return the matching adv items
	*/
	public java.util.List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status);

	/**
	* Returns a range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status, int start, int end);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public java.util.List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_T_S_First(long groupId, long typeId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_T_S_First(long groupId, long typeId,
		boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public AdvItem findByG_T_S_Last(long groupId, long typeId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public AdvItem fetchByG_T_S_Last(long groupId, long typeId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem[] findByG_T_S_PrevAndNext(long itemId, long groupId,
		long typeId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException;

	/**
	* Removes all the adv items where groupId = &#63; and typeId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	*/
	public void removeByG_T_S(long groupId, long typeId, boolean status);

	/**
	* Returns the number of adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @return the number of matching adv items
	*/
	public int countByG_T_S(long groupId, long typeId, boolean status);

	/**
	* Caches the adv item in the entity cache if it is enabled.
	*
	* @param advItem the adv item
	*/
	public void cacheResult(AdvItem advItem);

	/**
	* Caches the adv items in the entity cache if it is enabled.
	*
	* @param advItems the adv items
	*/
	public void cacheResult(java.util.List<AdvItem> advItems);

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param itemId the primary key for the new adv item
	* @return the new adv item
	*/
	public AdvItem create(long itemId);

	/**
	* Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem remove(long itemId) throws NoSuchAdvItemException;

	public AdvItem updateImpl(AdvItem advItem);

	/**
	* Returns the adv item with the primary key or throws a {@link NoSuchAdvItemException} if it could not be found.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public AdvItem findByPrimaryKey(long itemId) throws NoSuchAdvItemException;

	/**
	* Returns the adv item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	*/
	public AdvItem fetchByPrimaryKey(long itemId);

	@Override
	public java.util.Map<java.io.Serializable, AdvItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the adv items.
	*
	* @return the adv items
	*/
	public java.util.List<AdvItem> findAll();

	/**
	* Returns a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of adv items
	*/
	public java.util.List<AdvItem> findAll(int start, int end);

	/**
	* Returns an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of adv items
	*/
	public java.util.List<AdvItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator);

	/**
	* Returns an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of adv items
	*/
	public java.util.List<AdvItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the adv items from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	public int countAll();
}