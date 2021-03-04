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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchvdocOrgException;
import vn.gov.hoabinh.model.impl.vdocOrgImpl;
import vn.gov.hoabinh.model.impl.vdocOrgModelImpl;
import vn.gov.hoabinh.model.vdocOrg;
import vn.gov.hoabinh.service.persistence.vdocOrgPersistence;

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
 * The persistence implementation for the vdoc org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrgPersistence
 * @see vn.gov.hoabinh.service.persistence.vdocOrgUtil
 * @generated
 */
@ProviderType
public class vdocOrgPersistenceImpl extends BasePersistenceImpl<vdocOrg>
	implements vdocOrgPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vdocOrgUtil} to access the vdoc org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vdocOrgImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByParentId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID =
		new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByParentId",
			new String[] { String.class.getName() },
			vdocOrgModelImpl.PARENTID_COLUMN_BITMASK |
			vdocOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PARENTID = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByParentId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vdoc orgs where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByParentId(String parentId) {
		return findByParentId(parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vdoc orgs where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @return the range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByParentId(String parentId, int start, int end) {
		return findByParentId(parentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByParentId(String parentId, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator) {
		return findByParentId(parentId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByParentId(String parentId, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID;
			finderArgs = new Object[] { parentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID;
			finderArgs = new Object[] { parentId, start, end, orderByComparator };
		}

		List<vdocOrg> list = null;

		if (retrieveFromCache) {
			list = (List<vdocOrg>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocOrg vdocOrg : list) {
					if (!Objects.equals(parentId, vdocOrg.getParentId())) {
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

			query.append(_SQL_SELECT_VDOCORG_WHERE);

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindParentId) {
					qPos.add(parentId);
				}

				if (!pagination) {
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc org in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByParentId_First(String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByParentId_First(parentId, orderByComparator);

		if (vdocOrg != null) {
			return vdocOrg;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocOrgException(msg.toString());
	}

	/**
	 * Returns the first vdoc org in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByParentId_First(String parentId,
		OrderByComparator<vdocOrg> orderByComparator) {
		List<vdocOrg> list = findByParentId(parentId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc org in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByParentId_Last(String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByParentId_Last(parentId, orderByComparator);

		if (vdocOrg != null) {
			return vdocOrg;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocOrgException(msg.toString());
	}

	/**
	 * Returns the last vdoc org in the ordered set where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByParentId_Last(String parentId,
		OrderByComparator<vdocOrg> orderByComparator) {
		int count = countByParentId(parentId);

		if (count == 0) {
			return null;
		}

		List<vdocOrg> list = findByParentId(parentId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc orgs before and after the current vdoc org in the ordered set where parentId = &#63;.
	 *
	 * @param orgId the primary key of the current vdoc org
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc org
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg[] findByParentId_PrevAndNext(String orgId, String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			vdocOrg[] array = new vdocOrgImpl[3];

			array[0] = getByParentId_PrevAndNext(session, vdocOrg, parentId,
					orderByComparator, true);

			array[1] = vdocOrg;

			array[2] = getByParentId_PrevAndNext(session, vdocOrg, parentId,
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

	protected vdocOrg getByParentId_PrevAndNext(Session session,
		vdocOrg vdocOrg, String parentId,
		OrderByComparator<vdocOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCORG_WHERE);

		boolean bindParentId = false;

		if (parentId == null) {
			query.append(_FINDER_COLUMN_PARENTID_PARENTID_1);
		}
		else if (parentId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PARENTID_PARENTID_3);
		}
		else {
			bindParentId = true;

			query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);
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
			query.append(vdocOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindParentId) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc orgs where parentId = &#63; from the database.
	 *
	 * @param parentId the parent ID
	 */
	@Override
	public void removeByParentId(String parentId) {
		for (vdocOrg vdocOrg : findByParentId(parentId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vdocOrg);
		}
	}

	/**
	 * Returns the number of vdoc orgs where parentId = &#63;.
	 *
	 * @param parentId the parent ID
	 * @return the number of matching vdoc orgs
	 */
	@Override
	public int countByParentId(String parentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PARENTID;

		Object[] finderArgs = new Object[] { parentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCORG_WHERE);

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_PARENTID_PARENTID_1 = "vdocOrg.parentId IS NULL";
	private static final String _FINDER_COLUMN_PARENTID_PARENTID_2 = "vdocOrg.parentId = ?";
	private static final String _FINDER_COLUMN_PARENTID_PARENTID_3 = "(vdocOrg.parentId IS NULL OR vdocOrg.parentId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			vdocOrgModelImpl.GROUPID_COLUMN_BITMASK |
			vdocOrgModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vdoc orgs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @return the range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L(long groupId, String language, int start,
		int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<vdocOrg> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<vdocOrg> orderByComparator,
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

		List<vdocOrg> list = null;

		if (retrieveFromCache) {
			list = (List<vdocOrg>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocOrg vdocOrg : list) {
					if ((groupId != vdocOrg.getGroupId()) ||
							!Objects.equals(language, vdocOrg.getLanguage())) {
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

			query.append(_SQL_SELECT_VDOCORG_WHERE);

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
				query.append(vdocOrgModelImpl.ORDER_BY_JPQL);
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
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByG_L_First(long groupId, String language,
		OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByG_L_First(groupId, language, orderByComparator);

		if (vdocOrg != null) {
			return vdocOrg;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocOrgException(msg.toString());
	}

	/**
	 * Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByG_L_First(long groupId, String language,
		OrderByComparator<vdocOrg> orderByComparator) {
		List<vdocOrg> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByG_L_Last(long groupId, String language,
		OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByG_L_Last(groupId, language, orderByComparator);

		if (vdocOrg != null) {
			return vdocOrg;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocOrgException(msg.toString());
	}

	/**
	 * Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByG_L_Last(long groupId, String language,
		OrderByComparator<vdocOrg> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<vdocOrg> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc orgs before and after the current vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param orgId the primary key of the current vdoc org
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc org
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg[] findByG_L_PrevAndNext(String orgId, long groupId,
		String language, OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			vdocOrg[] array = new vdocOrgImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vdocOrg, groupId,
					language, orderByComparator, true);

			array[1] = vdocOrg;

			array[2] = getByG_L_PrevAndNext(session, vdocOrg, groupId,
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

	protected vdocOrg getByG_L_PrevAndNext(Session session, vdocOrg vdocOrg,
		long groupId, String language,
		OrderByComparator<vdocOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VDOCORG_WHERE);

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
			query.append(vdocOrgModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vdocOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc orgs where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (vdocOrg vdocOrg : findByG_L(groupId, language, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vdocOrg);
		}
	}

	/**
	 * Returns the number of vdoc orgs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vdoc orgs
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCORG_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vdocOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vdocOrg.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vdocOrg.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vdocOrg.language IS NULL OR vdocOrg.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			vdocOrgModelImpl.GROUPID_COLUMN_BITMASK |
			vdocOrgModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocOrgModelImpl.PARENTID_COLUMN_BITMASK |
			vdocOrgModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @return the matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L_P(long groupId, String language,
		String parentId) {
		return findByG_L_P(groupId, language, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @return the range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end) {
		return findByG_L_P(groupId, language, parentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator) {
		return findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc orgs
	 */
	@Override
	public List<vdocOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator, boolean retrieveFromCache) {
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

		List<vdocOrg> list = null;

		if (retrieveFromCache) {
			list = (List<vdocOrg>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocOrg vdocOrg : list) {
					if ((groupId != vdocOrg.getGroupId()) ||
							!Objects.equals(language, vdocOrg.getLanguage()) ||
							!Objects.equals(parentId, vdocOrg.getParentId())) {
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

			query.append(_SQL_SELECT_VDOCORG_WHERE);

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
				query.append(vdocOrgModelImpl.ORDER_BY_JPQL);
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
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByG_L_P_First(groupId, language, parentId,
				orderByComparator);

		if (vdocOrg != null) {
			return vdocOrg;
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

		throw new NoSuchvdocOrgException(msg.toString());
	}

	/**
	 * Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator<vdocOrg> orderByComparator) {
		List<vdocOrg> list = findByG_L_P(groupId, language, parentId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByG_L_P_Last(groupId, language, parentId,
				orderByComparator);

		if (vdocOrg != null) {
			return vdocOrg;
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

		throw new NoSuchvdocOrgException(msg.toString());
	}

	/**
	 * Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator<vdocOrg> orderByComparator) {
		int count = countByG_L_P(groupId, language, parentId);

		if (count == 0) {
			return null;
		}

		List<vdocOrg> list = findByG_L_P(groupId, language, parentId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc orgs before and after the current vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param orgId the primary key of the current vdoc org
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc org
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg[] findByG_L_P_PrevAndNext(String orgId, long groupId,
		String language, String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			vdocOrg[] array = new vdocOrgImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, vdocOrg, groupId,
					language, parentId, orderByComparator, true);

			array[1] = vdocOrg;

			array[2] = getByG_L_P_PrevAndNext(session, vdocOrg, groupId,
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

	protected vdocOrg getByG_L_P_PrevAndNext(Session session, vdocOrg vdocOrg,
		long groupId, String language, String parentId,
		OrderByComparator<vdocOrg> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VDOCORG_WHERE);

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
			query.append(vdocOrgModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vdocOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 */
	@Override
	public void removeByG_L_P(long groupId, String language, String parentId) {
		for (vdocOrg vdocOrg : findByG_L_P(groupId, language, parentId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocOrg);
		}
	}

	/**
	 * Returns the number of vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @return the number of matching vdoc orgs
	 */
	@Override
	public int countByG_L_P(long groupId, String language, String parentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_P;

		Object[] finderArgs = new Object[] { groupId, language, parentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCORG_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "vdocOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "vdocOrg.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "vdocOrg.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(vdocOrg.language IS NULL OR vdocOrg.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_1 = "vdocOrg.parentId IS NULL";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_2 = "vdocOrg.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_3 = "(vdocOrg.parentId IS NULL OR vdocOrg.parentId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_C = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, vdocOrgImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_C",
			new String[] { Long.class.getName(), String.class.getName() },
			vdocOrgModelImpl.GROUPID_COLUMN_BITMASK |
			vdocOrgModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_C = new FinderPath(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_C",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vdoc org where groupId = &#63; and code = &#63; or throws a {@link NoSuchvdocOrgException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching vdoc org
	 * @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg findByG_C(long groupId, String code)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByG_C(groupId, code);

		if (vdocOrg == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchvdocOrgException(msg.toString());
		}

		return vdocOrg;
	}

	/**
	 * Returns the vdoc org where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByG_C(long groupId, String code) {
		return fetchByG_C(groupId, code, true);
	}

	/**
	 * Returns the vdoc org where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	 */
	@Override
	public vdocOrg fetchByG_C(long groupId, String code,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, code };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_C,
					finderArgs, this);
		}

		if (result instanceof vdocOrg) {
			vdocOrg vdocOrg = (vdocOrg)result;

			if ((groupId != vdocOrg.getGroupId()) ||
					!Objects.equals(code, vdocOrg.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VDOCORG_WHERE);

			query.append(_FINDER_COLUMN_G_C_GROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_G_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_G_C_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCode) {
					qPos.add(code);
				}

				List<vdocOrg> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_C, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"vdocOrgPersistenceImpl.fetchByG_C(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					vdocOrg vdocOrg = list.get(0);

					result = vdocOrg;

					cacheResult(vdocOrg);

					if ((vdocOrg.getGroupId() != groupId) ||
							(vdocOrg.getCode() == null) ||
							!vdocOrg.getCode().equals(code)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_C,
							finderArgs, vdocOrg);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_C, finderArgs);

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
			return (vdocOrg)result;
		}
	}

	/**
	 * Removes the vdoc org where groupId = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the vdoc org that was removed
	 */
	@Override
	public vdocOrg removeByG_C(long groupId, String code)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = findByG_C(groupId, code);

		return remove(vdocOrg);
	}

	/**
	 * Returns the number of vdoc orgs where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the number of matching vdoc orgs
	 */
	@Override
	public int countByG_C(long groupId, String code) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_C;

		Object[] finderArgs = new Object[] { groupId, code };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCORG_WHERE);

			query.append(_FINDER_COLUMN_G_C_GROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_G_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_G_C_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_G_C_GROUPID_2 = "vdocOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_C_CODE_1 = "vdocOrg.code IS NULL";
	private static final String _FINDER_COLUMN_G_C_CODE_2 = "vdocOrg.code = ?";
	private static final String _FINDER_COLUMN_G_C_CODE_3 = "(vdocOrg.code IS NULL OR vdocOrg.code = '')";

	public vdocOrgPersistenceImpl() {
		setModelClass(vdocOrg.class);
	}

	/**
	 * Caches the vdoc org in the entity cache if it is enabled.
	 *
	 * @param vdocOrg the vdoc org
	 */
	@Override
	public void cacheResult(vdocOrg vdocOrg) {
		entityCache.putResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgImpl.class, vdocOrg.getPrimaryKey(), vdocOrg);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_C,
			new Object[] { vdocOrg.getGroupId(), vdocOrg.getCode() }, vdocOrg);

		vdocOrg.resetOriginalValues();
	}

	/**
	 * Caches the vdoc orgs in the entity cache if it is enabled.
	 *
	 * @param vdocOrgs the vdoc orgs
	 */
	@Override
	public void cacheResult(List<vdocOrg> vdocOrgs) {
		for (vdocOrg vdocOrg : vdocOrgs) {
			if (entityCache.getResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
						vdocOrgImpl.class, vdocOrg.getPrimaryKey()) == null) {
				cacheResult(vdocOrg);
			}
			else {
				vdocOrg.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vdoc orgs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vdocOrgImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vdoc org.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vdocOrg vdocOrg) {
		entityCache.removeResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgImpl.class, vdocOrg.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((vdocOrgModelImpl)vdocOrg);
	}

	@Override
	public void clearCache(List<vdocOrg> vdocOrgs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vdocOrg vdocOrg : vdocOrgs) {
			entityCache.removeResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
				vdocOrgImpl.class, vdocOrg.getPrimaryKey());

			clearUniqueFindersCache((vdocOrgModelImpl)vdocOrg);
		}
	}

	protected void cacheUniqueFindersCache(vdocOrgModelImpl vdocOrgModelImpl,
		boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vdocOrgModelImpl.getGroupId(), vdocOrgModelImpl.getCode()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_C, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_C, args,
				vdocOrgModelImpl);
		}
		else {
			if ((vdocOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocOrgModelImpl.getGroupId(),
						vdocOrgModelImpl.getCode()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_C, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_C, args,
					vdocOrgModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(vdocOrgModelImpl vdocOrgModelImpl) {
		Object[] args = new Object[] {
				vdocOrgModelImpl.getGroupId(), vdocOrgModelImpl.getCode()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_C, args);

		if ((vdocOrgModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_C.getColumnBitmask()) != 0) {
			args = new Object[] {
					vdocOrgModelImpl.getOriginalGroupId(),
					vdocOrgModelImpl.getOriginalCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_C, args);
		}
	}

	/**
	 * Creates a new vdoc org with the primary key. Does not add the vdoc org to the database.
	 *
	 * @param orgId the primary key for the new vdoc org
	 * @return the new vdoc org
	 */
	@Override
	public vdocOrg create(String orgId) {
		vdocOrg vdocOrg = new vdocOrgImpl();

		vdocOrg.setNew(true);
		vdocOrg.setPrimaryKey(orgId);

		vdocOrg.setCompanyId(companyProvider.getCompanyId());

		return vdocOrg;
	}

	/**
	 * Removes the vdoc org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgId the primary key of the vdoc org
	 * @return the vdoc org that was removed
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg remove(String orgId) throws NoSuchvdocOrgException {
		return remove((Serializable)orgId);
	}

	/**
	 * Removes the vdoc org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc org
	 * @return the vdoc org that was removed
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg remove(Serializable primaryKey)
		throws NoSuchvdocOrgException {
		Session session = null;

		try {
			session = openSession();

			vdocOrg vdocOrg = (vdocOrg)session.get(vdocOrgImpl.class, primaryKey);

			if (vdocOrg == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvdocOrgException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vdocOrg);
		}
		catch (NoSuchvdocOrgException nsee) {
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
	protected vdocOrg removeImpl(vdocOrg vdocOrg) {
		vdocOrg = toUnwrappedModel(vdocOrg);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vdocOrg)) {
				vdocOrg = (vdocOrg)session.get(vdocOrgImpl.class,
						vdocOrg.getPrimaryKeyObj());
			}

			if (vdocOrg != null) {
				session.delete(vdocOrg);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vdocOrg != null) {
			clearCache(vdocOrg);
		}

		return vdocOrg;
	}

	@Override
	public vdocOrg updateImpl(vdocOrg vdocOrg) {
		vdocOrg = toUnwrappedModel(vdocOrg);

		boolean isNew = vdocOrg.isNew();

		vdocOrgModelImpl vdocOrgModelImpl = (vdocOrgModelImpl)vdocOrg;

		Session session = null;

		try {
			session = openSession();

			if (vdocOrg.isNew()) {
				session.save(vdocOrg);

				vdocOrg.setNew(false);
			}
			else {
				vdocOrg = (vdocOrg)session.merge(vdocOrg);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !vdocOrgModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vdocOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocOrgModelImpl.getOriginalParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
					args);

				args = new Object[] { vdocOrgModelImpl.getParentId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
					args);
			}

			if ((vdocOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocOrgModelImpl.getOriginalGroupId(),
						vdocOrgModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vdocOrgModelImpl.getGroupId(),
						vdocOrgModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((vdocOrgModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocOrgModelImpl.getOriginalGroupId(),
						vdocOrgModelImpl.getOriginalLanguage(),
						vdocOrgModelImpl.getOriginalParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);

				args = new Object[] {
						vdocOrgModelImpl.getGroupId(),
						vdocOrgModelImpl.getLanguage(),
						vdocOrgModelImpl.getParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);
			}
		}

		entityCache.putResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
			vdocOrgImpl.class, vdocOrg.getPrimaryKey(), vdocOrg, false);

		clearUniqueFindersCache(vdocOrgModelImpl);
		cacheUniqueFindersCache(vdocOrgModelImpl, isNew);

		vdocOrg.resetOriginalValues();

		return vdocOrg;
	}

	protected vdocOrg toUnwrappedModel(vdocOrg vdocOrg) {
		if (vdocOrg instanceof vdocOrgImpl) {
			return vdocOrg;
		}

		vdocOrgImpl vdocOrgImpl = new vdocOrgImpl();

		vdocOrgImpl.setNew(vdocOrg.isNew());
		vdocOrgImpl.setPrimaryKey(vdocOrg.getPrimaryKey());

		vdocOrgImpl.setOrgId(vdocOrg.getOrgId());
		vdocOrgImpl.setGroupId(vdocOrg.getGroupId());
		vdocOrgImpl.setCompanyId(vdocOrg.getCompanyId());
		vdocOrgImpl.setUserId(vdocOrg.getUserId());
		vdocOrgImpl.setCreatedDate(vdocOrg.getCreatedDate());
		vdocOrgImpl.setModifiedDate(vdocOrg.getModifiedDate());
		vdocOrgImpl.setCreatedByUser(vdocOrg.getCreatedByUser());
		vdocOrgImpl.setModifiedByUser(vdocOrg.getModifiedByUser());
		vdocOrgImpl.setParentId(vdocOrg.getParentId());
		vdocOrgImpl.setCode(vdocOrg.getCode());
		vdocOrgImpl.setName(vdocOrg.getName());
		vdocOrgImpl.setDescription(vdocOrg.getDescription());
		vdocOrgImpl.setAddress(vdocOrg.getAddress());
		vdocOrgImpl.setPhone(vdocOrg.getPhone());
		vdocOrgImpl.setFax(vdocOrg.getFax());
		vdocOrgImpl.setLanguage(vdocOrg.getLanguage());
		vdocOrgImpl.setStatusOrg(vdocOrg.isStatusOrg());
		vdocOrgImpl.setPosition(vdocOrg.getPosition());
		vdocOrgImpl.setListparent(vdocOrg.getListparent());

		return vdocOrgImpl;
	}

	/**
	 * Returns the vdoc org with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc org
	 * @return the vdoc org
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvdocOrgException {
		vdocOrg vdocOrg = fetchByPrimaryKey(primaryKey);

		if (vdocOrg == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvdocOrgException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vdocOrg;
	}

	/**
	 * Returns the vdoc org with the primary key or throws a {@link NoSuchvdocOrgException} if it could not be found.
	 *
	 * @param orgId the primary key of the vdoc org
	 * @return the vdoc org
	 * @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg findByPrimaryKey(String orgId) throws NoSuchvdocOrgException {
		return findByPrimaryKey((Serializable)orgId);
	}

	/**
	 * Returns the vdoc org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc org
	 * @return the vdoc org, or <code>null</code> if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
				vdocOrgImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		vdocOrg vdocOrg = (vdocOrg)serializable;

		if (vdocOrg == null) {
			Session session = null;

			try {
				session = openSession();

				vdocOrg = (vdocOrg)session.get(vdocOrgImpl.class, primaryKey);

				if (vdocOrg != null) {
					cacheResult(vdocOrg);
				}
				else {
					entityCache.putResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
						vdocOrgImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
					vdocOrgImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vdocOrg;
	}

	/**
	 * Returns the vdoc org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orgId the primary key of the vdoc org
	 * @return the vdoc org, or <code>null</code> if a vdoc org with the primary key could not be found
	 */
	@Override
	public vdocOrg fetchByPrimaryKey(String orgId) {
		return fetchByPrimaryKey((Serializable)orgId);
	}

	@Override
	public Map<Serializable, vdocOrg> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, vdocOrg> map = new HashMap<Serializable, vdocOrg>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			vdocOrg vdocOrg = fetchByPrimaryKey(primaryKey);

			if (vdocOrg != null) {
				map.put(primaryKey, vdocOrg);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
					vdocOrgImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (vdocOrg)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VDOCORG_WHERE_PKS_IN);

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

			for (vdocOrg vdocOrg : (List<vdocOrg>)q.list()) {
				map.put(vdocOrg.getPrimaryKeyObj(), vdocOrg);

				cacheResult(vdocOrg);

				uncachedPrimaryKeys.remove(vdocOrg.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(vdocOrgModelImpl.ENTITY_CACHE_ENABLED,
					vdocOrgImpl.class, primaryKey, nullModel);
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
	 * Returns all the vdoc orgs.
	 *
	 * @return the vdoc orgs
	 */
	@Override
	public List<vdocOrg> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @return the range of vdoc orgs
	 */
	@Override
	public List<vdocOrg> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vdoc orgs
	 */
	@Override
	public List<vdocOrg> findAll(int start, int end,
		OrderByComparator<vdocOrg> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc orgs
	 * @param end the upper bound of the range of vdoc orgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vdoc orgs
	 */
	@Override
	public List<vdocOrg> findAll(int start, int end,
		OrderByComparator<vdocOrg> orderByComparator, boolean retrieveFromCache) {
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

		List<vdocOrg> list = null;

		if (retrieveFromCache) {
			list = (List<vdocOrg>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VDOCORG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCORG;

				if (pagination) {
					sql = sql.concat(vdocOrgModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocOrg>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vdoc orgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vdocOrg vdocOrg : findAll()) {
			remove(vdocOrg);
		}
	}

	/**
	 * Returns the number of vdoc orgs.
	 *
	 * @return the number of vdoc orgs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VDOCORG);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return vdocOrgModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vdoc org persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(vdocOrgImpl.class.getName());
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
	private static final String _SQL_SELECT_VDOCORG = "SELECT vdocOrg FROM vdocOrg vdocOrg";
	private static final String _SQL_SELECT_VDOCORG_WHERE_PKS_IN = "SELECT vdocOrg FROM vdocOrg vdocOrg WHERE orgId IN (";
	private static final String _SQL_SELECT_VDOCORG_WHERE = "SELECT vdocOrg FROM vdocOrg vdocOrg WHERE ";
	private static final String _SQL_COUNT_VDOCORG = "SELECT COUNT(vdocOrg) FROM vdocOrg vdocOrg";
	private static final String _SQL_COUNT_VDOCORG_WHERE = "SELECT COUNT(vdocOrg) FROM vdocOrg vdocOrg WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocOrg.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocOrg exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocOrg exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(vdocOrgPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code"
			});
}