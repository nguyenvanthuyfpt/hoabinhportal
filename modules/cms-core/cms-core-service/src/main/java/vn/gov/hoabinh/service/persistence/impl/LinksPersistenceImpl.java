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

import vn.gov.hoabinh.exception.NoSuchLinksException;
import vn.gov.hoabinh.model.Links;
import vn.gov.hoabinh.model.impl.LinksImpl;
import vn.gov.hoabinh.model.impl.LinksModelImpl;
import vn.gov.hoabinh.service.persistence.LinksPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the links service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinksPersistence
 * @see vn.gov.hoabinh.service.persistence.LinksUtil
 * @generated
 */
@ProviderType
public class LinksPersistenceImpl extends BasePersistenceImpl<Links>
	implements LinksPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LinksUtil} to access the links persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LinksImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LINKGROUPID =
		new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylinkgroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINKGROUPID =
		new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBylinkgroupId",
			new String[] { Long.class.getName() },
			LinksModelImpl.LINKGROUPID_COLUMN_BITMASK |
			LinksModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LINKGROUPID = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylinkgroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the linkses where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @return the matching linkses
	 */
	@Override
	public List<Links> findBylinkgroupId(long linkgroupId) {
		return findBylinkgroupId(linkgroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linkses where linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @return the range of matching linkses
	 */
	@Override
	public List<Links> findBylinkgroupId(long linkgroupId, int start, int end) {
		return findBylinkgroupId(linkgroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linkses where linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linkses
	 */
	@Override
	public List<Links> findBylinkgroupId(long linkgroupId, int start, int end,
		OrderByComparator<Links> orderByComparator) {
		return findBylinkgroupId(linkgroupId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the linkses where linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching linkses
	 */
	@Override
	public List<Links> findBylinkgroupId(long linkgroupId, int start, int end,
		OrderByComparator<Links> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINKGROUPID;
			finderArgs = new Object[] { linkgroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LINKGROUPID;
			finderArgs = new Object[] { linkgroupId, start, end, orderByComparator };
		}

		List<Links> list = null;

		if (retrieveFromCache) {
			list = (List<Links>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Links links : list) {
					if ((linkgroupId != links.getLinkgroupId())) {
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

			query.append(_SQL_SELECT_LINKS_WHERE);

			query.append(_FINDER_COLUMN_LINKGROUPID_LINKGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinksModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(linkgroupId);

				if (!pagination) {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first links in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching links
	 * @throws NoSuchLinksException if a matching links could not be found
	 */
	@Override
	public Links findBylinkgroupId_First(long linkgroupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = fetchBylinkgroupId_First(linkgroupId, orderByComparator);

		if (links != null) {
			return links;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linkgroupId=");
		msg.append(linkgroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinksException(msg.toString());
	}

	/**
	 * Returns the first links in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching links, or <code>null</code> if a matching links could not be found
	 */
	@Override
	public Links fetchBylinkgroupId_First(long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		List<Links> list = findBylinkgroupId(linkgroupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last links in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching links
	 * @throws NoSuchLinksException if a matching links could not be found
	 */
	@Override
	public Links findBylinkgroupId_Last(long linkgroupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = fetchBylinkgroupId_Last(linkgroupId, orderByComparator);

		if (links != null) {
			return links;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("linkgroupId=");
		msg.append(linkgroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinksException(msg.toString());
	}

	/**
	 * Returns the last links in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching links, or <code>null</code> if a matching links could not be found
	 */
	@Override
	public Links fetchBylinkgroupId_Last(long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		int count = countBylinkgroupId(linkgroupId);

		if (count == 0) {
			return null;
		}

		List<Links> list = findBylinkgroupId(linkgroupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linkses before and after the current links in the ordered set where linkgroupId = &#63;.
	 *
	 * @param linkId the primary key of the current links
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next links
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links[] findBylinkgroupId_PrevAndNext(long linkId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = findByPrimaryKey(linkId);

		Session session = null;

		try {
			session = openSession();

			Links[] array = new LinksImpl[3];

			array[0] = getBylinkgroupId_PrevAndNext(session, links,
					linkgroupId, orderByComparator, true);

			array[1] = links;

			array[2] = getBylinkgroupId_PrevAndNext(session, links,
					linkgroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Links getBylinkgroupId_PrevAndNext(Session session, Links links,
		long linkgroupId, OrderByComparator<Links> orderByComparator,
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

		query.append(_SQL_SELECT_LINKS_WHERE);

		query.append(_FINDER_COLUMN_LINKGROUPID_LINKGROUPID_2);

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
			query.append(LinksModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(linkgroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(links);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Links> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linkses where linkgroupId = &#63; from the database.
	 *
	 * @param linkgroupId the linkgroup ID
	 */
	@Override
	public void removeBylinkgroupId(long linkgroupId) {
		for (Links links : findBylinkgroupId(linkgroupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(links);
		}
	}

	/**
	 * Returns the number of linkses where linkgroupId = &#63;.
	 *
	 * @param linkgroupId the linkgroup ID
	 * @return the number of matching linkses
	 */
	@Override
	public int countBylinkgroupId(long linkgroupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LINKGROUPID;

		Object[] finderArgs = new Object[] { linkgroupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINKS_WHERE);

			query.append(_FINDER_COLUMN_LINKGROUPID_LINKGROUPID_2);

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

	private static final String _FINDER_COLUMN_LINKGROUPID_LINKGROUPID_2 = "links.linkgroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LG = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_LG",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LG = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_LG",
			new String[] { Long.class.getName(), Long.class.getName() },
			LinksModelImpl.GROUPID_COLUMN_BITMASK |
			LinksModelImpl.LINKGROUPID_COLUMN_BITMASK |
			LinksModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_LG = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_LG",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the linkses where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @return the matching linkses
	 */
	@Override
	public List<Links> findByG_LG(long groupId, long linkgroupId) {
		return findByG_LG(groupId, linkgroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @return the range of matching linkses
	 */
	@Override
	public List<Links> findByG_LG(long groupId, long linkgroupId, int start,
		int end) {
		return findByG_LG(groupId, linkgroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linkses
	 */
	@Override
	public List<Links> findByG_LG(long groupId, long linkgroupId, int start,
		int end, OrderByComparator<Links> orderByComparator) {
		return findByG_LG(groupId, linkgroupId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching linkses
	 */
	@Override
	public List<Links> findByG_LG(long groupId, long linkgroupId, int start,
		int end, OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LG;
			finderArgs = new Object[] { groupId, linkgroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LG;
			finderArgs = new Object[] {
					groupId, linkgroupId,
					
					start, end, orderByComparator
				};
		}

		List<Links> list = null;

		if (retrieveFromCache) {
			list = (List<Links>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Links links : list) {
					if ((groupId != links.getGroupId()) ||
							(linkgroupId != links.getLinkgroupId())) {
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

			query.append(_SQL_SELECT_LINKS_WHERE);

			query.append(_FINDER_COLUMN_G_LG_GROUPID_2);

			query.append(_FINDER_COLUMN_G_LG_LINKGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinksModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(linkgroupId);

				if (!pagination) {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching links
	 * @throws NoSuchLinksException if a matching links could not be found
	 */
	@Override
	public Links findByG_LG_First(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = fetchByG_LG_First(groupId, linkgroupId, orderByComparator);

		if (links != null) {
			return links;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", linkgroupId=");
		msg.append(linkgroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinksException(msg.toString());
	}

	/**
	 * Returns the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching links, or <code>null</code> if a matching links could not be found
	 */
	@Override
	public Links fetchByG_LG_First(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		List<Links> list = findByG_LG(groupId, linkgroupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching links
	 * @throws NoSuchLinksException if a matching links could not be found
	 */
	@Override
	public Links findByG_LG_Last(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = fetchByG_LG_Last(groupId, linkgroupId, orderByComparator);

		if (links != null) {
			return links;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", linkgroupId=");
		msg.append(linkgroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinksException(msg.toString());
	}

	/**
	 * Returns the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching links, or <code>null</code> if a matching links could not be found
	 */
	@Override
	public Links fetchByG_LG_Last(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		int count = countByG_LG(groupId, linkgroupId);

		if (count == 0) {
			return null;
		}

		List<Links> list = findByG_LG(groupId, linkgroupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linkses before and after the current links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param linkId the primary key of the current links
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next links
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links[] findByG_LG_PrevAndNext(long linkId, long groupId,
		long linkgroupId, OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException {
		Links links = findByPrimaryKey(linkId);

		Session session = null;

		try {
			session = openSession();

			Links[] array = new LinksImpl[3];

			array[0] = getByG_LG_PrevAndNext(session, links, groupId,
					linkgroupId, orderByComparator, true);

			array[1] = links;

			array[2] = getByG_LG_PrevAndNext(session, links, groupId,
					linkgroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Links getByG_LG_PrevAndNext(Session session, Links links,
		long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_LINKS_WHERE);

		query.append(_FINDER_COLUMN_G_LG_GROUPID_2);

		query.append(_FINDER_COLUMN_G_LG_LINKGROUPID_2);

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
			query.append(LinksModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(linkgroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(links);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Links> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linkses where groupId = &#63; and linkgroupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 */
	@Override
	public void removeByG_LG(long groupId, long linkgroupId) {
		for (Links links : findByG_LG(groupId, linkgroupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(links);
		}
	}

	/**
	 * Returns the number of linkses where groupId = &#63; and linkgroupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param linkgroupId the linkgroup ID
	 * @return the number of matching linkses
	 */
	@Override
	public int countByG_LG(long groupId, long linkgroupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_LG;

		Object[] finderArgs = new Object[] { groupId, linkgroupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LINKS_WHERE);

			query.append(_FINDER_COLUMN_G_LG_GROUPID_2);

			query.append(_FINDER_COLUMN_G_LG_LINKGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_G_LG_GROUPID_2 = "links.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_LG_LINKGROUPID_2 = "links.linkgroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, LinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			LinksModelImpl.GROUPID_COLUMN_BITMASK |
			LinksModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the linkses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching linkses
	 */
	@Override
	public List<Links> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linkses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @return the range of matching linkses
	 */
	@Override
	public List<Links> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the linkses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching linkses
	 */
	@Override
	public List<Links> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Links> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the linkses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching linkses
	 */
	@Override
	public List<Links> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Links> orderByComparator, boolean retrieveFromCache) {
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

		List<Links> list = null;

		if (retrieveFromCache) {
			list = (List<Links>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Links links : list) {
					if ((groupId != links.getGroupId())) {
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

			query.append(_SQL_SELECT_LINKS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LinksModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first links in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching links
	 * @throws NoSuchLinksException if a matching links could not be found
	 */
	@Override
	public Links findByGroupId_First(long groupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = fetchByGroupId_First(groupId, orderByComparator);

		if (links != null) {
			return links;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinksException(msg.toString());
	}

	/**
	 * Returns the first links in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching links, or <code>null</code> if a matching links could not be found
	 */
	@Override
	public Links fetchByGroupId_First(long groupId,
		OrderByComparator<Links> orderByComparator) {
		List<Links> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last links in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching links
	 * @throws NoSuchLinksException if a matching links could not be found
	 */
	@Override
	public Links findByGroupId_Last(long groupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = fetchByGroupId_Last(groupId, orderByComparator);

		if (links != null) {
			return links;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLinksException(msg.toString());
	}

	/**
	 * Returns the last links in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching links, or <code>null</code> if a matching links could not be found
	 */
	@Override
	public Links fetchByGroupId_Last(long groupId,
		OrderByComparator<Links> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Links> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the linkses before and after the current links in the ordered set where groupId = &#63;.
	 *
	 * @param linkId the primary key of the current links
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next links
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links[] findByGroupId_PrevAndNext(long linkId, long groupId,
		OrderByComparator<Links> orderByComparator) throws NoSuchLinksException {
		Links links = findByPrimaryKey(linkId);

		Session session = null;

		try {
			session = openSession();

			Links[] array = new LinksImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, links, groupId,
					orderByComparator, true);

			array[1] = links;

			array[2] = getByGroupId_PrevAndNext(session, links, groupId,
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

	protected Links getByGroupId_PrevAndNext(Session session, Links links,
		long groupId, OrderByComparator<Links> orderByComparator,
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

		query.append(_SQL_SELECT_LINKS_WHERE);

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
			query.append(LinksModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(links);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Links> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the linkses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Links links : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(links);
		}
	}

	/**
	 * Returns the number of linkses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching linkses
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINKS_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "links.groupId = ?";

	public LinksPersistenceImpl() {
		setModelClass(Links.class);
	}

	/**
	 * Caches the links in the entity cache if it is enabled.
	 *
	 * @param links the links
	 */
	@Override
	public void cacheResult(Links links) {
		entityCache.putResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksImpl.class, links.getPrimaryKey(), links);

		links.resetOriginalValues();
	}

	/**
	 * Caches the linkses in the entity cache if it is enabled.
	 *
	 * @param linkses the linkses
	 */
	@Override
	public void cacheResult(List<Links> linkses) {
		for (Links links : linkses) {
			if (entityCache.getResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
						LinksImpl.class, links.getPrimaryKey()) == null) {
				cacheResult(links);
			}
			else {
				links.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all linkses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LinksImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the links.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Links links) {
		entityCache.removeResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksImpl.class, links.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Links> linkses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Links links : linkses) {
			entityCache.removeResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
				LinksImpl.class, links.getPrimaryKey());
		}
	}

	/**
	 * Creates a new links with the primary key. Does not add the links to the database.
	 *
	 * @param linkId the primary key for the new links
	 * @return the new links
	 */
	@Override
	public Links create(long linkId) {
		Links links = new LinksImpl();

		links.setNew(true);
		links.setPrimaryKey(linkId);

		links.setCompanyId(companyProvider.getCompanyId());

		return links;
	}

	/**
	 * Removes the links with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linkId the primary key of the links
	 * @return the links that was removed
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links remove(long linkId) throws NoSuchLinksException {
		return remove((Serializable)linkId);
	}

	/**
	 * Removes the links with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the links
	 * @return the links that was removed
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links remove(Serializable primaryKey) throws NoSuchLinksException {
		Session session = null;

		try {
			session = openSession();

			Links links = (Links)session.get(LinksImpl.class, primaryKey);

			if (links == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLinksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(links);
		}
		catch (NoSuchLinksException nsee) {
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
	protected Links removeImpl(Links links) {
		links = toUnwrappedModel(links);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(links)) {
				links = (Links)session.get(LinksImpl.class,
						links.getPrimaryKeyObj());
			}

			if (links != null) {
				session.delete(links);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (links != null) {
			clearCache(links);
		}

		return links;
	}

	@Override
	public Links updateImpl(Links links) {
		links = toUnwrappedModel(links);

		boolean isNew = links.isNew();

		LinksModelImpl linksModelImpl = (LinksModelImpl)links;

		Session session = null;

		try {
			session = openSession();

			if (links.isNew()) {
				session.save(links);

				links.setNew(false);
			}
			else {
				links = (Links)session.merge(links);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LinksModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((linksModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINKGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linksModelImpl.getOriginalLinkgroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LINKGROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINKGROUPID,
					args);

				args = new Object[] { linksModelImpl.getLinkgroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LINKGROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LINKGROUPID,
					args);
			}

			if ((linksModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						linksModelImpl.getOriginalGroupId(),
						linksModelImpl.getOriginalLinkgroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_LG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LG,
					args);

				args = new Object[] {
						linksModelImpl.getGroupId(),
						linksModelImpl.getLinkgroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_LG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LG,
					args);
			}

			if ((linksModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { linksModelImpl.getOriginalGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { linksModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
			LinksImpl.class, links.getPrimaryKey(), links, false);

		links.resetOriginalValues();

		return links;
	}

	protected Links toUnwrappedModel(Links links) {
		if (links instanceof LinksImpl) {
			return links;
		}

		LinksImpl linksImpl = new LinksImpl();

		linksImpl.setNew(links.isNew());
		linksImpl.setPrimaryKey(links.getPrimaryKey());

		linksImpl.setLinkId(links.getLinkId());
		linksImpl.setGroupId(links.getGroupId());
		linksImpl.setCompanyId(links.getCompanyId());
		linksImpl.setCreatedDate(links.getCreatedDate());
		linksImpl.setModifiedDate(links.getModifiedDate());
		linksImpl.setLinkgroupId(links.getLinkgroupId());
		linksImpl.setName(links.getName());
		linksImpl.setDescription(links.getDescription());
		linksImpl.setUrl(links.getUrl());
		linksImpl.setPosition(links.getPosition());
		linksImpl.setImage(links.getImage());

		return linksImpl;
	}

	/**
	 * Returns the links with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the links
	 * @return the links
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLinksException {
		Links links = fetchByPrimaryKey(primaryKey);

		if (links == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLinksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return links;
	}

	/**
	 * Returns the links with the primary key or throws a {@link NoSuchLinksException} if it could not be found.
	 *
	 * @param linkId the primary key of the links
	 * @return the links
	 * @throws NoSuchLinksException if a links with the primary key could not be found
	 */
	@Override
	public Links findByPrimaryKey(long linkId) throws NoSuchLinksException {
		return findByPrimaryKey((Serializable)linkId);
	}

	/**
	 * Returns the links with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the links
	 * @return the links, or <code>null</code> if a links with the primary key could not be found
	 */
	@Override
	public Links fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
				LinksImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Links links = (Links)serializable;

		if (links == null) {
			Session session = null;

			try {
				session = openSession();

				links = (Links)session.get(LinksImpl.class, primaryKey);

				if (links != null) {
					cacheResult(links);
				}
				else {
					entityCache.putResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
						LinksImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
					LinksImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return links;
	}

	/**
	 * Returns the links with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linkId the primary key of the links
	 * @return the links, or <code>null</code> if a links with the primary key could not be found
	 */
	@Override
	public Links fetchByPrimaryKey(long linkId) {
		return fetchByPrimaryKey((Serializable)linkId);
	}

	@Override
	public Map<Serializable, Links> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Links> map = new HashMap<Serializable, Links>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Links links = fetchByPrimaryKey(primaryKey);

			if (links != null) {
				map.put(primaryKey, links);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
					LinksImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Links)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LINKS_WHERE_PKS_IN);

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

			for (Links links : (List<Links>)q.list()) {
				map.put(links.getPrimaryKeyObj(), links);

				cacheResult(links);

				uncachedPrimaryKeys.remove(links.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LinksModelImpl.ENTITY_CACHE_ENABLED,
					LinksImpl.class, primaryKey, nullModel);
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
	 * Returns all the linkses.
	 *
	 * @return the linkses
	 */
	@Override
	public List<Links> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the linkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @return the range of linkses
	 */
	@Override
	public List<Links> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the linkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of linkses
	 */
	@Override
	public List<Links> findAll(int start, int end,
		OrderByComparator<Links> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the linkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of linkses
	 * @param end the upper bound of the range of linkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of linkses
	 */
	@Override
	public List<Links> findAll(int start, int end,
		OrderByComparator<Links> orderByComparator, boolean retrieveFromCache) {
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

		List<Links> list = null;

		if (retrieveFromCache) {
			list = (List<Links>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LINKS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINKS;

				if (pagination) {
					sql = sql.concat(LinksModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Links>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the linkses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Links links : findAll()) {
			remove(links);
		}
	}

	/**
	 * Returns the number of linkses.
	 *
	 * @return the number of linkses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LINKS);

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
		return LinksModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the links persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LinksImpl.class.getName());
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
	private static final String _SQL_SELECT_LINKS = "SELECT links FROM Links links";
	private static final String _SQL_SELECT_LINKS_WHERE_PKS_IN = "SELECT links FROM Links links WHERE linkId IN (";
	private static final String _SQL_SELECT_LINKS_WHERE = "SELECT links FROM Links links WHERE ";
	private static final String _SQL_COUNT_LINKS = "SELECT COUNT(links) FROM Links links";
	private static final String _SQL_COUNT_LINKS_WHERE = "SELECT COUNT(links) FROM Links links WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "links.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Links exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Links exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LinksPersistenceImpl.class);
}