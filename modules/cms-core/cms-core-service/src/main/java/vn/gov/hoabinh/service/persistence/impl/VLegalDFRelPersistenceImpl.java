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

import vn.gov.hoabinh.exception.NoSuchVLegalDFRelException;
import vn.gov.hoabinh.model.VLegalDFRel;
import vn.gov.hoabinh.model.impl.VLegalDFRelImpl;
import vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalDFRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDFRelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal d f rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalDFRelUtil
 * @generated
 */
@ProviderType
public class VLegalDFRelPersistenceImpl extends BasePersistenceImpl<VLegalDFRel>
	implements VLegalDFRelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalDFRelUtil} to access the v legal d f rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDFRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, VLegalDFRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, VLegalDFRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, VLegalDFRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, VLegalDFRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField",
			new String[] { String.class.getName() },
			VLegalDFRelModelImpl.FIELDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal d f rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByField(String fieldId) {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d f rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @return the range of matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByField(String fieldId, int start, int end) {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d f rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByField(String fieldId, int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return findByField(fieldId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d f rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByField(String fieldId, int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD;
			finderArgs = new Object[] { fieldId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD;
			finderArgs = new Object[] { fieldId, start, end, orderByComparator };
		}

		List<VLegalDFRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDFRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDFRel vLegalDFRel : list) {
					if (!Objects.equals(fieldId, vLegalDFRel.getFieldId())) {
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

			query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				if (!pagination) {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel findByField_First(String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = fetchByField_First(fieldId, orderByComparator);

		if (vLegalDFRel != null) {
			return vLegalDFRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDFRelException(msg.toString());
	}

	/**
	 * Returns the first v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel fetchByField_First(String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		List<VLegalDFRel> list = findByField(fieldId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel findByField_Last(String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = fetchByField_Last(fieldId, orderByComparator);

		if (vLegalDFRel != null) {
			return vLegalDFRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDFRelException(msg.toString());
	}

	/**
	 * Returns the last v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel fetchByField_Last(String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		int count = countByField(fieldId);

		if (count == 0) {
			return null;
		}

		List<VLegalDFRel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d f rels before and after the current v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * @param vLegalDFRelPK the primary key of the current v legal d f rel
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel[] findByField_PrevAndNext(VLegalDFRelPK vLegalDFRelPK,
		String fieldId, OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = findByPrimaryKey(vLegalDFRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDFRel[] array = new VLegalDFRelImpl[3];

			array[0] = getByField_PrevAndNext(session, vLegalDFRel, fieldId,
					orderByComparator, true);

			array[1] = vLegalDFRel;

			array[2] = getByField_PrevAndNext(session, vLegalDFRel, fieldId,
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

	protected VLegalDFRel getByField_PrevAndNext(Session session,
		VLegalDFRel vLegalDFRel, String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
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
			query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDFRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDFRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d f rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByField(String fieldId) {
		for (VLegalDFRel vLegalDFRel : findByField(fieldId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDFRel);
		}
	}

	/**
	 * Returns the number of v legal d f rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the number of matching v legal d f rels
	 */
	@Override
	public int countByField(String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD;

		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDFREL_WHERE);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vLegalDFRel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vLegalDFRel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vLegalDFRel.id.fieldId IS NULL OR vLegalDFRel.id.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOC = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, VLegalDFRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDoc",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, VLegalDFRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDoc",
			new String[] { String.class.getName() },
			VLegalDFRelModelImpl.DOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOC = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDoc",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal d f rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByDoc(String docId) {
		return findByDoc(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d f rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @return the range of matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByDoc(String docId, int start, int end) {
		return findByDoc(docId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d f rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByDoc(String docId, int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return findByDoc(docId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d f rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findByDoc(String docId, int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC;
			finderArgs = new Object[] { docId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOC;
			finderArgs = new Object[] { docId, start, end, orderByComparator };
		}

		List<VLegalDFRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDFRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDFRel vLegalDFRel : list) {
					if (!Objects.equals(docId, vLegalDFRel.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOC_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOC_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_DOC_DOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel findByDoc_First(String docId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = fetchByDoc_First(docId, orderByComparator);

		if (vLegalDFRel != null) {
			return vLegalDFRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDFRelException(msg.toString());
	}

	/**
	 * Returns the first v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel fetchByDoc_First(String docId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		List<VLegalDFRel> list = findByDoc(docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel findByDoc_Last(String docId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = fetchByDoc_Last(docId, orderByComparator);

		if (vLegalDFRel != null) {
			return vLegalDFRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDFRelException(msg.toString());
	}

	/**
	 * Returns the last v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	 */
	@Override
	public VLegalDFRel fetchByDoc_Last(String docId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		int count = countByDoc(docId);

		if (count == 0) {
			return null;
		}

		List<VLegalDFRel> list = findByDoc(docId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d f rels before and after the current v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * @param vLegalDFRelPK the primary key of the current v legal d f rel
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel[] findByDoc_PrevAndNext(VLegalDFRelPK vLegalDFRelPK,
		String docId, OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = findByPrimaryKey(vLegalDFRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDFRel[] array = new VLegalDFRelImpl[3];

			array[0] = getByDoc_PrevAndNext(session, vLegalDFRel, docId,
					orderByComparator, true);

			array[1] = vLegalDFRel;

			array[2] = getByDoc_PrevAndNext(session, vLegalDFRel, docId,
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

	protected VLegalDFRel getByDoc_PrevAndNext(Session session,
		VLegalDFRel vLegalDFRel, String docId,
		OrderByComparator<VLegalDFRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

		boolean bindDocId = false;

		if (docId == null) {
			query.append(_FINDER_COLUMN_DOC_DOCID_1);
		}
		else if (docId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOC_DOCID_3);
		}
		else {
			bindDocId = true;

			query.append(_FINDER_COLUMN_DOC_DOCID_2);
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
			query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDFRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDFRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d f rels where docId = &#63; from the database.
	 *
	 * @param docId the doc ID
	 */
	@Override
	public void removeByDoc(String docId) {
		for (VLegalDFRel vLegalDFRel : findByDoc(docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDFRel);
		}
	}

	/**
	 * Returns the number of v legal d f rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the number of matching v legal d f rels
	 */
	@Override
	public int countByDoc(String docId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOC;

		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDFREL_WHERE);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOC_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOC_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_DOC_DOCID_2);
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

	private static final String _FINDER_COLUMN_DOC_DOCID_1 = "vLegalDFRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOC_DOCID_2 = "vLegalDFRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_3 = "(vLegalDFRel.id.docId IS NULL OR vLegalDFRel.id.docId = '')";

	public VLegalDFRelPersistenceImpl() {
		setModelClass(VLegalDFRel.class);
	}

	/**
	 * Caches the v legal d f rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDFRel the v legal d f rel
	 */
	@Override
	public void cacheResult(VLegalDFRel vLegalDFRel) {
		entityCache.putResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey(), vLegalDFRel);

		vLegalDFRel.resetOriginalValues();
	}

	/**
	 * Caches the v legal d f rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDFRels the v legal d f rels
	 */
	@Override
	public void cacheResult(List<VLegalDFRel> vLegalDFRels) {
		for (VLegalDFRel vLegalDFRel : vLegalDFRels) {
			if (entityCache.getResult(
						VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey()) == null) {
				cacheResult(vLegalDFRel);
			}
			else {
				vLegalDFRel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal d f rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalDFRelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal d f rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalDFRel vLegalDFRel) {
		entityCache.removeResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalDFRel> vLegalDFRels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalDFRel vLegalDFRel : vLegalDFRels) {
			entityCache.removeResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	 *
	 * @param vLegalDFRelPK the primary key for the new v legal d f rel
	 * @return the new v legal d f rel
	 */
	@Override
	public VLegalDFRel create(VLegalDFRelPK vLegalDFRelPK) {
		VLegalDFRel vLegalDFRel = new VLegalDFRelImpl();

		vLegalDFRel.setNew(true);
		vLegalDFRel.setPrimaryKey(vLegalDFRelPK);

		return vLegalDFRel;
	}

	/**
	 * Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel
	 * @return the v legal d f rel that was removed
	 * @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel remove(VLegalDFRelPK vLegalDFRelPK)
		throws NoSuchVLegalDFRelException {
		return remove((Serializable)vLegalDFRelPK);
	}

	/**
	 * Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d f rel
	 * @return the v legal d f rel that was removed
	 * @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel remove(Serializable primaryKey)
		throws NoSuchVLegalDFRelException {
		Session session = null;

		try {
			session = openSession();

			VLegalDFRel vLegalDFRel = (VLegalDFRel)session.get(VLegalDFRelImpl.class,
					primaryKey);

			if (vLegalDFRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalDFRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalDFRel);
		}
		catch (NoSuchVLegalDFRelException nsee) {
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
	protected VLegalDFRel removeImpl(VLegalDFRel vLegalDFRel) {
		vLegalDFRel = toUnwrappedModel(vLegalDFRel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalDFRel)) {
				vLegalDFRel = (VLegalDFRel)session.get(VLegalDFRelImpl.class,
						vLegalDFRel.getPrimaryKeyObj());
			}

			if (vLegalDFRel != null) {
				session.delete(vLegalDFRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalDFRel != null) {
			clearCache(vLegalDFRel);
		}

		return vLegalDFRel;
	}

	@Override
	public VLegalDFRel updateImpl(VLegalDFRel vLegalDFRel) {
		vLegalDFRel = toUnwrappedModel(vLegalDFRel);

		boolean isNew = vLegalDFRel.isNew();

		VLegalDFRelModelImpl vLegalDFRelModelImpl = (VLegalDFRelModelImpl)vLegalDFRel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalDFRel.isNew()) {
				session.save(vLegalDFRel);

				vLegalDFRel.setNew(false);
			}
			else {
				vLegalDFRel = (VLegalDFRel)session.merge(vLegalDFRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalDFRelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalDFRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDFRelModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);

				args = new Object[] { vLegalDFRelModelImpl.getFieldId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);
			}

			if ((vLegalDFRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDFRelModelImpl.getOriginalDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC,
					args);

				args = new Object[] { vLegalDFRelModelImpl.getDocId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC,
					args);
			}
		}

		entityCache.putResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey(), vLegalDFRel,
			false);

		vLegalDFRel.resetOriginalValues();

		return vLegalDFRel;
	}

	protected VLegalDFRel toUnwrappedModel(VLegalDFRel vLegalDFRel) {
		if (vLegalDFRel instanceof VLegalDFRelImpl) {
			return vLegalDFRel;
		}

		VLegalDFRelImpl vLegalDFRelImpl = new VLegalDFRelImpl();

		vLegalDFRelImpl.setNew(vLegalDFRel.isNew());
		vLegalDFRelImpl.setPrimaryKey(vLegalDFRel.getPrimaryKey());

		vLegalDFRelImpl.setFieldId(vLegalDFRel.getFieldId());
		vLegalDFRelImpl.setDocId(vLegalDFRel.getDocId());

		return vLegalDFRelImpl;
	}

	/**
	 * Returns the v legal d f rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d f rel
	 * @return the v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalDFRelException {
		VLegalDFRel vLegalDFRel = fetchByPrimaryKey(primaryKey);

		if (vLegalDFRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalDFRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalDFRel;
	}

	/**
	 * Returns the v legal d f rel with the primary key or throws a {@link NoSuchVLegalDFRelException} if it could not be found.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel
	 * @return the v legal d f rel
	 * @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel findByPrimaryKey(VLegalDFRelPK vLegalDFRelPK)
		throws NoSuchVLegalDFRelException {
		return findByPrimaryKey((Serializable)vLegalDFRelPK);
	}

	/**
	 * Returns the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d f rel
	 * @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDFRelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalDFRel vLegalDFRel = (VLegalDFRel)serializable;

		if (vLegalDFRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDFRel = (VLegalDFRel)session.get(VLegalDFRelImpl.class,
						primaryKey);

				if (vLegalDFRel != null) {
					cacheResult(vLegalDFRel);
				}
				else {
					entityCache.putResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDFRelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDFRelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalDFRel;
	}

	/**
	 * Returns the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel
	 * @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel fetchByPrimaryKey(VLegalDFRelPK vLegalDFRelPK) {
		return fetchByPrimaryKey((Serializable)vLegalDFRelPK);
	}

	@Override
	public Map<Serializable, VLegalDFRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalDFRel> map = new HashMap<Serializable, VLegalDFRel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalDFRel vLegalDFRel = fetchByPrimaryKey(primaryKey);

			if (vLegalDFRel != null) {
				map.put(primaryKey, vLegalDFRel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal d f rels.
	 *
	 * @return the v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d f rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @return the range of v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d f rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findAll(int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d f rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> findAll(int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator,
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

		List<VLegalDFRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDFRel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALDFREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDFREL;

				if (pagination) {
					sql = sql.concat(VLegalDFRelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d f rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalDFRel vLegalDFRel : findAll()) {
			remove(vLegalDFRel);
		}
	}

	/**
	 * Returns the number of v legal d f rels.
	 *
	 * @return the number of v legal d f rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDFREL);

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
		return VLegalDFRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal d f rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalDFRelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALDFREL = "SELECT vLegalDFRel FROM VLegalDFRel vLegalDFRel";
	private static final String _SQL_SELECT_VLEGALDFREL_WHERE = "SELECT vLegalDFRel FROM VLegalDFRel vLegalDFRel WHERE ";
	private static final String _SQL_COUNT_VLEGALDFREL = "SELECT COUNT(vLegalDFRel) FROM VLegalDFRel vLegalDFRel";
	private static final String _SQL_COUNT_VLEGALDFREL_WHERE = "SELECT COUNT(vLegalDFRel) FROM VLegalDFRel vLegalDFRel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDFRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDFRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDFRel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalDFRelPersistenceImpl.class);
}