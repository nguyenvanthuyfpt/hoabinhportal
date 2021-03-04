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

import vn.gov.hoabinh.exception.NoSuchAdvItemException;
import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.impl.AdvItemImpl;
import vn.gov.hoabinh.model.impl.AdvItemModelImpl;
import vn.gov.hoabinh.service.persistence.AdvItemPersistence;

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
 * The persistence implementation for the adv item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemPersistence
 * @see vn.gov.hoabinh.service.persistence.AdvItemUtil
 * @generated
 */
@ProviderType
public class AdvItemPersistenceImpl extends BasePersistenceImpl<AdvItem>
	implements AdvItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AdvItemUtil} to access the adv item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AdvItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG",
			new String[] { Long.class.getName() },
			AdvItemModelImpl.GROUPID_COLUMN_BITMASK |
			AdvItemModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the adv items where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching adv items
	 */
	@Override
	public List<AdvItem> findByG(long groupId) {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the adv items where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @return the range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG(long groupId, int start, int end) {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG(long groupId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return findByG(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG(long groupId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
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

		List<AdvItem> list = null;

		if (retrieveFromCache) {
			list = (List<AdvItem>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvItem advItem : list) {
					if ((groupId != advItem.getGroupId())) {
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv item in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_First(long groupId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_First(groupId, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the first adv item in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_First(long groupId,
		OrderByComparator<AdvItem> orderByComparator) {
		List<AdvItem> list = findByG(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_Last(long groupId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_Last(groupId, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_Last(long groupId,
		OrderByComparator<AdvItem> orderByComparator) {
		int count = countByG(groupId);

		if (count == 0) {
			return null;
		}

		List<AdvItem> list = findByG(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the adv items before and after the current adv item in the ordered set where groupId = &#63;.
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem[] findByG_PrevAndNext(long itemId, long groupId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_PrevAndNext(session, advItem, groupId,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_PrevAndNext(session, advItem, groupId,
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

	protected AdvItem getByG_PrevAndNext(Session session, AdvItem advItem,
		long groupId, OrderByComparator<AdvItem> orderByComparator,
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

		query.append(_SQL_SELECT_ADVITEM_WHERE);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv items where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByG(long groupId) {
		for (AdvItem advItem : findByG(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advItem);
		}
	}

	/**
	 * Returns the number of adv items where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching adv items
	 */
	@Override
	public int countByG(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

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

	private static final String _FINDER_COLUMN_G_GROUPID_2 = "advItem.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByT",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByT",
			new String[] { Long.class.getName() },
			AdvItemModelImpl.TYPEID_COLUMN_BITMASK |
			AdvItemModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the adv items where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching adv items
	 */
	@Override
	public List<AdvItem> findByT(long typeId) {
		return findByT(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the adv items where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @return the range of matching adv items
	 */
	@Override
	public List<AdvItem> findByT(long typeId, int start, int end) {
		return findByT(typeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv items where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByT(long typeId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return findByT(typeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv items where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByT(long typeId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T;
			finderArgs = new Object[] { typeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_T;
			finderArgs = new Object[] { typeId, start, end, orderByComparator };
		}

		List<AdvItem> list = null;

		if (retrieveFromCache) {
			list = (List<AdvItem>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvItem advItem : list) {
					if ((typeId != advItem.getTypeId())) {
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_T_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				if (!pagination) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv item in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByT_First(long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByT_First(typeId, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the first adv item in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByT_First(long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		List<AdvItem> list = findByT(typeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv item in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByT_Last(long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByT_Last(typeId, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the last adv item in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByT_Last(long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		int count = countByT(typeId);

		if (count == 0) {
			return null;
		}

		List<AdvItem> list = findByT(typeId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the adv items before and after the current adv item in the ordered set where typeId = &#63;.
	 *
	 * @param itemId the primary key of the current adv item
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem[] findByT_PrevAndNext(long itemId, long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByT_PrevAndNext(session, advItem, typeId,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByT_PrevAndNext(session, advItem, typeId,
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

	protected AdvItem getByT_PrevAndNext(Session session, AdvItem advItem,
		long typeId, OrderByComparator<AdvItem> orderByComparator,
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

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_T_TYPEID_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv items where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	@Override
	public void removeByT(long typeId) {
		for (AdvItem advItem : findByT(typeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advItem);
		}
	}

	/**
	 * Returns the number of adv items where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching adv items
	 */
	@Override
	public int countByT(long typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T;

		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_T_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

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

	private static final String _FINDER_COLUMN_T_TYPEID_2 = "advItem.typeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_T",
			new String[] { Long.class.getName(), Long.class.getName() },
			AdvItemModelImpl.GROUPID_COLUMN_BITMASK |
			AdvItemModelImpl.TYPEID_COLUMN_BITMASK |
			AdvItemModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_T",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @return the matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T(long groupId, long typeId) {
		return findByG_T(groupId, typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @return the range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T(long groupId, long typeId, int start, int end) {
		return findByG_T(groupId, typeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T(long groupId, long typeId, int start,
		int end, OrderByComparator<AdvItem> orderByComparator) {
		return findByG_T(groupId, typeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T(long groupId, long typeId, int start,
		int end, OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T;
			finderArgs = new Object[] { groupId, typeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T;
			finderArgs = new Object[] {
					groupId, typeId,
					
					start, end, orderByComparator
				};
		}

		List<AdvItem> list = null;

		if (retrieveFromCache) {
			list = (List<AdvItem>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvItem advItem : list) {
					if ((groupId != advItem.getGroupId()) ||
							(typeId != advItem.getTypeId())) {
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(typeId);

				if (!pagination) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_T_First(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_T_First(groupId, typeId, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_T_First(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		List<AdvItem> list = findByG_T(groupId, typeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_T_Last(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_T_Last(groupId, typeId, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_T_Last(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		int count = countByG_T(groupId, typeId);

		if (count == 0) {
			return null;
		}

		List<AdvItem> list = findByG_T(groupId, typeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem[] findByG_T_PrevAndNext(long itemId, long groupId,
		long typeId, OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_T_PrevAndNext(session, advItem, groupId, typeId,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_T_PrevAndNext(session, advItem, groupId, typeId,
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

	protected AdvItem getByG_T_PrevAndNext(Session session, AdvItem advItem,
		long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_G_T_GROUPID_2);

		query.append(_FINDER_COLUMN_G_T_TYPEID_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv items where groupId = &#63; and typeId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 */
	@Override
	public void removeByG_T(long groupId, long typeId) {
		for (AdvItem advItem : findByG_T(groupId, typeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advItem);
		}
	}

	/**
	 * Returns the number of adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @return the number of matching adv items
	 */
	@Override
	public int countByG_T(long groupId, long typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_T;

		Object[] finderArgs = new Object[] { groupId, typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(typeId);

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

	private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "advItem.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_TYPEID_2 = "advItem.typeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			AdvItemModelImpl.GROUPID_COLUMN_BITMASK |
			AdvItemModelImpl.STATUS_COLUMN_BITMASK |
			AdvItemModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching adv items
	 */
	@Override
	public List<AdvItem> findByG_S(long groupId, boolean status) {
		return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @return the range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_S(long groupId, boolean status, int start,
		int end) {
		return findByG_S(groupId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_S(long groupId, boolean status, int start,
		int end, OrderByComparator<AdvItem> orderByComparator) {
		return findByG_S(groupId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_S(long groupId, boolean status, int start,
		int end, OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] { groupId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] {
					groupId, status,
					
					start, end, orderByComparator
				};
		}

		List<AdvItem> list = null;

		if (retrieveFromCache) {
			list = (List<AdvItem>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvItem advItem : list) {
					if ((groupId != advItem.getGroupId()) ||
							(status != advItem.getStatus())) {
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				if (!pagination) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_S_First(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_S_First(groupId, status, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_S_First(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator) {
		List<AdvItem> list = findByG_S(groupId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_S_Last(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_S_Last(groupId, status, orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_S_Last(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator) {
		int count = countByG_S(groupId, status);

		if (count == 0) {
			return null;
		}

		List<AdvItem> list = findByG_S(groupId, status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem[] findByG_S_PrevAndNext(long itemId, long groupId,
		boolean status, OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_S_PrevAndNext(session, advItem, groupId, status,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_S_PrevAndNext(session, advItem, groupId, status,
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

	protected AdvItem getByG_S_PrevAndNext(Session session, AdvItem advItem,
		long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_STATUS_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv items where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	@Override
	public void removeByG_S(long groupId, boolean status) {
		for (AdvItem advItem : findByG_S(groupId, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(advItem);
		}
	}

	/**
	 * Returns the number of adv items where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching adv items
	 */
	@Override
	public int countByG_S(long groupId, boolean status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "advItem.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_STATUS_2 = "advItem.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_T_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, AdvItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_T_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			AdvItemModelImpl.GROUPID_COLUMN_BITMASK |
			AdvItemModelImpl.TYPEID_COLUMN_BITMASK |
			AdvItemModelImpl.STATUS_COLUMN_BITMASK |
			AdvItemModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_T_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @return the matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T_S(long groupId, long typeId, boolean status) {
		return findByG_T_S(groupId, typeId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @return the range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T_S(long groupId, long typeId, boolean status,
		int start, int end) {
		return findByG_T_S(groupId, typeId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T_S(long groupId, long typeId, boolean status,
		int start, int end, OrderByComparator<AdvItem> orderByComparator) {
		return findByG_T_S(groupId, typeId, status, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching adv items
	 */
	@Override
	public List<AdvItem> findByG_T_S(long groupId, long typeId, boolean status,
		int start, int end, OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T_S;
			finderArgs = new Object[] { groupId, typeId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T_S;
			finderArgs = new Object[] {
					groupId, typeId, status,
					
					start, end, orderByComparator
				};
		}

		List<AdvItem> list = null;

		if (retrieveFromCache) {
			list = (List<AdvItem>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (AdvItem advItem : list) {
					if ((groupId != advItem.getGroupId()) ||
							(typeId != advItem.getTypeId()) ||
							(status != advItem.getStatus())) {
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_T_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_S_TYPEID_2);

			query.append(_FINDER_COLUMN_G_T_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(typeId);

				qPos.add(status);

				if (!pagination) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_T_S_First(long groupId, long typeId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_T_S_First(groupId, typeId, status,
				orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_T_S_First(long groupId, long typeId,
		boolean status, OrderByComparator<AdvItem> orderByComparator) {
		List<AdvItem> list = findByG_T_S(groupId, typeId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item
	 * @throws NoSuchAdvItemException if a matching adv item could not be found
	 */
	@Override
	public AdvItem findByG_T_S_Last(long groupId, long typeId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByG_T_S_Last(groupId, typeId, status,
				orderByComparator);

		if (advItem != null) {
			return advItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", typeId=");
		msg.append(typeId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAdvItemException(msg.toString());
	}

	/**
	 * Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	 */
	@Override
	public AdvItem fetchByG_T_S_Last(long groupId, long typeId, boolean status,
		OrderByComparator<AdvItem> orderByComparator) {
		int count = countByG_T_S(groupId, typeId, status);

		if (count == 0) {
			return null;
		}

		List<AdvItem> list = findByG_T_S(groupId, typeId, status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem[] findByG_T_S_PrevAndNext(long itemId, long groupId,
		long typeId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws NoSuchAdvItemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_T_S_PrevAndNext(session, advItem, groupId,
					typeId, status, orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_T_S_PrevAndNext(session, advItem, groupId,
					typeId, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AdvItem getByG_T_S_PrevAndNext(Session session, AdvItem advItem,
		long groupId, long typeId, boolean status,
		OrderByComparator<AdvItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_G_T_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_T_S_TYPEID_2);

		query.append(_FINDER_COLUMN_G_T_S_STATUS_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(typeId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the adv items where groupId = &#63; and typeId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 */
	@Override
	public void removeByG_T_S(long groupId, long typeId, boolean status) {
		for (AdvItem advItem : findByG_T_S(groupId, typeId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(advItem);
		}
	}

	/**
	 * Returns the number of adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param typeId the type ID
	 * @param status the status
	 * @return the number of matching adv items
	 */
	@Override
	public int countByG_T_S(long groupId, long typeId, boolean status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_T_S;

		Object[] finderArgs = new Object[] { groupId, typeId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_T_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_S_TYPEID_2);

			query.append(_FINDER_COLUMN_G_T_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(typeId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_G_T_S_GROUPID_2 = "advItem.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_S_TYPEID_2 = "advItem.typeId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_S_STATUS_2 = "advItem.status = ?";

	public AdvItemPersistenceImpl() {
		setModelClass(AdvItem.class);
	}

	/**
	 * Caches the adv item in the entity cache if it is enabled.
	 *
	 * @param advItem the adv item
	 */
	@Override
	public void cacheResult(AdvItem advItem) {
		entityCache.putResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey(), advItem);

		advItem.resetOriginalValues();
	}

	/**
	 * Caches the adv items in the entity cache if it is enabled.
	 *
	 * @param advItems the adv items
	 */
	@Override
	public void cacheResult(List<AdvItem> advItems) {
		for (AdvItem advItem : advItems) {
			if (entityCache.getResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
						AdvItemImpl.class, advItem.getPrimaryKey()) == null) {
				cacheResult(advItem);
			}
			else {
				advItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all adv items.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AdvItemImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the adv item.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AdvItem advItem) {
		entityCache.removeResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AdvItem> advItems) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AdvItem advItem : advItems) {
			entityCache.removeResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
				AdvItemImpl.class, advItem.getPrimaryKey());
		}
	}

	/**
	 * Creates a new adv item with the primary key. Does not add the adv item to the database.
	 *
	 * @param itemId the primary key for the new adv item
	 * @return the new adv item
	 */
	@Override
	public AdvItem create(long itemId) {
		AdvItem advItem = new AdvItemImpl();

		advItem.setNew(true);
		advItem.setPrimaryKey(itemId);

		advItem.setCompanyId(companyProvider.getCompanyId());

		return advItem;
	}

	/**
	 * Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the adv item
	 * @return the adv item that was removed
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem remove(long itemId) throws NoSuchAdvItemException {
		return remove((Serializable)itemId);
	}

	/**
	 * Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the adv item
	 * @return the adv item that was removed
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem remove(Serializable primaryKey)
		throws NoSuchAdvItemException {
		Session session = null;

		try {
			session = openSession();

			AdvItem advItem = (AdvItem)session.get(AdvItemImpl.class, primaryKey);

			if (advItem == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdvItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(advItem);
		}
		catch (NoSuchAdvItemException nsee) {
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
	protected AdvItem removeImpl(AdvItem advItem) {
		advItem = toUnwrappedModel(advItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(advItem)) {
				advItem = (AdvItem)session.get(AdvItemImpl.class,
						advItem.getPrimaryKeyObj());
			}

			if (advItem != null) {
				session.delete(advItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (advItem != null) {
			clearCache(advItem);
		}

		return advItem;
	}

	@Override
	public AdvItem updateImpl(AdvItem advItem) {
		advItem = toUnwrappedModel(advItem);

		boolean isNew = advItem.isNew();

		AdvItemModelImpl advItemModelImpl = (AdvItemModelImpl)advItem;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (advItem.getCreateDate() == null)) {
			if (serviceContext == null) {
				advItem.setCreateDate(now);
			}
			else {
				advItem.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!advItemModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				advItem.setModifiedDate(now);
			}
			else {
				advItem.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (advItem.isNew()) {
				session.save(advItem);

				advItem.setNew(false);
			}
			else {
				advItem = (AdvItem)session.merge(advItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AdvItemModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((advItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advItemModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);

				args = new Object[] { advItemModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G,
					args);
			}

			if ((advItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advItemModelImpl.getOriginalTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T,
					args);

				args = new Object[] { advItemModelImpl.getTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_T,
					args);
			}

			if ((advItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advItemModelImpl.getOriginalGroupId(),
						advItemModelImpl.getOriginalTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
					args);

				args = new Object[] {
						advItemModelImpl.getGroupId(),
						advItemModelImpl.getTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
					args);
			}

			if ((advItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advItemModelImpl.getOriginalGroupId(),
						advItemModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);

				args = new Object[] {
						advItemModelImpl.getGroupId(),
						advItemModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);
			}

			if ((advItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						advItemModelImpl.getOriginalGroupId(),
						advItemModelImpl.getOriginalTypeId(),
						advItemModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T_S,
					args);

				args = new Object[] {
						advItemModelImpl.getGroupId(),
						advItemModelImpl.getTypeId(),
						advItemModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T_S,
					args);
			}
		}

		entityCache.putResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey(), advItem, false);

		advItem.resetOriginalValues();

		return advItem;
	}

	protected AdvItem toUnwrappedModel(AdvItem advItem) {
		if (advItem instanceof AdvItemImpl) {
			return advItem;
		}

		AdvItemImpl advItemImpl = new AdvItemImpl();

		advItemImpl.setNew(advItem.isNew());
		advItemImpl.setPrimaryKey(advItem.getPrimaryKey());

		advItemImpl.setItemId(advItem.getItemId());
		advItemImpl.setCreateDate(advItem.getCreateDate());
		advItemImpl.setModifiedDate(advItem.getModifiedDate());
		advItemImpl.setExpriedDate(advItem.getExpriedDate());
		advItemImpl.setGroupId(advItem.getGroupId());
		advItemImpl.setCompanyId(advItem.getCompanyId());
		advItemImpl.setName(advItem.getName());
		advItemImpl.setDescription(advItem.getDescription());
		advItemImpl.setUrl(advItem.getUrl());
		advItemImpl.setIsTargetBlank(advItem.isIsTargetBlank());
		advItemImpl.setTxtMouseOver(advItem.getTxtMouseOver());
		advItemImpl.setFolderId(advItem.getFolderId());
		advItemImpl.setStatus(advItem.isStatus());
		advItemImpl.setTypeId(advItem.getTypeId());

		return advItemImpl;
	}

	/**
	 * Returns the adv item with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv item
	 * @return the adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAdvItemException {
		AdvItem advItem = fetchByPrimaryKey(primaryKey);

		if (advItem == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAdvItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return advItem;
	}

	/**
	 * Returns the adv item with the primary key or throws a {@link NoSuchAdvItemException} if it could not be found.
	 *
	 * @param itemId the primary key of the adv item
	 * @return the adv item
	 * @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem findByPrimaryKey(long itemId) throws NoSuchAdvItemException {
		return findByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns the adv item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv item
	 * @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
				AdvItemImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AdvItem advItem = (AdvItem)serializable;

		if (advItem == null) {
			Session session = null;

			try {
				session = openSession();

				advItem = (AdvItem)session.get(AdvItemImpl.class, primaryKey);

				if (advItem != null) {
					cacheResult(advItem);
				}
				else {
					entityCache.putResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
						AdvItemImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
					AdvItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return advItem;
	}

	/**
	 * Returns the adv item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the adv item
	 * @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	 */
	@Override
	public AdvItem fetchByPrimaryKey(long itemId) {
		return fetchByPrimaryKey((Serializable)itemId);
	}

	@Override
	public Map<Serializable, AdvItem> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AdvItem> map = new HashMap<Serializable, AdvItem>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AdvItem advItem = fetchByPrimaryKey(primaryKey);

			if (advItem != null) {
				map.put(primaryKey, advItem);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
					AdvItemImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AdvItem)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ADVITEM_WHERE_PKS_IN);

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

			for (AdvItem advItem : (List<AdvItem>)q.list()) {
				map.put(advItem.getPrimaryKeyObj(), advItem);

				cacheResult(advItem);

				uncachedPrimaryKeys.remove(advItem.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
					AdvItemImpl.class, primaryKey, nullModel);
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
	 * Returns all the adv items.
	 *
	 * @return the adv items
	 */
	@Override
	public List<AdvItem> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the adv items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @return the range of adv items
	 */
	@Override
	public List<AdvItem> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the adv items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of adv items
	 */
	@Override
	public List<AdvItem> findAll(int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the adv items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv items
	 * @param end the upper bound of the range of adv items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of adv items
	 */
	@Override
	public List<AdvItem> findAll(int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
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

		List<AdvItem> list = null;

		if (retrieveFromCache) {
			list = (List<AdvItem>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ADVITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVITEM;

				if (pagination) {
					sql = sql.concat(AdvItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the adv items from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AdvItem advItem : findAll()) {
			remove(advItem);
		}
	}

	/**
	 * Returns the number of adv items.
	 *
	 * @return the number of adv items
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADVITEM);

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
		return AdvItemModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the adv item persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AdvItemImpl.class.getName());
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
	private static final String _SQL_SELECT_ADVITEM = "SELECT advItem FROM AdvItem advItem";
	private static final String _SQL_SELECT_ADVITEM_WHERE_PKS_IN = "SELECT advItem FROM AdvItem advItem WHERE itemId IN (";
	private static final String _SQL_SELECT_ADVITEM_WHERE = "SELECT advItem FROM AdvItem advItem WHERE ";
	private static final String _SQL_COUNT_ADVITEM = "SELECT COUNT(advItem) FROM AdvItem advItem";
	private static final String _SQL_COUNT_ADVITEM_WHERE = "SELECT COUNT(advItem) FROM AdvItem advItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AdvItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AdvItem exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AdvItemPersistenceImpl.class);
}