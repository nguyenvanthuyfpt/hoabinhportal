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

import vn.gov.hoabinh.model.VLegalAttachedMessage;

import java.util.List;

/**
 * The persistence utility for the v legal attached message service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalAttachedMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessagePersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalAttachedMessagePersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalAttachedMessageUtil {
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
	public static void clearCache(VLegalAttachedMessage vLegalAttachedMessage) {
		getPersistence().clearCache(vLegalAttachedMessage);
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
	public static List<VLegalAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalAttachedMessage update(
		VLegalAttachedMessage vLegalAttachedMessage) {
		return getPersistence().update(vLegalAttachedMessage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalAttachedMessage update(
		VLegalAttachedMessage vLegalAttachedMessage,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalAttachedMessage, serviceContext);
	}

	/**
	* Returns all the v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the v legal attached messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByGroupId(long groupId,
		int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByGroupId_First(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByGroupId_Last(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param messageId the primary key of the current v legal attached message
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage[] findByGroupId_PrevAndNext(
		java.lang.String messageId, long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(messageId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the v legal attached messages where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal attached messages
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the v legal attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param messageId the primary key of the current v legal attached message
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage[] findByArticle_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByArticle_PrevAndNext(messageId, articleId,
			orderByComparator);
	}

	/**
	* Removes all the v legal attached messages where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching v legal attached messages
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Returns all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage) {
		return getPersistence().findByA_R(articleId, readMessage);
	}

	/**
	* Returns a range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end) {
		return getPersistence().findByA_R(articleId, readMessage, start, end);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByA_R(articleId, readMessage, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_R(articleId, readMessage, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByA_R_First(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByA_R_First(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByA_R_First(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByA_R_First(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByA_R_Last(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByA_R_Last(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByA_R_Last(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByA_R_Last(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param messageId the primary key of the current v legal attached message
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage[] findByA_R_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByA_R_PrevAndNext(messageId, articleId, readMessage,
			orderByComparator);
	}

	/**
	* Removes all the v legal attached messages where articleId = &#63; and readMessage = &#63; from the database.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	*/
	public static void removeByA_R(java.lang.String articleId,
		boolean readMessage) {
		getPersistence().removeByA_R(articleId, readMessage);
	}

	/**
	* Returns the number of v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the number of matching v legal attached messages
	*/
	public static int countByA_R(java.lang.String articleId, boolean readMessage) {
		return getPersistence().countByA_R(articleId, readMessage);
	}

	/**
	* Returns all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage) {
		return getPersistence().findByStatus(groupId, readMessage);
	}

	/**
	* Returns a range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end) {
		return getPersistence().findByStatus(groupId, readMessage, start, end);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByStatus(groupId, readMessage, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(groupId, readMessage, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByStatus_First(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByStatus_First(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByStatus_First(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_First(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage findByStatus_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByStatus_Last(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public static VLegalAttachedMessage fetchByStatus_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByStatus_Last(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param messageId the primary key of the current v legal attached message
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage[] findByStatus_PrevAndNext(
		java.lang.String messageId, long groupId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByStatus_PrevAndNext(messageId, groupId, readMessage,
			orderByComparator);
	}

	/**
	* Removes all the v legal attached messages where groupId = &#63; and readMessage = &#63; from the database.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	*/
	public static void removeByStatus(long groupId, boolean readMessage) {
		getPersistence().removeByStatus(groupId, readMessage);
	}

	/**
	* Returns the number of v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the number of matching v legal attached messages
	*/
	public static int countByStatus(long groupId, boolean readMessage) {
		return getPersistence().countByStatus(groupId, readMessage);
	}

	/**
	* Caches the v legal attached message in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessage the v legal attached message
	*/
	public static void cacheResult(VLegalAttachedMessage vLegalAttachedMessage) {
		getPersistence().cacheResult(vLegalAttachedMessage);
	}

	/**
	* Caches the v legal attached messages in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessages the v legal attached messages
	*/
	public static void cacheResult(
		List<VLegalAttachedMessage> vLegalAttachedMessages) {
		getPersistence().cacheResult(vLegalAttachedMessages);
	}

	/**
	* Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	*
	* @param messageId the primary key for the new v legal attached message
	* @return the new v legal attached message
	*/
	public static VLegalAttachedMessage create(java.lang.String messageId) {
		return getPersistence().create(messageId);
	}

	/**
	* Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message that was removed
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage remove(java.lang.String messageId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence().remove(messageId);
	}

	public static VLegalAttachedMessage updateImpl(
		VLegalAttachedMessage vLegalAttachedMessage) {
		return getPersistence().updateImpl(vLegalAttachedMessage);
	}

	/**
	* Returns the v legal attached message with the primary key or throws a {@link NoSuchVLegalAttachedMessageException} if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage findByPrimaryKey(
		java.lang.String messageId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByPrimaryKey(messageId);
	}

	/**
	* Returns the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	*/
	public static VLegalAttachedMessage fetchByPrimaryKey(
		java.lang.String messageId) {
		return getPersistence().fetchByPrimaryKey(messageId);
	}

	public static java.util.Map<java.io.Serializable, VLegalAttachedMessage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal attached messages.
	*
	* @return the v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findAll(int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal attached messages
	*/
	public static List<VLegalAttachedMessage> findAll(int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal attached messages from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal attached messages.
	*
	* @return the number of v legal attached messages
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalAttachedMessagePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalAttachedMessagePersistence, VLegalAttachedMessagePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalAttachedMessagePersistence.class);
}