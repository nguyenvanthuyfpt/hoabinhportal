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

import vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException;
import vn.gov.hoabinh.model.VcmsDiscussion;
import vn.gov.hoabinh.model.impl.VcmsDiscussionImpl;
import vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsDiscussionPersistence;

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
 * The persistence implementation for the vcms discussion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsDiscussionPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsDiscussionUtil
 * @generated
 */
@ProviderType
public class VcmsDiscussionPersistenceImpl extends BasePersistenceImpl<VcmsDiscussion>
	implements VcmsDiscussionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsDiscussionUtil} to access the vcms discussion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsDiscussionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsDiscussionModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.POSTEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L(long groupId, String language) {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @return the range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L(long groupId, String language,
		int start, int end) {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L(long groupId, String language,
		int start, int end, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return findByP_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L(long groupId, String language,
		int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VcmsDiscussion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsDiscussion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsDiscussion vcmsDiscussion : list) {
					if ((groupId != vcmsDiscussion.getGroupId()) ||
							!Objects.equals(language,
								vcmsDiscussion.getLanguage())) {
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByP_L_First(long groupId, String language,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByP_L_First(groupId, language,
				orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByP_L_First(long groupId, String language,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		List<VcmsDiscussion> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByP_L_Last(long groupId, String language,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByP_L_Last(groupId, language,
				orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByP_L_Last(long groupId, String language,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		int count = countByP_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VcmsDiscussion> list = findByP_L(groupId, language, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms discussions before and after the current vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion[] findByP_L_PrevAndNext(String discussionId,
		long groupId, String language,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vcmsDiscussion, groupId,
					language, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByP_L_PrevAndNext(session, vcmsDiscussion, groupId,
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

	protected VcmsDiscussion getByP_L_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, long groupId, String language,
		OrderByComparator<VcmsDiscussion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		query.append(_FINDER_COLUMN_P_L_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms discussions where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByP_L(long groupId, String language) {
		for (VcmsDiscussion vcmsDiscussion : findByP_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Returns the number of vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vcms discussions
	 */
	@Override
	public int countByP_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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

	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vcmsDiscussion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vcmsDiscussion.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vcmsDiscussion.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vcmsDiscussion.language IS NULL OR vcmsDiscussion.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VcmsDiscussionModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.APPROVED_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.POSTEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved) {
		return findByP_L_A(groupId, language, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @return the range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved, int start, int end) {
		return findByP_L_A(groupId, language, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return findByP_L_A(groupId, language, approved, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A;
			finderArgs = new Object[] { groupId, language, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_A;
			finderArgs = new Object[] {
					groupId, language, approved,
					
					start, end, orderByComparator
				};
		}

		List<VcmsDiscussion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsDiscussion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsDiscussion vcmsDiscussion : list) {
					if ((groupId != vcmsDiscussion.getGroupId()) ||
							!Objects.equals(language,
								vcmsDiscussion.getLanguage()) ||
							(approved != vcmsDiscussion.getApproved())) {
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(approved);

				if (!pagination) {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByP_L_A_First(long groupId, String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByP_L_A_First(groupId, language,
				approved, orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByP_L_A_First(long groupId, String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator) {
		List<VcmsDiscussion> list = findByP_L_A(groupId, language, approved, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByP_L_A_Last(long groupId, String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByP_L_A_Last(groupId, language,
				approved, orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByP_L_A_Last(long groupId, String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator) {
		int count = countByP_L_A(groupId, language, approved);

		if (count == 0) {
			return null;
		}

		List<VcmsDiscussion> list = findByP_L_A(groupId, language, approved,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms discussions before and after the current vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion[] findByP_L_A_PrevAndNext(String discussionId,
		long groupId, String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByP_L_A_PrevAndNext(session, vcmsDiscussion, groupId,
					language, approved, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByP_L_A_PrevAndNext(session, vcmsDiscussion, groupId,
					language, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByP_L_A_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, long groupId, String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 */
	@Override
	public void removeByP_L_A(long groupId, String language, boolean approved) {
		for (VcmsDiscussion vcmsDiscussion : findByP_L_A(groupId, language,
				approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Returns the number of vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the number of matching vcms discussions
	 */
	@Override
	public int countByP_L_A(long groupId, String language, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L_A;

		Object[] finderArgs = new Object[] { groupId, language, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_P_L_A_GROUPID_2 = "vcmsDiscussion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_1 = "vcmsDiscussion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_2 = "vcmsDiscussion.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_3 = "(vcmsDiscussion.language IS NULL OR vcmsDiscussion.language = '') AND ";
	private static final String _FINDER_COLUMN_P_L_A_APPROVED_2 = "vcmsDiscussion.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByA_P_L_A",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_P_L_A =
		new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_P_L_A",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Boolean.class.getName()
			},
			VcmsDiscussionModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.APPROVED_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.POSTEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_P_L_A",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved) {
		return findByA_P_L_A(articleId, groupId, language, approved,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @return the range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved, int start, int end) {
		return findByA_P_L_A(articleId, groupId, language, approved, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return findByA_P_L_A(articleId, groupId, language, approved, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_P_L_A;
			finderArgs = new Object[] { articleId, groupId, language, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_P_L_A;
			finderArgs = new Object[] {
					articleId, groupId, language, approved,
					
					start, end, orderByComparator
				};
		}

		List<VcmsDiscussion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsDiscussion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsDiscussion vcmsDiscussion : list) {
					if (!Objects.equals(articleId, vcmsDiscussion.getArticleId()) ||
							(groupId != vcmsDiscussion.getGroupId()) ||
							!Objects.equals(language,
								vcmsDiscussion.getLanguage()) ||
							(approved != vcmsDiscussion.getApproved())) {
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_2);
			}

			query.append(_FINDER_COLUMN_A_P_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_A_P_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(approved);

				if (!pagination) {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByA_P_L_A_First(String articleId, long groupId,
		String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByA_P_L_A_First(articleId,
				groupId, language, approved, orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the first vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByA_P_L_A_First(String articleId, long groupId,
		String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		List<VcmsDiscussion> list = findByA_P_L_A(articleId, groupId, language,
				approved, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByA_P_L_A_Last(String articleId, long groupId,
		String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByA_P_L_A_Last(articleId, groupId,
				language, approved, orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the last vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByA_P_L_A_Last(String articleId, long groupId,
		String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		int count = countByA_P_L_A(articleId, groupId, language, approved);

		if (count == 0) {
			return null;
		}

		List<VcmsDiscussion> list = findByA_P_L_A(articleId, groupId, language,
				approved, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion[] findByA_P_L_A_PrevAndNext(String discussionId,
		String articleId, long groupId, String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByA_P_L_A_PrevAndNext(session, vcmsDiscussion,
					articleId, groupId, language, approved, orderByComparator,
					true);

			array[1] = vcmsDiscussion;

			array[2] = getByA_P_L_A_PrevAndNext(session, vcmsDiscussion,
					articleId, groupId, language, approved, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByA_P_L_A_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, String articleId, long groupId,
		String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		boolean bindArticleId = false;

		if (articleId == null) {
			query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_1);
		}
		else if (articleId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_3);
		}
		else {
			bindArticleId = true;

			query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_2);
		}

		query.append(_FINDER_COLUMN_A_P_L_A_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_A_P_L_A_APPROVED_2);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindArticleId) {
			qPos.add(articleId);
		}

		qPos.add(groupId);

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 */
	@Override
	public void removeByA_P_L_A(String articleId, long groupId,
		String language, boolean approved) {
		for (VcmsDiscussion vcmsDiscussion : findByA_P_L_A(articleId, groupId,
				language, approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Returns the number of vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the number of matching vcms discussions
	 */
	@Override
	public int countByA_P_L_A(String articleId, long groupId, String language,
		boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_P_L_A;

		Object[] finderArgs = new Object[] {
				articleId, groupId, language, approved
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_2);
			}

			query.append(_FINDER_COLUMN_A_P_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_A_P_L_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_A_P_L_A_ARTICLEID_1 = "vcmsDiscussion.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_ARTICLEID_2 = "vcmsDiscussion.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_ARTICLEID_3 = "(vcmsDiscussion.articleId IS NULL OR vcmsDiscussion.articleId = '') AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_GROUPID_2 = "vcmsDiscussion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_LANGUAGE_1 = "vcmsDiscussion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_LANGUAGE_2 = "vcmsDiscussion.language = ? AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_LANGUAGE_3 = "(vcmsDiscussion.language IS NULL OR vcmsDiscussion.language = '') AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_APPROVED_2 = "vcmsDiscussion.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByA_A",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_A",
			new String[] { String.class.getName(), Boolean.class.getName() },
			VcmsDiscussionModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.APPROVED_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.POSTEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_A",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @return the matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved) {
		return findByA_A(articleId, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @return the range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved,
		int start, int end) {
		return findByA_A(articleId, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved,
		int start, int end, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return findByA_A(articleId, approved, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved,
		int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_A;
			finderArgs = new Object[] { articleId, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_A;
			finderArgs = new Object[] {
					articleId, approved,
					
					start, end, orderByComparator
				};
		}

		List<VcmsDiscussion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsDiscussion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsDiscussion vcmsDiscussion : list) {
					if (!Objects.equals(articleId, vcmsDiscussion.getArticleId()) ||
							(approved != vcmsDiscussion.getApproved())) {
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_A_A_ARTICLEID_2);
			}

			query.append(_FINDER_COLUMN_A_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				qPos.add(approved);

				if (!pagination) {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByA_A_First(String articleId, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByA_A_First(articleId, approved,
				orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByA_A_First(String articleId, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		List<VcmsDiscussion> list = findByA_A(articleId, approved, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByA_A_Last(String articleId, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByA_A_Last(articleId, approved,
				orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByA_A_Last(String articleId, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		int count = countByA_A(articleId, approved);

		if (count == 0) {
			return null;
		}

		List<VcmsDiscussion> list = findByA_A(articleId, approved, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param articleId the article ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion[] findByA_A_PrevAndNext(String discussionId,
		String articleId, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByA_A_PrevAndNext(session, vcmsDiscussion, articleId,
					approved, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByA_A_PrevAndNext(session, vcmsDiscussion, articleId,
					approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByA_A_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, String articleId, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		boolean bindArticleId = false;

		if (articleId == null) {
			query.append(_FINDER_COLUMN_A_A_ARTICLEID_1);
		}
		else if (articleId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_A_ARTICLEID_3);
		}
		else {
			bindArticleId = true;

			query.append(_FINDER_COLUMN_A_A_ARTICLEID_2);
		}

		query.append(_FINDER_COLUMN_A_A_APPROVED_2);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindArticleId) {
			qPos.add(articleId);
		}

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms discussions where articleId = &#63; and approved = &#63; from the database.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 */
	@Override
	public void removeByA_A(String articleId, boolean approved) {
		for (VcmsDiscussion vcmsDiscussion : findByA_A(articleId, approved,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Returns the number of vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article ID
	 * @param approved the approved
	 * @return the number of matching vcms discussions
	 */
	@Override
	public int countByA_A(String articleId, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_A;

		Object[] finderArgs = new Object[] { articleId, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_A_A_ARTICLEID_2);
			}

			query.append(_FINDER_COLUMN_A_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_A_A_ARTICLEID_1 = "vcmsDiscussion.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_A_ARTICLEID_2 = "vcmsDiscussion.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_A_ARTICLEID_3 = "(vcmsDiscussion.articleId IS NULL OR vcmsDiscussion.articleId = '') AND ";
	private static final String _FINDER_COLUMN_A_A_APPROVED_2 = "vcmsDiscussion.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			VcmsDiscussionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsDiscussionModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsDiscussionModelImpl.POSTEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms discussions where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms discussions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @return the range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms discussions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE;
			finderArgs = new Object[] { articleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE;
			finderArgs = new Object[] { articleId, start, end, orderByComparator };
		}

		List<VcmsDiscussion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsDiscussion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsDiscussion vcmsDiscussion : list) {
					if (!Objects.equals(articleId, vcmsDiscussion.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				if (!pagination) {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByArticle_First(String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the first vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByArticle_First(String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		List<VcmsDiscussion> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion findByArticle_Last(String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsDiscussion != null) {
			return vcmsDiscussion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsDiscussionException(msg.toString());
	}

	/**
	 * Returns the last vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	 */
	@Override
	public VcmsDiscussion fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsDiscussion> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion[] findByArticle_PrevAndNext(String discussionId,
		String articleId, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsDiscussion,
					articleId, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByArticle_PrevAndNext(session, vcmsDiscussion,
					articleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByArticle_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		boolean bindArticleId = false;

		if (articleId == null) {
			query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
		}
		else if (articleId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
		}
		else {
			bindArticleId = true;

			query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindArticleId) {
			qPos.add(articleId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms discussions where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsDiscussion vcmsDiscussion : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Returns the number of vcms discussions where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms discussions
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsDiscussion.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsDiscussion.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsDiscussion.articleId IS NULL OR vcmsDiscussion.articleId = '')";

	public VcmsDiscussionPersistenceImpl() {
		setModelClass(VcmsDiscussion.class);
	}

	/**
	 * Caches the vcms discussion in the entity cache if it is enabled.
	 *
	 * @param vcmsDiscussion the vcms discussion
	 */
	@Override
	public void cacheResult(VcmsDiscussion vcmsDiscussion) {
		entityCache.putResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey(),
			vcmsDiscussion);

		vcmsDiscussion.resetOriginalValues();
	}

	/**
	 * Caches the vcms discussions in the entity cache if it is enabled.
	 *
	 * @param vcmsDiscussions the vcms discussions
	 */
	@Override
	public void cacheResult(List<VcmsDiscussion> vcmsDiscussions) {
		for (VcmsDiscussion vcmsDiscussion : vcmsDiscussions) {
			if (entityCache.getResult(
						VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey()) == null) {
				cacheResult(vcmsDiscussion);
			}
			else {
				vcmsDiscussion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms discussions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsDiscussionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms discussion.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsDiscussion vcmsDiscussion) {
		entityCache.removeResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsDiscussion> vcmsDiscussions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsDiscussion vcmsDiscussion : vcmsDiscussions) {
			entityCache.removeResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms discussion with the primary key. Does not add the vcms discussion to the database.
	 *
	 * @param discussionId the primary key for the new vcms discussion
	 * @return the new vcms discussion
	 */
	@Override
	public VcmsDiscussion create(String discussionId) {
		VcmsDiscussion vcmsDiscussion = new VcmsDiscussionImpl();

		vcmsDiscussion.setNew(true);
		vcmsDiscussion.setPrimaryKey(discussionId);

		vcmsDiscussion.setCompanyId(companyProvider.getCompanyId());

		return vcmsDiscussion;
	}

	/**
	 * Removes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param discussionId the primary key of the vcms discussion
	 * @return the vcms discussion that was removed
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion remove(String discussionId)
		throws NoSuchVcmsDiscussionException {
		return remove((Serializable)discussionId);
	}

	/**
	 * Removes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms discussion
	 * @return the vcms discussion that was removed
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion remove(Serializable primaryKey)
		throws NoSuchVcmsDiscussionException {
		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion vcmsDiscussion = (VcmsDiscussion)session.get(VcmsDiscussionImpl.class,
					primaryKey);

			if (vcmsDiscussion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsDiscussionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsDiscussion);
		}
		catch (NoSuchVcmsDiscussionException nsee) {
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
	protected VcmsDiscussion removeImpl(VcmsDiscussion vcmsDiscussion) {
		vcmsDiscussion = toUnwrappedModel(vcmsDiscussion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsDiscussion)) {
				vcmsDiscussion = (VcmsDiscussion)session.get(VcmsDiscussionImpl.class,
						vcmsDiscussion.getPrimaryKeyObj());
			}

			if (vcmsDiscussion != null) {
				session.delete(vcmsDiscussion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsDiscussion != null) {
			clearCache(vcmsDiscussion);
		}

		return vcmsDiscussion;
	}

	@Override
	public VcmsDiscussion updateImpl(VcmsDiscussion vcmsDiscussion) {
		vcmsDiscussion = toUnwrappedModel(vcmsDiscussion);

		boolean isNew = vcmsDiscussion.isNew();

		VcmsDiscussionModelImpl vcmsDiscussionModelImpl = (VcmsDiscussionModelImpl)vcmsDiscussion;

		Session session = null;

		try {
			session = openSession();

			if (vcmsDiscussion.isNew()) {
				session.save(vcmsDiscussion);

				vcmsDiscussion.setNew(false);
			}
			else {
				vcmsDiscussion = (VcmsDiscussion)session.merge(vcmsDiscussion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsDiscussionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsDiscussionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsDiscussionModelImpl.getOriginalGroupId(),
						vcmsDiscussionModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);

				args = new Object[] {
						vcmsDiscussionModelImpl.getGroupId(),
						vcmsDiscussionModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);
			}

			if ((vcmsDiscussionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsDiscussionModelImpl.getOriginalGroupId(),
						vcmsDiscussionModelImpl.getOriginalLanguage(),
						vcmsDiscussionModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A,
					args);

				args = new Object[] {
						vcmsDiscussionModelImpl.getGroupId(),
						vcmsDiscussionModelImpl.getLanguage(),
						vcmsDiscussionModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_A,
					args);
			}

			if ((vcmsDiscussionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_P_L_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsDiscussionModelImpl.getOriginalArticleId(),
						vcmsDiscussionModelImpl.getOriginalGroupId(),
						vcmsDiscussionModelImpl.getOriginalLanguage(),
						vcmsDiscussionModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_P_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_P_L_A,
					args);

				args = new Object[] {
						vcmsDiscussionModelImpl.getArticleId(),
						vcmsDiscussionModelImpl.getGroupId(),
						vcmsDiscussionModelImpl.getLanguage(),
						vcmsDiscussionModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_P_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_P_L_A,
					args);
			}

			if ((vcmsDiscussionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsDiscussionModelImpl.getOriginalArticleId(),
						vcmsDiscussionModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_A,
					args);

				args = new Object[] {
						vcmsDiscussionModelImpl.getArticleId(),
						vcmsDiscussionModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_A,
					args);
			}

			if ((vcmsDiscussionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsDiscussionModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsDiscussionModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}
		}

		entityCache.putResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey(),
			vcmsDiscussion, false);

		vcmsDiscussion.resetOriginalValues();

		return vcmsDiscussion;
	}

	protected VcmsDiscussion toUnwrappedModel(VcmsDiscussion vcmsDiscussion) {
		if (vcmsDiscussion instanceof VcmsDiscussionImpl) {
			return vcmsDiscussion;
		}

		VcmsDiscussionImpl vcmsDiscussionImpl = new VcmsDiscussionImpl();

		vcmsDiscussionImpl.setNew(vcmsDiscussion.isNew());
		vcmsDiscussionImpl.setPrimaryKey(vcmsDiscussion.getPrimaryKey());

		vcmsDiscussionImpl.setDiscussionId(vcmsDiscussion.getDiscussionId());
		vcmsDiscussionImpl.setGroupId(vcmsDiscussion.getGroupId());
		vcmsDiscussionImpl.setCompanyId(vcmsDiscussion.getCompanyId());
		vcmsDiscussionImpl.setVisitorName(vcmsDiscussion.getVisitorName());
		vcmsDiscussionImpl.setVisitorEmail(vcmsDiscussion.getVisitorEmail());
		vcmsDiscussionImpl.setVisitorPhone(vcmsDiscussion.getVisitorPhone());
		vcmsDiscussionImpl.setPostedDate(vcmsDiscussion.getPostedDate());
		vcmsDiscussionImpl.setApproved(vcmsDiscussion.isApproved());
		vcmsDiscussionImpl.setApprovedByUser(vcmsDiscussion.getApprovedByUser());
		vcmsDiscussionImpl.setApprovedDate(vcmsDiscussion.getApprovedDate());
		vcmsDiscussionImpl.setArticleId(vcmsDiscussion.getArticleId());
		vcmsDiscussionImpl.setTitle(vcmsDiscussion.getTitle());
		vcmsDiscussionImpl.setContent(vcmsDiscussion.getContent());
		vcmsDiscussionImpl.setLanguage(vcmsDiscussion.getLanguage());
		vcmsDiscussionImpl.setHasAttachment(vcmsDiscussion.isHasAttachment());

		return vcmsDiscussionImpl;
	}

	/**
	 * Returns the vcms discussion with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms discussion
	 * @return the vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsDiscussionException {
		VcmsDiscussion vcmsDiscussion = fetchByPrimaryKey(primaryKey);

		if (vcmsDiscussion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsDiscussionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsDiscussion;
	}

	/**
	 * Returns the vcms discussion with the primary key or throws a {@link NoSuchVcmsDiscussionException} if it could not be found.
	 *
	 * @param discussionId the primary key of the vcms discussion
	 * @return the vcms discussion
	 * @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion findByPrimaryKey(String discussionId)
		throws NoSuchVcmsDiscussionException {
		return findByPrimaryKey((Serializable)discussionId);
	}

	/**
	 * Returns the vcms discussion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms discussion
	 * @return the vcms discussion, or <code>null</code> if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsDiscussionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsDiscussion vcmsDiscussion = (VcmsDiscussion)serializable;

		if (vcmsDiscussion == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsDiscussion = (VcmsDiscussion)session.get(VcmsDiscussionImpl.class,
						primaryKey);

				if (vcmsDiscussion != null) {
					cacheResult(vcmsDiscussion);
				}
				else {
					entityCache.putResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsDiscussionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsDiscussionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsDiscussion;
	}

	/**
	 * Returns the vcms discussion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param discussionId the primary key of the vcms discussion
	 * @return the vcms discussion, or <code>null</code> if a vcms discussion with the primary key could not be found
	 */
	@Override
	public VcmsDiscussion fetchByPrimaryKey(String discussionId) {
		return fetchByPrimaryKey((Serializable)discussionId);
	}

	@Override
	public Map<Serializable, VcmsDiscussion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsDiscussion> map = new HashMap<Serializable, VcmsDiscussion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsDiscussion vcmsDiscussion = fetchByPrimaryKey(primaryKey);

			if (vcmsDiscussion != null) {
				map.put(primaryKey, vcmsDiscussion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsDiscussionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsDiscussion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE_PKS_IN);

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

			for (VcmsDiscussion vcmsDiscussion : (List<VcmsDiscussion>)q.list()) {
				map.put(vcmsDiscussion.getPrimaryKeyObj(), vcmsDiscussion);

				cacheResult(vcmsDiscussion);

				uncachedPrimaryKeys.remove(vcmsDiscussion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsDiscussionImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms discussions.
	 *
	 * @return the vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms discussions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @return the range of vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms discussions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findAll(int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms discussions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms discussions
	 * @param end the upper bound of the range of vcms discussions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms discussions
	 */
	@Override
	public List<VcmsDiscussion> findAll(int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
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

		List<VcmsDiscussion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsDiscussion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSDISCUSSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSDISCUSSION;

				if (pagination) {
					sql = sql.concat(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the vcms discussions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsDiscussion vcmsDiscussion : findAll()) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Returns the number of vcms discussions.
	 *
	 * @return the number of vcms discussions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSDISCUSSION);

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
		return VcmsDiscussionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms discussion persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsDiscussionImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSDISCUSSION = "SELECT vcmsDiscussion FROM VcmsDiscussion vcmsDiscussion";
	private static final String _SQL_SELECT_VCMSDISCUSSION_WHERE_PKS_IN = "SELECT vcmsDiscussion FROM VcmsDiscussion vcmsDiscussion WHERE discussionId IN (";
	private static final String _SQL_SELECT_VCMSDISCUSSION_WHERE = "SELECT vcmsDiscussion FROM VcmsDiscussion vcmsDiscussion WHERE ";
	private static final String _SQL_COUNT_VCMSDISCUSSION = "SELECT COUNT(vcmsDiscussion) FROM VcmsDiscussion vcmsDiscussion";
	private static final String _SQL_COUNT_VCMSDISCUSSION_WHERE = "SELECT COUNT(vcmsDiscussion) FROM VcmsDiscussion vcmsDiscussion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsDiscussion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsDiscussion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsDiscussion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsDiscussionPersistenceImpl.class);
}