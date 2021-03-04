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

import vn.gov.hoabinh.exception.NoSuchVLegalFTRelException;
import vn.gov.hoabinh.model.VLegalFTRel;
import vn.gov.hoabinh.model.impl.VLegalFTRelImpl;
import vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalFTRelPK;
import vn.gov.hoabinh.service.persistence.VLegalFTRelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal f t rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalFTRelUtil
 * @generated
 */
@ProviderType
public class VLegalFTRelPersistenceImpl extends BasePersistenceImpl<VLegalFTRel>
	implements VLegalFTRelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalFTRelUtil} to access the v legal f t rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalFTRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, VLegalFTRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, VLegalFTRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, VLegalFTRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, VLegalFTRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField",
			new String[] { String.class.getName() },
			VLegalFTRelModelImpl.FIELDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal f t rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByField(String fieldId) {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal f t rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @return the range of matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByField(String fieldId, int start, int end) {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal f t rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByField(String fieldId, int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return findByField(fieldId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal f t rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByField(String fieldId, int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator,
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

		List<VLegalFTRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalFTRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalFTRel vLegalFTRel : list) {
					if (!Objects.equals(fieldId, vLegalFTRel.getFieldId())) {
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

			query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

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
				query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel findByField_First(String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = fetchByField_First(fieldId, orderByComparator);

		if (vLegalFTRel != null) {
			return vLegalFTRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFTRelException(msg.toString());
	}

	/**
	 * Returns the first v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel fetchByField_First(String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		List<VLegalFTRel> list = findByField(fieldId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel findByField_Last(String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = fetchByField_Last(fieldId, orderByComparator);

		if (vLegalFTRel != null) {
			return vLegalFTRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFTRelException(msg.toString());
	}

	/**
	 * Returns the last v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel fetchByField_Last(String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		int count = countByField(fieldId);

		if (count == 0) {
			return null;
		}

		List<VLegalFTRel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal f t rels before and after the current v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * @param vLegalFTRelPK the primary key of the current v legal f t rel
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel[] findByField_PrevAndNext(VLegalFTRelPK vLegalFTRelPK,
		String fieldId, OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = findByPrimaryKey(vLegalFTRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFTRel[] array = new VLegalFTRelImpl[3];

			array[0] = getByField_PrevAndNext(session, vLegalFTRel, fieldId,
					orderByComparator, true);

			array[1] = vLegalFTRel;

			array[2] = getByField_PrevAndNext(session, vLegalFTRel, fieldId,
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

	protected VLegalFTRel getByField_PrevAndNext(Session session,
		VLegalFTRel vLegalFTRel, String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

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
			query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalFTRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFTRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal f t rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByField(String fieldId) {
		for (VLegalFTRel vLegalFTRel : findByField(fieldId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalFTRel);
		}
	}

	/**
	 * Returns the number of v legal f t rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the number of matching v legal f t rels
	 */
	@Override
	public int countByField(String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD;

		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFTREL_WHERE);

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

	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vLegalFTRel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vLegalFTRel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vLegalFTRel.id.fieldId IS NULL OR vLegalFTRel.id.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, VLegalFTRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, VLegalFTRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByType",
			new String[] { String.class.getName() },
			VLegalFTRelModelImpl.TYPEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal f t rels where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByType(String typeId) {
		return findByType(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal f t rels where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @return the range of matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByType(String typeId, int start, int end) {
		return findByType(typeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal f t rels where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByType(String typeId, int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return findByType(typeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal f t rels where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findByType(String typeId, int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { typeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { typeId, start, end, orderByComparator };
		}

		List<VLegalFTRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalFTRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalFTRel vLegalFTRel : list) {
					if (!Objects.equals(typeId, vLegalFTRel.getTypeId())) {
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

			query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_TYPE_TYPEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTypeId) {
					qPos.add(typeId);
				}

				if (!pagination) {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel findByType_First(String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = fetchByType_First(typeId, orderByComparator);

		if (vLegalFTRel != null) {
			return vLegalFTRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFTRelException(msg.toString());
	}

	/**
	 * Returns the first v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel fetchByType_First(String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		List<VLegalFTRel> list = findByType(typeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel findByType_Last(String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = fetchByType_Last(typeId, orderByComparator);

		if (vLegalFTRel != null) {
			return vLegalFTRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFTRelException(msg.toString());
	}

	/**
	 * Returns the last v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	 */
	@Override
	public VLegalFTRel fetchByType_Last(String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		int count = countByType(typeId);

		if (count == 0) {
			return null;
		}

		List<VLegalFTRel> list = findByType(typeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal f t rels before and after the current v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * @param vLegalFTRelPK the primary key of the current v legal f t rel
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel[] findByType_PrevAndNext(VLegalFTRelPK vLegalFTRelPK,
		String typeId, OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = findByPrimaryKey(vLegalFTRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFTRel[] array = new VLegalFTRelImpl[3];

			array[0] = getByType_PrevAndNext(session, vLegalFTRel, typeId,
					orderByComparator, true);

			array[1] = vLegalFTRel;

			array[2] = getByType_PrevAndNext(session, vLegalFTRel, typeId,
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

	protected VLegalFTRel getByType_PrevAndNext(Session session,
		VLegalFTRel vLegalFTRel, String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

		boolean bindTypeId = false;

		if (typeId == null) {
			query.append(_FINDER_COLUMN_TYPE_TYPEID_1);
		}
		else if (typeId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TYPE_TYPEID_3);
		}
		else {
			bindTypeId = true;

			query.append(_FINDER_COLUMN_TYPE_TYPEID_2);
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
			query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTypeId) {
			qPos.add(typeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalFTRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFTRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal f t rels where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	@Override
	public void removeByType(String typeId) {
		for (VLegalFTRel vLegalFTRel : findByType(typeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalFTRel);
		}
	}

	/**
	 * Returns the number of v legal f t rels where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching v legal f t rels
	 */
	@Override
	public int countByType(String typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFTREL_WHERE);

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_TYPE_TYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_TYPE_TYPEID_1 = "vLegalFTRel.id.typeId IS NULL";
	private static final String _FINDER_COLUMN_TYPE_TYPEID_2 = "vLegalFTRel.id.typeId = ?";
	private static final String _FINDER_COLUMN_TYPE_TYPEID_3 = "(vLegalFTRel.id.typeId IS NULL OR vLegalFTRel.id.typeId = '')";

	public VLegalFTRelPersistenceImpl() {
		setModelClass(VLegalFTRel.class);
	}

	/**
	 * Caches the v legal f t rel in the entity cache if it is enabled.
	 *
	 * @param vLegalFTRel the v legal f t rel
	 */
	@Override
	public void cacheResult(VLegalFTRel vLegalFTRel) {
		entityCache.putResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey(), vLegalFTRel);

		vLegalFTRel.resetOriginalValues();
	}

	/**
	 * Caches the v legal f t rels in the entity cache if it is enabled.
	 *
	 * @param vLegalFTRels the v legal f t rels
	 */
	@Override
	public void cacheResult(List<VLegalFTRel> vLegalFTRels) {
		for (VLegalFTRel vLegalFTRel : vLegalFTRels) {
			if (entityCache.getResult(
						VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey()) == null) {
				cacheResult(vLegalFTRel);
			}
			else {
				vLegalFTRel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal f t rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalFTRelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal f t rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalFTRel vLegalFTRel) {
		entityCache.removeResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalFTRel> vLegalFTRels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalFTRel vLegalFTRel : vLegalFTRels) {
			entityCache.removeResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	 *
	 * @param vLegalFTRelPK the primary key for the new v legal f t rel
	 * @return the new v legal f t rel
	 */
	@Override
	public VLegalFTRel create(VLegalFTRelPK vLegalFTRelPK) {
		VLegalFTRel vLegalFTRel = new VLegalFTRelImpl();

		vLegalFTRel.setNew(true);
		vLegalFTRel.setPrimaryKey(vLegalFTRelPK);

		return vLegalFTRel;
	}

	/**
	 * Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalFTRelPK the primary key of the v legal f t rel
	 * @return the v legal f t rel that was removed
	 * @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel remove(VLegalFTRelPK vLegalFTRelPK)
		throws NoSuchVLegalFTRelException {
		return remove((Serializable)vLegalFTRelPK);
	}

	/**
	 * Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal f t rel
	 * @return the v legal f t rel that was removed
	 * @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel remove(Serializable primaryKey)
		throws NoSuchVLegalFTRelException {
		Session session = null;

		try {
			session = openSession();

			VLegalFTRel vLegalFTRel = (VLegalFTRel)session.get(VLegalFTRelImpl.class,
					primaryKey);

			if (vLegalFTRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalFTRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalFTRel);
		}
		catch (NoSuchVLegalFTRelException nsee) {
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
	protected VLegalFTRel removeImpl(VLegalFTRel vLegalFTRel) {
		vLegalFTRel = toUnwrappedModel(vLegalFTRel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalFTRel)) {
				vLegalFTRel = (VLegalFTRel)session.get(VLegalFTRelImpl.class,
						vLegalFTRel.getPrimaryKeyObj());
			}

			if (vLegalFTRel != null) {
				session.delete(vLegalFTRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalFTRel != null) {
			clearCache(vLegalFTRel);
		}

		return vLegalFTRel;
	}

	@Override
	public VLegalFTRel updateImpl(VLegalFTRel vLegalFTRel) {
		vLegalFTRel = toUnwrappedModel(vLegalFTRel);

		boolean isNew = vLegalFTRel.isNew();

		VLegalFTRelModelImpl vLegalFTRelModelImpl = (VLegalFTRelModelImpl)vLegalFTRel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalFTRel.isNew()) {
				session.save(vLegalFTRel);

				vLegalFTRel.setNew(false);
			}
			else {
				vLegalFTRel = (VLegalFTRel)session.merge(vLegalFTRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalFTRelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalFTRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFTRelModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);

				args = new Object[] { vLegalFTRelModelImpl.getFieldId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);
			}

			if ((vLegalFTRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFTRelModelImpl.getOriginalTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);

				args = new Object[] { vLegalFTRelModelImpl.getTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);
			}
		}

		entityCache.putResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey(), vLegalFTRel,
			false);

		vLegalFTRel.resetOriginalValues();

		return vLegalFTRel;
	}

	protected VLegalFTRel toUnwrappedModel(VLegalFTRel vLegalFTRel) {
		if (vLegalFTRel instanceof VLegalFTRelImpl) {
			return vLegalFTRel;
		}

		VLegalFTRelImpl vLegalFTRelImpl = new VLegalFTRelImpl();

		vLegalFTRelImpl.setNew(vLegalFTRel.isNew());
		vLegalFTRelImpl.setPrimaryKey(vLegalFTRel.getPrimaryKey());

		vLegalFTRelImpl.setFieldId(vLegalFTRel.getFieldId());
		vLegalFTRelImpl.setTypeId(vLegalFTRel.getTypeId());

		return vLegalFTRelImpl;
	}

	/**
	 * Returns the v legal f t rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f t rel
	 * @return the v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalFTRelException {
		VLegalFTRel vLegalFTRel = fetchByPrimaryKey(primaryKey);

		if (vLegalFTRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalFTRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalFTRel;
	}

	/**
	 * Returns the v legal f t rel with the primary key or throws a {@link NoSuchVLegalFTRelException} if it could not be found.
	 *
	 * @param vLegalFTRelPK the primary key of the v legal f t rel
	 * @return the v legal f t rel
	 * @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel findByPrimaryKey(VLegalFTRelPK vLegalFTRelPK)
		throws NoSuchVLegalFTRelException {
		return findByPrimaryKey((Serializable)vLegalFTRelPK);
	}

	/**
	 * Returns the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f t rel
	 * @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFTRelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalFTRel vLegalFTRel = (VLegalFTRel)serializable;

		if (vLegalFTRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalFTRel = (VLegalFTRel)session.get(VLegalFTRelImpl.class,
						primaryKey);

				if (vLegalFTRel != null) {
					cacheResult(vLegalFTRel);
				}
				else {
					entityCache.putResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFTRelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalFTRelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalFTRel;
	}

	/**
	 * Returns the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalFTRelPK the primary key of the v legal f t rel
	 * @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	 */
	@Override
	public VLegalFTRel fetchByPrimaryKey(VLegalFTRelPK vLegalFTRelPK) {
		return fetchByPrimaryKey((Serializable)vLegalFTRelPK);
	}

	@Override
	public Map<Serializable, VLegalFTRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalFTRel> map = new HashMap<Serializable, VLegalFTRel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalFTRel vLegalFTRel = fetchByPrimaryKey(primaryKey);

			if (vLegalFTRel != null) {
				map.put(primaryKey, vLegalFTRel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal f t rels.
	 *
	 * @return the v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal f t rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @return the range of v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal f t rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findAll(int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal f t rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f t rels
	 * @param end the upper bound of the range of v legal f t rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal f t rels
	 */
	@Override
	public List<VLegalFTRel> findAll(int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator,
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

		List<VLegalFTRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalFTRel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALFTREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALFTREL;

				if (pagination) {
					sql = sql.concat(VLegalFTRelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal f t rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalFTRel vLegalFTRel : findAll()) {
			remove(vLegalFTRel);
		}
	}

	/**
	 * Returns the number of v legal f t rels.
	 *
	 * @return the number of v legal f t rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALFTREL);

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
		return VLegalFTRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal f t rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalFTRelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALFTREL = "SELECT vLegalFTRel FROM VLegalFTRel vLegalFTRel";
	private static final String _SQL_SELECT_VLEGALFTREL_WHERE = "SELECT vLegalFTRel FROM VLegalFTRel vLegalFTRel WHERE ";
	private static final String _SQL_COUNT_VLEGALFTREL = "SELECT COUNT(vLegalFTRel) FROM VLegalFTRel vLegalFTRel";
	private static final String _SQL_COUNT_VLEGALFTREL_WHERE = "SELECT COUNT(vLegalFTRel) FROM VLegalFTRel vLegalFTRel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalFTRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalFTRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalFTRel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalFTRelPersistenceImpl.class);
}