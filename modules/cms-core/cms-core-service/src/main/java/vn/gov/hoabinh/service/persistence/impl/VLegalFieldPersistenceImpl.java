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

import vn.gov.hoabinh.exception.NoSuchVLegalFieldException;
import vn.gov.hoabinh.model.VLegalField;
import vn.gov.hoabinh.model.impl.VLegalFieldImpl;
import vn.gov.hoabinh.model.impl.VLegalFieldModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalFieldPersistence;

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
 * The persistence implementation for the v legal field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFieldPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalFieldUtil
 * @generated
 */
@ProviderType
public class VLegalFieldPersistenceImpl extends BasePersistenceImpl<VLegalField>
	implements VLegalFieldPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalFieldUtil} to access the v legal field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalFieldImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalFieldModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalFieldModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal fields where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal fields
	 */
	@Override
	public List<VLegalField> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal fields where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @return the range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal fields where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal fields where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
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

		List<VLegalField> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalField>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalField vLegalField : list) {
					if ((groupId != vLegalField.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal field in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByGroupId_First(long groupId,
		OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalField != null) {
			return vLegalField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFieldException(msg.toString());
	}

	/**
	 * Returns the first v legal field in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalField> orderByComparator) {
		List<VLegalField> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal field in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByGroupId_Last(long groupId,
		OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByGroupId_Last(groupId, orderByComparator);

		if (vLegalField != null) {
			return vLegalField;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFieldException(msg.toString());
	}

	/**
	 * Returns the last v legal field in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalField> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalField> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63;.
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal field
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField[] findByGroupId_PrevAndNext(String fieldId,
		long groupId, OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalField, groupId,
					orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByGroupId_PrevAndNext(session, vLegalField, groupId,
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

	protected VLegalField getByGroupId_PrevAndNext(Session session,
		VLegalField vLegalField, long groupId,
		OrderByComparator<VLegalField> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal fields where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalField vLegalField : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalField);
		}
	}

	/**
	 * Returns the number of v legal fields where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal fields
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalField.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_F = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_F",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalFieldModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalFieldModelImpl.FIELDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_F = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_F",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal field where groupId = &#63; and fieldId = &#63; or throws a {@link NoSuchVLegalFieldException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param fieldId the field ID
	 * @return the matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByG_F(long groupId, String fieldId)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByG_F(groupId, fieldId);

		if (vLegalField == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalFieldException(msg.toString());
		}

		return vLegalField;
	}

	/**
	 * Returns the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param fieldId the field ID
	 * @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByG_F(long groupId, String fieldId) {
		return fetchByG_F(groupId, fieldId, true);
	}

	/**
	 * Returns the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param fieldId the field ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByG_F(long groupId, String fieldId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, fieldId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_F,
					finderArgs, this);
		}

		if (result instanceof VLegalField) {
			VLegalField vLegalField = (VLegalField)result;

			if ((groupId != vLegalField.getGroupId()) ||
					!Objects.equals(fieldId, vLegalField.getFieldId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_F_GROUPID_2);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_F_FIELDID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				List<VLegalField> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_F, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalFieldPersistenceImpl.fetchByG_F(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalField vLegalField = list.get(0);

					result = vLegalField;

					cacheResult(vLegalField);

					if ((vLegalField.getGroupId() != groupId) ||
							(vLegalField.getFieldId() == null) ||
							!vLegalField.getFieldId().equals(fieldId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_F,
							finderArgs, vLegalField);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_F, finderArgs);

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
			return (VLegalField)result;
		}
	}

	/**
	 * Removes the v legal field where groupId = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param fieldId the field ID
	 * @return the v legal field that was removed
	 */
	@Override
	public VLegalField removeByG_F(long groupId, String fieldId)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = findByG_F(groupId, fieldId);

		return remove(vLegalField);
	}

	/**
	 * Returns the number of v legal fields where groupId = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param fieldId the field ID
	 * @return the number of matching v legal fields
	 */
	@Override
	public int countByG_F(long groupId, String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_F;

		Object[] finderArgs = new Object[] { groupId, fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_F_GROUPID_2);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_F_FIELDID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_G_F_GROUPID_2 = "vLegalField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_F_FIELDID_1 = "vLegalField.fieldId IS NULL";
	private static final String _FINDER_COLUMN_G_F_FIELDID_2 = "vLegalField.fieldId = ?";
	private static final String _FINDER_COLUMN_G_F_FIELDID_3 = "(vLegalField.fieldId IS NULL OR vLegalField.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			},
			VLegalFieldModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalFieldModelImpl.STATUSFIELD_COLUMN_BITMASK |
			VLegalFieldModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalFieldModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @return the matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language) {
		return findByS_L(groupId, statusField, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @return the range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language, int start, int end) {
		return findByS_L(groupId, statusField, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language, int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return findByS_L(groupId, statusField, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language, int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L;
			finderArgs = new Object[] { groupId, statusField, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L;
			finderArgs = new Object[] {
					groupId, statusField, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalField> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalField>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalField vLegalField : list) {
					if ((groupId != vLegalField.getGroupId()) ||
							(statusField != vLegalField.getStatusField()) ||
							!Objects.equals(language, vLegalField.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSFIELD_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByS_L_First(long groupId, boolean statusField,
		String language, OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByS_L_First(groupId, statusField,
				language, orderByComparator);

		if (vLegalField != null) {
			return vLegalField;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusField=");
		msg.append(statusField);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFieldException(msg.toString());
	}

	/**
	 * Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByS_L_First(long groupId, boolean statusField,
		String language, OrderByComparator<VLegalField> orderByComparator) {
		List<VLegalField> list = findByS_L(groupId, statusField, language, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByS_L_Last(long groupId, boolean statusField,
		String language, OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByS_L_Last(groupId, statusField,
				language, orderByComparator);

		if (vLegalField != null) {
			return vLegalField;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusField=");
		msg.append(statusField);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFieldException(msg.toString());
	}

	/**
	 * Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByS_L_Last(long groupId, boolean statusField,
		String language, OrderByComparator<VLegalField> orderByComparator) {
		int count = countByS_L(groupId, statusField, language);

		if (count == 0) {
			return null;
		}

		List<VLegalField> list = findByS_L(groupId, statusField, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal field
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField[] findByS_L_PrevAndNext(String fieldId, long groupId,
		boolean statusField, String language,
		OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vLegalField, groupId,
					statusField, language, orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByS_L_PrevAndNext(session, vLegalField, groupId,
					statusField, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalField getByS_L_PrevAndNext(Session session,
		VLegalField vLegalField, long groupId, boolean statusField,
		String language, OrderByComparator<VLegalField> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_S_L_STATUSFIELD_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusField);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 */
	@Override
	public void removeByS_L(long groupId, boolean statusField, String language) {
		for (VLegalField vLegalField : findByS_L(groupId, statusField,
				language, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalField);
		}
	}

	/**
	 * Returns the number of v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param language the language
	 * @return the number of matching v legal fields
	 */
	@Override
	public int countByS_L(long groupId, boolean statusField, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_L;

		Object[] finderArgs = new Object[] { groupId, statusField, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSFIELD_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

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

	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vLegalField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_STATUSFIELD_2 = "vLegalField.statusField = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vLegalField.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vLegalField.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vLegalField.language IS NULL OR vLegalField.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_RSS = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, VLegalFieldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			},
			VLegalFieldModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalFieldModelImpl.STATUSFIELD_COLUMN_BITMASK |
			VLegalFieldModelImpl.RSSABLE_COLUMN_BITMASK |
			VLegalFieldModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_RSS = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @return the matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable) {
		return findByS_Rss(groupId, statusField, rssable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @return the range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable, int start, int end) {
		return findByS_Rss(groupId, statusField, rssable, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return findByS_Rss(groupId, statusField, rssable, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal fields
	 */
	@Override
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS;
			finderArgs = new Object[] { groupId, statusField, rssable };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_RSS;
			finderArgs = new Object[] {
					groupId, statusField, rssable,
					
					start, end, orderByComparator
				};
		}

		List<VLegalField> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalField>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalField vLegalField : list) {
					if ((groupId != vLegalField.getGroupId()) ||
							(statusField != vLegalField.getStatusField()) ||
							(rssable != vLegalField.getRssable())) {
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSFIELD_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

				qPos.add(rssable);

				if (!pagination) {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByS_Rss_First(long groupId, boolean statusField,
		boolean rssable, OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByS_Rss_First(groupId, statusField,
				rssable, orderByComparator);

		if (vLegalField != null) {
			return vLegalField;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusField=");
		msg.append(statusField);

		msg.append(", rssable=");
		msg.append(rssable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFieldException(msg.toString());
	}

	/**
	 * Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByS_Rss_First(long groupId, boolean statusField,
		boolean rssable, OrderByComparator<VLegalField> orderByComparator) {
		List<VLegalField> list = findByS_Rss(groupId, statusField, rssable, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal field
	 * @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	 */
	@Override
	public VLegalField findByS_Rss_Last(long groupId, boolean statusField,
		boolean rssable, OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByS_Rss_Last(groupId, statusField,
				rssable, orderByComparator);

		if (vLegalField != null) {
			return vLegalField;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusField=");
		msg.append(statusField);

		msg.append(", rssable=");
		msg.append(rssable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalFieldException(msg.toString());
	}

	/**
	 * Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 */
	@Override
	public VLegalField fetchByS_Rss_Last(long groupId, boolean statusField,
		boolean rssable, OrderByComparator<VLegalField> orderByComparator) {
		int count = countByS_Rss(groupId, statusField, rssable);

		if (count == 0) {
			return null;
		}

		List<VLegalField> list = findByS_Rss(groupId, statusField, rssable,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal field
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField[] findByS_Rss_PrevAndNext(String fieldId, long groupId,
		boolean statusField, boolean rssable,
		OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByS_Rss_PrevAndNext(session, vLegalField, groupId,
					statusField, rssable, orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByS_Rss_PrevAndNext(session, vLegalField, groupId,
					statusField, rssable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalField getByS_Rss_PrevAndNext(Session session,
		VLegalField vLegalField, long groupId, boolean statusField,
		boolean rssable, OrderByComparator<VLegalField> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

		query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

		query.append(_FINDER_COLUMN_S_RSS_STATUSFIELD_2);

		query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusField);

		qPos.add(rssable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 */
	@Override
	public void removeByS_Rss(long groupId, boolean statusField, boolean rssable) {
		for (VLegalField vLegalField : findByS_Rss(groupId, statusField,
				rssable, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalField);
		}
	}

	/**
	 * Returns the number of v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusField the status field
	 * @param rssable the rssable
	 * @return the number of matching v legal fields
	 */
	@Override
	public int countByS_Rss(long groupId, boolean statusField, boolean rssable) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_RSS;

		Object[] finderArgs = new Object[] { groupId, statusField, rssable };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSFIELD_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

				qPos.add(rssable);

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

	private static final String _FINDER_COLUMN_S_RSS_GROUPID_2 = "vLegalField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_STATUSFIELD_2 = "vLegalField.statusField = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_RSSABLE_2 = "vLegalField.rssable = ?";

	public VLegalFieldPersistenceImpl() {
		setModelClass(VLegalField.class);
	}

	/**
	 * Caches the v legal field in the entity cache if it is enabled.
	 *
	 * @param vLegalField the v legal field
	 */
	@Override
	public void cacheResult(VLegalField vLegalField) {
		entityCache.putResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey(), vLegalField);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_F,
			new Object[] { vLegalField.getGroupId(), vLegalField.getFieldId() },
			vLegalField);

		vLegalField.resetOriginalValues();
	}

	/**
	 * Caches the v legal fields in the entity cache if it is enabled.
	 *
	 * @param vLegalFields the v legal fields
	 */
	@Override
	public void cacheResult(List<VLegalField> vLegalFields) {
		for (VLegalField vLegalField : vLegalFields) {
			if (entityCache.getResult(
						VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFieldImpl.class, vLegalField.getPrimaryKey()) == null) {
				cacheResult(vLegalField);
			}
			else {
				vLegalField.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal fields.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalFieldImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal field.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalField vLegalField) {
		entityCache.removeResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalFieldModelImpl)vLegalField);
	}

	@Override
	public void clearCache(List<VLegalField> vLegalFields) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalField vLegalField : vLegalFields) {
			entityCache.removeResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFieldImpl.class, vLegalField.getPrimaryKey());

			clearUniqueFindersCache((VLegalFieldModelImpl)vLegalField);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalFieldModelImpl vLegalFieldModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalFieldModelImpl.getGroupId(),
					vLegalFieldModelImpl.getFieldId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_F, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_F, args,
				vLegalFieldModelImpl);
		}
		else {
			if ((vLegalFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFieldModelImpl.getGroupId(),
						vLegalFieldModelImpl.getFieldId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_F, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_F, args,
					vLegalFieldModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalFieldModelImpl vLegalFieldModelImpl) {
		Object[] args = new Object[] {
				vLegalFieldModelImpl.getGroupId(),
				vLegalFieldModelImpl.getFieldId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_F, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_F, args);

		if ((vLegalFieldModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_F.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalFieldModelImpl.getOriginalGroupId(),
					vLegalFieldModelImpl.getOriginalFieldId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_F, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_F, args);
		}
	}

	/**
	 * Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	 *
	 * @param fieldId the primary key for the new v legal field
	 * @return the new v legal field
	 */
	@Override
	public VLegalField create(String fieldId) {
		VLegalField vLegalField = new VLegalFieldImpl();

		vLegalField.setNew(true);
		vLegalField.setPrimaryKey(fieldId);

		vLegalField.setCompanyId(companyProvider.getCompanyId());

		return vLegalField;
	}

	/**
	 * Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fieldId the primary key of the v legal field
	 * @return the v legal field that was removed
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField remove(String fieldId) throws NoSuchVLegalFieldException {
		return remove((Serializable)fieldId);
	}

	/**
	 * Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal field
	 * @return the v legal field that was removed
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField remove(Serializable primaryKey)
		throws NoSuchVLegalFieldException {
		Session session = null;

		try {
			session = openSession();

			VLegalField vLegalField = (VLegalField)session.get(VLegalFieldImpl.class,
					primaryKey);

			if (vLegalField == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalField);
		}
		catch (NoSuchVLegalFieldException nsee) {
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
	protected VLegalField removeImpl(VLegalField vLegalField) {
		vLegalField = toUnwrappedModel(vLegalField);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalField)) {
				vLegalField = (VLegalField)session.get(VLegalFieldImpl.class,
						vLegalField.getPrimaryKeyObj());
			}

			if (vLegalField != null) {
				session.delete(vLegalField);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalField != null) {
			clearCache(vLegalField);
		}

		return vLegalField;
	}

	@Override
	public VLegalField updateImpl(VLegalField vLegalField) {
		vLegalField = toUnwrappedModel(vLegalField);

		boolean isNew = vLegalField.isNew();

		VLegalFieldModelImpl vLegalFieldModelImpl = (VLegalFieldModelImpl)vLegalField;

		Session session = null;

		try {
			session = openSession();

			if (vLegalField.isNew()) {
				session.save(vLegalField);

				vLegalField.setNew(false);
			}
			else {
				vLegalField = (VLegalField)session.merge(vLegalField);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalFieldModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFieldModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalFieldModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFieldModelImpl.getOriginalGroupId(),
						vLegalFieldModelImpl.getOriginalStatusField(),
						vLegalFieldModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L,
					args);

				args = new Object[] {
						vLegalFieldModelImpl.getGroupId(),
						vLegalFieldModelImpl.getStatusField(),
						vLegalFieldModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L,
					args);
			}

			if ((vLegalFieldModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalFieldModelImpl.getOriginalGroupId(),
						vLegalFieldModelImpl.getOriginalStatusField(),
						vLegalFieldModelImpl.getOriginalRssable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_RSS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS,
					args);

				args = new Object[] {
						vLegalFieldModelImpl.getGroupId(),
						vLegalFieldModelImpl.getStatusField(),
						vLegalFieldModelImpl.getRssable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_RSS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS,
					args);
			}
		}

		entityCache.putResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey(), vLegalField,
			false);

		clearUniqueFindersCache(vLegalFieldModelImpl);
		cacheUniqueFindersCache(vLegalFieldModelImpl, isNew);

		vLegalField.resetOriginalValues();

		return vLegalField;
	}

	protected VLegalField toUnwrappedModel(VLegalField vLegalField) {
		if (vLegalField instanceof VLegalFieldImpl) {
			return vLegalField;
		}

		VLegalFieldImpl vLegalFieldImpl = new VLegalFieldImpl();

		vLegalFieldImpl.setNew(vLegalField.isNew());
		vLegalFieldImpl.setPrimaryKey(vLegalField.getPrimaryKey());

		vLegalFieldImpl.setFieldId(vLegalField.getFieldId());
		vLegalFieldImpl.setGroupId(vLegalField.getGroupId());
		vLegalFieldImpl.setCompanyId(vLegalField.getCompanyId());
		vLegalFieldImpl.setUserId(vLegalField.getUserId());
		vLegalFieldImpl.setCreatedDate(vLegalField.getCreatedDate());
		vLegalFieldImpl.setModifiedDate(vLegalField.getModifiedDate());
		vLegalFieldImpl.setCreatedByUser(vLegalField.getCreatedByUser());
		vLegalFieldImpl.setModifiedByUser(vLegalField.getModifiedByUser());
		vLegalFieldImpl.setName(vLegalField.getName());
		vLegalFieldImpl.setDescription(vLegalField.getDescription());
		vLegalFieldImpl.setLanguage(vLegalField.getLanguage());
		vLegalFieldImpl.setStatusField(vLegalField.isStatusField());
		vLegalFieldImpl.setRssable(vLegalField.isRssable());

		return vLegalFieldImpl;
	}

	/**
	 * Returns the v legal field with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal field
	 * @return the v legal field
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalFieldException {
		VLegalField vLegalField = fetchByPrimaryKey(primaryKey);

		if (vLegalField == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalField;
	}

	/**
	 * Returns the v legal field with the primary key or throws a {@link NoSuchVLegalFieldException} if it could not be found.
	 *
	 * @param fieldId the primary key of the v legal field
	 * @return the v legal field
	 * @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField findByPrimaryKey(String fieldId)
		throws NoSuchVLegalFieldException {
		return findByPrimaryKey((Serializable)fieldId);
	}

	/**
	 * Returns the v legal field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal field
	 * @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFieldImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalField vLegalField = (VLegalField)serializable;

		if (vLegalField == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalField = (VLegalField)session.get(VLegalFieldImpl.class,
						primaryKey);

				if (vLegalField != null) {
					cacheResult(vLegalField);
				}
				else {
					entityCache.putResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFieldImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
					VLegalFieldImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalField;
	}

	/**
	 * Returns the v legal field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fieldId the primary key of the v legal field
	 * @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	 */
	@Override
	public VLegalField fetchByPrimaryKey(String fieldId) {
		return fetchByPrimaryKey((Serializable)fieldId);
	}

	@Override
	public Map<Serializable, VLegalField> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalField> map = new HashMap<Serializable, VLegalField>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalField vLegalField = fetchByPrimaryKey(primaryKey);

			if (vLegalField != null) {
				map.put(primaryKey, vLegalField);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
					VLegalFieldImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalField)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE_PKS_IN);

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

			for (VLegalField vLegalField : (List<VLegalField>)q.list()) {
				map.put(vLegalField.getPrimaryKeyObj(), vLegalField);

				cacheResult(vLegalField);

				uncachedPrimaryKeys.remove(vLegalField.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
					VLegalFieldImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal fields.
	 *
	 * @return the v legal fields
	 */
	@Override
	public List<VLegalField> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @return the range of v legal fields
	 */
	@Override
	public List<VLegalField> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal fields
	 */
	@Override
	public List<VLegalField> findAll(int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal fields
	 * @param end the upper bound of the range of v legal fields (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal fields
	 */
	@Override
	public List<VLegalField> findAll(int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
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

		List<VLegalField> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalField>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALFIELD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALFIELD;

				if (pagination) {
					sql = sql.concat(VLegalFieldModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal fields from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalField vLegalField : findAll()) {
			remove(vLegalField);
		}
	}

	/**
	 * Returns the number of v legal fields.
	 *
	 * @return the number of v legal fields
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALFIELD);

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
		return VLegalFieldModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal field persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalFieldImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALFIELD = "SELECT vLegalField FROM VLegalField vLegalField";
	private static final String _SQL_SELECT_VLEGALFIELD_WHERE_PKS_IN = "SELECT vLegalField FROM VLegalField vLegalField WHERE fieldId IN (";
	private static final String _SQL_SELECT_VLEGALFIELD_WHERE = "SELECT vLegalField FROM VLegalField vLegalField WHERE ";
	private static final String _SQL_COUNT_VLEGALFIELD = "SELECT COUNT(vLegalField) FROM VLegalField vLegalField";
	private static final String _SQL_COUNT_VLEGALFIELD_WHERE = "SELECT COUNT(vLegalField) FROM VLegalField vLegalField WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalField.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalField exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalField exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalFieldPersistenceImpl.class);
}