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

import vn.gov.hoabinh.exception.NoSuchVLegalTypeException;
import vn.gov.hoabinh.model.VLegalType;
import vn.gov.hoabinh.model.impl.VLegalTypeImpl;
import vn.gov.hoabinh.model.impl.VLegalTypeModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalTypePersistence;

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
 * The persistence implementation for the v legal type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTypePersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalTypeUtil
 * @generated
 */
@ProviderType
public class VLegalTypePersistenceImpl extends BasePersistenceImpl<VLegalType>
	implements VLegalTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalTypeUtil} to access the v legal type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalTypeModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalTypeModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal types where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal types
	 */
	@Override
	public List<VLegalType> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @return the range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
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

		List<VLegalType> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalType vLegalType : list) {
					if ((groupId != vLegalType.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByGroupId_First(long groupId,
		OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByGroupId_First(groupId, orderByComparator);

		if (vLegalType != null) {
			return vLegalType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTypeException(msg.toString());
	}

	/**
	 * Returns the first v legal type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalType> orderByComparator) {
		List<VLegalType> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByGroupId_Last(long groupId,
		OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByGroupId_Last(groupId, orderByComparator);

		if (vLegalType != null) {
			return vLegalType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTypeException(msg.toString());
	}

	/**
	 * Returns the last v legal type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalType> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalType> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63;.
	 *
	 * @param typeId the primary key of the current v legal type
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal type
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType[] findByGroupId_PrevAndNext(String typeId, long groupId,
		OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VLegalType[] array = new VLegalTypeImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalType, groupId,
					orderByComparator, true);

			array[1] = vLegalType;

			array[2] = getByGroupId_PrevAndNext(session, vLegalType, groupId,
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

	protected VLegalType getByGroupId_PrevAndNext(Session session,
		VLegalType vLegalType, long groupId,
		OrderByComparator<VLegalType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

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
			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal types where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalType vLegalType : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalType);
		}
	}

	/**
	 * Returns the number of v legal types where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal types
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalType.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_T = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_T",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalTypeModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalTypeModelImpl.TYPEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_T",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal type where groupId = &#63; and typeId = &#63; or throws a {@link NoSuchVLegalTypeException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @return the matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByG_T(long groupId, String typeId)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByG_T(groupId, typeId);

		if (vLegalType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalTypeException(msg.toString());
		}

		return vLegalType;
	}

	/**
	 * Returns the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByG_T(long groupId, String typeId) {
		return fetchByG_T(groupId, typeId, true);
	}

	/**
	 * Returns the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByG_T(long groupId, String typeId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, typeId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_T,
					finderArgs, this);
		}

		if (result instanceof VLegalType) {
			VLegalType vLegalType = (VLegalType)result;

			if ((groupId != vLegalType.getGroupId()) ||
					!Objects.equals(typeId, vLegalType.getTypeId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_G_T_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_T_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_G_T_TYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindTypeId) {
					qPos.add(typeId);
				}

				List<VLegalType> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_T, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalTypePersistenceImpl.fetchByG_T(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalType vLegalType = list.get(0);

					result = vLegalType;

					cacheResult(vLegalType);

					if ((vLegalType.getGroupId() != groupId) ||
							(vLegalType.getTypeId() == null) ||
							!vLegalType.getTypeId().equals(typeId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_T,
							finderArgs, vLegalType);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_T, finderArgs);

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
			return (VLegalType)result;
		}
	}

	/**
	 * Removes the v legal type where groupId = &#63; and typeId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @return the v legal type that was removed
	 */
	@Override
	public VLegalType removeByG_T(long groupId, String typeId)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = findByG_T(groupId, typeId);

		return remove(vLegalType);
	}

	/**
	 * Returns the number of v legal types where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @return the number of matching v legal types
	 */
	@Override
	public int countByG_T(long groupId, String typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_T;

		Object[] finderArgs = new Object[] { groupId, typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			boolean bindTypeId = false;

			if (typeId == null) {
				query.append(_FINDER_COLUMN_G_T_TYPEID_1);
			}
			else if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_T_TYPEID_3);
			}
			else {
				bindTypeId = true;

				query.append(_FINDER_COLUMN_G_T_TYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "vLegalType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_TYPEID_1 = "vLegalType.typeId IS NULL";
	private static final String _FINDER_COLUMN_G_T_TYPEID_2 = "vLegalType.typeId = ?";
	private static final String _FINDER_COLUMN_G_T_TYPEID_3 = "(vLegalType.typeId IS NULL OR vLegalType.typeId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			},
			VLegalTypeModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalTypeModelImpl.STATUSTYPE_COLUMN_BITMASK |
			VLegalTypeModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalTypeModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @return the matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language) {
		return findByS_L(groupId, statusType, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @return the range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language, int start, int end) {
		return findByS_L(groupId, statusType, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language, int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return findByS_L(groupId, statusType, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language, int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L;
			finderArgs = new Object[] { groupId, statusType, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L;
			finderArgs = new Object[] {
					groupId, statusType, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalType> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalType vLegalType : list) {
					if ((groupId != vLegalType.getGroupId()) ||
							(statusType != vLegalType.getStatusType()) ||
							!Objects.equals(language, vLegalType.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSTYPE_2);

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
				query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusType);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByS_L_First(long groupId, boolean statusType,
		String language, OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByS_L_First(groupId, statusType, language,
				orderByComparator);

		if (vLegalType != null) {
			return vLegalType;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusType=");
		msg.append(statusType);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTypeException(msg.toString());
	}

	/**
	 * Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByS_L_First(long groupId, boolean statusType,
		String language, OrderByComparator<VLegalType> orderByComparator) {
		List<VLegalType> list = findByS_L(groupId, statusType, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByS_L_Last(long groupId, boolean statusType,
		String language, OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByS_L_Last(groupId, statusType, language,
				orderByComparator);

		if (vLegalType != null) {
			return vLegalType;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusType=");
		msg.append(statusType);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTypeException(msg.toString());
	}

	/**
	 * Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByS_L_Last(long groupId, boolean statusType,
		String language, OrderByComparator<VLegalType> orderByComparator) {
		int count = countByS_L(groupId, statusType, language);

		if (count == 0) {
			return null;
		}

		List<VLegalType> list = findByS_L(groupId, statusType, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param typeId the primary key of the current v legal type
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal type
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType[] findByS_L_PrevAndNext(String typeId, long groupId,
		boolean statusType, String language,
		OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VLegalType[] array = new VLegalTypeImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vLegalType, groupId,
					statusType, language, orderByComparator, true);

			array[1] = vLegalType;

			array[2] = getByS_L_PrevAndNext(session, vLegalType, groupId,
					statusType, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalType getByS_L_PrevAndNext(Session session,
		VLegalType vLegalType, long groupId, boolean statusType,
		String language, OrderByComparator<VLegalType> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_S_L_STATUSTYPE_2);

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
			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusType);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 */
	@Override
	public void removeByS_L(long groupId, boolean statusType, String language) {
		for (VLegalType vLegalType : findByS_L(groupId, statusType, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalType);
		}
	}

	/**
	 * Returns the number of v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param language the language
	 * @return the number of matching v legal types
	 */
	@Override
	public int countByS_L(long groupId, boolean statusType, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_L;

		Object[] finderArgs = new Object[] { groupId, statusType, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSTYPE_2);

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

				qPos.add(statusType);

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

	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vLegalType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_STATUSTYPE_2 = "vLegalType.statusType = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vLegalType.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vLegalType.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vLegalType.language IS NULL OR vLegalType.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_RSS = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, VLegalTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			},
			VLegalTypeModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalTypeModelImpl.STATUSTYPE_COLUMN_BITMASK |
			VLegalTypeModelImpl.RSSABLE_COLUMN_BITMASK |
			VLegalTypeModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_RSS = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @return the matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable) {
		return findByS_Rss(groupId, statusType, rssable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @return the range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable, int start, int end) {
		return findByS_Rss(groupId, statusType, rssable, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return findByS_Rss(groupId, statusType, rssable, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal types
	 */
	@Override
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS;
			finderArgs = new Object[] { groupId, statusType, rssable };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_RSS;
			finderArgs = new Object[] {
					groupId, statusType, rssable,
					
					start, end, orderByComparator
				};
		}

		List<VLegalType> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalType vLegalType : list) {
					if ((groupId != vLegalType.getGroupId()) ||
							(statusType != vLegalType.getStatusType()) ||
							(rssable != vLegalType.getRssable())) {
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

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSTYPE_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusType);

				qPos.add(rssable);

				if (!pagination) {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByS_Rss_First(long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByS_Rss_First(groupId, statusType,
				rssable, orderByComparator);

		if (vLegalType != null) {
			return vLegalType;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusType=");
		msg.append(statusType);

		msg.append(", rssable=");
		msg.append(rssable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTypeException(msg.toString());
	}

	/**
	 * Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByS_Rss_First(long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator) {
		List<VLegalType> list = findByS_Rss(groupId, statusType, rssable, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal type
	 * @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	 */
	@Override
	public VLegalType findByS_Rss_Last(long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByS_Rss_Last(groupId, statusType, rssable,
				orderByComparator);

		if (vLegalType != null) {
			return vLegalType;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusType=");
		msg.append(statusType);

		msg.append(", rssable=");
		msg.append(rssable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTypeException(msg.toString());
	}

	/**
	 * Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 */
	@Override
	public VLegalType fetchByS_Rss_Last(long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator) {
		int count = countByS_Rss(groupId, statusType, rssable);

		if (count == 0) {
			return null;
		}

		List<VLegalType> list = findByS_Rss(groupId, statusType, rssable,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param typeId the primary key of the current v legal type
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal type
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType[] findByS_Rss_PrevAndNext(String typeId, long groupId,
		boolean statusType, boolean rssable,
		OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VLegalType[] array = new VLegalTypeImpl[3];

			array[0] = getByS_Rss_PrevAndNext(session, vLegalType, groupId,
					statusType, rssable, orderByComparator, true);

			array[1] = vLegalType;

			array[2] = getByS_Rss_PrevAndNext(session, vLegalType, groupId,
					statusType, rssable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalType getByS_Rss_PrevAndNext(Session session,
		VLegalType vLegalType, long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

		query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

		query.append(_FINDER_COLUMN_S_RSS_STATUSTYPE_2);

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
			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusType);

		qPos.add(rssable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 */
	@Override
	public void removeByS_Rss(long groupId, boolean statusType, boolean rssable) {
		for (VLegalType vLegalType : findByS_Rss(groupId, statusType, rssable,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalType);
		}
	}

	/**
	 * Returns the number of v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusType the status type
	 * @param rssable the rssable
	 * @return the number of matching v legal types
	 */
	@Override
	public int countByS_Rss(long groupId, boolean statusType, boolean rssable) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_RSS;

		Object[] finderArgs = new Object[] { groupId, statusType, rssable };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSTYPE_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusType);

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

	private static final String _FINDER_COLUMN_S_RSS_GROUPID_2 = "vLegalType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_STATUSTYPE_2 = "vLegalType.statusType = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_RSSABLE_2 = "vLegalType.rssable = ?";

	public VLegalTypePersistenceImpl() {
		setModelClass(VLegalType.class);
	}

	/**
	 * Caches the v legal type in the entity cache if it is enabled.
	 *
	 * @param vLegalType the v legal type
	 */
	@Override
	public void cacheResult(VLegalType vLegalType) {
		entityCache.putResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey(), vLegalType);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_T,
			new Object[] { vLegalType.getGroupId(), vLegalType.getTypeId() },
			vLegalType);

		vLegalType.resetOriginalValues();
	}

	/**
	 * Caches the v legal types in the entity cache if it is enabled.
	 *
	 * @param vLegalTypes the v legal types
	 */
	@Override
	public void cacheResult(List<VLegalType> vLegalTypes) {
		for (VLegalType vLegalType : vLegalTypes) {
			if (entityCache.getResult(
						VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTypeImpl.class, vLegalType.getPrimaryKey()) == null) {
				cacheResult(vLegalType);
			}
			else {
				vLegalType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalType vLegalType) {
		entityCache.removeResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalTypeModelImpl)vLegalType);
	}

	@Override
	public void clearCache(List<VLegalType> vLegalTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalType vLegalType : vLegalTypes) {
			entityCache.removeResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTypeImpl.class, vLegalType.getPrimaryKey());

			clearUniqueFindersCache((VLegalTypeModelImpl)vLegalType);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalTypeModelImpl vLegalTypeModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalTypeModelImpl.getGroupId(),
					vLegalTypeModelImpl.getTypeId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_T, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_T, args,
				vLegalTypeModelImpl);
		}
		else {
			if ((vLegalTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTypeModelImpl.getGroupId(),
						vLegalTypeModelImpl.getTypeId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_T, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_T, args,
					vLegalTypeModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalTypeModelImpl vLegalTypeModelImpl) {
		Object[] args = new Object[] {
				vLegalTypeModelImpl.getGroupId(),
				vLegalTypeModelImpl.getTypeId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_T, args);

		if ((vLegalTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_T.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalTypeModelImpl.getOriginalGroupId(),
					vLegalTypeModelImpl.getOriginalTypeId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_T, args);
		}
	}

	/**
	 * Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	 *
	 * @param typeId the primary key for the new v legal type
	 * @return the new v legal type
	 */
	@Override
	public VLegalType create(String typeId) {
		VLegalType vLegalType = new VLegalTypeImpl();

		vLegalType.setNew(true);
		vLegalType.setPrimaryKey(typeId);

		vLegalType.setCompanyId(companyProvider.getCompanyId());

		return vLegalType;
	}

	/**
	 * Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the v legal type
	 * @return the v legal type that was removed
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType remove(String typeId) throws NoSuchVLegalTypeException {
		return remove((Serializable)typeId);
	}

	/**
	 * Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal type
	 * @return the v legal type that was removed
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType remove(Serializable primaryKey)
		throws NoSuchVLegalTypeException {
		Session session = null;

		try {
			session = openSession();

			VLegalType vLegalType = (VLegalType)session.get(VLegalTypeImpl.class,
					primaryKey);

			if (vLegalType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalType);
		}
		catch (NoSuchVLegalTypeException nsee) {
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
	protected VLegalType removeImpl(VLegalType vLegalType) {
		vLegalType = toUnwrappedModel(vLegalType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalType)) {
				vLegalType = (VLegalType)session.get(VLegalTypeImpl.class,
						vLegalType.getPrimaryKeyObj());
			}

			if (vLegalType != null) {
				session.delete(vLegalType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalType != null) {
			clearCache(vLegalType);
		}

		return vLegalType;
	}

	@Override
	public VLegalType updateImpl(VLegalType vLegalType) {
		vLegalType = toUnwrappedModel(vLegalType);

		boolean isNew = vLegalType.isNew();

		VLegalTypeModelImpl vLegalTypeModelImpl = (VLegalTypeModelImpl)vLegalType;

		Session session = null;

		try {
			session = openSession();

			if (vLegalType.isNew()) {
				session.save(vLegalType);

				vLegalType.setNew(false);
			}
			else {
				vLegalType = (VLegalType)session.merge(vLegalType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTypeModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalTypeModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTypeModelImpl.getOriginalGroupId(),
						vLegalTypeModelImpl.getOriginalStatusType(),
						vLegalTypeModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L,
					args);

				args = new Object[] {
						vLegalTypeModelImpl.getGroupId(),
						vLegalTypeModelImpl.getStatusType(),
						vLegalTypeModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L,
					args);
			}

			if ((vLegalTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTypeModelImpl.getOriginalGroupId(),
						vLegalTypeModelImpl.getOriginalStatusType(),
						vLegalTypeModelImpl.getOriginalRssable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_RSS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS,
					args);

				args = new Object[] {
						vLegalTypeModelImpl.getGroupId(),
						vLegalTypeModelImpl.getStatusType(),
						vLegalTypeModelImpl.getRssable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_RSS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS,
					args);
			}
		}

		entityCache.putResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey(), vLegalType, false);

		clearUniqueFindersCache(vLegalTypeModelImpl);
		cacheUniqueFindersCache(vLegalTypeModelImpl, isNew);

		vLegalType.resetOriginalValues();

		return vLegalType;
	}

	protected VLegalType toUnwrappedModel(VLegalType vLegalType) {
		if (vLegalType instanceof VLegalTypeImpl) {
			return vLegalType;
		}

		VLegalTypeImpl vLegalTypeImpl = new VLegalTypeImpl();

		vLegalTypeImpl.setNew(vLegalType.isNew());
		vLegalTypeImpl.setPrimaryKey(vLegalType.getPrimaryKey());

		vLegalTypeImpl.setTypeId(vLegalType.getTypeId());
		vLegalTypeImpl.setGroupId(vLegalType.getGroupId());
		vLegalTypeImpl.setCompanyId(vLegalType.getCompanyId());
		vLegalTypeImpl.setUserId(vLegalType.getUserId());
		vLegalTypeImpl.setCreatedDate(vLegalType.getCreatedDate());
		vLegalTypeImpl.setModifiedDate(vLegalType.getModifiedDate());
		vLegalTypeImpl.setCreatedByUser(vLegalType.getCreatedByUser());
		vLegalTypeImpl.setModifiedByUser(vLegalType.getModifiedByUser());
		vLegalTypeImpl.setName(vLegalType.getName());
		vLegalTypeImpl.setDescription(vLegalType.getDescription());
		vLegalTypeImpl.setLanguage(vLegalType.getLanguage());
		vLegalTypeImpl.setStatusType(vLegalType.isStatusType());
		vLegalTypeImpl.setRssable(vLegalType.isRssable());
		vLegalTypeImpl.setPosition(vLegalType.getPosition());

		return vLegalTypeImpl;
	}

	/**
	 * Returns the v legal type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal type
	 * @return the v legal type
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalTypeException {
		VLegalType vLegalType = fetchByPrimaryKey(primaryKey);

		if (vLegalType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalType;
	}

	/**
	 * Returns the v legal type with the primary key or throws a {@link NoSuchVLegalTypeException} if it could not be found.
	 *
	 * @param typeId the primary key of the v legal type
	 * @return the v legal type
	 * @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType findByPrimaryKey(String typeId)
		throws NoSuchVLegalTypeException {
		return findByPrimaryKey((Serializable)typeId);
	}

	/**
	 * Returns the v legal type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal type
	 * @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalType vLegalType = (VLegalType)serializable;

		if (vLegalType == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalType = (VLegalType)session.get(VLegalTypeImpl.class,
						primaryKey);

				if (vLegalType != null) {
					cacheResult(vLegalType);
				}
				else {
					entityCache.putResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalType;
	}

	/**
	 * Returns the v legal type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the v legal type
	 * @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	 */
	@Override
	public VLegalType fetchByPrimaryKey(String typeId) {
		return fetchByPrimaryKey((Serializable)typeId);
	}

	@Override
	public Map<Serializable, VLegalType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalType> map = new HashMap<Serializable, VLegalType>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalType vLegalType = fetchByPrimaryKey(primaryKey);

			if (vLegalType != null) {
				map.put(primaryKey, vLegalType);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTypeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalType)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE_PKS_IN);

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

			for (VLegalType vLegalType : (List<VLegalType>)q.list()) {
				map.put(vLegalType.getPrimaryKeyObj(), vLegalType);

				cacheResult(vLegalType);

				uncachedPrimaryKeys.remove(vLegalType.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTypeImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal types.
	 *
	 * @return the v legal types
	 */
	@Override
	public List<VLegalType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @return the range of v legal types
	 */
	@Override
	public List<VLegalType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal types
	 */
	@Override
	public List<VLegalType> findAll(int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal types
	 * @param end the upper bound of the range of v legal types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal types
	 */
	@Override
	public List<VLegalType> findAll(int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
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

		List<VLegalType> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalType>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALTYPE;

				if (pagination) {
					sql = sql.concat(VLegalTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalType vLegalType : findAll()) {
			remove(vLegalType);
		}
	}

	/**
	 * Returns the number of v legal types.
	 *
	 * @return the number of v legal types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALTYPE);

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
		return VLegalTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALTYPE = "SELECT vLegalType FROM VLegalType vLegalType";
	private static final String _SQL_SELECT_VLEGALTYPE_WHERE_PKS_IN = "SELECT vLegalType FROM VLegalType vLegalType WHERE typeId IN (";
	private static final String _SQL_SELECT_VLEGALTYPE_WHERE = "SELECT vLegalType FROM VLegalType vLegalType WHERE ";
	private static final String _SQL_COUNT_VLEGALTYPE = "SELECT COUNT(vLegalType) FROM VLegalType vLegalType";
	private static final String _SQL_COUNT_VLEGALTYPE_WHERE = "SELECT COUNT(vLegalType) FROM VLegalType vLegalType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalTypePersistenceImpl.class);
}