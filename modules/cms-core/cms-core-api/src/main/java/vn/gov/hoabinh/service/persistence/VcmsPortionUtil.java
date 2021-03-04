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

import vn.gov.hoabinh.model.VcmsPortion;

import java.util.List;

/**
 * The persistence utility for the vcms portion service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsPortionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPortionPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsPortionPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsPortionUtil {
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
	public static void clearCache(VcmsPortion vcmsPortion) {
		getPersistence().clearCache(vcmsPortion);
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
	public static List<VcmsPortion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsPortion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsPortion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsPortion update(VcmsPortion vcmsPortion) {
		return getPersistence().update(vcmsPortion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsPortion update(VcmsPortion vcmsPortion,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsPortion, serviceContext);
	}

	/**
	* Returns all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @return the matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable) {
		return getPersistence().findByG_L_C(groupId, language, categorizable);
	}

	/**
	* Returns a range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @return the range of matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable, int start, int end) {
		return getPersistence()
				   .findByG_L_C(groupId, language, categorizable, start, end);
	}

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .findByG_L_C(groupId, language, categorizable, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_C(groupId, language, categorizable, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public static VcmsPortion findByG_L_C_First(long groupId,
		java.lang.String language, boolean categorizable,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByG_L_C_First(groupId, language, categorizable,
			orderByComparator);
	}

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public static VcmsPortion fetchByG_L_C_First(long groupId,
		java.lang.String language, boolean categorizable,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_C_First(groupId, language, categorizable,
			orderByComparator);
	}

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public static VcmsPortion findByG_L_C_Last(long groupId,
		java.lang.String language, boolean categorizable,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByG_L_C_Last(groupId, language, categorizable,
			orderByComparator);
	}

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public static VcmsPortion fetchByG_L_C_Last(long groupId,
		java.lang.String language, boolean categorizable,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_C_Last(groupId, language, categorizable,
			orderByComparator);
	}

	/**
	* Returns the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param portionId the primary key of the current vcms portion
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms portion
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public static VcmsPortion[] findByG_L_C_PrevAndNext(
		java.lang.String portionId, long groupId, java.lang.String language,
		boolean categorizable, OrderByComparator<VcmsPortion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByG_L_C_PrevAndNext(portionId, groupId, language,
			categorizable, orderByComparator);
	}

	/**
	* Removes all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	*/
	public static void removeByG_L_C(long groupId, java.lang.String language,
		boolean categorizable) {
		getPersistence().removeByG_L_C(groupId, language, categorizable);
	}

	/**
	* Returns the number of vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @return the number of matching vcms portions
	*/
	public static int countByG_L_C(long groupId, java.lang.String language,
		boolean categorizable) {
		return getPersistence().countByG_L_C(groupId, language, categorizable);
	}

	/**
	* Returns the vcms portion where groupId = &#63; and code = &#63; or throws a {@link NoSuchVcmsPortionException} if it could not be found.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public static VcmsPortion findByS_C(long groupId, java.lang.String code)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence().findByS_C(groupId, code);
	}

	/**
	* Returns the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public static VcmsPortion fetchByS_C(long groupId, java.lang.String code) {
		return getPersistence().fetchByS_C(groupId, code);
	}

	/**
	* Returns the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public static VcmsPortion fetchByS_C(long groupId, java.lang.String code,
		boolean retrieveFromCache) {
		return getPersistence().fetchByS_C(groupId, code, retrieveFromCache);
	}

	/**
	* Removes the vcms portion where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the vcms portion that was removed
	*/
	public static VcmsPortion removeByS_C(long groupId, java.lang.String code)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence().removeByS_C(groupId, code);
	}

	/**
	* Returns the number of vcms portions where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the number of matching vcms portions
	*/
	public static int countByS_C(long groupId, java.lang.String code) {
		return getPersistence().countByS_C(groupId, code);
	}

	/**
	* Returns all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @return the range of matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms portions
	*/
	public static List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public static VcmsPortion findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public static VcmsPortion fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public static VcmsPortion findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public static VcmsPortion fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param portionId the primary key of the current vcms portion
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms portion
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public static VcmsPortion[] findByG_L_PrevAndNext(
		java.lang.String portionId, long groupId, java.lang.String language,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByG_L_PrevAndNext(portionId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vcms portions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of vcms portions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms portions
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Caches the vcms portion in the entity cache if it is enabled.
	*
	* @param vcmsPortion the vcms portion
	*/
	public static void cacheResult(VcmsPortion vcmsPortion) {
		getPersistence().cacheResult(vcmsPortion);
	}

	/**
	* Caches the vcms portions in the entity cache if it is enabled.
	*
	* @param vcmsPortions the vcms portions
	*/
	public static void cacheResult(List<VcmsPortion> vcmsPortions) {
		getPersistence().cacheResult(vcmsPortions);
	}

	/**
	* Creates a new vcms portion with the primary key. Does not add the vcms portion to the database.
	*
	* @param portionId the primary key for the new vcms portion
	* @return the new vcms portion
	*/
	public static VcmsPortion create(java.lang.String portionId) {
		return getPersistence().create(portionId);
	}

	/**
	* Removes the vcms portion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portionId the primary key of the vcms portion
	* @return the vcms portion that was removed
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public static VcmsPortion remove(java.lang.String portionId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence().remove(portionId);
	}

	public static VcmsPortion updateImpl(VcmsPortion vcmsPortion) {
		return getPersistence().updateImpl(vcmsPortion);
	}

	/**
	* Returns the vcms portion with the primary key or throws a {@link NoSuchVcmsPortionException} if it could not be found.
	*
	* @param portionId the primary key of the vcms portion
	* @return the vcms portion
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public static VcmsPortion findByPrimaryKey(java.lang.String portionId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPortionException {
		return getPersistence().findByPrimaryKey(portionId);
	}

	/**
	* Returns the vcms portion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portionId the primary key of the vcms portion
	* @return the vcms portion, or <code>null</code> if a vcms portion with the primary key could not be found
	*/
	public static VcmsPortion fetchByPrimaryKey(java.lang.String portionId) {
		return getPersistence().fetchByPrimaryKey(portionId);
	}

	public static java.util.Map<java.io.Serializable, VcmsPortion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms portions.
	*
	* @return the vcms portions
	*/
	public static List<VcmsPortion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @return the range of vcms portions
	*/
	public static List<VcmsPortion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms portions
	*/
	public static List<VcmsPortion> findAll(int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms portions
	*/
	public static List<VcmsPortion> findAll(int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms portions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms portions.
	*
	* @return the number of vcms portions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VcmsPortionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsPortionPersistence, VcmsPortionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsPortionPersistence.class);
}