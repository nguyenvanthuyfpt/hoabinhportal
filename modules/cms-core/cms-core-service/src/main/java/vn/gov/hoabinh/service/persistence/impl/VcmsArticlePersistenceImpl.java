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

import vn.gov.hoabinh.exception.NoSuchVcmsArticleException;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.model.impl.VcmsArticleImpl;
import vn.gov.hoabinh.model.impl.VcmsArticleModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsArticlePersistence;

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
 * The persistence implementation for the vcms article service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticlePersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsArticleUtil
 * @generated
 */
@ProviderType
public class VcmsArticlePersistenceImpl extends BasePersistenceImpl<VcmsArticle>
	implements VcmsArticlePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsArticleUtil} to access the vcms article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByL_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByL_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByL_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status) {
		return findByL_S(groupId, language, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status, int start, int end) {
		return findByL_S(groupId, language, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByL_S(groupId, language, status, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S;
			finderArgs = new Object[] { groupId, language, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_L_S;
			finderArgs = new Object[] {
					groupId, language, status,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_L_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByL_S_First(long groupId, String language,
		long status, OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByL_S_First(groupId, language, status,
				orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByL_S_First(long groupId, String language,
		long status, OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByL_S(groupId, language, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByL_S_Last(long groupId, String language,
		long status, OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByL_S_Last(groupId, language, status,
				orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByL_S_Last(long groupId, String language,
		long status, OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByL_S(groupId, language, status);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByL_S(groupId, language, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByL_S_PrevAndNext(String articleId, long groupId,
		String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByL_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByL_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByL_S_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_L_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_L_S_STATUS_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 */
	@Override
	public void removeByL_S(long groupId, String language, long status) {
		for (VcmsArticle vcmsArticle : findByL_S(groupId, language, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByL_S(long groupId, String language, long status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_L_S;

		Object[] finderArgs = new Object[] { groupId, language, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_L_S_STATUS_2);

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

	private static final String _FINDER_COLUMN_L_S_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_L_S_STATUS_2 = "vcmsArticle.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_C = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_C =
		new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.CATEGORYID_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_C = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C(long groupId, String language,
		long status, String categoryId) {
		return findByG_L_S_C(groupId, language, status, categoryId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C(long groupId, String language,
		long status, String categoryId, int start, int end) {
		return findByG_L_S_C(groupId, language, status, categoryId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C(long groupId, String language,
		long status, String categoryId, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByG_L_S_C(groupId, language, status, categoryId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C(long groupId, String language,
		long status, String categoryId, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_C;
			finderArgs = new Object[] { groupId, language, status, categoryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_C;
			finderArgs = new Object[] {
					groupId, language, status, categoryId,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus()) ||
							!Objects.equals(categoryId,
								vcmsArticle.getCategoryId())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_C_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_C_STATUS_2);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				if (bindCategoryId) {
					qPos.add(categoryId);
				}

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByG_L_S_C_First(long groupId, String language,
		long status, String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByG_L_S_C_First(groupId, language,
				status, categoryId, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByG_L_S_C_First(long groupId, String language,
		long status, String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByG_L_S_C(groupId, language, status,
				categoryId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByG_L_S_C_Last(long groupId, String language,
		long status, String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByG_L_S_C_Last(groupId, language,
				status, categoryId, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByG_L_S_C_Last(long groupId, String language,
		long status, String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByG_L_S_C(groupId, language, status, categoryId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByG_L_S_C(groupId, language, status,
				categoryId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByG_L_S_C_PrevAndNext(String articleId,
		long groupId, String language, long status, String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByG_L_S_C_PrevAndNext(session, vcmsArticle, groupId,
					language, status, categoryId, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByG_L_S_C_PrevAndNext(session, vcmsArticle, groupId,
					language, status, categoryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByG_L_S_C_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		String categoryId, OrderByComparator<VcmsArticle> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_C_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_C_STATUS_2);

		boolean bindCategoryId = false;

		if (categoryId == null) {
			query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_1);
		}
		else if (categoryId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_3);
		}
		else {
			bindCategoryId = true;

			query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_2);
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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		if (bindCategoryId) {
			qPos.add(categoryId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 */
	@Override
	public void removeByG_L_S_C(long groupId, String language, long status,
		String categoryId) {
		for (VcmsArticle vcmsArticle : findByG_L_S_C(groupId, language, status,
				categoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByG_L_S_C(long groupId, String language, long status,
		String categoryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S_C;

		Object[] finderArgs = new Object[] { groupId, language, status, categoryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_C_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_C_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_C_STATUS_2);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_G_L_S_C_CATEGORYID_2);
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

				qPos.add(status);

				if (bindCategoryId) {
					qPos.add(categoryId);
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

	private static final String _FINDER_COLUMN_G_L_S_C_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_CATEGORYID_1 = "vcmsArticle.categoryId IS NULL";
	private static final String _FINDER_COLUMN_G_L_S_C_CATEGORYID_2 = "vcmsArticle.categoryId = ?";
	private static final String _FINDER_COLUMN_G_L_S_C_CATEGORYID_3 = "(vcmsArticle.categoryId IS NULL OR vcmsArticle.categoryId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_C_A =
		new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S_C_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_S_C_A =
		new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_S_C_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C_A(long groupId, String language,
		long status, String categoryId, String articleId) {
		return findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C_A(long groupId, String language,
		long status, String categoryId, String articleId, int start, int end) {
		return findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C_A(long groupId, String language,
		long status, String categoryId, String articleId, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_C_A(long groupId, String language,
		long status, String categoryId, String articleId, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_C_A;
		finderArgs = new Object[] {
				groupId, language, status, categoryId, articleId,
				
				start, end, orderByComparator
			};

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus()) ||
							!Objects.equals(categoryId,
								vcmsArticle.getCategoryId()) ||
							Objects.equals(articleId, vcmsArticle.getArticleId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_C_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_C_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_C_A_STATUS_2);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_G_L_S_C_A_CATEGORYID_2);
			}

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_G_L_S_C_A_ARTICLEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				if (bindCategoryId) {
					qPos.add(categoryId);
				}

				if (bindArticleId) {
					qPos.add(articleId);
				}

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByG_L_S_C_A_First(long groupId, String language,
		long status, String categoryId, String articleId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByG_L_S_C_A_First(groupId, language,
				status, categoryId, articleId, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(", articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByG_L_S_C_A_First(long groupId, String language,
		long status, String categoryId, String articleId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByG_L_S_C_A(groupId, language, status,
				categoryId, articleId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByG_L_S_C_A_Last(long groupId, String language,
		long status, String categoryId, String articleId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByG_L_S_C_A_Last(groupId, language,
				status, categoryId, articleId, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(", articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByG_L_S_C_A_Last(long groupId, String language,
		long status, String categoryId, String articleId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByG_L_S_C_A(groupId, language, status, categoryId,
				articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByG_L_S_C_A(groupId, language, status,
				categoryId, articleId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 */
	@Override
	public void removeByG_L_S_C_A(long groupId, String language, long status,
		String categoryId, String articleId) {
		for (VcmsArticle vcmsArticle : findByG_L_S_C_A(groupId, language,
				status, categoryId, articleId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param categoryId the category ID
	 * @param articleId the article ID
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByG_L_S_C_A(long groupId, String language, long status,
		String categoryId, String articleId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_S_C_A;

		Object[] finderArgs = new Object[] {
				groupId, language, status, categoryId, articleId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_C_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_C_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_C_A_STATUS_2);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_G_L_S_C_A_CATEGORYID_2);
			}

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_C_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_G_L_S_C_A_ARTICLEID_2);
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

				qPos.add(status);

				if (bindCategoryId) {
					qPos.add(categoryId);
				}

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

	private static final String _FINDER_COLUMN_G_L_S_C_A_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_CATEGORYID_1 = "vcmsArticle.categoryId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_CATEGORYID_2 = "vcmsArticle.categoryId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_CATEGORYID_3 = "(vcmsArticle.categoryId IS NULL OR vcmsArticle.categoryId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_C_A_ARTICLEID_1 = "vcmsArticle.articleId IS NOT NULL";
	private static final String _FINDER_COLUMN_G_L_S_C_A_ARTICLEID_2 = "vcmsArticle.articleId != ?";
	private static final String _FINDER_COLUMN_G_L_S_C_A_ARTICLEID_3 = "(vcmsArticle.articleId IS NULL OR vcmsArticle.articleId != '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_U = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S_U",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_U =
		new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S_U",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_U = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S_U",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser) {
		return findByG_L_S_U(groupId, language, status, createdByUser,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser, int start, int end) {
		return findByG_L_S_U(groupId, language, status, createdByUser, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByG_L_S_U(groupId, language, status, createdByUser, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_U;
			finderArgs = new Object[] { groupId, language, status, createdByUser };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_U;
			finderArgs = new Object[] {
					groupId, language, status, createdByUser,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus()) ||
							!Objects.equals(createdByUser,
								vcmsArticle.getCreatedByUser())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_U_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_U_STATUS_2);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByG_L_S_U_First(long groupId, String language,
		long status, String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByG_L_S_U_First(groupId, language,
				status, createdByUser, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByG_L_S_U_First(long groupId, String language,
		long status, String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByG_L_S_U(groupId, language, status,
				createdByUser, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByG_L_S_U_Last(long groupId, String language,
		long status, String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByG_L_S_U_Last(groupId, language,
				status, createdByUser, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByG_L_S_U_Last(long groupId, String language,
		long status, String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByG_L_S_U(groupId, language, status, createdByUser);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByG_L_S_U(groupId, language, status,
				createdByUser, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByG_L_S_U_PrevAndNext(String articleId,
		long groupId, String language, long status, String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByG_L_S_U_PrevAndNext(session, vcmsArticle, groupId,
					language, status, createdByUser, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByG_L_S_U_PrevAndNext(session, vcmsArticle, groupId,
					language, status, createdByUser, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByG_L_S_U_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		String createdByUser, OrderByComparator<VcmsArticle> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_U_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_U_STATUS_2);

		boolean bindCreatedByUser = false;

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1);
		}
		else if (createdByUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3);
		}
		else {
			bindCreatedByUser = true;

			query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2);
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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		if (bindCreatedByUser) {
			qPos.add(createdByUser);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 */
	@Override
	public void removeByG_L_S_U(long groupId, String language, long status,
		String createdByUser) {
		for (VcmsArticle vcmsArticle : findByG_L_S_U(groupId, language, status,
				createdByUser, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param createdByUser the created by user
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByG_L_S_U(long groupId, String language, long status,
		String createdByUser) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S_U;

		Object[] finderArgs = new Object[] {
				groupId, language, status, createdByUser
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_U_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_U_STATUS_2);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2);
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

				qPos.add(status);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
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

	private static final String _FINDER_COLUMN_G_L_S_U_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1 = "vcmsArticle.createdByUser IS NULL";
	private static final String _FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2 = "vcmsArticle.createdByUser = ?";
	private static final String _FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3 = "(vcmsArticle.createdByUser IS NULL OR vcmsArticle.createdByUser = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_L_S_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByL_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByL_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.STICKY_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByL_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky) {
		return findByL_S_S(groupId, language, status, sticky,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky, int start, int end) {
		return findByL_S_S(groupId, language, status, sticky, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByL_S_S(groupId, language, status, sticky, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S_S;
			finderArgs = new Object[] { groupId, language, status, sticky };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_L_S_S;
			finderArgs = new Object[] {
					groupId, language, status, sticky,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus()) ||
							(sticky != vcmsArticle.getSticky())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_L_S_S_STATUS_2);

			query.append(_FINDER_COLUMN_L_S_S_STICKY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				qPos.add(sticky);

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByL_S_S_First(long groupId, String language,
		long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByL_S_S_First(groupId, language, status,
				sticky, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", sticky=");
		msg.append(sticky);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByL_S_S_First(long groupId, String language,
		long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByL_S_S(groupId, language, status, sticky,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByL_S_S_Last(long groupId, String language,
		long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByL_S_S_Last(groupId, language, status,
				sticky, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", sticky=");
		msg.append(sticky);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByL_S_S_Last(long groupId, String language,
		long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByL_S_S(groupId, language, status, sticky);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByL_S_S(groupId, language, status, sticky,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByL_S_S_PrevAndNext(String articleId,
		long groupId, String language, long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByL_S_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, sticky, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByL_S_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, sticky, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByL_S_S_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		boolean sticky, OrderByComparator<VcmsArticle> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_L_S_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_L_S_S_STATUS_2);

		query.append(_FINDER_COLUMN_L_S_S_STICKY_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		qPos.add(sticky);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 */
	@Override
	public void removeByL_S_S(long groupId, String language, long status,
		boolean sticky) {
		for (VcmsArticle vcmsArticle : findByL_S_S(groupId, language, status,
				sticky, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param sticky the sticky
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByL_S_S(long groupId, String language, long status,
		boolean sticky) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_L_S_S;

		Object[] finderArgs = new Object[] { groupId, language, status, sticky };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_L_S_S_STATUS_2);

			query.append(_FINDER_COLUMN_L_S_S_STICKY_2);

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

				qPos.add(status);

				qPos.add(sticky);

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

	private static final String _FINDER_COLUMN_L_S_S_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_L_S_S_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_S_S_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_L_S_S_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_L_S_S_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_L_S_S_STICKY_2 = "vcmsArticle.sticky = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_L = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_L = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language) {
		return findByU_L(groupId, createdByUser, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language, int start, int end) {
		return findByU_L(groupId, createdByUser, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByU_L(groupId, createdByUser, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L;
			finderArgs = new Object[] { groupId, createdByUser, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_L;
			finderArgs = new Object[] {
					groupId, createdByUser, language,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(createdByUser,
								vcmsArticle.getCreatedByUser()) ||
							!Objects.equals(language, vcmsArticle.getLanguage())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_GROUPID_2);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_U_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByU_L_First(long groupId, String createdByUser,
		String language, OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByU_L_First(groupId, createdByUser,
				language, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByU_L_First(long groupId, String createdByUser,
		String language, OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByU_L(groupId, createdByUser, language, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByU_L_Last(long groupId, String createdByUser,
		String language, OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByU_L_Last(groupId, createdByUser,
				language, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByU_L_Last(long groupId, String createdByUser,
		String language, OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByU_L(groupId, createdByUser, language);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByU_L(groupId, createdByUser, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByU_L_PrevAndNext(String articleId, long groupId,
		String createdByUser, String language,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByU_L_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByU_L_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByU_L_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String createdByUser,
		String language, OrderByComparator<VcmsArticle> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_U_L_GROUPID_2);

		boolean bindCreatedByUser = false;

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_1);
		}
		else if (createdByUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_3);
		}
		else {
			bindCreatedByUser = true;

			query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_2);
		}

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_U_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_U_L_LANGUAGE_2);
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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindCreatedByUser) {
			qPos.add(createdByUser);
		}

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 */
	@Override
	public void removeByU_L(long groupId, String createdByUser, String language) {
		for (VcmsArticle vcmsArticle : findByU_L(groupId, createdByUser,
				language, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByU_L(long groupId, String createdByUser, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_L;

		Object[] finderArgs = new Object[] { groupId, createdByUser, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_GROUPID_2);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_U_L_LANGUAGE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

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

	private static final String _FINDER_COLUMN_U_L_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_L_CREATEDBYUSER_1 = "vcmsArticle.createdByUser IS NULL AND ";
	private static final String _FINDER_COLUMN_U_L_CREATEDBYUSER_2 = "vcmsArticle.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_L_CREATEDBYUSER_3 = "(vcmsArticle.createdByUser IS NULL OR vcmsArticle.createdByUser = '') AND ";
	private static final String _FINDER_COLUMN_U_L_LANGUAGE_1 = "vcmsArticle.language IS NULL";
	private static final String _FINDER_COLUMN_U_L_LANGUAGE_2 = "vcmsArticle.language = ?";
	private static final String _FINDER_COLUMN_U_L_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status) {
		return findByU_L_S(groupId, createdByUser, language, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status, int start, int end) {
		return findByU_L_S(groupId, createdByUser, language, status, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByU_L_S(groupId, createdByUser, language, status, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L_S;
			finderArgs = new Object[] { groupId, createdByUser, language, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_L_S;
			finderArgs = new Object[] {
					groupId, createdByUser, language, status,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(createdByUser,
								vcmsArticle.getCreatedByUser()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_S_GROUPID_2);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_U_L_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByU_L_S_First(long groupId, String createdByUser,
		String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByU_L_S_First(groupId, createdByUser,
				language, status, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByU_L_S_First(long groupId, String createdByUser,
		String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByU_L_S(groupId, createdByUser, language,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByU_L_S_Last(long groupId, String createdByUser,
		String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByU_L_S_Last(groupId, createdByUser,
				language, status, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", createdByUser=");
		msg.append(createdByUser);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByU_L_S_Last(long groupId, String createdByUser,
		String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByU_L_S(groupId, createdByUser, language, status);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByU_L_S(groupId, createdByUser, language,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByU_L_S_PrevAndNext(String articleId,
		long groupId, String createdByUser, String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByU_L_S_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, status, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByU_L_S_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByU_L_S_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String createdByUser,
		String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_U_L_S_GROUPID_2);

		boolean bindCreatedByUser = false;

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_1);
		}
		else if (createdByUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_3);
		}
		else {
			bindCreatedByUser = true;

			query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_2);
		}

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_U_L_S_STATUS_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindCreatedByUser) {
			qPos.add(createdByUser);
		}

		if (bindLanguage) {
			qPos.add(language);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 */
	@Override
	public void removeByU_L_S(long groupId, String createdByUser,
		String language, long status) {
		for (VcmsArticle vcmsArticle : findByU_L_S(groupId, createdByUser,
				language, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param createdByUser the created by user
	 * @param language the language
	 * @param status the status
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByU_L_S(long groupId, String createdByUser,
		String language, long status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_L_S;

		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language, status
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_S_GROUPID_2);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_2);
			}

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_U_L_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (bindLanguage) {
					qPos.add(language);
				}

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

	private static final String _FINDER_COLUMN_U_L_S_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_L_S_CREATEDBYUSER_1 = "vcmsArticle.createdByUser IS NULL AND ";
	private static final String _FINDER_COLUMN_U_L_S_CREATEDBYUSER_2 = "vcmsArticle.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_L_S_CREATEDBYUSER_3 = "(vcmsArticle.createdByUser IS NULL OR vcmsArticle.createdByUser = '') AND ";
	private static final String _FINDER_COLUMN_U_L_S_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_U_L_S_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_U_L_S_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_U_L_S_STATUS_2 = "vcmsArticle.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_S_D = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_L_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S_D =
		new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			},
			VcmsArticleModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsArticleModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.DISCUSSIBLE_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_S_D = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible) {
		return findByP_L_S_D(groupId, language, status, discussible,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible, int start, int end) {
		return findByP_L_S_D(groupId, language, status, discussible, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByP_L_S_D(groupId, language, status, discussible, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S_D;
			finderArgs = new Object[] { groupId, language, status, discussible };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L_S_D;
			finderArgs = new Object[] {
					groupId, language, status, discussible,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((groupId != vcmsArticle.getGroupId()) ||
							!Objects.equals(language, vcmsArticle.getLanguage()) ||
							(status != vcmsArticle.getStatus()) ||
							(discussible != vcmsArticle.getDiscussible())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_S_D_STATUS_2);

			query.append(_FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				qPos.add(discussible);

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByP_L_S_D_First(long groupId, String language,
		long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByP_L_S_D_First(groupId, language,
				status, discussible, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", discussible=");
		msg.append(discussible);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByP_L_S_D_First(long groupId, String language,
		long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByP_L_S_D(groupId, language, status,
				discussible, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByP_L_S_D_Last(long groupId, String language,
		long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByP_L_S_D_Last(groupId, language,
				status, discussible, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", status=");
		msg.append(status);

		msg.append(", discussible=");
		msg.append(discussible);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByP_L_S_D_Last(long groupId, String language,
		long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByP_L_S_D(groupId, language, status, discussible);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByP_L_S_D(groupId, language, status,
				discussible, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByP_L_S_D_PrevAndNext(String articleId,
		long groupId, String language, long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByP_L_S_D_PrevAndNext(session, vcmsArticle, groupId,
					language, status, discussible, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByP_L_S_D_PrevAndNext(session, vcmsArticle, groupId,
					language, status, discussible, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByP_L_S_D_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		boolean discussible, OrderByComparator<VcmsArticle> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_P_L_S_D_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_P_L_S_D_STATUS_2);

		query.append(_FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		qPos.add(discussible);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 */
	@Override
	public void removeByP_L_S_D(long groupId, String language, long status,
		boolean discussible) {
		for (VcmsArticle vcmsArticle : findByP_L_S_D(groupId, language, status,
				discussible, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param status the status
	 * @param discussible the discussible
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByP_L_S_D(long groupId, String language, long status,
		boolean discussible) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L_S_D;

		Object[] finderArgs = new Object[] {
				groupId, language, status, discussible
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_D_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_P_L_S_D_STATUS_2);

			query.append(_FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2);

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

				qPos.add(status);

				qPos.add(discussible);

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

	private static final String _FINDER_COLUMN_P_L_S_D_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = '') AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2 = "vcmsArticle.discussible = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, VcmsArticleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Long.class.getName() },
			VcmsArticleModelImpl.STATUS_COLUMN_BITMASK |
			VcmsArticleModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vcms articles where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByStatus(long status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByStatus(long status, int start, int end) {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByStatus(long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findByStatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms articles
	 */
	@Override
	public List<VcmsArticle> findByStatus(long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticle vcmsArticle : list) {
					if ((status != vcmsArticle.getStatus())) {
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms article in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByStatus_First(long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByStatus_First(status, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the first vcms article in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByStatus_First(long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		List<VcmsArticle> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article
	 * @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle findByStatus_Last(long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByStatus_Last(status, orderByComparator);

		if (vcmsArticle != null) {
			return vcmsArticle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleException(msg.toString());
	}

	/**
	 * Returns the last vcms article in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	 */
	@Override
	public VcmsArticle fetchByStatus_Last(long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<VcmsArticle> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms articles before and after the current vcms article in the ordered set where status = &#63;.
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle[] findByStatus_PrevAndNext(String articleId,
		long status, OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vcmsArticle, status,
					orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByStatus_PrevAndNext(session, vcmsArticle, status,
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

	protected VcmsArticle getByStatus_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long status,
		OrderByComparator<VcmsArticle> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms articles where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(long status) {
		for (VcmsArticle vcmsArticle : findByStatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching vcms articles
	 */
	@Override
	public int countByStatus(long status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "vcmsArticle.status = ?";

	public VcmsArticlePersistenceImpl() {
		setModelClass(VcmsArticle.class);
	}

	/**
	 * Caches the vcms article in the entity cache if it is enabled.
	 *
	 * @param vcmsArticle the vcms article
	 */
	@Override
	public void cacheResult(VcmsArticle vcmsArticle) {
		entityCache.putResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey(), vcmsArticle);

		vcmsArticle.resetOriginalValues();
	}

	/**
	 * Caches the vcms articles in the entity cache if it is enabled.
	 *
	 * @param vcmsArticles the vcms articles
	 */
	@Override
	public void cacheResult(List<VcmsArticle> vcmsArticles) {
		for (VcmsArticle vcmsArticle : vcmsArticles) {
			if (entityCache.getResult(
						VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleImpl.class, vcmsArticle.getPrimaryKey()) == null) {
				cacheResult(vcmsArticle);
			}
			else {
				vcmsArticle.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms articles.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsArticleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms article.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsArticle vcmsArticle) {
		entityCache.removeResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsArticle> vcmsArticles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsArticle vcmsArticle : vcmsArticles) {
			entityCache.removeResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleImpl.class, vcmsArticle.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	 *
	 * @param articleId the primary key for the new vcms article
	 * @return the new vcms article
	 */
	@Override
	public VcmsArticle create(String articleId) {
		VcmsArticle vcmsArticle = new VcmsArticleImpl();

		vcmsArticle.setNew(true);
		vcmsArticle.setPrimaryKey(articleId);

		vcmsArticle.setCompanyId(companyProvider.getCompanyId());

		return vcmsArticle;
	}

	/**
	 * Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param articleId the primary key of the vcms article
	 * @return the vcms article that was removed
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle remove(String articleId)
		throws NoSuchVcmsArticleException {
		return remove((Serializable)articleId);
	}

	/**
	 * Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article
	 * @return the vcms article that was removed
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle remove(Serializable primaryKey)
		throws NoSuchVcmsArticleException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticle vcmsArticle = (VcmsArticle)session.get(VcmsArticleImpl.class,
					primaryKey);

			if (vcmsArticle == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsArticleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsArticle);
		}
		catch (NoSuchVcmsArticleException nsee) {
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
	protected VcmsArticle removeImpl(VcmsArticle vcmsArticle) {
		vcmsArticle = toUnwrappedModel(vcmsArticle);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsArticle)) {
				vcmsArticle = (VcmsArticle)session.get(VcmsArticleImpl.class,
						vcmsArticle.getPrimaryKeyObj());
			}

			if (vcmsArticle != null) {
				session.delete(vcmsArticle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsArticle != null) {
			clearCache(vcmsArticle);
		}

		return vcmsArticle;
	}

	@Override
	public VcmsArticle updateImpl(VcmsArticle vcmsArticle) {
		vcmsArticle = toUnwrappedModel(vcmsArticle);

		boolean isNew = vcmsArticle.isNew();

		VcmsArticleModelImpl vcmsArticleModelImpl = (VcmsArticleModelImpl)vcmsArticle;

		Session session = null;

		try {
			session = openSession();

			if (vcmsArticle.isNew()) {
				session.save(vcmsArticle);

				vcmsArticle.setNew(false);
			}
			else {
				vcmsArticle = (VcmsArticle)session.merge(vcmsArticle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsArticleModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalLanguage(),
						vcmsArticleModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getLanguage(),
						vcmsArticleModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalLanguage(),
						vcmsArticleModelImpl.getOriginalStatus(),
						vcmsArticleModelImpl.getOriginalCategoryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_C,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getLanguage(),
						vcmsArticleModelImpl.getStatus(),
						vcmsArticleModelImpl.getCategoryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_C,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalLanguage(),
						vcmsArticleModelImpl.getOriginalStatus(),
						vcmsArticleModelImpl.getOriginalCreatedByUser()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_U, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_U,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getLanguage(),
						vcmsArticleModelImpl.getStatus(),
						vcmsArticleModelImpl.getCreatedByUser()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_U, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_U,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalLanguage(),
						vcmsArticleModelImpl.getOriginalStatus(),
						vcmsArticleModelImpl.getOriginalSticky()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_L_S_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S_S,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getLanguage(),
						vcmsArticleModelImpl.getStatus(),
						vcmsArticleModelImpl.getSticky()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_L_S_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_L_S_S,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalCreatedByUser(),
						vcmsArticleModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getCreatedByUser(),
						vcmsArticleModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalCreatedByUser(),
						vcmsArticleModelImpl.getOriginalLanguage(),
						vcmsArticleModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L_S,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getCreatedByUser(),
						vcmsArticleModelImpl.getLanguage(),
						vcmsArticleModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_L_S,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S_D.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalGroupId(),
						vcmsArticleModelImpl.getOriginalLanguage(),
						vcmsArticleModelImpl.getOriginalStatus(),
						vcmsArticleModelImpl.getOriginalDiscussible()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_S_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S_D,
					args);

				args = new Object[] {
						vcmsArticleModelImpl.getGroupId(),
						vcmsArticleModelImpl.getLanguage(),
						vcmsArticleModelImpl.getStatus(),
						vcmsArticleModelImpl.getDiscussible()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L_S_D, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L_S_D,
					args);
			}

			if ((vcmsArticleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { vcmsArticleModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey(), vcmsArticle,
			false);

		vcmsArticle.resetOriginalValues();

		return vcmsArticle;
	}

	protected VcmsArticle toUnwrappedModel(VcmsArticle vcmsArticle) {
		if (vcmsArticle instanceof VcmsArticleImpl) {
			return vcmsArticle;
		}

		VcmsArticleImpl vcmsArticleImpl = new VcmsArticleImpl();

		vcmsArticleImpl.setNew(vcmsArticle.isNew());
		vcmsArticleImpl.setPrimaryKey(vcmsArticle.getPrimaryKey());

		vcmsArticleImpl.setArticleId(vcmsArticle.getArticleId());
		vcmsArticleImpl.setGroupId(vcmsArticle.getGroupId());
		vcmsArticleImpl.setCompanyId(vcmsArticle.getCompanyId());
		vcmsArticleImpl.setCreatedByUser(vcmsArticle.getCreatedByUser());
		vcmsArticleImpl.setCreatedDate(vcmsArticle.getCreatedDate());
		vcmsArticleImpl.setModifiedByUser(vcmsArticle.getModifiedByUser());
		vcmsArticleImpl.setModifiedDate(vcmsArticle.getModifiedDate());
		vcmsArticleImpl.setApprovedByUser(vcmsArticle.getApprovedByUser());
		vcmsArticleImpl.setApprovedDate(vcmsArticle.getApprovedDate());
		vcmsArticleImpl.setPublishedByUser(vcmsArticle.getPublishedByUser());
		vcmsArticleImpl.setPublishedDate(vcmsArticle.getPublishedDate());
		vcmsArticleImpl.setStatus(vcmsArticle.getStatus());
		vcmsArticleImpl.setTitle(vcmsArticle.getTitle());
		vcmsArticleImpl.setLead(vcmsArticle.getLead());
		vcmsArticleImpl.setContent(vcmsArticle.getContent());
		vcmsArticleImpl.setVersion(vcmsArticle.getVersion());
		vcmsArticleImpl.setHasImage(vcmsArticle.isHasImage());
		vcmsArticleImpl.setImageTitle(vcmsArticle.getImageTitle());
		vcmsArticleImpl.setImage(vcmsArticle.getImage());
		vcmsArticleImpl.setAuthor(vcmsArticle.getAuthor());
		vcmsArticleImpl.setSource(vcmsArticle.getSource());
		vcmsArticleImpl.setLanguage(vcmsArticle.getLanguage());
		vcmsArticleImpl.setUserHit(vcmsArticle.getUserHit());
		vcmsArticleImpl.setDiscussible(vcmsArticle.isDiscussible());
		vcmsArticleImpl.setHasAttachment(vcmsArticle.isHasAttachment());
		vcmsArticleImpl.setHasPoll(vcmsArticle.isHasPoll());
		vcmsArticleImpl.setPollId(vcmsArticle.getPollId());
		vcmsArticleImpl.setEffectiveDate(vcmsArticle.getEffectiveDate());
		vcmsArticleImpl.setExpireDate(vcmsArticle.getExpireDate());
		vcmsArticleImpl.setSticky(vcmsArticle.isSticky());
		vcmsArticleImpl.setStickyNeverExpired(vcmsArticle.isStickyNeverExpired());
		vcmsArticleImpl.setStickyExpireDate(vcmsArticle.getStickyExpireDate());
		vcmsArticleImpl.setCategoryId(vcmsArticle.getCategoryId());
		vcmsArticleImpl.setSoundLink(vcmsArticle.getSoundLink());

		return vcmsArticleImpl;
	}

	/**
	 * Returns the vcms article with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article
	 * @return the vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsArticleException {
		VcmsArticle vcmsArticle = fetchByPrimaryKey(primaryKey);

		if (vcmsArticle == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsArticleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsArticle;
	}

	/**
	 * Returns the vcms article with the primary key or throws a {@link NoSuchVcmsArticleException} if it could not be found.
	 *
	 * @param articleId the primary key of the vcms article
	 * @return the vcms article
	 * @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle findByPrimaryKey(String articleId)
		throws NoSuchVcmsArticleException {
		return findByPrimaryKey((Serializable)articleId);
	}

	/**
	 * Returns the vcms article with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article
	 * @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsArticle vcmsArticle = (VcmsArticle)serializable;

		if (vcmsArticle == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticle = (VcmsArticle)session.get(VcmsArticleImpl.class,
						primaryKey);

				if (vcmsArticle != null) {
					cacheResult(vcmsArticle);
				}
				else {
					entityCache.putResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsArticle;
	}

	/**
	 * Returns the vcms article with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param articleId the primary key of the vcms article
	 * @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	 */
	@Override
	public VcmsArticle fetchByPrimaryKey(String articleId) {
		return fetchByPrimaryKey((Serializable)articleId);
	}

	@Override
	public Map<Serializable, VcmsArticle> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsArticle> map = new HashMap<Serializable, VcmsArticle>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsArticle vcmsArticle = fetchByPrimaryKey(primaryKey);

			if (vcmsArticle != null) {
				map.put(primaryKey, vcmsArticle);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsArticle)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE_PKS_IN);

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

			for (VcmsArticle vcmsArticle : (List<VcmsArticle>)q.list()) {
				map.put(vcmsArticle.getPrimaryKeyObj(), vcmsArticle);

				cacheResult(vcmsArticle);

				uncachedPrimaryKeys.remove(vcmsArticle.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms articles.
	 *
	 * @return the vcms articles
	 */
	@Override
	public List<VcmsArticle> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @return the range of vcms articles
	 */
	@Override
	public List<VcmsArticle> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms articles
	 */
	@Override
	public List<VcmsArticle> findAll(int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms articles
	 * @param end the upper bound of the range of vcms articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms articles
	 */
	@Override
	public List<VcmsArticle> findAll(int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
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

		List<VcmsArticle> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticle>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSARTICLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLE;

				if (pagination) {
					sql = sql.concat(VcmsArticleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms articles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsArticle vcmsArticle : findAll()) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Returns the number of vcms articles.
	 *
	 * @return the number of vcms articles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLE);

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
		return VcmsArticleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms article persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsArticleImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSARTICLE = "SELECT vcmsArticle FROM VcmsArticle vcmsArticle";
	private static final String _SQL_SELECT_VCMSARTICLE_WHERE_PKS_IN = "SELECT vcmsArticle FROM VcmsArticle vcmsArticle WHERE articleId IN (";
	private static final String _SQL_SELECT_VCMSARTICLE_WHERE = "SELECT vcmsArticle FROM VcmsArticle vcmsArticle WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLE = "SELECT COUNT(vcmsArticle) FROM VcmsArticle vcmsArticle";
	private static final String _SQL_COUNT_VCMSARTICLE_WHERE = "SELECT COUNT(vcmsArticle) FROM VcmsArticle vcmsArticle WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticle.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticle exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticle exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsArticlePersistenceImpl.class);
}