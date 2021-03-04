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

import vn.gov.hoabinh.model.Attachment;

import java.util.List;

/**
 * The persistence utility for the attachment service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.AttachmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttachmentPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.AttachmentPersistenceImpl
 * @generated
 */
@ProviderType
public class AttachmentUtil {
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
	public static void clearCache(Attachment attachment) {
		getPersistence().clearCache(attachment);
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
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Attachment update(Attachment attachment) {
		return getPersistence().update(attachment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Attachment update(Attachment attachment,
		ServiceContext serviceContext) {
		return getPersistence().update(attachment, serviceContext);
	}

	/**
	* Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByC_F_N(java.lang.String entryClass,
		long folderId, java.lang.String fileName)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().findByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_F_N(java.lang.String entryClass,
		long folderId, java.lang.String fileName) {
		return getPersistence().fetchByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_F_N(java.lang.String entryClass,
		long folderId, java.lang.String fileName, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_F_N(entryClass, folderId, fileName,
			retrieveFromCache);
	}

	/**
	* Removes the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the attachment that was removed
	*/
	public static Attachment removeByC_F_N(java.lang.String entryClass,
		long folderId, java.lang.String fileName)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().removeByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Returns the number of attachments where entryClass = &#63; and folderId = &#63; and fileName = &#63;.
	*
	* @param entryClass the entry class
	* @param folderId the folder ID
	* @param fileName the file name
	* @return the number of matching attachments
	*/
	public static int countByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName) {
		return getPersistence().countByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().findByC_F_F(entryClass, fileEntryId, folderId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId) {
		return getPersistence().fetchByC_F_F(entryClass, fileEntryId, folderId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_F_F(entryClass, fileEntryId, folderId,
			retrieveFromCache);
	}

	/**
	* Removes the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the attachment that was removed
	*/
	public static Attachment removeByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().removeByC_F_F(entryClass, fileEntryId, folderId);
	}

	/**
	* Returns the number of attachments where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63;.
	*
	* @param entryClass the entry class
	* @param fileEntryId the file entry ID
	* @param folderId the folder ID
	* @return the number of matching attachments
	*/
	public static int countByC_F_F(java.lang.String entryClass,
		long fileEntryId, long folderId) {
		return getPersistence().countByC_F_F(entryClass, fileEntryId, folderId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByC_E_I(java.lang.String entryClass,
		long entryId, long imageId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().findByC_E_I(entryClass, entryId, imageId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_E_I(java.lang.String entryClass,
		long entryId, long imageId) {
		return getPersistence().fetchByC_E_I(entryClass, entryId, imageId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_E_I(java.lang.String entryClass,
		long entryId, long imageId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_E_I(entryClass, entryId, imageId, retrieveFromCache);
	}

	/**
	* Removes the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the attachment that was removed
	*/
	public static Attachment removeByC_E_I(java.lang.String entryClass,
		long entryId, long imageId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().removeByC_E_I(entryClass, entryId, imageId);
	}

	/**
	* Returns the number of attachments where entryClass = &#63; and entryId = &#63; and imageId = &#63;.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param imageId the image ID
	* @return the number of matching attachments
	*/
	public static int countByC_E_I(java.lang.String entryClass, long entryId,
		long imageId) {
		return getPersistence().countByC_E_I(entryClass, entryId, imageId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByC_E(java.lang.String entryClass, long entryId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().findByC_E(entryClass, entryId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_E(java.lang.String entryClass,
		long entryId) {
		return getPersistence().fetchByC_E(entryClass, entryId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_E(java.lang.String entryClass,
		long entryId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_E(entryClass, entryId, retrieveFromCache);
	}

	/**
	* Removes the attachment where entryClass = &#63; and entryId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the attachment that was removed
	*/
	public static Attachment removeByC_E(java.lang.String entryClass,
		long entryId) throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().removeByC_E(entryClass, entryId);
	}

	/**
	* Returns the number of attachments where entryClass = &#63; and entryId = &#63;.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @return the number of matching attachments
	*/
	public static int countByC_E(java.lang.String entryClass, long entryId) {
		return getPersistence().countByC_E(entryClass, entryId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByC_E_F(java.lang.String entryClass,
		long entryId, long fileEntryId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().findByC_E_F(entryClass, entryId, fileEntryId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_E_F(java.lang.String entryClass,
		long entryId, long fileEntryId) {
		return getPersistence().fetchByC_E_F(entryClass, entryId, fileEntryId);
	}

	/**
	* Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByC_E_F(java.lang.String entryClass,
		long entryId, long fileEntryId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_E_F(entryClass, entryId, fileEntryId,
			retrieveFromCache);
	}

	/**
	* Removes the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; from the database.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the attachment that was removed
	*/
	public static Attachment removeByC_E_F(java.lang.String entryClass,
		long entryId, long fileEntryId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().removeByC_E_F(entryClass, entryId, fileEntryId);
	}

	/**
	* Returns the number of attachments where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63;.
	*
	* @param entryClass the entry class
	* @param entryId the entry ID
	* @param fileEntryId the file entry ID
	* @return the number of matching attachments
	*/
	public static int countByC_E_F(java.lang.String entryClass, long entryId,
		long fileEntryId) {
		return getPersistence().countByC_E_F(entryClass, entryId, fileEntryId);
	}

	/**
	* Returns all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @return the matching attachments
	*/
	public static List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId) {
		return getPersistence().findByE_E_I(entryId, entryClass, imageId);
	}

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
	public static List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId, int start, int end) {
		return getPersistence()
				   .findByE_E_I(entryId, entryClass, imageId, start, end);
	}

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
	public static List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId, int start, int end,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .findByE_E_I(entryId, entryClass, imageId, start, end,
			orderByComparator);
	}

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
	public static List<Attachment> findByE_E_I(long entryId,
		java.lang.String entryClass, long imageId, int start, int end,
		OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByE_E_I(entryId, entryClass, imageId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static Attachment findByE_E_I_First(long entryId,
		java.lang.String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence()
				   .findByE_E_I_First(entryId, entryClass, imageId,
			orderByComparator);
	}

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByE_E_I_First(long entryId,
		java.lang.String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .fetchByE_E_I_First(entryId, entryClass, imageId,
			orderByComparator);
	}

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
	public static Attachment findByE_E_I_Last(long entryId,
		java.lang.String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence()
				   .findByE_E_I_Last(entryId, entryClass, imageId,
			orderByComparator);
	}

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByE_E_I_Last(long entryId,
		java.lang.String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .fetchByE_E_I_Last(entryId, entryClass, imageId,
			orderByComparator);
	}

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
	public static Attachment[] findByE_E_I_PrevAndNext(long attachmentId,
		long entryId, java.lang.String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence()
				   .findByE_E_I_PrevAndNext(attachmentId, entryId, entryClass,
			imageId, orderByComparator);
	}

	/**
	* Removes all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63; from the database.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	*/
	public static void removeByE_E_I(long entryId, java.lang.String entryClass,
		long imageId) {
		getPersistence().removeByE_E_I(entryId, entryClass, imageId);
	}

	/**
	* Returns the number of attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param imageId the image ID
	* @return the number of matching attachments
	*/
	public static int countByE_E_I(long entryId, java.lang.String entryClass,
		long imageId) {
		return getPersistence().countByE_E_I(entryId, entryClass, imageId);
	}

	/**
	* Returns all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @return the matching attachments
	*/
	public static List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass) {
		return getPersistence().findByEntry(entryId, entryClass);
	}

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
	public static List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass, int start, int end) {
		return getPersistence().findByEntry(entryId, entryClass, start, end);
	}

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
	public static List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass, int start, int end,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .findByEntry(entryId, entryClass, start, end,
			orderByComparator);
	}

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
	public static List<Attachment> findByEntry(long entryId,
		java.lang.String entryClass, int start, int end,
		OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEntry(entryId, entryClass, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByEntry_First(long entryId,
		java.lang.String entryClass,
		OrderByComparator<Attachment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence()
				   .findByEntry_First(entryId, entryClass, orderByComparator);
	}

	/**
	* Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByEntry_First(long entryId,
		java.lang.String entryClass,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .fetchByEntry_First(entryId, entryClass, orderByComparator);
	}

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment
	* @throws NoSuchAttachmentException if a matching attachment could not be found
	*/
	public static Attachment findByEntry_Last(long entryId,
		java.lang.String entryClass,
		OrderByComparator<Attachment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence()
				   .findByEntry_Last(entryId, entryClass, orderByComparator);
	}

	/**
	* Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	*/
	public static Attachment fetchByEntry_Last(long entryId,
		java.lang.String entryClass,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence()
				   .fetchByEntry_Last(entryId, entryClass, orderByComparator);
	}

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
	public static Attachment[] findByEntry_PrevAndNext(long attachmentId,
		long entryId, java.lang.String entryClass,
		OrderByComparator<Attachment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence()
				   .findByEntry_PrevAndNext(attachmentId, entryId, entryClass,
			orderByComparator);
	}

	/**
	* Removes all the attachments where entryId = &#63; and entryClass = &#63; from the database.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	*/
	public static void removeByEntry(long entryId, java.lang.String entryClass) {
		getPersistence().removeByEntry(entryId, entryClass);
	}

	/**
	* Returns the number of attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry ID
	* @param entryClass the entry class
	* @return the number of matching attachments
	*/
	public static int countByEntry(long entryId, java.lang.String entryClass) {
		return getPersistence().countByEntry(entryId, entryClass);
	}

	/**
	* Caches the attachment in the entity cache if it is enabled.
	*
	* @param attachment the attachment
	*/
	public static void cacheResult(Attachment attachment) {
		getPersistence().cacheResult(attachment);
	}

	/**
	* Caches the attachments in the entity cache if it is enabled.
	*
	* @param attachments the attachments
	*/
	public static void cacheResult(List<Attachment> attachments) {
		getPersistence().cacheResult(attachments);
	}

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public static Attachment create(long attachmentId) {
		return getPersistence().create(attachmentId);
	}

	/**
	* Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment that was removed
	* @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	*/
	public static Attachment remove(long attachmentId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().remove(attachmentId);
	}

	public static Attachment updateImpl(Attachment attachment) {
		return getPersistence().updateImpl(attachment);
	}

	/**
	* Returns the attachment with the primary key or throws a {@link NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment
	* @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	*/
	public static Attachment findByPrimaryKey(long attachmentId)
		throws vn.gov.hoabinh.exception.NoSuchAttachmentException {
		return getPersistence().findByPrimaryKey(attachmentId);
	}

	/**
	* Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	*/
	public static Attachment fetchByPrimaryKey(long attachmentId) {
		return getPersistence().fetchByPrimaryKey(attachmentId);
	}

	public static java.util.Map<java.io.Serializable, Attachment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the attachments.
	*
	* @return the attachments
	*/
	public static List<Attachment> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Attachment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Attachment> findAll(int start, int end,
		OrderByComparator<Attachment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Attachment> findAll(int start, int end,
		OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the attachments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of attachments.
	*
	* @return the number of attachments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttachmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AttachmentPersistence, AttachmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AttachmentPersistence.class);
}