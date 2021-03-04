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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchAdvTypeException;
import vn.gov.hoabinh.model.AdvType;
import vn.gov.hoabinh.model.impl.AdvTypeImpl;
import vn.gov.hoabinh.model.impl.AdvTypeModelImpl;
import vn.gov.hoabinh.service.persistence.AdvTypePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the adv type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvTypePersistence
 * @see vn.gov.hoabinh.service.persistence.AdvTypeUtil
 * @generated
 */
@ProviderType
public class AdvTypePersistenceImpl extends BasePersistenceImpl<AdvType>
	implements AdvTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AdvTypeUtil} to access the adv type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AdvTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, AdvTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, AdvTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, AdvTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, AdvTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG",
			new String[] { Long.class.getName() },
			AdvTypeModelImpl.GROUPID_COLUMN_BITMASK |
			AdvTypeModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the adv types where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching adv types
	 */
	@Override
	public List<AdvType> findByG(long groupId) {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the adv types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of adv types
	 * @param end the upper bound of the range of adv types (not inclusive)
	 * @return the range of matching adv types
	 */
	@Override
	public List<AdvType> findByG(long groupId, int start, int end) {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of adv types
	 * @param end the upper bound of the range of adv types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching adv types
	 */
	@Override
	public List<AdvType> findByG(long groupId, int start, int end,
		OrderByComparator<AdvType> orderByComparator) {
		return findByG(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of adv types
	 * @param end the upper bound of the range of adv types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching adv types
	 */
	@Override
	public List<AdvType> findByG(long groupId, int start, int end,
		OrderByComparator<AdvType> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<AdvType> list = null;

		if (retrieveFromCache) {
			list = (List<AdvType>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvType advType : list) {
					if ((groupId != advType.getGroupId())) {
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

			query.append(_SQL_SELECT_ADVTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<AdvType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv type
	 * @throws NoSuchAdvTypeException if a matching adv type could not be found
	 */
	@Override
	public AdvType findByG_First(long groupId,
		OrderByComparator<AdvType> orderByComparator)
		throws NoSuchAdvTypeException {
		AdvType advType = fetchByG_First(groupId, orderByComparator);

		if (advType != null) {
			return advType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvTypeException(msg.toString());
	}

	/**
	 * Returns the first adv type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv type, or <code>null</code> if a matching adv type could not be found
	 */
	@Override
	public AdvType fetchByG_First(long groupId,
		OrderByComparator<AdvType> orderByComparator) {
		List<AdvType> list = findByG(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv type
	 * @throws NoSuchAdvTypeException if a matching adv type could not be found
	 */
	@Override
	public AdvType findByG_Last(long groupId,
		OrderByComparator<AdvType> orderByComparator)
		throws NoSuchAdvTypeException {
		AdvType advType = fetchByG_Last(groupId, orderByComparator);

		if (advType != null) {
			return advType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvTypeException(msg.toString());
	}

	/**
	 * Returns the last adv type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv type, or <code>null</code> if a matching adv type could not be found
	 */
	@Override
	public AdvType fetchByG_Last(long groupId,
		OrderByComparator<AdvType> orderByComparator) {
		int count = countByG(groupId);

		if (count == 0) {
			return null;
		}

		List<AdvType> list = findByG(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the adv types before and after the current adv type in the ordered set where groupId = &#63;.
	 *
	 * @param typeId the primary key of the current adv type
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next adv type
	 * @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType[] findByG_PrevAndNext(long typeId, long groupId,
		OrderByComparator<AdvType> orderByComparator)
		throws NoSuchAdvTypeException {
		AdvType advType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			AdvType[] array = new AdvTypeImpl[3];

			array[0] = getByG_PrevAndNext(session, advType, groupId,
					orderByComparator, true);

			array[1] = advType;

			array[2] = getByG_PrevAndNext(session, advType, groupId,
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

	protected AdvType getByG_PrevAndNext(Session session, AdvType advType,
		long groupId, OrderByComparator<AdvType> orderByComparator,
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

		query.append(_SQL_SELECT_ADVTYPE_WHERE);

		query.append(_FINDER_COLUMN_G_GROUPID_2);

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
			query.append(AdvTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv types where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByG(long groupId) {
		for (AdvType advType : findByG(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advType);
		}
	}

	/**
	 * Returns the number of adv types where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching adv types
	 */
	@Override
	public int countByG(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

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

	private static final String _FINDER_COLUMN_G_GROUPID_2 = "advType.groupId = ?";

	public AdvTypePersistenceImpl() {
		setModelClass(AdvType.class);
	}

	/**
	 * Caches the adv type in the entity cache if it is enabled.
	 *
	 * @param advType the adv type
	 */
	@Override
	public void cacheResult(AdvType advType) {
		entityCache.putResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey(), advType);

		advType.resetOriginalValues();
	}

	/**
	 * Caches the adv types in the entity cache if it is enabled.
	 *
	 * @param advTypes the adv types
	 */
	@Override
	public void cacheResult(List<AdvType> advTypes) {
		for (AdvType advType : advTypes) {
			if (entityCache.getResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
						AdvTypeImpl.class, advType.getPrimaryKey()) == null) {
				cacheResult(advType);
			}
			else {
				advType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all adv types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AdvTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the adv type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AdvType advType) {
		entityCache.removeResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AdvType> advTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AdvType advType : advTypes) {
			entityCache.removeResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
				AdvTypeImpl.class, advType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new adv type with the primary key. Does not add the adv type to the database.
	 *
	 * @param typeId the primary key for the new adv type
	 * @return the new adv type
	 */
	@Override
	public AdvType create(long typeId) {
		AdvType advType = new AdvTypeImpl();

		advType.setNew(true);
		advType.setPrimaryKey(typeId);

		advType.setCompanyId(companyProvider.getCompanyId());

		return advType;
	}

	/**
	 * Removes the adv type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the adv type
	 * @return the adv type that was removed
	 * @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType remove(long typeId) throws NoSuchAdvTypeException {
		return remove((Serializable)typeId);
	}

	/**
	 * Removes the adv type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the adv type
	 * @return the adv type that was removed
	 * @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType remove(Serializable primaryKey)
		throws NoSuchAdvTypeException {
		Session session = null;

		try {
			session = openSession();

			AdvType advType = (AdvType)session.get(AdvTypeImpl.class, primaryKey);

			if (advType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdvTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(advType);
		}
		catch (NoSuchAdvTypeException nsee) {
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
	protected AdvType removeImpl(AdvType advType) {
		advType = toUnwrappedModel(advType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(advType)) {
				advType = (AdvType)session.get(AdvTypeImpl.class,
						advType.getPrimaryKeyObj());
			}

			if (advType != null) {
				session.delete(advType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (advType != null) {
			clearCache(advType);
		}

		return advType;
	}

	@Override
	public AdvType updateImpl(AdvType advType) {
		advType = toUnwrappedModel(advType);

		boolean isNew = advType.isNew();

		AdvTypeModelImpl advTypeModelImpl = (AdvTypeModelImpl)advType;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (advType.getCreateDate() == null)) {
			if (serviceContext == null) {
				advType.setCreateDate(now);
			}
			else {
				advType.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!advTypeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				advType.setModifiedDate(now);
			}
			else {
				advType.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (advType.isNew()) {
				session.save(advType);

				advType.setNew(false);
			}
			else {
				advType = (AdvType)session.merge(advType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AdvTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((advTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advTypeModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);

				args = new Object[] { advTypeModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);
			}
		}

		entityCache.putResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey(), advType, false);

		advType.resetOriginalValues();

		return advType;
	}

	protected AdvType toUnwrappedModel(AdvType advType) {
		if (advType instanceof AdvTypeImpl) {
			return advType;
		}

		AdvTypeImpl advTypeImpl = new AdvTypeImpl();

		advTypeImpl.setNew(advType.isNew());
		advTypeImpl.setPrimaryKey(advType.getPrimaryKey());

		advTypeImpl.setTypeId(advType.getTypeId());
		advTypeImpl.setCreateDate(advType.getCreateDate());
		advTypeImpl.setModifiedDate(advType.getModifiedDate());
		advTypeImpl.setGroupId(advType.getGroupId());
		advTypeImpl.setCompanyId(advType.getCompanyId());
		advTypeImpl.setName(advType.getName());
		advTypeImpl.setDescription(advType.getDescription());

		return advTypeImpl;
	}

	/**
	 * Returns the adv type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv type
	 * @return the adv type
	 * @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAdvTypeException {
		AdvType advType = fetchByPrimaryKey(primaryKey);

		if (advType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAdvTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return advType;
	}

	/**
	 * Returns the adv type with the primary key or throws a {@link NoSuchAdvTypeException} if it could not be found.
	 *
	 * @param typeId the primary key of the adv type
	 * @return the adv type
	 * @throws NoSuchAdvTypeException if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType findByPrimaryKey(long typeId) throws NoSuchAdvTypeException {
		return findByPrimaryKey((Serializable)typeId);
	}

	/**
	 * Returns the adv type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv type
	 * @return the adv type, or <code>null</code> if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
				AdvTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AdvType advType = (AdvType)serializable;

		if (advType == null) {
			Session session = null;

			try {
				session = openSession();

				advType = (AdvType)session.get(AdvTypeImpl.class, primaryKey);

				if (advType != null) {
					cacheResult(advType);
				}
				else {
					entityCache.putResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
						AdvTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
					AdvTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return advType;
	}

	/**
	 * Returns the adv type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the adv type
	 * @return the adv type, or <code>null</code> if a adv type with the primary key could not be found
	 */
	@Override
	public AdvType fetchByPrimaryKey(long typeId) {
		return fetchByPrimaryKey((Serializable)typeId);
	}

	@Override
	public Map<Serializable, AdvType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AdvType> map = new HashMap<Serializable, AdvType>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AdvType advType = fetchByPrimaryKey(primaryKey);

			if (advType != null) {
				map.put(primaryKey, advType);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
					AdvTypeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AdvType)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ADVTYPE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (AdvType advType : (List<AdvType>)q.list()) {
				map.put(advType.getPrimaryKeyObj(), advType);

				cacheResult(advType);

				uncachedPrimaryKeys.remove(advType.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
					AdvTypeImpl.class, primaryKey, nullModel);
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
	 * Returns all the adv types.
	 *
	 * @return the adv types
	 */
	@Override
	public List<AdvType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the adv types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv types
	 * @param end the upper bound of the range of adv types (not inclusive)
	 * @return the range of adv types
	 */
	@Override
	public List<AdvType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv types
	 * @param end the upper bound of the range of adv types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of adv types
	 */
	@Override
	public List<AdvType> findAll(int start, int end,
		OrderByComparator<AdvType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv types
	 * @param end the upper bound of the range of adv types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of adv types
	 */
	@Override
	public List<AdvType> findAll(int start, int end,
		OrderByComparator<AdvType> orderByComparator, boolean retrieveFromCache) {
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

		List<AdvType> list = null;

		if (retrieveFromCache) {
			list = (List<AdvType>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ADVTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVTYPE;

				if (pagination) {
					sql = sql.concat(AdvTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AdvType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the adv types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AdvType advType : findAll()) {
			remove(advType);
		}
	}

	/**
	 * Returns the number of adv types.
	 *
	 * @return the number of adv types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADVTYPE);

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
		return AdvTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the adv type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AdvTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_ADVTYPE = "SELECT advType FROM AdvType advType";
	private static final String _SQL_SELECT_ADVTYPE_WHERE_PKS_IN = "SELECT advType FROM AdvType advType WHERE typeId IN (";
	private static final String _SQL_SELECT_ADVTYPE_WHERE = "SELECT advType FROM AdvType advType WHERE ";
	private static final String _SQL_COUNT_ADVTYPE = "SELECT COUNT(advType) FROM AdvType advType";
	private static final String _SQL_COUNT_ADVTYPE_WHERE = "SELECT COUNT(advType) FROM AdvType advType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AdvType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AdvType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AdvTypePersistenceImpl.class);
}