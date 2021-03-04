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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchLinkGroupException;
import vn.gov.hoabinh.model.LinkGroup;
import vn.gov.hoabinh.model.impl.LinkGroupImpl;
import vn.gov.hoabinh.model.impl.LinkGroupModelImpl;
import vn.gov.hoabinh.service.persistence.LinkGroupPersistence;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the link group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroupPersistence
 * @see vn.gov.hoabinh.service.persistence.LinkGroupUtil
 * @generated
 */
@ProviderType
public class LinkGroupPersistenceImpl extends BasePersistenceImpl<LinkGroup>
	implements LinkGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LinkGroupUtil} to access the link group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LinkGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, LinkGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, LinkGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, LinkGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, LinkGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupId",
			new String[] { Long.class.getName() },
			LinkGroupModelImpl.GROUPID_COLUMN_BITMASK |
			LinkGroupModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the link groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching link groups
	 */
	@Override
	public List<LinkGroup> findBygroupId(long groupId) {
		return findBygroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the link groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @return the range of matching link groups
	 */
	@Override
	public List<LinkGroup> findBygroupId(long groupId, int start, int end) {
		return findBygroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the link groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching link groups
	 */
	@Override
	public List<LinkGroup> findBygroupId(long groupId, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator) {
		return findBygroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the link groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching link groups
	 */
	@Override
	public List<LinkGroup> findBygroupId(long groupId, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator,
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

		List<LinkGroup> list = null;

		if (retrieveFromCache) {
			list = (List<LinkGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LinkGroup linkGroup : list) {
					if ((groupId != linkGroup.getGroupId())) {
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

			query.append(_SQL_SELECT_LINKGROUP_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinkGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first link group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching link group
	 * @throws NoSuchLinkGroupException if a matching link group could not be found
	 */
	@Override
	public LinkGroup findBygroupId_First(long groupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException {
		LinkGroup linkGroup = fetchBygroupId_First(groupId, orderByComparator);

		if (linkGroup != null) {
			return linkGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinkGroupException(msg.toString());
	}

	/**
	 * Returns the first link group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching link group, or <code>null</code> if a matching link group could not be found
	 */
	@Override
	public LinkGroup fetchBygroupId_First(long groupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		List<LinkGroup> list = findBygroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last link group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching link group
	 * @throws NoSuchLinkGroupException if a matching link group could not be found
	 */
	@Override
	public LinkGroup findBygroupId_Last(long groupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException {
		LinkGroup linkGroup = fetchBygroupId_Last(groupId, orderByComparator);

		if (linkGroup != null) {
			return linkGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinkGroupException(msg.toString());
	}

	/**
	 * Returns the last link group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching link group, or <code>null</code> if a matching link group could not be found
	 */
	@Override
	public LinkGroup fetchBygroupId_Last(long groupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		int count = countBygroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<LinkGroup> list = findBygroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the link groups before and after the current link group in the ordered set where groupId = &#63;.
	 *
	 * @param linkgroupId the primary key of the current link group
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next link group
	 * @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup[] findBygroupId_PrevAndNext(long linkgroupId,
		long groupId, OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException {
		LinkGroup linkGroup = findByPrimaryKey(linkgroupId);

		Session session = null;

		try {
			session = openSession();

			LinkGroup[] array = new LinkGroupImpl[3];

			array[0] = getBygroupId_PrevAndNext(session, linkGroup, groupId,
					orderByComparator, true);

			array[1] = linkGroup;

			array[2] = getBygroupId_PrevAndNext(session, linkGroup, groupId,
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

	protected LinkGroup getBygroupId_PrevAndNext(Session session,
		LinkGroup linkGroup, long groupId,
		OrderByComparator<LinkGroup> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINKGROUP_WHERE);

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
			query.append(LinkGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(linkGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LinkGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the link groups where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeBygroupId(long groupId) {
		for (LinkGroup linkGroup : findBygroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(linkGroup);
		}
	}

	/**
	 * Returns the number of link groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching link groups
	 */
	@Override
	public int countBygroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINKGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "linkGroup.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, LinkGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMenu",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, LinkGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMenu",
			new String[] { Long.class.getName() },
			LinkGroupModelImpl.LINKGROUPID_COLUMN_BITMASK |
			LinkGroupModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MENU = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMenu",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByMenu",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the link groups where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @return the matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long linkgroupId) {
		return findByMenu(linkgroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the link groups where linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @return the range of matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long linkgroupId, int start, int end) {
		return findByMenu(linkgroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the link groups where linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long linkgroupId, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator) {
		return findByMenu(linkgroupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the link groups where linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long linkgroupId, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { linkgroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { linkgroupId, start, end, orderByComparator };
		}

		List<LinkGroup> list = null;

		if (retrieveFromCache) {
			list = (List<LinkGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LinkGroup linkGroup : list) {
					if ((linkgroupId != linkGroup.getLinkgroupId())) {
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

			query.append(_SQL_SELECT_LINKGROUP_WHERE);

			query.append(_FINDER_COLUMN_MENU_LINKGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinkGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linkgroupId);

				if (!pagination) {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first link group in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching link group
	 * @throws NoSuchLinkGroupException if a matching link group could not be found
	 */
	@Override
	public LinkGroup findByMenu_First(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException {
		LinkGroup linkGroup = fetchByMenu_First(linkgroupId, orderByComparator);

		if (linkGroup != null) {
			return linkGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linkgroupId=");
		msg.append(linkgroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinkGroupException(msg.toString());
	}

	/**
	 * Returns the first link group in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching link group, or <code>null</code> if a matching link group could not be found
	 */
	@Override
	public LinkGroup fetchByMenu_First(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		List<LinkGroup> list = findByMenu(linkgroupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last link group in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching link group
	 * @throws NoSuchLinkGroupException if a matching link group could not be found
	 */
	@Override
	public LinkGroup findByMenu_Last(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException {
		LinkGroup linkGroup = fetchByMenu_Last(linkgroupId, orderByComparator);

		if (linkGroup != null) {
			return linkGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linkgroupId=");
		msg.append(linkgroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinkGroupException(msg.toString());
	}

	/**
	 * Returns the last link group in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching link group, or <code>null</code> if a matching link group could not be found
	 */
	@Override
	public LinkGroup fetchByMenu_Last(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		int count = countByMenu(linkgroupId);

		if (count == 0) {
			return null;
		}

		List<LinkGroup> list = findByMenu(linkgroupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns all the link groups where linkgroupId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupIds the linkgroup IDs
	 * @return the matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long[] linkgroupIds) {
		return findByMenu(linkgroupIds, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the link groups where linkgroupId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupIds the linkgroup IDs
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @return the range of matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long[] linkgroupIds, int start, int end) {
		return findByMenu(linkgroupIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the link groups where linkgroupId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupIds the linkgroup IDs
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long[] linkgroupIds, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator) {
		return findByMenu(linkgroupIds, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the link groups where linkgroupId = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching link groups
	 */
	@Override
	public List<LinkGroup> findByMenu(long[] linkgroupIds, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache) {
		if (linkgroupIds == null) {
			linkgroupIds = new long[0];
		}
		else if (linkgroupIds.length > 1) {
			linkgroupIds = ArrayUtil.unique(linkgroupIds);

			Arrays.sort(linkgroupIds);
		}

		if (linkgroupIds.length == 1) {
			return findByMenu(linkgroupIds[0], start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(linkgroupIds) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(linkgroupIds),
					
					start, end, orderByComparator
				};
		}

		List<LinkGroup> list = null;

		if (retrieveFromCache) {
			list = (List<LinkGroup>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LinkGroup linkGroup : list) {
					if (!ArrayUtil.contains(linkgroupIds,
								linkGroup.getLinkgroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_LINKGROUP_WHERE);

			if (linkgroupIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_MENU_LINKGROUPID_7);

				query.append(StringUtil.merge(linkgroupIds));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinkGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the link groups where linkgroupId = &#63; from the database.
	 *
	 * @param linkgroupId the linkgroup ID
	 */
	@Override
	public void removeByMenu(long linkgroupId) {
		for (LinkGroup linkGroup : findByMenu(linkgroupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(linkGroup);
		}
	}

	/**
	 * Returns the number of link groups where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @return the number of matching link groups
	 */
	@Override
	public int countByMenu(long linkgroupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MENU;

		Object[] finderArgs = new Object[] { linkgroupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINKGROUP_WHERE);

			query.append(_FINDER_COLUMN_MENU_LINKGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linkgroupId);

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

	/**
	 * Returns the number of link groups where linkgroupId = any &#63;.
	 *
	 * @param linkgroupIds the linkgroup IDs
	 * @return the number of matching link groups
	 */
	@Override
	public int countByMenu(long[] linkgroupIds) {
		if (linkgroupIds == null) {
			linkgroupIds = new long[0];
		}
		else if (linkgroupIds.length > 1) {
			linkgroupIds = ArrayUtil.unique(linkgroupIds);

			Arrays.sort(linkgroupIds);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(linkgroupIds) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_LINKGROUP_WHERE);

			if (linkgroupIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_MENU_LINKGROUPID_7);

				query.append(StringUtil.merge(linkgroupIds));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MENU_LINKGROUPID_2 = "linkGroup.linkgroupId = ?";
	private static final String _FINDER_COLUMN_MENU_LINKGROUPID_7 = "linkGroup.linkgroupId IN (";

	public LinkGroupPersistenceImpl() {
		setModelClass(LinkGroup.class);
	}

	/**
	 * Caches the link group in the entity cache if it is enabled.
	 *
	 * @param linkGroup the link group
	 */
	@Override
	public void cacheResult(LinkGroup linkGroup) {
		entityCache.putResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey(), linkGroup);

		linkGroup.resetOriginalValues();
	}

	/**
	 * Caches the link groups in the entity cache if it is enabled.
	 *
	 * @param linkGroups the link groups
	 */
	@Override
	public void cacheResult(List<LinkGroup> linkGroups) {
		for (LinkGroup linkGroup : linkGroups) {
			if (entityCache.getResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
						LinkGroupImpl.class, linkGroup.getPrimaryKey()) == null) {
				cacheResult(linkGroup);
			}
			else {
				linkGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all link groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LinkGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the link group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LinkGroup linkGroup) {
		entityCache.removeResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LinkGroup> linkGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LinkGroup linkGroup : linkGroups) {
			entityCache.removeResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
				LinkGroupImpl.class, linkGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new link group with the primary key. Does not add the link group to the database.
	 *
	 * @param linkgroupId the primary key for the new link group
	 * @return the new link group
	 */
	@Override
	public LinkGroup create(long linkgroupId) {
		LinkGroup linkGroup = new LinkGroupImpl();

		linkGroup.setNew(true);
		linkGroup.setPrimaryKey(linkgroupId);

		linkGroup.setCompanyId(companyProvider.getCompanyId());

		return linkGroup;
	}

	/**
	 * Removes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linkgroupId the primary key of the link group
	 * @return the link group that was removed
	 * @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup remove(long linkgroupId) throws NoSuchLinkGroupException {
		return remove((Serializable)linkgroupId);
	}

	/**
	 * Removes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the link group
	 * @return the link group that was removed
	 * @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup remove(Serializable primaryKey)
		throws NoSuchLinkGroupException {
		Session session = null;

		try {
			session = openSession();

			LinkGroup linkGroup = (LinkGroup)session.get(LinkGroupImpl.class,
					primaryKey);

			if (linkGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLinkGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(linkGroup);
		}
		catch (NoSuchLinkGroupException nsee) {
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
	protected LinkGroup removeImpl(LinkGroup linkGroup) {
		linkGroup = toUnwrappedModel(linkGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(linkGroup)) {
				linkGroup = (LinkGroup)session.get(LinkGroupImpl.class,
						linkGroup.getPrimaryKeyObj());
			}

			if (linkGroup != null) {
				session.delete(linkGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (linkGroup != null) {
			clearCache(linkGroup);
		}

		return linkGroup;
	}

	@Override
	public LinkGroup updateImpl(LinkGroup linkGroup) {
		linkGroup = toUnwrappedModel(linkGroup);

		boolean isNew = linkGroup.isNew();

		LinkGroupModelImpl linkGroupModelImpl = (LinkGroupModelImpl)linkGroup;

		Session session = null;

		try {
			session = openSession();

			if (linkGroup.isNew()) {
				session.save(linkGroup);

				linkGroup.setNew(false);
			}
			else {
				linkGroup = (LinkGroup)session.merge(linkGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LinkGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((linkGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linkGroupModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { linkGroupModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((linkGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linkGroupModelImpl.getOriginalLinkgroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);

				args = new Object[] { linkGroupModelImpl.getLinkgroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);
			}
		}

		entityCache.putResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey(), linkGroup, false);

		linkGroup.resetOriginalValues();

		return linkGroup;
	}

	protected LinkGroup toUnwrappedModel(LinkGroup linkGroup) {
		if (linkGroup instanceof LinkGroupImpl) {
			return linkGroup;
		}

		LinkGroupImpl linkGroupImpl = new LinkGroupImpl();

		linkGroupImpl.setNew(linkGroup.isNew());
		linkGroupImpl.setPrimaryKey(linkGroup.getPrimaryKey());

		linkGroupImpl.setLinkgroupId(linkGroup.getLinkgroupId());
		linkGroupImpl.setGroupId(linkGroup.getGroupId());
		linkGroupImpl.setCompanyId(linkGroup.getCompanyId());
		linkGroupImpl.setCreatedDate(linkGroup.getCreatedDate());
		linkGroupImpl.setModifiedDate(linkGroup.getModifiedDate());
		linkGroupImpl.setName(linkGroup.getName());
		linkGroupImpl.setDescription(linkGroup.getDescription());
		linkGroupImpl.setPosition(linkGroup.getPosition());

		return linkGroupImpl;
	}

	/**
	 * Returns the link group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the link group
	 * @return the link group
	 * @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLinkGroupException {
		LinkGroup linkGroup = fetchByPrimaryKey(primaryKey);

		if (linkGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLinkGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return linkGroup;
	}

	/**
	 * Returns the link group with the primary key or throws a {@link NoSuchLinkGroupException} if it could not be found.
	 *
	 * @param linkgroupId the primary key of the link group
	 * @return the link group
	 * @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup findByPrimaryKey(long linkgroupId)
		throws NoSuchLinkGroupException {
		return findByPrimaryKey((Serializable)linkgroupId);
	}

	/**
	 * Returns the link group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the link group
	 * @return the link group, or <code>null</code> if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
				LinkGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LinkGroup linkGroup = (LinkGroup)serializable;

		if (linkGroup == null) {
			Session session = null;

			try {
				session = openSession();

				linkGroup = (LinkGroup)session.get(LinkGroupImpl.class,
						primaryKey);

				if (linkGroup != null) {
					cacheResult(linkGroup);
				}
				else {
					entityCache.putResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
						LinkGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
					LinkGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return linkGroup;
	}

	/**
	 * Returns the link group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linkgroupId the primary key of the link group
	 * @return the link group, or <code>null</code> if a link group with the primary key could not be found
	 */
	@Override
	public LinkGroup fetchByPrimaryKey(long linkgroupId) {
		return fetchByPrimaryKey((Serializable)linkgroupId);
	}

	@Override
	public Map<Serializable, LinkGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LinkGroup> map = new HashMap<Serializable, LinkGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LinkGroup linkGroup = fetchByPrimaryKey(primaryKey);

			if (linkGroup != null) {
				map.put(primaryKey, linkGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
					LinkGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LinkGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LINKGROUP_WHERE_PKS_IN);

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

			for (LinkGroup linkGroup : (List<LinkGroup>)q.list()) {
				map.put(linkGroup.getPrimaryKeyObj(), linkGroup);

				cacheResult(linkGroup);

				uncachedPrimaryKeys.remove(linkGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
					LinkGroupImpl.class, primaryKey, nullModel);
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
	 * Returns all the link groups.
	 *
	 * @return the link groups
	 */
	@Override
	public List<LinkGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the link groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @return the range of link groups
	 */
	@Override
	public List<LinkGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the link groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of link groups
	 */
	@Override
	public List<LinkGroup> findAll(int start, int end,
		OrderByComparator<LinkGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the link groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of link groups
	 * @param end the upper bound of the range of link groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of link groups
	 */
	@Override
	public List<LinkGroup> findAll(int start, int end,
		OrderByComparator<LinkGroup> orderByComparator,
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

		List<LinkGroup> list = null;

		if (retrieveFromCache) {
			list = (List<LinkGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LINKGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINKGROUP;

				if (pagination) {
					sql = sql.concat(LinkGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the link groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LinkGroup linkGroup : findAll()) {
			remove(linkGroup);
		}
	}

	/**
	 * Returns the number of link groups.
	 *
	 * @return the number of link groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LINKGROUP);

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
		return LinkGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the link group persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LinkGroupImpl.class.getName());
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
	private static final String _SQL_SELECT_LINKGROUP = "SELECT linkGroup FROM LinkGroup linkGroup";
	private static final String _SQL_SELECT_LINKGROUP_WHERE_PKS_IN = "SELECT linkGroup FROM LinkGroup linkGroup WHERE linkgroupId IN (";
	private static final String _SQL_SELECT_LINKGROUP_WHERE = "SELECT linkGroup FROM LinkGroup linkGroup WHERE ";
	private static final String _SQL_COUNT_LINKGROUP = "SELECT COUNT(linkGroup) FROM LinkGroup linkGroup";
	private static final String _SQL_COUNT_LINKGROUP_WHERE = "SELECT COUNT(linkGroup) FROM LinkGroup linkGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "linkGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LinkGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LinkGroup exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LinkGroupPersistenceImpl.class);
}