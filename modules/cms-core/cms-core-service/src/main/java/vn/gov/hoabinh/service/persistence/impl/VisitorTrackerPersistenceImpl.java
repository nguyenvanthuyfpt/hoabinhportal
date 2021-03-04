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
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVisitorTrackerException;
import vn.gov.hoabinh.model.VisitorTracker;
import vn.gov.hoabinh.model.impl.VisitorTrackerImpl;
import vn.gov.hoabinh.model.impl.VisitorTrackerModelImpl;
import vn.gov.hoabinh.service.persistence.VisitorTrackerPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the visitor tracker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTrackerPersistence
 * @see vn.gov.hoabinh.service.persistence.VisitorTrackerUtil
 * @generated
 */
@ProviderType
public class VisitorTrackerPersistenceImpl extends BasePersistenceImpl<VisitorTracker>
	implements VisitorTrackerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VisitorTrackerUtil} to access the visitor tracker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VisitorTrackerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerModelImpl.FINDER_CACHE_ENABLED,
			VisitorTrackerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerModelImpl.FINDER_CACHE_ENABLED,
			VisitorTrackerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerModelImpl.FINDER_CACHE_ENABLED,
			VisitorTrackerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerModelImpl.FINDER_CACHE_ENABLED,
			VisitorTrackerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			VisitorTrackerModelImpl.COMPANYID_COLUMN_BITMASK |
			VisitorTrackerModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the visitor trackers where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching visitor trackers
	 */
	@Override
	public List<VisitorTracker> findByC_G(long companyId, long groupId) {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visitor trackers where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of visitor trackers
	 * @param end the upper bound of the range of visitor trackers (not inclusive)
	 * @return the range of matching visitor trackers
	 */
	@Override
	public List<VisitorTracker> findByC_G(long companyId, long groupId,
		int start, int end) {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the visitor trackers where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of visitor trackers
	 * @param end the upper bound of the range of visitor trackers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching visitor trackers
	 */
	@Override
	public List<VisitorTracker> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator<VisitorTracker> orderByComparator) {
		return findByC_G(companyId, groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visitor trackers where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of visitor trackers
	 * @param end the upper bound of the range of visitor trackers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching visitor trackers
	 */
	@Override
	public List<VisitorTracker> findByC_G(long companyId, long groupId,
		int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<VisitorTracker> list = null;

		if (retrieveFromCache) {
			list = (List<VisitorTracker>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VisitorTracker visitorTracker : list) {
					if ((companyId != visitorTracker.getCompanyId()) ||
							(groupId != visitorTracker.getGroupId())) {
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

			query.append(_SQL_SELECT_VISITORTRACKER_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VisitorTrackerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VisitorTracker>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VisitorTracker>)QueryUtil.list(q,
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
	 * Returns the first visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visitor tracker
	 * @throws NoSuchVisitorTrackerException if a matching visitor tracker could not be found
	 */
	@Override
	public VisitorTracker findByC_G_First(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator)
		throws NoSuchVisitorTrackerException {
		VisitorTracker visitorTracker = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (visitorTracker != null) {
			return visitorTracker;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVisitorTrackerException(msg.toString());
	}

	/**
	 * Returns the first visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching visitor tracker, or <code>null</code> if a matching visitor tracker could not be found
	 */
	@Override
	public VisitorTracker fetchByC_G_First(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator) {
		List<VisitorTracker> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visitor tracker
	 * @throws NoSuchVisitorTrackerException if a matching visitor tracker could not be found
	 */
	@Override
	public VisitorTracker findByC_G_Last(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator)
		throws NoSuchVisitorTrackerException {
		VisitorTracker visitorTracker = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (visitorTracker != null) {
			return visitorTracker;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVisitorTrackerException(msg.toString());
	}

	/**
	 * Returns the last visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching visitor tracker, or <code>null</code> if a matching visitor tracker could not be found
	 */
	@Override
	public VisitorTracker fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator) {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<VisitorTracker> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the visitor trackers before and after the current visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param visitorId the primary key of the current visitor tracker
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next visitor tracker
	 * @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker[] findByC_G_PrevAndNext(long visitorId,
		long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator)
		throws NoSuchVisitorTrackerException {
		VisitorTracker visitorTracker = findByPrimaryKey(visitorId);

		Session session = null;

		try {
			session = openSession();

			VisitorTracker[] array = new VisitorTrackerImpl[3];

			array[0] = getByC_G_PrevAndNext(session, visitorTracker, companyId,
					groupId, orderByComparator, true);

			array[1] = visitorTracker;

			array[2] = getByC_G_PrevAndNext(session, visitorTracker, companyId,
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

	protected VisitorTracker getByC_G_PrevAndNext(Session session,
		VisitorTracker visitorTracker, long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VISITORTRACKER_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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
			query.append(VisitorTrackerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(visitorTracker);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VisitorTracker> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the visitor trackers where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByC_G(long companyId, long groupId) {
		for (VisitorTracker visitorTracker : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(visitorTracker);
		}
	}

	/**
	 * Returns the number of visitor trackers where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching visitor trackers
	 */
	@Override
	public int countByC_G(long companyId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VISITORTRACKER_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "visitorTracker.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "visitorTracker.groupId = ?";

	public VisitorTrackerPersistenceImpl() {
		setModelClass(VisitorTracker.class);
	}

	/**
	 * Caches the visitor tracker in the entity cache if it is enabled.
	 *
	 * @param visitorTracker the visitor tracker
	 */
	@Override
	public void cacheResult(VisitorTracker visitorTracker) {
		entityCache.putResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerImpl.class, visitorTracker.getPrimaryKey(),
			visitorTracker);

		visitorTracker.resetOriginalValues();
	}

	/**
	 * Caches the visitor trackers in the entity cache if it is enabled.
	 *
	 * @param visitorTrackers the visitor trackers
	 */
	@Override
	public void cacheResult(List<VisitorTracker> visitorTrackers) {
		for (VisitorTracker visitorTracker : visitorTrackers) {
			if (entityCache.getResult(
						VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
						VisitorTrackerImpl.class, visitorTracker.getPrimaryKey()) == null) {
				cacheResult(visitorTracker);
			}
			else {
				visitorTracker.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all visitor trackers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VisitorTrackerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the visitor tracker.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VisitorTracker visitorTracker) {
		entityCache.removeResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerImpl.class, visitorTracker.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VisitorTracker> visitorTrackers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VisitorTracker visitorTracker : visitorTrackers) {
			entityCache.removeResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
				VisitorTrackerImpl.class, visitorTracker.getPrimaryKey());
		}
	}

	/**
	 * Creates a new visitor tracker with the primary key. Does not add the visitor tracker to the database.
	 *
	 * @param visitorId the primary key for the new visitor tracker
	 * @return the new visitor tracker
	 */
	@Override
	public VisitorTracker create(long visitorId) {
		VisitorTracker visitorTracker = new VisitorTrackerImpl();

		visitorTracker.setNew(true);
		visitorTracker.setPrimaryKey(visitorId);

		visitorTracker.setCompanyId(companyProvider.getCompanyId());

		return visitorTracker;
	}

	/**
	 * Removes the visitor tracker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param visitorId the primary key of the visitor tracker
	 * @return the visitor tracker that was removed
	 * @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker remove(long visitorId)
		throws NoSuchVisitorTrackerException {
		return remove((Serializable)visitorId);
	}

	/**
	 * Removes the visitor tracker with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the visitor tracker
	 * @return the visitor tracker that was removed
	 * @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker remove(Serializable primaryKey)
		throws NoSuchVisitorTrackerException {
		Session session = null;

		try {
			session = openSession();

			VisitorTracker visitorTracker = (VisitorTracker)session.get(VisitorTrackerImpl.class,
					primaryKey);

			if (visitorTracker == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVisitorTrackerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(visitorTracker);
		}
		catch (NoSuchVisitorTrackerException nsee) {
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
	protected VisitorTracker removeImpl(VisitorTracker visitorTracker) {
		visitorTracker = toUnwrappedModel(visitorTracker);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(visitorTracker)) {
				visitorTracker = (VisitorTracker)session.get(VisitorTrackerImpl.class,
						visitorTracker.getPrimaryKeyObj());
			}

			if (visitorTracker != null) {
				session.delete(visitorTracker);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (visitorTracker != null) {
			clearCache(visitorTracker);
		}

		return visitorTracker;
	}

	@Override
	public VisitorTracker updateImpl(VisitorTracker visitorTracker) {
		visitorTracker = toUnwrappedModel(visitorTracker);

		boolean isNew = visitorTracker.isNew();

		VisitorTrackerModelImpl visitorTrackerModelImpl = (VisitorTrackerModelImpl)visitorTracker;

		Session session = null;

		try {
			session = openSession();

			if (visitorTracker.isNew()) {
				session.save(visitorTracker);

				visitorTracker.setNew(false);
			}
			else {
				visitorTracker = (VisitorTracker)session.merge(visitorTracker);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VisitorTrackerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((visitorTrackerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						visitorTrackerModelImpl.getOriginalCompanyId(),
						visitorTrackerModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						visitorTrackerModelImpl.getCompanyId(),
						visitorTrackerModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}
		}

		entityCache.putResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
			VisitorTrackerImpl.class, visitorTracker.getPrimaryKey(),
			visitorTracker, false);

		visitorTracker.resetOriginalValues();

		return visitorTracker;
	}

	protected VisitorTracker toUnwrappedModel(VisitorTracker visitorTracker) {
		if (visitorTracker instanceof VisitorTrackerImpl) {
			return visitorTracker;
		}

		VisitorTrackerImpl visitorTrackerImpl = new VisitorTrackerImpl();

		visitorTrackerImpl.setNew(visitorTracker.isNew());
		visitorTrackerImpl.setPrimaryKey(visitorTracker.getPrimaryKey());

		visitorTrackerImpl.setVisitorId(visitorTracker.getVisitorId());
		visitorTrackerImpl.setCompanyId(visitorTracker.getCompanyId());
		visitorTrackerImpl.setGroupId(visitorTracker.getGroupId());
		visitorTrackerImpl.setCreatedDate(visitorTracker.getCreatedDate());
		visitorTrackerImpl.setExpiredDate(visitorTracker.getExpiredDate());

		return visitorTrackerImpl;
	}

	/**
	 * Returns the visitor tracker with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the visitor tracker
	 * @return the visitor tracker
	 * @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVisitorTrackerException {
		VisitorTracker visitorTracker = fetchByPrimaryKey(primaryKey);

		if (visitorTracker == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVisitorTrackerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return visitorTracker;
	}

	/**
	 * Returns the visitor tracker with the primary key or throws a {@link NoSuchVisitorTrackerException} if it could not be found.
	 *
	 * @param visitorId the primary key of the visitor tracker
	 * @return the visitor tracker
	 * @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker findByPrimaryKey(long visitorId)
		throws NoSuchVisitorTrackerException {
		return findByPrimaryKey((Serializable)visitorId);
	}

	/**
	 * Returns the visitor tracker with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the visitor tracker
	 * @return the visitor tracker, or <code>null</code> if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
				VisitorTrackerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VisitorTracker visitorTracker = (VisitorTracker)serializable;

		if (visitorTracker == null) {
			Session session = null;

			try {
				session = openSession();

				visitorTracker = (VisitorTracker)session.get(VisitorTrackerImpl.class,
						primaryKey);

				if (visitorTracker != null) {
					cacheResult(visitorTracker);
				}
				else {
					entityCache.putResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
						VisitorTrackerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
					VisitorTrackerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return visitorTracker;
	}

	/**
	 * Returns the visitor tracker with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param visitorId the primary key of the visitor tracker
	 * @return the visitor tracker, or <code>null</code> if a visitor tracker with the primary key could not be found
	 */
	@Override
	public VisitorTracker fetchByPrimaryKey(long visitorId) {
		return fetchByPrimaryKey((Serializable)visitorId);
	}

	@Override
	public Map<Serializable, VisitorTracker> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VisitorTracker> map = new HashMap<Serializable, VisitorTracker>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VisitorTracker visitorTracker = fetchByPrimaryKey(primaryKey);

			if (visitorTracker != null) {
				map.put(primaryKey, visitorTracker);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
					VisitorTrackerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VisitorTracker)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VISITORTRACKER_WHERE_PKS_IN);

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

			for (VisitorTracker visitorTracker : (List<VisitorTracker>)q.list()) {
				map.put(visitorTracker.getPrimaryKeyObj(), visitorTracker);

				cacheResult(visitorTracker);

				uncachedPrimaryKeys.remove(visitorTracker.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VisitorTrackerModelImpl.ENTITY_CACHE_ENABLED,
					VisitorTrackerImpl.class, primaryKey, nullModel);
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
	 * Returns all the visitor trackers.
	 *
	 * @return the visitor trackers
	 */
	@Override
	public List<VisitorTracker> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the visitor trackers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of visitor trackers
	 * @param end the upper bound of the range of visitor trackers (not inclusive)
	 * @return the range of visitor trackers
	 */
	@Override
	public List<VisitorTracker> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the visitor trackers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of visitor trackers
	 * @param end the upper bound of the range of visitor trackers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of visitor trackers
	 */
	@Override
	public List<VisitorTracker> findAll(int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the visitor trackers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of visitor trackers
	 * @param end the upper bound of the range of visitor trackers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of visitor trackers
	 */
	@Override
	public List<VisitorTracker> findAll(int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator,
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

		List<VisitorTracker> list = null;

		if (retrieveFromCache) {
			list = (List<VisitorTracker>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VISITORTRACKER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VISITORTRACKER;

				if (pagination) {
					sql = sql.concat(VisitorTrackerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VisitorTracker>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VisitorTracker>)QueryUtil.list(q,
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
	 * Removes all the visitor trackers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VisitorTracker visitorTracker : findAll()) {
			remove(visitorTracker);
		}
	}

	/**
	 * Returns the number of visitor trackers.
	 *
	 * @return the number of visitor trackers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VISITORTRACKER);

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
		return VisitorTrackerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the visitor tracker persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VisitorTrackerImpl.class.getName());
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
	private static final String _SQL_SELECT_VISITORTRACKER = "SELECT visitorTracker FROM VisitorTracker visitorTracker";
	private static final String _SQL_SELECT_VISITORTRACKER_WHERE_PKS_IN = "SELECT visitorTracker FROM VisitorTracker visitorTracker WHERE visitorId IN (";
	private static final String _SQL_SELECT_VISITORTRACKER_WHERE = "SELECT visitorTracker FROM VisitorTracker visitorTracker WHERE ";
	private static final String _SQL_COUNT_VISITORTRACKER = "SELECT COUNT(visitorTracker) FROM VisitorTracker visitorTracker";
	private static final String _SQL_COUNT_VISITORTRACKER_WHERE = "SELECT COUNT(visitorTracker) FROM VisitorTracker visitorTracker WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "visitorTracker.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VisitorTracker exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VisitorTracker exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VisitorTrackerPersistenceImpl.class);
}