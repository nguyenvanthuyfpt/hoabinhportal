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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVLegalTDRelException;
import vn.gov.hoabinh.model.VLegalTDRel;
import vn.gov.hoabinh.model.impl.VLegalTDRelImpl;
import vn.gov.hoabinh.model.impl.VLegalTDRelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalTDRelPK;
import vn.gov.hoabinh.service.persistence.VLegalTDRelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal t d rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTDRelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalTDRelUtil
 * @generated
 */
@ProviderType
public class VLegalTDRelPersistenceImpl extends BasePersistenceImpl<VLegalTDRel>
	implements VLegalTDRelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalTDRelUtil} to access the v legal t d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalTDRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, VLegalTDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, VLegalTDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENT = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, VLegalTDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDocument",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT =
		new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, VLegalTDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDocument",
			new String[] { String.class.getName() },
			VLegalTDRelModelImpl.DOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENT = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocument",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal t d rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByDocument(String docId) {
		return findByDocument(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal t d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @return the range of matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByDocument(String docId, int start, int end) {
		return findByDocument(docId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal t d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByDocument(String docId, int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return findByDocument(docId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal t d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByDocument(String docId, int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT;
			finderArgs = new Object[] { docId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENT;
			finderArgs = new Object[] { docId, start, end, orderByComparator };
		}

		List<VLegalTDRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalTDRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalTDRel vLegalTDRel : list) {
					if (!Objects.equals(docId, vLegalTDRel.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocId) {
					qPos.add(docId);
				}

				if (!pagination) {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel findByDocument_First(String docId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = fetchByDocument_First(docId, orderByComparator);

		if (vLegalTDRel != null) {
			return vLegalTDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTDRelException(msg.toString());
	}

	/**
	 * Returns the first v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel fetchByDocument_First(String docId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		List<VLegalTDRel> list = findByDocument(docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel findByDocument_Last(String docId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = fetchByDocument_Last(docId, orderByComparator);

		if (vLegalTDRel != null) {
			return vLegalTDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTDRelException(msg.toString());
	}

	/**
	 * Returns the last v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel fetchByDocument_Last(String docId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		int count = countByDocument(docId);

		if (count == 0) {
			return null;
		}

		List<VLegalTDRel> list = findByDocument(docId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal t d rels before and after the current v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * @param vLegalTDRelPK the primary key of the current v legal t d rel
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel[] findByDocument_PrevAndNext(
		VLegalTDRelPK vLegalTDRelPK, String docId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = findByPrimaryKey(vLegalTDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalTDRel[] array = new VLegalTDRelImpl[3];

			array[0] = getByDocument_PrevAndNext(session, vLegalTDRel, docId,
					orderByComparator, true);

			array[1] = vLegalTDRel;

			array[2] = getByDocument_PrevAndNext(session, vLegalTDRel, docId,
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

	protected VLegalTDRel getByDocument_PrevAndNext(Session session,
		VLegalTDRel vLegalTDRel, String docId,
		OrderByComparator<VLegalTDRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

		boolean bindDocId = false;

		if (docId == null) {
			query.append(_FINDER_COLUMN_DOCUMENT_DOCID_1);
		}
		else if (docId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENT_DOCID_3);
		}
		else {
			bindDocId = true;

			query.append(_FINDER_COLUMN_DOCUMENT_DOCID_2);
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
			query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocId) {
			qPos.add(docId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalTDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal t d rels where docId = &#63; from the database.
	 *
	 * @param docId the doc ID
	 */
	@Override
	public void removeByDocument(String docId) {
		for (VLegalTDRel vLegalTDRel : findByDocument(docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalTDRel);
		}
	}

	/**
	 * Returns the number of v legal t d rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the number of matching v legal t d rels
	 */
	@Override
	public int countByDocument(String docId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENT;

		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTDREL_WHERE);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_1 = "vLegalTDRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_2 = "vLegalTDRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_3 = "(vLegalTDRel.id.docId IS NULL OR vLegalTDRel.id.docId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAG = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, VLegalTDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTag",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAG = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, VLegalTDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTag",
			new String[] { String.class.getName() },
			VLegalTDRelModelImpl.TAGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAG = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTag",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal t d rels where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @return the matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByTag(String tagId) {
		return findByTag(tagId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal t d rels where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @return the range of matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByTag(String tagId, int start, int end) {
		return findByTag(tagId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal t d rels where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByTag(String tagId, int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return findByTag(tagId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal t d rels where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tagId the tag ID
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findByTag(String tagId, int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAG;
			finderArgs = new Object[] { tagId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAG;
			finderArgs = new Object[] { tagId, start, end, orderByComparator };
		}

		List<VLegalTDRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalTDRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalTDRel vLegalTDRel : list) {
					if (!Objects.equals(tagId, vLegalTDRel.getTagId())) {
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

			query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

			boolean bindTagId = false;

			if (tagId == null) {
				query.append(_FINDER_COLUMN_TAG_TAGID_1);
			}
			else if (tagId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAG_TAGID_3);
			}
			else {
				bindTagId = true;

				query.append(_FINDER_COLUMN_TAG_TAGID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTagId) {
					qPos.add(tagId);
				}

				if (!pagination) {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel findByTag_First(String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = fetchByTag_First(tagId, orderByComparator);

		if (vLegalTDRel != null) {
			return vLegalTDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTDRelException(msg.toString());
	}

	/**
	 * Returns the first v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel fetchByTag_First(String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		List<VLegalTDRel> list = findByTag(tagId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel findByTag_Last(String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = fetchByTag_Last(tagId, orderByComparator);

		if (vLegalTDRel != null) {
			return vLegalTDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTDRelException(msg.toString());
	}

	/**
	 * Returns the last v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	 */
	@Override
	public VLegalTDRel fetchByTag_Last(String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		int count = countByTag(tagId);

		if (count == 0) {
			return null;
		}

		List<VLegalTDRel> list = findByTag(tagId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal t d rels before and after the current v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * @param vLegalTDRelPK the primary key of the current v legal t d rel
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel[] findByTag_PrevAndNext(VLegalTDRelPK vLegalTDRelPK,
		String tagId, OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = findByPrimaryKey(vLegalTDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalTDRel[] array = new VLegalTDRelImpl[3];

			array[0] = getByTag_PrevAndNext(session, vLegalTDRel, tagId,
					orderByComparator, true);

			array[1] = vLegalTDRel;

			array[2] = getByTag_PrevAndNext(session, vLegalTDRel, tagId,
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

	protected VLegalTDRel getByTag_PrevAndNext(Session session,
		VLegalTDRel vLegalTDRel, String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

		boolean bindTagId = false;

		if (tagId == null) {
			query.append(_FINDER_COLUMN_TAG_TAGID_1);
		}
		else if (tagId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TAG_TAGID_3);
		}
		else {
			bindTagId = true;

			query.append(_FINDER_COLUMN_TAG_TAGID_2);
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
			query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTagId) {
			qPos.add(tagId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalTDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal t d rels where tagId = &#63; from the database.
	 *
	 * @param tagId the tag ID
	 */
	@Override
	public void removeByTag(String tagId) {
		for (VLegalTDRel vLegalTDRel : findByTag(tagId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalTDRel);
		}
	}

	/**
	 * Returns the number of v legal t d rels where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @return the number of matching v legal t d rels
	 */
	@Override
	public int countByTag(String tagId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAG;

		Object[] finderArgs = new Object[] { tagId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTDREL_WHERE);

			boolean bindTagId = false;

			if (tagId == null) {
				query.append(_FINDER_COLUMN_TAG_TAGID_1);
			}
			else if (tagId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAG_TAGID_3);
			}
			else {
				bindTagId = true;

				query.append(_FINDER_COLUMN_TAG_TAGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTagId) {
					qPos.add(tagId);
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

	private static final String _FINDER_COLUMN_TAG_TAGID_1 = "vLegalTDRel.id.tagId IS NULL";
	private static final String _FINDER_COLUMN_TAG_TAGID_2 = "vLegalTDRel.id.tagId = ?";
	private static final String _FINDER_COLUMN_TAG_TAGID_3 = "(vLegalTDRel.id.tagId IS NULL OR vLegalTDRel.id.tagId = '')";

	public VLegalTDRelPersistenceImpl() {
		setModelClass(VLegalTDRel.class);
	}

	/**
	 * Caches the v legal t d rel in the entity cache if it is enabled.
	 *
	 * @param vLegalTDRel the v legal t d rel
	 */
	@Override
	public void cacheResult(VLegalTDRel vLegalTDRel) {
		entityCache.putResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey(), vLegalTDRel);

		vLegalTDRel.resetOriginalValues();
	}

	/**
	 * Caches the v legal t d rels in the entity cache if it is enabled.
	 *
	 * @param vLegalTDRels the v legal t d rels
	 */
	@Override
	public void cacheResult(List<VLegalTDRel> vLegalTDRels) {
		for (VLegalTDRel vLegalTDRel : vLegalTDRels) {
			if (entityCache.getResult(
						VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey()) == null) {
				cacheResult(vLegalTDRel);
			}
			else {
				vLegalTDRel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal t d rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalTDRelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal t d rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalTDRel vLegalTDRel) {
		entityCache.removeResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalTDRel> vLegalTDRels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalTDRel vLegalTDRel : vLegalTDRels) {
			entityCache.removeResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal t d rel with the primary key. Does not add the v legal t d rel to the database.
	 *
	 * @param vLegalTDRelPK the primary key for the new v legal t d rel
	 * @return the new v legal t d rel
	 */
	@Override
	public VLegalTDRel create(VLegalTDRelPK vLegalTDRelPK) {
		VLegalTDRel vLegalTDRel = new VLegalTDRelImpl();

		vLegalTDRel.setNew(true);
		vLegalTDRel.setPrimaryKey(vLegalTDRelPK);

		return vLegalTDRel;
	}

	/**
	 * Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalTDRelPK the primary key of the v legal t d rel
	 * @return the v legal t d rel that was removed
	 * @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel remove(VLegalTDRelPK vLegalTDRelPK)
		throws NoSuchVLegalTDRelException {
		return remove((Serializable)vLegalTDRelPK);
	}

	/**
	 * Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal t d rel
	 * @return the v legal t d rel that was removed
	 * @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel remove(Serializable primaryKey)
		throws NoSuchVLegalTDRelException {
		Session session = null;

		try {
			session = openSession();

			VLegalTDRel vLegalTDRel = (VLegalTDRel)session.get(VLegalTDRelImpl.class,
					primaryKey);

			if (vLegalTDRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalTDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalTDRel);
		}
		catch (NoSuchVLegalTDRelException nsee) {
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
	protected VLegalTDRel removeImpl(VLegalTDRel vLegalTDRel) {
		vLegalTDRel = toUnwrappedModel(vLegalTDRel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalTDRel)) {
				vLegalTDRel = (VLegalTDRel)session.get(VLegalTDRelImpl.class,
						vLegalTDRel.getPrimaryKeyObj());
			}

			if (vLegalTDRel != null) {
				session.delete(vLegalTDRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalTDRel != null) {
			clearCache(vLegalTDRel);
		}

		return vLegalTDRel;
	}

	@Override
	public VLegalTDRel updateImpl(VLegalTDRel vLegalTDRel) {
		vLegalTDRel = toUnwrappedModel(vLegalTDRel);

		boolean isNew = vLegalTDRel.isNew();

		VLegalTDRelModelImpl vLegalTDRelModelImpl = (VLegalTDRelModelImpl)vLegalTDRel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalTDRel.isNew()) {
				session.save(vLegalTDRel);

				vLegalTDRel.setNew(false);
			}
			else {
				vLegalTDRel = (VLegalTDRel)session.merge(vLegalTDRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalTDRelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalTDRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTDRelModelImpl.getOriginalDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCUMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT,
					args);

				args = new Object[] { vLegalTDRelModelImpl.getDocId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCUMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT,
					args);
			}

			if ((vLegalTDRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTDRelModelImpl.getOriginalTagId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TAG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAG,
					args);

				args = new Object[] { vLegalTDRelModelImpl.getTagId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TAG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAG,
					args);
			}
		}

		entityCache.putResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey(), vLegalTDRel,
			false);

		vLegalTDRel.resetOriginalValues();

		return vLegalTDRel;
	}

	protected VLegalTDRel toUnwrappedModel(VLegalTDRel vLegalTDRel) {
		if (vLegalTDRel instanceof VLegalTDRelImpl) {
			return vLegalTDRel;
		}

		VLegalTDRelImpl vLegalTDRelImpl = new VLegalTDRelImpl();

		vLegalTDRelImpl.setNew(vLegalTDRel.isNew());
		vLegalTDRelImpl.setPrimaryKey(vLegalTDRel.getPrimaryKey());

		vLegalTDRelImpl.setDocId(vLegalTDRel.getDocId());
		vLegalTDRelImpl.setTagId(vLegalTDRel.getTagId());

		return vLegalTDRelImpl;
	}

	/**
	 * Returns the v legal t d rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal t d rel
	 * @return the v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalTDRelException {
		VLegalTDRel vLegalTDRel = fetchByPrimaryKey(primaryKey);

		if (vLegalTDRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalTDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalTDRel;
	}

	/**
	 * Returns the v legal t d rel with the primary key or throws a {@link NoSuchVLegalTDRelException} if it could not be found.
	 *
	 * @param vLegalTDRelPK the primary key of the v legal t d rel
	 * @return the v legal t d rel
	 * @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel findByPrimaryKey(VLegalTDRelPK vLegalTDRelPK)
		throws NoSuchVLegalTDRelException {
		return findByPrimaryKey((Serializable)vLegalTDRelPK);
	}

	/**
	 * Returns the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal t d rel
	 * @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTDRelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalTDRel vLegalTDRel = (VLegalTDRel)serializable;

		if (vLegalTDRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalTDRel = (VLegalTDRel)session.get(VLegalTDRelImpl.class,
						primaryKey);

				if (vLegalTDRel != null) {
					cacheResult(vLegalTDRel);
				}
				else {
					entityCache.putResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTDRelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTDRelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalTDRel;
	}

	/**
	 * Returns the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalTDRelPK the primary key of the v legal t d rel
	 * @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	 */
	@Override
	public VLegalTDRel fetchByPrimaryKey(VLegalTDRelPK vLegalTDRelPK) {
		return fetchByPrimaryKey((Serializable)vLegalTDRelPK);
	}

	@Override
	public Map<Serializable, VLegalTDRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalTDRel> map = new HashMap<Serializable, VLegalTDRel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalTDRel vLegalTDRel = fetchByPrimaryKey(primaryKey);

			if (vLegalTDRel != null) {
				map.put(primaryKey, vLegalTDRel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal t d rels.
	 *
	 * @return the v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal t d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @return the range of v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal t d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findAll(int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal t d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal t d rels
	 * @param end the upper bound of the range of v legal t d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal t d rels
	 */
	@Override
	public List<VLegalTDRel> findAll(int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator,
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

		List<VLegalTDRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalTDRel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALTDREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALTDREL;

				if (pagination) {
					sql = sql.concat(VLegalTDRelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal t d rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalTDRel vLegalTDRel : findAll()) {
			remove(vLegalTDRel);
		}
	}

	/**
	 * Returns the number of v legal t d rels.
	 *
	 * @return the number of v legal t d rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALTDREL);

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
		return VLegalTDRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal t d rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalTDRelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALTDREL = "SELECT vLegalTDRel FROM VLegalTDRel vLegalTDRel";
	private static final String _SQL_SELECT_VLEGALTDREL_WHERE = "SELECT vLegalTDRel FROM VLegalTDRel vLegalTDRel WHERE ";
	private static final String _SQL_COUNT_VLEGALTDREL = "SELECT COUNT(vLegalTDRel) FROM VLegalTDRel vLegalTDRel";
	private static final String _SQL_COUNT_VLEGALTDREL_WHERE = "SELECT COUNT(vLegalTDRel) FROM VLegalTDRel vLegalTDRel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalTDRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalTDRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalTDRel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalTDRelPersistenceImpl.class);
}