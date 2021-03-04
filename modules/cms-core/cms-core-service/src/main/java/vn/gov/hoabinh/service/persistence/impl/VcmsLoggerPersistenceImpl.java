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

import vn.gov.hoabinh.exception.NoSuchVcmsLoggerException;
import vn.gov.hoabinh.model.VcmsLogger;
import vn.gov.hoabinh.model.impl.VcmsLoggerImpl;
import vn.gov.hoabinh.model.impl.VcmsLoggerModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsLoggerPersistence;

import java.io.Serializable;

import java.sql.Timestamp;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsLoggerPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsLoggerUtil
 * @generated
 */
@ProviderType
public class VcmsLoggerPersistenceImpl extends BasePersistenceImpl<VcmsLogger>
	implements VcmsLoggerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsLoggerUtil} to access the vcms logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsLoggerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, VcmsLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, VcmsLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_D = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, VcmsLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_D",
			new String[] {
				String.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, VcmsLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_D",
			new String[] { String.class.getName(), Date.class.getName() },
			VcmsLoggerModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VcmsLoggerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_D = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_D",
			new String[] { String.class.getName(), Date.class.getName() });

	/**
	 * Returns all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @return the matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByU_D(String createdByUser, Date createdDate) {
		return findByU_D(createdByUser, createdDate, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @return the range of matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByU_D(String createdByUser, Date createdDate,
		int start, int end) {
		return findByU_D(createdByUser, createdDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByU_D(String createdByUser, Date createdDate,
		int start, int end, OrderByComparator<VcmsLogger> orderByComparator) {
		return findByU_D(createdByUser, createdDate, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByU_D(String createdByUser, Date createdDate,
		int start, int end, OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D;
			finderArgs = new Object[] { createdByUser, createdDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_D;
			finderArgs = new Object[] {
					createdByUser, createdDate,
					
					start, end, orderByComparator
				};
		}

		List<VcmsLogger> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsLogger>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsLogger vcmsLogger : list) {
					if (!Objects.equals(createdByUser,
								vcmsLogger.getCreatedByUser()) ||
							!Objects.equals(createdDate,
								vcmsLogger.getCreatedDate())) {
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

			query.append(_SQL_SELECT_VCMSLOGGER_WHERE);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);
			}

			boolean bindCreatedDate = false;

			if (createdDate == null) {
				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_1);
			}
			else {
				bindCreatedDate = true;

				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (bindCreatedDate) {
					qPos.add(new Timestamp(createdDate.getTime()));
				}

				if (!pagination) {
					list = (List<VcmsLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsLogger>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms logger
	 * @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger findByU_D_First(String createdByUser, Date createdDate,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = fetchByU_D_First(createdByUser, createdDate,
				orderByComparator);

		if (vcmsLogger != null) {
			return vcmsLogger;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdByUser=");
		msg.append(createdByUser);

		msg.append(", createdDate=");
		msg.append(createdDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsLoggerException(msg.toString());
	}

	/**
	 * Returns the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger fetchByU_D_First(String createdByUser, Date createdDate,
		OrderByComparator<VcmsLogger> orderByComparator) {
		List<VcmsLogger> list = findByU_D(createdByUser, createdDate, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms logger
	 * @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger findByU_D_Last(String createdByUser, Date createdDate,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = fetchByU_D_Last(createdByUser, createdDate,
				orderByComparator);

		if (vcmsLogger != null) {
			return vcmsLogger;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdByUser=");
		msg.append(createdByUser);

		msg.append(", createdDate=");
		msg.append(createdDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsLoggerException(msg.toString());
	}

	/**
	 * Returns the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger fetchByU_D_Last(String createdByUser, Date createdDate,
		OrderByComparator<VcmsLogger> orderByComparator) {
		int count = countByU_D(createdByUser, createdDate);

		if (count == 0) {
			return null;
		}

		List<VcmsLogger> list = findByU_D(createdByUser, createdDate,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms loggers before and after the current vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param loggerId the primary key of the current vcms logger
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms logger
	 * @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger[] findByU_D_PrevAndNext(String loggerId,
		String createdByUser, Date createdDate,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			VcmsLogger[] array = new VcmsLoggerImpl[3];

			array[0] = getByU_D_PrevAndNext(session, vcmsLogger, createdByUser,
					createdDate, orderByComparator, true);

			array[1] = vcmsLogger;

			array[2] = getByU_D_PrevAndNext(session, vcmsLogger, createdByUser,
					createdDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsLogger getByU_D_PrevAndNext(Session session,
		VcmsLogger vcmsLogger, String createdByUser, Date createdDate,
		OrderByComparator<VcmsLogger> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSLOGGER_WHERE);

		boolean bindCreatedByUser = false;

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_1);
		}
		else if (createdByUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_3);
		}
		else {
			bindCreatedByUser = true;

			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);
		}

		boolean bindCreatedDate = false;

		if (createdDate == null) {
			query.append(_FINDER_COLUMN_U_D_CREATEDDATE_1);
		}
		else {
			bindCreatedDate = true;

			query.append(_FINDER_COLUMN_U_D_CREATEDDATE_2);
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
			query.append(VcmsLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCreatedByUser) {
			qPos.add(createdByUser);
		}

		if (bindCreatedDate) {
			qPos.add(new Timestamp(createdDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms loggers where createdByUser = &#63; and createdDate = &#63; from the database.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 */
	@Override
	public void removeByU_D(String createdByUser, Date createdDate) {
		for (VcmsLogger vcmsLogger : findByU_D(createdByUser, createdDate,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsLogger);
		}
	}

	/**
	 * Returns the number of vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @return the number of matching vcms loggers
	 */
	@Override
	public int countByU_D(String createdByUser, Date createdDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_D;

		Object[] finderArgs = new Object[] { createdByUser, createdDate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSLOGGER_WHERE);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);
			}

			boolean bindCreatedDate = false;

			if (createdDate == null) {
				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_1);
			}
			else {
				bindCreatedDate = true;

				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (bindCreatedDate) {
					qPos.add(new Timestamp(createdDate.getTime()));
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

	private static final String _FINDER_COLUMN_U_D_CREATEDBYUSER_1 = "vcmsLogger.createdByUser IS NULL AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDBYUSER_2 = "vcmsLogger.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDBYUSER_3 = "(vcmsLogger.createdByUser IS NULL OR vcmsLogger.createdByUser = '') AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_1 = "vcmsLogger.createdDate IS NULL";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_2 = "vcmsLogger.createdDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_E_C = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, VcmsLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByE_C",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_C = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, VcmsLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByE_C",
			new String[] { String.class.getName(), String.class.getName() },
			VcmsLoggerModelImpl.ENTRYID_COLUMN_BITMASK |
			VcmsLoggerModelImpl.CLASSENTRY_COLUMN_BITMASK |
			VcmsLoggerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_E_C = new FinderPath(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByE_C",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @return the matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByE_C(String entryId, String classEntry) {
		return findByE_C(entryId, classEntry, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @return the range of matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByE_C(String entryId, String classEntry,
		int start, int end) {
		return findByE_C(entryId, classEntry, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByE_C(String entryId, String classEntry,
		int start, int end, OrderByComparator<VcmsLogger> orderByComparator) {
		return findByE_C(entryId, classEntry, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms loggers
	 */
	@Override
	public List<VcmsLogger> findByE_C(String entryId, String classEntry,
		int start, int end, OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_C;
			finderArgs = new Object[] { entryId, classEntry };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_E_C;
			finderArgs = new Object[] {
					entryId, classEntry,
					
					start, end, orderByComparator
				};
		}

		List<VcmsLogger> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsLogger>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsLogger vcmsLogger : list) {
					if (!Objects.equals(entryId, vcmsLogger.getEntryId()) ||
							!Objects.equals(classEntry,
								vcmsLogger.getClassEntry())) {
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

			query.append(_SQL_SELECT_VCMSLOGGER_WHERE);

			boolean bindEntryId = false;

			if (entryId == null) {
				query.append(_FINDER_COLUMN_E_C_ENTRYID_1);
			}
			else if (entryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_E_C_ENTRYID_3);
			}
			else {
				bindEntryId = true;

				query.append(_FINDER_COLUMN_E_C_ENTRYID_2);
			}

			boolean bindClassEntry = false;

			if (classEntry == null) {
				query.append(_FINDER_COLUMN_E_C_CLASSENTRY_1);
			}
			else if (classEntry.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_E_C_CLASSENTRY_3);
			}
			else {
				bindClassEntry = true;

				query.append(_FINDER_COLUMN_E_C_CLASSENTRY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryId) {
					qPos.add(entryId);
				}

				if (bindClassEntry) {
					qPos.add(classEntry);
				}

				if (!pagination) {
					list = (List<VcmsLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsLogger>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms logger
	 * @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger findByE_C_First(String entryId, String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = fetchByE_C_First(entryId, classEntry,
				orderByComparator);

		if (vcmsLogger != null) {
			return vcmsLogger;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("entryId=");
		msg.append(entryId);

		msg.append(", classEntry=");
		msg.append(classEntry);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsLoggerException(msg.toString());
	}

	/**
	 * Returns the first vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger fetchByE_C_First(String entryId, String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator) {
		List<VcmsLogger> list = findByE_C(entryId, classEntry, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms logger
	 * @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger findByE_C_Last(String entryId, String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = fetchByE_C_Last(entryId, classEntry,
				orderByComparator);

		if (vcmsLogger != null) {
			return vcmsLogger;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("entryId=");
		msg.append(entryId);

		msg.append(", classEntry=");
		msg.append(classEntry);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsLoggerException(msg.toString());
	}

	/**
	 * Returns the last vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	 */
	@Override
	public VcmsLogger fetchByE_C_Last(String entryId, String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator) {
		int count = countByE_C(entryId, classEntry);

		if (count == 0) {
			return null;
		}

		List<VcmsLogger> list = findByE_C(entryId, classEntry, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms loggers before and after the current vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param loggerId the primary key of the current vcms logger
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms logger
	 * @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger[] findByE_C_PrevAndNext(String loggerId, String entryId,
		String classEntry, OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			VcmsLogger[] array = new VcmsLoggerImpl[3];

			array[0] = getByE_C_PrevAndNext(session, vcmsLogger, entryId,
					classEntry, orderByComparator, true);

			array[1] = vcmsLogger;

			array[2] = getByE_C_PrevAndNext(session, vcmsLogger, entryId,
					classEntry, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsLogger getByE_C_PrevAndNext(Session session,
		VcmsLogger vcmsLogger, String entryId, String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSLOGGER_WHERE);

		boolean bindEntryId = false;

		if (entryId == null) {
			query.append(_FINDER_COLUMN_E_C_ENTRYID_1);
		}
		else if (entryId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_E_C_ENTRYID_3);
		}
		else {
			bindEntryId = true;

			query.append(_FINDER_COLUMN_E_C_ENTRYID_2);
		}

		boolean bindClassEntry = false;

		if (classEntry == null) {
			query.append(_FINDER_COLUMN_E_C_CLASSENTRY_1);
		}
		else if (classEntry.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_E_C_CLASSENTRY_3);
		}
		else {
			bindClassEntry = true;

			query.append(_FINDER_COLUMN_E_C_CLASSENTRY_2);
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
			query.append(VcmsLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEntryId) {
			qPos.add(entryId);
		}

		if (bindClassEntry) {
			qPos.add(classEntry);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms loggers where entryId = &#63; and classEntry = &#63; from the database.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 */
	@Override
	public void removeByE_C(String entryId, String classEntry) {
		for (VcmsLogger vcmsLogger : findByE_C(entryId, classEntry,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsLogger);
		}
	}

	/**
	 * Returns the number of vcms loggers where entryId = &#63; and classEntry = &#63;.
	 *
	 * @param entryId the entry ID
	 * @param classEntry the class entry
	 * @return the number of matching vcms loggers
	 */
	@Override
	public int countByE_C(String entryId, String classEntry) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_E_C;

		Object[] finderArgs = new Object[] { entryId, classEntry };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSLOGGER_WHERE);

			boolean bindEntryId = false;

			if (entryId == null) {
				query.append(_FINDER_COLUMN_E_C_ENTRYID_1);
			}
			else if (entryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_E_C_ENTRYID_3);
			}
			else {
				bindEntryId = true;

				query.append(_FINDER_COLUMN_E_C_ENTRYID_2);
			}

			boolean bindClassEntry = false;

			if (classEntry == null) {
				query.append(_FINDER_COLUMN_E_C_CLASSENTRY_1);
			}
			else if (classEntry.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_E_C_CLASSENTRY_3);
			}
			else {
				bindClassEntry = true;

				query.append(_FINDER_COLUMN_E_C_CLASSENTRY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEntryId) {
					qPos.add(entryId);
				}

				if (bindClassEntry) {
					qPos.add(classEntry);
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

	private static final String _FINDER_COLUMN_E_C_ENTRYID_1 = "vcmsLogger.entryId IS NULL AND ";
	private static final String _FINDER_COLUMN_E_C_ENTRYID_2 = "vcmsLogger.entryId = ? AND ";
	private static final String _FINDER_COLUMN_E_C_ENTRYID_3 = "(vcmsLogger.entryId IS NULL OR vcmsLogger.entryId = '') AND ";
	private static final String _FINDER_COLUMN_E_C_CLASSENTRY_1 = "vcmsLogger.classEntry IS NULL";
	private static final String _FINDER_COLUMN_E_C_CLASSENTRY_2 = "vcmsLogger.classEntry = ?";
	private static final String _FINDER_COLUMN_E_C_CLASSENTRY_3 = "(vcmsLogger.classEntry IS NULL OR vcmsLogger.classEntry = '')";

	public VcmsLoggerPersistenceImpl() {
		setModelClass(VcmsLogger.class);
	}

	/**
	 * Caches the vcms logger in the entity cache if it is enabled.
	 *
	 * @param vcmsLogger the vcms logger
	 */
	@Override
	public void cacheResult(VcmsLogger vcmsLogger) {
		entityCache.putResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerImpl.class, vcmsLogger.getPrimaryKey(), vcmsLogger);

		vcmsLogger.resetOriginalValues();
	}

	/**
	 * Caches the vcms loggers in the entity cache if it is enabled.
	 *
	 * @param vcmsLoggers the vcms loggers
	 */
	@Override
	public void cacheResult(List<VcmsLogger> vcmsLoggers) {
		for (VcmsLogger vcmsLogger : vcmsLoggers) {
			if (entityCache.getResult(
						VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
						VcmsLoggerImpl.class, vcmsLogger.getPrimaryKey()) == null) {
				cacheResult(vcmsLogger);
			}
			else {
				vcmsLogger.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms loggers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsLoggerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms logger.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsLogger vcmsLogger) {
		entityCache.removeResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerImpl.class, vcmsLogger.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsLogger> vcmsLoggers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsLogger vcmsLogger : vcmsLoggers) {
			entityCache.removeResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
				VcmsLoggerImpl.class, vcmsLogger.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms logger with the primary key. Does not add the vcms logger to the database.
	 *
	 * @param loggerId the primary key for the new vcms logger
	 * @return the new vcms logger
	 */
	@Override
	public VcmsLogger create(String loggerId) {
		VcmsLogger vcmsLogger = new VcmsLoggerImpl();

		vcmsLogger.setNew(true);
		vcmsLogger.setPrimaryKey(loggerId);

		vcmsLogger.setCompanyId(companyProvider.getCompanyId());

		return vcmsLogger;
	}

	/**
	 * Removes the vcms logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loggerId the primary key of the vcms logger
	 * @return the vcms logger that was removed
	 * @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger remove(String loggerId) throws NoSuchVcmsLoggerException {
		return remove((Serializable)loggerId);
	}

	/**
	 * Removes the vcms logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms logger
	 * @return the vcms logger that was removed
	 * @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger remove(Serializable primaryKey)
		throws NoSuchVcmsLoggerException {
		Session session = null;

		try {
			session = openSession();

			VcmsLogger vcmsLogger = (VcmsLogger)session.get(VcmsLoggerImpl.class,
					primaryKey);

			if (vcmsLogger == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsLogger);
		}
		catch (NoSuchVcmsLoggerException nsee) {
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
	protected VcmsLogger removeImpl(VcmsLogger vcmsLogger) {
		vcmsLogger = toUnwrappedModel(vcmsLogger);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsLogger)) {
				vcmsLogger = (VcmsLogger)session.get(VcmsLoggerImpl.class,
						vcmsLogger.getPrimaryKeyObj());
			}

			if (vcmsLogger != null) {
				session.delete(vcmsLogger);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsLogger != null) {
			clearCache(vcmsLogger);
		}

		return vcmsLogger;
	}

	@Override
	public VcmsLogger updateImpl(VcmsLogger vcmsLogger) {
		vcmsLogger = toUnwrappedModel(vcmsLogger);

		boolean isNew = vcmsLogger.isNew();

		VcmsLoggerModelImpl vcmsLoggerModelImpl = (VcmsLoggerModelImpl)vcmsLogger;

		Session session = null;

		try {
			session = openSession();

			if (vcmsLogger.isNew()) {
				session.save(vcmsLogger);

				vcmsLogger.setNew(false);
			}
			else {
				vcmsLogger = (VcmsLogger)session.merge(vcmsLogger);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsLoggerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsLoggerModelImpl.getOriginalCreatedByUser(),
						vcmsLoggerModelImpl.getOriginalCreatedDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D,
					args);

				args = new Object[] {
						vcmsLoggerModelImpl.getCreatedByUser(),
						vcmsLoggerModelImpl.getCreatedDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D,
					args);
			}

			if ((vcmsLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsLoggerModelImpl.getOriginalEntryId(),
						vcmsLoggerModelImpl.getOriginalClassEntry()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_E_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_C,
					args);

				args = new Object[] {
						vcmsLoggerModelImpl.getEntryId(),
						vcmsLoggerModelImpl.getClassEntry()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_E_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_E_C,
					args);
			}
		}

		entityCache.putResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VcmsLoggerImpl.class, vcmsLogger.getPrimaryKey(), vcmsLogger, false);

		vcmsLogger.resetOriginalValues();

		return vcmsLogger;
	}

	protected VcmsLogger toUnwrappedModel(VcmsLogger vcmsLogger) {
		if (vcmsLogger instanceof VcmsLoggerImpl) {
			return vcmsLogger;
		}

		VcmsLoggerImpl vcmsLoggerImpl = new VcmsLoggerImpl();

		vcmsLoggerImpl.setNew(vcmsLogger.isNew());
		vcmsLoggerImpl.setPrimaryKey(vcmsLogger.getPrimaryKey());

		vcmsLoggerImpl.setLoggerId(vcmsLogger.getLoggerId());
		vcmsLoggerImpl.setGroupId(vcmsLogger.getGroupId());
		vcmsLoggerImpl.setCompanyId(vcmsLogger.getCompanyId());
		vcmsLoggerImpl.setEntryId(vcmsLogger.getEntryId());
		vcmsLoggerImpl.setCreatedDate(vcmsLogger.getCreatedDate());
		vcmsLoggerImpl.setCreatedByUser(vcmsLogger.getCreatedByUser());
		vcmsLoggerImpl.setClassEntry(vcmsLogger.getClassEntry());
		vcmsLoggerImpl.setContent(vcmsLogger.getContent());

		return vcmsLoggerImpl;
	}

	/**
	 * Returns the vcms logger with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms logger
	 * @return the vcms logger
	 * @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsLoggerException {
		VcmsLogger vcmsLogger = fetchByPrimaryKey(primaryKey);

		if (vcmsLogger == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsLogger;
	}

	/**
	 * Returns the vcms logger with the primary key or throws a {@link NoSuchVcmsLoggerException} if it could not be found.
	 *
	 * @param loggerId the primary key of the vcms logger
	 * @return the vcms logger
	 * @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger findByPrimaryKey(String loggerId)
		throws NoSuchVcmsLoggerException {
		return findByPrimaryKey((Serializable)loggerId);
	}

	/**
	 * Returns the vcms logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms logger
	 * @return the vcms logger, or <code>null</code> if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
				VcmsLoggerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsLogger vcmsLogger = (VcmsLogger)serializable;

		if (vcmsLogger == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsLogger = (VcmsLogger)session.get(VcmsLoggerImpl.class,
						primaryKey);

				if (vcmsLogger != null) {
					cacheResult(vcmsLogger);
				}
				else {
					entityCache.putResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
						VcmsLoggerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
					VcmsLoggerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsLogger;
	}

	/**
	 * Returns the vcms logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loggerId the primary key of the vcms logger
	 * @return the vcms logger, or <code>null</code> if a vcms logger with the primary key could not be found
	 */
	@Override
	public VcmsLogger fetchByPrimaryKey(String loggerId) {
		return fetchByPrimaryKey((Serializable)loggerId);
	}

	@Override
	public Map<Serializable, VcmsLogger> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsLogger> map = new HashMap<Serializable, VcmsLogger>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsLogger vcmsLogger = fetchByPrimaryKey(primaryKey);

			if (vcmsLogger != null) {
				map.put(primaryKey, vcmsLogger);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
					VcmsLoggerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsLogger)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSLOGGER_WHERE_PKS_IN);

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

			for (VcmsLogger vcmsLogger : (List<VcmsLogger>)q.list()) {
				map.put(vcmsLogger.getPrimaryKeyObj(), vcmsLogger);

				cacheResult(vcmsLogger);

				uncachedPrimaryKeys.remove(vcmsLogger.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsLoggerModelImpl.ENTITY_CACHE_ENABLED,
					VcmsLoggerImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms loggers.
	 *
	 * @return the vcms loggers
	 */
	@Override
	public List<VcmsLogger> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @return the range of vcms loggers
	 */
	@Override
	public List<VcmsLogger> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms loggers
	 */
	@Override
	public List<VcmsLogger> findAll(int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms loggers
	 * @param end the upper bound of the range of vcms loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms loggers
	 */
	@Override
	public List<VcmsLogger> findAll(int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator,
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

		List<VcmsLogger> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsLogger>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSLOGGER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSLOGGER;

				if (pagination) {
					sql = sql.concat(VcmsLoggerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsLogger>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms loggers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsLogger vcmsLogger : findAll()) {
			remove(vcmsLogger);
		}
	}

	/**
	 * Returns the number of vcms loggers.
	 *
	 * @return the number of vcms loggers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSLOGGER);

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
		return VcmsLoggerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms logger persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsLoggerImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSLOGGER = "SELECT vcmsLogger FROM VcmsLogger vcmsLogger";
	private static final String _SQL_SELECT_VCMSLOGGER_WHERE_PKS_IN = "SELECT vcmsLogger FROM VcmsLogger vcmsLogger WHERE loggerId IN (";
	private static final String _SQL_SELECT_VCMSLOGGER_WHERE = "SELECT vcmsLogger FROM VcmsLogger vcmsLogger WHERE ";
	private static final String _SQL_COUNT_VCMSLOGGER = "SELECT COUNT(vcmsLogger) FROM VcmsLogger vcmsLogger";
	private static final String _SQL_COUNT_VCMSLOGGER_WHERE = "SELECT COUNT(vcmsLogger) FROM VcmsLogger vcmsLogger WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsLogger.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsLogger exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsLogger exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsLoggerPersistenceImpl.class);
}