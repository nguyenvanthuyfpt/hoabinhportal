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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.Clip;

import java.util.List;

/**
 * The persistence utility for the clip service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.ClipPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.ClipPersistenceImpl
 * @generated
 */
@ProviderType
public class ClipUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Clip clip) {
		getPersistence().clearCache(clip);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Clip> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Clip> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Clip> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Clip update(Clip clip) {
		return getPersistence().update(clip);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Clip update(Clip clip, ServiceContext serviceContext) {
		return getPersistence().update(clip, serviceContext);
	}

	/**
	* Returns all the clips where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching clips
	*/
	public static List<Clip> findByG_L(long groupId, java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the clips where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByG_L(long groupId, java.lang.String language,
		int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByG_L(long groupId, java.lang.String language,
		int start, int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByG_L(long groupId, java.lang.String language,
		int start, int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByG_L_First(long groupId, java.lang.String language,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByG_L_First(long groupId,
		java.lang.String language, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByG_L_Last(long groupId, java.lang.String language,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByG_L_Last(long groupId, java.lang.String language,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current clip
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip[] findByG_L_PrevAndNext(java.lang.String id,
		long groupId, java.lang.String language,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_PrevAndNext(id, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the clips where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of clips where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching clips
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the matching clips
	*/
	public static List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active) {
		return getPersistence().findByG_L_A(groupId, language, active);
	}

	/**
	* Returns a range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end) {
		return getPersistence()
				   .findByG_L_A(groupId, language, active, start, end);
	}

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByG_L_A(groupId, language, active, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_A(groupId, language, active, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByG_L_A_First(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_A_First(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByG_L_A_First(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_A_First(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByG_L_A_Last(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_A_Last(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByG_L_A_Last(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_A_Last(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param id the primary key of the current clip
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip[] findByG_L_A_PrevAndNext(java.lang.String id,
		long groupId, java.lang.String language, boolean active,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_A_PrevAndNext(id, groupId, language, active,
			orderByComparator);
	}

	/**
	* Removes all the clips where groupId = &#63; and language = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	*/
	public static void removeByG_L_A(long groupId, java.lang.String language,
		boolean active) {
		getPersistence().removeByG_L_A(groupId, language, active);
	}

	/**
	* Returns the number of clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the number of matching clips
	*/
	public static int countByG_L_A(long groupId, java.lang.String language,
		boolean active) {
		return getPersistence().countByG_L_A(groupId, language, active);
	}

	/**
	* Returns all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public static List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId) {
		return getPersistence().findByG_L_T(groupId, language, clipTypeId);
	}

	/**
	* Returns a range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId, int start,
		int end) {
		return getPersistence()
				   .findByG_L_T(groupId, language, clipTypeId, start, end);
	}

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId, int start,
		int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByG_L_T(groupId, language, clipTypeId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId, int start,
		int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_T(groupId, language, clipTypeId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByG_L_T_First(long groupId,
		java.lang.String language, java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_T_First(groupId, language, clipTypeId,
			orderByComparator);
	}

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByG_L_T_First(long groupId,
		java.lang.String language, java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_First(groupId, language, clipTypeId,
			orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByG_L_T_Last(long groupId,
		java.lang.String language, java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_T_Last(groupId, language, clipTypeId,
			orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByG_L_T_Last(long groupId,
		java.lang.String language, java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_Last(groupId, language, clipTypeId,
			orderByComparator);
	}

	/**
	* Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip[] findByG_L_T_PrevAndNext(java.lang.String id,
		long groupId, java.lang.String language, java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByG_L_T_PrevAndNext(id, groupId, language, clipTypeId,
			orderByComparator);
	}

	/**
	* Removes all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	*/
	public static void removeByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId) {
		getPersistence().removeByG_L_T(groupId, language, clipTypeId);
	}

	/**
	* Returns the number of clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public static int countByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId) {
		return getPersistence().countByG_L_T(groupId, language, clipTypeId);
	}

	/**
	* Returns all the clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public static List<Clip> findByClipTypeId(java.lang.String clipTypeId) {
		return getPersistence().findByClipTypeId(clipTypeId);
	}

	/**
	* Returns a range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByClipTypeId(java.lang.String clipTypeId,
		int start, int end) {
		return getPersistence().findByClipTypeId(clipTypeId, start, end);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByClipTypeId(java.lang.String clipTypeId,
		int start, int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByClipTypeId(clipTypeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByClipTypeId(java.lang.String clipTypeId,
		int start, int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByClipTypeId(clipTypeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByClipTypeId_First(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByClipTypeId_First(clipTypeId, orderByComparator);
	}

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByClipTypeId_First(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByClipTypeId_First(clipTypeId, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByClipTypeId_Last(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByClipTypeId_Last(clipTypeId, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByClipTypeId_Last(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByClipTypeId_Last(clipTypeId, orderByComparator);
	}

	/**
	* Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip[] findByClipTypeId_PrevAndNext(java.lang.String id,
		java.lang.String clipTypeId, OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByClipTypeId_PrevAndNext(id, clipTypeId,
			orderByComparator);
	}

	/**
	* Removes all the clips where clipTypeId = &#63; from the database.
	*
	* @param clipTypeId the clip type ID
	*/
	public static void removeByClipTypeId(java.lang.String clipTypeId) {
		getPersistence().removeByClipTypeId(clipTypeId);
	}

	/**
	* Returns the number of clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public static int countByClipTypeId(java.lang.String clipTypeId) {
		return getPersistence().countByClipTypeId(clipTypeId);
	}

	/**
	* Returns all the clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String clipTypeId) {
		return getPersistence().findByMenu(clipTypeId);
	}

	/**
	* Returns a range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String clipTypeId, int start,
		int end) {
		return getPersistence().findByMenu(clipTypeId, start, end);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String clipTypeId, int start,
		int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByMenu(clipTypeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String clipTypeId, int start,
		int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(clipTypeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByMenu_First(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence().findByMenu_First(clipTypeId, orderByComparator);
	}

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByMenu_First(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence().fetchByMenu_First(clipTypeId, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByMenu_Last(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence().findByMenu_Last(clipTypeId, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByMenu_Last(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence().fetchByMenu_Last(clipTypeId, orderByComparator);
	}

	/**
	* Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip[] findByMenu_PrevAndNext(java.lang.String id,
		java.lang.String clipTypeId, OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByMenu_PrevAndNext(id, clipTypeId, orderByComparator);
	}

	/**
	* Returns all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @return the matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String[] clipTypeIds) {
		return getPersistence().findByMenu(clipTypeIds);
	}

	/**
	* Returns a range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String[] clipTypeIds,
		int start, int end) {
		return getPersistence().findByMenu(clipTypeIds, start, end);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String[] clipTypeIds,
		int start, int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByMenu(clipTypeIds, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByMenu(java.lang.String[] clipTypeIds,
		int start, int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(clipTypeIds, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the clips where clipTypeId = &#63; from the database.
	*
	* @param clipTypeId the clip type ID
	*/
	public static void removeByMenu(java.lang.String clipTypeId) {
		getPersistence().removeByMenu(clipTypeId);
	}

	/**
	* Returns the number of clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public static int countByMenu(java.lang.String clipTypeId) {
		return getPersistence().countByMenu(clipTypeId);
	}

	/**
	* Returns the number of clips where clipTypeId = any &#63;.
	*
	* @param clipTypeIds the clip type IDs
	* @return the number of matching clips
	*/
	public static int countByMenu(java.lang.String[] clipTypeIds) {
		return getPersistence().countByMenu(clipTypeIds);
	}

	/**
	* Returns all the clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String clipTypeId) {
		return getPersistence().findByClipDisplay(clipTypeId);
	}

	/**
	* Returns a range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String clipTypeId,
		int start, int end) {
		return getPersistence().findByClipDisplay(clipTypeId, start, end);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String clipTypeId,
		int start, int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByClipDisplay(clipTypeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String clipTypeId,
		int start, int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByClipDisplay(clipTypeId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByClipDisplay_First(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByClipDisplay_First(clipTypeId, orderByComparator);
	}

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByClipDisplay_First(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByClipDisplay_First(clipTypeId, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public static Clip findByClipDisplay_Last(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByClipDisplay_Last(clipTypeId, orderByComparator);
	}

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public static Clip fetchByClipDisplay_Last(java.lang.String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .fetchByClipDisplay_Last(clipTypeId, orderByComparator);
	}

	/**
	* Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip[] findByClipDisplay_PrevAndNext(java.lang.String id,
		java.lang.String clipTypeId, OrderByComparator<Clip> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence()
				   .findByClipDisplay_PrevAndNext(id, clipTypeId,
			orderByComparator);
	}

	/**
	* Returns all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @return the matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String[] clipTypeIds) {
		return getPersistence().findByClipDisplay(clipTypeIds);
	}

	/**
	* Returns a range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String[] clipTypeIds,
		int start, int end) {
		return getPersistence().findByClipDisplay(clipTypeIds, start, end);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String[] clipTypeIds,
		int start, int end, OrderByComparator<Clip> orderByComparator) {
		return getPersistence()
				   .findByClipDisplay(clipTypeIds, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public static List<Clip> findByClipDisplay(java.lang.String[] clipTypeIds,
		int start, int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByClipDisplay(clipTypeIds, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the clips where clipTypeId = &#63; from the database.
	*
	* @param clipTypeId the clip type ID
	*/
	public static void removeByClipDisplay(java.lang.String clipTypeId) {
		getPersistence().removeByClipDisplay(clipTypeId);
	}

	/**
	* Returns the number of clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public static int countByClipDisplay(java.lang.String clipTypeId) {
		return getPersistence().countByClipDisplay(clipTypeId);
	}

	/**
	* Returns the number of clips where clipTypeId = any &#63;.
	*
	* @param clipTypeIds the clip type IDs
	* @return the number of matching clips
	*/
	public static int countByClipDisplay(java.lang.String[] clipTypeIds) {
		return getPersistence().countByClipDisplay(clipTypeIds);
	}

	/**
	* Caches the clip in the entity cache if it is enabled.
	*
	* @param clip the clip
	*/
	public static void cacheResult(Clip clip) {
		getPersistence().cacheResult(clip);
	}

	/**
	* Caches the clips in the entity cache if it is enabled.
	*
	* @param clips the clips
	*/
	public static void cacheResult(List<Clip> clips) {
		getPersistence().cacheResult(clips);
	}

	/**
	* Creates a new clip with the primary key. Does not add the clip to the database.
	*
	* @param id the primary key for the new clip
	* @return the new clip
	*/
	public static Clip create(java.lang.String id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip
	* @return the clip that was removed
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip remove(java.lang.String id)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence().remove(id);
	}

	public static Clip updateImpl(Clip clip) {
		return getPersistence().updateImpl(clip);
	}

	/**
	* Returns the clip with the primary key or throws a {@link NoSuchClipException} if it could not be found.
	*
	* @param id the primary key of the clip
	* @return the clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public static Clip findByPrimaryKey(java.lang.String id)
		throws vn.gov.hoabinh.exception.NoSuchClipException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the clip with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clip
	* @return the clip, or <code>null</code> if a clip with the primary key could not be found
	*/
	public static Clip fetchByPrimaryKey(java.lang.String id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, Clip> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the clips.
	*
	* @return the clips
	*/
	public static List<Clip> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of clips
	*/
	public static List<Clip> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clips
	*/
	public static List<Clip> findAll(int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of clips
	*/
	public static List<Clip> findAll(int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the clips from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of clips.
	*
	* @return the number of clips
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ClipPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClipPersistence, ClipPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ClipPersistence.class);
}