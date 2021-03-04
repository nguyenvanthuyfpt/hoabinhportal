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

import vn.gov.hoabinh.exception.NoSuchVLegalOrgException;
import vn.gov.hoabinh.model.VLegalOrg;
import vn.gov.hoabinh.model.impl.VLegalOrgImpl;
import vn.gov.hoabinh.model.impl.VLegalOrgModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalOrgPersistence;

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
 * The persistence implementation for the v legal org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrgPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalOrgUtil
 * @generated
 */
@ProviderType
public class VLegalOrgPersistenceImpl extends BasePersistenceImpl<VLegalOrg>
	implements VLegalOrgPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalOrgUtil} to access the v legal org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalOrgImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal orgs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
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

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalOrg vLegalOrg : list) {
					if ((groupId != vLegalOrg.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal org in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByGroupId_First(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByGroupId_First(groupId, orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the first v legal org in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator) {
		List<VLegalOrg> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByGroupId_Last(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByGroupId_Last(groupId, orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalOrg> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63;.
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg[] findByGroupId_PrevAndNext(String orgId, long groupId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalOrg, groupId,
					orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByGroupId_PrevAndNext(session, vLegalOrg, groupId,
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

	protected VLegalOrg getByGroupId_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId,
		OrderByComparator<VLegalOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalOrg vLegalOrg : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalOrg.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L(long groupId, String language, int start,
		int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<VLegalOrg> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalOrg vLegalOrg : list) {
					if ((groupId != vLegalOrg.getGroupId()) ||
							!Objects.equals(language, vLegalOrg.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_L_First(long groupId, String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_L_First(long groupId, String language,
		OrderByComparator<VLegalOrg> orderByComparator) {
		List<VLegalOrg> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_L_Last(long groupId, String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_L_Last(long groupId, String language,
		OrderByComparator<VLegalOrg> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VLegalOrg> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg[] findByG_L_PrevAndNext(String orgId, long groupId,
		String language, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vLegalOrg, groupId,
					language, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByG_L_PrevAndNext(session, vLegalOrg, groupId,
					language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByG_L_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, String language,
		OrderByComparator<VLegalOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (VLegalOrg vLegalOrg : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vLegalOrg.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vLegalOrg.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_O = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_O",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.ORGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_O = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_O",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal org where groupId = &#63; and orgId = &#63; or throws a {@link NoSuchVLegalOrgException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @return the matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_O(long groupId, String orgId)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_O(groupId, orgId);

		if (vLegalOrg == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalOrgException(msg.toString());
		}

		return vLegalOrg;
	}

	/**
	 * Returns the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_O(long groupId, String orgId) {
		return fetchByG_O(groupId, orgId, true);
	}

	/**
	 * Returns the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_O(long groupId, String orgId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, orgId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_O,
					finderArgs, this);
		}

		if (result instanceof VLegalOrg) {
			VLegalOrg vLegalOrg = (VLegalOrg)result;

			if ((groupId != vLegalOrg.getGroupId()) ||
					!Objects.equals(orgId, vLegalOrg.getOrgId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_O_GROUPID_2);

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_O_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_O_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_O_ORGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindOrgId) {
					qPos.add(orgId);
				}

				List<VLegalOrg> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_O, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalOrgPersistenceImpl.fetchByG_O(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalOrg vLegalOrg = list.get(0);

					result = vLegalOrg;

					cacheResult(vLegalOrg);

					if ((vLegalOrg.getGroupId() != groupId) ||
							(vLegalOrg.getOrgId() == null) ||
							!vLegalOrg.getOrgId().equals(orgId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_O,
							finderArgs, vLegalOrg);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_O, finderArgs);

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
			return (VLegalOrg)result;
		}
	}

	/**
	 * Removes the v legal org where groupId = &#63; and orgId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @return the v legal org that was removed
	 */
	@Override
	public VLegalOrg removeByG_O(long groupId, String orgId)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByG_O(groupId, orgId);

		return remove(vLegalOrg);
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orgId the org ID
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByG_O(long groupId, String orgId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_O;

		Object[] finderArgs = new Object[] { groupId, orgId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_O_GROUPID_2);

			boolean bindOrgId = false;

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_O_ORGID_1);
			}
			else if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_O_ORGID_3);
			}
			else {
				bindOrgId = true;

				query.append(_FINDER_COLUMN_G_O_ORGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindOrgId) {
					qPos.add(orgId);
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

	private static final String _FINDER_COLUMN_G_O_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_O_ORGID_1 = "vLegalOrg.orgId IS NULL";
	private static final String _FINDER_COLUMN_G_O_ORGID_2 = "vLegalOrg.orgId = ?";
	private static final String _FINDER_COLUMN_G_O_ORGID_3 = "(vLegalOrg.orgId IS NULL OR vLegalOrg.orgId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			},
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.STATUSORG_COLUMN_BITMASK |
			VLegalOrgModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @return the matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language) {
		return findByS_L(groupId, statusOrg, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language, int start, int end) {
		return findByS_L(groupId, statusOrg, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return findByS_L(groupId, statusOrg, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L;
			finderArgs = new Object[] { groupId, statusOrg, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_L;
			finderArgs = new Object[] {
					groupId, statusOrg, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalOrg vLegalOrg : list) {
					if ((groupId != vLegalOrg.getGroupId()) ||
							(statusOrg != vLegalOrg.getStatusOrg()) ||
							!Objects.equals(language, vLegalOrg.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSORG_2);

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
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByS_L_First(long groupId, boolean statusOrg,
		String language, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByS_L_First(groupId, statusOrg, language,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusOrg=");
		msg.append(statusOrg);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByS_L_First(long groupId, boolean statusOrg,
		String language, OrderByComparator<VLegalOrg> orderByComparator) {
		List<VLegalOrg> list = findByS_L(groupId, statusOrg, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByS_L_Last(long groupId, boolean statusOrg,
		String language, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByS_L_Last(groupId, statusOrg, language,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusOrg=");
		msg.append(statusOrg);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByS_L_Last(long groupId, boolean statusOrg,
		String language, OrderByComparator<VLegalOrg> orderByComparator) {
		int count = countByS_L(groupId, statusOrg, language);

		if (count == 0) {
			return null;
		}

		List<VLegalOrg> list = findByS_L(groupId, statusOrg, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg[] findByS_L_PrevAndNext(String orgId, long groupId,
		boolean statusOrg, String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, language, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByS_L_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByS_L_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, boolean statusOrg, String language,
		OrderByComparator<VLegalOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_S_L_STATUSORG_2);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusOrg);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 */
	@Override
	public void removeByS_L(long groupId, boolean statusOrg, String language) {
		for (VLegalOrg vLegalOrg : findByS_L(groupId, statusOrg, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param language the language
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByS_L(long groupId, boolean statusOrg, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_L;

		Object[] finderArgs = new Object[] { groupId, statusOrg, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSORG_2);

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

				qPos.add(statusOrg);

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

	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_STATUSORG_2 = "vLegalOrg.statusOrg = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vLegalOrg.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vLegalOrg.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_S_RSS = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			},
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.STATUSORG_COLUMN_BITMASK |
			VLegalOrgModelImpl.RSSABLE_COLUMN_BITMASK |
			VLegalOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_RSS = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @return the matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable) {
		return findByS_Rss(groupId, statusOrg, rssable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end) {
		return findByS_Rss(groupId, statusOrg, rssable, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return findByS_Rss(groupId, statusOrg, rssable, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS;
			finderArgs = new Object[] { groupId, statusOrg, rssable };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_S_RSS;
			finderArgs = new Object[] {
					groupId, statusOrg, rssable,
					
					start, end, orderByComparator
				};
		}

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalOrg vLegalOrg : list) {
					if ((groupId != vLegalOrg.getGroupId()) ||
							(statusOrg != vLegalOrg.getStatusOrg()) ||
							(rssable != vLegalOrg.getRssable())) {
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSORG_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

				qPos.add(rssable);

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByS_Rss_First(groupId, statusOrg, rssable,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusOrg=");
		msg.append(statusOrg);

		msg.append(", rssable=");
		msg.append(rssable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator) {
		List<VLegalOrg> list = findByS_Rss(groupId, statusOrg, rssable, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByS_Rss_Last(groupId, statusOrg, rssable,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", statusOrg=");
		msg.append(statusOrg);

		msg.append(", rssable=");
		msg.append(rssable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator) {
		int count = countByS_Rss(groupId, statusOrg, rssable);

		if (count == 0) {
			return null;
		}

		List<VLegalOrg> list = findByS_Rss(groupId, statusOrg, rssable,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg[] findByS_Rss_PrevAndNext(String orgId, long groupId,
		boolean statusOrg, boolean rssable,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByS_Rss_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, rssable, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByS_Rss_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, rssable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByS_Rss_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, boolean statusOrg, boolean rssable,
		OrderByComparator<VLegalOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

		query.append(_FINDER_COLUMN_S_RSS_STATUSORG_2);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusOrg);

		qPos.add(rssable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 */
	@Override
	public void removeByS_Rss(long groupId, boolean statusOrg, boolean rssable) {
		for (VLegalOrg vLegalOrg : findByS_Rss(groupId, statusOrg, rssable,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param statusOrg the status org
	 * @param rssable the rssable
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByS_Rss(long groupId, boolean statusOrg, boolean rssable) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_RSS;

		Object[] finderArgs = new Object[] { groupId, statusOrg, rssable };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSORG_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

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

	private static final String _FINDER_COLUMN_S_RSS_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_STATUSORG_2 = "vLegalOrg.statusOrg = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_RSSABLE_2 = "vLegalOrg.rssable = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalOrgModelImpl.PARENTID_COLUMN_BITMASK |
			VLegalOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @return the matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId) {
		return findByG_L_P(groupId, language, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end) {
		return findByG_L_P(groupId, language, parentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P;
			finderArgs = new Object[] { groupId, language, parentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P;
			finderArgs = new Object[] {
					groupId, language, parentId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalOrg vLegalOrg : list) {
					if ((groupId != vLegalOrg.getGroupId()) ||
							!Objects.equals(language, vLegalOrg.getLanguage()) ||
							!Objects.equals(parentId, vLegalOrg.getParentId())) {
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindParentId) {
					qPos.add(parentId);
				}

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_L_P_First(groupId, language, parentId,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator<VLegalOrg> orderByComparator) {
		List<VLegalOrg> list = findByG_L_P(groupId, language, parentId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_L_P_Last(groupId, language, parentId,
				orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator<VLegalOrg> orderByComparator) {
		int count = countByG_L_P(groupId, language, parentId);

		if (count == 0) {
			return null;
		}

		List<VLegalOrg> list = findByG_L_P(groupId, language, parentId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg[] findByG_L_P_PrevAndNext(String orgId, long groupId,
		String language, String parentId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByG_L_P_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByG_L_P_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, String language, String parentId,
		OrderByComparator<VLegalOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
		}

		boolean bindParentId = false;

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
		}
		else if (parentId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
		}
		else {
			bindParentId = true;

			query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (bindParentId) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 */
	@Override
	public void removeByG_L_P(long groupId, String language, String parentId) {
		for (VLegalOrg vLegalOrg : findByG_L_P(groupId, language, parentId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByG_L_P(long groupId, String language, String parentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_P;

		Object[] finderArgs = new Object[] { groupId, language, parentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindParentId) {
					qPos.add(parentId);
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

	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "vLegalOrg.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "vLegalOrg.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_1 = "vLegalOrg.parentId IS NULL";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_2 = "vLegalOrg.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_3 = "(vLegalOrg.parentId IS NULL OR vLegalOrg.parentId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P_S = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_P_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_S =
		new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, VLegalOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_P_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Boolean.class.getName()
			},
			VLegalOrgModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalOrgModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalOrgModelImpl.PARENTID_COLUMN_BITMASK |
			VLegalOrgModelImpl.STATUSORG_COLUMN_BITMASK |
			VLegalOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P_S = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_P_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @return the matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg) {
		return findByG_L_P_S(groupId, language, parentId, statusOrg,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg, int start, int end) {
		return findByG_L_P_S(groupId, language, parentId, statusOrg, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return findByG_L_P_S(groupId, language, parentId, statusOrg, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal orgs
	 */
	@Override
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_S;
			finderArgs = new Object[] { groupId, language, parentId, statusOrg };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P_S;
			finderArgs = new Object[] {
					groupId, language, parentId, statusOrg,
					
					start, end, orderByComparator
				};
		}

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalOrg vLegalOrg : list) {
					if ((groupId != vLegalOrg.getGroupId()) ||
							!Objects.equals(language, vLegalOrg.getLanguage()) ||
							!Objects.equals(parentId, vLegalOrg.getParentId()) ||
							(statusOrg != vLegalOrg.getStatusOrg())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_2);
			}

			query.append(_FINDER_COLUMN_G_L_P_S_STATUSORG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindParentId) {
					qPos.add(parentId);
				}

				qPos.add(statusOrg);

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_L_P_S_First(long groupId, String language,
		String parentId, boolean statusOrg,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_L_P_S_First(groupId, language, parentId,
				statusOrg, orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(", statusOrg=");
		msg.append(statusOrg);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_L_P_S_First(long groupId, String language,
		String parentId, boolean statusOrg,
		OrderByComparator<VLegalOrg> orderByComparator) {
		List<VLegalOrg> list = findByG_L_P_S(groupId, language, parentId,
				statusOrg, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org
	 * @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg findByG_L_P_S_Last(long groupId, String language,
		String parentId, boolean statusOrg,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByG_L_P_S_Last(groupId, language, parentId,
				statusOrg, orderByComparator);

		if (vLegalOrg != null) {
			return vLegalOrg;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(", statusOrg=");
		msg.append(statusOrg);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalOrgException(msg.toString());
	}

	/**
	 * Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 */
	@Override
	public VLegalOrg fetchByG_L_P_S_Last(long groupId, String language,
		String parentId, boolean statusOrg,
		OrderByComparator<VLegalOrg> orderByComparator) {
		int count = countByG_L_P_S(groupId, language, parentId, statusOrg);

		if (count == 0) {
			return null;
		}

		List<VLegalOrg> list = findByG_L_P_S(groupId, language, parentId,
				statusOrg, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg[] findByG_L_P_S_PrevAndNext(String orgId, long groupId,
		String language, String parentId, boolean statusOrg,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByG_L_P_S_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, statusOrg, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByG_L_P_S_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, statusOrg, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByG_L_P_S_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, String language, String parentId,
		boolean statusOrg, OrderByComparator<VLegalOrg> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_2);
		}

		boolean bindParentId = false;

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_1);
		}
		else if (parentId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_3);
		}
		else {
			bindParentId = true;

			query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_2);
		}

		query.append(_FINDER_COLUMN_G_L_P_S_STATUSORG_2);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (bindParentId) {
			qPos.add(parentId);
		}

		qPos.add(statusOrg);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 */
	@Override
	public void removeByG_L_P_S(long groupId, String language, String parentId,
		boolean statusOrg) {
		for (VLegalOrg vLegalOrg : findByG_L_P_S(groupId, language, parentId,
				statusOrg, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param statusOrg the status org
	 * @return the number of matching v legal orgs
	 */
	@Override
	public int countByG_L_P_S(long groupId, String language, String parentId,
		boolean statusOrg) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_P_S;

		Object[] finderArgs = new Object[] {
				groupId, language, parentId, statusOrg
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_2);
			}

			query.append(_FINDER_COLUMN_G_L_P_S_STATUSORG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (bindParentId) {
					qPos.add(parentId);
				}

				qPos.add(statusOrg);

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

	private static final String _FINDER_COLUMN_G_L_P_S_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_LANGUAGE_1 = "vLegalOrg.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_LANGUAGE_2 = "vLegalOrg.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_PARENTID_1 = "vLegalOrg.parentId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_PARENTID_2 = "vLegalOrg.parentId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_PARENTID_3 = "(vLegalOrg.parentId IS NULL OR vLegalOrg.parentId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_STATUSORG_2 = "vLegalOrg.statusOrg = ?";

	public VLegalOrgPersistenceImpl() {
		setModelClass(VLegalOrg.class);
	}

	/**
	 * Caches the v legal org in the entity cache if it is enabled.
	 *
	 * @param vLegalOrg the v legal org
	 */
	@Override
	public void cacheResult(VLegalOrg vLegalOrg) {
		entityCache.putResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey(), vLegalOrg);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_O,
			new Object[] { vLegalOrg.getGroupId(), vLegalOrg.getOrgId() },
			vLegalOrg);

		vLegalOrg.resetOriginalValues();
	}

	/**
	 * Caches the v legal orgs in the entity cache if it is enabled.
	 *
	 * @param vLegalOrgs the v legal orgs
	 */
	@Override
	public void cacheResult(List<VLegalOrg> vLegalOrgs) {
		for (VLegalOrg vLegalOrg : vLegalOrgs) {
			if (entityCache.getResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
						VLegalOrgImpl.class, vLegalOrg.getPrimaryKey()) == null) {
				cacheResult(vLegalOrg);
			}
			else {
				vLegalOrg.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal orgs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalOrgImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal org.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalOrg vLegalOrg) {
		entityCache.removeResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalOrgModelImpl)vLegalOrg);
	}

	@Override
	public void clearCache(List<VLegalOrg> vLegalOrgs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalOrg vLegalOrg : vLegalOrgs) {
			entityCache.removeResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
				VLegalOrgImpl.class, vLegalOrg.getPrimaryKey());

			clearUniqueFindersCache((VLegalOrgModelImpl)vLegalOrg);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalOrgModelImpl vLegalOrgModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalOrgModelImpl.getGroupId(),
					vLegalOrgModelImpl.getOrgId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_O, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_O, args,
				vLegalOrgModelImpl);
		}
		else {
			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getGroupId(),
						vLegalOrgModelImpl.getOrgId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_O, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_O, args,
					vLegalOrgModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalOrgModelImpl vLegalOrgModelImpl) {
		Object[] args = new Object[] {
				vLegalOrgModelImpl.getGroupId(), vLegalOrgModelImpl.getOrgId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_O, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_O, args);

		if ((vLegalOrgModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_O.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalOrgModelImpl.getOriginalGroupId(),
					vLegalOrgModelImpl.getOriginalOrgId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_O, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_O, args);
		}
	}

	/**
	 * Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	 *
	 * @param orgId the primary key for the new v legal org
	 * @return the new v legal org
	 */
	@Override
	public VLegalOrg create(String orgId) {
		VLegalOrg vLegalOrg = new VLegalOrgImpl();

		vLegalOrg.setNew(true);
		vLegalOrg.setPrimaryKey(orgId);

		vLegalOrg.setCompanyId(companyProvider.getCompanyId());

		return vLegalOrg;
	}

	/**
	 * Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgId the primary key of the v legal org
	 * @return the v legal org that was removed
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg remove(String orgId) throws NoSuchVLegalOrgException {
		return remove((Serializable)orgId);
	}

	/**
	 * Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal org
	 * @return the v legal org that was removed
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg remove(Serializable primaryKey)
		throws NoSuchVLegalOrgException {
		Session session = null;

		try {
			session = openSession();

			VLegalOrg vLegalOrg = (VLegalOrg)session.get(VLegalOrgImpl.class,
					primaryKey);

			if (vLegalOrg == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalOrgException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalOrg);
		}
		catch (NoSuchVLegalOrgException nsee) {
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
	protected VLegalOrg removeImpl(VLegalOrg vLegalOrg) {
		vLegalOrg = toUnwrappedModel(vLegalOrg);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalOrg)) {
				vLegalOrg = (VLegalOrg)session.get(VLegalOrgImpl.class,
						vLegalOrg.getPrimaryKeyObj());
			}

			if (vLegalOrg != null) {
				session.delete(vLegalOrg);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalOrg != null) {
			clearCache(vLegalOrg);
		}

		return vLegalOrg;
	}

	@Override
	public VLegalOrg updateImpl(VLegalOrg vLegalOrg) {
		vLegalOrg = toUnwrappedModel(vLegalOrg);

		boolean isNew = vLegalOrg.isNew();

		VLegalOrgModelImpl vLegalOrgModelImpl = (VLegalOrgModelImpl)vLegalOrg;

		Session session = null;

		try {
			session = openSession();

			if (vLegalOrg.isNew()) {
				session.save(vLegalOrg);

				vLegalOrg.setNew(false);
			}
			else {
				vLegalOrg = (VLegalOrg)session.merge(vLegalOrg);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalOrgModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalOrgModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getOriginalGroupId(),
						vLegalOrgModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vLegalOrgModelImpl.getGroupId(),
						vLegalOrgModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getOriginalGroupId(),
						vLegalOrgModelImpl.getOriginalStatusOrg(),
						vLegalOrgModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L,
					args);

				args = new Object[] {
						vLegalOrgModelImpl.getGroupId(),
						vLegalOrgModelImpl.getStatusOrg(),
						vLegalOrgModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_L,
					args);
			}

			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getOriginalGroupId(),
						vLegalOrgModelImpl.getOriginalStatusOrg(),
						vLegalOrgModelImpl.getOriginalRssable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_RSS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS,
					args);

				args = new Object[] {
						vLegalOrgModelImpl.getGroupId(),
						vLegalOrgModelImpl.getStatusOrg(),
						vLegalOrgModelImpl.getRssable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_S_RSS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_S_RSS,
					args);
			}

			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getOriginalGroupId(),
						vLegalOrgModelImpl.getOriginalLanguage(),
						vLegalOrgModelImpl.getOriginalParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);

				args = new Object[] {
						vLegalOrgModelImpl.getGroupId(),
						vLegalOrgModelImpl.getLanguage(),
						vLegalOrgModelImpl.getParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);
			}

			if ((vLegalOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalOrgModelImpl.getOriginalGroupId(),
						vLegalOrgModelImpl.getOriginalLanguage(),
						vLegalOrgModelImpl.getOriginalParentId(),
						vLegalOrgModelImpl.getOriginalStatusOrg()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_S,
					args);

				args = new Object[] {
						vLegalOrgModelImpl.getGroupId(),
						vLegalOrgModelImpl.getLanguage(),
						vLegalOrgModelImpl.getParentId(),
						vLegalOrgModelImpl.getStatusOrg()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_S,
					args);
			}
		}

		entityCache.putResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey(), vLegalOrg, false);

		clearUniqueFindersCache(vLegalOrgModelImpl);
		cacheUniqueFindersCache(vLegalOrgModelImpl, isNew);

		vLegalOrg.resetOriginalValues();

		return vLegalOrg;
	}

	protected VLegalOrg toUnwrappedModel(VLegalOrg vLegalOrg) {
		if (vLegalOrg instanceof VLegalOrgImpl) {
			return vLegalOrg;
		}

		VLegalOrgImpl vLegalOrgImpl = new VLegalOrgImpl();

		vLegalOrgImpl.setNew(vLegalOrg.isNew());
		vLegalOrgImpl.setPrimaryKey(vLegalOrg.getPrimaryKey());

		vLegalOrgImpl.setOrgId(vLegalOrg.getOrgId());
		vLegalOrgImpl.setGroupId(vLegalOrg.getGroupId());
		vLegalOrgImpl.setCompanyId(vLegalOrg.getCompanyId());
		vLegalOrgImpl.setUserId(vLegalOrg.getUserId());
		vLegalOrgImpl.setCreatedDate(vLegalOrg.getCreatedDate());
		vLegalOrgImpl.setModifiedDate(vLegalOrg.getModifiedDate());
		vLegalOrgImpl.setCreatedByUser(vLegalOrg.getCreatedByUser());
		vLegalOrgImpl.setModifiedByUser(vLegalOrg.getModifiedByUser());
		vLegalOrgImpl.setName(vLegalOrg.getName());
		vLegalOrgImpl.setDescription(vLegalOrg.getDescription());
		vLegalOrgImpl.setParentId(vLegalOrg.getParentId());
		vLegalOrgImpl.setLanguage(vLegalOrg.getLanguage());
		vLegalOrgImpl.setStatusOrg(vLegalOrg.isStatusOrg());
		vLegalOrgImpl.setRssable(vLegalOrg.isRssable());
		vLegalOrgImpl.setPosition(vLegalOrg.getPosition());

		return vLegalOrgImpl;
	}

	/**
	 * Returns the v legal org with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal org
	 * @return the v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalOrgException {
		VLegalOrg vLegalOrg = fetchByPrimaryKey(primaryKey);

		if (vLegalOrg == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalOrgException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalOrg;
	}

	/**
	 * Returns the v legal org with the primary key or throws a {@link NoSuchVLegalOrgException} if it could not be found.
	 *
	 * @param orgId the primary key of the v legal org
	 * @return the v legal org
	 * @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg findByPrimaryKey(String orgId)
		throws NoSuchVLegalOrgException {
		return findByPrimaryKey((Serializable)orgId);
	}

	/**
	 * Returns the v legal org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal org
	 * @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
				VLegalOrgImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalOrg vLegalOrg = (VLegalOrg)serializable;

		if (vLegalOrg == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalOrg = (VLegalOrg)session.get(VLegalOrgImpl.class,
						primaryKey);

				if (vLegalOrg != null) {
					cacheResult(vLegalOrg);
				}
				else {
					entityCache.putResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
						VLegalOrgImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
					VLegalOrgImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalOrg;
	}

	/**
	 * Returns the v legal org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orgId the primary key of the v legal org
	 * @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	 */
	@Override
	public VLegalOrg fetchByPrimaryKey(String orgId) {
		return fetchByPrimaryKey((Serializable)orgId);
	}

	@Override
	public Map<Serializable, VLegalOrg> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalOrg> map = new HashMap<Serializable, VLegalOrg>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalOrg vLegalOrg = fetchByPrimaryKey(primaryKey);

			if (vLegalOrg != null) {
				map.put(primaryKey, vLegalOrg);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
					VLegalOrgImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalOrg)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALORG_WHERE_PKS_IN);

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

			for (VLegalOrg vLegalOrg : (List<VLegalOrg>)q.list()) {
				map.put(vLegalOrg.getPrimaryKeyObj(), vLegalOrg);

				cacheResult(vLegalOrg);

				uncachedPrimaryKeys.remove(vLegalOrg.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
					VLegalOrgImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal orgs.
	 *
	 * @return the v legal orgs
	 */
	@Override
	public List<VLegalOrg> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @return the range of v legal orgs
	 */
	@Override
	public List<VLegalOrg> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal orgs
	 */
	@Override
	public List<VLegalOrg> findAll(int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal orgs
	 * @param end the upper bound of the range of v legal orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal orgs
	 */
	@Override
	public List<VLegalOrg> findAll(int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
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

		List<VLegalOrg> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalOrg>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALORG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALORG;

				if (pagination) {
					sql = sql.concat(VLegalOrgModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal orgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalOrg vLegalOrg : findAll()) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Returns the number of v legal orgs.
	 *
	 * @return the number of v legal orgs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALORG);

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
		return VLegalOrgModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal org persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalOrgImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALORG = "SELECT vLegalOrg FROM VLegalOrg vLegalOrg";
	private static final String _SQL_SELECT_VLEGALORG_WHERE_PKS_IN = "SELECT vLegalOrg FROM VLegalOrg vLegalOrg WHERE orgId IN (";
	private static final String _SQL_SELECT_VLEGALORG_WHERE = "SELECT vLegalOrg FROM VLegalOrg vLegalOrg WHERE ";
	private static final String _SQL_COUNT_VLEGALORG = "SELECT COUNT(vLegalOrg) FROM VLegalOrg vLegalOrg";
	private static final String _SQL_COUNT_VLEGALORG_WHERE = "SELECT COUNT(vLegalOrg) FROM VLegalOrg vLegalOrg WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalOrg.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalOrg exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalOrg exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalOrgPersistenceImpl.class);
}