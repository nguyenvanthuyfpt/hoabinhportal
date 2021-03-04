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

import vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException;
import vn.gov.hoabinh.model.VLegalSuggestDocument;
import vn.gov.hoabinh.model.impl.VLegalSuggestDocumentImpl;
import vn.gov.hoabinh.model.impl.VLegalSuggestDocumentModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalSuggestDocumentPersistence;

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
 * The persistence implementation for the v legal suggest document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalSuggestDocumentUtil
 * @generated
 */
@ProviderType
public class VLegalSuggestDocumentPersistenceImpl extends BasePersistenceImpl<VLegalSuggestDocument>
	implements VLegalSuggestDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalSuggestDocumentUtil} to access the v legal suggest document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalSuggestDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalSuggestDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal suggest documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByGroupId(long groupId, int start,
		int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if ((groupId != vLegalSuggestDocument.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByGroupId_First(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByGroupId_Last(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findByGroupId_PrevAndNext(String sugId,
		long groupId, OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalSuggestDocument,
					groupId, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByGroupId_PrevAndNext(session, vLegalSuggestDocument,
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

	protected VLegalSuggestDocument getByGroupId_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByGroupId(
				groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalSuggestDocument.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_A",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_A",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VLegalSuggestDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.APPROVED_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_A",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_A(long groupId, boolean approved) {
		return findByP_A(groupId, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end) {
		return findByP_A(groupId, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findByP_A(groupId, approved, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_A;
			finderArgs = new Object[] { groupId, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_A;
			finderArgs = new Object[] {
					groupId, approved,
					
					start, end, orderByComparator
				};
		}

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if ((groupId != vLegalSuggestDocument.getGroupId()) ||
							(approved != vLegalSuggestDocument.getApproved())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_A_GROUPID_2);

			query.append(_FINDER_COLUMN_P_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(approved);

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_A_First(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_A_First(groupId,
				approved, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_A_First(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findByP_A(groupId, approved, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_A_Last(long groupId, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_A_Last(groupId,
				approved, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_A_Last(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countByP_A(groupId, approved);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findByP_A(groupId, approved,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findByP_A_PrevAndNext(String sugId,
		long groupId, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, approved, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_A_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_A_GROUPID_2);

		query.append(_FINDER_COLUMN_P_A_APPROVED_2);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 */
	@Override
	public void removeByP_A(long groupId, boolean approved) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_A(groupId,
				approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByP_A(long groupId, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_A;

		Object[] finderArgs = new Object[] { groupId, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_A_GROUPID_2);

			query.append(_FINDER_COLUMN_P_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_P_A_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_A_APPROVED_2 = "vLegalSuggestDocument.approved = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_S",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalSuggestDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.SUGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or throws a {@link NoSuchVLegalSuggestDocumentException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param sugId the sug ID
	 * @return the matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByG_S(long groupId, String sugId)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByG_S(groupId, sugId);

		if (vLegalSuggestDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", sugId=");
			msg.append(sugId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalSuggestDocumentException(msg.toString());
		}

		return vLegalSuggestDocument;
	}

	/**
	 * Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param sugId the sug ID
	 * @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByG_S(long groupId, String sugId) {
		return fetchByG_S(groupId, sugId, true);
	}

	/**
	 * Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param sugId the sug ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByG_S(long groupId, String sugId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, sugId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_S,
					finderArgs, this);
		}

		if (result instanceof VLegalSuggestDocument) {
			VLegalSuggestDocument vLegalSuggestDocument = (VLegalSuggestDocument)result;

			if ((groupId != vLegalSuggestDocument.getGroupId()) ||
					!Objects.equals(sugId, vLegalSuggestDocument.getSugId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			boolean bindSugId = false;

			if (sugId == null) {
				query.append(_FINDER_COLUMN_G_S_SUGID_1);
			}
			else if (sugId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_SUGID_3);
			}
			else {
				bindSugId = true;

				query.append(_FINDER_COLUMN_G_S_SUGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindSugId) {
					qPos.add(sugId);
				}

				List<VLegalSuggestDocument> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_S, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalSuggestDocumentPersistenceImpl.fetchByG_S(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalSuggestDocument vLegalSuggestDocument = list.get(0);

					result = vLegalSuggestDocument;

					cacheResult(vLegalSuggestDocument);

					if ((vLegalSuggestDocument.getGroupId() != groupId) ||
							(vLegalSuggestDocument.getSugId() == null) ||
							!vLegalSuggestDocument.getSugId().equals(sugId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_S,
							finderArgs, vLegalSuggestDocument);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_S, finderArgs);

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
			return (VLegalSuggestDocument)result;
		}
	}

	/**
	 * Removes the v legal suggest document where groupId = &#63; and sugId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param sugId the sug ID
	 * @return the v legal suggest document that was removed
	 */
	@Override
	public VLegalSuggestDocument removeByG_S(long groupId, String sugId)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByG_S(groupId, sugId);

		return remove(vLegalSuggestDocument);
	}

	/**
	 * Returns the number of v legal suggest documents where groupId = &#63; and sugId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param sugId the sug ID
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByG_S(long groupId, String sugId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, sugId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			boolean bindSugId = false;

			if (sugId == null) {
				query.append(_FINDER_COLUMN_G_S_SUGID_1);
			}
			else if (sugId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_SUGID_3);
			}
			else {
				bindSugId = true;

				query.append(_FINDER_COLUMN_G_S_SUGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindSugId) {
					qPos.add(sugId);
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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_SUGID_1 = "vLegalSuggestDocument.sugId IS NULL";
	private static final String _FINDER_COLUMN_G_S_SUGID_2 = "vLegalSuggestDocument.sugId = ?";
	private static final String _FINDER_COLUMN_G_S_SUGID_3 = "(vLegalSuggestDocument.sugId IS NULL OR vLegalSuggestDocument.sugId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalSuggestDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language) {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language,
		int start, int end) {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findByP_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L(long groupId, String language,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if ((groupId != vLegalSuggestDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalSuggestDocument.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

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
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_L_First(long groupId, String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_L_First(groupId,
				language, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_L_First(long groupId,
		String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_L_Last(long groupId, String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_L_Last(groupId,
				language, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_L_Last(long groupId, String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countByP_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findByP_L(groupId, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findByP_L_PrevAndNext(String sugId,
		long groupId, String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_L_PrevAndNext(session, vLegalSuggestDocument,
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

	protected VLegalSuggestDocument getByP_L_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByP_L(long groupId, String language) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_L(groupId,
				language, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByP_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

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

	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vLegalSuggestDocument.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vLegalSuggestDocument.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vLegalSuggestDocument.language IS NULL OR vLegalSuggestDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VLegalSuggestDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.APPROVED_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_A = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved) {
		return findByP_L_A(groupId, language, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved, int start, int end) {
		return findByP_L_A(groupId, language, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findByP_L_A(groupId, language, approved, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A(long groupId,
		String language, boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A;
			finderArgs = new Object[] { groupId, language, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_A;
			finderArgs = new Object[] {
					groupId, language, approved,
					
					start, end, orderByComparator
				};
		}

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if ((groupId != vLegalSuggestDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalSuggestDocument.getLanguage()) ||
							(approved != vLegalSuggestDocument.getApproved())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(approved);

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_L_A_First(long groupId,
		String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_L_A_First(groupId,
				language, approved, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_L_A_First(long groupId,
		String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findByP_L_A(groupId, language,
				approved, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_L_A_Last(long groupId,
		String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_L_A_Last(groupId,
				language, approved, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_L_A_Last(long groupId,
		String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countByP_L_A(groupId, language, approved);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findByP_L_A(groupId, language,
				approved, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findByP_L_A_PrevAndNext(String sugId,
		long groupId, String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_L_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_L_A_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_L_A_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 */
	@Override
	public void removeByP_L_A(long groupId, String language, boolean approved) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_L_A(
				groupId, language, approved, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByP_L_A(long groupId, String language, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L_A;

		Object[] finderArgs = new Object[] { groupId, language, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_P_L_A_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_1 = "vLegalSuggestDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_2 = "vLegalSuggestDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_3 = "(vLegalSuggestDocument.language IS NULL OR vLegalSuggestDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_P_L_A_APPROVED_2 = "vLegalSuggestDocument.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_L_A_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A_D =
		new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L_A_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(), String.class.getName()
			},
			VLegalSuggestDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.APPROVED_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.DRAFTID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L_A_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId) {
		return findByP_L_A_D(groupId, language, approved, draftId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId, int start, int end) {
		return findByP_L_A_D(groupId, language, approved, draftId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findByP_L_A_D(groupId, language, approved, draftId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		String language, boolean approved, String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A_D;
			finderArgs = new Object[] { groupId, language, approved, draftId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_A_D;
			finderArgs = new Object[] {
					groupId, language, approved, draftId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if ((groupId != vLegalSuggestDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalSuggestDocument.getLanguage()) ||
							(approved != vLegalSuggestDocument.getApproved()) ||
							!Objects.equals(draftId,
								vLegalSuggestDocument.getDraftId())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_A_D_APPROVED_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(approved);

				if (bindDraftId) {
					qPos.add(draftId);
				}

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_L_A_D_First(long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_L_A_D_First(groupId,
				language, approved, draftId, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_L_A_D_First(long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findByP_L_A_D(groupId, language,
				approved, draftId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByP_L_A_D_Last(long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByP_L_A_D_Last(groupId,
				language, approved, draftId, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByP_L_A_D_Last(long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countByP_L_A_D(groupId, language, approved, draftId);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findByP_L_A_D(groupId, language,
				approved, draftId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findByP_L_A_D_PrevAndNext(String sugId,
		long groupId, String language, boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByP_L_A_D_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, draftId, orderByComparator,
					true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByP_L_A_D_PrevAndNext(session, vLegalSuggestDocument,
					groupId, language, approved, draftId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByP_L_A_D_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, long groupId,
		String language, boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_A_D_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_P_L_A_D_APPROVED_2);

		boolean bindDraftId = false;

		if (draftId == null) {
			query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_1);
		}
		else if (draftId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_3);
		}
		else {
			bindDraftId = true;

			query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(approved);

		if (bindDraftId) {
			qPos.add(draftId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 */
	@Override
	public void removeByP_L_A_D(long groupId, String language,
		boolean approved, String draftId) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByP_L_A_D(
				groupId, language, approved, draftId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByP_L_A_D(long groupId, String language, boolean approved,
		String draftId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L_A_D;

		Object[] finderArgs = new Object[] { groupId, language, approved, draftId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_A_D_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_A_D_APPROVED_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_P_L_A_D_DRAFTID_2);
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

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_P_L_A_D_GROUPID_2 = "vLegalSuggestDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_LANGUAGE_1 = "vLegalSuggestDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_LANGUAGE_2 = "vLegalSuggestDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_LANGUAGE_3 = "(vLegalSuggestDocument.language IS NULL OR vLegalSuggestDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_APPROVED_2 = "vLegalSuggestDocument.approved = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_D_DRAFTID_1 = "vLegalSuggestDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_P_L_A_D_DRAFTID_2 = "vLegalSuggestDocument.draftId = ?";
	private static final String _FINDER_COLUMN_P_L_A_D_DRAFTID_3 = "(vLegalSuggestDocument.draftId IS NULL OR vLegalSuggestDocument.draftId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_D",
			new String[] {
				Boolean.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_D",
			new String[] { Boolean.class.getName(), String.class.getName() },
			VLegalSuggestDocumentModelImpl.APPROVED_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.DRAFTID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_D = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_D",
			new String[] { Boolean.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId) {
		return findByA_D(approved, draftId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId, int start, int end) {
		return findByA_D(approved, draftId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findByA_D(approved, draftId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findByA_D(boolean approved,
		String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_D;
			finderArgs = new Object[] { approved, draftId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_D;
			finderArgs = new Object[] {
					approved, draftId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if ((approved != vLegalSuggestDocument.getApproved()) ||
							!Objects.equals(draftId,
								vLegalSuggestDocument.getDraftId())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_A_D_APPROVED_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_A_D_DRAFTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				if (bindDraftId) {
					qPos.add(draftId);
				}

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByA_D_First(boolean approved,
		String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByA_D_First(approved,
				draftId, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approved=");
		msg.append(approved);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByA_D_First(boolean approved,
		String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findByA_D(approved, draftId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findByA_D_Last(boolean approved,
		String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByA_D_Last(approved,
				draftId, orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approved=");
		msg.append(approved);

		msg.append(", draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByA_D_Last(boolean approved,
		String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countByA_D(approved, draftId);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findByA_D(approved, draftId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findByA_D_PrevAndNext(String sugId,
		boolean approved, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getByA_D_PrevAndNext(session, vLegalSuggestDocument,
					approved, draftId, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getByA_D_PrevAndNext(session, vLegalSuggestDocument,
					approved, draftId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getByA_D_PrevAndNext(Session session,
		VLegalSuggestDocument vLegalSuggestDocument, boolean approved,
		String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_A_D_APPROVED_2);

		boolean bindDraftId = false;

		if (draftId == null) {
			query.append(_FINDER_COLUMN_A_D_DRAFTID_1);
		}
		else if (draftId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_D_DRAFTID_3);
		}
		else {
			bindDraftId = true;

			query.append(_FINDER_COLUMN_A_D_DRAFTID_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(approved);

		if (bindDraftId) {
			qPos.add(draftId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where approved = &#63; and draftId = &#63; from the database.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 */
	@Override
	public void removeByA_D(boolean approved, String draftId) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findByA_D(approved,
				draftId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where approved = &#63; and draftId = &#63;.
	 *
	 * @param approved the approved
	 * @param draftId the draft ID
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countByA_D(boolean approved, String draftId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_D;

		Object[] finderArgs = new Object[] { approved, draftId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_A_D_APPROVED_2);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_D_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_A_D_DRAFTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_A_D_APPROVED_2 = "vLegalSuggestDocument.approved = ? AND ";
	private static final String _FINDER_COLUMN_A_D_DRAFTID_1 = "vLegalSuggestDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_A_D_DRAFTID_2 = "vLegalSuggestDocument.draftId = ?";
	private static final String _FINDER_COLUMN_A_D_DRAFTID_3 = "(vLegalSuggestDocument.draftId IS NULL OR vLegalSuggestDocument.draftId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUGGBYDRAFTID =
		new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySuggByDraftId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUGGBYDRAFTID =
		new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySuggByDraftId",
			new String[] { String.class.getName() },
			VLegalSuggestDocumentModelImpl.DRAFTID_COLUMN_BITMASK |
			VLegalSuggestDocumentModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUGGBYDRAFTID = new FinderPath(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySuggByDraftId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal suggest documents where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId) {
		return findBySuggByDraftId(draftId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId,
		int start, int end) {
		return findBySuggByDraftId(draftId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findBySuggByDraftId(draftId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findBySuggByDraftId(String draftId,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUGGBYDRAFTID;
			finderArgs = new Object[] { draftId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUGGBYDRAFTID;
			finderArgs = new Object[] { draftId, start, end, orderByComparator };
		}

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSuggestDocument vLegalSuggestDocument : list) {
					if (!Objects.equals(draftId,
								vLegalSuggestDocument.getDraftId())) {
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

			query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDraftId) {
					qPos.add(draftId);
				}

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findBySuggByDraftId_First(String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchBySuggByDraftId_First(draftId,
				orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchBySuggByDraftId_First(String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		List<VLegalSuggestDocument> list = findBySuggByDraftId(draftId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument findBySuggByDraftId_Last(String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchBySuggByDraftId_Last(draftId,
				orderByComparator);

		if (vLegalSuggestDocument != null) {
			return vLegalSuggestDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("draftId=");
		msg.append(draftId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSuggestDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchBySuggByDraftId_Last(String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		int count = countBySuggByDraftId(draftId);

		if (count == 0) {
			return null;
		}

		List<VLegalSuggestDocument> list = findBySuggByDraftId(draftId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where draftId = &#63;.
	 *
	 * @param sugId the primary key of the current v legal suggest document
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument[] findBySuggByDraftId_PrevAndNext(
		String sugId, String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = findByPrimaryKey(sugId);

		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument[] array = new VLegalSuggestDocumentImpl[3];

			array[0] = getBySuggByDraftId_PrevAndNext(session,
					vLegalSuggestDocument, draftId, orderByComparator, true);

			array[1] = vLegalSuggestDocument;

			array[2] = getBySuggByDraftId_PrevAndNext(session,
					vLegalSuggestDocument, draftId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSuggestDocument getBySuggByDraftId_PrevAndNext(
		Session session, VLegalSuggestDocument vLegalSuggestDocument,
		String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE);

		boolean bindDraftId = false;

		if (draftId == null) {
			query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1);
		}
		else if (draftId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3);
		}
		else {
			bindDraftId = true;

			query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2);
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
			query.append(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDraftId) {
			qPos.add(draftId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSuggestDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSuggestDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal suggest documents where draftId = &#63; from the database.
	 *
	 * @param draftId the draft ID
	 */
	@Override
	public void removeBySuggByDraftId(String draftId) {
		for (VLegalSuggestDocument vLegalSuggestDocument : findBySuggByDraftId(
				draftId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the number of matching v legal suggest documents
	 */
	@Override
	public int countBySuggByDraftId(String draftId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SUGGBYDRAFTID;

		Object[] finderArgs = new Object[] { draftId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE);

			boolean bindDraftId = false;

			if (draftId == null) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1);
			}
			else if (draftId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3);
			}
			else {
				bindDraftId = true;

				query.append(_FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_1 = "vLegalSuggestDocument.draftId IS NULL";
	private static final String _FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_2 = "vLegalSuggestDocument.draftId = ?";
	private static final String _FINDER_COLUMN_SUGGBYDRAFTID_DRAFTID_3 = "(vLegalSuggestDocument.draftId IS NULL OR vLegalSuggestDocument.draftId = '')";

	public VLegalSuggestDocumentPersistenceImpl() {
		setModelClass(VLegalSuggestDocument.class);
	}

	/**
	 * Caches the v legal suggest document in the entity cache if it is enabled.
	 *
	 * @param vLegalSuggestDocument the v legal suggest document
	 */
	@Override
	public void cacheResult(VLegalSuggestDocument vLegalSuggestDocument) {
		entityCache.putResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey(), vLegalSuggestDocument);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				vLegalSuggestDocument.getGroupId(),
				vLegalSuggestDocument.getSugId()
			}, vLegalSuggestDocument);

		vLegalSuggestDocument.resetOriginalValues();
	}

	/**
	 * Caches the v legal suggest documents in the entity cache if it is enabled.
	 *
	 * @param vLegalSuggestDocuments the v legal suggest documents
	 */
	@Override
	public void cacheResult(List<VLegalSuggestDocument> vLegalSuggestDocuments) {
		for (VLegalSuggestDocument vLegalSuggestDocument : vLegalSuggestDocuments) {
			if (entityCache.getResult(
						VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalSuggestDocumentImpl.class,
						vLegalSuggestDocument.getPrimaryKey()) == null) {
				cacheResult(vLegalSuggestDocument);
			}
			else {
				vLegalSuggestDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal suggest documents.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalSuggestDocumentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal suggest document.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalSuggestDocument vLegalSuggestDocument) {
		entityCache.removeResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalSuggestDocumentModelImpl)vLegalSuggestDocument);
	}

	@Override
	public void clearCache(List<VLegalSuggestDocument> vLegalSuggestDocuments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalSuggestDocument vLegalSuggestDocument : vLegalSuggestDocuments) {
			entityCache.removeResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalSuggestDocumentImpl.class,
				vLegalSuggestDocument.getPrimaryKey());

			clearUniqueFindersCache((VLegalSuggestDocumentModelImpl)vLegalSuggestDocument);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalSuggestDocumentModelImpl vLegalSuggestDocumentModelImpl,
		boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalSuggestDocumentModelImpl.getGroupId(),
					vLegalSuggestDocumentModelImpl.getSugId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_S, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_S, args,
				vLegalSuggestDocumentModelImpl);
		}
		else {
			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getGroupId(),
						vLegalSuggestDocumentModelImpl.getSugId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_S, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_S, args,
					vLegalSuggestDocumentModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalSuggestDocumentModelImpl vLegalSuggestDocumentModelImpl) {
		Object[] args = new Object[] {
				vLegalSuggestDocumentModelImpl.getGroupId(),
				vLegalSuggestDocumentModelImpl.getSugId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_S, args);

		if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_S.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalSuggestDocumentModelImpl.getOriginalGroupId(),
					vLegalSuggestDocumentModelImpl.getOriginalSugId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_S, args);
		}
	}

	/**
	 * Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	 *
	 * @param sugId the primary key for the new v legal suggest document
	 * @return the new v legal suggest document
	 */
	@Override
	public VLegalSuggestDocument create(String sugId) {
		VLegalSuggestDocument vLegalSuggestDocument = new VLegalSuggestDocumentImpl();

		vLegalSuggestDocument.setNew(true);
		vLegalSuggestDocument.setPrimaryKey(sugId);

		vLegalSuggestDocument.setCompanyId(companyProvider.getCompanyId());

		return vLegalSuggestDocument;
	}

	/**
	 * Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sugId the primary key of the v legal suggest document
	 * @return the v legal suggest document that was removed
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument remove(String sugId)
		throws NoSuchVLegalSuggestDocumentException {
		return remove((Serializable)sugId);
	}

	/**
	 * Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal suggest document
	 * @return the v legal suggest document that was removed
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument remove(Serializable primaryKey)
		throws NoSuchVLegalSuggestDocumentException {
		Session session = null;

		try {
			session = openSession();

			VLegalSuggestDocument vLegalSuggestDocument = (VLegalSuggestDocument)session.get(VLegalSuggestDocumentImpl.class,
					primaryKey);

			if (vLegalSuggestDocument == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalSuggestDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalSuggestDocument);
		}
		catch (NoSuchVLegalSuggestDocumentException nsee) {
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
	protected VLegalSuggestDocument removeImpl(
		VLegalSuggestDocument vLegalSuggestDocument) {
		vLegalSuggestDocument = toUnwrappedModel(vLegalSuggestDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalSuggestDocument)) {
				vLegalSuggestDocument = (VLegalSuggestDocument)session.get(VLegalSuggestDocumentImpl.class,
						vLegalSuggestDocument.getPrimaryKeyObj());
			}

			if (vLegalSuggestDocument != null) {
				session.delete(vLegalSuggestDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalSuggestDocument != null) {
			clearCache(vLegalSuggestDocument);
		}

		return vLegalSuggestDocument;
	}

	@Override
	public VLegalSuggestDocument updateImpl(
		VLegalSuggestDocument vLegalSuggestDocument) {
		vLegalSuggestDocument = toUnwrappedModel(vLegalSuggestDocument);

		boolean isNew = vLegalSuggestDocument.isNew();

		VLegalSuggestDocumentModelImpl vLegalSuggestDocumentModelImpl = (VLegalSuggestDocumentModelImpl)vLegalSuggestDocument;

		Session session = null;

		try {
			session = openSession();

			if (vLegalSuggestDocument.isNew()) {
				session.save(vLegalSuggestDocument);

				vLegalSuggestDocument.setNew(false);
			}
			else {
				vLegalSuggestDocument = (VLegalSuggestDocument)session.merge(vLegalSuggestDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalSuggestDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalSuggestDocumentModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalGroupId(),
						vLegalSuggestDocumentModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_A,
					args);

				args = new Object[] {
						vLegalSuggestDocumentModelImpl.getGroupId(),
						vLegalSuggestDocumentModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_A,
					args);
			}

			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalGroupId(),
						vLegalSuggestDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);

				args = new Object[] {
						vLegalSuggestDocumentModelImpl.getGroupId(),
						vLegalSuggestDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);
			}

			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalGroupId(),
						vLegalSuggestDocumentModelImpl.getOriginalLanguage(),
						vLegalSuggestDocumentModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A,
					args);

				args = new Object[] {
						vLegalSuggestDocumentModelImpl.getGroupId(),
						vLegalSuggestDocumentModelImpl.getLanguage(),
						vLegalSuggestDocumentModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A,
					args);
			}

			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalGroupId(),
						vLegalSuggestDocumentModelImpl.getOriginalLanguage(),
						vLegalSuggestDocumentModelImpl.getOriginalApproved(),
						vLegalSuggestDocumentModelImpl.getOriginalDraftId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_A_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A_D,
					args);

				args = new Object[] {
						vLegalSuggestDocumentModelImpl.getGroupId(),
						vLegalSuggestDocumentModelImpl.getLanguage(),
						vLegalSuggestDocumentModelImpl.getApproved(),
						vLegalSuggestDocumentModelImpl.getDraftId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_A_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A_D,
					args);
			}

			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalApproved(),
						vLegalSuggestDocumentModelImpl.getOriginalDraftId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_D,
					args);

				args = new Object[] {
						vLegalSuggestDocumentModelImpl.getApproved(),
						vLegalSuggestDocumentModelImpl.getDraftId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_D,
					args);
			}

			if ((vLegalSuggestDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUGGBYDRAFTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSuggestDocumentModelImpl.getOriginalDraftId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUGGBYDRAFTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUGGBYDRAFTID,
					args);

				args = new Object[] { vLegalSuggestDocumentModelImpl.getDraftId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUGGBYDRAFTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUGGBYDRAFTID,
					args);
			}
		}

		entityCache.putResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSuggestDocumentImpl.class,
			vLegalSuggestDocument.getPrimaryKey(), vLegalSuggestDocument, false);

		clearUniqueFindersCache(vLegalSuggestDocumentModelImpl);
		cacheUniqueFindersCache(vLegalSuggestDocumentModelImpl, isNew);

		vLegalSuggestDocument.resetOriginalValues();

		return vLegalSuggestDocument;
	}

	protected VLegalSuggestDocument toUnwrappedModel(
		VLegalSuggestDocument vLegalSuggestDocument) {
		if (vLegalSuggestDocument instanceof VLegalSuggestDocumentImpl) {
			return vLegalSuggestDocument;
		}

		VLegalSuggestDocumentImpl vLegalSuggestDocumentImpl = new VLegalSuggestDocumentImpl();

		vLegalSuggestDocumentImpl.setNew(vLegalSuggestDocument.isNew());
		vLegalSuggestDocumentImpl.setPrimaryKey(vLegalSuggestDocument.getPrimaryKey());

		vLegalSuggestDocumentImpl.setSugId(vLegalSuggestDocument.getSugId());
		vLegalSuggestDocumentImpl.setGroupId(vLegalSuggestDocument.getGroupId());
		vLegalSuggestDocumentImpl.setCompanyId(vLegalSuggestDocument.getCompanyId());
		vLegalSuggestDocumentImpl.setUserId(vLegalSuggestDocument.getUserId());
		vLegalSuggestDocumentImpl.setCreatedDate(vLegalSuggestDocument.getCreatedDate());
		vLegalSuggestDocumentImpl.setModifiedDate(vLegalSuggestDocument.getModifiedDate());
		vLegalSuggestDocumentImpl.setModifiedByUser(vLegalSuggestDocument.getModifiedByUser());
		vLegalSuggestDocumentImpl.setApproved(vLegalSuggestDocument.isApproved());
		vLegalSuggestDocumentImpl.setApprovedByUser(vLegalSuggestDocument.getApprovedByUser());
		vLegalSuggestDocumentImpl.setApprovedDate(vLegalSuggestDocument.getApprovedDate());
		vLegalSuggestDocumentImpl.setTitle(vLegalSuggestDocument.getTitle());
		vLegalSuggestDocumentImpl.setContent(vLegalSuggestDocument.getContent());
		vLegalSuggestDocumentImpl.setLanguage(vLegalSuggestDocument.getLanguage());
		vLegalSuggestDocumentImpl.setVisitorName(vLegalSuggestDocument.getVisitorName());
		vLegalSuggestDocumentImpl.setVisitorEmail(vLegalSuggestDocument.getVisitorEmail());
		vLegalSuggestDocumentImpl.setVisitorTel(vLegalSuggestDocument.getVisitorTel());
		vLegalSuggestDocumentImpl.setVisitorAddress(vLegalSuggestDocument.getVisitorAddress());
		vLegalSuggestDocumentImpl.setDraftId(vLegalSuggestDocument.getDraftId());
		vLegalSuggestDocumentImpl.setHasAttachment(vLegalSuggestDocument.isHasAttachment());

		return vLegalSuggestDocumentImpl;
	}

	/**
	 * Returns the v legal suggest document with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal suggest document
	 * @return the v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalSuggestDocumentException {
		VLegalSuggestDocument vLegalSuggestDocument = fetchByPrimaryKey(primaryKey);

		if (vLegalSuggestDocument == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalSuggestDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalSuggestDocument;
	}

	/**
	 * Returns the v legal suggest document with the primary key or throws a {@link NoSuchVLegalSuggestDocumentException} if it could not be found.
	 *
	 * @param sugId the primary key of the v legal suggest document
	 * @return the v legal suggest document
	 * @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument findByPrimaryKey(String sugId)
		throws NoSuchVLegalSuggestDocumentException {
		return findByPrimaryKey((Serializable)sugId);
	}

	/**
	 * Returns the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal suggest document
	 * @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalSuggestDocumentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalSuggestDocument vLegalSuggestDocument = (VLegalSuggestDocument)serializable;

		if (vLegalSuggestDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalSuggestDocument = (VLegalSuggestDocument)session.get(VLegalSuggestDocumentImpl.class,
						primaryKey);

				if (vLegalSuggestDocument != null) {
					cacheResult(vLegalSuggestDocument);
				}
				else {
					entityCache.putResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalSuggestDocumentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalSuggestDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalSuggestDocument;
	}

	/**
	 * Returns the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sugId the primary key of the v legal suggest document
	 * @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	 */
	@Override
	public VLegalSuggestDocument fetchByPrimaryKey(String sugId) {
		return fetchByPrimaryKey((Serializable)sugId);
	}

	@Override
	public Map<Serializable, VLegalSuggestDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalSuggestDocument> map = new HashMap<Serializable, VLegalSuggestDocument>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalSuggestDocument vLegalSuggestDocument = fetchByPrimaryKey(primaryKey);

			if (vLegalSuggestDocument != null) {
				map.put(primaryKey, vLegalSuggestDocument);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalSuggestDocumentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalSuggestDocument)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE_PKS_IN);

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

			for (VLegalSuggestDocument vLegalSuggestDocument : (List<VLegalSuggestDocument>)q.list()) {
				map.put(vLegalSuggestDocument.getPrimaryKeyObj(),
					vLegalSuggestDocument);

				cacheResult(vLegalSuggestDocument);

				uncachedPrimaryKeys.remove(vLegalSuggestDocument.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalSuggestDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalSuggestDocumentImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal suggest documents.
	 *
	 * @return the v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal suggest documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @return the range of v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findAll(int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal suggest documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal suggest documents
	 * @param end the upper bound of the range of v legal suggest documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal suggest documents
	 */
	@Override
	public List<VLegalSuggestDocument> findAll(int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
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

		List<VLegalSuggestDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSuggestDocument>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALSUGGESTDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALSUGGESTDOCUMENT;

				if (pagination) {
					sql = sql.concat(VLegalSuggestDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSuggestDocument>)QueryUtil.list(q,
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
	 * Removes all the v legal suggest documents from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalSuggestDocument vLegalSuggestDocument : findAll()) {
			remove(vLegalSuggestDocument);
		}
	}

	/**
	 * Returns the number of v legal suggest documents.
	 *
	 * @return the number of v legal suggest documents
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALSUGGESTDOCUMENT);

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
		return VLegalSuggestDocumentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal suggest document persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalSuggestDocumentImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALSUGGESTDOCUMENT = "SELECT vLegalSuggestDocument FROM VLegalSuggestDocument vLegalSuggestDocument";
	private static final String _SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE_PKS_IN = "SELECT vLegalSuggestDocument FROM VLegalSuggestDocument vLegalSuggestDocument WHERE sugId IN (";
	private static final String _SQL_SELECT_VLEGALSUGGESTDOCUMENT_WHERE = "SELECT vLegalSuggestDocument FROM VLegalSuggestDocument vLegalSuggestDocument WHERE ";
	private static final String _SQL_COUNT_VLEGALSUGGESTDOCUMENT = "SELECT COUNT(vLegalSuggestDocument) FROM VLegalSuggestDocument vLegalSuggestDocument";
	private static final String _SQL_COUNT_VLEGALSUGGESTDOCUMENT_WHERE = "SELECT COUNT(vLegalSuggestDocument) FROM VLegalSuggestDocument vLegalSuggestDocument WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalSuggestDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalSuggestDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalSuggestDocument exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalSuggestDocumentPersistenceImpl.class);
}