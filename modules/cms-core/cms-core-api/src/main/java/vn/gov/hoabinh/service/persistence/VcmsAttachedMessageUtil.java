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

import vn.gov.hoabinh.model.VcmsAttachedMessage;

import java.util.List;

/**
 * The persistence utility for the vcms attached message service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsAttachedMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessagePersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsAttachedMessagePersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsAttachedMessageUtil {
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
	public static void clearCache(VcmsAttachedMessage vcmsAttachedMessage) {
		getPersistence().clearCache(vcmsAttachedMessage);
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
	public static List<VcmsAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsAttachedMessage update(
		VcmsAttachedMessage vcmsAttachedMessage) {
		return getPersistence().update(vcmsAttachedMessage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsAttachedMessage update(
		VcmsAttachedMessage vcmsAttachedMessage, ServiceContext serviceContext) {
		return getPersistence().update(vcmsAttachedMessage, serviceContext);
	}

	/**
	* Returns all the vcms attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms attached messages before and after the current vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param messageId the primary key of the current vcms attached message
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage[] findByArticle_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByArticle_PrevAndNext(messageId, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms attached messages where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms attached messages
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Returns all the vcms attached messages where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @return the matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByUnRead(boolean readMessage) {
		return getPersistence().findByUnRead(readMessage);
	}

	/**
	* Returns a range of all the vcms attached messages where readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByUnRead(boolean readMessage,
		int start, int end) {
		return getPersistence().findByUnRead(readMessage, start, end);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByUnRead(boolean readMessage,
		int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByUnRead(readMessage, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByUnRead(boolean readMessage,
		int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUnRead(readMessage, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByUnRead_First(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByUnRead_First(readMessage, orderByComparator);
	}

	/**
	* Returns the first vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByUnRead_First(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByUnRead_First(readMessage, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByUnRead_Last(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence().findByUnRead_Last(readMessage, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByUnRead_Last(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByUnRead_Last(readMessage, orderByComparator);
	}

	/**
	* Returns the vcms attached messages before and after the current vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param messageId the primary key of the current vcms attached message
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage[] findByUnRead_PrevAndNext(
		java.lang.String messageId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByUnRead_PrevAndNext(messageId, readMessage,
			orderByComparator);
	}

	/**
	* Removes all the vcms attached messages where readMessage = &#63; from the database.
	*
	* @param readMessage the read message
	*/
	public static void removeByUnRead(boolean readMessage) {
		getPersistence().removeByUnRead(readMessage);
	}

	/**
	* Returns the number of vcms attached messages where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @return the number of matching vcms attached messages
	*/
	public static int countByUnRead(boolean readMessage) {
		return getPersistence().countByUnRead(readMessage);
	}

	/**
	* Returns all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage) {
		return getPersistence().findByA_R(articleId, readMessage);
	}

	/**
	* Returns a range of all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end) {
		return getPersistence().findByA_R(articleId, readMessage, start, end);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByA_R(articleId, readMessage, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_R(articleId, readMessage, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByA_R_First(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByA_R_First(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByA_R_First(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByA_R_First(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByA_R_Last(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByA_R_Last(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByA_R_Last(
		java.lang.String articleId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByA_R_Last(articleId, readMessage, orderByComparator);
	}

	/**
	* Returns the vcms attached messages before and after the current vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param messageId the primary key of the current vcms attached message
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage[] findByA_R_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByA_R_PrevAndNext(messageId, articleId, readMessage,
			orderByComparator);
	}

	/**
	* Removes all the vcms attached messages where articleId = &#63; and readMessage = &#63; from the database.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	*/
	public static void removeByA_R(java.lang.String articleId,
		boolean readMessage) {
		getPersistence().removeByA_R(articleId, readMessage);
	}

	/**
	* Returns the number of vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the number of matching vcms attached messages
	*/
	public static int countByA_R(java.lang.String articleId, boolean readMessage) {
		return getPersistence().countByA_R(articleId, readMessage);
	}

	/**
	* Returns all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage) {
		return getPersistence().findByG_R(groupId, readMessage);
	}

	/**
	* Returns a range of all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end) {
		return getPersistence().findByG_R(groupId, readMessage, start, end);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .findByG_R(groupId, readMessage, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_R(groupId, readMessage, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByG_R_First(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByG_R_First(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the first vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByG_R_First(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByG_R_First(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage findByG_R_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByG_R_Last(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the last vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public static VcmsAttachedMessage fetchByG_R_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence()
				   .fetchByG_R_Last(groupId, readMessage, orderByComparator);
	}

	/**
	* Returns the vcms attached messages before and after the current vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param messageId the primary key of the current vcms attached message
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage[] findByG_R_PrevAndNext(
		java.lang.String messageId, long groupId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence()
				   .findByG_R_PrevAndNext(messageId, groupId, readMessage,
			orderByComparator);
	}

	/**
	* Removes all the vcms attached messages where groupId = &#63; and readMessage = &#63; from the database.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	*/
	public static void removeByG_R(long groupId, boolean readMessage) {
		getPersistence().removeByG_R(groupId, readMessage);
	}

	/**
	* Returns the number of vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the number of matching vcms attached messages
	*/
	public static int countByG_R(long groupId, boolean readMessage) {
		return getPersistence().countByG_R(groupId, readMessage);
	}

	/**
	* Caches the vcms attached message in the entity cache if it is enabled.
	*
	* @param vcmsAttachedMessage the vcms attached message
	*/
	public static void cacheResult(VcmsAttachedMessage vcmsAttachedMessage) {
		getPersistence().cacheResult(vcmsAttachedMessage);
	}

	/**
	* Caches the vcms attached messages in the entity cache if it is enabled.
	*
	* @param vcmsAttachedMessages the vcms attached messages
	*/
	public static void cacheResult(
		List<VcmsAttachedMessage> vcmsAttachedMessages) {
		getPersistence().cacheResult(vcmsAttachedMessages);
	}

	/**
	* Creates a new vcms attached message with the primary key. Does not add the vcms attached message to the database.
	*
	* @param messageId the primary key for the new vcms attached message
	* @return the new vcms attached message
	*/
	public static VcmsAttachedMessage create(java.lang.String messageId) {
		return getPersistence().create(messageId);
	}

	/**
	* Removes the vcms attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message that was removed
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage remove(java.lang.String messageId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence().remove(messageId);
	}

	public static VcmsAttachedMessage updateImpl(
		VcmsAttachedMessage vcmsAttachedMessage) {
		return getPersistence().updateImpl(vcmsAttachedMessage);
	}

	/**
	* Returns the vcms attached message with the primary key or throws a {@link NoSuchVcmsAttachedMessageException} if it could not be found.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage findByPrimaryKey(
		java.lang.String messageId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException {
		return getPersistence().findByPrimaryKey(messageId);
	}

	/**
	* Returns the vcms attached message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message, or <code>null</code> if a vcms attached message with the primary key could not be found
	*/
	public static VcmsAttachedMessage fetchByPrimaryKey(
		java.lang.String messageId) {
		return getPersistence().fetchByPrimaryKey(messageId);
	}

	public static java.util.Map<java.io.Serializable, VcmsAttachedMessage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms attached messages.
	*
	* @return the vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findAll(int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms attached messages
	*/
	public static List<VcmsAttachedMessage> findAll(int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms attached messages from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms attached messages.
	*
	* @return the number of vcms attached messages
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsAttachedMessagePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsAttachedMessagePersistence, VcmsAttachedMessagePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsAttachedMessagePersistence.class);
}