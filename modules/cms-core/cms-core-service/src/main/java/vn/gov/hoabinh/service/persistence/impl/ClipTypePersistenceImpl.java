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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchClipTypeException;
import vn.gov.hoabinh.model.ClipType;
import vn.gov.hoabinh.model.impl.ClipTypeImpl;
import vn.gov.hoabinh.model.impl.ClipTypeModelImpl;
import vn.gov.hoabinh.service.persistence.ClipTypePersistence;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the clip type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipTypePersistence
 * @see vn.gov.hoabinh.service.persistence.ClipTypeUtil
 * @generated
 */
@ProviderType
public class ClipTypePersistenceImpl extends BasePersistenceImpl<ClipType>
	implements ClipTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ClipTypeUtil} to access the clip type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ClipTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LANGUAGE = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLanguage",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LANGUAGE =
		new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLanguage",
			new String[] { String.class.getName(), Boolean.class.getName() },
			ClipTypeModelImpl.LANGUAGE_COLUMN_BITMASK |
			ClipTypeModelImpl.ACTIVE_COLUMN_BITMASK |
			ClipTypeModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LANGUAGE = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLanguage",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the clip types where language = &#63; and active = &#63;.
	 *
	 * @param language the language
	 * @param active the active
	 * @return the matching clip types
	 */
	@Override
	public List<ClipType> findByLanguage(String language, boolean active) {
		return findByLanguage(language, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clip types where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @return the range of matching clip types
	 */
	@Override
	public List<ClipType> findByLanguage(String language, boolean active,
		int start, int end) {
		return findByLanguage(language, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clip types where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByLanguage(String language, boolean active,
		int start, int end, OrderByComparator<ClipType> orderByComparator) {
		return findByLanguage(language, active, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the clip types where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByLanguage(String language, boolean active,
		int start, int end, OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LANGUAGE;
			finderArgs = new Object[] { language, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LANGUAGE;
			finderArgs = new Object[] {
					language, active,
					
					start, end, orderByComparator
				};
		}

		List<ClipType> list = null;

		if (retrieveFromCache) {
			list = (List<ClipType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ClipType clipType : list) {
					if (!Objects.equals(language, clipType.getLanguage()) ||
							(active != clipType.getActive())) {
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

			query.append(_SQL_SELECT_CLIPTYPE_WHERE);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_LANGUAGE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(active);

				if (!pagination) {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByLanguage_First(String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByLanguage_First(language, active,
				orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("language=");
		msg.append(language);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the first clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByLanguage_First(String language, boolean active,
		OrderByComparator<ClipType> orderByComparator) {
		List<ClipType> list = findByLanguage(language, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByLanguage_Last(String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByLanguage_Last(language, active,
				orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("language=");
		msg.append(language);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the last clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByLanguage_Last(String language, boolean active,
		OrderByComparator<ClipType> orderByComparator) {
		int count = countByLanguage(language, active);

		if (count == 0) {
			return null;
		}

		List<ClipType> list = findByLanguage(language, active, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clip types before and after the current clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * @param id the primary key of the current clip type
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip type
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType[] findByLanguage_PrevAndNext(String id, String language,
		boolean active, OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ClipType[] array = new ClipTypeImpl[3];

			array[0] = getByLanguage_PrevAndNext(session, clipType, language,
					active, orderByComparator, true);

			array[1] = clipType;

			array[2] = getByLanguage_PrevAndNext(session, clipType, language,
					active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ClipType getByLanguage_PrevAndNext(Session session,
		ClipType clipType, String language, boolean active,
		OrderByComparator<ClipType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CLIPTYPE_WHERE);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_LANGUAGE_ACTIVE_2);

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
			query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(clipType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ClipType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clip types where language = &#63; and active = &#63; from the database.
	 *
	 * @param language the language
	 * @param active the active
	 */
	@Override
	public void removeByLanguage(String language, boolean active) {
		for (ClipType clipType : findByLanguage(language, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(clipType);
		}
	}

	/**
	 * Returns the number of clip types where language = &#63; and active = &#63;.
	 *
	 * @param language the language
	 * @param active the active
	 * @return the number of matching clip types
	 */
	@Override
	public int countByLanguage(String language, boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LANGUAGE;

		Object[] finderArgs = new Object[] { language, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CLIPTYPE_WHERE);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_LANGUAGE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(active);

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

	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_1 = "clipType.language IS NULL AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_2 = "clipType.language = ? AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_3 = "(clipType.language IS NULL OR clipType.language = '') AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_ACTIVE_2 = "clipType.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_A = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			ClipTypeModelImpl.GROUPID_COLUMN_BITMASK |
			ClipTypeModelImpl.LANGUAGE_COLUMN_BITMASK |
			ClipTypeModelImpl.ACTIVE_COLUMN_BITMASK |
			ClipTypeModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_A = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @return the matching clip types
	 */
	@Override
	public List<ClipType> findByG_L_A(long groupId, String language,
		boolean active) {
		return findByG_L_A(groupId, language, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @return the range of matching clip types
	 */
	@Override
	public List<ClipType> findByG_L_A(long groupId, String language,
		boolean active, int start, int end) {
		return findByG_L_A(groupId, language, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByG_L_A(long groupId, String language,
		boolean active, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return findByG_L_A(groupId, language, active, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByG_L_A(long groupId, String language,
		boolean active, int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A;
			finderArgs = new Object[] { groupId, language, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_A;
			finderArgs = new Object[] {
					groupId, language, active,
					
					start, end, orderByComparator
				};
		}

		List<ClipType> list = null;

		if (retrieveFromCache) {
			list = (List<ClipType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ClipType clipType : list) {
					if ((groupId != clipType.getGroupId()) ||
							!Objects.equals(language, clipType.getLanguage()) ||
							(active != clipType.getActive())) {
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

			query.append(_SQL_SELECT_CLIPTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_A_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
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

				qPos.add(active);

				if (!pagination) {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByG_L_A_First(long groupId, String language,
		boolean active, OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByG_L_A_First(groupId, language, active,
				orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the first clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByG_L_A_First(long groupId, String language,
		boolean active, OrderByComparator<ClipType> orderByComparator) {
		List<ClipType> list = findByG_L_A(groupId, language, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByG_L_A_Last(long groupId, String language,
		boolean active, OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByG_L_A_Last(groupId, language, active,
				orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the last clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByG_L_A_Last(long groupId, String language,
		boolean active, OrderByComparator<ClipType> orderByComparator) {
		int count = countByG_L_A(groupId, language, active);

		if (count == 0) {
			return null;
		}

		List<ClipType> list = findByG_L_A(groupId, language, active, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clip types before and after the current clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param id the primary key of the current clip type
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip type
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType[] findByG_L_A_PrevAndNext(String id, long groupId,
		String language, boolean active,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ClipType[] array = new ClipTypeImpl[3];

			array[0] = getByG_L_A_PrevAndNext(session, clipType, groupId,
					language, active, orderByComparator, true);

			array[1] = clipType;

			array[2] = getByG_L_A_PrevAndNext(session, clipType, groupId,
					language, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ClipType getByG_L_A_PrevAndNext(Session session,
		ClipType clipType, long groupId, String language, boolean active,
		OrderByComparator<ClipType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_CLIPTYPE_WHERE);

		query.append(_FINDER_COLUMN_G_L_A_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_A_ACTIVE_2);

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
			query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
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

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(clipType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ClipType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clip types where groupId = &#63; and language = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 */
	@Override
	public void removeByG_L_A(long groupId, String language, boolean active) {
		for (ClipType clipType : findByG_L_A(groupId, language, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(clipType);
		}
	}

	/**
	 * Returns the number of clip types where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @return the number of matching clip types
	 */
	@Override
	public int countByG_L_A(long groupId, String language, boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_A;

		Object[] finderArgs = new Object[] { groupId, language, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CLIPTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_A_ACTIVE_2);

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

				qPos.add(active);

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

	private static final String _FINDER_COLUMN_G_L_A_GROUPID_2 = "clipType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_1 = "clipType.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_2 = "clipType.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_3 = "(clipType.language IS NULL OR clipType.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_A_ACTIVE_2 = "clipType.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			ClipTypeModelImpl.GROUPID_COLUMN_BITMASK |
			ClipTypeModelImpl.LANGUAGE_COLUMN_BITMASK |
			ClipTypeModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the clip types where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching clip types
	 */
	@Override
	public List<ClipType> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clip types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @return the range of matching clip types
	 */
	@Override
	public List<ClipType> findByG_L(long groupId, String language, int start,
		int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clip types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<ClipType> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clip types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<ClipType> orderByComparator,
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

		List<ClipType> list = null;

		if (retrieveFromCache) {
			list = (List<ClipType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ClipType clipType : list) {
					if ((groupId != clipType.getGroupId()) ||
							!Objects.equals(language, clipType.getLanguage())) {
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

			query.append(_SQL_SELECT_CLIPTYPE_WHERE);

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
				query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
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
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first clip type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByG_L_First(long groupId, String language,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the first clip type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByG_L_First(long groupId, String language,
		OrderByComparator<ClipType> orderByComparator) {
		List<ClipType> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByG_L_Last(long groupId, String language,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByG_L_Last(groupId, language, orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the last clip type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByG_L_Last(long groupId, String language,
		OrderByComparator<ClipType> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<ClipType> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clip types before and after the current clip type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param id the primary key of the current clip type
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip type
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType[] findByG_L_PrevAndNext(String id, long groupId,
		String language, OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ClipType[] array = new ClipTypeImpl[3];

			array[0] = getByG_L_PrevAndNext(session, clipType, groupId,
					language, orderByComparator, true);

			array[1] = clipType;

			array[2] = getByG_L_PrevAndNext(session, clipType, groupId,
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

	protected ClipType getByG_L_PrevAndNext(Session session, ClipType clipType,
		long groupId, String language,
		OrderByComparator<ClipType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CLIPTYPE_WHERE);

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
			query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(clipType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ClipType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clip types where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (ClipType clipType : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(clipType);
		}
	}

	/**
	 * Returns the number of clip types where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching clip types
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CLIPTYPE_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "clipType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "clipType.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "clipType.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(clipType.language IS NULL OR clipType.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMenu",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, ClipTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMenu",
			new String[] { String.class.getName() },
			ClipTypeModelImpl.ID_COLUMN_BITMASK |
			ClipTypeModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MENU = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMenu",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByMenu",
			new String[] { String.class.getName() });

	/**
	 * Returns all the clip types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String id) {
		return findByMenu(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clip types where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @return the range of matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String id, int start, int end) {
		return findByMenu(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clip types where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String id, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return findByMenu(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clip types where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String id, int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { id, start, end, orderByComparator };
		}

		List<ClipType> list = null;

		if (retrieveFromCache) {
			list = (List<ClipType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ClipType clipType : list) {
					if (!Objects.equals(id, clipType.getId())) {
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

			query.append(_SQL_SELECT_CLIPTYPE_WHERE);

			boolean bindId = false;

			if (id == null) {
				query.append(_FINDER_COLUMN_MENU_ID_1);
			}
			else if (id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MENU_ID_3);
			}
			else {
				bindId = true;

				query.append(_FINDER_COLUMN_MENU_ID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindId) {
					qPos.add(id);
				}

				if (!pagination) {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first clip type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByMenu_First(String id,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByMenu_First(id, orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the first clip type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByMenu_First(String id,
		OrderByComparator<ClipType> orderByComparator) {
		List<ClipType> list = findByMenu(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type
	 * @throws NoSuchClipTypeException if a matching clip type could not be found
	 */
	@Override
	public ClipType findByMenu_Last(String id,
		OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByMenu_Last(id, orderByComparator);

		if (clipType != null) {
			return clipType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipTypeException(msg.toString());
	}

	/**
	 * Returns the last clip type in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	 */
	@Override
	public ClipType fetchByMenu_Last(String id,
		OrderByComparator<ClipType> orderByComparator) {
		int count = countByMenu(id);

		if (count == 0) {
			return null;
		}

		List<ClipType> list = findByMenu(id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns all the clip types where id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ids the IDs
	 * @return the matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String[] ids) {
		return findByMenu(ids, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clip types where id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ids the IDs
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @return the range of matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String[] ids, int start, int end) {
		return findByMenu(ids, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clip types where id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ids the IDs
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String[] ids, int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return findByMenu(ids, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clip types where id = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clip types
	 */
	@Override
	public List<ClipType> findByMenu(String[] ids, int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
		if (ids == null) {
			ids = new String[0];
		}
		else if (ids.length > 1) {
			ids = ArrayUtil.distinct(ids, NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(ids, NULL_SAFE_STRING_COMPARATOR);
		}

		if (ids.length == 1) {
			return findByMenu(ids[0], start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(ids) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(ids),
					
					start, end, orderByComparator
				};
		}

		List<ClipType> list = null;

		if (retrieveFromCache) {
			list = (List<ClipType>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ClipType clipType : list) {
					if (!ArrayUtil.contains(ids, clipType.getId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_CLIPTYPE_WHERE);

			if (ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < ids.length; i++) {
					String id = ids[i];

					if (id == null) {
						query.append(_FINDER_COLUMN_MENU_ID_1);
					}
					else if (id.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_MENU_ID_3);
					}
					else {
						query.append(_FINDER_COLUMN_MENU_ID_2);
					}

					if ((i + 1) < ids.length) {
						query.append(WHERE_OR);
					}
				}

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
				query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String id : ids) {
					if ((id != null) && !id.isEmpty()) {
						qPos.add(id);
					}
				}

				if (!pagination) {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the clip types where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByMenu(String id) {
		for (ClipType clipType : findByMenu(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(clipType);
		}
	}

	/**
	 * Returns the number of clip types where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching clip types
	 */
	@Override
	public int countByMenu(String id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MENU;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CLIPTYPE_WHERE);

			boolean bindId = false;

			if (id == null) {
				query.append(_FINDER_COLUMN_MENU_ID_1);
			}
			else if (id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MENU_ID_3);
			}
			else {
				bindId = true;

				query.append(_FINDER_COLUMN_MENU_ID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindId) {
					qPos.add(id);
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

	/**
	 * Returns the number of clip types where id = any &#63;.
	 *
	 * @param ids the IDs
	 * @return the number of matching clip types
	 */
	@Override
	public int countByMenu(String[] ids) {
		if (ids == null) {
			ids = new String[0];
		}
		else if (ids.length > 1) {
			ids = ArrayUtil.distinct(ids, NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(ids, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(ids) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_CLIPTYPE_WHERE);

			if (ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < ids.length; i++) {
					String id = ids[i];

					if (id == null) {
						query.append(_FINDER_COLUMN_MENU_ID_1);
					}
					else if (id.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_MENU_ID_3);
					}
					else {
						query.append(_FINDER_COLUMN_MENU_ID_2);
					}

					if ((i + 1) < ids.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String id : ids) {
					if ((id != null) && !id.isEmpty()) {
						qPos.add(id);
					}
				}

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

	private static final String _FINDER_COLUMN_MENU_ID_1 = "clipType.id IS NULL";
	private static final String _FINDER_COLUMN_MENU_ID_2 = "clipType.id = ?";
	private static final String _FINDER_COLUMN_MENU_ID_3 = "(clipType.id IS NULL OR clipType.id = '')";

	public ClipTypePersistenceImpl() {
		setModelClass(ClipType.class);
	}

	/**
	 * Caches the clip type in the entity cache if it is enabled.
	 *
	 * @param clipType the clip type
	 */
	@Override
	public void cacheResult(ClipType clipType) {
		entityCache.putResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey(), clipType);

		clipType.resetOriginalValues();
	}

	/**
	 * Caches the clip types in the entity cache if it is enabled.
	 *
	 * @param clipTypes the clip types
	 */
	@Override
	public void cacheResult(List<ClipType> clipTypes) {
		for (ClipType clipType : clipTypes) {
			if (entityCache.getResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
						ClipTypeImpl.class, clipType.getPrimaryKey()) == null) {
				cacheResult(clipType);
			}
			else {
				clipType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all clip types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ClipTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the clip type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ClipType clipType) {
		entityCache.removeResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ClipType> clipTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ClipType clipType : clipTypes) {
			entityCache.removeResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
				ClipTypeImpl.class, clipType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new clip type with the primary key. Does not add the clip type to the database.
	 *
	 * @param id the primary key for the new clip type
	 * @return the new clip type
	 */
	@Override
	public ClipType create(String id) {
		ClipType clipType = new ClipTypeImpl();

		clipType.setNew(true);
		clipType.setPrimaryKey(id);

		clipType.setCompanyId(companyProvider.getCompanyId());

		return clipType;
	}

	/**
	 * Removes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clip type
	 * @return the clip type that was removed
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType remove(String id) throws NoSuchClipTypeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clip type
	 * @return the clip type that was removed
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType remove(Serializable primaryKey)
		throws NoSuchClipTypeException {
		Session session = null;

		try {
			session = openSession();

			ClipType clipType = (ClipType)session.get(ClipTypeImpl.class,
					primaryKey);

			if (clipType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchClipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(clipType);
		}
		catch (NoSuchClipTypeException nsee) {
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
	protected ClipType removeImpl(ClipType clipType) {
		clipType = toUnwrappedModel(clipType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(clipType)) {
				clipType = (ClipType)session.get(ClipTypeImpl.class,
						clipType.getPrimaryKeyObj());
			}

			if (clipType != null) {
				session.delete(clipType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (clipType != null) {
			clearCache(clipType);
		}

		return clipType;
	}

	@Override
	public ClipType updateImpl(ClipType clipType) {
		clipType = toUnwrappedModel(clipType);

		boolean isNew = clipType.isNew();

		ClipTypeModelImpl clipTypeModelImpl = (ClipTypeModelImpl)clipType;

		Session session = null;

		try {
			session = openSession();

			if (clipType.isNew()) {
				session.save(clipType);

				clipType.setNew(false);
			}
			else {
				clipType = (ClipType)session.merge(clipType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ClipTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((clipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LANGUAGE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipTypeModelImpl.getOriginalLanguage(),
						clipTypeModelImpl.getOriginalActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LANGUAGE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LANGUAGE,
					args);

				args = new Object[] {
						clipTypeModelImpl.getLanguage(),
						clipTypeModelImpl.getActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LANGUAGE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LANGUAGE,
					args);
			}

			if ((clipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipTypeModelImpl.getOriginalGroupId(),
						clipTypeModelImpl.getOriginalLanguage(),
						clipTypeModelImpl.getOriginalActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A,
					args);

				args = new Object[] {
						clipTypeModelImpl.getGroupId(),
						clipTypeModelImpl.getLanguage(),
						clipTypeModelImpl.getActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A,
					args);
			}

			if ((clipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipTypeModelImpl.getOriginalGroupId(),
						clipTypeModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						clipTypeModelImpl.getGroupId(),
						clipTypeModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((clipTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { clipTypeModelImpl.getOriginalId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);

				args = new Object[] { clipTypeModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);
			}
		}

		entityCache.putResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey(), clipType, false);

		clipType.resetOriginalValues();

		return clipType;
	}

	protected ClipType toUnwrappedModel(ClipType clipType) {
		if (clipType instanceof ClipTypeImpl) {
			return clipType;
		}

		ClipTypeImpl clipTypeImpl = new ClipTypeImpl();

		clipTypeImpl.setNew(clipType.isNew());
		clipTypeImpl.setPrimaryKey(clipType.getPrimaryKey());

		clipTypeImpl.setId(clipType.getId());
		clipTypeImpl.setGroupId(clipType.getGroupId());
		clipTypeImpl.setCompanyId(clipType.getCompanyId());
		clipTypeImpl.setUserId(clipType.getUserId());
		clipTypeImpl.setCreatedDate(clipType.getCreatedDate());
		clipTypeImpl.setModifiedDate(clipType.getModifiedDate());
		clipTypeImpl.setTitle(clipType.getTitle());
		clipTypeImpl.setName(clipType.getName());
		clipTypeImpl.setDescription(clipType.getDescription());
		clipTypeImpl.setActive(clipType.isActive());
		clipTypeImpl.setLanguage(clipType.getLanguage());

		return clipTypeImpl;
	}

	/**
	 * Returns the clip type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip type
	 * @return the clip type
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchClipTypeException {
		ClipType clipType = fetchByPrimaryKey(primaryKey);

		if (clipType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchClipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return clipType;
	}

	/**
	 * Returns the clip type with the primary key or throws a {@link NoSuchClipTypeException} if it could not be found.
	 *
	 * @param id the primary key of the clip type
	 * @return the clip type
	 * @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType findByPrimaryKey(String id) throws NoSuchClipTypeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the clip type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip type
	 * @return the clip type, or <code>null</code> if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
				ClipTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ClipType clipType = (ClipType)serializable;

		if (clipType == null) {
			Session session = null;

			try {
				session = openSession();

				clipType = (ClipType)session.get(ClipTypeImpl.class, primaryKey);

				if (clipType != null) {
					cacheResult(clipType);
				}
				else {
					entityCache.putResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
						ClipTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
					ClipTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return clipType;
	}

	/**
	 * Returns the clip type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the clip type
	 * @return the clip type, or <code>null</code> if a clip type with the primary key could not be found
	 */
	@Override
	public ClipType fetchByPrimaryKey(String id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ClipType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ClipType> map = new HashMap<Serializable, ClipType>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ClipType clipType = fetchByPrimaryKey(primaryKey);

			if (clipType != null) {
				map.put(primaryKey, clipType);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
					ClipTypeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ClipType)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_CLIPTYPE_WHERE_PKS_IN);

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

			for (ClipType clipType : (List<ClipType>)q.list()) {
				map.put(clipType.getPrimaryKeyObj(), clipType);

				cacheResult(clipType);

				uncachedPrimaryKeys.remove(clipType.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
					ClipTypeImpl.class, primaryKey, nullModel);
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
	 * Returns all the clip types.
	 *
	 * @return the clip types
	 */
	@Override
	public List<ClipType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clip types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @return the range of clip types
	 */
	@Override
	public List<ClipType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the clip types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clip types
	 */
	@Override
	public List<ClipType> findAll(int start, int end,
		OrderByComparator<ClipType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clip types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clip types
	 * @param end the upper bound of the range of clip types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of clip types
	 */
	@Override
	public List<ClipType> findAll(int start, int end,
		OrderByComparator<ClipType> orderByComparator, boolean retrieveFromCache) {
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

		List<ClipType> list = null;

		if (retrieveFromCache) {
			list = (List<ClipType>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CLIPTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLIPTYPE;

				if (pagination) {
					sql = sql.concat(ClipTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the clip types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ClipType clipType : findAll()) {
			remove(clipType);
		}
	}

	/**
	 * Returns the number of clip types.
	 *
	 * @return the number of clip types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CLIPTYPE);

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
		return ClipTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the clip type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ClipTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_CLIPTYPE = "SELECT clipType FROM ClipType clipType";
	private static final String _SQL_SELECT_CLIPTYPE_WHERE_PKS_IN = "SELECT clipType FROM ClipType clipType WHERE id_ IN (";
	private static final String _SQL_SELECT_CLIPTYPE_WHERE = "SELECT clipType FROM ClipType clipType WHERE ";
	private static final String _SQL_COUNT_CLIPTYPE = "SELECT COUNT(clipType) FROM ClipType clipType";
	private static final String _SQL_COUNT_CLIPTYPE_WHERE = "SELECT COUNT(clipType) FROM ClipType clipType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "clipType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ClipType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ClipType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ClipTypePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "active"
			});
}