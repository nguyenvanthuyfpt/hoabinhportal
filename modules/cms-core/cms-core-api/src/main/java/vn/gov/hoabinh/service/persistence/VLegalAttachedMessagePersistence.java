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

import vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException;
import vn.gov.hoabinh.model.VLegalAttachedMessage;

/**
 * The persistence interface for the v legal attached message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalAttachedMessagePersistenceImpl
 * @see VLegalAttachedMessageUtil
 * @generated
 */
@ProviderType
public interface VLegalAttachedMessagePersistence extends BasePersistence<VLegalAttachedMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalAttachedMessageUtil} to access the v legal attached message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal attached messages
	*/
	public java.util.List<VLegalAttachedMessage> findByGroupId(long groupId);

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
	public java.util.List<VLegalAttachedMessage> findByGroupId(long groupId,
		int start, int end);

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
	public java.util.List<VLegalAttachedMessage> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public java.util.List<VLegalAttachedMessage> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

	/**
	* Returns the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63;.
	*
	* @param messageId the primary key of the current v legal attached message
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public VLegalAttachedMessage[] findByGroupId_PrevAndNext(
		java.lang.String messageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Removes all the v legal attached messages where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal attached messages
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching v legal attached messages
	*/
	public java.util.List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId);

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
	public java.util.List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end);

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
	public java.util.List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public java.util.List<VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByArticle_First(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByArticle_First(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByArticle_Last(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByArticle_Last(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

	/**
	* Returns the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63;.
	*
	* @param messageId the primary key of the current v legal attached message
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public VLegalAttachedMessage[] findByArticle_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Removes all the v legal attached messages where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching v legal attached messages
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Returns all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the matching v legal attached messages
	*/
	public java.util.List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage);

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
	public java.util.List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end);

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
	public java.util.List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public java.util.List<VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByA_R_First(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByA_R_First(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByA_R_Last(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByA_R_Last(java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public VLegalAttachedMessage[] findByA_R_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Removes all the v legal attached messages where articleId = &#63; and readMessage = &#63; from the database.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	*/
	public void removeByA_R(java.lang.String articleId, boolean readMessage);

	/**
	* Returns the number of v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article ID
	* @param readMessage the read message
	* @return the number of matching v legal attached messages
	*/
	public int countByA_R(java.lang.String articleId, boolean readMessage);

	/**
	* Returns all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the matching v legal attached messages
	*/
	public java.util.List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage);

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
	public java.util.List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end);

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
	public java.util.List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public java.util.List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByStatus_First(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByStatus_First(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage findByStatus_Last(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	*/
	public VLegalAttachedMessage fetchByStatus_Last(long groupId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public VLegalAttachedMessage[] findByStatus_PrevAndNext(
		java.lang.String messageId, long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Removes all the v legal attached messages where groupId = &#63; and readMessage = &#63; from the database.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	*/
	public void removeByStatus(long groupId, boolean readMessage);

	/**
	* Returns the number of v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group ID
	* @param readMessage the read message
	* @return the number of matching v legal attached messages
	*/
	public int countByStatus(long groupId, boolean readMessage);

	/**
	* Caches the v legal attached message in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessage the v legal attached message
	*/
	public void cacheResult(VLegalAttachedMessage vLegalAttachedMessage);

	/**
	* Caches the v legal attached messages in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessages the v legal attached messages
	*/
	public void cacheResult(
		java.util.List<VLegalAttachedMessage> vLegalAttachedMessages);

	/**
	* Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	*
	* @param messageId the primary key for the new v legal attached message
	* @return the new v legal attached message
	*/
	public VLegalAttachedMessage create(java.lang.String messageId);

	/**
	* Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message that was removed
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public VLegalAttachedMessage remove(java.lang.String messageId)
		throws NoSuchVLegalAttachedMessageException;

	public VLegalAttachedMessage updateImpl(
		VLegalAttachedMessage vLegalAttachedMessage);

	/**
	* Returns the v legal attached message with the primary key or throws a {@link NoSuchVLegalAttachedMessageException} if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message
	* @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	*/
	public VLegalAttachedMessage findByPrimaryKey(java.lang.String messageId)
		throws NoSuchVLegalAttachedMessageException;

	/**
	* Returns the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	*/
	public VLegalAttachedMessage fetchByPrimaryKey(java.lang.String messageId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalAttachedMessage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal attached messages.
	*
	* @return the v legal attached messages
	*/
	public java.util.List<VLegalAttachedMessage> findAll();

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
	public java.util.List<VLegalAttachedMessage> findAll(int start, int end);

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
	public java.util.List<VLegalAttachedMessage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator);

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
	public java.util.List<VLegalAttachedMessage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal attached messages from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal attached messages.
	*
	* @return the number of v legal attached messages
	*/
	public int countAll();
}