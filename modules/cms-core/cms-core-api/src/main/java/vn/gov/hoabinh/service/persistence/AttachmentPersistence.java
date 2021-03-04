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

import vn.gov.hoabinh.exception.NoSuchAttachmentException;
import vn.gov.hoabinh.model.Attachment;

/**
 * The persistence interface for the attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.AttachmentPersistenceImpl
 * @see AttachmentUtil
 * @generated
 */
@ProviderType
public interface AttachmentPersistence extends BasePersistence<Attachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttachmentUtil} to access the attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName) throws NoSuchAttachmentException;

	/**
	* Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName);

	/**
	* Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName, boolean retrieveFromCache);

	/**
	* Removes the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the attachment that was removed
	*/
	public Attachment removeByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName) throws NoSuchAttachmentException;

	/**
	* Returns the number of attachments where entryClass = &#63; and folderId = &#63; and fileName = &#63;.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the number of matching attachments
	*/
	public int countByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName);

	/**
	* Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId) throws NoSuchAttachmentException;

	/**
	* Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId);

	/**
	* Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId, boolean retrieveFromCache);

	/**
	* Removes the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the attachment that was removed
	*/
	public Attachment removeByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId) throws NoSuchAttachmentException;

	/**
	* Returns the number of attachments where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63;.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the number of matching attachments
	*/
	public int countByC_F_F(java.lang.String entryClass, long fileEntryId,
		long folderId);

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByC_E_I(java.lang.String entryClass, long entryId,
		long imageId) throws NoSuchAttachmentException;

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_E_I(java.lang.String entryClass, long entryId,
		long imageId);

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_E_I(java.lang.String entryClass, long entryId,
		long imageId, boolean retrieveFromCache);

	/**
	* Removes the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the attachment that was removed
	*/
	public Attachment removeByC_E_I(java.lang.String entryClass, long entryId,
		long imageId) throws NoSuchAttachmentException;

	/**
	* Returns the number of attachments where entryClass = &#63; and entryId = &#63; and imageId = &#63;.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the number of matching attachments
	*/
	public int countByC_E_I(java.lang.String entryClass, long entryId,
		long imageId);

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByC_E(java.lang.String entryClass, long entryId)
		throws NoSuchAttachmentException;

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_E(java.lang.String entryClass, long entryId);

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_E(java.lang.String entryClass, long entryId,
		boolean retrieveFromCache);

	/**
	* Removes the attachment where entryClass = &#63; and entryId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the attachment that was removed
	*/
	public Attachment removeByC_E(java.lang.String entryClass, long entryId)
		throws NoSuchAttachmentException;

	/**
	* Returns the number of attachments where entryClass = &#63; and entryId = &#63;.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the number of matching attachments
	*/
	public int countByC_E(java.lang.String entryClass, long entryId);

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByC_E_F(java.lang.String entryClass, long entryId,
		long fileEntryId) throws NoSuchAttachmentException;

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_E_F(java.lang.String entryClass, long entryId,
		long fileEntryId);

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByC_E_F(java.lang.String entryClass, long entryId,
		long fileEntryId, boolean retrieveFromCache);

	/**
	* Removes the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the attachment that was removed
	*/
	public Attachment removeByC_E_F(java.lang.String entryClass, long entryId,
		long fileEntryId) throws NoSuchAttachmentException;

	/**
	* Returns the number of attachments where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63;.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the number of matching attachments
	*/
	public int countByC_E_F(java.lang.String entryClass, long entryId,
		long fileEntryId);

	/**
	* Returns all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @return the matching attachments
	*/
	public java.util.List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId);

	/**
	* Returns a range of all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @return the range of matching attachments
	*/
	public java.util.List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId, int start, int end);

	/**
	* Returns an ordered range of all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching attachments
	*/
	public java.util.List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns an ordered range of all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching attachments
	*/
	public java.util.List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByE_E_I_First(long entryId,
		java.lang.String entryClass, long imageId,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException;

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByE_E_I_First(long entryId,
		java.lang.String entryClass, long imageId,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByE_E_I_Last(long entryId,
		java.lang.String entryClass, long imageId,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException;

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByE_E_I_Last(long entryId,
		java.lang.String entryClass, long imageId,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns the attachments before and after the current attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param attachmentId the primary key of the current attachment
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next attachment
	* @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	*/
	public Attachment[] findByE_E_I_PrevAndNext(long attachmentId,
		long entryId, java.lang.String entryClass, long imageId,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException;

	/**
	* Removes all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63; from the database.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	*/
	public void removeByE_E_I(long entryId, java.lang.String entryClass,
		long imageId);

	/**
	* Returns the number of attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @return the number of matching attachments
	*/
	public int countByE_E_I(long entryId, java.lang.String entryClass,
		long imageId);

	/**
	* Returns all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @return the matching attachments
	*/
	public java.util.List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass);

	/**
	* Returns a range of all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @return the range of matching attachments
	*/
	public java.util.List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass, int start, int end);

	/**
	* Returns an ordered range of all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching attachments
	*/
	public java.util.List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns an ordered range of all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching attachments
	*/
	public java.util.List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByEntry_First(long entryId,
		java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException;

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByEntry_First(long entryId,
		java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public Attachment findByEntry_Last(long entryId,
		java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException;

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public Attachment fetchByEntry_Last(long entryId,
		java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns the attachments before and after the current attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param attachmentId the primary key of the current attachment
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next attachment
	* @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	*/
	public Attachment[] findByEntry_PrevAndNext(long attachmentId,
		long entryId, java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException;

	/**
	* Removes all the attachments where entryId = &#63; and entryClass = &#63; from the database.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	*/
	public void removeByEntry(long entryId, java.lang.String entryClass);

	/**
	* Returns the number of attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @return the number of matching attachments
	*/
	public int countByEntry(long entryId, java.lang.String entryClass);

	/**
	* Caches the attachment in the entity cache if it is enabled.
	*
	* @param attachment the attachment
	*/
	public void cacheResult(Attachment attachment);

	/**
	* Caches the attachments in the entity cache if it is enabled.
	*
	* @param attachments the attachments
	*/
	public void cacheResult(java.util.List<Attachment> attachments);

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public Attachment create(long attachmentId);

	/**
	* Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment that was removed
	* @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	*/
	public Attachment remove(long attachmentId)
		throws NoSuchAttachmentException;

	public Attachment updateImpl(Attachment attachment);

	/**
	* Returns the attachment with the primary key or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment
	* @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	*/
	public Attachment findByPrimaryKey(long attachmentId)
		throws NoSuchAttachmentException;

	/**
	* Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	*/
	public Attachment fetchByPrimaryKey(long attachmentId);

	@Override
	public java.util.Map<java.io.Serializable, Attachment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the attachments.
	*
	* @return the attachments
	*/
	public java.util.List<Attachment> findAll();

	/**
	* Returns a range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @return the range of attachments
	*/
	public java.util.List<Attachment> findAll(int start, int end);

	/**
	* Returns an ordered range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of attachments
	*/
	public java.util.List<Attachment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator);

	/**
	* Returns an ordered range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of attachments
	*/
	public java.util.List<Attachment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the attachments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of attachments.
	*
	* @return the number of attachments
	*/
	public int countAll();
}