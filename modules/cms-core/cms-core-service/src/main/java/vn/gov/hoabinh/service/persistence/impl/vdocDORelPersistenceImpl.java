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

import vn.gov.hoabinh.exception.NoSuchvdocDORelException;
import vn.gov.hoabinh.model.impl.vdocDORelImpl;
import vn.gov.hoabinh.model.impl.vdocDORelModelImpl;
import vn.gov.hoabinh.model.vdocDORel;
import vn.gov.hoabinh.service.persistence.vdocDORelPK;
import vn.gov.hoabinh.service.persistence.vdocDORelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vdoc d o rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORelPersistence
 * @see vn.gov.hoabinh.service.persistence.vdocDORelUtil
 * @generated
 */
@ProviderType
public class vdocDORelPersistenceImpl extends BasePersistenceImpl<vdocDORel>
	implements vdocDORelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vdocDORelUtil} to access the vdoc d o rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vdocDORelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, vdocDORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, vdocDORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENT = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, vdocDORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDocument",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT =
		new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, vdocDORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDocument",
			new String[] { String.class.getName() },
			vdocDORelModelImpl.DOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENT = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDocument",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vdoc d o rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByDocument(String docId) {
		return findByDocument(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc d o rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @return the range of matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByDocument(String docId, int start, int end) {
		return findByDocument(docId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc d o rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByDocument(String docId, int start, int end,
		OrderByComparator<vdocDORel> orderByComparator) {
		return findByDocument(docId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc d o rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByDocument(String docId, int start, int end,
		OrderByComparator<vdocDORel> orderByComparator,
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

		List<vdocDORel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDORel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDORel vdocDORel : list) {
					if (!Objects.equals(docId, vdocDORel.getDocId())) {
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

			query.append(_SQL_SELECT_VDOCDOREL_WHERE);

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
				query.append(vdocDORelModelImpl.ORDER_BY_JPQL);
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
					list = (List<vdocDORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDORel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc d o rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc d o rel
	 * @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel findByDocument_First(String docId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = fetchByDocument_First(docId, orderByComparator);

		if (vdocDORel != null) {
			return vdocDORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDORelException(msg.toString());
	}

	/**
	 * Returns the first vdoc d o rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel fetchByDocument_First(String docId,
		OrderByComparator<vdocDORel> orderByComparator) {
		List<vdocDORel> list = findByDocument(docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc d o rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc d o rel
	 * @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel findByDocument_Last(String docId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = fetchByDocument_Last(docId, orderByComparator);

		if (vdocDORel != null) {
			return vdocDORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDORelException(msg.toString());
	}

	/**
	 * Returns the last vdoc d o rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel fetchByDocument_Last(String docId,
		OrderByComparator<vdocDORel> orderByComparator) {
		int count = countByDocument(docId);

		if (count == 0) {
			return null;
		}

		List<vdocDORel> list = findByDocument(docId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc d o rels before and after the current vdoc d o rel in the ordered set where docId = &#63;.
	 *
	 * @param vdocDORelPK the primary key of the current vdoc d o rel
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc d o rel
	 * @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel[] findByDocument_PrevAndNext(vdocDORelPK vdocDORelPK,
		String docId, OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = findByPrimaryKey(vdocDORelPK);

		Session session = null;

		try {
			session = openSession();

			vdocDORel[] array = new vdocDORelImpl[3];

			array[0] = getByDocument_PrevAndNext(session, vdocDORel, docId,
					orderByComparator, true);

			array[1] = vdocDORel;

			array[2] = getByDocument_PrevAndNext(session, vdocDORel, docId,
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

	protected vdocDORel getByDocument_PrevAndNext(Session session,
		vdocDORel vdocDORel, String docId,
		OrderByComparator<vdocDORel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOREL_WHERE);

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
			query.append(vdocDORelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDORel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDORel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc d o rels where docId = &#63; from the database.
	 *
	 * @param docId the doc ID
	 */
	@Override
	public void removeByDocument(String docId) {
		for (vdocDORel vdocDORel : findByDocument(docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vdocDORel);
		}
	}

	/**
	 * Returns the number of vdoc d o rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the number of matching vdoc d o rels
	 */
	@Override
	public int countByDocument(String docId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENT;

		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCDOREL_WHERE);

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

	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_1 = "vdocDORel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_2 = "vdocDORel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_3 = "(vdocDORel.id.docId IS NULL OR vdocDORel.id.docId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORG = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, vdocDORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrg",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, vdocDORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrg",
			new String[] { String.class.getName() },
			vdocDORelModelImpl.ORGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORG = new FinderPath(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrg",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vdoc d o rels where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @return the matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByOrg(String orgId) {
		return findByOrg(orgId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc d o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @return the range of matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByOrg(String orgId, int start, int end) {
		return findByOrg(orgId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc d o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByOrg(String orgId, int start, int end,
		OrderByComparator<vdocDORel> orderByComparator) {
		return findByOrg(orgId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc d o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findByOrg(String orgId, int start, int end,
		OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG;
			finderArgs = new Object[] { orgId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORG;
			finderArgs = new Object[] { orgId, start, end, orderByComparator };
		}

		List<vdocDORel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDORel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDORel vdocDORel : list) {
					if (!Objects.equals(orgId, vdocDORel.getOrgId())) {
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

			query.append(_SQL_SELECT_VDOCDOREL_WHERE);

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_ORG_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORG_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_ORG_ORGID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDORelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindOrgId) {
					qPos.add(orgId);
				}

				if (!pagination) {
					list = (List<vdocDORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDORel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc d o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc d o rel
	 * @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel findByOrg_First(String orgId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = fetchByOrg_First(orgId, orderByComparator);

		if (vdocDORel != null) {
			return vdocDORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgId=");
		msg.append(orgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDORelException(msg.toString());
	}

	/**
	 * Returns the first vdoc d o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel fetchByOrg_First(String orgId,
		OrderByComparator<vdocDORel> orderByComparator) {
		List<vdocDORel> list = findByOrg(orgId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc d o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc d o rel
	 * @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel findByOrg_Last(String orgId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = fetchByOrg_Last(orgId, orderByComparator);

		if (vdocDORel != null) {
			return vdocDORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgId=");
		msg.append(orgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDORelException(msg.toString());
	}

	/**
	 * Returns the last vdoc d o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	 */
	@Override
	public vdocDORel fetchByOrg_Last(String orgId,
		OrderByComparator<vdocDORel> orderByComparator) {
		int count = countByOrg(orgId);

		if (count == 0) {
			return null;
		}

		List<vdocDORel> list = findByOrg(orgId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc d o rels before and after the current vdoc d o rel in the ordered set where orgId = &#63;.
	 *
	 * @param vdocDORelPK the primary key of the current vdoc d o rel
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc d o rel
	 * @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel[] findByOrg_PrevAndNext(vdocDORelPK vdocDORelPK,
		String orgId, OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = findByPrimaryKey(vdocDORelPK);

		Session session = null;

		try {
			session = openSession();

			vdocDORel[] array = new vdocDORelImpl[3];

			array[0] = getByOrg_PrevAndNext(session, vdocDORel, orgId,
					orderByComparator, true);

			array[1] = vdocDORel;

			array[2] = getByOrg_PrevAndNext(session, vdocDORel, orgId,
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

	protected vdocDORel getByOrg_PrevAndNext(Session session,
		vdocDORel vdocDORel, String orgId,
		OrderByComparator<vdocDORel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOREL_WHERE);

		boolean bindOrgId = false;

		if (orgId == null) {
			query.append(_FINDER_COLUMN_ORG_ORGID_1);
		}
		else if (orgId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ORG_ORGID_3);
		}
		else {
			bindOrgId = true;

			query.append(_FINDER_COLUMN_ORG_ORGID_2);
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
			query.append(vdocDORelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindOrgId) {
			qPos.add(orgId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDORel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDORel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc d o rels where orgId = &#63; from the database.
	 *
	 * @param orgId the org ID
	 */
	@Override
	public void removeByOrg(String orgId) {
		for (vdocDORel vdocDORel : findByOrg(orgId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vdocDORel);
		}
	}

	/**
	 * Returns the number of vdoc d o rels where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @return the number of matching vdoc d o rels
	 */
	@Override
	public int countByOrg(String orgId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORG;

		Object[] finderArgs = new Object[] { orgId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCDOREL_WHERE);

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_ORG_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORG_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_ORG_ORGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_ORG_ORGID_1 = "vdocDORel.id.orgId IS NULL";
	private static final String _FINDER_COLUMN_ORG_ORGID_2 = "vdocDORel.id.orgId = ?";
	private static final String _FINDER_COLUMN_ORG_ORGID_3 = "(vdocDORel.id.orgId IS NULL OR vdocDORel.id.orgId = '')";

	public vdocDORelPersistenceImpl() {
		setModelClass(vdocDORel.class);
	}

	/**
	 * Caches the vdoc d o rel in the entity cache if it is enabled.
	 *
	 * @param vdocDORel the vdoc d o rel
	 */
	@Override
	public void cacheResult(vdocDORel vdocDORel) {
		entityCache.putResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelImpl.class, vdocDORel.getPrimaryKey(), vdocDORel);

		vdocDORel.resetOriginalValues();
	}

	/**
	 * Caches the vdoc d o rels in the entity cache if it is enabled.
	 *
	 * @param vdocDORels the vdoc d o rels
	 */
	@Override
	public void cacheResult(List<vdocDORel> vdocDORels) {
		for (vdocDORel vdocDORel : vdocDORels) {
			if (entityCache.getResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
						vdocDORelImpl.class, vdocDORel.getPrimaryKey()) == null) {
				cacheResult(vdocDORel);
			}
			else {
				vdocDORel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vdoc d o rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vdocDORelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vdoc d o rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vdocDORel vdocDORel) {
		entityCache.removeResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelImpl.class, vdocDORel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<vdocDORel> vdocDORels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vdocDORel vdocDORel : vdocDORels) {
			entityCache.removeResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
				vdocDORelImpl.class, vdocDORel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vdoc d o rel with the primary key. Does not add the vdoc d o rel to the database.
	 *
	 * @param vdocDORelPK the primary key for the new vdoc d o rel
	 * @return the new vdoc d o rel
	 */
	@Override
	public vdocDORel create(vdocDORelPK vdocDORelPK) {
		vdocDORel vdocDORel = new vdocDORelImpl();

		vdocDORel.setNew(true);
		vdocDORel.setPrimaryKey(vdocDORelPK);

		return vdocDORel;
	}

	/**
	 * Removes the vdoc d o rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vdocDORelPK the primary key of the vdoc d o rel
	 * @return the vdoc d o rel that was removed
	 * @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel remove(vdocDORelPK vdocDORelPK)
		throws NoSuchvdocDORelException {
		return remove((Serializable)vdocDORelPK);
	}

	/**
	 * Removes the vdoc d o rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc d o rel
	 * @return the vdoc d o rel that was removed
	 * @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel remove(Serializable primaryKey)
		throws NoSuchvdocDORelException {
		Session session = null;

		try {
			session = openSession();

			vdocDORel vdocDORel = (vdocDORel)session.get(vdocDORelImpl.class,
					primaryKey);

			if (vdocDORel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvdocDORelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vdocDORel);
		}
		catch (NoSuchvdocDORelException nsee) {
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
	protected vdocDORel removeImpl(vdocDORel vdocDORel) {
		vdocDORel = toUnwrappedModel(vdocDORel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vdocDORel)) {
				vdocDORel = (vdocDORel)session.get(vdocDORelImpl.class,
						vdocDORel.getPrimaryKeyObj());
			}

			if (vdocDORel != null) {
				session.delete(vdocDORel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vdocDORel != null) {
			clearCache(vdocDORel);
		}

		return vdocDORel;
	}

	@Override
	public vdocDORel updateImpl(vdocDORel vdocDORel) {
		vdocDORel = toUnwrappedModel(vdocDORel);

		boolean isNew = vdocDORel.isNew();

		vdocDORelModelImpl vdocDORelModelImpl = (vdocDORelModelImpl)vdocDORel;

		Session session = null;

		try {
			session = openSession();

			if (vdocDORel.isNew()) {
				session.save(vdocDORel);

				vdocDORel.setNew(false);
			}
			else {
				vdocDORel = (vdocDORel)session.merge(vdocDORel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !vdocDORelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vdocDORelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDORelModelImpl.getOriginalDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCUMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT,
					args);

				args = new Object[] { vdocDORelModelImpl.getDocId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOCUMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENT,
					args);
			}

			if ((vdocDORelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDORelModelImpl.getOriginalOrgId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG,
					args);

				args = new Object[] { vdocDORelModelImpl.getOrgId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG,
					args);
			}
		}

		entityCache.putResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
			vdocDORelImpl.class, vdocDORel.getPrimaryKey(), vdocDORel, false);

		vdocDORel.resetOriginalValues();

		return vdocDORel;
	}

	protected vdocDORel toUnwrappedModel(vdocDORel vdocDORel) {
		if (vdocDORel instanceof vdocDORelImpl) {
			return vdocDORel;
		}

		vdocDORelImpl vdocDORelImpl = new vdocDORelImpl();

		vdocDORelImpl.setNew(vdocDORel.isNew());
		vdocDORelImpl.setPrimaryKey(vdocDORel.getPrimaryKey());

		vdocDORelImpl.setDocId(vdocDORel.getDocId());
		vdocDORelImpl.setOrgId(vdocDORel.getOrgId());

		return vdocDORelImpl;
	}

	/**
	 * Returns the vdoc d o rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc d o rel
	 * @return the vdoc d o rel
	 * @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvdocDORelException {
		vdocDORel vdocDORel = fetchByPrimaryKey(primaryKey);

		if (vdocDORel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvdocDORelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vdocDORel;
	}

	/**
	 * Returns the vdoc d o rel with the primary key or throws a {@link NoSuchvdocDORelException} if it could not be found.
	 *
	 * @param vdocDORelPK the primary key of the vdoc d o rel
	 * @return the vdoc d o rel
	 * @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel findByPrimaryKey(vdocDORelPK vdocDORelPK)
		throws NoSuchvdocDORelException {
		return findByPrimaryKey((Serializable)vdocDORelPK);
	}

	/**
	 * Returns the vdoc d o rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc d o rel
	 * @return the vdoc d o rel, or <code>null</code> if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
				vdocDORelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		vdocDORel vdocDORel = (vdocDORel)serializable;

		if (vdocDORel == null) {
			Session session = null;

			try {
				session = openSession();

				vdocDORel = (vdocDORel)session.get(vdocDORelImpl.class,
						primaryKey);

				if (vdocDORel != null) {
					cacheResult(vdocDORel);
				}
				else {
					entityCache.putResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
						vdocDORelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(vdocDORelModelImpl.ENTITY_CACHE_ENABLED,
					vdocDORelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vdocDORel;
	}

	/**
	 * Returns the vdoc d o rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vdocDORelPK the primary key of the vdoc d o rel
	 * @return the vdoc d o rel, or <code>null</code> if a vdoc d o rel with the primary key could not be found
	 */
	@Override
	public vdocDORel fetchByPrimaryKey(vdocDORelPK vdocDORelPK) {
		return fetchByPrimaryKey((Serializable)vdocDORelPK);
	}

	@Override
	public Map<Serializable, vdocDORel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, vdocDORel> map = new HashMap<Serializable, vdocDORel>();

		for (Serializable primaryKey : primaryKeys) {
			vdocDORel vdocDORel = fetchByPrimaryKey(primaryKey);

			if (vdocDORel != null) {
				map.put(primaryKey, vdocDORel);
			}
		}

		return map;
	}

	/**
	 * Returns all the vdoc d o rels.
	 *
	 * @return the vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc d o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @return the range of vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc d o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findAll(int start, int end,
		OrderByComparator<vdocDORel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc d o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc d o rels
	 * @param end the upper bound of the range of vdoc d o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vdoc d o rels
	 */
	@Override
	public List<vdocDORel> findAll(int start, int end,
		OrderByComparator<vdocDORel> orderByComparator,
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

		List<vdocDORel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDORel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VDOCDOREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCDOREL;

				if (pagination) {
					sql = sql.concat(vdocDORelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vdocDORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDORel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vdoc d o rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vdocDORel vdocDORel : findAll()) {
			remove(vdocDORel);
		}
	}

	/**
	 * Returns the number of vdoc d o rels.
	 *
	 * @return the number of vdoc d o rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VDOCDOREL);

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
		return vdocDORelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vdoc d o rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(vdocDORelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VDOCDOREL = "SELECT vdocDORel FROM vdocDORel vdocDORel";
	private static final String _SQL_SELECT_VDOCDOREL_WHERE = "SELECT vdocDORel FROM vdocDORel vdocDORel WHERE ";
	private static final String _SQL_COUNT_VDOCDOREL = "SELECT COUNT(vdocDORel) FROM vdocDORel vdocDORel";
	private static final String _SQL_COUNT_VDOCDOREL_WHERE = "SELECT COUNT(vdocDORel) FROM vdocDORel vdocDORel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocDORel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocDORel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocDORel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(vdocDORelPersistenceImpl.class);
}