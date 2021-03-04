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

import vn.gov.hoabinh.exception.NoSuchVLegalDocumentException;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.model.impl.VLegalDocumentImpl;
import vn.gov.hoabinh.model.impl.VLegalDocumentModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalDocumentPersistence;

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
 * The persistence implementation for the v legal document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalDocumentUtil
 * @generated
 */
@ProviderType
public class VLegalDocumentPersistenceImpl extends BasePersistenceImpl<VLegalDocument>
	implements VLegalDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalDocumentUtil} to access the v legal document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
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

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByGroupId_First(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByGroupId_Last(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByGroupId_PrevAndNext(String docId,
		long groupId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalDocument,
					groupId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByGroupId_PrevAndNext(session, vLegalDocument,
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

	protected VLegalDocument getByGroupId_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalDocument vLegalDocument : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalDocument.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L(long groupId, String language,
		int start, int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L(long groupId, String language,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_First(long groupId, String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_First(long groupId, String language,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_Last(long groupId, String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_Last(long groupId, String language,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L(groupId, language, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_PrevAndNext(String docId, long groupId,
		String language, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vLegalDocument, groupId,
					language, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_PrevAndNext(session, vLegalDocument, groupId,
					language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (VLegalDocument vLegalDocument : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vLegalDocument.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vLegalDocument.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocsByF_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDocsByF_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.TYPEDOCID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.ORGID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocsByF_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc) {
		return findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end) {
		return findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S;
			finderArgs = new Object[] {
					groupId, typeDocId, orgId, fieldId, language, statusDoc
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S;
			finderArgs = new Object[] {
					groupId, typeDocId, orgId, fieldId, language, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(typeDocId,
								vLegalDocument.getTypeDocId()) ||
							!Objects.equals(orgId, vLegalDocument.getOrgId()) ||
							!Objects.equals(fieldId, vLegalDocument.getFieldId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2);

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				if (bindOrgId) {
					qPos.add(orgId);
				}

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByDocsByF_O_T_L_S_First(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByDocsByF_O_T_L_S_First(groupId,
				typeDocId, orgId, fieldId, language, statusDoc,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByDocsByF_O_T_L_S_First(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByDocsByF_O_T_L_S(groupId, typeDocId,
				orgId, fieldId, language, statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByDocsByF_O_T_L_S_Last(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByDocsByF_O_T_L_S_Last(groupId,
				typeDocId, orgId, fieldId, language, statusDoc,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(14);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByDocsByF_O_T_L_S_Last(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
				language, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByDocsByF_O_T_L_S(groupId, typeDocId,
				orgId, fieldId, language, statusDoc, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByDocsByF_O_T_L_S_PrevAndNext(String docId,
		long groupId, String typeDocId, String orgId, String fieldId,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByF_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, typeDocId, orgId, fieldId,
					language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByF_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, typeDocId, orgId, fieldId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByF_O_T_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(9 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(8);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2);

		boolean bindTypeDocId = false;

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1);
		}
		else if (typeDocId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3);
		}
		else {
			bindTypeDocId = true;

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2);
		}

		boolean bindOrgId = false;

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1);
		}
		else if (orgId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3);
		}
		else {
			bindOrgId = true;

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2);
		}

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2);
		}

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindTypeDocId) {
			qPos.add(typeDocId);
		}

		if (bindOrgId) {
			qPos.add(orgId);
		}

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByDocsByF_O_T_L_S(long groupId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc) {
		for (VLegalDocument vLegalDocument : findByDocsByF_O_T_L_S(groupId,
				typeDocId, orgId, fieldId, language, statusDoc,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeDocId the type doc ID
	 * @param orgId the org ID
	 * @param fieldId the field ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByDocsByF_O_T_L_S(long groupId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S;

		Object[] finderArgs = new Object[] {
				groupId, typeDocId, orgId, fieldId, language, statusDoc
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2);

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				if (bindOrgId) {
					qPos.add(orgId);
				}

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocsByG_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDocsByG_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.ORGID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.TYPEDOCID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocsByG_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc) {
		return findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		int start, int end) {
		return findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S;
			finderArgs = new Object[] {
					groupId, orgId, typeDocId, language, statusDoc
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S;
			finderArgs = new Object[] {
					groupId, orgId, typeDocId, language, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(orgId, vLegalDocument.getOrgId()) ||
							!Objects.equals(typeDocId,
								vLegalDocument.getTypeDocId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2);

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2);
			}

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindOrgId) {
					qPos.add(orgId);
				}

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByDocsByG_O_T_L_S_First(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByDocsByG_O_T_L_S_First(groupId,
				orgId, typeDocId, language, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByDocsByG_O_T_L_S_First(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByDocsByG_O_T_L_S(groupId, orgId,
				typeDocId, language, statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByDocsByG_O_T_L_S_Last(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByDocsByG_O_T_L_S_Last(groupId,
				orgId, typeDocId, language, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByDocsByG_O_T_L_S_Last(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
				statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByDocsByG_O_T_L_S(groupId, orgId,
				typeDocId, language, statusDoc, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByDocsByG_O_T_L_S_PrevAndNext(String docId,
		long groupId, String orgId, String typeDocId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByG_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, orgId, typeDocId, language,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByG_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, orgId, typeDocId, language,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByG_O_T_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String orgId,
		String typeDocId, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(8 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(7);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2);

		boolean bindOrgId = false;

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1);
		}
		else if (orgId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3);
		}
		else {
			bindOrgId = true;

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2);
		}

		boolean bindTypeDocId = false;

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1);
		}
		else if (typeDocId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3);
		}
		else {
			bindTypeDocId = true;

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2);
		}

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindOrgId) {
			qPos.add(orgId);
		}

		if (bindTypeDocId) {
			qPos.add(typeDocId);
		}

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByDocsByG_O_T_L_S(long groupId, String orgId,
		String typeDocId, String language, int statusDoc) {
		for (VLegalDocument vLegalDocument : findByDocsByG_O_T_L_S(groupId,
				orgId, typeDocId, language, statusDoc, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByDocsByG_O_T_L_S(long groupId, String orgId,
		String typeDocId, String language, int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S;

		Object[] finderArgs = new Object[] {
				groupId, orgId, typeDocId, language, statusDoc
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2);

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2);
			}

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindOrgId) {
					qPos.add(orgId);
				}

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCSBYT_L =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDocsByT_L",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYT_L =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDocsByT_L",
			new String[] { String.class.getName(), String.class.getName() },
			VLegalDocumentModelImpl.TYPEDOCID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYT_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocsByT_L",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language) {
		return findByDocsByT_L(typeDocId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language, int start, int end) {
		return findByDocsByT_L(typeDocId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByDocsByT_L(typeDocId, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYT_L;
			finderArgs = new Object[] { typeDocId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCSBYT_L;
			finderArgs = new Object[] {
					typeDocId, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if (!Objects.equals(typeDocId, vLegalDocument.getTypeDocId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByDocsByT_L_First(String typeDocId,
		String language, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByDocsByT_L_First(typeDocId,
				language, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeDocId=");
		msg.append(typeDocId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByDocsByT_L_First(String typeDocId,
		String language, OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByDocsByT_L(typeDocId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByDocsByT_L_Last(String typeDocId,
		String language, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByDocsByT_L_Last(typeDocId,
				language, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeDocId=");
		msg.append(typeDocId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByDocsByT_L_Last(String typeDocId,
		String language, OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByDocsByT_L(typeDocId, language);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByDocsByT_L(typeDocId, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByDocsByT_L_PrevAndNext(String docId,
		String typeDocId, String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByT_L_PrevAndNext(session, vLegalDocument,
					typeDocId, language, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByT_L_PrevAndNext(session, vLegalDocument,
					typeDocId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByT_L_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String typeDocId, String language,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		boolean bindTypeDocId = false;

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1);
		}
		else if (typeDocId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3);
		}
		else {
			bindTypeDocId = true;

			query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2);
		}

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2);
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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTypeDocId) {
			qPos.add(typeDocId);
		}

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where typeDocId = &#63; and language = &#63; from the database.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 */
	@Override
	public void removeByDocsByT_L(String typeDocId, String language) {
		for (VLegalDocument vLegalDocument : findByDocsByT_L(typeDocId,
				language, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc ID
	 * @param language the language
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByDocsByT_L(String typeDocId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCSBYT_L;

		Object[] finderArgs = new Object[] { typeDocId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

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

	private static final String _FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = '') AND ";
	private static final String _FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1 = "vLegalDocument.language IS NULL";
	private static final String _FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2 = "vLegalDocument.language = ?";
	private static final String _FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_U_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_U_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_U_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.USERID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_U_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc) {
		return findByG_L_U_S(groupId, language, userId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc, int start, int end) {
		return findByG_L_U_S(groupId, language, userId, statusDoc, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_U_S(groupId, language, userId, statusDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_U_S;
			finderArgs = new Object[] { groupId, language, userId, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_U_S;
			finderArgs = new Object[] {
					groupId, language, userId, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							(userId != vLegalDocument.getUserId()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_U_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_U_S_USERID_2);

			query.append(_FINDER_COLUMN_G_L_U_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(userId);

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_U_S_First(long groupId, String language,
		long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_U_S_First(groupId, language,
				userId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_U_S_First(long groupId, String language,
		long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_U_S(groupId, language, userId,
				statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_U_S_Last(long groupId, String language,
		long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_U_S_Last(groupId, language,
				userId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_U_S_Last(long groupId, String language,
		long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_U_S(groupId, language, userId, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_U_S(groupId, language, userId,
				statusDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_U_S_PrevAndNext(String docId,
		long groupId, String language, long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_U_S_PrevAndNext(session, vLegalDocument,
					groupId, language, userId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_U_S_PrevAndNext(session, vLegalDocument,
					groupId, language, userId, statusDoc, orderByComparator,
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

	protected VLegalDocument getByG_L_U_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_U_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_U_S_USERID_2);

		query.append(_FINDER_COLUMN_G_L_U_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(userId);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByG_L_U_S(long groupId, String language, long userId,
		int statusDoc) {
		for (VLegalDocument vLegalDocument : findByG_L_U_S(groupId, language,
				userId, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param userId the user ID
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_U_S(long groupId, String language, long userId,
		int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_U_S;

		Object[] finderArgs = new Object[] { groupId, language, userId, statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_U_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_U_S_USERID_2);

			query.append(_FINDER_COLUMN_G_L_U_S_STATUSDOC_2);

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

				qPos.add(userId);

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_G_L_U_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_USERID_2 = "vLegalDocument.userId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_D = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByG_D",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.DOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_D = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_D",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal document where groupId = &#63; and docId = &#63; or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param docId the doc ID
	 * @return the matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_D(long groupId, String docId)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_D(groupId, docId);

		if (vLegalDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalDocumentException(msg.toString());
		}

		return vLegalDocument;
	}

	/**
	 * Returns the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param docId the doc ID
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_D(long groupId, String docId) {
		return fetchByG_D(groupId, docId, true);
	}

	/**
	 * Returns the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param docId the doc ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_D(long groupId, String docId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, docId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_D,
					finderArgs, this);
		}

		if (result instanceof VLegalDocument) {
			VLegalDocument vLegalDocument = (VLegalDocument)result;

			if ((groupId != vLegalDocument.getGroupId()) ||
					!Objects.equals(docId, vLegalDocument.getDocId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_D_DOCID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDocId) {
					qPos.add(docId);
				}

				List<VLegalDocument> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_D, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalDocumentPersistenceImpl.fetchByG_D(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalDocument vLegalDocument = list.get(0);

					result = vLegalDocument;

					cacheResult(vLegalDocument);

					if ((vLegalDocument.getGroupId() != groupId) ||
							(vLegalDocument.getDocId() == null) ||
							!vLegalDocument.getDocId().equals(docId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_D,
							finderArgs, vLegalDocument);
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
			return (VLegalDocument)result;
		}
	}

	/**
	 * Removes the v legal document where groupId = &#63; and docId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param docId the doc ID
	 * @return the v legal document that was removed
	 */
	@Override
	public VLegalDocument removeByG_D(long groupId, String docId)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByG_D(groupId, docId);

		return remove(vLegalDocument);
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and docId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param docId the doc ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_D(long groupId, String docId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_D;

		Object[] finderArgs = new Object[] { groupId, docId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_D_DOCID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindDocId) {
					qPos.add(docId);
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

	private static final String _FINDER_COLUMN_G_D_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_D_DOCID_1 = "vLegalDocument.docId IS NULL";
	private static final String _FINDER_COLUMN_G_D_DOCID_2 = "vLegalDocument.docId = ?";
	private static final String _FINDER_COLUMN_G_D_DOCID_3 = "(vLegalDocument.docId IS NULL OR vLegalDocument.docId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_P_N_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByP_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.NUM_COLUMN_BITMASK |
			VLegalDocumentModelImpl.SYMBOL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_N_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param num the num
	 * @param symbol the symbol
	 * @return the matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByP_N_S(long groupId, String num, String symbol)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByP_N_S(groupId, num, symbol);

		if (vLegalDocument == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", num=");
			msg.append(num);

			msg.append(", symbol=");
			msg.append(symbol);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalDocumentException(msg.toString());
		}

		return vLegalDocument;
	}

	/**
	 * Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param num the num
	 * @param symbol the symbol
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByP_N_S(long groupId, String num, String symbol) {
		return fetchByP_N_S(groupId, num, symbol, true);
	}

	/**
	 * Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param num the num
	 * @param symbol the symbol
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByP_N_S(long groupId, String num, String symbol,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, num, symbol };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_P_N_S,
					finderArgs, this);
		}

		if (result instanceof VLegalDocument) {
			VLegalDocument vLegalDocument = (VLegalDocument)result;

			if ((groupId != vLegalDocument.getGroupId()) ||
					!Objects.equals(num, vLegalDocument.getNum()) ||
					!Objects.equals(symbol, vLegalDocument.getSymbol())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_N_S_GROUPID_2);

			boolean bindNum = false;

			if (num == null) {
				query.append(_FINDER_COLUMN_P_N_S_NUM_1);
			}
			else if (num.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_S_NUM_3);
			}
			else {
				bindNum = true;

				query.append(_FINDER_COLUMN_P_N_S_NUM_2);
			}

			boolean bindSymbol = false;

			if (symbol == null) {
				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_1);
			}
			else if (symbol.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_3);
			}
			else {
				bindSymbol = true;

				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindNum) {
					qPos.add(num);
				}

				if (bindSymbol) {
					qPos.add(symbol);
				}

				List<VLegalDocument> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_S,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalDocumentPersistenceImpl.fetchByP_N_S(long, String, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalDocument vLegalDocument = list.get(0);

					result = vLegalDocument;

					cacheResult(vLegalDocument);

					if ((vLegalDocument.getGroupId() != groupId) ||
							(vLegalDocument.getNum() == null) ||
							!vLegalDocument.getNum().equals(num) ||
							(vLegalDocument.getSymbol() == null) ||
							!vLegalDocument.getSymbol().equals(symbol)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_S,
							finderArgs, vLegalDocument);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N_S, finderArgs);

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
			return (VLegalDocument)result;
		}
	}

	/**
	 * Removes the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param num the num
	 * @param symbol the symbol
	 * @return the v legal document that was removed
	 */
	@Override
	public VLegalDocument removeByP_N_S(long groupId, String num, String symbol)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByP_N_S(groupId, num, symbol);

		return remove(vLegalDocument);
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and num = &#63; and symbol = &#63;.
	 *
	 * @param groupId the group ID
	 * @param num the num
	 * @param symbol the symbol
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByP_N_S(long groupId, String num, String symbol) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_N_S;

		Object[] finderArgs = new Object[] { groupId, num, symbol };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_N_S_GROUPID_2);

			boolean bindNum = false;

			if (num == null) {
				query.append(_FINDER_COLUMN_P_N_S_NUM_1);
			}
			else if (num.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_S_NUM_3);
			}
			else {
				bindNum = true;

				query.append(_FINDER_COLUMN_P_N_S_NUM_2);
			}

			boolean bindSymbol = false;

			if (symbol == null) {
				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_1);
			}
			else if (symbol.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_3);
			}
			else {
				bindSymbol = true;

				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindNum) {
					qPos.add(num);
				}

				if (bindSymbol) {
					qPos.add(symbol);
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

	private static final String _FINDER_COLUMN_P_N_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_N_S_NUM_1 = "vLegalDocument.num IS NULL AND ";
	private static final String _FINDER_COLUMN_P_N_S_NUM_2 = "vLegalDocument.num = ? AND ";
	private static final String _FINDER_COLUMN_P_N_S_NUM_3 = "(vLegalDocument.num IS NULL OR vLegalDocument.num = '') AND ";
	private static final String _FINDER_COLUMN_P_N_S_SYMBOL_1 = "vLegalDocument.symbol IS NULL";
	private static final String _FINDER_COLUMN_P_N_S_SYMBOL_2 = "vLegalDocument.symbol = ?";
	private static final String _FINDER_COLUMN_P_N_S_SYMBOL_3 = "(vLegalDocument.symbol IS NULL OR vLegalDocument.symbol = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByP_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc) {
		return findByP_L_S(groupId, language, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc, int start, int end) {
		return findByP_L_S(groupId, language, statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByP_L_S(groupId, language, statusDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S;
			finderArgs = new Object[] { groupId, language, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_S;
			finderArgs = new Object[] {
					groupId, language, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByP_L_S_First(long groupId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByP_L_S_First(groupId, language,
				statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByP_L_S_First(long groupId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByP_L_S(groupId, language, statusDoc,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByP_L_S_Last(long groupId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByP_L_S_Last(groupId, language,
				statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByP_L_S_Last(long groupId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByP_L_S(groupId, language, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByP_L_S(groupId, language, statusDoc,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByP_L_S_PrevAndNext(String docId, long groupId,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByP_L_S_PrevAndNext(session, vLegalDocument, groupId,
					language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByP_L_S_PrevAndNext(session, vLegalDocument, groupId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByP_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_P_L_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByP_L_S(long groupId, String language, int statusDoc) {
		for (VLegalDocument vLegalDocument : findByP_L_S(groupId, language,
				statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByP_L_S(long groupId, String language, int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L_S;

		Object[] finderArgs = new Object[] { groupId, language, statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_S_STATUSDOC_2);

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

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_P_L_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_P_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSDOC =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBystatusDoc",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSDOC =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatusDoc",
			new String[] { Integer.class.getName() },
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUSDOC = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatusDoc",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findBystatusDoc(int statusDoc) {
		return findBystatusDoc(statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findBystatusDoc(int statusDoc, int start,
		int end) {
		return findBystatusDoc(statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findBystatusDoc(int statusDoc, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return findBystatusDoc(statusDoc, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findBystatusDoc(int statusDoc, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSDOC;
			finderArgs = new Object[] { statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUSDOC;
			finderArgs = new Object[] { statusDoc, start, end, orderByComparator };
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUSDOC_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findBystatusDoc_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchBystatusDoc_First(statusDoc,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchBystatusDoc_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findBystatusDoc(statusDoc, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findBystatusDoc_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchBystatusDoc_Last(statusDoc,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchBystatusDoc_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countBystatusDoc(statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findBystatusDoc(statusDoc, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findBystatusDoc_PrevAndNext(String docId,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getBystatusDoc_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getBystatusDoc_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getBystatusDoc_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUSDOC_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where statusDoc = &#63; from the database.
	 *
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeBystatusDoc(int statusDoc) {
		for (VLegalDocument vLegalDocument : findBystatusDoc(statusDoc,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countBystatusDoc(int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUSDOC;

		Object[] finderArgs = new Object[] { statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUSDOC_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_STATUSDOC_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_O_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_O_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_O_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.ORGID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_O_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_O_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc) {
		return findByG_L_O_S(groupId, language, orgId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc, int start, int end) {
		return findByG_L_O_S(groupId, language, orgId, statusDoc, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_O_S(groupId, language, orgId, statusDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O_S;
			finderArgs = new Object[] { groupId, language, orgId, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_O_S;
			finderArgs = new Object[] {
					groupId, language, orgId, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(orgId, vLegalDocument.getOrgId()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_2);
			}

			query.append(_FINDER_COLUMN_G_L_O_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindOrgId) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_O_S_First(long groupId, String language,
		String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_O_S_First(groupId, language,
				orgId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_O_S_First(long groupId, String language,
		String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_O_S(groupId, language, orgId,
				statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_O_S_Last(long groupId, String language,
		String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_O_S_Last(groupId, language,
				orgId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_O_S_Last(long groupId, String language,
		String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_O_S(groupId, language, orgId, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_O_S(groupId, language, orgId,
				statusDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_O_S_PrevAndNext(String docId,
		long groupId, String language, String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_O_S_PrevAndNext(session, vLegalDocument,
					groupId, language, orgId, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_O_S_PrevAndNext(session, vLegalDocument,
					groupId, language, orgId, statusDoc, orderByComparator,
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

	protected VLegalDocument getByG_L_O_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_O_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_2);
		}

		boolean bindOrgId = false;

		if (orgId == null) {
			query.append(_FINDER_COLUMN_G_L_O_S_ORGID_1);
		}
		else if (orgId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_O_S_ORGID_3);
		}
		else {
			bindOrgId = true;

			query.append(_FINDER_COLUMN_G_L_O_S_ORGID_2);
		}

		query.append(_FINDER_COLUMN_G_L_O_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindOrgId) {
			qPos.add(orgId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByG_L_O_S(long groupId, String language, String orgId,
		int statusDoc) {
		for (VLegalDocument vLegalDocument : findByG_L_O_S(groupId, language,
				orgId, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_O_S(long groupId, String language, String orgId,
		int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_O_S;

		Object[] finderArgs = new Object[] { groupId, language, orgId, statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_2);
			}

			query.append(_FINDER_COLUMN_G_L_O_S_STATUSDOC_2);

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

				if (bindOrgId) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_G_L_O_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_T_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_T_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.TYPEDOCID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_T_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_T_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc) {
		return findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc, int start, int end) {
		return findByG_L_T_S(groupId, language, typeDocId, statusDoc, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_T_S(groupId, language, typeDocId, statusDoc, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T_S;
			finderArgs = new Object[] { groupId, language, typeDocId, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T_S;
			finderArgs = new Object[] {
					groupId, language, typeDocId, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(typeDocId,
								vLegalDocument.getTypeDocId()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_2);
			}

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_2);
			}

			query.append(_FINDER_COLUMN_G_L_T_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_T_S_First(long groupId, String language,
		String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_T_S_First(groupId, language,
				typeDocId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_T_S_First(long groupId, String language,
		String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_T_S(groupId, language, typeDocId,
				statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_T_S_Last(long groupId, String language,
		String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_T_S_Last(groupId, language,
				typeDocId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_T_S_Last(long groupId, String language,
		String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_T_S(groupId, language, typeDocId, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_T_S(groupId, language, typeDocId,
				statusDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_T_S_PrevAndNext(String docId,
		long groupId, String language, String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_T_S_PrevAndNext(session, vLegalDocument,
					groupId, language, typeDocId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_T_S_PrevAndNext(session, vLegalDocument,
					groupId, language, typeDocId, statusDoc, orderByComparator,
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

	protected VLegalDocument getByG_L_T_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_T_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_2);
		}

		boolean bindTypeDocId = false;

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_1);
		}
		else if (typeDocId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_3);
		}
		else {
			bindTypeDocId = true;

			query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_2);
		}

		query.append(_FINDER_COLUMN_G_L_T_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindTypeDocId) {
			qPos.add(typeDocId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc) {
		for (VLegalDocument vLegalDocument : findByG_L_T_S(groupId, language,
				typeDocId, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_T_S(long groupId, String language, String typeDocId,
		int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_T_S;

		Object[] finderArgs = new Object[] {
				groupId, language, typeDocId, statusDoc
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_2);
			}

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_2);
			}

			query.append(_FINDER_COLUMN_G_L_T_S_STATUSDOC_2);

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

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_G_L_T_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc) {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end) {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S;
			finderArgs = new Object[] { groupId, language, fieldId, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S;
			finderArgs = new Object[] {
					groupId, language, fieldId, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(fieldId, vLegalDocument.getFieldId()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_F_S_First(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_F_S_First(groupId, language,
				fieldId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_F_S_First(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_F_S_Last(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_F_S_Last(groupId, language,
				fieldId, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_F_S_Last(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_F_S(groupId, language, fieldId, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_F_S_PrevAndNext(String docId,
		long groupId, String language, String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_F_S_PrevAndNext(session, vLegalDocument,
					groupId, language, fieldId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_F_S_PrevAndNext(session, vLegalDocument,
					groupId, language, fieldId, statusDoc, orderByComparator,
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

	protected VLegalDocument getByG_L_F_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
		}

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
		}

		query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) {
		for (VLegalDocument vLegalDocument : findByG_L_F_S(groupId, language,
				fieldId, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_F_S;

		Object[] finderArgs = new Object[] { groupId, language, fieldId, statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

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

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_G_L_F_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.ORGID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId) {
		return findByG_L_O(groupId, language, orgId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId, int start, int end) {
		return findByG_L_O(groupId, language, orgId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_O(groupId, language, orgId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O;
			finderArgs = new Object[] { groupId, language, orgId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_O;
			finderArgs = new Object[] {
					groupId, language, orgId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(orgId, vLegalDocument.getOrgId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_L_O_ORGID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindOrgId) {
					qPos.add(orgId);
				}

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_O_First(long groupId, String language,
		String orgId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_O_First(groupId, language,
				orgId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_O_First(long groupId, String language,
		String orgId, OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_O(groupId, language, orgId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_O_Last(long groupId, String language,
		String orgId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_O_Last(groupId, language,
				orgId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_O_Last(long groupId, String language,
		String orgId, OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_O(groupId, language, orgId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_O(groupId, language, orgId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_O_PrevAndNext(String docId, long groupId,
		String language, String orgId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_O_PrevAndNext(session, vLegalDocument, groupId,
					language, orgId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_O_PrevAndNext(session, vLegalDocument, groupId,
					language, orgId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_O_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String orgId, OrderByComparator<VLegalDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_O_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_2);
		}

		boolean bindOrgId = false;

		if (orgId == null) {
			query.append(_FINDER_COLUMN_G_L_O_ORGID_1);
		}
		else if (orgId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_O_ORGID_3);
		}
		else {
			bindOrgId = true;

			query.append(_FINDER_COLUMN_G_L_O_ORGID_2);
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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindOrgId) {
			qPos.add(orgId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 */
	@Override
	public void removeByG_L_O(long groupId, String language, String orgId) {
		for (VLegalDocument vLegalDocument : findByG_L_O(groupId, language,
				orgId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_O(long groupId, String language, String orgId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_O;

		Object[] finderArgs = new Object[] { groupId, language, orgId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_L_O_ORGID_2);
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

				if (bindOrgId) {
					qPos.add(orgId);
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

	private static final String _FINDER_COLUMN_G_L_O_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_O_ORGID_1 = "vLegalDocument.orgId IS NULL";
	private static final String _FINDER_COLUMN_G_L_O_ORGID_2 = "vLegalDocument.orgId = ?";
	private static final String _FINDER_COLUMN_G_L_O_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.TYPEDOCID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_T = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId) {
		return findByG_L_T(groupId, language, typeDocId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId, int start, int end) {
		return findByG_L_T(groupId, language, typeDocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_T(groupId, language, typeDocId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T;
			finderArgs = new Object[] { groupId, language, typeDocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T;
			finderArgs = new Object[] {
					groupId, language, typeDocId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(typeDocId,
								vLegalDocument.getTypeDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
			}

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_T_First(long groupId, String language,
		String typeDocId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_T_First(groupId, language,
				typeDocId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_T_First(long groupId, String language,
		String typeDocId, OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_T(groupId, language, typeDocId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_T_Last(long groupId, String language,
		String typeDocId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_T_Last(groupId, language,
				typeDocId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_T_Last(long groupId, String language,
		String typeDocId, OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_T(groupId, language, typeDocId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_T(groupId, language, typeDocId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_T_PrevAndNext(String docId, long groupId,
		String language, String typeDocId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_T_PrevAndNext(session, vLegalDocument, groupId,
					language, typeDocId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_T_PrevAndNext(session, vLegalDocument, groupId,
					language, typeDocId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_T_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String typeDocId, OrderByComparator<VLegalDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
		}

		boolean bindTypeDocId = false;

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_1);
		}
		else if (typeDocId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_3);
		}
		else {
			bindTypeDocId = true;

			query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_2);
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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindTypeDocId) {
			qPos.add(typeDocId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 */
	@Override
	public void removeByG_L_T(long groupId, String language, String typeDocId) {
		for (VLegalDocument vLegalDocument : findByG_L_T(groupId, language,
				typeDocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_T(long groupId, String language, String typeDocId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_T;

		Object[] finderArgs = new Object[] { groupId, language, typeDocId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
			}

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_2);
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

				if (bindTypeDocId) {
					qPos.add(typeDocId);
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

	private static final String _FINDER_COLUMN_G_L_T_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL";
	private static final String _FINDER_COLUMN_G_L_T_TYPEDOCID_2 = "vLegalDocument.typeDocId = ?";
	private static final String _FINDER_COLUMN_G_L_T_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId) {
		return findByG_L_F(groupId, language, fieldId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end) {
		return findByG_L_F(groupId, language, fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F;
			finderArgs = new Object[] { groupId, language, fieldId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F;
			finderArgs = new Object[] {
					groupId, language, fieldId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(fieldId, vLegalDocument.getFieldId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_F_First(long groupId, String language,
		String fieldId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_F_First(groupId, language,
				fieldId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_F_First(long groupId, String language,
		String fieldId, OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_F(groupId, language, fieldId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_F_Last(long groupId, String language,
		String fieldId, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_F_Last(groupId, language,
				fieldId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_F_Last(long groupId, String language,
		String fieldId, OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_F(groupId, language, fieldId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_F(groupId, language, fieldId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByG_L_F_PrevAndNext(String docId, long groupId,
		String language, String fieldId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_F_PrevAndNext(session, vLegalDocument, groupId,
					language, fieldId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_F_PrevAndNext(session, vLegalDocument, groupId,
					language, fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_F_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String fieldId, OrderByComparator<VLegalDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
		}

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByG_L_F(long groupId, String language, String fieldId) {
		for (VLegalDocument vLegalDocument : findByG_L_F(groupId, language,
				fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_F(long groupId, String language, String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_F;

		Object[] finderArgs = new Object[] { groupId, language, fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
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

	private static final String _FINDER_COLUMN_G_L_F_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_1 = "vLegalDocument.fieldId IS NULL";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_2 = "vLegalDocument.fieldId = ?";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByP_U_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_U_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			VLegalDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalDocumentModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VLegalDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_U_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc) {
		return findByP_U_S(groupId, createdByUser, language, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc, int start, int end) {
		return findByP_U_S(groupId, createdByUser, language, statusDoc, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByP_U_S(groupId, createdByUser, language, statusDoc, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_U_S;
			finderArgs = new Object[] {
					groupId, createdByUser, language, statusDoc
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_U_S;
			finderArgs = new Object[] {
					groupId, createdByUser, language, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							(createdByUser != vLegalDocument.getCreatedByUser()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							(statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_U_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_U_S_CREATEDBYUSER_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_U_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByP_U_S_First(long groupId, long createdByUser,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByP_U_S_First(groupId,
				createdByUser, language, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByP_U_S_First(long groupId, long createdByUser,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByP_U_S(groupId, createdByUser,
				language, statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByP_U_S_Last(long groupId, long createdByUser,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByP_U_S_Last(groupId,
				createdByUser, language, statusDoc, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByP_U_S_Last(long groupId, long createdByUser,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByP_U_S(groupId, createdByUser, language, statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByP_U_S(groupId, createdByUser,
				language, statusDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByP_U_S_PrevAndNext(String docId, long groupId,
		long createdByUser, String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByP_U_S_PrevAndNext(session, vLegalDocument, groupId,
					createdByUser, language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByP_U_S_PrevAndNext(session, vLegalDocument, groupId,
					createdByUser, language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByP_U_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, long createdByUser,
		String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_U_S_GROUPID_2);

		query.append(_FINDER_COLUMN_P_U_S_CREATEDBYUSER_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_P_U_S_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(createdByUser);

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc) {
		for (VLegalDocument vLegalDocument : findByP_U_S(groupId,
				createdByUser, language, statusDoc, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByP_U_S(long groupId, long createdByUser, String language,
		int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_U_S;

		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language, statusDoc
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_U_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_U_S_CREATEDBYUSER_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_U_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_P_U_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_U_S_CREATEDBYUSER_2 = "vLegalDocument.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_P_U_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_U_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_U_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_P_U_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_O_S_D =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_O_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_O_S_D =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_O_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S_D(long groupId, String language,
		String orgId, int statusDoc, String docId) {
		return findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S_D(long groupId, String language,
		String orgId, int statusDoc, String docId, int start, int end) {
		return findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S_D(long groupId, String language,
		String orgId, int statusDoc, String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_O_S_D(long groupId, String language,
		String orgId, int statusDoc, String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_O_S_D;
		finderArgs = new Object[] {
				groupId, language, orgId, statusDoc, docId,
				
				start, end, orderByComparator
			};

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(orgId, vLegalDocument.getOrgId()) ||
							(statusDoc != vLegalDocument.getStatusDoc()) ||
							Objects.equals(docId, vLegalDocument.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_O_S_D_LANGUAGE_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_L_O_S_D_ORGID_2);
			}

			query.append(_FINDER_COLUMN_G_L_O_S_D_STATUSDOC_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_L_O_S_D_DOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindOrgId) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				if (bindDocId) {
					qPos.add(docId);
				}

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_O_S_D_First(long groupId, String language,
		String orgId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_O_S_D_First(groupId,
				language, orgId, statusDoc, docId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_O_S_D_First(long groupId, String language,
		String orgId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_O_S_D(groupId, language, orgId,
				statusDoc, docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_O_S_D_Last(long groupId, String language,
		String orgId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_O_S_D_Last(groupId,
				language, orgId, statusDoc, docId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", orgId=");
		msg.append(orgId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_O_S_D_Last(long groupId, String language,
		String orgId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_O_S_D(groupId, language, orgId, statusDoc, docId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_O_S_D(groupId, language, orgId,
				statusDoc, docId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 */
	@Override
	public void removeByG_L_O_S_D(long groupId, String language, String orgId,
		int statusDoc, String docId) {
		for (VLegalDocument vLegalDocument : findByG_L_O_S_D(groupId, language,
				orgId, statusDoc, docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orgId the org ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_O_S_D(long groupId, String language, String orgId,
		int statusDoc, String docId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_O_S_D;

		Object[] finderArgs = new Object[] {
				groupId, language, orgId, statusDoc, docId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_O_S_D_LANGUAGE_2);
			}

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_L_O_S_D_ORGID_2);
			}

			query.append(_FINDER_COLUMN_G_L_O_S_D_STATUSDOC_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_L_O_S_D_DOCID_2);
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

				if (bindOrgId) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				if (bindDocId) {
					qPos.add(docId);
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

	private static final String _FINDER_COLUMN_G_L_O_S_D_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_STATUSDOC_2 = "vLegalDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_D_DOCID_1 = "vLegalDocument.docId IS NOT NULL";
	private static final String _FINDER_COLUMN_G_L_O_S_D_DOCID_2 = "vLegalDocument.docId != ?";
	private static final String _FINDER_COLUMN_G_L_O_S_D_DOCID_3 = "(vLegalDocument.docId IS NULL OR vLegalDocument.docId != '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T_S_D =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_T_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_T_S_D =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_T_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S_D(long groupId, String language,
		String typeDocId, int statusDoc, String docId) {
		return findByG_L_T_S_D(groupId, language, typeDocId, statusDoc, docId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S_D(long groupId, String language,
		String typeDocId, int statusDoc, String docId, int start, int end) {
		return findByG_L_T_S_D(groupId, language, typeDocId, statusDoc, docId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S_D(long groupId, String language,
		String typeDocId, int statusDoc, String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_T_S_D(groupId, language, typeDocId, statusDoc, docId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_T_S_D(long groupId, String language,
		String typeDocId, int statusDoc, String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T_S_D;
		finderArgs = new Object[] {
				groupId, language, typeDocId, statusDoc, docId,
				
				start, end, orderByComparator
			};

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(typeDocId,
								vLegalDocument.getTypeDocId()) ||
							(statusDoc != vLegalDocument.getStatusDoc()) ||
							Objects.equals(docId, vLegalDocument.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

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

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_2);
			}

			query.append(_FINDER_COLUMN_G_L_T_S_D_STATUSDOC_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_DOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				qPos.add(statusDoc);

				if (bindDocId) {
					qPos.add(docId);
				}

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_T_S_D_First(long groupId, String language,
		String typeDocId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_T_S_D_First(groupId,
				language, typeDocId, statusDoc, docId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_T_S_D_First(long groupId, String language,
		String typeDocId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_T_S_D(groupId, language,
				typeDocId, statusDoc, docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_T_S_D_Last(long groupId, String language,
		String typeDocId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_T_S_D_Last(groupId,
				language, typeDocId, statusDoc, docId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", typeDocId=");
		msg.append(typeDocId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_T_S_D_Last(long groupId, String language,
		String typeDocId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_T_S_D(groupId, language, typeDocId, statusDoc,
				docId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_T_S_D(groupId, language,
				typeDocId, statusDoc, docId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 */
	@Override
	public void removeByG_L_T_S_D(long groupId, String language,
		String typeDocId, int statusDoc, String docId) {
		for (VLegalDocument vLegalDocument : findByG_L_T_S_D(groupId, language,
				typeDocId, statusDoc, docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param typeDocId the type doc ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_T_S_D(long groupId, String language,
		String typeDocId, int statusDoc, String docId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_T_S_D;

		Object[] finderArgs = new Object[] {
				groupId, language, typeDocId, statusDoc, docId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

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

			boolean bindTypeDocId = false;

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_1);
			}
			else if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_3);
			}
			else {
				bindTypeDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_2);
			}

			query.append(_FINDER_COLUMN_G_L_T_S_D_STATUSDOC_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_L_T_S_D_DOCID_2);
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

				if (bindTypeDocId) {
					qPos.add(typeDocId);
				}

				qPos.add(statusDoc);

				if (bindDocId) {
					qPos.add(docId);
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

	private static final String _FINDER_COLUMN_G_L_T_S_D_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_STATUSDOC_2 = "vLegalDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_D_DOCID_1 = "vLegalDocument.docId IS NOT NULL";
	private static final String _FINDER_COLUMN_G_L_T_S_D_DOCID_2 = "vLegalDocument.docId != ?";
	private static final String _FINDER_COLUMN_G_L_T_S_D_DOCID_3 = "(vLegalDocument.docId IS NULL OR vLegalDocument.docId != '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S_D =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_L_F_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_F_S_D =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_F_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S_D(long groupId, String language,
		String fieldId, int statusDoc, String docId) {
		return findByG_L_F_S_D(groupId, language, fieldId, statusDoc, docId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S_D(long groupId, String language,
		String fieldId, int statusDoc, String docId, int start, int end) {
		return findByG_L_F_S_D(groupId, language, fieldId, statusDoc, docId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S_D(long groupId, String language,
		String fieldId, int statusDoc, String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByG_L_F_S_D(groupId, language, fieldId, statusDoc, docId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByG_L_F_S_D(long groupId, String language,
		String fieldId, int statusDoc, String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S_D;
		finderArgs = new Object[] {
				groupId, language, fieldId, statusDoc, docId,
				
				start, end, orderByComparator
			};

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((groupId != vLegalDocument.getGroupId()) ||
							!Objects.equals(language,
								vLegalDocument.getLanguage()) ||
							!Objects.equals(fieldId, vLegalDocument.getFieldId()) ||
							(statusDoc != vLegalDocument.getStatusDoc()) ||
							Objects.equals(docId, vLegalDocument.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

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

			query.append(_FINDER_COLUMN_G_L_F_S_D_STATUSDOC_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_DOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				if (bindDocId) {
					qPos.add(docId);
				}

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_F_S_D_First(long groupId, String language,
		String fieldId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_F_S_D_First(groupId,
				language, fieldId, statusDoc, docId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_F_S_D_First(long groupId, String language,
		String fieldId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByG_L_F_S_D(groupId, language, fieldId,
				statusDoc, docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByG_L_F_S_D_Last(long groupId, String language,
		String fieldId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByG_L_F_S_D_Last(groupId,
				language, fieldId, statusDoc, docId, orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByG_L_F_S_D_Last(long groupId, String language,
		String fieldId, int statusDoc, String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByG_L_F_S_D(groupId, language, fieldId, statusDoc,
				docId);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByG_L_F_S_D(groupId, language, fieldId,
				statusDoc, docId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 */
	@Override
	public void removeByG_L_F_S_D(long groupId, String language,
		String fieldId, int statusDoc, String docId) {
		for (VLegalDocument vLegalDocument : findByG_L_F_S_D(groupId, language,
				fieldId, statusDoc, docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param docId the doc ID
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByG_L_F_S_D(long groupId, String language, String fieldId,
		int statusDoc, String docId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_F_S_D;

		Object[] finderArgs = new Object[] {
				groupId, language, fieldId, statusDoc, docId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

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

			query.append(_FINDER_COLUMN_G_L_F_S_D_STATUSDOC_2);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_D_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_D_DOCID_2);
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

				qPos.add(statusDoc);

				if (bindDocId) {
					qPos.add(docId);
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

	private static final String _FINDER_COLUMN_G_L_F_S_D_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_STATUSDOC_2 = "vLegalDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_D_DOCID_1 = "vLegalDocument.docId IS NOT NULL";
	private static final String _FINDER_COLUMN_G_L_F_S_D_DOCID_2 = "vLegalDocument.docId != ?";
	private static final String _FINDER_COLUMN_G_L_F_S_D_DOCID_3 = "(vLegalDocument.docId IS NULL OR vLegalDocument.docId != '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByStatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			VLegalDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Integer.class.getName() },
			VLegalDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			VLegalDocumentModelImpl.PROMULDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @return the matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByStatus(int statusDoc) {
		return findByStatus(statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByStatus(int statusDoc, int start, int end) {
		return findByStatus(statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByStatus(int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findByStatus(statusDoc, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal documents
	 */
	@Override
	public List<VLegalDocument> findByStatus(int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { statusDoc, start, end, orderByComparator };
		}

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDocument vLegalDocument : list) {
					if ((statusDoc != vLegalDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Returns the first v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByStatus_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByStatus_First(statusDoc,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the first v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByStatus_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		List<VLegalDocument> list = findByStatus(statusDoc, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document
	 * @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument findByStatus_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByStatus_Last(statusDoc,
				orderByComparator);

		if (vLegalDocument != null) {
			return vLegalDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDocumentException(msg.toString());
	}

	/**
	 * Returns the last v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 */
	@Override
	public VLegalDocument fetchByStatus_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		int count = countByStatus(statusDoc);

		if (count == 0) {
			return null;
		}

		List<VLegalDocument> list = findByStatus(statusDoc, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current v legal document
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument[] findByStatus_PrevAndNext(String docId,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByStatus_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByStatus_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

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
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal documents where statusDoc = &#63; from the database.
	 *
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByStatus(int statusDoc) {
		for (VLegalDocument vLegalDocument : findByStatus(statusDoc,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @return the number of matching v legal documents
	 */
	@Override
	public int countByStatus(int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_STATUS_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";

	public VLegalDocumentPersistenceImpl() {
		setModelClass(VLegalDocument.class);
	}

	/**
	 * Caches the v legal document in the entity cache if it is enabled.
	 *
	 * @param vLegalDocument the v legal document
	 */
	@Override
	public void cacheResult(VLegalDocument vLegalDocument) {
		entityCache.putResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey(),
			vLegalDocument);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] { vLegalDocument.getGroupId(), vLegalDocument.getDocId() },
			vLegalDocument);

		finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_S,
			new Object[] {
				vLegalDocument.getGroupId(), vLegalDocument.getNum(),
				vLegalDocument.getSymbol()
			}, vLegalDocument);

		vLegalDocument.resetOriginalValues();
	}

	/**
	 * Caches the v legal documents in the entity cache if it is enabled.
	 *
	 * @param vLegalDocuments the v legal documents
	 */
	@Override
	public void cacheResult(List<VLegalDocument> vLegalDocuments) {
		for (VLegalDocument vLegalDocument : vLegalDocuments) {
			if (entityCache.getResult(
						VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey()) == null) {
				cacheResult(vLegalDocument);
			}
			else {
				vLegalDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal documents.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalDocumentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal document.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalDocument vLegalDocument) {
		entityCache.removeResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalDocumentModelImpl)vLegalDocument);
	}

	@Override
	public void clearCache(List<VLegalDocument> vLegalDocuments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalDocument vLegalDocument : vLegalDocuments) {
			entityCache.removeResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey());

			clearUniqueFindersCache((VLegalDocumentModelImpl)vLegalDocument);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalDocumentModelImpl vLegalDocumentModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalDocumentModelImpl.getGroupId(),
					vLegalDocumentModelImpl.getDocId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_D, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_D, args,
				vLegalDocumentModelImpl);

			args = new Object[] {
					vLegalDocumentModelImpl.getGroupId(),
					vLegalDocumentModelImpl.getNum(),
					vLegalDocumentModelImpl.getSymbol()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_P_N_S, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_S, args,
				vLegalDocumentModelImpl);
		}
		else {
			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getDocId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_D, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_D, args,
					vLegalDocumentModelImpl);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_P_N_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getNum(),
						vLegalDocumentModelImpl.getSymbol()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_P_N_S, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_P_N_S, args,
					vLegalDocumentModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalDocumentModelImpl vLegalDocumentModelImpl) {
		Object[] args = new Object[] {
				vLegalDocumentModelImpl.getGroupId(),
				vLegalDocumentModelImpl.getDocId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_D, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_D, args);

		if ((vLegalDocumentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_D.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalDocumentModelImpl.getOriginalGroupId(),
					vLegalDocumentModelImpl.getOriginalDocId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_D, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_D, args);
		}

		args = new Object[] {
				vLegalDocumentModelImpl.getGroupId(),
				vLegalDocumentModelImpl.getNum(),
				vLegalDocumentModelImpl.getSymbol()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_P_N_S, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N_S, args);

		if ((vLegalDocumentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_P_N_S.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalDocumentModelImpl.getOriginalGroupId(),
					vLegalDocumentModelImpl.getOriginalNum(),
					vLegalDocumentModelImpl.getOriginalSymbol()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_P_N_S, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_P_N_S, args);
		}
	}

	/**
	 * Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	 *
	 * @param docId the primary key for the new v legal document
	 * @return the new v legal document
	 */
	@Override
	public VLegalDocument create(String docId) {
		VLegalDocument vLegalDocument = new VLegalDocumentImpl();

		vLegalDocument.setNew(true);
		vLegalDocument.setPrimaryKey(docId);

		vLegalDocument.setCompanyId(companyProvider.getCompanyId());

		return vLegalDocument;
	}

	/**
	 * Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the v legal document
	 * @return the v legal document that was removed
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument remove(String docId)
		throws NoSuchVLegalDocumentException {
		return remove((Serializable)docId);
	}

	/**
	 * Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal document
	 * @return the v legal document that was removed
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument remove(Serializable primaryKey)
		throws NoSuchVLegalDocumentException {
		Session session = null;

		try {
			session = openSession();

			VLegalDocument vLegalDocument = (VLegalDocument)session.get(VLegalDocumentImpl.class,
					primaryKey);

			if (vLegalDocument == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalDocument);
		}
		catch (NoSuchVLegalDocumentException nsee) {
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
	protected VLegalDocument removeImpl(VLegalDocument vLegalDocument) {
		vLegalDocument = toUnwrappedModel(vLegalDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalDocument)) {
				vLegalDocument = (VLegalDocument)session.get(VLegalDocumentImpl.class,
						vLegalDocument.getPrimaryKeyObj());
			}

			if (vLegalDocument != null) {
				session.delete(vLegalDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalDocument != null) {
			clearCache(vLegalDocument);
		}

		return vLegalDocument;
	}

	@Override
	public VLegalDocument updateImpl(VLegalDocument vLegalDocument) {
		vLegalDocument = toUnwrappedModel(vLegalDocument);

		boolean isNew = vLegalDocument.isNew();

		VLegalDocumentModelImpl vLegalDocumentModelImpl = (VLegalDocumentModelImpl)vLegalDocument;

		Session session = null;

		try {
			session = openSession();

			if (vLegalDocument.isNew()) {
				session.save(vLegalDocument);

				vLegalDocument.setNew(false);
			}
			else {
				vLegalDocument = (VLegalDocument)session.merge(vLegalDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalDocumentModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalTypeDocId(),
						vLegalDocumentModelImpl.getOriginalOrgId(),
						vLegalDocumentModelImpl.getOriginalFieldId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getTypeDocId(),
						vLegalDocumentModelImpl.getOrgId(),
						vLegalDocumentModelImpl.getFieldId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYF_O_T_L_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalOrgId(),
						vLegalDocumentModelImpl.getOriginalTypeDocId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getOrgId(),
						vLegalDocumentModelImpl.getTypeDocId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYG_O_T_L_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYT_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalTypeDocId(),
						vLegalDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCSBYT_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYT_L,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getTypeDocId(),
						vLegalDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCSBYT_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCSBYT_L,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_U_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalUserId(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_U_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_U_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getUserId(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_U_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_U_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSDOC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUSDOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSDOC,
					args);

				args = new Object[] { vLegalDocumentModelImpl.getStatusDoc() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUSDOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUSDOC,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalOrgId(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_O_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getOrgId(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_O_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalTypeDocId(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_T_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getTypeDocId(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_T_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalFieldId(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getFieldId(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalOrgId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_O, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getOrgId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_O, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_O,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalTypeDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getTypeDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_U_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalGroupId(),
						vLegalDocumentModelImpl.getOriginalCreatedByUser(),
						vLegalDocumentModelImpl.getOriginalLanguage(),
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_U_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_U_S,
					args);

				args = new Object[] {
						vLegalDocumentModelImpl.getGroupId(),
						vLegalDocumentModelImpl.getCreatedByUser(),
						vLegalDocumentModelImpl.getLanguage(),
						vLegalDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_U_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_U_S,
					args);
			}

			if ((vLegalDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { vLegalDocumentModelImpl.getStatusDoc() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey(),
			vLegalDocument, false);

		clearUniqueFindersCache(vLegalDocumentModelImpl);
		cacheUniqueFindersCache(vLegalDocumentModelImpl, isNew);

		vLegalDocument.resetOriginalValues();

		return vLegalDocument;
	}

	protected VLegalDocument toUnwrappedModel(VLegalDocument vLegalDocument) {
		if (vLegalDocument instanceof VLegalDocumentImpl) {
			return vLegalDocument;
		}

		VLegalDocumentImpl vLegalDocumentImpl = new VLegalDocumentImpl();

		vLegalDocumentImpl.setNew(vLegalDocument.isNew());
		vLegalDocumentImpl.setPrimaryKey(vLegalDocument.getPrimaryKey());

		vLegalDocumentImpl.setDocId(vLegalDocument.getDocId());
		vLegalDocumentImpl.setGroupId(vLegalDocument.getGroupId());
		vLegalDocumentImpl.setCompanyId(vLegalDocument.getCompanyId());
		vLegalDocumentImpl.setUserId(vLegalDocument.getUserId());
		vLegalDocumentImpl.setCreatedByUser(vLegalDocument.getCreatedByUser());
		vLegalDocumentImpl.setCreatedDate(vLegalDocument.getCreatedDate());
		vLegalDocumentImpl.setModifiedByUser(vLegalDocument.getModifiedByUser());
		vLegalDocumentImpl.setModifiedDate(vLegalDocument.getModifiedDate());
		vLegalDocumentImpl.setApprovedByUser(vLegalDocument.getApprovedByUser());
		vLegalDocumentImpl.setApprovedDate(vLegalDocument.getApprovedDate());
		vLegalDocumentImpl.setForwardedByUser(vLegalDocument.getForwardedByUser());
		vLegalDocumentImpl.setForwardedDate(vLegalDocument.getForwardedDate());
		vLegalDocumentImpl.setPublishedByUser(vLegalDocument.getPublishedByUser());
		vLegalDocumentImpl.setPublishedDate(vLegalDocument.getPublishedDate());
		vLegalDocumentImpl.setSymbol(vLegalDocument.getSymbol());
		vLegalDocumentImpl.setNum(vLegalDocument.getNum());
		vLegalDocumentImpl.setPromulDate(vLegalDocument.getPromulDate());
		vLegalDocumentImpl.setEffectivedDate(vLegalDocument.getEffectivedDate());
		vLegalDocumentImpl.setExpiredDate(vLegalDocument.getExpiredDate());
		vLegalDocumentImpl.setReplaceDoc(vLegalDocument.getReplaceDoc());
		vLegalDocumentImpl.setSummary(vLegalDocument.getSummary());
		vLegalDocumentImpl.setContent(vLegalDocument.getContent());
		vLegalDocumentImpl.setLanguage(vLegalDocument.getLanguage());
		vLegalDocumentImpl.setUserHit(vLegalDocument.getUserHit());
		vLegalDocumentImpl.setStatusDoc(vLegalDocument.getStatusDoc());
		vLegalDocumentImpl.setHasAttachment(vLegalDocument.isHasAttachment());
		vLegalDocumentImpl.setTypeDocId(vLegalDocument.getTypeDocId());
		vLegalDocumentImpl.setFieldId(vLegalDocument.getFieldId());
		vLegalDocumentImpl.setOrgId(vLegalDocument.getOrgId());
		vLegalDocumentImpl.setOrgRels(vLegalDocument.getOrgRels());
		vLegalDocumentImpl.setSignerRels(vLegalDocument.getSignerRels());
		vLegalDocumentImpl.setFieldRels(vLegalDocument.getFieldRels());
		vLegalDocumentImpl.setNumRels(vLegalDocument.getNumRels());
		vLegalDocumentImpl.setDocCode(vLegalDocument.getDocCode());
		vLegalDocumentImpl.setDepartmentRels(vLegalDocument.getDepartmentRels());

		return vLegalDocumentImpl;
	}

	/**
	 * Returns the v legal document with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal document
	 * @return the v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalDocumentException {
		VLegalDocument vLegalDocument = fetchByPrimaryKey(primaryKey);

		if (vLegalDocument == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalDocument;
	}

	/**
	 * Returns the v legal document with the primary key or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	 *
	 * @param docId the primary key of the v legal document
	 * @return the v legal document
	 * @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument findByPrimaryKey(String docId)
		throws NoSuchVLegalDocumentException {
		return findByPrimaryKey((Serializable)docId);
	}

	/**
	 * Returns the v legal document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal document
	 * @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDocumentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalDocument vLegalDocument = (VLegalDocument)serializable;

		if (vLegalDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDocument = (VLegalDocument)session.get(VLegalDocumentImpl.class,
						primaryKey);

				if (vLegalDocument != null) {
					cacheResult(vLegalDocument);
				}
				else {
					entityCache.putResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDocumentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalDocument;
	}

	/**
	 * Returns the v legal document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docId the primary key of the v legal document
	 * @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	 */
	@Override
	public VLegalDocument fetchByPrimaryKey(String docId) {
		return fetchByPrimaryKey((Serializable)docId);
	}

	@Override
	public Map<Serializable, VLegalDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalDocument> map = new HashMap<Serializable, VLegalDocument>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalDocument vLegalDocument = fetchByPrimaryKey(primaryKey);

			if (vLegalDocument != null) {
				map.put(primaryKey, vLegalDocument);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDocumentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalDocument)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE_PKS_IN);

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

			for (VLegalDocument vLegalDocument : (List<VLegalDocument>)q.list()) {
				map.put(vLegalDocument.getPrimaryKeyObj(), vLegalDocument);

				cacheResult(vLegalDocument);

				uncachedPrimaryKeys.remove(vLegalDocument.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDocumentImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal documents.
	 *
	 * @return the v legal documents
	 */
	@Override
	public List<VLegalDocument> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @return the range of v legal documents
	 */
	@Override
	public List<VLegalDocument> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal documents
	 */
	@Override
	public List<VLegalDocument> findAll(int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal documents
	 * @param end the upper bound of the range of v legal documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal documents
	 */
	@Override
	public List<VLegalDocument> findAll(int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
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

		List<VLegalDocument> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDocument>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDOCUMENT;

				if (pagination) {
					sql = sql.concat(VLegalDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
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
	 * Removes all the v legal documents from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalDocument vLegalDocument : findAll()) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Returns the number of v legal documents.
	 *
	 * @return the number of v legal documents
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDOCUMENT);

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
		return VLegalDocumentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal document persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalDocumentImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDOCUMENT = "SELECT vLegalDocument FROM VLegalDocument vLegalDocument";
	private static final String _SQL_SELECT_VLEGALDOCUMENT_WHERE_PKS_IN = "SELECT vLegalDocument FROM VLegalDocument vLegalDocument WHERE docId IN (";
	private static final String _SQL_SELECT_VLEGALDOCUMENT_WHERE = "SELECT vLegalDocument FROM VLegalDocument vLegalDocument WHERE ";
	private static final String _SQL_COUNT_VLEGALDOCUMENT = "SELECT COUNT(vLegalDocument) FROM VLegalDocument vLegalDocument";
	private static final String _SQL_COUNT_VLEGALDOCUMENT_WHERE = "SELECT COUNT(vLegalDocument) FROM VLegalDocument vLegalDocument WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDocument exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalDocumentPersistenceImpl.class);
}