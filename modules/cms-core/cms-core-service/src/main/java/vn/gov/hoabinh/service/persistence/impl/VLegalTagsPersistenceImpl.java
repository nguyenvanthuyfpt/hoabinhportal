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

import vn.gov.hoabinh.exception.NoSuchVLegalTagsException;
import vn.gov.hoabinh.model.VLegalTags;
import vn.gov.hoabinh.model.impl.VLegalTagsImpl;
import vn.gov.hoabinh.model.impl.VLegalTagsModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalTagsPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the v legal tags service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTagsPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalTagsUtil
 * @generated
 */
@ProviderType
public class VLegalTagsPersistenceImpl extends BasePersistenceImpl<VLegalTags>
	implements VLegalTagsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalTagsUtil} to access the v legal tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalTagsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, VLegalTagsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, VLegalTagsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, VLegalTagsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, VLegalTagsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalTagsModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalTagsModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal tagses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal tagses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @return the range of matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal tagses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalTags> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal tagses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalTags> orderByComparator,
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

		List<VLegalTags> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalTags>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalTags vLegalTags : list) {
					if ((groupId != vLegalTags.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal tags in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal tags
	 * @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags findByGroupId_First(long groupId,
		OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = fetchByGroupId_First(groupId, orderByComparator);

		if (vLegalTags != null) {
			return vLegalTags;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTagsException(msg.toString());
	}

	/**
	 * Returns the first v legal tags in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalTags> orderByComparator) {
		List<VLegalTags> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal tags in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal tags
	 * @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags findByGroupId_Last(long groupId,
		OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = fetchByGroupId_Last(groupId, orderByComparator);

		if (vLegalTags != null) {
			return vLegalTags;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTagsException(msg.toString());
	}

	/**
	 * Returns the last v legal tags in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalTags> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalTags> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63;.
	 *
	 * @param tagId the primary key of the current v legal tags
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal tags
	 * @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags[] findByGroupId_PrevAndNext(String tagId, long groupId,
		OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = findByPrimaryKey(tagId);

		Session session = null;

		try {
			session = openSession();

			VLegalTags[] array = new VLegalTagsImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalTags, groupId,
					orderByComparator, true);

			array[1] = vLegalTags;

			array[2] = getByGroupId_PrevAndNext(session, vLegalTags, groupId,
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

	protected VLegalTags getByGroupId_PrevAndNext(Session session,
		VLegalTags vLegalTags, long groupId,
		OrderByComparator<VLegalTags> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

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
			query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalTags);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTags> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal tagses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalTags vLegalTags : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalTags);
		}
	}

	/**
	 * Returns the number of v legal tagses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal tagses
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTAGS_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalTags.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, VLegalTagsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, VLegalTagsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VLegalTagsModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalTagsModelImpl.STATUSTAGS_COLUMN_BITMASK |
			VLegalTagsModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @return the matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags) {
		return findByP_S(groupId, statusTags, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @return the range of matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end) {
		return findByP_S(groupId, statusTags, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end, OrderByComparator<VLegalTags> orderByComparator) {
		return findByP_S(groupId, statusTags, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal tagses
	 */
	@Override
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end, OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S;
			finderArgs = new Object[] { groupId, statusTags };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S;
			finderArgs = new Object[] {
					groupId, statusTags,
					
					start, end, orderByComparator
				};
		}

		List<VLegalTags> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalTags>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalTags vLegalTags : list) {
					if ((groupId != vLegalTags.getGroupId()) ||
							(statusTags != vLegalTags.getStatusTags())) {
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

			query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

			query.append(_FINDER_COLUMN_P_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_STATUSTAGS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusTags);

				if (!pagination) {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal tags
	 * @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags findByP_S_First(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = fetchByP_S_First(groupId, statusTags,
				orderByComparator);

		if (vLegalTags != null) {
			return vLegalTags;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusTags=");
		msg.append(statusTags);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTagsException(msg.toString());
	}

	/**
	 * Returns the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags fetchByP_S_First(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator) {
		List<VLegalTags> list = findByP_S(groupId, statusTags, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal tags
	 * @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags findByP_S_Last(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = fetchByP_S_Last(groupId, statusTags,
				orderByComparator);

		if (vLegalTags != null) {
			return vLegalTags;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusTags=");
		msg.append(statusTags);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalTagsException(msg.toString());
	}

	/**
	 * Returns the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	 */
	@Override
	public VLegalTags fetchByP_S_Last(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator) {
		int count = countByP_S(groupId, statusTags);

		if (count == 0) {
			return null;
		}

		List<VLegalTags> list = findByP_S(groupId, statusTags, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param tagId the primary key of the current v legal tags
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal tags
	 * @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags[] findByP_S_PrevAndNext(String tagId, long groupId,
		boolean statusTags, OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = findByPrimaryKey(tagId);

		Session session = null;

		try {
			session = openSession();

			VLegalTags[] array = new VLegalTagsImpl[3];

			array[0] = getByP_S_PrevAndNext(session, vLegalTags, groupId,
					statusTags, orderByComparator, true);

			array[1] = vLegalTags;

			array[2] = getByP_S_PrevAndNext(session, vLegalTags, groupId,
					statusTags, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalTags getByP_S_PrevAndNext(Session session,
		VLegalTags vLegalTags, long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

		query.append(_FINDER_COLUMN_P_S_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_STATUSTAGS_2);

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
			query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusTags);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalTags);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTags> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal tagses where groupId = &#63; and statusTags = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 */
	@Override
	public void removeByP_S(long groupId, boolean statusTags) {
		for (VLegalTags vLegalTags : findByP_S(groupId, statusTags,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalTags);
		}
	}

	/**
	 * Returns the number of v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusTags the status tags
	 * @return the number of matching v legal tagses
	 */
	@Override
	public int countByP_S(long groupId, boolean statusTags) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S;

		Object[] finderArgs = new Object[] { groupId, statusTags };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALTAGS_WHERE);

			query.append(_FINDER_COLUMN_P_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_STATUSTAGS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusTags);

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

	private static final String _FINDER_COLUMN_P_S_GROUPID_2 = "vLegalTags.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_STATUSTAGS_2 = "vLegalTags.statusTags = ?";

	public VLegalTagsPersistenceImpl() {
		setModelClass(VLegalTags.class);
	}

	/**
	 * Caches the v legal tags in the entity cache if it is enabled.
	 *
	 * @param vLegalTags the v legal tags
	 */
	@Override
	public void cacheResult(VLegalTags vLegalTags) {
		entityCache.putResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey(), vLegalTags);

		vLegalTags.resetOriginalValues();
	}

	/**
	 * Caches the v legal tagses in the entity cache if it is enabled.
	 *
	 * @param vLegalTagses the v legal tagses
	 */
	@Override
	public void cacheResult(List<VLegalTags> vLegalTagses) {
		for (VLegalTags vLegalTags : vLegalTagses) {
			if (entityCache.getResult(
						VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTagsImpl.class, vLegalTags.getPrimaryKey()) == null) {
				cacheResult(vLegalTags);
			}
			else {
				vLegalTags.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal tagses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalTagsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal tags.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalTags vLegalTags) {
		entityCache.removeResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalTags> vLegalTagses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalTags vLegalTags : vLegalTagses) {
			entityCache.removeResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTagsImpl.class, vLegalTags.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	 *
	 * @param tagId the primary key for the new v legal tags
	 * @return the new v legal tags
	 */
	@Override
	public VLegalTags create(String tagId) {
		VLegalTags vLegalTags = new VLegalTagsImpl();

		vLegalTags.setNew(true);
		vLegalTags.setPrimaryKey(tagId);

		vLegalTags.setCompanyId(companyProvider.getCompanyId());

		return vLegalTags;
	}

	/**
	 * Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tagId the primary key of the v legal tags
	 * @return the v legal tags that was removed
	 * @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags remove(String tagId) throws NoSuchVLegalTagsException {
		return remove((Serializable)tagId);
	}

	/**
	 * Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal tags
	 * @return the v legal tags that was removed
	 * @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags remove(Serializable primaryKey)
		throws NoSuchVLegalTagsException {
		Session session = null;

		try {
			session = openSession();

			VLegalTags vLegalTags = (VLegalTags)session.get(VLegalTagsImpl.class,
					primaryKey);

			if (vLegalTags == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalTags);
		}
		catch (NoSuchVLegalTagsException nsee) {
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
	protected VLegalTags removeImpl(VLegalTags vLegalTags) {
		vLegalTags = toUnwrappedModel(vLegalTags);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalTags)) {
				vLegalTags = (VLegalTags)session.get(VLegalTagsImpl.class,
						vLegalTags.getPrimaryKeyObj());
			}

			if (vLegalTags != null) {
				session.delete(vLegalTags);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalTags != null) {
			clearCache(vLegalTags);
		}

		return vLegalTags;
	}

	@Override
	public VLegalTags updateImpl(VLegalTags vLegalTags) {
		vLegalTags = toUnwrappedModel(vLegalTags);

		boolean isNew = vLegalTags.isNew();

		VLegalTagsModelImpl vLegalTagsModelImpl = (VLegalTagsModelImpl)vLegalTags;

		Session session = null;

		try {
			session = openSession();

			if (vLegalTags.isNew()) {
				session.save(vLegalTags);

				vLegalTags.setNew(false);
			}
			else {
				vLegalTags = (VLegalTags)session.merge(vLegalTags);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalTagsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalTagsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTagsModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalTagsModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalTagsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalTagsModelImpl.getOriginalGroupId(),
						vLegalTagsModelImpl.getOriginalStatusTags()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S,
					args);

				args = new Object[] {
						vLegalTagsModelImpl.getGroupId(),
						vLegalTagsModelImpl.getStatusTags()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S,
					args);
			}
		}

		entityCache.putResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey(), vLegalTags, false);

		vLegalTags.resetOriginalValues();

		return vLegalTags;
	}

	protected VLegalTags toUnwrappedModel(VLegalTags vLegalTags) {
		if (vLegalTags instanceof VLegalTagsImpl) {
			return vLegalTags;
		}

		VLegalTagsImpl vLegalTagsImpl = new VLegalTagsImpl();

		vLegalTagsImpl.setNew(vLegalTags.isNew());
		vLegalTagsImpl.setPrimaryKey(vLegalTags.getPrimaryKey());

		vLegalTagsImpl.setTagId(vLegalTags.getTagId());
		vLegalTagsImpl.setGroupId(vLegalTags.getGroupId());
		vLegalTagsImpl.setCompanyId(vLegalTags.getCompanyId());
		vLegalTagsImpl.setUserId(vLegalTags.getUserId());
		vLegalTagsImpl.setCreatedDate(vLegalTags.getCreatedDate());
		vLegalTagsImpl.setModifiedDate(vLegalTags.getModifiedDate());
		vLegalTagsImpl.setName(vLegalTags.getName());
		vLegalTagsImpl.setStatusTags(vLegalTags.isStatusTags());

		return vLegalTagsImpl;
	}

	/**
	 * Returns the v legal tags with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal tags
	 * @return the v legal tags
	 * @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalTagsException {
		VLegalTags vLegalTags = fetchByPrimaryKey(primaryKey);

		if (vLegalTags == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalTags;
	}

	/**
	 * Returns the v legal tags with the primary key or throws a {@link NoSuchVLegalTagsException} if it could not be found.
	 *
	 * @param tagId the primary key of the v legal tags
	 * @return the v legal tags
	 * @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags findByPrimaryKey(String tagId)
		throws NoSuchVLegalTagsException {
		return findByPrimaryKey((Serializable)tagId);
	}

	/**
	 * Returns the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal tags
	 * @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTagsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalTags vLegalTags = (VLegalTags)serializable;

		if (vLegalTags == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalTags = (VLegalTags)session.get(VLegalTagsImpl.class,
						primaryKey);

				if (vLegalTags != null) {
					cacheResult(vLegalTags);
				}
				else {
					entityCache.putResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTagsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTagsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalTags;
	}

	/**
	 * Returns the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tagId the primary key of the v legal tags
	 * @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	 */
	@Override
	public VLegalTags fetchByPrimaryKey(String tagId) {
		return fetchByPrimaryKey((Serializable)tagId);
	}

	@Override
	public Map<Serializable, VLegalTags> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalTags> map = new HashMap<Serializable, VLegalTags>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalTags vLegalTags = fetchByPrimaryKey(primaryKey);

			if (vLegalTags != null) {
				map.put(primaryKey, vLegalTags);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTagsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalTags)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALTAGS_WHERE_PKS_IN);

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

			for (VLegalTags vLegalTags : (List<VLegalTags>)q.list()) {
				map.put(vLegalTags.getPrimaryKeyObj(), vLegalTags);

				cacheResult(vLegalTags);

				uncachedPrimaryKeys.remove(vLegalTags.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
					VLegalTagsImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal tagses.
	 *
	 * @return the v legal tagses
	 */
	@Override
	public List<VLegalTags> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal tagses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @return the range of v legal tagses
	 */
	@Override
	public List<VLegalTags> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal tagses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal tagses
	 */
	@Override
	public List<VLegalTags> findAll(int start, int end,
		OrderByComparator<VLegalTags> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal tagses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal tagses
	 * @param end the upper bound of the range of v legal tagses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal tagses
	 */
	@Override
	public List<VLegalTags> findAll(int start, int end,
		OrderByComparator<VLegalTags> orderByComparator,
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

		List<VLegalTags> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalTags>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALTAGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALTAGS;

				if (pagination) {
					sql = sql.concat(VLegalTagsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal tagses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalTags vLegalTags : findAll()) {
			remove(vLegalTags);
		}
	}

	/**
	 * Returns the number of v legal tagses.
	 *
	 * @return the number of v legal tagses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALTAGS);

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
		return VLegalTagsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal tags persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalTagsImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALTAGS = "SELECT vLegalTags FROM VLegalTags vLegalTags";
	private static final String _SQL_SELECT_VLEGALTAGS_WHERE_PKS_IN = "SELECT vLegalTags FROM VLegalTags vLegalTags WHERE tagId IN (";
	private static final String _SQL_SELECT_VLEGALTAGS_WHERE = "SELECT vLegalTags FROM VLegalTags vLegalTags WHERE ";
	private static final String _SQL_COUNT_VLEGALTAGS = "SELECT COUNT(vLegalTags) FROM VLegalTags vLegalTags";
	private static final String _SQL_COUNT_VLEGALTAGS_WHERE = "SELECT COUNT(vLegalTags) FROM VLegalTags vLegalTags WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalTags.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalTags exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalTags exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalTagsPersistenceImpl.class);
}