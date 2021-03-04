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

import vn.gov.hoabinh.exception.NoSuchvdocLoggerException;
import vn.gov.hoabinh.model.impl.vdocLoggerImpl;
import vn.gov.hoabinh.model.impl.vdocLoggerModelImpl;
import vn.gov.hoabinh.model.vdocLogger;
import vn.gov.hoabinh.service.persistence.vdocLoggerPersistence;

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
 * The persistence implementation for the vdoc logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLoggerPersistence
 * @see vn.gov.hoabinh.service.persistence.vdocLoggerUtil
 * @generated
 */
@ProviderType
public class vdocLoggerPersistenceImpl extends BasePersistenceImpl<vdocLogger>
	implements vdocLoggerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vdocLoggerUtil} to access the vdoc logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vdocLoggerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, vdocLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, vdocLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, vdocLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, vdocLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			vdocLoggerModelImpl.GROUPID_COLUMN_BITMASK |
			vdocLoggerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vdoc loggers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @return the range of matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByGroupId(long groupId, int start, int end,
		OrderByComparator<vdocLogger> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByGroupId(long groupId, int start, int end,
		OrderByComparator<vdocLogger> orderByComparator,
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

		List<vdocLogger> list = null;

		if (retrieveFromCache) {
			list = (List<vdocLogger>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocLogger vdocLogger : list) {
					if ((groupId != vdocLogger.getGroupId())) {
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

			query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc logger
	 * @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger findByGroupId_First(long groupId,
		OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = fetchByGroupId_First(groupId, orderByComparator);

		if (vdocLogger != null) {
			return vdocLogger;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocLoggerException(msg.toString());
	}

	/**
	 * Returns the first vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger fetchByGroupId_First(long groupId,
		OrderByComparator<vdocLogger> orderByComparator) {
		List<vdocLogger> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc logger
	 * @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger findByGroupId_Last(long groupId,
		OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = fetchByGroupId_Last(groupId, orderByComparator);

		if (vdocLogger != null) {
			return vdocLogger;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocLoggerException(msg.toString());
	}

	/**
	 * Returns the last vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger fetchByGroupId_Last(long groupId,
		OrderByComparator<vdocLogger> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<vdocLogger> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * @param loggerId the primary key of the current vdoc logger
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc logger
	 * @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger[] findByGroupId_PrevAndNext(String loggerId,
		long groupId, OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			vdocLogger[] array = new vdocLoggerImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vdocLogger, groupId,
					orderByComparator, true);

			array[1] = vdocLogger;

			array[2] = getByGroupId_PrevAndNext(session, vdocLogger, groupId,
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

	protected vdocLogger getByGroupId_PrevAndNext(Session session,
		vdocLogger vdocLogger, long groupId,
		OrderByComparator<vdocLogger> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

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
			query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc loggers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (vdocLogger vdocLogger : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vdocLogger);
		}
	}

	/**
	 * Returns the number of vdoc loggers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching vdoc loggers
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCLOGGER_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vdocLogger.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_E_C = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, vdocLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_E_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_E_C = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, vdocLoggerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_E_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			vdocLoggerModelImpl.GROUPID_COLUMN_BITMASK |
			vdocLoggerModelImpl.ENTRYID_COLUMN_BITMASK |
			vdocLoggerModelImpl.CLASSNAME_COLUMN_BITMASK |
			vdocLoggerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_E_C = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_E_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @return the matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByG_E_C(long groupId, String entryId,
		String className) {
		return findByG_E_C(groupId, entryId, className, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @return the range of matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByG_E_C(long groupId, String entryId,
		String className, int start, int end) {
		return findByG_E_C(groupId, entryId, className, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByG_E_C(long groupId, String entryId,
		String className, int start, int end,
		OrderByComparator<vdocLogger> orderByComparator) {
		return findByG_E_C(groupId, entryId, className, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc loggers
	 */
	@Override
	public List<vdocLogger> findByG_E_C(long groupId, String entryId,
		String className, int start, int end,
		OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_E_C;
			finderArgs = new Object[] { groupId, entryId, className };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_E_C;
			finderArgs = new Object[] {
					groupId, entryId, className,
					
					start, end, orderByComparator
				};
		}

		List<vdocLogger> list = null;

		if (retrieveFromCache) {
			list = (List<vdocLogger>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocLogger vdocLogger : list) {
					if ((groupId != vdocLogger.getGroupId()) ||
							!Objects.equals(entryId, vdocLogger.getEntryId()) ||
							!Objects.equals(className, vdocLogger.getClassName())) {
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

			query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_G_E_C_GROUPID_2);

			boolean bindEntryId = false;

			if (entryId == null) {
				query.append(_FINDER_COLUMN_G_E_C_ENTRYID_1);
			}
			else if (entryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_E_C_ENTRYID_3);
			}
			else {
				bindEntryId = true;

				query.append(_FINDER_COLUMN_G_E_C_ENTRYID_2);
			}

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindEntryId) {
					qPos.add(entryId);
				}

				if (bindClassName) {
					qPos.add(className);
				}

				if (!pagination) {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc logger
	 * @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger findByG_E_C_First(long groupId, String entryId,
		String className, OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = fetchByG_E_C_First(groupId, entryId, className,
				orderByComparator);

		if (vdocLogger != null) {
			return vdocLogger;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", entryId=");
		msg.append(entryId);

		msg.append(", className=");
		msg.append(className);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocLoggerException(msg.toString());
	}

	/**
	 * Returns the first vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger fetchByG_E_C_First(long groupId, String entryId,
		String className, OrderByComparator<vdocLogger> orderByComparator) {
		List<vdocLogger> list = findByG_E_C(groupId, entryId, className, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc logger
	 * @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger findByG_E_C_Last(long groupId, String entryId,
		String className, OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = fetchByG_E_C_Last(groupId, entryId, className,
				orderByComparator);

		if (vdocLogger != null) {
			return vdocLogger;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", entryId=");
		msg.append(entryId);

		msg.append(", className=");
		msg.append(className);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocLoggerException(msg.toString());
	}

	/**
	 * Returns the last vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	 */
	@Override
	public vdocLogger fetchByG_E_C_Last(long groupId, String entryId,
		String className, OrderByComparator<vdocLogger> orderByComparator) {
		int count = countByG_E_C(groupId, entryId, className);

		if (count == 0) {
			return null;
		}

		List<vdocLogger> list = findByG_E_C(groupId, entryId, className,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param loggerId the primary key of the current vdoc logger
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc logger
	 * @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger[] findByG_E_C_PrevAndNext(String loggerId, long groupId,
		String entryId, String className,
		OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			vdocLogger[] array = new vdocLoggerImpl[3];

			array[0] = getByG_E_C_PrevAndNext(session, vdocLogger, groupId,
					entryId, className, orderByComparator, true);

			array[1] = vdocLogger;

			array[2] = getByG_E_C_PrevAndNext(session, vdocLogger, groupId,
					entryId, className, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocLogger getByG_E_C_PrevAndNext(Session session,
		vdocLogger vdocLogger, long groupId, String entryId, String className,
		OrderByComparator<vdocLogger> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

		query.append(_FINDER_COLUMN_G_E_C_GROUPID_2);

		boolean bindEntryId = false;

		if (entryId == null) {
			query.append(_FINDER_COLUMN_G_E_C_ENTRYID_1);
		}
		else if (entryId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_E_C_ENTRYID_3);
		}
		else {
			bindEntryId = true;

			query.append(_FINDER_COLUMN_G_E_C_ENTRYID_2);
		}

		boolean bindClassName = false;

		if (className == null) {
			query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_1);
		}
		else if (className.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_3);
		}
		else {
			bindClassName = true;

			query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_2);
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
			query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindEntryId) {
			qPos.add(entryId);
		}

		if (bindClassName) {
			qPos.add(className);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 */
	@Override
	public void removeByG_E_C(long groupId, String entryId, String className) {
		for (vdocLogger vdocLogger : findByG_E_C(groupId, entryId, className,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocLogger);
		}
	}

	/**
	 * Returns the number of vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	 *
	 * @param groupId the group ID
	 * @param entryId the entry ID
	 * @param className the class name
	 * @return the number of matching vdoc loggers
	 */
	@Override
	public int countByG_E_C(long groupId, String entryId, String className) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_E_C;

		Object[] finderArgs = new Object[] { groupId, entryId, className };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_G_E_C_GROUPID_2);

			boolean bindEntryId = false;

			if (entryId == null) {
				query.append(_FINDER_COLUMN_G_E_C_ENTRYID_1);
			}
			else if (entryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_E_C_ENTRYID_3);
			}
			else {
				bindEntryId = true;

				query.append(_FINDER_COLUMN_G_E_C_ENTRYID_2);
			}

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_G_E_C_CLASSNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindEntryId) {
					qPos.add(entryId);
				}

				if (bindClassName) {
					qPos.add(className);
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

	private static final String _FINDER_COLUMN_G_E_C_GROUPID_2 = "vdocLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_E_C_ENTRYID_1 = "vdocLogger.entryId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_E_C_ENTRYID_2 = "vdocLogger.entryId = ? AND ";
	private static final String _FINDER_COLUMN_G_E_C_ENTRYID_3 = "(vdocLogger.entryId IS NULL OR vdocLogger.entryId = '') AND ";
	private static final String _FINDER_COLUMN_G_E_C_CLASSNAME_1 = "vdocLogger.className IS NULL";
	private static final String _FINDER_COLUMN_G_E_C_CLASSNAME_2 = "vdocLogger.className = ?";
	private static final String _FINDER_COLUMN_G_E_C_CLASSNAME_3 = "(vdocLogger.className IS NULL OR vdocLogger.className = '')";

	public vdocLoggerPersistenceImpl() {
		setModelClass(vdocLogger.class);
	}

	/**
	 * Caches the vdoc logger in the entity cache if it is enabled.
	 *
	 * @param vdocLogger the vdoc logger
	 */
	@Override
	public void cacheResult(vdocLogger vdocLogger) {
		entityCache.putResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey(), vdocLogger);

		vdocLogger.resetOriginalValues();
	}

	/**
	 * Caches the vdoc loggers in the entity cache if it is enabled.
	 *
	 * @param vdocLoggers the vdoc loggers
	 */
	@Override
	public void cacheResult(List<vdocLogger> vdocLoggers) {
		for (vdocLogger vdocLogger : vdocLoggers) {
			if (entityCache.getResult(
						vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
						vdocLoggerImpl.class, vdocLogger.getPrimaryKey()) == null) {
				cacheResult(vdocLogger);
			}
			else {
				vdocLogger.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vdoc loggers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vdocLoggerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vdoc logger.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vdocLogger vdocLogger) {
		entityCache.removeResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<vdocLogger> vdocLoggers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vdocLogger vdocLogger : vdocLoggers) {
			entityCache.removeResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
				vdocLoggerImpl.class, vdocLogger.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vdoc logger with the primary key. Does not add the vdoc logger to the database.
	 *
	 * @param loggerId the primary key for the new vdoc logger
	 * @return the new vdoc logger
	 */
	@Override
	public vdocLogger create(String loggerId) {
		vdocLogger vdocLogger = new vdocLoggerImpl();

		vdocLogger.setNew(true);
		vdocLogger.setPrimaryKey(loggerId);

		vdocLogger.setCompanyId(companyProvider.getCompanyId());

		return vdocLogger;
	}

	/**
	 * Removes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loggerId the primary key of the vdoc logger
	 * @return the vdoc logger that was removed
	 * @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger remove(String loggerId) throws NoSuchvdocLoggerException {
		return remove((Serializable)loggerId);
	}

	/**
	 * Removes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc logger
	 * @return the vdoc logger that was removed
	 * @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger remove(Serializable primaryKey)
		throws NoSuchvdocLoggerException {
		Session session = null;

		try {
			session = openSession();

			vdocLogger vdocLogger = (vdocLogger)session.get(vdocLoggerImpl.class,
					primaryKey);

			if (vdocLogger == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvdocLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vdocLogger);
		}
		catch (NoSuchvdocLoggerException nsee) {
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
	protected vdocLogger removeImpl(vdocLogger vdocLogger) {
		vdocLogger = toUnwrappedModel(vdocLogger);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vdocLogger)) {
				vdocLogger = (vdocLogger)session.get(vdocLoggerImpl.class,
						vdocLogger.getPrimaryKeyObj());
			}

			if (vdocLogger != null) {
				session.delete(vdocLogger);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vdocLogger != null) {
			clearCache(vdocLogger);
		}

		return vdocLogger;
	}

	@Override
	public vdocLogger updateImpl(vdocLogger vdocLogger) {
		vdocLogger = toUnwrappedModel(vdocLogger);

		boolean isNew = vdocLogger.isNew();

		vdocLoggerModelImpl vdocLoggerModelImpl = (vdocLoggerModelImpl)vdocLogger;

		Session session = null;

		try {
			session = openSession();

			if (vdocLogger.isNew()) {
				session.save(vdocLogger);

				vdocLogger.setNew(false);
			}
			else {
				vdocLogger = (vdocLogger)session.merge(vdocLogger);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !vdocLoggerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vdocLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocLoggerModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vdocLoggerModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vdocLoggerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_E_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocLoggerModelImpl.getOriginalGroupId(),
						vdocLoggerModelImpl.getOriginalEntryId(),
						vdocLoggerModelImpl.getOriginalClassName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_E_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_E_C,
					args);

				args = new Object[] {
						vdocLoggerModelImpl.getGroupId(),
						vdocLoggerModelImpl.getEntryId(),
						vdocLoggerModelImpl.getClassName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_E_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_E_C,
					args);
			}
		}

		entityCache.putResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey(), vdocLogger, false);

		vdocLogger.resetOriginalValues();

		return vdocLogger;
	}

	protected vdocLogger toUnwrappedModel(vdocLogger vdocLogger) {
		if (vdocLogger instanceof vdocLoggerImpl) {
			return vdocLogger;
		}

		vdocLoggerImpl vdocLoggerImpl = new vdocLoggerImpl();

		vdocLoggerImpl.setNew(vdocLogger.isNew());
		vdocLoggerImpl.setPrimaryKey(vdocLogger.getPrimaryKey());

		vdocLoggerImpl.setLoggerId(vdocLogger.getLoggerId());
		vdocLoggerImpl.setGroupId(vdocLogger.getGroupId());
		vdocLoggerImpl.setCompanyId(vdocLogger.getCompanyId());
		vdocLoggerImpl.setUserId(vdocLogger.getUserId());
		vdocLoggerImpl.setCreatedDate(vdocLogger.getCreatedDate());
		vdocLoggerImpl.setCreatedByUser(vdocLogger.getCreatedByUser());
		vdocLoggerImpl.setEntryId(vdocLogger.getEntryId());
		vdocLoggerImpl.setClassName(vdocLogger.getClassName());
		vdocLoggerImpl.setContent(vdocLogger.getContent());

		return vdocLoggerImpl;
	}

	/**
	 * Returns the vdoc logger with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc logger
	 * @return the vdoc logger
	 * @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvdocLoggerException {
		vdocLogger vdocLogger = fetchByPrimaryKey(primaryKey);

		if (vdocLogger == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvdocLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vdocLogger;
	}

	/**
	 * Returns the vdoc logger with the primary key or throws a {@link NoSuchvdocLoggerException} if it could not be found.
	 *
	 * @param loggerId the primary key of the vdoc logger
	 * @return the vdoc logger
	 * @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger findByPrimaryKey(String loggerId)
		throws NoSuchvdocLoggerException {
		return findByPrimaryKey((Serializable)loggerId);
	}

	/**
	 * Returns the vdoc logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc logger
	 * @return the vdoc logger, or <code>null</code> if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
				vdocLoggerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		vdocLogger vdocLogger = (vdocLogger)serializable;

		if (vdocLogger == null) {
			Session session = null;

			try {
				session = openSession();

				vdocLogger = (vdocLogger)session.get(vdocLoggerImpl.class,
						primaryKey);

				if (vdocLogger != null) {
					cacheResult(vdocLogger);
				}
				else {
					entityCache.putResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
						vdocLoggerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
					vdocLoggerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vdocLogger;
	}

	/**
	 * Returns the vdoc logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loggerId the primary key of the vdoc logger
	 * @return the vdoc logger, or <code>null</code> if a vdoc logger with the primary key could not be found
	 */
	@Override
	public vdocLogger fetchByPrimaryKey(String loggerId) {
		return fetchByPrimaryKey((Serializable)loggerId);
	}

	@Override
	public Map<Serializable, vdocLogger> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, vdocLogger> map = new HashMap<Serializable, vdocLogger>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			vdocLogger vdocLogger = fetchByPrimaryKey(primaryKey);

			if (vdocLogger != null) {
				map.put(primaryKey, vdocLogger);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
					vdocLoggerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (vdocLogger)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VDOCLOGGER_WHERE_PKS_IN);

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

			for (vdocLogger vdocLogger : (List<vdocLogger>)q.list()) {
				map.put(vdocLogger.getPrimaryKeyObj(), vdocLogger);

				cacheResult(vdocLogger);

				uncachedPrimaryKeys.remove(vdocLogger.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
					vdocLoggerImpl.class, primaryKey, nullModel);
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
	 * Returns all the vdoc loggers.
	 *
	 * @return the vdoc loggers
	 */
	@Override
	public List<vdocLogger> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @return the range of vdoc loggers
	 */
	@Override
	public List<vdocLogger> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vdoc loggers
	 */
	@Override
	public List<vdocLogger> findAll(int start, int end,
		OrderByComparator<vdocLogger> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc loggers
	 * @param end the upper bound of the range of vdoc loggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vdoc loggers
	 */
	@Override
	public List<vdocLogger> findAll(int start, int end,
		OrderByComparator<vdocLogger> orderByComparator,
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

		List<vdocLogger> list = null;

		if (retrieveFromCache) {
			list = (List<vdocLogger>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VDOCLOGGER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCLOGGER;

				if (pagination) {
					sql = sql.concat(vdocLoggerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vdoc loggers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vdocLogger vdocLogger : findAll()) {
			remove(vdocLogger);
		}
	}

	/**
	 * Returns the number of vdoc loggers.
	 *
	 * @return the number of vdoc loggers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VDOCLOGGER);

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
		return vdocLoggerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vdoc logger persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(vdocLoggerImpl.class.getName());
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
	private static final String _SQL_SELECT_VDOCLOGGER = "SELECT vdocLogger FROM vdocLogger vdocLogger";
	private static final String _SQL_SELECT_VDOCLOGGER_WHERE_PKS_IN = "SELECT vdocLogger FROM vdocLogger vdocLogger WHERE loggerId IN (";
	private static final String _SQL_SELECT_VDOCLOGGER_WHERE = "SELECT vdocLogger FROM vdocLogger vdocLogger WHERE ";
	private static final String _SQL_COUNT_VDOCLOGGER = "SELECT COUNT(vdocLogger) FROM vdocLogger vdocLogger";
	private static final String _SQL_COUNT_VDOCLOGGER_WHERE = "SELECT COUNT(vdocLogger) FROM vdocLogger vdocLogger WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocLogger.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocLogger exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocLogger exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(vdocLoggerPersistenceImpl.class);
}