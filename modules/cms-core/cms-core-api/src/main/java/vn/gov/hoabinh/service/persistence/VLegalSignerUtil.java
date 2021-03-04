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

import vn.gov.hoabinh.model.VLegalSigner;

import java.util.List;

/**
 * The persistence utility for the v legal signer service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalSignerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSignerPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalSignerPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalSignerUtil {
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
	public static void clearCache(VLegalSigner vLegalSigner) {
		getPersistence().clearCache(vLegalSigner);
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
	public static List<VLegalSigner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalSigner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalSigner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalSigner update(VLegalSigner vLegalSigner) {
		return getPersistence().update(vLegalSigner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalSigner update(VLegalSigner vLegalSigner,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalSigner, serviceContext);
	}

	/**
	* Returns all the v legal signers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal signers
	*/
	public static List<VLegalSigner> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of matching v legal signers
	*/
	public static List<VLegalSigner> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal signers
	*/
	public static List<VLegalSigner> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal signers
	*/
	public static List<VLegalSigner> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByGroupId_First(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByGroupId_Last(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63;.
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public static VLegalSigner[] findByGroupId_PrevAndNext(
		java.lang.String sigId, long groupId,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(sigId, groupId, orderByComparator);
	}

	/**
	* Removes all the v legal signers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal signers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal signers
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the v legal signer where groupId = &#63; and sigId = &#63; or throws a {@link NoSuchVLegalSignerException} if it could not be found.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByG_S(long groupId, java.lang.String sigId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence().findByG_S(groupId, sigId);
	}

	/**
	* Returns the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByG_S(long groupId, java.lang.String sigId) {
		return getPersistence().fetchByG_S(groupId, sigId);
	}

	/**
	* Returns the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByG_S(long groupId, java.lang.String sigId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByG_S(groupId, sigId, retrieveFromCache);
	}

	/**
	* Removes the v legal signer where groupId = &#63; and sigId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the v legal signer that was removed
	*/
	public static VLegalSigner removeByG_S(long groupId, java.lang.String sigId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence().removeByG_S(groupId, sigId);
	}

	/**
	* Returns the number of v legal signers where groupId = &#63; and sigId = &#63;.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the number of matching v legal signers
	*/
	public static int countByG_S(long groupId, java.lang.String sigId) {
		return getPersistence().countByG_S(groupId, sigId);
	}

	/**
	* Returns all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal signers
	*/
	public static List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language) {
		return getPersistence().findByGroup_Lang(groupId, language);
	}

	/**
	* Returns a range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of matching v legal signers
	*/
	public static List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByGroup_Lang(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal signers
	*/
	public static List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .findByGroup_Lang(groupId, language, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal signers
	*/
	public static List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroup_Lang(groupId, language, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByGroup_Lang_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroup_Lang_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByGroup_Lang_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .fetchByGroup_Lang_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByGroup_Lang_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroup_Lang_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByGroup_Lang_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .fetchByGroup_Lang_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public static VLegalSigner[] findByGroup_Lang_PrevAndNext(
		java.lang.String sigId, long groupId, java.lang.String language,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByGroup_Lang_PrevAndNext(sigId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByGroup_Lang(long groupId,
		java.lang.String language) {
		getPersistence().removeByGroup_Lang(groupId, language);
	}

	/**
	* Returns the number of v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal signers
	*/
	public static int countByGroup_Lang(long groupId, java.lang.String language) {
		return getPersistence().countByGroup_Lang(groupId, language);
	}

	/**
	* Returns all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @return the matching v legal signers
	*/
	public static List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner) {
		return getPersistence().findByG_L_S(groupId, language, statusSigner);
	}

	/**
	* Returns a range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of matching v legal signers
	*/
	public static List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner, int start, int end) {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusSigner, start, end);
	}

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal signers
	*/
	public static List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusSigner, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal signers
	*/
	public static List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusSigner, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByG_L_S_First(long groupId,
		java.lang.String language, boolean statusSigner,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByG_L_S_First(groupId, language, statusSigner,
			orderByComparator);
	}

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByG_L_S_First(long groupId,
		java.lang.String language, boolean statusSigner,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_First(groupId, language, statusSigner,
			orderByComparator);
	}

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public static VLegalSigner findByG_L_S_Last(long groupId,
		java.lang.String language, boolean statusSigner,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByG_L_S_Last(groupId, language, statusSigner,
			orderByComparator);
	}

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public static VLegalSigner fetchByG_L_S_Last(long groupId,
		java.lang.String language, boolean statusSigner,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_Last(groupId, language, statusSigner,
			orderByComparator);
	}

	/**
	* Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public static VLegalSigner[] findByG_L_S_PrevAndNext(
		java.lang.String sigId, long groupId, java.lang.String language,
		boolean statusSigner, OrderByComparator<VLegalSigner> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence()
				   .findByG_L_S_PrevAndNext(sigId, groupId, language,
			statusSigner, orderByComparator);
	}

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	*/
	public static void removeByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner) {
		getPersistence().removeByG_L_S(groupId, language, statusSigner);
	}

	/**
	* Returns the number of v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @return the number of matching v legal signers
	*/
	public static int countByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner) {
		return getPersistence().countByG_L_S(groupId, language, statusSigner);
	}

	/**
	* Caches the v legal signer in the entity cache if it is enabled.
	*
	* @param vLegalSigner the v legal signer
	*/
	public static void cacheResult(VLegalSigner vLegalSigner) {
		getPersistence().cacheResult(vLegalSigner);
	}

	/**
	* Caches the v legal signers in the entity cache if it is enabled.
	*
	* @param vLegalSigners the v legal signers
	*/
	public static void cacheResult(List<VLegalSigner> vLegalSigners) {
		getPersistence().cacheResult(vLegalSigners);
	}

	/**
	* Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	*
	* @param sigId the primary key for the new v legal signer
	* @return the new v legal signer
	*/
	public static VLegalSigner create(java.lang.String sigId) {
		return getPersistence().create(sigId);
	}

	/**
	* Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer that was removed
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public static VLegalSigner remove(java.lang.String sigId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence().remove(sigId);
	}

	public static VLegalSigner updateImpl(VLegalSigner vLegalSigner) {
		return getPersistence().updateImpl(vLegalSigner);
	}

	/**
	* Returns the v legal signer with the primary key or throws a {@link NoSuchVLegalSignerException} if it could not be found.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public static VLegalSigner findByPrimaryKey(java.lang.String sigId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSignerException {
		return getPersistence().findByPrimaryKey(sigId);
	}

	/**
	* Returns the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	*/
	public static VLegalSigner fetchByPrimaryKey(java.lang.String sigId) {
		return getPersistence().fetchByPrimaryKey(sigId);
	}

	public static java.util.Map<java.io.Serializable, VLegalSigner> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal signers.
	*
	* @return the v legal signers
	*/
	public static List<VLegalSigner> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of v legal signers
	*/
	public static List<VLegalSigner> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal signers
	*/
	public static List<VLegalSigner> findAll(int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal signers
	*/
	public static List<VLegalSigner> findAll(int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal signers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal signers.
	*
	* @return the number of v legal signers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalSignerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalSignerPersistence, VLegalSignerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalSignerPersistence.class);
}