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

package vn.gov.hoabinh.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchAttachmentException;
import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.impl.AttachmentImpl;
import vn.gov.hoabinh.model.impl.AttachmentModelImpl;
import vn.gov.hoabinh.service.persistence.AttachmentPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttachmentPersistence
 * @see vn.gov.hoabinh.service.persistence.AttachmentUtil
 * @generated
 */
@ProviderType
public class AttachmentPersistenceImpl extends BasePersistenceImpl<Attachment>
	implements AttachmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AttachmentUtil} to access the attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AttachmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_C_F_N = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_F_N",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK |
			AttachmentModelImpl.FOLDERID_COLUMN_BITMASK |
			AttachmentModelImpl.FILENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_F_N = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_F_N",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	 *
	 * @param entryClass the entry class
	 * @param folderId the folder ID
	 * @param fileName the file name
	 * @return the matching attachment
	 * @throws NoSuchAttachmentException if a matching attachment could not be found
	 */
	@Override
	public Attachment findByC_F_N(String entryClass, long folderId,
		String fileName) throws NoSuchAttachmentException {
		Attachment attachment = fetchByC_F_N(entryClass, folderId, fileName);

		if (attachment == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryClass=");
			msg.append(entryClass);

			msg.append(", folderId=");
			msg.append(folderId);

			msg.append(", fileName=");
			msg.append(fileName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAttachmentException(msg.toString());
		}

		return attachment;
	}

	/**
	 * Returns the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entryClass the entry class
	 * @param folderId the folder ID
	 * @param fileName the file name
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByC_F_N(String entryClass, long folderId,
		String fileName) {
		return fetchByC_F_N(entryClass, folderId, fileName, true);
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
	@Override
	public Attachment fetchByC_F_N(String entryClass, long folderId,
		String fileName, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { entryClass, folderId, fileName };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_F_N,
					finderArgs, this);
		}

		if (result instanceof Attachment) {
			Attachment attachment = (Attachment)result;

			if (!Objects.equals(entryClass, attachment.getEntryClass()) ||
					(folderId != attachment.getFolderId()) ||
					!Objects.equals(fileName, attachment.getFileName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_F_N_FOLDERID_2);

			boolean bindFileName = false;

			if (fileName == null) {
				query.append(_FINDER_COLUMN_C_F_N_FILENAME_1);
			}
			else if (fileName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_F_N_FILENAME_3);
			}
			else {
				bindFileName = true;

				query.append(_FINDER_COLUMN_C_F_N_FILENAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(folderId);

				if (bindFileName) {
					qPos.add(fileName);
				}

				List<Attachment> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_N,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"AttachmentPersistenceImpl.fetchByC_F_N(String, long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Attachment attachment = list.get(0);

					result = attachment;

					cacheResult(attachment);

					if ((attachment.getEntryClass() == null) ||
							!attachment.getEntryClass().equals(entryClass) ||
							(attachment.getFolderId() != folderId) ||
							(attachment.getFileName() == null) ||
							!attachment.getFileName().equals(fileName)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_N,
							finderArgs, attachment);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_F_N, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Attachment)result;
		}
	}

	/**
	 * Removes the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; from the database.
	 *
	 * @param entryClass the entry class
	 * @param folderId the folder ID
	 * @param fileName the file name
	 * @return the attachment that was removed
	 */
	@Override
	public Attachment removeByC_F_N(String entryClass, long folderId,
		String fileName) throws NoSuchAttachmentException {
		Attachment attachment = findByC_F_N(entryClass, folderId, fileName);

		return remove(attachment);
	}

	/**
	 * Returns the number of attachments where entryClass = &#63; and folderId = &#63; and fileName = &#63;.
	 *
	 * @param entryClass the entry class
	 * @param folderId the folder ID
	 * @param fileName the file name
	 * @return the number of matching attachments
	 */
	@Override
	public int countByC_F_N(String entryClass, long folderId, String fileName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_F_N;

		Object[] finderArgs = new Object[] { entryClass, folderId, fileName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_F_N_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_F_N_FOLDERID_2);

			boolean bindFileName = false;

			if (fileName == null) {
				query.append(_FINDER_COLUMN_C_F_N_FILENAME_1);
			}
			else if (fileName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_F_N_FILENAME_3);
			}
			else {
				bindFileName = true;

				query.append(_FINDER_COLUMN_C_F_N_FILENAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(folderId);

				if (bindFileName) {
					qPos.add(fileName);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_F_N_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_C_F_N_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_C_F_N_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '') AND ";
	private static final String _FINDER_COLUMN_C_F_N_FOLDERID_2 = "attachment.folderId = ? AND ";
	private static final String _FINDER_COLUMN_C_F_N_FILENAME_1 = "attachment.fileName IS NULL";
	private static final String _FINDER_COLUMN_C_F_N_FILENAME_2 = "attachment.fileName = ?";
	private static final String _FINDER_COLUMN_C_F_N_FILENAME_3 = "(attachment.fileName IS NULL OR attachment.fileName = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_F_F = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_F_F",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK |
			AttachmentModelImpl.FILEENTRYID_COLUMN_BITMASK |
			AttachmentModelImpl.FOLDERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_F_F = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_F_F",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	 *
	 * @param entryClass the entry class
	 * @param fileEntryId the file entry ID
	 * @param folderId the folder ID
	 * @return the matching attachment
	 * @throws NoSuchAttachmentException if a matching attachment could not be found
	 */
	@Override
	public Attachment findByC_F_F(String entryClass, long fileEntryId,
		long folderId) throws NoSuchAttachmentException {
		Attachment attachment = fetchByC_F_F(entryClass, fileEntryId, folderId);

		if (attachment == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryClass=");
			msg.append(entryClass);

			msg.append(", fileEntryId=");
			msg.append(fileEntryId);

			msg.append(", folderId=");
			msg.append(folderId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAttachmentException(msg.toString());
		}

		return attachment;
	}

	/**
	 * Returns the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entryClass the entry class
	 * @param fileEntryId the file entry ID
	 * @param folderId the folder ID
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByC_F_F(String entryClass, long fileEntryId,
		long folderId) {
		return fetchByC_F_F(entryClass, fileEntryId, folderId, true);
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
	@Override
	public Attachment fetchByC_F_F(String entryClass, long fileEntryId,
		long folderId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { entryClass, fileEntryId, folderId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_F_F,
					finderArgs, this);
		}

		if (result instanceof Attachment) {
			Attachment attachment = (Attachment)result;

			if (!Objects.equals(entryClass, attachment.getEntryClass()) ||
					(fileEntryId != attachment.getFileEntryId()) ||
					(folderId != attachment.getFolderId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_F_F_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_F_F_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_F_F_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_F_F_FILEENTRYID_2);

			query.append(_FINDER_COLUMN_C_F_F_FOLDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(fileEntryId);

				qPos.add(folderId);

				List<Attachment> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_F,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"AttachmentPersistenceImpl.fetchByC_F_F(String, long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Attachment attachment = list.get(0);

					result = attachment;

					cacheResult(attachment);

					if ((attachment.getEntryClass() == null) ||
							!attachment.getEntryClass().equals(entryClass) ||
							(attachment.getFileEntryId() != fileEntryId) ||
							(attachment.getFolderId() != folderId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_F,
							finderArgs, attachment);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_F_F, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Attachment)result;
		}
	}

	/**
	 * Removes the attachment where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63; from the database.
	 *
	 * @param entryClass the entry class
	 * @param fileEntryId the file entry ID
	 * @param folderId the folder ID
	 * @return the attachment that was removed
	 */
	@Override
	public Attachment removeByC_F_F(String entryClass, long fileEntryId,
		long folderId) throws NoSuchAttachmentException {
		Attachment attachment = findByC_F_F(entryClass, fileEntryId, folderId);

		return remove(attachment);
	}

	/**
	 * Returns the number of attachments where entryClass = &#63; and fileEntryId = &#63; and folderId = &#63;.
	 *
	 * @param entryClass the entry class
	 * @param fileEntryId the file entry ID
	 * @param folderId the folder ID
	 * @return the number of matching attachments
	 */
	@Override
	public int countByC_F_F(String entryClass, long fileEntryId, long folderId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_F_F;

		Object[] finderArgs = new Object[] { entryClass, fileEntryId, folderId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_F_F_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_F_F_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_F_F_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_F_F_FILEENTRYID_2);

			query.append(_FINDER_COLUMN_C_F_F_FOLDERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(fileEntryId);

				qPos.add(folderId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_F_F_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_C_F_F_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_C_F_F_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '') AND ";
	private static final String _FINDER_COLUMN_C_F_F_FILEENTRYID_2 = "attachment.fileEntryId = ? AND ";
	private static final String _FINDER_COLUMN_C_F_F_FOLDERID_2 = "attachment.folderId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_E_I = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_E_I",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK |
			AttachmentModelImpl.ENTRYID_COLUMN_BITMASK |
			AttachmentModelImpl.IMAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_E_I = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_E_I",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param imageId the image ID
	 * @return the matching attachment
	 * @throws NoSuchAttachmentException if a matching attachment could not be found
	 */
	@Override
	public Attachment findByC_E_I(String entryClass, long entryId, long imageId)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByC_E_I(entryClass, entryId, imageId);

		if (attachment == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryClass=");
			msg.append(entryClass);

			msg.append(", entryId=");
			msg.append(entryId);

			msg.append(", imageId=");
			msg.append(imageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAttachmentException(msg.toString());
		}

		return attachment;
	}

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param imageId the image ID
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByC_E_I(String entryClass, long entryId, long imageId) {
		return fetchByC_E_I(entryClass, entryId, imageId, true);
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
	@Override
	public Attachment fetchByC_E_I(String entryClass, long entryId,
		long imageId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { entryClass, entryId, imageId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_E_I,
					finderArgs, this);
		}

		if (result instanceof Attachment) {
			Attachment attachment = (Attachment)result;

			if (!Objects.equals(entryClass, attachment.getEntryClass()) ||
					(entryId != attachment.getEntryId()) ||
					(imageId != attachment.getImageId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_E_I_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_E_I_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_E_I_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_E_I_ENTRYID_2);

			query.append(_FINDER_COLUMN_C_E_I_IMAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(entryId);

				qPos.add(imageId);

				List<Attachment> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_I,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"AttachmentPersistenceImpl.fetchByC_E_I(String, long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Attachment attachment = list.get(0);

					result = attachment;

					cacheResult(attachment);

					if ((attachment.getEntryClass() == null) ||
							!attachment.getEntryClass().equals(entryClass) ||
							(attachment.getEntryId() != entryId) ||
							(attachment.getImageId() != imageId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_I,
							finderArgs, attachment);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E_I, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Attachment)result;
		}
	}

	/**
	 * Removes the attachment where entryClass = &#63; and entryId = &#63; and imageId = &#63; from the database.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param imageId the image ID
	 * @return the attachment that was removed
	 */
	@Override
	public Attachment removeByC_E_I(String entryClass, long entryId,
		long imageId) throws NoSuchAttachmentException {
		Attachment attachment = findByC_E_I(entryClass, entryId, imageId);

		return remove(attachment);
	}

	/**
	 * Returns the number of attachments where entryClass = &#63; and entryId = &#63; and imageId = &#63;.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param imageId the image ID
	 * @return the number of matching attachments
	 */
	@Override
	public int countByC_E_I(String entryClass, long entryId, long imageId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_E_I;

		Object[] finderArgs = new Object[] { entryClass, entryId, imageId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_E_I_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_E_I_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_E_I_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_E_I_ENTRYID_2);

			query.append(_FINDER_COLUMN_C_E_I_IMAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(entryId);

				qPos.add(imageId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_E_I_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_C_E_I_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_C_E_I_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '') AND ";
	private static final String _FINDER_COLUMN_C_E_I_ENTRYID_2 = "attachment.entryId = ? AND ";
	private static final String _FINDER_COLUMN_C_E_I_IMAGEID_2 = "attachment.imageId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_E = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_E",
			new String[] { String.class.getName(), Long.class.getName() },
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK |
			AttachmentModelImpl.ENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_E = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_E",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @return the matching attachment
	 * @throws NoSuchAttachmentException if a matching attachment could not be found
	 */
	@Override
	public Attachment findByC_E(String entryClass, long entryId)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByC_E(entryClass, entryId);

		if (attachment == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryClass=");
			msg.append(entryClass);

			msg.append(", entryId=");
			msg.append(entryId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAttachmentException(msg.toString());
		}

		return attachment;
	}

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByC_E(String entryClass, long entryId) {
		return fetchByC_E(entryClass, entryId, true);
	}

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByC_E(String entryClass, long entryId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { entryClass, entryId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_E,
					finderArgs, this);
		}

		if (result instanceof Attachment) {
			Attachment attachment = (Attachment)result;

			if (!Objects.equals(entryClass, attachment.getEntryClass()) ||
					(entryId != attachment.getEntryId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_E_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_E_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_E_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_E_ENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(entryId);

				List<Attachment> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_E, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"AttachmentPersistenceImpl.fetchByC_E(String, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Attachment attachment = list.get(0);

					result = attachment;

					cacheResult(attachment);

					if ((attachment.getEntryClass() == null) ||
							!attachment.getEntryClass().equals(entryClass) ||
							(attachment.getEntryId() != entryId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_E,
							finderArgs, attachment);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Attachment)result;
		}
	}

	/**
	 * Removes the attachment where entryClass = &#63; and entryId = &#63; from the database.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @return the attachment that was removed
	 */
	@Override
	public Attachment removeByC_E(String entryClass, long entryId)
		throws NoSuchAttachmentException {
		Attachment attachment = findByC_E(entryClass, entryId);

		return remove(attachment);
	}

	/**
	 * Returns the number of attachments where entryClass = &#63; and entryId = &#63;.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @return the number of matching attachments
	 */
	@Override
	public int countByC_E(String entryClass, long entryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_E;

		Object[] finderArgs = new Object[] { entryClass, entryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_E_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_E_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_E_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_E_ENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(entryId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_E_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_C_E_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_C_E_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '') AND ";
	private static final String _FINDER_COLUMN_C_E_ENTRYID_2 = "attachment.entryId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_E_F = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_E_F",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK |
			AttachmentModelImpl.ENTRYID_COLUMN_BITMASK |
			AttachmentModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_E_F = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_E_F",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or throws a {@link NoSuchAttachmentException} if it could not be found.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param fileEntryId the file entry ID
	 * @return the matching attachment
	 * @throws NoSuchAttachmentException if a matching attachment could not be found
	 */
	@Override
	public Attachment findByC_E_F(String entryClass, long entryId,
		long fileEntryId) throws NoSuchAttachmentException {
		Attachment attachment = fetchByC_E_F(entryClass, entryId, fileEntryId);

		if (attachment == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("entryClass=");
			msg.append(entryClass);

			msg.append(", entryId=");
			msg.append(entryId);

			msg.append(", fileEntryId=");
			msg.append(fileEntryId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAttachmentException(msg.toString());
		}

		return attachment;
	}

	/**
	 * Returns the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param fileEntryId the file entry ID
	 * @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByC_E_F(String entryClass, long entryId,
		long fileEntryId) {
		return fetchByC_E_F(entryClass, entryId, fileEntryId, true);
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
	@Override
	public Attachment fetchByC_E_F(String entryClass, long entryId,
		long fileEntryId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { entryClass, entryId, fileEntryId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_E_F,
					finderArgs, this);
		}

		if (result instanceof Attachment) {
			Attachment attachment = (Attachment)result;

			if (!Objects.equals(entryClass, attachment.getEntryClass()) ||
					(entryId != attachment.getEntryId()) ||
					(fileEntryId != attachment.getFileEntryId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_E_F_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_E_F_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_E_F_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_E_F_ENTRYID_2);

			query.append(_FINDER_COLUMN_C_E_F_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(entryId);

				qPos.add(fileEntryId);

				List<Attachment> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_F,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"AttachmentPersistenceImpl.fetchByC_E_F(String, long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Attachment attachment = list.get(0);

					result = attachment;

					cacheResult(attachment);

					if ((attachment.getEntryClass() == null) ||
							!attachment.getEntryClass().equals(entryClass) ||
							(attachment.getEntryId() != entryId) ||
							(attachment.getFileEntryId() != fileEntryId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_F,
							finderArgs, attachment);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E_F, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Attachment)result;
		}
	}

	/**
	 * Removes the attachment where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63; from the database.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param fileEntryId the file entry ID
	 * @return the attachment that was removed
	 */
	@Override
	public Attachment removeByC_E_F(String entryClass, long entryId,
		long fileEntryId) throws NoSuchAttachmentException {
		Attachment attachment = findByC_E_F(entryClass, entryId, fileEntryId);

		return remove(attachment);
	}

	/**
	 * Returns the number of attachments where entryClass = &#63; and entryId = &#63; and fileEntryId = &#63;.
	 *
	 * @param entryClass the entry class
	 * @param entryId the entry ID
	 * @param fileEntryId the file entry ID
	 * @return the number of matching attachments
	 */
	@Override
	public int countByC_E_F(String entryClass, long entryId, long fileEntryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_E_F;

		Object[] finderArgs = new Object[] { entryClass, entryId, fileEntryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_C_E_F_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_E_F_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_C_E_F_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_C_E_F_ENTRYID_2);

			query.append(_FINDER_COLUMN_C_E_F_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(entryId);

				qPos.add(fileEntryId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_E_F_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_C_E_F_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_C_E_F_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '') AND ";
	private static final String _FINDER_COLUMN_C_E_F_ENTRYID_2 = "attachment.entryId = ? AND ";
	private static final String _FINDER_COLUMN_C_E_F_FILEENTRYID_2 = "attachment.fileEntryId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_E_E_I = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByE_E_I",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_E_I = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByE_E_I",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			AttachmentModelImpl.ENTRYID_COLUMN_BITMASK |
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK |
			AttachmentModelImpl.IMAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_E_E_I = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByE_E_I",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @param imageId the image ID
	 * @return the matching attachments
	 */
	@Override
	public List<Attachment> findByE_E_I(long entryId, String entryClass,
		long imageId) {
		return findByE_E_I(entryId, entryClass, imageId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Attachment> findByE_E_I(long entryId, String entryClass,
		long imageId, int start, int end) {
		return findByE_E_I(entryId, entryClass, imageId, start, end, null);
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
	@Override
	public List<Attachment> findByE_E_I(long entryId, String entryClass,
		long imageId, int start, int end,
		OrderByComparator<Attachment> orderByComparator) {
		return findByE_E_I(entryId, entryClass, imageId, start, end,
			orderByComparator, true);
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
	@Override
	public List<Attachment> findByE_E_I(long entryId, String entryClass,
		long imageId, int start, int end,
		OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_E_I;
			finderArgs = new Object[] { entryId, entryClass, imageId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_E_E_I;
			finderArgs = new Object[] {
					entryId, entryClass, imageId,
					
					start, end, orderByComparator
				};
		}

		List<Attachment> list = null;

		if (retrieveFromCache) {
			list = (List<Attachment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Attachment attachment : list) {
					if ((entryId != attachment.getEntryId()) ||
							!Objects.equals(entryClass,
								attachment.getEntryClass()) ||
							(imageId != attachment.getImageId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_E_E_I_ENTRYID_2);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_E_E_I_IMAGEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AttachmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(entryId);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(imageId);

				if (!pagination) {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Attachment findByE_E_I_First(long entryId, String entryClass,
		long imageId, OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByE_E_I_First(entryId, entryClass,
				imageId, orderByComparator);

		if (attachment != null) {
			return attachment;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("entryId=");
		msg.append(entryId);

		msg.append(", entryClass=");
		msg.append(entryClass);

		msg.append(", imageId=");
		msg.append(imageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAttachmentException(msg.toString());
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
	@Override
	public Attachment fetchByE_E_I_First(long entryId, String entryClass,
		long imageId, OrderByComparator<Attachment> orderByComparator) {
		List<Attachment> list = findByE_E_I(entryId, entryClass, imageId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Attachment findByE_E_I_Last(long entryId, String entryClass,
		long imageId, OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByE_E_I_Last(entryId, entryClass, imageId,
				orderByComparator);

		if (attachment != null) {
			return attachment;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("entryId=");
		msg.append(entryId);

		msg.append(", entryClass=");
		msg.append(entryClass);

		msg.append(", imageId=");
		msg.append(imageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAttachmentException(msg.toString());
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
	@Override
	public Attachment fetchByE_E_I_Last(long entryId, String entryClass,
		long imageId, OrderByComparator<Attachment> orderByComparator) {
		int count = countByE_E_I(entryId, entryClass, imageId);

		if (count == 0) {
			return null;
		}

		List<Attachment> list = findByE_E_I(entryId, entryClass, imageId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Attachment[] findByE_E_I_PrevAndNext(long attachmentId,
		long entryId, String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException {
		Attachment attachment = findByPrimaryKey(attachmentId);

		Session session = null;

		try {
			session = openSession();

			Attachment[] array = new AttachmentImpl[3];

			array[0] = getByE_E_I_PrevAndNext(session, attachment, entryId,
					entryClass, imageId, orderByComparator, true);

			array[1] = attachment;

			array[2] = getByE_E_I_PrevAndNext(session, attachment, entryId,
					entryClass, imageId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Attachment getByE_E_I_PrevAndNext(Session session,
		Attachment attachment, long entryId, String entryClass, long imageId,
		OrderByComparator<Attachment> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_ATTACHMENT_WHERE);

		query.append(_FINDER_COLUMN_E_E_I_ENTRYID_2);

		boolean bindEntryClass = false;

		if (entryClass == null) {
			query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_1);
		}
		else if (entryClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_3);
		}
		else {
			bindEntryClass = true;

			query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_2);
		}

		query.append(_FINDER_COLUMN_E_E_I_IMAGEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AttachmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(entryId);

		if (bindEntryClass) {
			qPos.add(entryClass);
		}

		qPos.add(imageId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(attachment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Attachment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63; from the database.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @param imageId the image ID
	 */
	@Override
	public void removeByE_E_I(long entryId, String entryClass, long imageId) {
		for (Attachment attachment : findByE_E_I(entryId, entryClass, imageId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(attachment);
		}
	}

	/**
	 * Returns the number of attachments where entryId = &#63; and entryClass = &#63; and imageId = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @param imageId the image ID
	 * @return the number of matching attachments
	 */
	@Override
	public int countByE_E_I(long entryId, String entryClass, long imageId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_E_E_I;

		Object[] finderArgs = new Object[] { entryId, entryClass, imageId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_E_E_I_ENTRYID_2);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_E_E_I_ENTRYCLASS_2);
			}

			query.append(_FINDER_COLUMN_E_E_I_IMAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(entryId);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				qPos.add(imageId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_E_E_I_ENTRYID_2 = "attachment.entryId = ? AND ";
	private static final String _FINDER_COLUMN_E_E_I_ENTRYCLASS_1 = "attachment.entryClass IS NULL AND ";
	private static final String _FINDER_COLUMN_E_E_I_ENTRYCLASS_2 = "attachment.entryClass = ? AND ";
	private static final String _FINDER_COLUMN_E_E_I_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '') AND ";
	private static final String _FINDER_COLUMN_E_E_I_IMAGEID_2 = "attachment.imageId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTRY = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEntry",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEntry",
			new String[] { Long.class.getName(), String.class.getName() },
			AttachmentModelImpl.ENTRYID_COLUMN_BITMASK |
			AttachmentModelImpl.ENTRYCLASS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ENTRY = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEntry",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the attachments where entryId = &#63; and entryClass = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @return the matching attachments
	 */
	@Override
	public List<Attachment> findByEntry(long entryId, String entryClass) {
		return findByEntry(entryId, entryClass, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Attachment> findByEntry(long entryId, String entryClass,
		int start, int end) {
		return findByEntry(entryId, entryClass, start, end, null);
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
	@Override
	public List<Attachment> findByEntry(long entryId, String entryClass,
		int start, int end, OrderByComparator<Attachment> orderByComparator) {
		return findByEntry(entryId, entryClass, start, end, orderByComparator,
			true);
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
	@Override
	public List<Attachment> findByEntry(long entryId, String entryClass,
		int start, int end, OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY;
			finderArgs = new Object[] { entryId, entryClass };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ENTRY;
			finderArgs = new Object[] {
					entryId, entryClass,
					
					start, end, orderByComparator
				};
		}

		List<Attachment> list = null;

		if (retrieveFromCache) {
			list = (List<Attachment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Attachment attachment : list) {
					if ((entryId != attachment.getEntryId()) ||
							!Objects.equals(entryClass,
								attachment.getEntryClass())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_ENTRYID_2);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AttachmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(entryId);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				if (!pagination) {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Attachment findByEntry_First(long entryId, String entryClass,
		OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByEntry_First(entryId, entryClass,
				orderByComparator);

		if (attachment != null) {
			return attachment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("entryId=");
		msg.append(entryId);

		msg.append(", entryClass=");
		msg.append(entryClass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAttachmentException(msg.toString());
	}

	/**
	 * Returns the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByEntry_First(long entryId, String entryClass,
		OrderByComparator<Attachment> orderByComparator) {
		List<Attachment> list = findByEntry(entryId, entryClass, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Attachment findByEntry_Last(long entryId, String entryClass,
		OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByEntry_Last(entryId, entryClass,
				orderByComparator);

		if (attachment != null) {
			return attachment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("entryId=");
		msg.append(entryId);

		msg.append(", entryClass=");
		msg.append(entryClass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAttachmentException(msg.toString());
	}

	/**
	 * Returns the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	 */
	@Override
	public Attachment fetchByEntry_Last(long entryId, String entryClass,
		OrderByComparator<Attachment> orderByComparator) {
		int count = countByEntry(entryId, entryClass);

		if (count == 0) {
			return null;
		}

		List<Attachment> list = findByEntry(entryId, entryClass, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Attachment[] findByEntry_PrevAndNext(long attachmentId,
		long entryId, String entryClass,
		OrderByComparator<Attachment> orderByComparator)
		throws NoSuchAttachmentException {
		Attachment attachment = findByPrimaryKey(attachmentId);

		Session session = null;

		try {
			session = openSession();

			Attachment[] array = new AttachmentImpl[3];

			array[0] = getByEntry_PrevAndNext(session, attachment, entryId,
					entryClass, orderByComparator, true);

			array[1] = attachment;

			array[2] = getByEntry_PrevAndNext(session, attachment, entryId,
					entryClass, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Attachment getByEntry_PrevAndNext(Session session,
		Attachment attachment, long entryId, String entryClass,
		OrderByComparator<Attachment> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ATTACHMENT_WHERE);

		query.append(_FINDER_COLUMN_ENTRY_ENTRYID_2);

		boolean bindEntryClass = false;

		if (entryClass == null) {
			query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_1);
		}
		else if (entryClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_3);
		}
		else {
			bindEntryClass = true;

			query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AttachmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(entryId);

		if (bindEntryClass) {
			qPos.add(entryClass);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(attachment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Attachment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the attachments where entryId = &#63; and entryClass = &#63; from the database.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 */
	@Override
	public void removeByEntry(long entryId, String entryClass) {
		for (Attachment attachment : findByEntry(entryId, entryClass,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(attachment);
		}
	}

	/**
	 * Returns the number of attachments where entryId = &#63; and entryClass = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param entryClass the entry class
	 * @return the number of matching attachments
	 */
	@Override
	public int countByEntry(long entryId, String entryClass) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ENTRY;

		Object[] finderArgs = new Object[] { entryId, entryClass };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_ENTRY_ENTRYID_2);

			boolean bindEntryClass = false;

			if (entryClass == null) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_1);
			}
			else if (entryClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_3);
			}
			else {
				bindEntryClass = true;

				query.append(_FINDER_COLUMN_ENTRY_ENTRYCLASS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(entryId);

				if (bindEntryClass) {
					qPos.add(entryClass);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ENTRY_ENTRYID_2 = "attachment.entryId = ? AND ";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYCLASS_1 = "attachment.entryClass IS NULL";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYCLASS_2 = "attachment.entryClass = ?";
	private static final String _FINDER_COLUMN_ENTRY_ENTRYCLASS_3 = "(attachment.entryClass IS NULL OR attachment.entryClass = '')";

	public AttachmentPersistenceImpl() {
		setModelClass(Attachment.class);
	}

	/**
	 * Caches the attachment in the entity cache if it is enabled.
	 *
	 * @param attachment the attachment
	 */
	@Override
	public void cacheResult(Attachment attachment) {
		entityCache.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey(), attachment);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_N,
			new Object[] {
				attachment.getEntryClass(), attachment.getFolderId(),
				attachment.getFileName()
			}, attachment);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_F,
			new Object[] {
				attachment.getEntryClass(), attachment.getFileEntryId(),
				attachment.getFolderId()
			}, attachment);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_I,
			new Object[] {
				attachment.getEntryClass(), attachment.getEntryId(),
				attachment.getImageId()
			}, attachment);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_E,
			new Object[] { attachment.getEntryClass(), attachment.getEntryId() },
			attachment);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_F,
			new Object[] {
				attachment.getEntryClass(), attachment.getEntryId(),
				attachment.getFileEntryId()
			}, attachment);

		attachment.resetOriginalValues();
	}

	/**
	 * Caches the attachments in the entity cache if it is enabled.
	 *
	 * @param attachments the attachments
	 */
	@Override
	public void cacheResult(List<Attachment> attachments) {
		for (Attachment attachment : attachments) {
			if (entityCache.getResult(
						AttachmentModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentImpl.class, attachment.getPrimaryKey()) == null) {
				cacheResult(attachment);
			}
			else {
				attachment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all attachments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttachmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the attachment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Attachment attachment) {
		entityCache.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((AttachmentModelImpl)attachment);
	}

	@Override
	public void clearCache(List<Attachment> attachments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Attachment attachment : attachments) {
			entityCache.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentImpl.class, attachment.getPrimaryKey());

			clearUniqueFindersCache((AttachmentModelImpl)attachment);
		}
	}

	protected void cacheUniqueFindersCache(
		AttachmentModelImpl attachmentModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					attachmentModelImpl.getEntryClass(),
					attachmentModelImpl.getFolderId(),
					attachmentModelImpl.getFileName()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_F_N, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_N, args,
				attachmentModelImpl);

			args = new Object[] {
					attachmentModelImpl.getEntryClass(),
					attachmentModelImpl.getFileEntryId(),
					attachmentModelImpl.getFolderId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_F_F, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_F, args,
				attachmentModelImpl);

			args = new Object[] {
					attachmentModelImpl.getEntryClass(),
					attachmentModelImpl.getEntryId(),
					attachmentModelImpl.getImageId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_E_I, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_I, args,
				attachmentModelImpl);

			args = new Object[] {
					attachmentModelImpl.getEntryClass(),
					attachmentModelImpl.getEntryId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_E, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_E, args,
				attachmentModelImpl);

			args = new Object[] {
					attachmentModelImpl.getEntryClass(),
					attachmentModelImpl.getEntryId(),
					attachmentModelImpl.getFileEntryId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_E_F, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_F, args,
				attachmentModelImpl);
		}
		else {
			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_F_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getEntryClass(),
						attachmentModelImpl.getFolderId(),
						attachmentModelImpl.getFileName()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_F_N, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_N, args,
					attachmentModelImpl);
			}

			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_F_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getEntryClass(),
						attachmentModelImpl.getFileEntryId(),
						attachmentModelImpl.getFolderId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_F_F, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_F_F, args,
					attachmentModelImpl);
			}

			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_E_I.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getEntryClass(),
						attachmentModelImpl.getEntryId(),
						attachmentModelImpl.getImageId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_E_I, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_I, args,
					attachmentModelImpl);
			}

			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_E.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getEntryClass(),
						attachmentModelImpl.getEntryId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_E, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_E, args,
					attachmentModelImpl);
			}

			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_E_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getEntryClass(),
						attachmentModelImpl.getEntryId(),
						attachmentModelImpl.getFileEntryId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_E_F, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_E_F, args,
					attachmentModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		AttachmentModelImpl attachmentModelImpl) {
		Object[] args = new Object[] {
				attachmentModelImpl.getEntryClass(),
				attachmentModelImpl.getFolderId(),
				attachmentModelImpl.getFileName()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_F_N, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_F_N, args);

		if ((attachmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_F_N.getColumnBitmask()) != 0) {
			args = new Object[] {
					attachmentModelImpl.getOriginalEntryClass(),
					attachmentModelImpl.getOriginalFolderId(),
					attachmentModelImpl.getOriginalFileName()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_F_N, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_F_N, args);
		}

		args = new Object[] {
				attachmentModelImpl.getEntryClass(),
				attachmentModelImpl.getFileEntryId(),
				attachmentModelImpl.getFolderId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_F_F, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_F_F, args);

		if ((attachmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_F_F.getColumnBitmask()) != 0) {
			args = new Object[] {
					attachmentModelImpl.getOriginalEntryClass(),
					attachmentModelImpl.getOriginalFileEntryId(),
					attachmentModelImpl.getOriginalFolderId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_F_F, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_F_F, args);
		}

		args = new Object[] {
				attachmentModelImpl.getEntryClass(),
				attachmentModelImpl.getEntryId(),
				attachmentModelImpl.getImageId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_E_I, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E_I, args);

		if ((attachmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_E_I.getColumnBitmask()) != 0) {
			args = new Object[] {
					attachmentModelImpl.getOriginalEntryClass(),
					attachmentModelImpl.getOriginalEntryId(),
					attachmentModelImpl.getOriginalImageId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_E_I, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E_I, args);
		}

		args = new Object[] {
				attachmentModelImpl.getEntryClass(),
				attachmentModelImpl.getEntryId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_E, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E, args);

		if ((attachmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_E.getColumnBitmask()) != 0) {
			args = new Object[] {
					attachmentModelImpl.getOriginalEntryClass(),
					attachmentModelImpl.getOriginalEntryId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_E, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E, args);
		}

		args = new Object[] {
				attachmentModelImpl.getEntryClass(),
				attachmentModelImpl.getEntryId(),
				attachmentModelImpl.getFileEntryId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_E_F, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E_F, args);

		if ((attachmentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_E_F.getColumnBitmask()) != 0) {
			args = new Object[] {
					attachmentModelImpl.getOriginalEntryClass(),
					attachmentModelImpl.getOriginalEntryId(),
					attachmentModelImpl.getOriginalFileEntryId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_E_F, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_E_F, args);
		}
	}

	/**
	 * Creates a new attachment with the primary key. Does not add the attachment to the database.
	 *
	 * @param attachmentId the primary key for the new attachment
	 * @return the new attachment
	 */
	@Override
	public Attachment create(long attachmentId) {
		Attachment attachment = new AttachmentImpl();

		attachment.setNew(true);
		attachment.setPrimaryKey(attachmentId);

		attachment.setCompanyId(companyProvider.getCompanyId());

		return attachment;
	}

	/**
	 * Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentId the primary key of the attachment
	 * @return the attachment that was removed
	 * @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	 */
	@Override
	public Attachment remove(long attachmentId)
		throws NoSuchAttachmentException {
		return remove((Serializable)attachmentId);
	}

	/**
	 * Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attachment
	 * @return the attachment that was removed
	 * @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	 */
	@Override
	public Attachment remove(Serializable primaryKey)
		throws NoSuchAttachmentException {
		Session session = null;

		try {
			session = openSession();

			Attachment attachment = (Attachment)session.get(AttachmentImpl.class,
					primaryKey);

			if (attachment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(attachment);
		}
		catch (NoSuchAttachmentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Attachment removeImpl(Attachment attachment) {
		attachment = toUnwrappedModel(attachment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attachment)) {
				attachment = (Attachment)session.get(AttachmentImpl.class,
						attachment.getPrimaryKeyObj());
			}

			if (attachment != null) {
				session.delete(attachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (attachment != null) {
			clearCache(attachment);
		}

		return attachment;
	}

	@Override
	public Attachment updateImpl(Attachment attachment) {
		attachment = toUnwrappedModel(attachment);

		boolean isNew = attachment.isNew();

		AttachmentModelImpl attachmentModelImpl = (AttachmentModelImpl)attachment;

		Session session = null;

		try {
			session = openSession();

			if (attachment.isNew()) {
				session.save(attachment);

				attachment.setNew(false);
			}
			else {
				attachment = (Attachment)session.merge(attachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AttachmentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_E_I.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getOriginalEntryId(),
						attachmentModelImpl.getOriginalEntryClass(),
						attachmentModelImpl.getOriginalImageId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_E_E_I, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_E_I,
					args);

				args = new Object[] {
						attachmentModelImpl.getEntryId(),
						attachmentModelImpl.getEntryClass(),
						attachmentModelImpl.getImageId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_E_E_I, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_E_I,
					args);
			}

			if ((attachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						attachmentModelImpl.getOriginalEntryId(),
						attachmentModelImpl.getOriginalEntryClass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ENTRY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY,
					args);

				args = new Object[] {
						attachmentModelImpl.getEntryId(),
						attachmentModelImpl.getEntryClass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ENTRY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ENTRY,
					args);
			}
		}

		entityCache.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey(), attachment, false);

		clearUniqueFindersCache(attachmentModelImpl);
		cacheUniqueFindersCache(attachmentModelImpl, isNew);

		attachment.resetOriginalValues();

		return attachment;
	}

	protected Attachment toUnwrappedModel(Attachment attachment) {
		if (attachment instanceof AttachmentImpl) {
			return attachment;
		}

		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setNew(attachment.isNew());
		attachmentImpl.setPrimaryKey(attachment.getPrimaryKey());

		attachmentImpl.setAttachmentId(attachment.getAttachmentId());
		attachmentImpl.setGroupId(attachment.getGroupId());
		attachmentImpl.setCompanyId(attachment.getCompanyId());
		attachmentImpl.setEntryId(attachment.getEntryId());
		attachmentImpl.setEntryClass(attachment.getEntryClass());
		attachmentImpl.setFileEntryId(attachment.getFileEntryId());
		attachmentImpl.setFolderId(attachment.getFolderId());
		attachmentImpl.setFileName(attachment.getFileName());
		attachmentImpl.setImageId(attachment.getImageId());
		attachmentImpl.setExtension(attachment.getExtension());

		return attachmentImpl;
	}

	/**
	 * Returns the attachment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment
	 * @return the attachment
	 * @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	 */
	@Override
	public Attachment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttachmentException {
		Attachment attachment = fetchByPrimaryKey(primaryKey);

		if (attachment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return attachment;
	}

	/**
	 * Returns the attachment with the primary key or throws a {@link NoSuchAttachmentException} if it could not be found.
	 *
	 * @param attachmentId the primary key of the attachment
	 * @return the attachment
	 * @throws NoSuchAttachmentException if a attachment with the primary key could not be found
	 */
	@Override
	public Attachment findByPrimaryKey(long attachmentId)
		throws NoSuchAttachmentException {
		return findByPrimaryKey((Serializable)attachmentId);
	}

	/**
	 * Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment
	 * @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	 */
	@Override
	public Attachment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Attachment attachment = (Attachment)serializable;

		if (attachment == null) {
			Session session = null;

			try {
				session = openSession();

				attachment = (Attachment)session.get(AttachmentImpl.class,
						primaryKey);

				if (attachment != null) {
					cacheResult(attachment);
				}
				else {
					entityCache.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
					AttachmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return attachment;
	}

	/**
	 * Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attachmentId the primary key of the attachment
	 * @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	 */
	@Override
	public Attachment fetchByPrimaryKey(long attachmentId) {
		return fetchByPrimaryKey((Serializable)attachmentId);
	}

	@Override
	public Map<Serializable, Attachment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Attachment> map = new HashMap<Serializable, Attachment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Attachment attachment = fetchByPrimaryKey(primaryKey);

			if (attachment != null) {
				map.put(primaryKey, attachment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
					AttachmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Attachment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ATTACHMENT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Attachment attachment : (List<Attachment>)q.list()) {
				map.put(attachment.getPrimaryKeyObj(), attachment);

				cacheResult(attachment);

				uncachedPrimaryKeys.remove(attachment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
					AttachmentImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the attachments.
	 *
	 * @return the attachments
	 */
	@Override
	public List<Attachment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Attachment> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Attachment> findAll(int start, int end,
		OrderByComparator<Attachment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Attachment> findAll(int start, int end,
		OrderByComparator<Attachment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Attachment> list = null;

		if (retrieveFromCache) {
			list = (List<Attachment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ATTACHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ATTACHMENT;

				if (pagination) {
					sql = sql.concat(AttachmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the attachments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Attachment attachment : findAll()) {
			remove(attachment);
		}
	}

	/**
	 * Returns the number of attachments.
	 *
	 * @return the number of attachments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ATTACHMENT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttachmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attachment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AttachmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ATTACHMENT = "SELECT attachment FROM Attachment attachment";
	private static final String _SQL_SELECT_ATTACHMENT_WHERE_PKS_IN = "SELECT attachment FROM Attachment attachment WHERE attachmentId IN (";
	private static final String _SQL_SELECT_ATTACHMENT_WHERE = "SELECT attachment FROM Attachment attachment WHERE ";
	private static final String _SQL_COUNT_ATTACHMENT = "SELECT COUNT(attachment) FROM Attachment attachment";
	private static final String _SQL_COUNT_ATTACHMENT_WHERE = "SELECT COUNT(attachment) FROM Attachment attachment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "attachment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Attachment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Attachment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AttachmentPersistenceImpl.class);
}