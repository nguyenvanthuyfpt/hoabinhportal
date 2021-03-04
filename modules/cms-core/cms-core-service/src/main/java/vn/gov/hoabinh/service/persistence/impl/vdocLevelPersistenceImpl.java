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

import vn.gov.hoabinh.exception.NoSuchvdocLevelException;
import vn.gov.hoabinh.model.impl.vdocLevelImpl;
import vn.gov.hoabinh.model.impl.vdocLevelModelImpl;
import vn.gov.hoabinh.model.vdocLevel;
import vn.gov.hoabinh.service.persistence.vdocLevelPersistence;

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
 * The persistence implementation for the vdoc level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevelPersistence
 * @see vn.gov.hoabinh.service.persistence.vdocLevelUtil
 * @generated
 */
@ProviderType
public class vdocLevelPersistenceImpl extends BasePersistenceImpl<vdocLevel>
	implements vdocLevelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vdocLevelUtil} to access the vdoc level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vdocLevelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelModelImpl.FINDER_CACHE_ENABLED, vdocLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelModelImpl.FINDER_CACHE_ENABLED, vdocLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelModelImpl.FINDER_CACHE_ENABLED, vdocLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelModelImpl.FINDER_CACHE_ENABLED, vdocLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			vdocLevelModelImpl.GROUPID_COLUMN_BITMASK |
			vdocLevelModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocLevelModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vdoc levels where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vdoc levels
	 */
	@Override
	public List<vdocLevel> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc levels where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc levels
	 * @param end the upper bound of the range of vdoc levels (not inclusive)
	 * @return the range of matching vdoc levels
	 */
	@Override
	public List<vdocLevel> findByG_L(long groupId, String language, int start,
		int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc levels where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc levels
	 * @param end the upper bound of the range of vdoc levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc levels
	 */
	@Override
	public List<vdocLevel> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<vdocLevel> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc levels where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc levels
	 * @param end the upper bound of the range of vdoc levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc levels
	 */
	@Override
	public List<vdocLevel> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<vdocLevel> orderByComparator,
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

		List<vdocLevel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocLevel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocLevel vdocLevel : list) {
					if ((groupId != vdocLevel.getGroupId()) ||
							!Objects.equals(language, vdocLevel.getLanguage())) {
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

			query.append(_SQL_SELECT_VDOCLEVEL_WHERE);

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
				query.append(vdocLevelModelImpl.ORDER_BY_JPQL);
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
					list = (List<vdocLevel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocLevel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc level
	 * @throws NoSuchvdocLevelException if a matching vdoc level could not be found
	 */
	@Override
	public vdocLevel findByG_L_First(long groupId, String language,
		OrderByComparator<vdocLevel> orderByComparator)
		throws NoSuchvdocLevelException {
		vdocLevel vdocLevel = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vdocLevel != null) {
			return vdocLevel;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocLevelException(msg.toString());
	}

	/**
	 * Returns the first vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc level, or <code>null</code> if a matching vdoc level could not be found
	 */
	@Override
	public vdocLevel fetchByG_L_First(long groupId, String language,
		OrderByComparator<vdocLevel> orderByComparator) {
		List<vdocLevel> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc level
	 * @throws NoSuchvdocLevelException if a matching vdoc level could not be found
	 */
	@Override
	public vdocLevel findByG_L_Last(long groupId, String language,
		OrderByComparator<vdocLevel> orderByComparator)
		throws NoSuchvdocLevelException {
		vdocLevel vdocLevel = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (vdocLevel != null) {
			return vdocLevel;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocLevelException(msg.toString());
	}

	/**
	 * Returns the last vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc level, or <code>null</code> if a matching vdoc level could not be found
	 */
	@Override
	public vdocLevel fetchByG_L_Last(long groupId, String language,
		OrderByComparator<vdocLevel> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<vdocLevel> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc levels before and after the current vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param levelId the primary key of the current vdoc level
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc level
	 * @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel[] findByG_L_PrevAndNext(String levelId, long groupId,
		String language, OrderByComparator<vdocLevel> orderByComparator)
		throws NoSuchvdocLevelException {
		vdocLevel vdocLevel = findByPrimaryKey(levelId);

		Session session = null;

		try {
			session = openSession();

			vdocLevel[] array = new vdocLevelImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vdocLevel, groupId,
					language, orderByComparator, true);

			array[1] = vdocLevel;

			array[2] = getByG_L_PrevAndNext(session, vdocLevel, groupId,
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

	protected vdocLevel getByG_L_PrevAndNext(Session session,
		vdocLevel vdocLevel, long groupId, String language,
		OrderByComparator<vdocLevel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VDOCLEVEL_WHERE);

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
			query.append(vdocLevelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vdocLevel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocLevel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc levels where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (vdocLevel vdocLevel : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocLevel);
		}
	}

	/**
	 * Returns the number of vdoc levels where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vdoc levels
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCLEVEL_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vdocLevel.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vdocLevel.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vdocLevel.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vdocLevel.language IS NULL OR vdocLevel.language = '')";

	public vdocLevelPersistenceImpl() {
		setModelClass(vdocLevel.class);
	}

	/**
	 * Caches the vdoc level in the entity cache if it is enabled.
	 *
	 * @param vdocLevel the vdoc level
	 */
	@Override
	public void cacheResult(vdocLevel vdocLevel) {
		entityCache.putResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelImpl.class, vdocLevel.getPrimaryKey(), vdocLevel);

		vdocLevel.resetOriginalValues();
	}

	/**
	 * Caches the vdoc levels in the entity cache if it is enabled.
	 *
	 * @param vdocLevels the vdoc levels
	 */
	@Override
	public void cacheResult(List<vdocLevel> vdocLevels) {
		for (vdocLevel vdocLevel : vdocLevels) {
			if (entityCache.getResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
						vdocLevelImpl.class, vdocLevel.getPrimaryKey()) == null) {
				cacheResult(vdocLevel);
			}
			else {
				vdocLevel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vdoc levels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vdocLevelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vdoc level.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vdocLevel vdocLevel) {
		entityCache.removeResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelImpl.class, vdocLevel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<vdocLevel> vdocLevels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vdocLevel vdocLevel : vdocLevels) {
			entityCache.removeResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
				vdocLevelImpl.class, vdocLevel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vdoc level with the primary key. Does not add the vdoc level to the database.
	 *
	 * @param levelId the primary key for the new vdoc level
	 * @return the new vdoc level
	 */
	@Override
	public vdocLevel create(String levelId) {
		vdocLevel vdocLevel = new vdocLevelImpl();

		vdocLevel.setNew(true);
		vdocLevel.setPrimaryKey(levelId);

		vdocLevel.setCompanyId(companyProvider.getCompanyId());

		return vdocLevel;
	}

	/**
	 * Removes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param levelId the primary key of the vdoc level
	 * @return the vdoc level that was removed
	 * @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel remove(String levelId) throws NoSuchvdocLevelException {
		return remove((Serializable)levelId);
	}

	/**
	 * Removes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc level
	 * @return the vdoc level that was removed
	 * @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel remove(Serializable primaryKey)
		throws NoSuchvdocLevelException {
		Session session = null;

		try {
			session = openSession();

			vdocLevel vdocLevel = (vdocLevel)session.get(vdocLevelImpl.class,
					primaryKey);

			if (vdocLevel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvdocLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vdocLevel);
		}
		catch (NoSuchvdocLevelException nsee) {
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
	protected vdocLevel removeImpl(vdocLevel vdocLevel) {
		vdocLevel = toUnwrappedModel(vdocLevel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vdocLevel)) {
				vdocLevel = (vdocLevel)session.get(vdocLevelImpl.class,
						vdocLevel.getPrimaryKeyObj());
			}

			if (vdocLevel != null) {
				session.delete(vdocLevel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vdocLevel != null) {
			clearCache(vdocLevel);
		}

		return vdocLevel;
	}

	@Override
	public vdocLevel updateImpl(vdocLevel vdocLevel) {
		vdocLevel = toUnwrappedModel(vdocLevel);

		boolean isNew = vdocLevel.isNew();

		vdocLevelModelImpl vdocLevelModelImpl = (vdocLevelModelImpl)vdocLevel;

		Session session = null;

		try {
			session = openSession();

			if (vdocLevel.isNew()) {
				session.save(vdocLevel);

				vdocLevel.setNew(false);
			}
			else {
				vdocLevel = (vdocLevel)session.merge(vdocLevel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !vdocLevelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vdocLevelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocLevelModelImpl.getOriginalGroupId(),
						vdocLevelModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vdocLevelModelImpl.getGroupId(),
						vdocLevelModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}
		}

		entityCache.putResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
			vdocLevelImpl.class, vdocLevel.getPrimaryKey(), vdocLevel, false);

		vdocLevel.resetOriginalValues();

		return vdocLevel;
	}

	protected vdocLevel toUnwrappedModel(vdocLevel vdocLevel) {
		if (vdocLevel instanceof vdocLevelImpl) {
			return vdocLevel;
		}

		vdocLevelImpl vdocLevelImpl = new vdocLevelImpl();

		vdocLevelImpl.setNew(vdocLevel.isNew());
		vdocLevelImpl.setPrimaryKey(vdocLevel.getPrimaryKey());

		vdocLevelImpl.setLevelId(vdocLevel.getLevelId());
		vdocLevelImpl.setGroupId(vdocLevel.getGroupId());
		vdocLevelImpl.setCompanyId(vdocLevel.getCompanyId());
		vdocLevelImpl.setUserId(vdocLevel.getUserId());
		vdocLevelImpl.setCreatedDate(vdocLevel.getCreatedDate());
		vdocLevelImpl.setModifiedDate(vdocLevel.getModifiedDate());
		vdocLevelImpl.setName(vdocLevel.getName());
		vdocLevelImpl.setDescription(vdocLevel.getDescription());
		vdocLevelImpl.setLanguage(vdocLevel.getLanguage());
		vdocLevelImpl.setPosition(vdocLevel.getPosition());

		return vdocLevelImpl;
	}

	/**
	 * Returns the vdoc level with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc level
	 * @return the vdoc level
	 * @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvdocLevelException {
		vdocLevel vdocLevel = fetchByPrimaryKey(primaryKey);

		if (vdocLevel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvdocLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vdocLevel;
	}

	/**
	 * Returns the vdoc level with the primary key or throws a {@link NoSuchvdocLevelException} if it could not be found.
	 *
	 * @param levelId the primary key of the vdoc level
	 * @return the vdoc level
	 * @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel findByPrimaryKey(String levelId)
		throws NoSuchvdocLevelException {
		return findByPrimaryKey((Serializable)levelId);
	}

	/**
	 * Returns the vdoc level with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc level
	 * @return the vdoc level, or <code>null</code> if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
				vdocLevelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		vdocLevel vdocLevel = (vdocLevel)serializable;

		if (vdocLevel == null) {
			Session session = null;

			try {
				session = openSession();

				vdocLevel = (vdocLevel)session.get(vdocLevelImpl.class,
						primaryKey);

				if (vdocLevel != null) {
					cacheResult(vdocLevel);
				}
				else {
					entityCache.putResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
						vdocLevelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
					vdocLevelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vdocLevel;
	}

	/**
	 * Returns the vdoc level with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param levelId the primary key of the vdoc level
	 * @return the vdoc level, or <code>null</code> if a vdoc level with the primary key could not be found
	 */
	@Override
	public vdocLevel fetchByPrimaryKey(String levelId) {
		return fetchByPrimaryKey((Serializable)levelId);
	}

	@Override
	public Map<Serializable, vdocLevel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, vdocLevel> map = new HashMap<Serializable, vdocLevel>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			vdocLevel vdocLevel = fetchByPrimaryKey(primaryKey);

			if (vdocLevel != null) {
				map.put(primaryKey, vdocLevel);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
					vdocLevelImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (vdocLevel)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VDOCLEVEL_WHERE_PKS_IN);

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

			for (vdocLevel vdocLevel : (List<vdocLevel>)q.list()) {
				map.put(vdocLevel.getPrimaryKeyObj(), vdocLevel);

				cacheResult(vdocLevel);

				uncachedPrimaryKeys.remove(vdocLevel.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(vdocLevelModelImpl.ENTITY_CACHE_ENABLED,
					vdocLevelImpl.class, primaryKey, nullModel);
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
	 * Returns all the vdoc levels.
	 *
	 * @return the vdoc levels
	 */
	@Override
	public List<vdocLevel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc levels
	 * @param end the upper bound of the range of vdoc levels (not inclusive)
	 * @return the range of vdoc levels
	 */
	@Override
	public List<vdocLevel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc levels
	 * @param end the upper bound of the range of vdoc levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vdoc levels
	 */
	@Override
	public List<vdocLevel> findAll(int start, int end,
		OrderByComparator<vdocLevel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc levels
	 * @param end the upper bound of the range of vdoc levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vdoc levels
	 */
	@Override
	public List<vdocLevel> findAll(int start, int end,
		OrderByComparator<vdocLevel> orderByComparator,
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

		List<vdocLevel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocLevel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VDOCLEVEL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCLEVEL;

				if (pagination) {
					sql = sql.concat(vdocLevelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vdocLevel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocLevel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vdoc levels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vdocLevel vdocLevel : findAll()) {
			remove(vdocLevel);
		}
	}

	/**
	 * Returns the number of vdoc levels.
	 *
	 * @return the number of vdoc levels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VDOCLEVEL);

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
		return vdocLevelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vdoc level persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(vdocLevelImpl.class.getName());
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
	private static final String _SQL_SELECT_VDOCLEVEL = "SELECT vdocLevel FROM vdocLevel vdocLevel";
	private static final String _SQL_SELECT_VDOCLEVEL_WHERE_PKS_IN = "SELECT vdocLevel FROM vdocLevel vdocLevel WHERE levelId IN (";
	private static final String _SQL_SELECT_VDOCLEVEL_WHERE = "SELECT vdocLevel FROM vdocLevel vdocLevel WHERE ";
	private static final String _SQL_COUNT_VDOCLEVEL = "SELECT COUNT(vdocLevel) FROM vdocLevel vdocLevel";
	private static final String _SQL_COUNT_VDOCLEVEL_WHERE = "SELECT COUNT(vdocLevel) FROM vdocLevel vdocLevel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocLevel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocLevel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocLevel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(vdocLevelPersistenceImpl.class);
}