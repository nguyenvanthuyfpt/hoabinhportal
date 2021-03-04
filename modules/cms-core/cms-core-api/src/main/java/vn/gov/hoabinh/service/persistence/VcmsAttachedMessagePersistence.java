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

import vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException;
import vn.gov.hoabinh.model.VcmsAttachedMessage;

/**
 * The persistence interface for the vcms attached message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsAttachedMessagePersistenceImpl
 * @see VcmsAttachedMessageUtil
 * @generated
 */
@ProviderType
public interface VcmsAttachedMessagePersistence extends BasePersistence<VcmsAttachedMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsAttachedMessageUtil} to access the vcms attached message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms attached messages
	*/
	public java.util.List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId);

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
	public java.util.List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end);

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
	public java.util.List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public java.util.List<VcmsAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByArticle_First(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

	/**
	* Returns the vcms attached messages before and after the current vcms attached message in the ordered set where articleId = &#63;.
	*
	* @param messageId the primary key of the current vcms attached message
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public VcmsAttachedMessage[] findByArticle_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Removes all the vcms attached messages where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms attached messages
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Returns all the vcms attached messages where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @return the matching vcms attached messages
	*/
	public java.util.List<VcmsAttachedMessage> findByUnRead(boolean readMessage);

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
	public java.util.List<VcmsAttachedMessage> findByUnRead(
		boolean readMessage, int start, int end);

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
	public java.util.List<VcmsAttachedMessage> findByUnRead(
		boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public java.util.List<VcmsAttachedMessage> findByUnRead(
		boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByUnRead_First(boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the first vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByUnRead_First(boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

	/**
	* Returns the last vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByUnRead_Last(boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the last vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByUnRead_Last(boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

	/**
	* Returns the vcms attached messages before and after the current vcms attached message in the ordered set where readMessage = &#63;.
	*
	* @param messageId the primary key of the current vcms attached message
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public VcmsAttachedMessage[] findByUnRead_PrevAndNext(
		java.lang.String messageId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Removes all the vcms attached messages where readMessage = &#63; from the database.
	*
	* @param readMessage the read message
	*/
	public void removeByUnRead(boolean readMessage);

	/**
	* Returns the number of vcms attached messages where readMessage = &#63;.
	*
	* @param readMessage the read message
	* @return the number of matching vcms attached messages
	*/
	public int countByUnRead(boolean readMessage);

	/**
	* Returns all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the matching vcms attached messages
	*/
	public java.util.List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage);

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
	public java.util.List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end);

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
	public java.util.List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public java.util.List<VcmsAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByA_R_First(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the first vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByA_R_First(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByA_R_Last(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the last vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByA_R_Last(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public VcmsAttachedMessage[] findByA_R_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Removes all the vcms attached messages where articleId = &#63; and readMessage = &#63; from the database.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	*/
	public void removeByA_R(java.lang.String articleId, boolean readMessage);

	/**
	* Returns the number of vcms attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the number of matching vcms attached messages
	*/
	public int countByA_R(java.lang.String articleId, boolean readMessage);

	/**
	* Returns all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the matching vcms attached messages
	*/
	public java.util.List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage);

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
	public java.util.List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end);

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
	public java.util.List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public java.util.List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByG_R_First(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the first vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByG_R_First(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

	/**
	* Returns the last vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage findByG_R_Last(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the last vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	*/
	public VcmsAttachedMessage fetchByG_R_Last(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public VcmsAttachedMessage[] findByG_R_PrevAndNext(
		java.lang.String messageId, long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Removes all the vcms attached messages where groupId = &#63; and readMessage = &#63; from the database.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	*/
	public void removeByG_R(long groupId, boolean readMessage);

	/**
	* Returns the number of vcms attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the number of matching vcms attached messages
	*/
	public int countByG_R(long groupId, boolean readMessage);

	/**
	* Caches the vcms attached message in the entity cache if it is enabled.
	*
	* @param vcmsAttachedMessage the vcms attached message
	*/
	public void cacheResult(VcmsAttachedMessage vcmsAttachedMessage);

	/**
	* Caches the vcms attached messages in the entity cache if it is enabled.
	*
	* @param vcmsAttachedMessages the vcms attached messages
	*/
	public void cacheResult(
		java.util.List<VcmsAttachedMessage> vcmsAttachedMessages);

	/**
	* Creates a new vcms attached message with the primary key. Does not add the vcms attached message to the database.
	*
	* @param messageId the primary key for the new vcms attached message
	* @return the new vcms attached message
	*/
	public VcmsAttachedMessage create(java.lang.String messageId);

	/**
	* Removes the vcms attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message that was removed
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public VcmsAttachedMessage remove(java.lang.String messageId)
		throws NoSuchVcmsAttachedMessageException;

	public VcmsAttachedMessage updateImpl(
		VcmsAttachedMessage vcmsAttachedMessage);

	/**
	* Returns the vcms attached message with the primary key or throws a {@link NoSuchVcmsAttachedMessageException} if it could not be found.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message
	* @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	*/
	public VcmsAttachedMessage findByPrimaryKey(java.lang.String messageId)
		throws NoSuchVcmsAttachedMessageException;

	/**
	* Returns the vcms attached message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message, or <code>null</code> if a vcms attached message with the primary key could not be found
	*/
	public VcmsAttachedMessage fetchByPrimaryKey(java.lang.String messageId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsAttachedMessage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms attached messages.
	*
	* @return the vcms attached messages
	*/
	public java.util.List<VcmsAttachedMessage> findAll();

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
	public java.util.List<VcmsAttachedMessage> findAll(int start, int end);

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
	public java.util.List<VcmsAttachedMessage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator);

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
	public java.util.List<VcmsAttachedMessage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms attached messages from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms attached messages.
	*
	* @return the number of vcms attached messages
	*/
	public int countAll();
}