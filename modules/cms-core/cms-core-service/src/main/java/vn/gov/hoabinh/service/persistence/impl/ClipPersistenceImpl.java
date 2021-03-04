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

import vn.gov.hoabinh.exception.NoSuchClipException;
import vn.gov.hoabinh.model.Clip;
import vn.gov.hoabinh.model.impl.ClipImpl;
import vn.gov.hoabinh.model.impl.ClipModelImpl;
import vn.gov.hoabinh.service.persistence.ClipPersistence;

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
 * The persistence implementation for the clip service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipPersistence
 * @see vn.gov.hoabinh.service.persistence.ClipUtil
 * @generated
 */
@ProviderType
public class ClipPersistenceImpl extends BasePersistenceImpl<Clip>
	implements ClipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ClipUtil} to access the clip persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ClipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			ClipModelImpl.GROUPID_COLUMN_BITMASK |
			ClipModelImpl.LANGUAGE_COLUMN_BITMASK |
			ClipModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the clips where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByG_L(long groupId, String language, int start,
		int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<Clip> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<Clip> orderByComparator,
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

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if ((groupId != clip.getGroupId()) ||
							!Objects.equals(language, clip.getLanguage())) {
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

			query.append(_SQL_SELECT_CLIP_WHERE);

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
				query.append(ClipModelImpl.ORDER_BY_JPQL);
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
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first clip in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByG_L_First(long groupId, String language,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByG_L_First(groupId, language, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the first clip in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByG_L_First(long groupId, String language,
		OrderByComparator<Clip> orderByComparator) {
		List<Clip> list = findByG_L(groupId, language, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByG_L_Last(long groupId, String language,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByG_L_Last(groupId, language, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the last clip in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByG_L_Last(long groupId, String language,
		OrderByComparator<Clip> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<Clip> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param id the primary key of the current clip
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip[] findByG_L_PrevAndNext(String id, long groupId,
		String language, OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByG_L_PrevAndNext(session, clip, groupId, language,
					orderByComparator, true);

			array[1] = clip;

			array[2] = getByG_L_PrevAndNext(session, clip, groupId, language,
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

	protected Clip getByG_L_PrevAndNext(Session session, Clip clip,
		long groupId, String language,
		OrderByComparator<Clip> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CLIP_WHERE);

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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clips where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (Clip clip : findByG_L(groupId, language, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching clips
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CLIP_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "clip.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "clip.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "clip.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(clip.language IS NULL OR clip.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_A = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			ClipModelImpl.GROUPID_COLUMN_BITMASK |
			ClipModelImpl.LANGUAGE_COLUMN_BITMASK |
			ClipModelImpl.ACTIVE_COLUMN_BITMASK |
			ClipModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_A = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByG_L_A(long groupId, String language, boolean active) {
		return findByG_L_A(groupId, language, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByG_L_A(long groupId, String language,
		boolean active, int start, int end) {
		return findByG_L_A(groupId, language, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByG_L_A(long groupId, String language,
		boolean active, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findByG_L_A(groupId, language, active, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByG_L_A(long groupId, String language,
		boolean active, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
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

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if ((groupId != clip.getGroupId()) ||
							!Objects.equals(language, clip.getLanguage()) ||
							(active != clip.getActive())) {
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

			query.append(_SQL_SELECT_CLIP_WHERE);

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
				query.append(ClipModelImpl.ORDER_BY_JPQL);
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
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByG_L_A_First(long groupId, String language,
		boolean active, OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException {
		Clip clip = fetchByG_L_A_First(groupId, language, active,
				orderByComparator);

		if (clip != null) {
			return clip;
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

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByG_L_A_First(long groupId, String language,
		boolean active, OrderByComparator<Clip> orderByComparator) {
		List<Clip> list = findByG_L_A(groupId, language, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByG_L_A_Last(long groupId, String language, boolean active,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByG_L_A_Last(groupId, language, active,
				orderByComparator);

		if (clip != null) {
			return clip;
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

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByG_L_A_Last(long groupId, String language,
		boolean active, OrderByComparator<Clip> orderByComparator) {
		int count = countByG_L_A(groupId, language, active);

		if (count == 0) {
			return null;
		}

		List<Clip> list = findByG_L_A(groupId, language, active, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param id the primary key of the current clip
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip[] findByG_L_A_PrevAndNext(String id, long groupId,
		String language, boolean active,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByG_L_A_PrevAndNext(session, clip, groupId, language,
					active, orderByComparator, true);

			array[1] = clip;

			array[2] = getByG_L_A_PrevAndNext(session, clip, groupId, language,
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

	protected Clip getByG_L_A_PrevAndNext(Session session, Clip clip,
		long groupId, String language, boolean active,
		OrderByComparator<Clip> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_CLIP_WHERE);

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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clips where groupId = &#63; and language = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 */
	@Override
	public void removeByG_L_A(long groupId, String language, boolean active) {
		for (Clip clip : findByG_L_A(groupId, language, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips where groupId = &#63; and language = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param active the active
	 * @return the number of matching clips
	 */
	@Override
	public int countByG_L_A(long groupId, String language, boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_A;

		Object[] finderArgs = new Object[] { groupId, language, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CLIP_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_A_GROUPID_2 = "clip.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_1 = "clip.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_2 = "clip.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_3 = "(clip.language IS NULL OR clip.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_A_ACTIVE_2 = "clip.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			ClipModelImpl.GROUPID_COLUMN_BITMASK |
			ClipModelImpl.LANGUAGE_COLUMN_BITMASK |
			ClipModelImpl.CLIPTYPEID_COLUMN_BITMASK |
			ClipModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_T = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByG_L_T(long groupId, String language,
		String clipTypeId) {
		return findByG_L_T(groupId, language, clipTypeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByG_L_T(long groupId, String language,
		String clipTypeId, int start, int end) {
		return findByG_L_T(groupId, language, clipTypeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByG_L_T(long groupId, String language,
		String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findByG_L_T(groupId, language, clipTypeId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByG_L_T(long groupId, String language,
		String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T;
			finderArgs = new Object[] { groupId, language, clipTypeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_T;
			finderArgs = new Object[] {
					groupId, language, clipTypeId,
					
					start, end, orderByComparator
				};
		}

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if ((groupId != clip.getGroupId()) ||
							!Objects.equals(language, clip.getLanguage()) ||
							!Objects.equals(clipTypeId, clip.getClipTypeId())) {
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

			query.append(_SQL_SELECT_CLIP_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
			}

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipModelImpl.ORDER_BY_JPQL);
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

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
				}

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByG_L_T_First(long groupId, String language,
		String clipTypeId, OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException {
		Clip clip = fetchByG_L_T_First(groupId, language, clipTypeId,
				orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByG_L_T_First(long groupId, String language,
		String clipTypeId, OrderByComparator<Clip> orderByComparator) {
		List<Clip> list = findByG_L_T(groupId, language, clipTypeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByG_L_T_Last(long groupId, String language,
		String clipTypeId, OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException {
		Clip clip = fetchByG_L_T_Last(groupId, language, clipTypeId,
				orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByG_L_T_Last(long groupId, String language,
		String clipTypeId, OrderByComparator<Clip> orderByComparator) {
		int count = countByG_L_T(groupId, language, clipTypeId);

		if (count == 0) {
			return null;
		}

		List<Clip> list = findByG_L_T(groupId, language, clipTypeId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param id the primary key of the current clip
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip[] findByG_L_T_PrevAndNext(String id, long groupId,
		String language, String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByG_L_T_PrevAndNext(session, clip, groupId, language,
					clipTypeId, orderByComparator, true);

			array[1] = clip;

			array[2] = getByG_L_T_PrevAndNext(session, clip, groupId, language,
					clipTypeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Clip getByG_L_T_PrevAndNext(Session session, Clip clip,
		long groupId, String language, String clipTypeId,
		OrderByComparator<Clip> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_CLIP_WHERE);

		query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
		}

		boolean bindClipTypeId = false;

		if (clipTypeId == null) {
			query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_1);
		}
		else if (clipTypeId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_3);
		}
		else {
			bindClipTypeId = true;

			query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_2);
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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
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

		if (bindClipTypeId) {
			qPos.add(clipTypeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 */
	@Override
	public void removeByG_L_T(long groupId, String language, String clipTypeId) {
		for (Clip clip : findByG_L_T(groupId, language, clipTypeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param clipTypeId the clip type ID
	 * @return the number of matching clips
	 */
	@Override
	public int countByG_L_T(long groupId, String language, String clipTypeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_T;

		Object[] finderArgs = new Object[] { groupId, language, clipTypeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CLIP_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
			}

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_G_L_T_CLIPTYPEID_2);
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

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
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

	private static final String _FINDER_COLUMN_G_L_T_GROUPID_2 = "clip.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_1 = "clip.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_2 = "clip.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_3 = "(clip.language IS NULL OR clip.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_T_CLIPTYPEID_1 = "clip.clipTypeId IS NULL";
	private static final String _FINDER_COLUMN_G_L_T_CLIPTYPEID_2 = "clip.clipTypeId = ?";
	private static final String _FINDER_COLUMN_G_L_T_CLIPTYPEID_3 = "(clip.clipTypeId IS NULL OR clip.clipTypeId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPTYPEID =
		new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByClipTypeId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPTYPEID =
		new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByClipTypeId",
			new String[] { String.class.getName() },
			ClipModelImpl.CLIPTYPEID_COLUMN_BITMASK |
			ClipModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CLIPTYPEID = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByClipTypeId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByClipTypeId(String clipTypeId) {
		return findByClipTypeId(clipTypeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByClipTypeId(String clipTypeId, int start, int end) {
		return findByClipTypeId(clipTypeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByClipTypeId(String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findByClipTypeId(clipTypeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByClipTypeId(String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPTYPEID;
			finderArgs = new Object[] { clipTypeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPTYPEID;
			finderArgs = new Object[] { clipTypeId, start, end, orderByComparator };
		}

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if (!Objects.equals(clipTypeId, clip.getClipTypeId())) {
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

			query.append(_SQL_SELECT_CLIP_WHERE);

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
				}

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByClipTypeId_First(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByClipTypeId_First(clipTypeId, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByClipTypeId_First(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		List<Clip> list = findByClipTypeId(clipTypeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByClipTypeId_Last(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByClipTypeId_Last(clipTypeId, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByClipTypeId_Last(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		int count = countByClipTypeId(clipTypeId);

		if (count == 0) {
			return null;
		}

		List<Clip> list = findByClipTypeId(clipTypeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param id the primary key of the current clip
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip[] findByClipTypeId_PrevAndNext(String id, String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByClipTypeId_PrevAndNext(session, clip, clipTypeId,
					orderByComparator, true);

			array[1] = clip;

			array[2] = getByClipTypeId_PrevAndNext(session, clip, clipTypeId,
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

	protected Clip getByClipTypeId_PrevAndNext(Session session, Clip clip,
		String clipTypeId, OrderByComparator<Clip> orderByComparator,
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

		query.append(_SQL_SELECT_CLIP_WHERE);

		boolean bindClipTypeId = false;

		if (clipTypeId == null) {
			query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1);
		}
		else if (clipTypeId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3);
		}
		else {
			bindClipTypeId = true;

			query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2);
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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindClipTypeId) {
			qPos.add(clipTypeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the clips where clipTypeId = &#63; from the database.
	 *
	 * @param clipTypeId the clip type ID
	 */
	@Override
	public void removeByClipTypeId(String clipTypeId) {
		for (Clip clip : findByClipTypeId(clipTypeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @return the number of matching clips
	 */
	@Override
	public int countByClipTypeId(String clipTypeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CLIPTYPEID;

		Object[] finderArgs = new Object[] { clipTypeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CLIP_WHERE);

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
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

	private static final String _FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1 = "clip.clipTypeId IS NULL";
	private static final String _FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2 = "clip.clipTypeId = ?";
	private static final String _FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3 = "(clip.clipTypeId IS NULL OR clip.clipTypeId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMenu",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMenu",
			new String[] { String.class.getName() },
			ClipModelImpl.CLIPTYPEID_COLUMN_BITMASK |
			ClipModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MENU = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMenu",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByMenu",
			new String[] { String.class.getName() });

	/**
	 * Returns all the clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByMenu(String clipTypeId) {
		return findByMenu(clipTypeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByMenu(String clipTypeId, int start, int end) {
		return findByMenu(clipTypeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByMenu(String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findByMenu(clipTypeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByMenu(String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { clipTypeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { clipTypeId, start, end, orderByComparator };
		}

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if (!Objects.equals(clipTypeId, clip.getClipTypeId())) {
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

			query.append(_SQL_SELECT_CLIP_WHERE);

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
				}

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByMenu_First(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByMenu_First(clipTypeId, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByMenu_First(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		List<Clip> list = findByMenu(clipTypeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByMenu_Last(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByMenu_Last(clipTypeId, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByMenu_Last(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		int count = countByMenu(clipTypeId);

		if (count == 0) {
			return null;
		}

		List<Clip> list = findByMenu(clipTypeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param id the primary key of the current clip
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip[] findByMenu_PrevAndNext(String id, String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByMenu_PrevAndNext(session, clip, clipTypeId,
					orderByComparator, true);

			array[1] = clip;

			array[2] = getByMenu_PrevAndNext(session, clip, clipTypeId,
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

	protected Clip getByMenu_PrevAndNext(Session session, Clip clip,
		String clipTypeId, OrderByComparator<Clip> orderByComparator,
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

		query.append(_SQL_SELECT_CLIP_WHERE);

		boolean bindClipTypeId = false;

		if (clipTypeId == null) {
			query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_1);
		}
		else if (clipTypeId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_3);
		}
		else {
			bindClipTypeId = true;

			query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_2);
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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindClipTypeId) {
			qPos.add(clipTypeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the clips where clipTypeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeIds the clip type IDs
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByMenu(String[] clipTypeIds) {
		return findByMenu(clipTypeIds, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the clips where clipTypeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeIds the clip type IDs
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByMenu(String[] clipTypeIds, int start, int end) {
		return findByMenu(clipTypeIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeIds the clip type IDs
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByMenu(String[] clipTypeIds, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findByMenu(clipTypeIds, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByMenu(String[] clipTypeIds, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		if (clipTypeIds == null) {
			clipTypeIds = new String[0];
		}
		else if (clipTypeIds.length > 1) {
			clipTypeIds = ArrayUtil.distinct(clipTypeIds,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(clipTypeIds, NULL_SAFE_STRING_COMPARATOR);
		}

		if (clipTypeIds.length == 1) {
			return findByMenu(clipTypeIds[0], start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(clipTypeIds) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(clipTypeIds),
					
					start, end, orderByComparator
				};
		}

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if (!ArrayUtil.contains(clipTypeIds, clip.getClipTypeId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_CLIP_WHERE);

			if (clipTypeIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < clipTypeIds.length; i++) {
					String clipTypeId = clipTypeIds[i];

					if (clipTypeId == null) {
						query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_1);
					}
					else if (clipTypeId.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_3);
					}
					else {
						query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_2);
					}

					if ((i + 1) < clipTypeIds.length) {
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
				query.append(ClipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String clipTypeId : clipTypeIds) {
					if ((clipTypeId != null) && !clipTypeId.isEmpty()) {
						qPos.add(clipTypeId);
					}
				}

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the clips where clipTypeId = &#63; from the database.
	 *
	 * @param clipTypeId the clip type ID
	 */
	@Override
	public void removeByMenu(String clipTypeId) {
		for (Clip clip : findByMenu(clipTypeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @return the number of matching clips
	 */
	@Override
	public int countByMenu(String clipTypeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MENU;

		Object[] finderArgs = new Object[] { clipTypeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CLIP_WHERE);

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
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
	 * Returns the number of clips where clipTypeId = any &#63;.
	 *
	 * @param clipTypeIds the clip type IDs
	 * @return the number of matching clips
	 */
	@Override
	public int countByMenu(String[] clipTypeIds) {
		if (clipTypeIds == null) {
			clipTypeIds = new String[0];
		}
		else if (clipTypeIds.length > 1) {
			clipTypeIds = ArrayUtil.distinct(clipTypeIds,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(clipTypeIds, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(clipTypeIds) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_CLIP_WHERE);

			if (clipTypeIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < clipTypeIds.length; i++) {
					String clipTypeId = clipTypeIds[i];

					if (clipTypeId == null) {
						query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_1);
					}
					else if (clipTypeId.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_3);
					}
					else {
						query.append(_FINDER_COLUMN_MENU_CLIPTYPEID_2);
					}

					if ((i + 1) < clipTypeIds.length) {
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

				for (String clipTypeId : clipTypeIds) {
					if ((clipTypeId != null) && !clipTypeId.isEmpty()) {
						qPos.add(clipTypeId);
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

	private static final String _FINDER_COLUMN_MENU_CLIPTYPEID_1 = "clip.clipTypeId IS NULL";
	private static final String _FINDER_COLUMN_MENU_CLIPTYPEID_2 = "clip.clipTypeId = ?";
	private static final String _FINDER_COLUMN_MENU_CLIPTYPEID_3 = "(clip.clipTypeId IS NULL OR clip.clipTypeId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPDISPLAY =
		new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByClipDisplay",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPDISPLAY =
		new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, ClipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByClipDisplay",
			new String[] { String.class.getName() },
			ClipModelImpl.CLIPTYPEID_COLUMN_BITMASK |
			ClipModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CLIPDISPLAY = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByClipDisplay",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_CLIPDISPLAY =
		new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByClipDisplay",
			new String[] { String.class.getName() });

	/**
	 * Returns all the clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String clipTypeId) {
		return findByClipDisplay(clipTypeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String clipTypeId, int start, int end) {
		return findByClipDisplay(clipTypeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findByClipDisplay(clipTypeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String clipTypeId, int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPDISPLAY;
			finderArgs = new Object[] { clipTypeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPDISPLAY;
			finderArgs = new Object[] { clipTypeId, start, end, orderByComparator };
		}

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if (!Objects.equals(clipTypeId, clip.getClipTypeId())) {
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

			query.append(_SQL_SELECT_CLIP_WHERE);

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ClipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
				}

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByClipDisplay_First(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByClipDisplay_First(clipTypeId, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByClipDisplay_First(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		List<Clip> list = findByClipDisplay(clipTypeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip
	 * @throws NoSuchClipException if a matching clip could not be found
	 */
	@Override
	public Clip findByClipDisplay_Last(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = fetchByClipDisplay_Last(clipTypeId, orderByComparator);

		if (clip != null) {
			return clip;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("clipTypeId=");
		msg.append(clipTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchClipException(msg.toString());
	}

	/**
	 * Returns the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching clip, or <code>null</code> if a matching clip could not be found
	 */
	@Override
	public Clip fetchByClipDisplay_Last(String clipTypeId,
		OrderByComparator<Clip> orderByComparator) {
		int count = countByClipDisplay(clipTypeId);

		if (count == 0) {
			return null;
		}

		List<Clip> list = findByClipDisplay(clipTypeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	 *
	 * @param id the primary key of the current clip
	 * @param clipTypeId the clip type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip[] findByClipDisplay_PrevAndNext(String id, String clipTypeId,
		OrderByComparator<Clip> orderByComparator) throws NoSuchClipException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByClipDisplay_PrevAndNext(session, clip, clipTypeId,
					orderByComparator, true);

			array[1] = clip;

			array[2] = getByClipDisplay_PrevAndNext(session, clip, clipTypeId,
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

	protected Clip getByClipDisplay_PrevAndNext(Session session, Clip clip,
		String clipTypeId, OrderByComparator<Clip> orderByComparator,
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

		query.append(_SQL_SELECT_CLIP_WHERE);

		boolean bindClipTypeId = false;

		if (clipTypeId == null) {
			query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_1);
		}
		else if (clipTypeId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_3);
		}
		else {
			bindClipTypeId = true;

			query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_2);
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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindClipTypeId) {
			qPos.add(clipTypeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the clips where clipTypeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeIds the clip type IDs
	 * @return the matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String[] clipTypeIds) {
		return findByClipDisplay(clipTypeIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips where clipTypeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeIds the clip type IDs
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String[] clipTypeIds, int start, int end) {
		return findByClipDisplay(clipTypeIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeIds the clip type IDs
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String[] clipTypeIds, int start,
		int end, OrderByComparator<Clip> orderByComparator) {
		return findByClipDisplay(clipTypeIds, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the clips where clipTypeId = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param clipTypeId the clip type ID
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching clips
	 */
	@Override
	public List<Clip> findByClipDisplay(String[] clipTypeIds, int start,
		int end, OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache) {
		if (clipTypeIds == null) {
			clipTypeIds = new String[0];
		}
		else if (clipTypeIds.length > 1) {
			clipTypeIds = ArrayUtil.distinct(clipTypeIds,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(clipTypeIds, NULL_SAFE_STRING_COMPARATOR);
		}

		if (clipTypeIds.length == 1) {
			return findByClipDisplay(clipTypeIds[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(clipTypeIds) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(clipTypeIds),
					
					start, end, orderByComparator
				};
		}

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPDISPLAY,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Clip clip : list) {
					if (!ArrayUtil.contains(clipTypeIds, clip.getClipTypeId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_CLIP_WHERE);

			if (clipTypeIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < clipTypeIds.length; i++) {
					String clipTypeId = clipTypeIds[i];

					if (clipTypeId == null) {
						query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_1);
					}
					else if (clipTypeId.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_3);
					}
					else {
						query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_2);
					}

					if ((i + 1) < clipTypeIds.length) {
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
				query.append(ClipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String clipTypeId : clipTypeIds) {
					if ((clipTypeId != null) && !clipTypeId.isEmpty()) {
						qPos.add(clipTypeId);
					}
				}

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPDISPLAY,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_CLIPDISPLAY,
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
	 * Removes all the clips where clipTypeId = &#63; from the database.
	 *
	 * @param clipTypeId the clip type ID
	 */
	@Override
	public void removeByClipDisplay(String clipTypeId) {
		for (Clip clip : findByClipDisplay(clipTypeId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type ID
	 * @return the number of matching clips
	 */
	@Override
	public int countByClipDisplay(String clipTypeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CLIPDISPLAY;

		Object[] finderArgs = new Object[] { clipTypeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CLIP_WHERE);

			boolean bindClipTypeId = false;

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_1);
			}
			else if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_3);
			}
			else {
				bindClipTypeId = true;

				query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClipTypeId) {
					qPos.add(clipTypeId);
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
	 * Returns the number of clips where clipTypeId = any &#63;.
	 *
	 * @param clipTypeIds the clip type IDs
	 * @return the number of matching clips
	 */
	@Override
	public int countByClipDisplay(String[] clipTypeIds) {
		if (clipTypeIds == null) {
			clipTypeIds = new String[0];
		}
		else if (clipTypeIds.length > 1) {
			clipTypeIds = ArrayUtil.distinct(clipTypeIds,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(clipTypeIds, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(clipTypeIds) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_CLIPDISPLAY,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_CLIP_WHERE);

			if (clipTypeIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < clipTypeIds.length; i++) {
					String clipTypeId = clipTypeIds[i];

					if (clipTypeId == null) {
						query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_1);
					}
					else if (clipTypeId.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_3);
					}
					else {
						query.append(_FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_2);
					}

					if ((i + 1) < clipTypeIds.length) {
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

				for (String clipTypeId : clipTypeIds) {
					if ((clipTypeId != null) && !clipTypeId.isEmpty()) {
						qPos.add(clipTypeId);
					}
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_CLIPDISPLAY,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_CLIPDISPLAY,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_1 = "clip.clipTypeId IS NULL";
	private static final String _FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_2 = "clip.clipTypeId = ?";
	private static final String _FINDER_COLUMN_CLIPDISPLAY_CLIPTYPEID_3 = "(clip.clipTypeId IS NULL OR clip.clipTypeId = '')";

	public ClipPersistenceImpl() {
		setModelClass(Clip.class);
	}

	/**
	 * Caches the clip in the entity cache if it is enabled.
	 *
	 * @param clip the clip
	 */
	@Override
	public void cacheResult(Clip clip) {
		entityCache.putResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey(), clip);

		clip.resetOriginalValues();
	}

	/**
	 * Caches the clips in the entity cache if it is enabled.
	 *
	 * @param clips the clips
	 */
	@Override
	public void cacheResult(List<Clip> clips) {
		for (Clip clip : clips) {
			if (entityCache.getResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
						ClipImpl.class, clip.getPrimaryKey()) == null) {
				cacheResult(clip);
			}
			else {
				clip.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all clips.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ClipImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the clip.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Clip clip) {
		entityCache.removeResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Clip> clips) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Clip clip : clips) {
			entityCache.removeResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
				ClipImpl.class, clip.getPrimaryKey());
		}
	}

	/**
	 * Creates a new clip with the primary key. Does not add the clip to the database.
	 *
	 * @param id the primary key for the new clip
	 * @return the new clip
	 */
	@Override
	public Clip create(String id) {
		Clip clip = new ClipImpl();

		clip.setNew(true);
		clip.setPrimaryKey(id);

		clip.setCompanyId(companyProvider.getCompanyId());

		return clip;
	}

	/**
	 * Removes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clip
	 * @return the clip that was removed
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip remove(String id) throws NoSuchClipException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clip
	 * @return the clip that was removed
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip remove(Serializable primaryKey) throws NoSuchClipException {
		Session session = null;

		try {
			session = openSession();

			Clip clip = (Clip)session.get(ClipImpl.class, primaryKey);

			if (clip == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchClipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(clip);
		}
		catch (NoSuchClipException nsee) {
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
	protected Clip removeImpl(Clip clip) {
		clip = toUnwrappedModel(clip);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(clip)) {
				clip = (Clip)session.get(ClipImpl.class, clip.getPrimaryKeyObj());
			}

			if (clip != null) {
				session.delete(clip);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (clip != null) {
			clearCache(clip);
		}

		return clip;
	}

	@Override
	public Clip updateImpl(Clip clip) {
		clip = toUnwrappedModel(clip);

		boolean isNew = clip.isNew();

		ClipModelImpl clipModelImpl = (ClipModelImpl)clip;

		Session session = null;

		try {
			session = openSession();

			if (clip.isNew()) {
				session.save(clip);

				clip.setNew(false);
			}
			else {
				clip = (Clip)session.merge(clip);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ClipModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((clipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipModelImpl.getOriginalGroupId(),
						clipModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						clipModelImpl.getGroupId(), clipModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((clipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipModelImpl.getOriginalGroupId(),
						clipModelImpl.getOriginalLanguage(),
						clipModelImpl.getOriginalActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A,
					args);

				args = new Object[] {
						clipModelImpl.getGroupId(), clipModelImpl.getLanguage(),
						clipModelImpl.getActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A,
					args);
			}

			if ((clipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipModelImpl.getOriginalGroupId(),
						clipModelImpl.getOriginalLanguage(),
						clipModelImpl.getOriginalClipTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T,
					args);

				args = new Object[] {
						clipModelImpl.getGroupId(), clipModelImpl.getLanguage(),
						clipModelImpl.getClipTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_T,
					args);
			}

			if ((clipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPTYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipModelImpl.getOriginalClipTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CLIPTYPEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPTYPEID,
					args);

				args = new Object[] { clipModelImpl.getClipTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CLIPTYPEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPTYPEID,
					args);
			}

			if ((clipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipModelImpl.getOriginalClipTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);

				args = new Object[] { clipModelImpl.getClipTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);
			}

			if ((clipModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPDISPLAY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						clipModelImpl.getOriginalClipTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CLIPDISPLAY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPDISPLAY,
					args);

				args = new Object[] { clipModelImpl.getClipTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CLIPDISPLAY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLIPDISPLAY,
					args);
			}
		}

		entityCache.putResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey(), clip, false);

		clip.resetOriginalValues();

		return clip;
	}

	protected Clip toUnwrappedModel(Clip clip) {
		if (clip instanceof ClipImpl) {
			return clip;
		}

		ClipImpl clipImpl = new ClipImpl();

		clipImpl.setNew(clip.isNew());
		clipImpl.setPrimaryKey(clip.getPrimaryKey());

		clipImpl.setId(clip.getId());
		clipImpl.setClipTypeId(clip.getClipTypeId());
		clipImpl.setGroupId(clip.getGroupId());
		clipImpl.setCompanyId(clip.getCompanyId());
		clipImpl.setUserId(clip.getUserId());
		clipImpl.setCreatedDate(clip.getCreatedDate());
		clipImpl.setModifiedDate(clip.getModifiedDate());
		clipImpl.setUrl(clip.getUrl());
		clipImpl.setName(clip.getName());
		clipImpl.setTitle(clip.getTitle());
		clipImpl.setImage(clip.getImage());
		clipImpl.setDescription(clip.getDescription());
		clipImpl.setActive(clip.isActive());
		clipImpl.setLanguage(clip.getLanguage());
		clipImpl.setHitcount(clip.getHitcount());
		clipImpl.setHitcountview(clip.getHitcountview());

		return clipImpl;
	}

	/**
	 * Returns the clip with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip
	 * @return the clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip findByPrimaryKey(Serializable primaryKey)
		throws NoSuchClipException {
		Clip clip = fetchByPrimaryKey(primaryKey);

		if (clip == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchClipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return clip;
	}

	/**
	 * Returns the clip with the primary key or throws a {@link NoSuchClipException} if it could not be found.
	 *
	 * @param id the primary key of the clip
	 * @return the clip
	 * @throws NoSuchClipException if a clip with the primary key could not be found
	 */
	@Override
	public Clip findByPrimaryKey(String id) throws NoSuchClipException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the clip with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip
	 * @return the clip, or <code>null</code> if a clip with the primary key could not be found
	 */
	@Override
	public Clip fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
				ClipImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Clip clip = (Clip)serializable;

		if (clip == null) {
			Session session = null;

			try {
				session = openSession();

				clip = (Clip)session.get(ClipImpl.class, primaryKey);

				if (clip != null) {
					cacheResult(clip);
				}
				else {
					entityCache.putResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
						ClipImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
					ClipImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return clip;
	}

	/**
	 * Returns the clip with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the clip
	 * @return the clip, or <code>null</code> if a clip with the primary key could not be found
	 */
	@Override
	public Clip fetchByPrimaryKey(String id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Clip> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Clip> map = new HashMap<Serializable, Clip>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Clip clip = fetchByPrimaryKey(primaryKey);

			if (clip != null) {
				map.put(primaryKey, clip);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
					ClipImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Clip)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_CLIP_WHERE_PKS_IN);

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

			for (Clip clip : (List<Clip>)q.list()) {
				map.put(clip.getPrimaryKeyObj(), clip);

				cacheResult(clip);

				uncachedPrimaryKeys.remove(clip.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
					ClipImpl.class, primaryKey, nullModel);
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
	 * Returns all the clips.
	 *
	 * @return the clips
	 */
	@Override
	public List<Clip> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clips.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @return the range of clips
	 */
	@Override
	public List<Clip> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the clips.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clips
	 */
	@Override
	public List<Clip> findAll(int start, int end,
		OrderByComparator<Clip> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the clips.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clips
	 * @param end the upper bound of the range of clips (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of clips
	 */
	@Override
	public List<Clip> findAll(int start, int end,
		OrderByComparator<Clip> orderByComparator, boolean retrieveFromCache) {
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

		List<Clip> list = null;

		if (retrieveFromCache) {
			list = (List<Clip>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CLIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLIP;

				if (pagination) {
					sql = sql.concat(ClipModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the clips from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Clip clip : findAll()) {
			remove(clip);
		}
	}

	/**
	 * Returns the number of clips.
	 *
	 * @return the number of clips
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CLIP);

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
		return ClipModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the clip persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ClipImpl.class.getName());
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
	private static final String _SQL_SELECT_CLIP = "SELECT clip FROM Clip clip";
	private static final String _SQL_SELECT_CLIP_WHERE_PKS_IN = "SELECT clip FROM Clip clip WHERE id_ IN (";
	private static final String _SQL_SELECT_CLIP_WHERE = "SELECT clip FROM Clip clip WHERE ";
	private static final String _SQL_COUNT_CLIP = "SELECT COUNT(clip) FROM Clip clip";
	private static final String _SQL_COUNT_CLIP_WHERE = "SELECT COUNT(clip) FROM Clip clip WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "clip.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Clip exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Clip exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ClipPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "active"
			});
}