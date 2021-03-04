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

import vn.gov.hoabinh.exception.NoSuchVLegalFORelException;
import vn.gov.hoabinh.model.VLegalFORel;
import vn.gov.hoabinh.model.impl.VLegalFORelImpl;
import vn.gov.hoabinh.model.impl.VLegalFORelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalFORelPK;
import vn.gov.hoabinh.service.persistence.VLegalFORelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal f o rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFORelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalFORelUtil
 * @generated
 */
@ProviderType
public class VLegalFORelPersistenceImpl extends BasePersistenceImpl<VLegalFORel>
	implements VLegalFORelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalFORelUtil} to access the v legal f o rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalFORelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, VLegalFORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, VLegalFORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, VLegalFORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, VLegalFORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField",
			new String[] { String.class.getName() },
			VLegalFORelModelImpl.FIELDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal f o rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByField(String fieldId) {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal f o rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @return the range of matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByField(String fieldId, int start, int end) {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal f o rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByField(String fieldId, int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return findByField(fieldId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal f o rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByField(String fieldId, int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator,
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

		List<VLegalFORel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalFORel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalFORel vLegalFORel : list) {
					if (!Objects.equals(fieldId, vLegalFORel.getFieldId())) {
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

			query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

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
				query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f o rel
	 * @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel findByField_First(String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = fetchByField_First(fieldId, orderByComparator);

		if (vLegalFORel != null) {
			return vLegalFORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFORelException(msg.toString());
	}

	/**
	 * Returns the first v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel fetchByField_First(String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		List<VLegalFORel> list = findByField(fieldId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f o rel
	 * @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel findByField_Last(String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = fetchByField_Last(fieldId, orderByComparator);

		if (vLegalFORel != null) {
			return vLegalFORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFORelException(msg.toString());
	}

	/**
	 * Returns the last v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel fetchByField_Last(String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		int count = countByField(fieldId);

		if (count == 0) {
			return null;
		}

		List<VLegalFORel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal f o rels before and after the current v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * @param vLegalFORelPK the primary key of the current v legal f o rel
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal f o rel
	 * @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel[] findByField_PrevAndNext(VLegalFORelPK vLegalFORelPK,
		String fieldId, OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = findByPrimaryKey(vLegalFORelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFORel[] array = new VLegalFORelImpl[3];

			array[0] = getByField_PrevAndNext(session, vLegalFORel, fieldId,
					orderByComparator, true);

			array[1] = vLegalFORel;

			array[2] = getByField_PrevAndNext(session, vLegalFORel, fieldId,
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

	protected VLegalFORel getByField_PrevAndNext(Session session,
		VLegalFORel vLegalFORel, String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

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
			query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalFORel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFORel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal f o rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByField(String fieldId) {
		for (VLegalFORel vLegalFORel : findByField(fieldId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalFORel);
		}
	}

	/**
	 * Returns the number of v legal f o rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the number of matching v legal f o rels
	 */
	@Override
	public int countByField(String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD;

		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFOREL_WHERE);

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

	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vLegalFORel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vLegalFORel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vLegalFORel.id.fieldId IS NULL OR vLegalFORel.id.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORG = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, VLegalFORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOrg",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, VLegalFORelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrg",
			new String[] { String.class.getName() },
			VLegalFORelModelImpl.ORGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORG = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrg",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal f o rels where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @return the matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByOrg(String orgId) {
		return findByOrg(orgId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal f o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @return the range of matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByOrg(String orgId, int start, int end) {
		return findByOrg(orgId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal f o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByOrg(String orgId, int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return findByOrg(orgId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal f o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findByOrg(String orgId, int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator,
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

		List<VLegalFORel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalFORel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalFORel vLegalFORel : list) {
					if (!Objects.equals(orgId, vLegalFORel.getOrgId())) {
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

			query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

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
				query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f o rel
	 * @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel findByOrg_First(String orgId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = fetchByOrg_First(orgId, orderByComparator);

		if (vLegalFORel != null) {
			return vLegalFORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgId=");
		msg.append(orgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFORelException(msg.toString());
	}

	/**
	 * Returns the first v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel fetchByOrg_First(String orgId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		List<VLegalFORel> list = findByOrg(orgId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f o rel
	 * @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel findByOrg_Last(String orgId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = fetchByOrg_Last(orgId, orderByComparator);

		if (vLegalFORel != null) {
			return vLegalFORel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("orgId=");
		msg.append(orgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFORelException(msg.toString());
	}

	/**
	 * Returns the last v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	 */
	@Override
	public VLegalFORel fetchByOrg_Last(String orgId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		int count = countByOrg(orgId);

		if (count == 0) {
			return null;
		}

		List<VLegalFORel> list = findByOrg(orgId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal f o rels before and after the current v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * @param vLegalFORelPK the primary key of the current v legal f o rel
	 * @param orgId the org ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal f o rel
	 * @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel[] findByOrg_PrevAndNext(VLegalFORelPK vLegalFORelPK,
		String orgId, OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = findByPrimaryKey(vLegalFORelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFORel[] array = new VLegalFORelImpl[3];

			array[0] = getByOrg_PrevAndNext(session, vLegalFORel, orgId,
					orderByComparator, true);

			array[1] = vLegalFORel;

			array[2] = getByOrg_PrevAndNext(session, vLegalFORel, orgId,
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

	protected VLegalFORel getByOrg_PrevAndNext(Session session,
		VLegalFORel vLegalFORel, String orgId,
		OrderByComparator<VLegalFORel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

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
			query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalFORel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFORel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal f o rels where orgId = &#63; from the database.
	 *
	 * @param orgId the org ID
	 */
	@Override
	public void removeByOrg(String orgId) {
		for (VLegalFORel vLegalFORel : findByOrg(orgId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalFORel);
		}
	}

	/**
	 * Returns the number of v legal f o rels where orgId = &#63;.
	 *
	 * @param orgId the org ID
	 * @return the number of matching v legal f o rels
	 */
	@Override
	public int countByOrg(String orgId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORG;

		Object[] finderArgs = new Object[] { orgId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFOREL_WHERE);

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

	private static final String _FINDER_COLUMN_ORG_ORGID_1 = "vLegalFORel.id.orgId IS NULL";
	private static final String _FINDER_COLUMN_ORG_ORGID_2 = "vLegalFORel.id.orgId = ?";
	private static final String _FINDER_COLUMN_ORG_ORGID_3 = "(vLegalFORel.id.orgId IS NULL OR vLegalFORel.id.orgId = '')";

	public VLegalFORelPersistenceImpl() {
		setModelClass(VLegalFORel.class);
	}

	/**
	 * Caches the v legal f o rel in the entity cache if it is enabled.
	 *
	 * @param vLegalFORel the v legal f o rel
	 */
	@Override
	public void cacheResult(VLegalFORel vLegalFORel) {
		entityCache.putResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey(), vLegalFORel);

		vLegalFORel.resetOriginalValues();
	}

	/**
	 * Caches the v legal f o rels in the entity cache if it is enabled.
	 *
	 * @param vLegalFORels the v legal f o rels
	 */
	@Override
	public void cacheResult(List<VLegalFORel> vLegalFORels) {
		for (VLegalFORel vLegalFORel : vLegalFORels) {
			if (entityCache.getResult(
						VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFORelImpl.class, vLegalFORel.getPrimaryKey()) == null) {
				cacheResult(vLegalFORel);
			}
			else {
				vLegalFORel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal f o rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalFORelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal f o rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalFORel vLegalFORel) {
		entityCache.removeResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalFORel> vLegalFORels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalFORel vLegalFORel : vLegalFORels) {
			entityCache.removeResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFORelImpl.class, vLegalFORel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	 *
	 * @param vLegalFORelPK the primary key for the new v legal f o rel
	 * @return the new v legal f o rel
	 */
	@Override
	public VLegalFORel create(VLegalFORelPK vLegalFORelPK) {
		VLegalFORel vLegalFORel = new VLegalFORelImpl();

		vLegalFORel.setNew(true);
		vLegalFORel.setPrimaryKey(vLegalFORelPK);

		return vLegalFORel;
	}

	/**
	 * Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalFORelPK the primary key of the v legal f o rel
	 * @return the v legal f o rel that was removed
	 * @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel remove(VLegalFORelPK vLegalFORelPK)
		throws NoSuchVLegalFORelException {
		return remove((Serializable)vLegalFORelPK);
	}

	/**
	 * Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal f o rel
	 * @return the v legal f o rel that was removed
	 * @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel remove(Serializable primaryKey)
		throws NoSuchVLegalFORelException {
		Session session = null;

		try {
			session = openSession();

			VLegalFORel vLegalFORel = (VLegalFORel)session.get(VLegalFORelImpl.class,
					primaryKey);

			if (vLegalFORel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalFORelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalFORel);
		}
		catch (NoSuchVLegalFORelException nsee) {
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
	protected VLegalFORel removeImpl(VLegalFORel vLegalFORel) {
		vLegalFORel = toUnwrappedModel(vLegalFORel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalFORel)) {
				vLegalFORel = (VLegalFORel)session.get(VLegalFORelImpl.class,
						vLegalFORel.getPrimaryKeyObj());
			}

			if (vLegalFORel != null) {
				session.delete(vLegalFORel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalFORel != null) {
			clearCache(vLegalFORel);
		}

		return vLegalFORel;
	}

	@Override
	public VLegalFORel updateImpl(VLegalFORel vLegalFORel) {
		vLegalFORel = toUnwrappedModel(vLegalFORel);

		boolean isNew = vLegalFORel.isNew();

		VLegalFORelModelImpl vLegalFORelModelImpl = (VLegalFORelModelImpl)vLegalFORel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalFORel.isNew()) {
				session.save(vLegalFORel);

				vLegalFORel.setNew(false);
			}
			else {
				vLegalFORel = (VLegalFORel)session.merge(vLegalFORel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalFORelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalFORelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFORelModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);

				args = new Object[] { vLegalFORelModelImpl.getFieldId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);
			}

			if ((vLegalFORelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFORelModelImpl.getOriginalOrgId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG,
					args);

				args = new Object[] { vLegalFORelModelImpl.getOrgId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ORG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORG,
					args);
			}
		}

		entityCache.putResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey(), vLegalFORel,
			false);

		vLegalFORel.resetOriginalValues();

		return vLegalFORel;
	}

	protected VLegalFORel toUnwrappedModel(VLegalFORel vLegalFORel) {
		if (vLegalFORel instanceof VLegalFORelImpl) {
			return vLegalFORel;
		}

		VLegalFORelImpl vLegalFORelImpl = new VLegalFORelImpl();

		vLegalFORelImpl.setNew(vLegalFORel.isNew());
		vLegalFORelImpl.setPrimaryKey(vLegalFORel.getPrimaryKey());

		vLegalFORelImpl.setFieldId(vLegalFORel.getFieldId());
		vLegalFORelImpl.setOrgId(vLegalFORel.getOrgId());

		return vLegalFORelImpl;
	}

	/**
	 * Returns the v legal f o rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f o rel
	 * @return the v legal f o rel
	 * @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalFORelException {
		VLegalFORel vLegalFORel = fetchByPrimaryKey(primaryKey);

		if (vLegalFORel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalFORelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalFORel;
	}

	/**
	 * Returns the v legal f o rel with the primary key or throws a {@link NoSuchVLegalFORelException} if it could not be found.
	 *
	 * @param vLegalFORelPK the primary key of the v legal f o rel
	 * @return the v legal f o rel
	 * @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel findByPrimaryKey(VLegalFORelPK vLegalFORelPK)
		throws NoSuchVLegalFORelException {
		return findByPrimaryKey((Serializable)vLegalFORelPK);
	}

	/**
	 * Returns the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f o rel
	 * @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFORelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalFORel vLegalFORel = (VLegalFORel)serializable;

		if (vLegalFORel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalFORel = (VLegalFORel)session.get(VLegalFORelImpl.class,
						primaryKey);

				if (vLegalFORel != null) {
					cacheResult(vLegalFORel);
				}
				else {
					entityCache.putResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFORelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalFORelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalFORel;
	}

	/**
	 * Returns the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalFORelPK the primary key of the v legal f o rel
	 * @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	 */
	@Override
	public VLegalFORel fetchByPrimaryKey(VLegalFORelPK vLegalFORelPK) {
		return fetchByPrimaryKey((Serializable)vLegalFORelPK);
	}

	@Override
	public Map<Serializable, VLegalFORel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalFORel> map = new HashMap<Serializable, VLegalFORel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalFORel vLegalFORel = fetchByPrimaryKey(primaryKey);

			if (vLegalFORel != null) {
				map.put(primaryKey, vLegalFORel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal f o rels.
	 *
	 * @return the v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal f o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @return the range of v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal f o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findAll(int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal f o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f o rels
	 * @param end the upper bound of the range of v legal f o rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal f o rels
	 */
	@Override
	public List<VLegalFORel> findAll(int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator,
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

		List<VLegalFORel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalFORel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALFOREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALFOREL;

				if (pagination) {
					sql = sql.concat(VLegalFORelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal f o rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalFORel vLegalFORel : findAll()) {
			remove(vLegalFORel);
		}
	}

	/**
	 * Returns the number of v legal f o rels.
	 *
	 * @return the number of v legal f o rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALFOREL);

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
		return VLegalFORelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal f o rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalFORelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALFOREL = "SELECT vLegalFORel FROM VLegalFORel vLegalFORel";
	private static final String _SQL_SELECT_VLEGALFOREL_WHERE = "SELECT vLegalFORel FROM VLegalFORel vLegalFORel WHERE ";
	private static final String _SQL_COUNT_VLEGALFOREL = "SELECT COUNT(vLegalFORel) FROM VLegalFORel vLegalFORel";
	private static final String _SQL_COUNT_VLEGALFOREL_WHERE = "SELECT COUNT(vLegalFORel) FROM VLegalFORel vLegalFORel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalFORel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalFORel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalFORel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalFORelPersistenceImpl.class);
}