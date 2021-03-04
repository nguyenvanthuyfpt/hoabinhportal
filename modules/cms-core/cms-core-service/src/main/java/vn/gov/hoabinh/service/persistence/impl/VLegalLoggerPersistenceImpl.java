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

import vn.gov.hoabinh.exception.NoSuchVLegalLoggerException;
import vn.gov.hoabinh.model.VLegalLogger;
import vn.gov.hoabinh.model.impl.VLegalLoggerImpl;
import vn.gov.hoabinh.model.impl.VLegalLoggerModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalLoggerPersistence;

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
 * The persistence implementation for the v legal logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalLoggerPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalLoggerUtil
 * @generated
 */
@ProviderType
public class VLegalLoggerPersistenceImpl extends BasePersistenceImpl<VLegalLogger>
	implements VLegalLoggerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalLoggerUtil} to access the v legal logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalLoggerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_G_L = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalLoggerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalLoggerModelImpl.LOGGERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal logger where groupId = &#63; and loggerId = &#63; or throws a {@link NoSuchVLegalLoggerException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param loggerId the logger ID
	 * @return the matching v legal logger
	 * @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger findByG_L(long groupId, String loggerId)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = fetchByG_L(groupId, loggerId);

		if (vLegalLogger == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", loggerId=");
			msg.append(loggerId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalLoggerException(msg.toString());
		}

		return vLegalLogger;
	}

	/**
	 * Returns the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param loggerId the logger ID
	 * @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger fetchByG_L(long groupId, String loggerId) {
		return fetchByG_L(groupId, loggerId, true);
	}

	/**
	 * Returns the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param loggerId the logger ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger fetchByG_L(long groupId, String loggerId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, loggerId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_L,
					finderArgs, this);
		}

		if (result instanceof VLegalLogger) {
			VLegalLogger vLegalLogger = (VLegalLogger)result;

			if ((groupId != vLegalLogger.getGroupId()) ||
					!Objects.equals(loggerId, vLegalLogger.getLoggerId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLoggerId = false;

			if (loggerId == null) {
				query.append(_FINDER_COLUMN_G_L_LOGGERID_1);
			}
			else if (loggerId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LOGGERID_3);
			}
			else {
				bindLoggerId = true;

				query.append(_FINDER_COLUMN_G_L_LOGGERID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLoggerId) {
					qPos.add(loggerId);
				}

				List<VLegalLogger> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_L, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalLoggerPersistenceImpl.fetchByG_L(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalLogger vLegalLogger = list.get(0);

					result = vLegalLogger;

					cacheResult(vLegalLogger);

					if ((vLegalLogger.getGroupId() != groupId) ||
							(vLegalLogger.getLoggerId() == null) ||
							!vLegalLogger.getLoggerId().equals(loggerId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_L,
							finderArgs, vLegalLogger);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_L, finderArgs);

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
			return (VLegalLogger)result;
		}
	}

	/**
	 * Removes the v legal logger where groupId = &#63; and loggerId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param loggerId the logger ID
	 * @return the v legal logger that was removed
	 */
	@Override
	public VLegalLogger removeByG_L(long groupId, String loggerId)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = findByG_L(groupId, loggerId);

		return remove(vLegalLogger);
	}

	/**
	 * Returns the number of v legal loggers where groupId = &#63; and loggerId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param loggerId the logger ID
	 * @return the number of matching v legal loggers
	 */
	@Override
	public int countByG_L(long groupId, String loggerId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, loggerId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALLOGGER_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLoggerId = false;

			if (loggerId == null) {
				query.append(_FINDER_COLUMN_G_L_LOGGERID_1);
			}
			else if (loggerId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LOGGERID_3);
			}
			else {
				bindLoggerId = true;

				query.append(_FINDER_COLUMN_G_L_LOGGERID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLoggerId) {
					qPos.add(loggerId);
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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vLegalLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_1 = "vLegalLogger.loggerId IS NULL";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_2 = "vLegalLogger.loggerId = ?";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_3 = "(vLegalLogger.loggerId IS NULL OR vLegalLogger.loggerId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_D = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName()
			},
			VLegalLoggerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalLoggerModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VLegalLoggerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_D = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName()
			});

	/**
	 * Returns all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @return the matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate) {
		return findByU_D(groupId, createdByUser, createdDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @return the range of matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end) {
		return findByU_D(groupId, createdByUser, createdDate, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return findByU_D(groupId, createdByUser, createdDate, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D;
			finderArgs = new Object[] { groupId, createdByUser, createdDate };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_D;
			finderArgs = new Object[] {
					groupId, createdByUser, createdDate,
					
					start, end, orderByComparator
				};
		}

		List<VLegalLogger> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalLogger>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalLogger vLegalLogger : list) {
					if ((groupId != vLegalLogger.getGroupId()) ||
							(createdByUser != vLegalLogger.getCreatedByUser()) ||
							!Objects.equals(createdDate,
								vLegalLogger.getCreatedDate())) {
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

			query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

			query.append(_FINDER_COLUMN_U_D_GROUPID_2);

			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);

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
				query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (bindCreatedDate) {
					qPos.add(new Timestamp(createdDate.getTime()));
				}

				if (!pagination) {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal logger
	 * @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger findByU_D_First(long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = fetchByU_D_First(groupId, createdByUser,
				createdDate, orderByComparator);

		if (vLegalLogger != null) {
			return vLegalLogger;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", createdDate=");
		msg.append(createdDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalLoggerException(msg.toString());
	}

	/**
	 * Returns the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger fetchByU_D_First(long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator) {
		List<VLegalLogger> list = findByU_D(groupId, createdByUser,
				createdDate, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal logger
	 * @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger findByU_D_Last(long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = fetchByU_D_Last(groupId, createdByUser,
				createdDate, orderByComparator);

		if (vLegalLogger != null) {
			return vLegalLogger;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", createdDate=");
		msg.append(createdDate);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalLoggerException(msg.toString());
	}

	/**
	 * Returns the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger fetchByU_D_Last(long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator) {
		int count = countByU_D(groupId, createdByUser, createdDate);

		if (count == 0) {
			return null;
		}

		List<VLegalLogger> list = findByU_D(groupId, createdByUser,
				createdDate, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param loggerId the primary key of the current v legal logger
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal logger
	 * @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger[] findByU_D_PrevAndNext(String loggerId, long groupId,
		long createdByUser, Date createdDate,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			VLegalLogger[] array = new VLegalLoggerImpl[3];

			array[0] = getByU_D_PrevAndNext(session, vLegalLogger, groupId,
					createdByUser, createdDate, orderByComparator, true);

			array[1] = vLegalLogger;

			array[2] = getByU_D_PrevAndNext(session, vLegalLogger, groupId,
					createdByUser, createdDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalLogger getByU_D_PrevAndNext(Session session,
		VLegalLogger vLegalLogger, long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator,
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

		query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

		query.append(_FINDER_COLUMN_U_D_GROUPID_2);

		query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);

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
			query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(createdByUser);

		if (bindCreatedDate) {
			qPos.add(new Timestamp(createdDate.getTime()));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 */
	@Override
	public void removeByU_D(long groupId, long createdByUser, Date createdDate) {
		for (VLegalLogger vLegalLogger : findByU_D(groupId, createdByUser,
				createdDate, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalLogger);
		}
	}

	/**
	 * Returns the number of v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param createdDate the created date
	 * @return the number of matching v legal loggers
	 */
	@Override
	public int countByU_D(long groupId, long createdByUser, Date createdDate) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_D;

		Object[] finderArgs = new Object[] { groupId, createdByUser, createdDate };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALLOGGER_WHERE);

			query.append(_FINDER_COLUMN_U_D_GROUPID_2);

			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);

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

				qPos.add(groupId);

				qPos.add(createdByUser);

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

	private static final String _FINDER_COLUMN_U_D_GROUPID_2 = "vLegalLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDBYUSER_2 = "vLegalLogger.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_1 = "vLegalLogger.createdDate IS NULL";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_2 = "vLegalLogger.createdDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, VLegalLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalLoggerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalLoggerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal loggers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @return the range of matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal loggers
	 */
	@Override
	public List<VLegalLogger> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator,
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

		List<VLegalLogger> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalLogger>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalLogger vLegalLogger : list) {
					if ((groupId != vLegalLogger.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal logger
	 * @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger findByGroupId_First(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalLogger != null) {
			return vLegalLogger;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalLoggerException(msg.toString());
	}

	/**
	 * Returns the first v legal logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator) {
		List<VLegalLogger> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal logger
	 * @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger findByGroupId_Last(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (vLegalLogger != null) {
			return vLegalLogger;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalLoggerException(msg.toString());
	}

	/**
	 * Returns the last v legal logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 */
	@Override
	public VLegalLogger fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalLogger> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63;.
	 *
	 * @param loggerId the primary key of the current v legal logger
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal logger
	 * @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger[] findByGroupId_PrevAndNext(String loggerId,
		long groupId, OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			VLegalLogger[] array = new VLegalLoggerImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalLogger, groupId,
					orderByComparator, true);

			array[1] = vLegalLogger;

			array[2] = getByGroupId_PrevAndNext(session, vLegalLogger, groupId,
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

	protected VLegalLogger getByGroupId_PrevAndNext(Session session,
		VLegalLogger vLegalLogger, long groupId,
		OrderByComparator<VLegalLogger> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

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
			query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal loggers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalLogger vLegalLogger : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalLogger);
		}
	}

	/**
	 * Returns the number of v legal loggers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal loggers
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALLOGGER_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalLogger.groupId = ?";

	public VLegalLoggerPersistenceImpl() {
		setModelClass(VLegalLogger.class);
	}

	/**
	 * Caches the v legal logger in the entity cache if it is enabled.
	 *
	 * @param vLegalLogger the v legal logger
	 */
	@Override
	public void cacheResult(VLegalLogger vLegalLogger) {
		entityCache.putResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey(), vLegalLogger);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] { vLegalLogger.getGroupId(), vLegalLogger.getLoggerId() },
			vLegalLogger);

		vLegalLogger.resetOriginalValues();
	}

	/**
	 * Caches the v legal loggers in the entity cache if it is enabled.
	 *
	 * @param vLegalLoggers the v legal loggers
	 */
	@Override
	public void cacheResult(List<VLegalLogger> vLegalLoggers) {
		for (VLegalLogger vLegalLogger : vLegalLoggers) {
			if (entityCache.getResult(
						VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
						VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey()) == null) {
				cacheResult(vLegalLogger);
			}
			else {
				vLegalLogger.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal loggers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalLoggerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal logger.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalLogger vLegalLogger) {
		entityCache.removeResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalLoggerModelImpl)vLegalLogger);
	}

	@Override
	public void clearCache(List<VLegalLogger> vLegalLoggers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalLogger vLegalLogger : vLegalLoggers) {
			entityCache.removeResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
				VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey());

			clearUniqueFindersCache((VLegalLoggerModelImpl)vLegalLogger);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalLoggerModelImpl vLegalLoggerModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalLoggerModelImpl.getGroupId(),
					vLegalLoggerModelImpl.getLoggerId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_L, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_L, args,
				vLegalLoggerModelImpl);
		}
		else {
			if ((vLegalLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalLoggerModelImpl.getGroupId(),
						vLegalLoggerModelImpl.getLoggerId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_L, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_L, args,
					vLegalLoggerModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalLoggerModelImpl vLegalLoggerModelImpl) {
		Object[] args = new Object[] {
				vLegalLoggerModelImpl.getGroupId(),
				vLegalLoggerModelImpl.getLoggerId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_L, args);

		if ((vLegalLoggerModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_L.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalLoggerModelImpl.getOriginalGroupId(),
					vLegalLoggerModelImpl.getOriginalLoggerId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_L, args);
		}
	}

	/**
	 * Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	 *
	 * @param loggerId the primary key for the new v legal logger
	 * @return the new v legal logger
	 */
	@Override
	public VLegalLogger create(String loggerId) {
		VLegalLogger vLegalLogger = new VLegalLoggerImpl();

		vLegalLogger.setNew(true);
		vLegalLogger.setPrimaryKey(loggerId);

		vLegalLogger.setCompanyId(companyProvider.getCompanyId());

		return vLegalLogger;
	}

	/**
	 * Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loggerId the primary key of the v legal logger
	 * @return the v legal logger that was removed
	 * @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger remove(String loggerId)
		throws NoSuchVLegalLoggerException {
		return remove((Serializable)loggerId);
	}

	/**
	 * Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal logger
	 * @return the v legal logger that was removed
	 * @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger remove(Serializable primaryKey)
		throws NoSuchVLegalLoggerException {
		Session session = null;

		try {
			session = openSession();

			VLegalLogger vLegalLogger = (VLegalLogger)session.get(VLegalLoggerImpl.class,
					primaryKey);

			if (vLegalLogger == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalLogger);
		}
		catch (NoSuchVLegalLoggerException nsee) {
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
	protected VLegalLogger removeImpl(VLegalLogger vLegalLogger) {
		vLegalLogger = toUnwrappedModel(vLegalLogger);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalLogger)) {
				vLegalLogger = (VLegalLogger)session.get(VLegalLoggerImpl.class,
						vLegalLogger.getPrimaryKeyObj());
			}

			if (vLegalLogger != null) {
				session.delete(vLegalLogger);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalLogger != null) {
			clearCache(vLegalLogger);
		}

		return vLegalLogger;
	}

	@Override
	public VLegalLogger updateImpl(VLegalLogger vLegalLogger) {
		vLegalLogger = toUnwrappedModel(vLegalLogger);

		boolean isNew = vLegalLogger.isNew();

		VLegalLoggerModelImpl vLegalLoggerModelImpl = (VLegalLoggerModelImpl)vLegalLogger;

		Session session = null;

		try {
			session = openSession();

			if (vLegalLogger.isNew()) {
				session.save(vLegalLogger);

				vLegalLogger.setNew(false);
			}
			else {
				vLegalLogger = (VLegalLogger)session.merge(vLegalLogger);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalLoggerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalLoggerModelImpl.getOriginalGroupId(),
						vLegalLoggerModelImpl.getOriginalCreatedByUser(),
						vLegalLoggerModelImpl.getOriginalCreatedDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D,
					args);

				args = new Object[] {
						vLegalLoggerModelImpl.getGroupId(),
						vLegalLoggerModelImpl.getCreatedByUser(),
						vLegalLoggerModelImpl.getCreatedDate()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_D,
					args);
			}

			if ((vLegalLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalLoggerModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalLoggerModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey(), vLegalLogger,
			false);

		clearUniqueFindersCache(vLegalLoggerModelImpl);
		cacheUniqueFindersCache(vLegalLoggerModelImpl, isNew);

		vLegalLogger.resetOriginalValues();

		return vLegalLogger;
	}

	protected VLegalLogger toUnwrappedModel(VLegalLogger vLegalLogger) {
		if (vLegalLogger instanceof VLegalLoggerImpl) {
			return vLegalLogger;
		}

		VLegalLoggerImpl vLegalLoggerImpl = new VLegalLoggerImpl();

		vLegalLoggerImpl.setNew(vLegalLogger.isNew());
		vLegalLoggerImpl.setPrimaryKey(vLegalLogger.getPrimaryKey());

		vLegalLoggerImpl.setLoggerId(vLegalLogger.getLoggerId());
		vLegalLoggerImpl.setGroupId(vLegalLogger.getGroupId());
		vLegalLoggerImpl.setCompanyId(vLegalLogger.getCompanyId());
		vLegalLoggerImpl.setUserId(vLegalLogger.getUserId());
		vLegalLoggerImpl.setCreatedDate(vLegalLogger.getCreatedDate());
		vLegalLoggerImpl.setCreatedByUser(vLegalLogger.getCreatedByUser());
		vLegalLoggerImpl.setContent(vLegalLogger.getContent());

		return vLegalLoggerImpl;
	}

	/**
	 * Returns the v legal logger with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal logger
	 * @return the v legal logger
	 * @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalLoggerException {
		VLegalLogger vLegalLogger = fetchByPrimaryKey(primaryKey);

		if (vLegalLogger == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalLogger;
	}

	/**
	 * Returns the v legal logger with the primary key or throws a {@link NoSuchVLegalLoggerException} if it could not be found.
	 *
	 * @param loggerId the primary key of the v legal logger
	 * @return the v legal logger
	 * @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger findByPrimaryKey(String loggerId)
		throws NoSuchVLegalLoggerException {
		return findByPrimaryKey((Serializable)loggerId);
	}

	/**
	 * Returns the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal logger
	 * @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
				VLegalLoggerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalLogger vLegalLogger = (VLegalLogger)serializable;

		if (vLegalLogger == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalLogger = (VLegalLogger)session.get(VLegalLoggerImpl.class,
						primaryKey);

				if (vLegalLogger != null) {
					cacheResult(vLegalLogger);
				}
				else {
					entityCache.putResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
						VLegalLoggerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
					VLegalLoggerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalLogger;
	}

	/**
	 * Returns the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loggerId the primary key of the v legal logger
	 * @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	 */
	@Override
	public VLegalLogger fetchByPrimaryKey(String loggerId) {
		return fetchByPrimaryKey((Serializable)loggerId);
	}

	@Override
	public Map<Serializable, VLegalLogger> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalLogger> map = new HashMap<Serializable, VLegalLogger>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalLogger vLegalLogger = fetchByPrimaryKey(primaryKey);

			if (vLegalLogger != null) {
				map.put(primaryKey, vLegalLogger);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
					VLegalLoggerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalLogger)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALLOGGER_WHERE_PKS_IN);

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

			for (VLegalLogger vLegalLogger : (List<VLegalLogger>)q.list()) {
				map.put(vLegalLogger.getPrimaryKeyObj(), vLegalLogger);

				cacheResult(vLegalLogger);

				uncachedPrimaryKeys.remove(vLegalLogger.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
					VLegalLoggerImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal loggers.
	 *
	 * @return the v legal loggers
	 */
	@Override
	public List<VLegalLogger> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @return the range of v legal loggers
	 */
	@Override
	public List<VLegalLogger> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal loggers
	 */
	@Override
	public List<VLegalLogger> findAll(int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal loggers
	 * @param end the upper bound of the range of v legal loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal loggers
	 */
	@Override
	public List<VLegalLogger> findAll(int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator,
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

		List<VLegalLogger> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalLogger>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALLOGGER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALLOGGER;

				if (pagination) {
					sql = sql.concat(VLegalLoggerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal loggers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalLogger vLegalLogger : findAll()) {
			remove(vLegalLogger);
		}
	}

	/**
	 * Returns the number of v legal loggers.
	 *
	 * @return the number of v legal loggers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALLOGGER);

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
		return VLegalLoggerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal logger persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalLoggerImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALLOGGER = "SELECT vLegalLogger FROM VLegalLogger vLegalLogger";
	private static final String _SQL_SELECT_VLEGALLOGGER_WHERE_PKS_IN = "SELECT vLegalLogger FROM VLegalLogger vLegalLogger WHERE loggerId IN (";
	private static final String _SQL_SELECT_VLEGALLOGGER_WHERE = "SELECT vLegalLogger FROM VLegalLogger vLegalLogger WHERE ";
	private static final String _SQL_COUNT_VLEGALLOGGER = "SELECT COUNT(vLegalLogger) FROM VLegalLogger vLegalLogger";
	private static final String _SQL_COUNT_VLEGALLOGGER_WHERE = "SELECT COUNT(vLegalLogger) FROM VLegalLogger vLegalLogger WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalLogger.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalLogger exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalLogger exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalLoggerPersistenceImpl.class);
}