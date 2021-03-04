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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException;
import vn.gov.hoabinh.model.VLegalDraftDocument;
import vn.gov.hoabinh.model.impl.VLegalDraftDocumentImpl;
import vn.gov.hoabinh.model.impl.VLegalDraftDocumentModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalDraftDocumentPersistence;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal draft document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalDraftDocumentUtil
 * @generated
 */
@ProviderType
public class VLegalDraftDocumentPersistenceImpl extends BasePersistenceImpl<VLegalDraftDocument>
	implements VLegalDraftDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalDraftDocumentUtil} to access the v legal draft document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDraftDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal draft documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByGroupId(long groupId, int start,
		int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByGroupId_First(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByGroupId_Last(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByGroupId_PrevAndNext(String draftId,
		long groupId, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalDraftDocument,
					groupId, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByGroupId_PrevAndNext(session, vLegalDraftDocument,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByGroupId_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalDraftDocument vLegalDraftDocument : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalDraftDocument.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_D",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.DRAFTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_D",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal draft document where groupId = &#63; and draftId = &#63; or throws a {@link NoSuchVLegalDraftDocumentException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param draftId the draft ID
	 * @return the matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByG_D(long groupId, String draftId)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByG_D(groupId, draftId);

		if (vLegalDraftDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", draftId=");
			msg.append(draftId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalDraftDocumentException(msg.toString());
		}

		return vLegalDraftDocument;
	}

	/**
	 * Returns the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param draftId the draft ID
	 * @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByG_D(long groupId, String draftId) {
		return fetchByG_D(groupId, draftId, true);
	}

	/**
	 * Returns the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param draftId the draft ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByG_D(long groupId, String draftId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, draftId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_D,
					finderArgs, this);
		}

		if (result instanceof VLegalDraftDocument) {
			VLegalDraftDocument vLegalDraftDocument = (VLegalDraftDocument)result;

			if ((groupId != vLegalDraftDocument.getGroupId()) ||
					!Objects.equals(draftId, vLegalDraftDocument.getDraftId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_G_D_DRAFTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDraftId) {
					qPos.add(draftId);
				}

				List<VLegalDraftDocument> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_D, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalDraftDocumentPersistenceImpl.fetchByG_D(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalDraftDocument vLegalDraftDocument = list.get(0);

					result = vLegalDraftDocument;

					cacheResult(vLegalDraftDocument);

					if ((vLegalDraftDocument.getGroupId() != groupId) ||
							(vLegalDraftDocument.getDraftId() == null) ||
							!vLegalDraftDocument.getDraftId().equals(draftId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_D,
							finderArgs, vLegalDraftDocument);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_D, finderArgs);

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
			return (VLegalDraftDocument)result;
		}
	}

	/**
	 * Removes the v legal draft document where groupId = &#63; and draftId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param draftId the draft ID
	 * @return the v legal draft document that was removed
	 */
	@Override
	public VLegalDraftDocument removeByG_D(long groupId, String draftId)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByG_D(groupId, draftId);

		return remove(vLegalDraftDocument);
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param draftId the draft ID
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByG_D(long groupId, String draftId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_D;

		Object[] finderArgs = new Object[] { groupId, draftId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_G_D_DRAFTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDraftId) {
					qPos.add(draftId);
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

	private static final String _FINDER_COLUMN_G_D_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_D_DRAFTID_1 = "vLegalDraftDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_G_D_DRAFTID_2 = "vLegalDraftDocument.draftId = ?";
	private static final String _FINDER_COLUMN_G_D_DRAFTID_3 = "(vLegalDraftDocument.draftId IS NULL OR vLegalDraftDocument.draftId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S_D",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S_D",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.STATUSDRAFT_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.DOCCODE_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_D = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S_D",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode) {
		return findByP_S_D(groupId, statusDraft, docCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode, int start, int end) {
		return findByP_S_D(groupId, statusDraft, docCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByP_S_D(groupId, statusDraft, docCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_D(long groupId, int statusDraft,
		String docCode, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_D;
			finderArgs = new Object[] { groupId, statusDraft, docCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_D;
			finderArgs = new Object[] {
					groupId, statusDraft, docCode,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							!Objects.equals(docCode,
								vLegalDraftDocument.getDocCode())) {
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_D_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_D_STATUSDRAFT_2);

			boolean bindDocCode = false;

			if (docCode == null) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_1);
			}
			else if (docCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_3);
			}
			else {
				bindDocCode = true;

				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindDocCode) {
					qPos.add(docCode);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_D_First(long groupId, int statusDraft,
		String docCode, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_D_First(groupId,
				statusDraft, docCode, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", docCode=");
		msg.append(docCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_D_First(long groupId,
		int statusDraft, String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByP_S_D(groupId, statusDraft,
				docCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_D_Last(long groupId, int statusDraft,
		String docCode, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_D_Last(groupId,
				statusDraft, docCode, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", docCode=");
		msg.append(docCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_D_Last(long groupId, int statusDraft,
		String docCode, OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByP_S_D(groupId, statusDraft, docCode);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByP_S_D(groupId, statusDraft,
				docCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByP_S_D_PrevAndNext(String draftId,
		long groupId, int statusDraft, String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_D_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, docCode, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_D_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, docCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_D_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_D_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_D_STATUSDRAFT_2);

		boolean bindDocCode = false;

		if (docCode == null) {
			query.append(_FINDER_COLUMN_P_S_D_DOCCODE_1);
		}
		else if (docCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_S_D_DOCCODE_3);
		}
		else {
			bindDocCode = true;

			query.append(_FINDER_COLUMN_P_S_D_DOCCODE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (bindDocCode) {
			qPos.add(docCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 */
	@Override
	public void removeByP_S_D(long groupId, int statusDraft, String docCode) {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_D(groupId,
				statusDraft, docCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param docCode the doc code
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByP_S_D(long groupId, int statusDraft, String docCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S_D;

		Object[] finderArgs = new Object[] { groupId, statusDraft, docCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_D_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_D_STATUSDRAFT_2);

			boolean bindDocCode = false;

			if (docCode == null) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_1);
			}
			else if (docCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_3);
			}
			else {
				bindDocCode = true;

				query.append(_FINDER_COLUMN_P_S_D_DOCCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindDocCode) {
					qPos.add(docCode);
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

	private static final String _FINDER_COLUMN_P_S_D_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_D_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_D_DOCCODE_1 = "vLegalDraftDocument.docCode IS NULL";
	private static final String _FINDER_COLUMN_P_S_D_DOCCODE_2 = "vLegalDraftDocument.docCode = ?";
	private static final String _FINDER_COLUMN_P_S_D_DOCCODE_3 = "(vLegalDraftDocument.docCode IS NULL OR vLegalDraftDocument.docCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_F = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S_F",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_F = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S_F",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.STATUSDRAFT_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_F = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S_F",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId) {
		return findByP_S_F(groupId, statusDraft, fieldId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId, int start, int end) {
		return findByP_S_F(groupId, statusDraft, fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByP_S_F(groupId, statusDraft, fieldId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_F(long groupId, int statusDraft,
		String fieldId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_F;
			finderArgs = new Object[] { groupId, statusDraft, fieldId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_F;
			finderArgs = new Object[] {
					groupId, statusDraft, fieldId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							!Objects.equals(fieldId,
								vLegalDraftDocument.getFieldId())) {
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_F_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_F_STATUSDRAFT_2);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_P_S_F_FIELDID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_F_First(long groupId, int statusDraft,
		String fieldId, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_F_First(groupId,
				statusDraft, fieldId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_F_First(long groupId,
		int statusDraft, String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByP_S_F(groupId, statusDraft,
				fieldId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_F_Last(long groupId, int statusDraft,
		String fieldId, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_F_Last(groupId,
				statusDraft, fieldId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_F_Last(long groupId, int statusDraft,
		String fieldId, OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByP_S_F(groupId, statusDraft, fieldId);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByP_S_F(groupId, statusDraft,
				fieldId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByP_S_F_PrevAndNext(String draftId,
		long groupId, int statusDraft, String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_F_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, fieldId, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_F_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_F_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_F_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_F_STATUSDRAFT_2);

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_P_S_F_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_S_F_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_P_S_F_FIELDID_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByP_S_F(long groupId, int statusDraft, String fieldId) {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_F(groupId,
				statusDraft, fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param fieldId the field ID
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByP_S_F(long groupId, int statusDraft, String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S_F;

		Object[] finderArgs = new Object[] { groupId, statusDraft, fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_F_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_F_STATUSDRAFT_2);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_P_S_F_FIELDID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindFieldId) {
					qPos.add(fieldId);
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

	private static final String _FINDER_COLUMN_P_S_F_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_F_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_F_FIELDID_1 = "vLegalDraftDocument.fieldId IS NULL";
	private static final String _FINDER_COLUMN_P_S_F_FIELDID_2 = "vLegalDraftDocument.fieldId = ?";
	private static final String _FINDER_COLUMN_P_S_F_FIELDID_3 = "(vLegalDraftDocument.fieldId IS NULL OR vLegalDraftDocument.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTPUBLISHED =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDraftPublished",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTPUBLISHED =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDraftPublished",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.STATUSDRAFT_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DRAFTPUBLISHED = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDraftPublished",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_DRAFTPUBLISHED =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByDraftPublished",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int statusDraft) {
		return findByDraftPublished(groupId, language, statusDraft,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int statusDraft, int start, int end) {
		return findByDraftPublished(groupId, language, statusDraft, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int statusDraft, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByDraftPublished(groupId, language, statusDraft, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int statusDraft, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTPUBLISHED;
			finderArgs = new Object[] { groupId, language, statusDraft };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTPUBLISHED;
			finderArgs = new Object[] {
					groupId, language, statusDraft,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft())) {
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDraft);

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByDraftPublished_First(long groupId,
		String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByDraftPublished_First(groupId,
				language, statusDraft, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByDraftPublished_First(long groupId,
		String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByDraftPublished(groupId,
				language, statusDraft, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByDraftPublished_Last(long groupId,
		String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByDraftPublished_Last(groupId,
				language, statusDraft, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByDraftPublished_Last(long groupId,
		String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByDraftPublished(groupId, language, statusDraft);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByDraftPublished(groupId,
				language, statusDraft, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByDraftPublished_PrevAndNext(
		String draftId, long groupId, String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByDraftPublished_PrevAndNext(session,
					vLegalDraftDocument, groupId, language, statusDraft,
					orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByDraftPublished_PrevAndNext(session,
					vLegalDraftDocument, groupId, language, statusDraft,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByDraftPublished_PrevAndNext(
		Session session, VLegalDraftDocument vLegalDraftDocument, long groupId,
		String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DRAFTPUBLISHED_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_2);

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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(statusDraft);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDrafts the status drafts
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int[] statusDrafts) {
		return findByDraftPublished(groupId, language, statusDrafts,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDrafts the status drafts
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int[] statusDrafts, int start, int end) {
		return findByDraftPublished(groupId, language, statusDrafts, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDrafts the status drafts
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int[] statusDrafts, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByDraftPublished(groupId, language, statusDrafts, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDraftPublished(long groupId,
		String language, int[] statusDrafts, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		if (statusDrafts == null) {
			statusDrafts = new int[0];
		}
		else if (statusDrafts.length > 1) {
			statusDrafts = ArrayUtil.unique(statusDrafts);

			Arrays.sort(statusDrafts);
		}

		if (statusDrafts.length == 1) {
			return findByDraftPublished(groupId, language, statusDrafts[0],
				start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					groupId, language, StringUtil.merge(statusDrafts)
				};
		}
		else {
			finderArgs = new Object[] {
					groupId, language, StringUtil.merge(statusDrafts),
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTPUBLISHED,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage()) ||
							!ArrayUtil.contains(statusDrafts,
								vLegalDraftDocument.getStatusDraft())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_2);
			}

			if (statusDrafts.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_7);

				query.append(StringUtil.merge(statusDrafts));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTPUBLISHED,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DRAFTPUBLISHED,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 */
	@Override
	public void removeByDraftPublished(long groupId, String language,
		int statusDraft) {
		for (VLegalDraftDocument vLegalDraftDocument : findByDraftPublished(
				groupId, language, statusDraft, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDraft the status draft
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByDraftPublished(long groupId, String language,
		int statusDraft) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DRAFTPUBLISHED;

		Object[] finderArgs = new Object[] { groupId, language, statusDraft };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDraft);

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

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDrafts the status drafts
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByDraftPublished(long groupId, String language,
		int[] statusDrafts) {
		if (statusDrafts == null) {
			statusDrafts = new int[0];
		}
		else if (statusDrafts.length > 1) {
			statusDrafts = ArrayUtil.unique(statusDrafts);

			Arrays.sort(statusDrafts);
		}

		Object[] finderArgs = new Object[] {
				groupId, language, StringUtil.merge(statusDrafts)
			};

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DRAFTPUBLISHED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DRAFTPUBLISHED_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_2);
			}

			if (statusDrafts.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_7);

				query.append(StringUtil.merge(statusDrafts));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DRAFTPUBLISHED,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DRAFTPUBLISHED,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DRAFTPUBLISHED_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_2 = "vLegalDraftDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DRAFTPUBLISHED_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ?";
	private static final String _FINDER_COLUMN_DRAFTPUBLISHED_STATUSDRAFT_7 = "vLegalDraftDocument.statusDraft IN (";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S_D =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_F_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_F_S_D =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_F_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		String language, String fieldId, int statusDraft, String draftId) {
		return findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		int start, int end) {
		return findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S_D;
		finderArgs = new Object[] {
				groupId, language, fieldId, statusDraft, draftId,
				
				start, end, orderByComparator
			};

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage()) ||
							!Objects.equals(fieldId,
								vLegalDraftDocument.getFieldId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							Objects.equals(draftId,
								vLegalDraftDocument.getDraftId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_F_S_D_STATUSDRAFT_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_DRAFTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				qPos.add(statusDraft);

				if (bindDraftId) {
					qPos.add(draftId);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByG_L_F_S_D_First(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByG_L_F_S_D_First(groupId,
				language, fieldId, statusDraft, draftId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByG_L_F_S_D_First(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByG_L_F_S_D(groupId, language,
				fieldId, statusDraft, draftId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByG_L_F_S_D_Last(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByG_L_F_S_D_Last(groupId,
				language, fieldId, statusDraft, draftId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByG_L_F_S_D_Last(long groupId,
		String language, String fieldId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByG_L_F_S_D(groupId, language, fieldId, statusDraft,
				draftId);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByG_L_F_S_D(groupId, language,
				fieldId, statusDraft, draftId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 */
	@Override
	public void removeByG_L_F_S_D(long groupId, String language,
		String fieldId, int statusDraft, String draftId) {
		for (VLegalDraftDocument vLegalDraftDocument : findByG_L_F_S_D(
				groupId, language, fieldId, statusDraft, draftId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByG_L_F_S_D(long groupId, String language, String fieldId,
		int statusDraft, String draftId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_F_S_D;

		Object[] finderArgs = new Object[] {
				groupId, language, fieldId, statusDraft, draftId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_F_S_D_STATUSDRAFT_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_DRAFTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				qPos.add(statusDraft);

				if (bindDraftId) {
					qPos.add(draftId);
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

	private static final String _FINDER_COLUMN_G_L_F_S_D_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_LANGUAGE_2 = "vLegalDraftDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_FIELDID_1 = "vLegalDraftDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_FIELDID_2 = "vLegalDraftDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_FIELDID_3 = "(vLegalDraftDocument.fieldId IS NULL OR vLegalDraftDocument.fieldId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_DRAFTID_1 = "vLegalDraftDocument.draftId IS NOT NULL";
	private static final String _FINDER_COLUMN_G_L_F_S_D_DRAFTID_2 = "vLegalDraftDocument.draftId != ?";
	private static final String _FINDER_COLUMN_G_L_F_S_D_DRAFTID_3 = "(vLegalDraftDocument.draftId IS NULL OR vLegalDraftDocument.draftId != '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_T = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S_T",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_T = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S_T",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.STATUSDRAFT_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.TYPEID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_T = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S_T",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId) {
		return findByP_S_T(groupId, statusDraft, typeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId, int start, int end) {
		return findByP_S_T(groupId, statusDraft, typeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByP_S_T(groupId, statusDraft, typeId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_T(long groupId, int statusDraft,
		String typeId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_T;
			finderArgs = new Object[] { groupId, statusDraft, typeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_T;
			finderArgs = new Object[] {
					groupId, statusDraft, typeId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							!Objects.equals(typeId,
								vLegalDraftDocument.getTypeId())) {
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_T_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_T_STATUSDRAFT_2);

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_P_S_T_TYPEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindTypeId) {
					qPos.add(typeId);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_T_First(long groupId, int statusDraft,
		String typeId, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_T_First(groupId,
				statusDraft, typeId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_T_First(long groupId,
		int statusDraft, String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByP_S_T(groupId, statusDraft,
				typeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_T_Last(long groupId, int statusDraft,
		String typeId, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_T_Last(groupId,
				statusDraft, typeId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_T_Last(long groupId, int statusDraft,
		String typeId, OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByP_S_T(groupId, statusDraft, typeId);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByP_S_T(groupId, statusDraft,
				typeId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByP_S_T_PrevAndNext(String draftId,
		long groupId, int statusDraft, String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_T_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, typeId, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_T_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, typeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_T_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_T_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_T_STATUSDRAFT_2);

		boolean bindTypeId = false;

		if (typeId == null) {
			query.append(_FINDER_COLUMN_P_S_T_TYPEID_1);
		}
		else if (typeId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_S_T_TYPEID_3);
		}
		else {
			bindTypeId = true;

			query.append(_FINDER_COLUMN_P_S_T_TYPEID_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (bindTypeId) {
			qPos.add(typeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 */
	@Override
	public void removeByP_S_T(long groupId, int statusDraft, String typeId) {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_T(groupId,
				statusDraft, typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param typeId the type ID
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByP_S_T(long groupId, int statusDraft, String typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S_T;

		Object[] finderArgs = new Object[] { groupId, statusDraft, typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_T_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_T_STATUSDRAFT_2);

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_T_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_P_S_T_TYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindTypeId) {
					qPos.add(typeId);
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

	private static final String _FINDER_COLUMN_P_S_T_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_T_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_T_TYPEID_1 = "vLegalDraftDocument.typeId IS NULL";
	private static final String _FINDER_COLUMN_P_S_T_TYPEID_2 = "vLegalDraftDocument.typeId = ?";
	private static final String _FINDER_COLUMN_P_S_T_TYPEID_3 = "(vLegalDraftDocument.typeId IS NULL OR vLegalDraftDocument.typeId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T_S_D =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_T_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_T_S_D =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_T_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		String language, String typeId, int statusDraft, String draftId) {
		return findByG_L_T_S_D(groupId, language, typeId, statusDraft, draftId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		int start, int end) {
		return findByG_L_T_S_D(groupId, language, typeId, statusDraft, draftId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByG_L_T_S_D(groupId, language, typeId, statusDraft, draftId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T_S_D;
		finderArgs = new Object[] {
				groupId, language, typeId, statusDraft, draftId,
				
				start, end, orderByComparator
			};

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage()) ||
							!Objects.equals(typeId,
								vLegalDraftDocument.getTypeId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							Objects.equals(draftId,
								vLegalDraftDocument.getDraftId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_LANGUAGE_2);
			}

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEID_2);
			}

			query.append(_FINDER_COLUMN_G_L_T_S_D_STATUSDRAFT_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_DRAFTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindTypeId) {
					qPos.add(typeId);
				}

				qPos.add(statusDraft);

				if (bindDraftId) {
					qPos.add(draftId);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByG_L_T_S_D_First(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByG_L_T_S_D_First(groupId,
				language, typeId, statusDraft, draftId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByG_L_T_S_D_First(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByG_L_T_S_D(groupId, language,
				typeId, statusDraft, draftId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByG_L_T_S_D_Last(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByG_L_T_S_D_Last(groupId,
				language, typeId, statusDraft, draftId, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByG_L_T_S_D_Last(long groupId,
		String language, String typeId, int statusDraft, String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByG_L_T_S_D(groupId, language, typeId, statusDraft,
				draftId);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByG_L_T_S_D(groupId, language,
				typeId, statusDraft, draftId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 */
	@Override
	public void removeByG_L_T_S_D(long groupId, String language, String typeId,
		int statusDraft, String draftId) {
		for (VLegalDraftDocument vLegalDraftDocument : findByG_L_T_S_D(
				groupId, language, typeId, statusDraft, draftId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeId the type ID
	 * @param statusDraft the status draft
	 * @param draftId the draft ID
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByG_L_T_S_D(long groupId, String language, String typeId,
		int statusDraft, String draftId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_T_S_D;

		Object[] finderArgs = new Object[] {
				groupId, language, typeId, statusDraft, draftId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_LANGUAGE_2);
			}

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEID_2);
			}

			query.append(_FINDER_COLUMN_G_L_T_S_D_STATUSDRAFT_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_DRAFTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindTypeId) {
					qPos.add(typeId);
				}

				qPos.add(statusDraft);

				if (bindDraftId) {
					qPos.add(draftId);
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

	private static final String _FINDER_COLUMN_G_L_T_S_D_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_LANGUAGE_2 = "vLegalDraftDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_TYPEID_1 = "vLegalDraftDocument.typeId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_TYPEID_2 = "vLegalDraftDocument.typeId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_TYPEID_3 = "(vLegalDraftDocument.typeId IS NULL OR vLegalDraftDocument.typeId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_DRAFTID_1 = "vLegalDraftDocument.draftId IS NOT NULL";
	private static final String _FINDER_COLUMN_G_L_T_S_D_DRAFTID_2 = "vLegalDraftDocument.draftId != ?";
	private static final String _FINDER_COLUMN_G_L_T_S_D_DRAFTID_3 = "(vLegalDraftDocument.draftId IS NULL OR vLegalDraftDocument.draftId != '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.STATUSDRAFT_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language) {
		return findByP_S_L(groupId, statusDraft, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language, int start, int end) {
		return findByP_S_L(groupId, statusDraft, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByP_S_L(groupId, statusDraft, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_L(long groupId, int statusDraft,
		String language, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_L;
			finderArgs = new Object[] { groupId, statusDraft, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_L;
			finderArgs = new Object[] {
					groupId, statusDraft, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_L_STATUSDRAFT_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_L_First(long groupId, int statusDraft,
		String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_L_First(groupId,
				statusDraft, language, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_L_First(long groupId,
		int statusDraft, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByP_S_L(groupId, statusDraft,
				language, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_L_Last(long groupId, int statusDraft,
		String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_L_Last(groupId,
				statusDraft, language, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_L_Last(long groupId, int statusDraft,
		String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByP_S_L(groupId, statusDraft, language);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByP_S_L(groupId, statusDraft,
				language, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByP_S_L_PrevAndNext(String draftId,
		long groupId, int statusDraft, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, language, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_L_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_L_STATUSDRAFT_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 */
	@Override
	public void removeByP_S_L(long groupId, int statusDraft, String language) {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_L(groupId,
				statusDraft, language, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param language the language
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByP_S_L(long groupId, int statusDraft, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S_L;

		Object[] finderArgs = new Object[] { groupId, statusDraft, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_L_STATUSDRAFT_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_S_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				if (bindLanguage) {
					qPos.add(language);
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

	private static final String _FINDER_COLUMN_P_S_L_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_L_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_L_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_S_L_LANGUAGE_2 = "vLegalDraftDocument.language = ?";
	private static final String _FINDER_COLUMN_P_S_L_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_L(long groupId, String language) {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_L(long groupId, String language,
		int start, int end) {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_L(long groupId, String language,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByP_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_L(long groupId, String language,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_L_First(long groupId, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_L_First(groupId,
				language, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_L_First(long groupId, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_L_Last(long groupId, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_L_Last(groupId,
				language, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_L_Last(long groupId, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByP_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByP_L(groupId, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByP_L_PrevAndNext(String draftId,
		long groupId, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, language, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_L_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByP_L(long groupId, String language) {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_L(groupId,
				language, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByP_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
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

	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vLegalDraftDocument.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_U_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S_U_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_U_L =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S_U_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			VLegalDraftDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.STATUSDRAFT_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S_U_L = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S_U_L",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Long.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language) {
		return findByP_S_U_L(groupId, statusDraft, createdByUser, language,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language, int start, int end) {
		return findByP_S_U_L(groupId, statusDraft, createdByUser, language,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language, int start,
		int end, OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByP_S_U_L(groupId, statusDraft, createdByUser, language,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, String language, int start,
		int end, OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_U_L;
			finderArgs = new Object[] {
					groupId, statusDraft, createdByUser, language
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S_U_L;
			finderArgs = new Object[] {
					groupId, statusDraft, createdByUser, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if ((groupId != vLegalDraftDocument.getGroupId()) ||
							(statusDraft != vLegalDraftDocument.getStatusDraft()) ||
							(createdByUser != vLegalDraftDocument.getCreatedByUser()) ||
							!Objects.equals(language,
								vLegalDraftDocument.getLanguage())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_U_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2);

			query.append(_FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				qPos.add(createdByUser);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_U_L_First(groupId,
				statusDraft, createdByUser, language, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByP_S_U_L(groupId, statusDraft,
				createdByUser, language, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByP_S_U_L_Last(groupId,
				statusDraft, createdByUser, language, orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusDraft=");
		msg.append(statusDraft);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByP_S_U_L(groupId, statusDraft, createdByUser, language);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByP_S_U_L(groupId, statusDraft,
				createdByUser, language, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByP_S_U_L_PrevAndNext(String draftId,
		long groupId, int statusDraft, long createdByUser, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByP_S_U_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, createdByUser, language,
					orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByP_S_U_L_PrevAndNext(session, vLegalDraftDocument,
					groupId, statusDraft, createdByUser, language,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByP_S_U_L_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, long groupId, int statusDraft,
		long createdByUser, String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_S_U_L_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2);

		query.append(_FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusDraft);

		qPos.add(createdByUser);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 */
	@Override
	public void removeByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, String language) {
		for (VLegalDraftDocument vLegalDraftDocument : findByP_S_U_L(groupId,
				statusDraft, createdByUser, language, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusDraft the status draft
	 * @param createdByUser the created by user
	 * @param language the language
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S_U_L;

		Object[] finderArgs = new Object[] {
				groupId, statusDraft, createdByUser, language
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_S_U_L_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2);

			query.append(_FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_S_U_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusDraft);

				qPos.add(createdByUser);

				if (bindLanguage) {
					qPos.add(language);
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

	private static final String _FINDER_COLUMN_P_S_U_L_GROUPID_2 = "vLegalDraftDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_U_L_STATUSDRAFT_2 = "vLegalDraftDocument.statusDraft = ? AND ";
	private static final String _FINDER_COLUMN_P_S_U_L_CREATEDBYUSER_2 = "vLegalDraftDocument.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_P_S_U_L_LANGUAGE_1 = "vLegalDraftDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_S_U_L_LANGUAGE_2 = "vLegalDraftDocument.language = ?";
	private static final String _FINDER_COLUMN_P_S_U_L_LANGUAGE_3 = "(vLegalDraftDocument.language IS NULL OR vLegalDraftDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCCODE = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDocCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCCODE =
		new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDocCode",
			new String[] { String.class.getName() },
			VLegalDraftDocumentModelImpl.DOCCODE_COLUMN_BITMASK |
			VLegalDraftDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCCODE = new FinderPath(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal draft documents where docCode = &#63;.
	 *
	 * @param docCode the doc code
	 * @return the matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDocCode(String docCode) {
		return findByDocCode(docCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docCode the doc code
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDocCode(String docCode, int start,
		int end) {
		return findByDocCode(docCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docCode the doc code
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDocCode(String docCode, int start,
		int end, OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findByDocCode(docCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents where docCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docCode the doc code
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findByDocCode(String docCode, int start,
		int end, OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCCODE;
			finderArgs = new Object[] { docCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCCODE;
			finderArgs = new Object[] { docCode, start, end, orderByComparator };
		}

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDraftDocument vLegalDraftDocument : list) {
					if (!Objects.equals(docCode,
								vLegalDraftDocument.getDocCode())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

			boolean bindDocCode = false;

			if (docCode == null) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_1);
			}
			else if (docCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_3);
			}
			else {
				bindDocCode = true;

				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocCode) {
					qPos.add(docCode);
				}

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByDocCode_First(String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByDocCode_First(docCode,
				orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docCode=");
		msg.append(docCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByDocCode_First(String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		List<VLegalDraftDocument> list = findByDocCode(docCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument findByDocCode_Last(String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByDocCode_Last(docCode,
				orderByComparator);

		if (vLegalDraftDocument != null) {
			return vLegalDraftDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docCode=");
		msg.append(docCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDraftDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByDocCode_Last(String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		int count = countByDocCode(docCode);

		if (count == 0) {
			return null;
		}

		List<VLegalDraftDocument> list = findByDocCode(docCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal draft documents before and after the current v legal draft document in the ordered set where docCode = &#63;.
	 *
	 * @param draftId the primary key of the current v legal draft document
	 * @param docCode the doc code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument[] findByDocCode_PrevAndNext(String draftId,
		String docCode, OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = findByPrimaryKey(draftId);

		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument[] array = new VLegalDraftDocumentImpl[3];

			array[0] = getByDocCode_PrevAndNext(session, vLegalDraftDocument,
					docCode, orderByComparator, true);

			array[1] = vLegalDraftDocument;

			array[2] = getByDocCode_PrevAndNext(session, vLegalDraftDocument,
					docCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDraftDocument getByDocCode_PrevAndNext(Session session,
		VLegalDraftDocument vLegalDraftDocument, String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE);

		boolean bindDocCode = false;

		if (docCode == null) {
			query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_1);
		}
		else if (docCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_3);
		}
		else {
			bindDocCode = true;

			query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_2);
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
			query.append(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocCode) {
			qPos.add(docCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDraftDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDraftDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal draft documents where docCode = &#63; from the database.
	 *
	 * @param docCode the doc code
	 */
	@Override
	public void removeByDocCode(String docCode) {
		for (VLegalDraftDocument vLegalDraftDocument : findByDocCode(docCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents where docCode = &#63;.
	 *
	 * @param docCode the doc code
	 * @return the number of matching v legal draft documents
	 */
	@Override
	public int countByDocCode(String docCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCCODE;

		Object[] finderArgs = new Object[] { docCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE);

			boolean bindDocCode = false;

			if (docCode == null) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_1);
			}
			else if (docCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_3);
			}
			else {
				bindDocCode = true;

				query.append(_FINDER_COLUMN_DOCCODE_DOCCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocCode) {
					qPos.add(docCode);
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

	private static final String _FINDER_COLUMN_DOCCODE_DOCCODE_1 = "vLegalDraftDocument.docCode IS NULL";
	private static final String _FINDER_COLUMN_DOCCODE_DOCCODE_2 = "vLegalDraftDocument.docCode = ?";
	private static final String _FINDER_COLUMN_DOCCODE_DOCCODE_3 = "(vLegalDraftDocument.docCode IS NULL OR vLegalDraftDocument.docCode = '')";

	public VLegalDraftDocumentPersistenceImpl() {
		setModelClass(VLegalDraftDocument.class);
	}

	/**
	 * Caches the v legal draft document in the entity cache if it is enabled.
	 *
	 * @param vLegalDraftDocument the v legal draft document
	 */
	@Override
	public void cacheResult(VLegalDraftDocument vLegalDraftDocument) {
		entityCache.putResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey(),
			vLegalDraftDocument);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				vLegalDraftDocument.getGroupId(),
				vLegalDraftDocument.getDraftId()
			}, vLegalDraftDocument);

		vLegalDraftDocument.resetOriginalValues();
	}

	/**
	 * Caches the v legal draft documents in the entity cache if it is enabled.
	 *
	 * @param vLegalDraftDocuments the v legal draft documents
	 */
	@Override
	public void cacheResult(List<VLegalDraftDocument> vLegalDraftDocuments) {
		for (VLegalDraftDocument vLegalDraftDocument : vLegalDraftDocuments) {
			if (entityCache.getResult(
						VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDraftDocumentImpl.class,
						vLegalDraftDocument.getPrimaryKey()) == null) {
				cacheResult(vLegalDraftDocument);
			}
			else {
				vLegalDraftDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal draft documents.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalDraftDocumentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal draft document.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalDraftDocument vLegalDraftDocument) {
		entityCache.removeResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalDraftDocumentModelImpl)vLegalDraftDocument);
	}

	@Override
	public void clearCache(List<VLegalDraftDocument> vLegalDraftDocuments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalDraftDocument vLegalDraftDocument : vLegalDraftDocuments) {
			entityCache.removeResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDraftDocumentImpl.class,
				vLegalDraftDocument.getPrimaryKey());

			clearUniqueFindersCache((VLegalDraftDocumentModelImpl)vLegalDraftDocument);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalDraftDocumentModelImpl vLegalDraftDocumentModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalDraftDocumentModelImpl.getGroupId(),
					vLegalDraftDocumentModelImpl.getDraftId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_D, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_D, args,
				vLegalDraftDocumentModelImpl);
		}
		else {
			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getDraftId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_D, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_D, args,
					vLegalDraftDocumentModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalDraftDocumentModelImpl vLegalDraftDocumentModelImpl) {
		Object[] args = new Object[] {
				vLegalDraftDocumentModelImpl.getGroupId(),
				vLegalDraftDocumentModelImpl.getDraftId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_D, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_D, args);

		if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_D.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalDraftDocumentModelImpl.getOriginalGroupId(),
					vLegalDraftDocumentModelImpl.getOriginalDraftId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_D, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_D, args);
		}
	}

	/**
	 * Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	 *
	 * @param draftId the primary key for the new v legal draft document
	 * @return the new v legal draft document
	 */
	@Override
	public VLegalDraftDocument create(String draftId) {
		VLegalDraftDocument vLegalDraftDocument = new VLegalDraftDocumentImpl();

		vLegalDraftDocument.setNew(true);
		vLegalDraftDocument.setPrimaryKey(draftId);

		vLegalDraftDocument.setCompanyId(companyProvider.getCompanyId());

		return vLegalDraftDocument;
	}

	/**
	 * Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param draftId the primary key of the v legal draft document
	 * @return the v legal draft document that was removed
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument remove(String draftId)
		throws NoSuchVLegalDraftDocumentException {
		return remove((Serializable)draftId);
	}

	/**
	 * Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal draft document
	 * @return the v legal draft document that was removed
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument remove(Serializable primaryKey)
		throws NoSuchVLegalDraftDocumentException {
		Session session = null;

		try {
			session = openSession();

			VLegalDraftDocument vLegalDraftDocument = (VLegalDraftDocument)session.get(VLegalDraftDocumentImpl.class,
					primaryKey);

			if (vLegalDraftDocument == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalDraftDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalDraftDocument);
		}
		catch (NoSuchVLegalDraftDocumentException nsee) {
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
	protected VLegalDraftDocument removeImpl(
		VLegalDraftDocument vLegalDraftDocument) {
		vLegalDraftDocument = toUnwrappedModel(vLegalDraftDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalDraftDocument)) {
				vLegalDraftDocument = (VLegalDraftDocument)session.get(VLegalDraftDocumentImpl.class,
						vLegalDraftDocument.getPrimaryKeyObj());
			}

			if (vLegalDraftDocument != null) {
				session.delete(vLegalDraftDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalDraftDocument != null) {
			clearCache(vLegalDraftDocument);
		}

		return vLegalDraftDocument;
	}

	@Override
	public VLegalDraftDocument updateImpl(
		VLegalDraftDocument vLegalDraftDocument) {
		vLegalDraftDocument = toUnwrappedModel(vLegalDraftDocument);

		boolean isNew = vLegalDraftDocument.isNew();

		VLegalDraftDocumentModelImpl vLegalDraftDocumentModelImpl = (VLegalDraftDocumentModelImpl)vLegalDraftDocument;

		Session session = null;

		try {
			session = openSession();

			if (vLegalDraftDocument.isNew()) {
				session.save(vLegalDraftDocument);

				vLegalDraftDocument.setNew(false);
			}
			else {
				vLegalDraftDocument = (VLegalDraftDocument)session.merge(vLegalDraftDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalDraftDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalDraftDocumentModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalStatusDraft(),
						vLegalDraftDocumentModelImpl.getOriginalDocCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_D,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getStatusDraft(),
						vLegalDraftDocumentModelImpl.getDocCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_D,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalStatusDraft(),
						vLegalDraftDocumentModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_F, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_F,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getStatusDraft(),
						vLegalDraftDocumentModelImpl.getFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_F, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_F,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTPUBLISHED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalLanguage(),
						vLegalDraftDocumentModelImpl.getOriginalStatusDraft()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DRAFTPUBLISHED,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTPUBLISHED,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getLanguage(),
						vLegalDraftDocumentModelImpl.getStatusDraft()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DRAFTPUBLISHED,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DRAFTPUBLISHED,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalStatusDraft(),
						vLegalDraftDocumentModelImpl.getOriginalTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_T,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getStatusDraft(),
						vLegalDraftDocumentModelImpl.getTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_T,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalStatusDraft(),
						vLegalDraftDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_L,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getStatusDraft(),
						vLegalDraftDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_L,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_U_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalGroupId(),
						vLegalDraftDocumentModelImpl.getOriginalStatusDraft(),
						vLegalDraftDocumentModelImpl.getOriginalCreatedByUser(),
						vLegalDraftDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_U_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_U_L,
					args);

				args = new Object[] {
						vLegalDraftDocumentModelImpl.getGroupId(),
						vLegalDraftDocumentModelImpl.getStatusDraft(),
						vLegalDraftDocumentModelImpl.getCreatedByUser(),
						vLegalDraftDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S_U_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S_U_L,
					args);
			}

			if ((vLegalDraftDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDraftDocumentModelImpl.getOriginalDocCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCCODE,
					args);

				args = new Object[] { vLegalDraftDocumentModelImpl.getDocCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCCODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCCODE,
					args);
			}
		}

		entityCache.putResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDraftDocumentImpl.class, vLegalDraftDocument.getPrimaryKey(),
			vLegalDraftDocument, false);

		clearUniqueFindersCache(vLegalDraftDocumentModelImpl);
		cacheUniqueFindersCache(vLegalDraftDocumentModelImpl, isNew);

		vLegalDraftDocument.resetOriginalValues();

		return vLegalDraftDocument;
	}

	protected VLegalDraftDocument toUnwrappedModel(
		VLegalDraftDocument vLegalDraftDocument) {
		if (vLegalDraftDocument instanceof VLegalDraftDocumentImpl) {
			return vLegalDraftDocument;
		}

		VLegalDraftDocumentImpl vLegalDraftDocumentImpl = new VLegalDraftDocumentImpl();

		vLegalDraftDocumentImpl.setNew(vLegalDraftDocument.isNew());
		vLegalDraftDocumentImpl.setPrimaryKey(vLegalDraftDocument.getPrimaryKey());

		vLegalDraftDocumentImpl.setDraftId(vLegalDraftDocument.getDraftId());
		vLegalDraftDocumentImpl.setGroupId(vLegalDraftDocument.getGroupId());
		vLegalDraftDocumentImpl.setCompanyId(vLegalDraftDocument.getCompanyId());
		vLegalDraftDocumentImpl.setUserId(vLegalDraftDocument.getUserId());
		vLegalDraftDocumentImpl.setCreatedByUser(vLegalDraftDocument.getCreatedByUser());
		vLegalDraftDocumentImpl.setCreatedDate(vLegalDraftDocument.getCreatedDate());
		vLegalDraftDocumentImpl.setModifiedByUser(vLegalDraftDocument.getModifiedByUser());
		vLegalDraftDocumentImpl.setModifiedDate(vLegalDraftDocument.getModifiedDate());
		vLegalDraftDocumentImpl.setApprovedByUser(vLegalDraftDocument.getApprovedByUser());
		vLegalDraftDocumentImpl.setApprovedDate(vLegalDraftDocument.getApprovedDate());
		vLegalDraftDocumentImpl.setPublishedByUser(vLegalDraftDocument.getPublishedByUser());
		vLegalDraftDocumentImpl.setPublishedDate(vLegalDraftDocument.getPublishedDate());
		vLegalDraftDocumentImpl.setTitle(vLegalDraftDocument.getTitle());
		vLegalDraftDocumentImpl.setExpiredDate(vLegalDraftDocument.getExpiredDate());
		vLegalDraftDocumentImpl.setLanguage(vLegalDraftDocument.getLanguage());
		vLegalDraftDocumentImpl.setContent(vLegalDraftDocument.getContent());
		vLegalDraftDocumentImpl.setTypeId(vLegalDraftDocument.getTypeId());
		vLegalDraftDocumentImpl.setFieldId(vLegalDraftDocument.getFieldId());
		vLegalDraftDocumentImpl.setHasAttachment(vLegalDraftDocument.isHasAttachment());
		vLegalDraftDocumentImpl.setDraftLevel(vLegalDraftDocument.getDraftLevel());
		vLegalDraftDocumentImpl.setDocCode(vLegalDraftDocument.getDocCode());
		vLegalDraftDocumentImpl.setStatusDraft(vLegalDraftDocument.getStatusDraft());

		return vLegalDraftDocumentImpl;
	}

	/**
	 * Returns the v legal draft document with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal draft document
	 * @return the v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalDraftDocumentException {
		VLegalDraftDocument vLegalDraftDocument = fetchByPrimaryKey(primaryKey);

		if (vLegalDraftDocument == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalDraftDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalDraftDocument;
	}

	/**
	 * Returns the v legal draft document with the primary key or throws a {@link NoSuchVLegalDraftDocumentException} if it could not be found.
	 *
	 * @param draftId the primary key of the v legal draft document
	 * @return the v legal draft document
	 * @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument findByPrimaryKey(String draftId)
		throws NoSuchVLegalDraftDocumentException {
		return findByPrimaryKey((Serializable)draftId);
	}

	/**
	 * Returns the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal draft document
	 * @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDraftDocumentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalDraftDocument vLegalDraftDocument = (VLegalDraftDocument)serializable;

		if (vLegalDraftDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDraftDocument = (VLegalDraftDocument)session.get(VLegalDraftDocumentImpl.class,
						primaryKey);

				if (vLegalDraftDocument != null) {
					cacheResult(vLegalDraftDocument);
				}
				else {
					entityCache.putResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDraftDocumentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDraftDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalDraftDocument;
	}

	/**
	 * Returns the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param draftId the primary key of the v legal draft document
	 * @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	 */
	@Override
	public VLegalDraftDocument fetchByPrimaryKey(String draftId) {
		return fetchByPrimaryKey((Serializable)draftId);
	}

	@Override
	public Map<Serializable, VLegalDraftDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalDraftDocument> map = new HashMap<Serializable, VLegalDraftDocument>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalDraftDocument vLegalDraftDocument = fetchByPrimaryKey(primaryKey);

			if (vLegalDraftDocument != null) {
				map.put(primaryKey, vLegalDraftDocument);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDraftDocumentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalDraftDocument)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(StringPool.APOSTROPHE);
			query.append((String)primaryKey);
			query.append(StringPool.APOSTROPHE);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (VLegalDraftDocument vLegalDraftDocument : (List<VLegalDraftDocument>)q.list()) {
				map.put(vLegalDraftDocument.getPrimaryKeyObj(),
					vLegalDraftDocument);

				cacheResult(vLegalDraftDocument);

				uncachedPrimaryKeys.remove(vLegalDraftDocument.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalDraftDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDraftDocumentImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal draft documents.
	 *
	 * @return the v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal draft documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @return the range of v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findAll(int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal draft documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal draft documents
	 * @param end the upper bound of the range of v legal draft documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal draft documents
	 */
	@Override
	public List<VLegalDraftDocument> findAll(int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
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

		List<VLegalDraftDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDraftDocument>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALDRAFTDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDRAFTDOCUMENT;

				if (pagination) {
					sql = sql.concat(VLegalDraftDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDraftDocument>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the v legal draft documents from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalDraftDocument vLegalDraftDocument : findAll()) {
			remove(vLegalDraftDocument);
		}
	}

	/**
	 * Returns the number of v legal draft documents.
	 *
	 * @return the number of v legal draft documents
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDRAFTDOCUMENT);

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
		return VLegalDraftDocumentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal draft document persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalDraftDocumentImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDRAFTDOCUMENT = "SELECT vLegalDraftDocument FROM VLegalDraftDocument vLegalDraftDocument";
	private static final String _SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE_PKS_IN = "SELECT vLegalDraftDocument FROM VLegalDraftDocument vLegalDraftDocument WHERE draftId IN (";
	private static final String _SQL_SELECT_VLEGALDRAFTDOCUMENT_WHERE = "SELECT vLegalDraftDocument FROM VLegalDraftDocument vLegalDraftDocument WHERE ";
	private static final String _SQL_COUNT_VLEGALDRAFTDOCUMENT = "SELECT COUNT(vLegalDraftDocument) FROM VLegalDraftDocument vLegalDraftDocument";
	private static final String _SQL_COUNT_VLEGALDRAFTDOCUMENT_WHERE = "SELECT COUNT(vLegalDraftDocument) FROM VLegalDraftDocument vLegalDraftDocument WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDraftDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDraftDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDraftDocument exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalDraftDocumentPersistenceImpl.class);
}