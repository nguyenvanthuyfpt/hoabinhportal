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

import vn.gov.hoabinh.model.ClipType;

import java.util.List;

/**
 * The persistence utility for the clip type service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.ClipTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipTypePersistence
 * @see vn.gov.hoabinh.service.persistence.impl.ClipTypePersistenceImpl
 * @generated
 */
@ProviderType
public class ClipTypeUtil {
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
	public static void clearCache(ClipType clipType) {
		getPersistence().clearCache(clipType);
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
	public static List<ClipType> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ClipType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ClipType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ClipType update(ClipType clipType) {
		return getPersistence().update(clipType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ClipType update(ClipType clipType,
		ServiceContext serviceContext) {
		return getPersistence().update(clipType, serviceContext);
	}

	/**
	* Returns all the clip types where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @return the matching clip types
	*/
	public static List<ClipType> findByLanguage(java.lang.String language,
		boolean active) {
		return getPersistence().findByLanguage(language, active);
	}

	/**
	* Returns a range of all the clip types where language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public static List<ClipType> findByLanguage(java.lang.String language,
		boolean active, int start, int end) {
		return getPersistence().findByLanguage(language, active, start, end);
	}

	/**
	* Returns an ordered range of all the clip types where language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByLanguage(java.lang.String language,
		boolean active, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .findByLanguage(language, active, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the clip types where language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByLanguage(java.lang.String language,
		boolean active, int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByLanguage(language, active, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByLanguage_First(java.lang.String language,
		boolean active, OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByLanguage_First(language, active, orderByComparator);
	}

	/**
	* Returns the first clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByLanguage_First(java.lang.String language,
		boolean active, OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .fetchByLanguage_First(language, active, orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByLanguage_Last(java.lang.String language,
		boolean active, OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByLanguage_Last(language, active, orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByLanguage_Last(java.lang.String language,
		boolean active, OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .fetchByLanguage_Last(language, active, orderByComparator);
	}

	/**
	* Returns the clip types before and after the current clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param id the primary key of the current clip type
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public static ClipType[] findByLanguage_PrevAndNext(java.lang.String id,
		java.lang.String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByLanguage_PrevAndNext(id, language, active,
			orderByComparator);
	}

	/**
	* Removes all the clip types where language = &#63; and active = &#63; from the database.
	*
	* @param language the language
	* @param active the active
	*/
	public static void removeByLanguage(java.lang.String language,
		boolean active) {
		getPersistence().removeByLanguage(language, active);
	}

	/**
	* Returns the number of clip types where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @return the number of matching clip types
	*/
	public static int countByLanguage(java.lang.String language, boolean active) {
		return getPersistence().countByLanguage(language, active);
	}

	/**
	* Returns all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the matching clip types
	*/
	public static List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active) {
		return getPersistence().findByG_L_A(groupId, language, active);
	}

	/**
	* Returns a range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public static List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end) {
		return getPersistence()
				   .findByG_L_A(groupId, language, active, start, end);
	}

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .findByG_L_A(groupId, language, active, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_A(groupId, language, active, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByG_L_A_First(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByG_L_A_First(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByG_L_A_First(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_A_First(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByG_L_A_Last(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByG_L_A_Last(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByG_L_A_Last(long groupId,
		java.lang.String language, boolean active,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_A_Last(groupId, language, active,
			orderByComparator);
	}

	/**
	* Returns the clip types before and after the current clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param id the primary key of the current clip type
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public static ClipType[] findByG_L_A_PrevAndNext(java.lang.String id,
		long groupId, java.lang.String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByG_L_A_PrevAndNext(id, groupId, language, active,
			orderByComparator);
	}

	/**
	* Removes all the clip types where groupId = &#63; and language = &#63; and active = &#63; from the database.
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
	* Returns the number of clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the number of matching clip types
	*/
	public static int countByG_L_A(long groupId, java.lang.String language,
		boolean active) {
		return getPersistence().countByG_L_A(groupId, language, active);
	}

	/**
	* Returns all the clip types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching clip types
	*/
	public static List<ClipType> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the clip types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public static List<ClipType> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByG_L_First(long groupId,
		java.lang.String language, OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByG_L_First(long groupId,
		java.lang.String language, OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByG_L_Last(long groupId,
		java.lang.String language, OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByG_L_Last(long groupId,
		java.lang.String language, OrderByComparator<ClipType> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the clip types before and after the current clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current clip type
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public static ClipType[] findByG_L_PrevAndNext(java.lang.String id,
		long groupId, java.lang.String language,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence()
				   .findByG_L_PrevAndNext(id, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the clip types where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of clip types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching clip types
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the clip types where id = &#63;.
	*
	* @param id the ID
	* @return the matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String id) {
		return getPersistence().findByMenu(id);
	}

	/**
	* Returns a range of all the clip types where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String id, int start,
		int end) {
		return getPersistence().findByMenu(id, start, end);
	}

	/**
	* Returns an ordered range of all the clip types where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String id, int start,
		int end, OrderByComparator<ClipType> orderByComparator) {
		return getPersistence().findByMenu(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clip types where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String id, int start,
		int end, OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByMenu_First(java.lang.String id,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence().findByMenu_First(id, orderByComparator);
	}

	/**
	* Returns the first clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByMenu_First(java.lang.String id,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence().fetchByMenu_First(id, orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public static ClipType findByMenu_Last(java.lang.String id,
		OrderByComparator<ClipType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence().findByMenu_Last(id, orderByComparator);
	}

	/**
	* Returns the last clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public static ClipType fetchByMenu_Last(java.lang.String id,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence().fetchByMenu_Last(id, orderByComparator);
	}

	/**
	* Returns all the clip types where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @return the matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String[] ids) {
		return getPersistence().findByMenu(ids);
	}

	/**
	* Returns a range of all the clip types where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String[] ids, int start,
		int end) {
		return getPersistence().findByMenu(ids, start, end);
	}

	/**
	* Returns an ordered range of all the clip types where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String[] ids, int start,
		int end, OrderByComparator<ClipType> orderByComparator) {
		return getPersistence().findByMenu(ids, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clip types where id = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public static List<ClipType> findByMenu(java.lang.String[] ids, int start,
		int end, OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(ids, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the clip types where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByMenu(java.lang.String id) {
		getPersistence().removeByMenu(id);
	}

	/**
	* Returns the number of clip types where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching clip types
	*/
	public static int countByMenu(java.lang.String id) {
		return getPersistence().countByMenu(id);
	}

	/**
	* Returns the number of clip types where id = any &#63;.
	*
	* @param ids the IDs
	* @return the number of matching clip types
	*/
	public static int countByMenu(java.lang.String[] ids) {
		return getPersistence().countByMenu(ids);
	}

	/**
	* Caches the clip type in the entity cache if it is enabled.
	*
	* @param clipType the clip type
	*/
	public static void cacheResult(ClipType clipType) {
		getPersistence().cacheResult(clipType);
	}

	/**
	* Caches the clip types in the entity cache if it is enabled.
	*
	* @param clipTypes the clip types
	*/
	public static void cacheResult(List<ClipType> clipTypes) {
		getPersistence().cacheResult(clipTypes);
	}

	/**
	* Creates a new clip type with the primary key. Does not add the clip type to the database.
	*
	* @param id the primary key for the new clip type
	* @return the new clip type
	*/
	public static ClipType create(java.lang.String id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip type
	* @return the clip type that was removed
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public static ClipType remove(java.lang.String id)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence().remove(id);
	}

	public static ClipType updateImpl(ClipType clipType) {
		return getPersistence().updateImpl(clipType);
	}

	/**
	* Returns the clip type with the primary key or throws a {@link NoSuchClipTypeException} if it could not be found.
	*
	* @param id the primary key of the clip type
	* @return the clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public static ClipType findByPrimaryKey(java.lang.String id)
		throws vn.gov.hoabinh.exception.NoSuchClipTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the clip type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clip type
	* @return the clip type, or <code>null</code> if a clip type with the primary key could not be found
	*/
	public static ClipType fetchByPrimaryKey(java.lang.String id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ClipType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the clip types.
	*
	* @return the clip types
	*/
	public static List<ClipType> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of clip types
	*/
	public static List<ClipType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clip types
	*/
	public static List<ClipType> findAll(int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of clip types
	*/
	public static List<ClipType> findAll(int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the clip types from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of clip types.
	*
	* @return the number of clip types
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ClipTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClipTypePersistence, ClipTypePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ClipTypePersistence.class);
}