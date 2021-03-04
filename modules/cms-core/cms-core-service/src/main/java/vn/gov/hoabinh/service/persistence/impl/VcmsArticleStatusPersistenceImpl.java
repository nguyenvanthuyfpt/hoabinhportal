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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException;
import vn.gov.hoabinh.model.VcmsArticleStatus;
import vn.gov.hoabinh.model.impl.VcmsArticleStatusImpl;
import vn.gov.hoabinh.model.impl.VcmsArticleStatusModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK;
import vn.gov.hoabinh.service.persistence.VcmsArticleStatusPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms article status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatusPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsArticleStatusUtil
 * @generated
 */
@ProviderType
public class VcmsArticleStatusPersistenceImpl extends BasePersistenceImpl<VcmsArticleStatus>
	implements VcmsArticleStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsArticleStatusUtil} to access the vcms article status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsArticleStatusModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsArticleStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms article statuses where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms article statuses where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @return the range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsArticleStatus> orderByComparator,
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

		List<VcmsArticleStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleStatus vcmsArticleStatus : list) {
					if (!Objects.equals(articleId,
								vcmsArticleStatus.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

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
				query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
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
	 * Returns the first vcms article status in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByArticle_First(String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms article status in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByArticle_First(String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		List<VcmsArticleStatus> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article status in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByArticle_Last(String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms article status in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleStatus> list = findByArticle(articleId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article statuses before and after the current vcms article status in the ordered set where articleId = &#63;.
	 *
	 * @param vcmsArticleStatusPK the primary key of the current vcms article status
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus[] findByArticle_PrevAndNext(
		VcmsArticleStatusPK vcmsArticleStatusPK, String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = findByPrimaryKey(vcmsArticleStatusPK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleStatus[] array = new VcmsArticleStatusImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsArticleStatus,
					articleId, orderByComparator, true);

			array[1] = vcmsArticleStatus;

			array[2] = getByArticle_PrevAndNext(session, vcmsArticleStatus,
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

	protected VcmsArticleStatus getByArticle_PrevAndNext(Session session,
		VcmsArticleStatus vcmsArticleStatus, String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

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
			query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article statuses where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsArticleStatus vcmsArticleStatus : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleStatus);
		}
	}

	/**
	 * Returns the number of vcms article statuses where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms article statuses
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLESTATUS_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsArticleStatus.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsArticleStatus.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsArticleStatus.id.articleId IS NULL OR vcmsArticleStatus.id.articleId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActive",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE =
		new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActive",
			new String[] { Boolean.class.getName() },
			VcmsArticleStatusModelImpl.ACTIVE_COLUMN_BITMASK |
			VcmsArticleStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVE = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActive",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the vcms article statuses where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByActive(boolean active) {
		return findByActive(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article statuses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @return the range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByActive(boolean active, int start,
		int end) {
		return findByActive(active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByActive(boolean active, int start,
		int end, OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return findByActive(active, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByActive(boolean active, int start,
		int end, OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE;
			finderArgs = new Object[] { active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE;
			finderArgs = new Object[] { active, start, end, orderByComparator };
		}

		List<VcmsArticleStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleStatus vcmsArticleStatus : list) {
					if ((active != vcmsArticleStatus.getActive())) {
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

			query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

				if (!pagination) {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
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
	 * Returns the first vcms article status in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByActive_First(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByActive_First(active,
				orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms article status in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByActive_First(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		List<VcmsArticleStatus> list = findByActive(active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article status in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByActive_Last(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByActive_Last(active,
				orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms article status in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByActive_Last(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		int count = countByActive(active);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleStatus> list = findByActive(active, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article statuses before and after the current vcms article status in the ordered set where active = &#63;.
	 *
	 * @param vcmsArticleStatusPK the primary key of the current vcms article status
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus[] findByActive_PrevAndNext(
		VcmsArticleStatusPK vcmsArticleStatusPK, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = findByPrimaryKey(vcmsArticleStatusPK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleStatus[] array = new VcmsArticleStatusImpl[3];

			array[0] = getByActive_PrevAndNext(session, vcmsArticleStatus,
					active, orderByComparator, true);

			array[1] = vcmsArticleStatus;

			array[2] = getByActive_PrevAndNext(session, vcmsArticleStatus,
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

	protected VcmsArticleStatus getByActive_PrevAndNext(Session session,
		VcmsArticleStatus vcmsArticleStatus, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

		query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

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
			query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article statuses where active = &#63; from the database.
	 *
	 * @param active the active
	 */
	@Override
	public void removeByActive(boolean active) {
		for (VcmsArticleStatus vcmsArticleStatus : findByActive(active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleStatus);
		}
	}

	/**
	 * Returns the number of vcms article statuses where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching vcms article statuses
	 */
	@Override
	public int countByActive(boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVE;

		Object[] finderArgs = new Object[] { active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLESTATUS_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_2 = "vcmsArticleStatus.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUser",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUser",
			new String[] { String.class.getName() },
			VcmsArticleStatusModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VcmsArticleStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUser",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms article statuses where createdByUser = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @return the matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByUser(String createdByUser) {
		return findByUser(createdByUser, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms article statuses where createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @return the range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByUser(String createdByUser, int start,
		int end) {
		return findByUser(createdByUser, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByUser(String createdByUser, int start,
		int end, OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return findByUser(createdByUser, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByUser(String createdByUser, int start,
		int end, OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER;
			finderArgs = new Object[] { createdByUser };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USER;
			finderArgs = new Object[] {
					createdByUser,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticleStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleStatus vcmsArticleStatus : list) {
					if (!Objects.equals(createdByUser,
								vcmsArticleStatus.getCreatedByUser())) {
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

			query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				if (!pagination) {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
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
	 * Returns the first vcms article status in the ordered set where createdByUser = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByUser_First(String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByUser_First(createdByUser,
				orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdByUser=");
		msg.append(createdByUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms article status in the ordered set where createdByUser = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByUser_First(String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		List<VcmsArticleStatus> list = findByUser(createdByUser, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article status in the ordered set where createdByUser = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByUser_Last(String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByUser_Last(createdByUser,
				orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdByUser=");
		msg.append(createdByUser);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms article status in the ordered set where createdByUser = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByUser_Last(String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		int count = countByUser(createdByUser);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleStatus> list = findByUser(createdByUser, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article statuses before and after the current vcms article status in the ordered set where createdByUser = &#63;.
	 *
	 * @param vcmsArticleStatusPK the primary key of the current vcms article status
	 * @param createdByUser the created by user
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus[] findByUser_PrevAndNext(
		VcmsArticleStatusPK vcmsArticleStatusPK, String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = findByPrimaryKey(vcmsArticleStatusPK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleStatus[] array = new VcmsArticleStatusImpl[3];

			array[0] = getByUser_PrevAndNext(session, vcmsArticleStatus,
					createdByUser, orderByComparator, true);

			array[1] = vcmsArticleStatus;

			array[2] = getByUser_PrevAndNext(session, vcmsArticleStatus,
					createdByUser, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticleStatus getByUser_PrevAndNext(Session session,
		VcmsArticleStatus vcmsArticleStatus, String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

		boolean bindCreatedByUser = false;

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_1);
		}
		else if (createdByUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_3);
		}
		else {
			bindCreatedByUser = true;

			query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_2);
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
			query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCreatedByUser) {
			qPos.add(createdByUser);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article statuses where createdByUser = &#63; from the database.
	 *
	 * @param createdByUser the created by user
	 */
	@Override
	public void removeByUser(String createdByUser) {
		for (VcmsArticleStatus vcmsArticleStatus : findByUser(createdByUser,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleStatus);
		}
	}

	/**
	 * Returns the number of vcms article statuses where createdByUser = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @return the number of matching vcms article statuses
	 */
	@Override
	public int countByUser(String createdByUser) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER;

		Object[] finderArgs = new Object[] { createdByUser };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLESTATUS_WHERE);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_USER_CREATEDBYUSER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_USER_CREATEDBYUSER_1 = "vcmsArticleStatus.createdByUser IS NULL";
	private static final String _FINDER_COLUMN_USER_CREATEDBYUSER_2 = "vcmsArticleStatus.createdByUser = ?";
	private static final String _FINDER_COLUMN_USER_CREATEDBYUSER_3 = "(vcmsArticleStatus.createdByUser IS NULL OR vcmsArticleStatus.createdByUser = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_U_A = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByU_A",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_A = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByU_A",
			new String[] { String.class.getName(), Boolean.class.getName() },
			VcmsArticleStatusModelImpl.CREATEDBYUSER_COLUMN_BITMASK |
			VcmsArticleStatusModelImpl.ACTIVE_COLUMN_BITMASK |
			VcmsArticleStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_U_A = new FinderPath(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByU_A",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @return the matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByU_A(String createdByUser,
		boolean active) {
		return findByU_A(createdByUser, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @return the range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByU_A(String createdByUser,
		boolean active, int start, int end) {
		return findByU_A(createdByUser, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByU_A(String createdByUser,
		boolean active, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return findByU_A(createdByUser, active, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findByU_A(String createdByUser,
		boolean active, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_A;
			finderArgs = new Object[] { createdByUser, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_U_A;
			finderArgs = new Object[] {
					createdByUser, active,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticleStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleStatus vcmsArticleStatus : list) {
					if (!Objects.equals(createdByUser,
								vcmsArticleStatus.getCreatedByUser()) ||
							(active != vcmsArticleStatus.getActive())) {
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

			query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_2);
			}

			query.append(_FINDER_COLUMN_U_A_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
				}

				qPos.add(active);

				if (!pagination) {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
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
	 * Returns the first vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByU_A_First(String createdByUser,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByU_A_First(createdByUser,
				active, orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdByUser=");
		msg.append(createdByUser);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByU_A_First(String createdByUser,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator) {
		List<VcmsArticleStatus> list = findByU_A(createdByUser, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus findByU_A_Last(String createdByUser,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByU_A_Last(createdByUser,
				active, orderByComparator);

		if (vcmsArticleStatus != null) {
			return vcmsArticleStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("createdByUser=");
		msg.append(createdByUser);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByU_A_Last(String createdByUser,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator) {
		int count = countByU_A(createdByUser, active);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleStatus> list = findByU_A(createdByUser, active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article statuses before and after the current vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	 *
	 * @param vcmsArticleStatusPK the primary key of the current vcms article status
	 * @param createdByUser the created by user
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus[] findByU_A_PrevAndNext(
		VcmsArticleStatusPK vcmsArticleStatusPK, String createdByUser,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = findByPrimaryKey(vcmsArticleStatusPK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleStatus[] array = new VcmsArticleStatusImpl[3];

			array[0] = getByU_A_PrevAndNext(session, vcmsArticleStatus,
					createdByUser, active, orderByComparator, true);

			array[1] = vcmsArticleStatus;

			array[2] = getByU_A_PrevAndNext(session, vcmsArticleStatus,
					createdByUser, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticleStatus getByU_A_PrevAndNext(Session session,
		VcmsArticleStatus vcmsArticleStatus, String createdByUser,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSARTICLESTATUS_WHERE);

		boolean bindCreatedByUser = false;

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_1);
		}
		else if (createdByUser.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_3);
		}
		else {
			bindCreatedByUser = true;

			query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_2);
		}

		query.append(_FINDER_COLUMN_U_A_ACTIVE_2);

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
			query.append(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCreatedByUser) {
			qPos.add(createdByUser);
		}

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article statuses where createdByUser = &#63; and active = &#63; from the database.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 */
	@Override
	public void removeByU_A(String createdByUser, boolean active) {
		for (VcmsArticleStatus vcmsArticleStatus : findByU_A(createdByUser,
				active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleStatus);
		}
	}

	/**
	 * Returns the number of vcms article statuses where createdByUser = &#63; and active = &#63;.
	 *
	 * @param createdByUser the created by user
	 * @param active the active
	 * @return the number of matching vcms article statuses
	 */
	@Override
	public int countByU_A(String createdByUser, boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_U_A;

		Object[] finderArgs = new Object[] { createdByUser, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSARTICLESTATUS_WHERE);

			boolean bindCreatedByUser = false;

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_1);
			}
			else if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_3);
			}
			else {
				bindCreatedByUser = true;

				query.append(_FINDER_COLUMN_U_A_CREATEDBYUSER_2);
			}

			query.append(_FINDER_COLUMN_U_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCreatedByUser) {
					qPos.add(createdByUser);
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

	private static final String _FINDER_COLUMN_U_A_CREATEDBYUSER_1 = "vcmsArticleStatus.createdByUser IS NULL AND ";
	private static final String _FINDER_COLUMN_U_A_CREATEDBYUSER_2 = "vcmsArticleStatus.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_A_CREATEDBYUSER_3 = "(vcmsArticleStatus.createdByUser IS NULL OR vcmsArticleStatus.createdByUser = '') AND ";
	private static final String _FINDER_COLUMN_U_A_ACTIVE_2 = "vcmsArticleStatus.active = ?";

	public VcmsArticleStatusPersistenceImpl() {
		setModelClass(VcmsArticleStatus.class);
	}

	/**
	 * Caches the vcms article status in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleStatus the vcms article status
	 */
	@Override
	public void cacheResult(VcmsArticleStatus vcmsArticleStatus) {
		entityCache.putResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusImpl.class, vcmsArticleStatus.getPrimaryKey(),
			vcmsArticleStatus);

		vcmsArticleStatus.resetOriginalValues();
	}

	/**
	 * Caches the vcms article statuses in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleStatuses the vcms article statuses
	 */
	@Override
	public void cacheResult(List<VcmsArticleStatus> vcmsArticleStatuses) {
		for (VcmsArticleStatus vcmsArticleStatus : vcmsArticleStatuses) {
			if (entityCache.getResult(
						VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleStatusImpl.class,
						vcmsArticleStatus.getPrimaryKey()) == null) {
				cacheResult(vcmsArticleStatus);
			}
			else {
				vcmsArticleStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms article statuses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsArticleStatusImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms article status.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsArticleStatus vcmsArticleStatus) {
		entityCache.removeResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusImpl.class, vcmsArticleStatus.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsArticleStatus> vcmsArticleStatuses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsArticleStatus vcmsArticleStatus : vcmsArticleStatuses) {
			entityCache.removeResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleStatusImpl.class, vcmsArticleStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms article status with the primary key. Does not add the vcms article status to the database.
	 *
	 * @param vcmsArticleStatusPK the primary key for the new vcms article status
	 * @return the new vcms article status
	 */
	@Override
	public VcmsArticleStatus create(VcmsArticleStatusPK vcmsArticleStatusPK) {
		VcmsArticleStatus vcmsArticleStatus = new VcmsArticleStatusImpl();

		vcmsArticleStatus.setNew(true);
		vcmsArticleStatus.setPrimaryKey(vcmsArticleStatusPK);

		return vcmsArticleStatus;
	}

	/**
	 * Removes the vcms article status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsArticleStatusPK the primary key of the vcms article status
	 * @return the vcms article status that was removed
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus remove(VcmsArticleStatusPK vcmsArticleStatusPK)
		throws NoSuchVcmsArticleStatusException {
		return remove((Serializable)vcmsArticleStatusPK);
	}

	/**
	 * Removes the vcms article status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article status
	 * @return the vcms article status that was removed
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus remove(Serializable primaryKey)
		throws NoSuchVcmsArticleStatusException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticleStatus vcmsArticleStatus = (VcmsArticleStatus)session.get(VcmsArticleStatusImpl.class,
					primaryKey);

			if (vcmsArticleStatus == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsArticleStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsArticleStatus);
		}
		catch (NoSuchVcmsArticleStatusException nsee) {
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
	protected VcmsArticleStatus removeImpl(VcmsArticleStatus vcmsArticleStatus) {
		vcmsArticleStatus = toUnwrappedModel(vcmsArticleStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsArticleStatus)) {
				vcmsArticleStatus = (VcmsArticleStatus)session.get(VcmsArticleStatusImpl.class,
						vcmsArticleStatus.getPrimaryKeyObj());
			}

			if (vcmsArticleStatus != null) {
				session.delete(vcmsArticleStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsArticleStatus != null) {
			clearCache(vcmsArticleStatus);
		}

		return vcmsArticleStatus;
	}

	@Override
	public VcmsArticleStatus updateImpl(VcmsArticleStatus vcmsArticleStatus) {
		vcmsArticleStatus = toUnwrappedModel(vcmsArticleStatus);

		boolean isNew = vcmsArticleStatus.isNew();

		VcmsArticleStatusModelImpl vcmsArticleStatusModelImpl = (VcmsArticleStatusModelImpl)vcmsArticleStatus;

		Session session = null;

		try {
			session = openSession();

			if (vcmsArticleStatus.isNew()) {
				session.save(vcmsArticleStatus);

				vcmsArticleStatus.setNew(false);
			}
			else {
				vcmsArticleStatus = (VcmsArticleStatus)session.merge(vcmsArticleStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsArticleStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsArticleStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleStatusModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsArticleStatusModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}

			if ((vcmsArticleStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleStatusModelImpl.getOriginalActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);

				args = new Object[] { vcmsArticleStatusModelImpl.getActive() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);
			}

			if ((vcmsArticleStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleStatusModelImpl.getOriginalCreatedByUser()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER,
					args);

				args = new Object[] {
						vcmsArticleStatusModelImpl.getCreatedByUser()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER,
					args);
			}

			if ((vcmsArticleStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleStatusModelImpl.getOriginalCreatedByUser(),
						vcmsArticleStatusModelImpl.getOriginalActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_A,
					args);

				args = new Object[] {
						vcmsArticleStatusModelImpl.getCreatedByUser(),
						vcmsArticleStatusModelImpl.getActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_U_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_U_A,
					args);
			}
		}

		entityCache.putResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleStatusImpl.class, vcmsArticleStatus.getPrimaryKey(),
			vcmsArticleStatus, false);

		vcmsArticleStatus.resetOriginalValues();

		return vcmsArticleStatus;
	}

	protected VcmsArticleStatus toUnwrappedModel(
		VcmsArticleStatus vcmsArticleStatus) {
		if (vcmsArticleStatus instanceof VcmsArticleStatusImpl) {
			return vcmsArticleStatus;
		}

		VcmsArticleStatusImpl vcmsArticleStatusImpl = new VcmsArticleStatusImpl();

		vcmsArticleStatusImpl.setNew(vcmsArticleStatus.isNew());
		vcmsArticleStatusImpl.setPrimaryKey(vcmsArticleStatus.getPrimaryKey());

		vcmsArticleStatusImpl.setStatusId(vcmsArticleStatus.getStatusId());
		vcmsArticleStatusImpl.setArticleId(vcmsArticleStatus.getArticleId());
		vcmsArticleStatusImpl.setCategoryId(vcmsArticleStatus.getCategoryId());
		vcmsArticleStatusImpl.setCreatedDate(vcmsArticleStatus.getCreatedDate());
		vcmsArticleStatusImpl.setCreatedByUser(vcmsArticleStatus.getCreatedByUser());
		vcmsArticleStatusImpl.setActive(vcmsArticleStatus.isActive());
		vcmsArticleStatusImpl.setArticleVersionId(vcmsArticleStatus.getArticleVersionId());

		return vcmsArticleStatusImpl;
	}

	/**
	 * Returns the vcms article status with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article status
	 * @return the vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsArticleStatusException {
		VcmsArticleStatus vcmsArticleStatus = fetchByPrimaryKey(primaryKey);

		if (vcmsArticleStatus == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsArticleStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsArticleStatus;
	}

	/**
	 * Returns the vcms article status with the primary key or throws a {@link NoSuchVcmsArticleStatusException} if it could not be found.
	 *
	 * @param vcmsArticleStatusPK the primary key of the vcms article status
	 * @return the vcms article status
	 * @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus findByPrimaryKey(
		VcmsArticleStatusPK vcmsArticleStatusPK)
		throws NoSuchVcmsArticleStatusException {
		return findByPrimaryKey((Serializable)vcmsArticleStatusPK);
	}

	/**
	 * Returns the vcms article status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article status
	 * @return the vcms article status, or <code>null</code> if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleStatusImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsArticleStatus vcmsArticleStatus = (VcmsArticleStatus)serializable;

		if (vcmsArticleStatus == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticleStatus = (VcmsArticleStatus)session.get(VcmsArticleStatusImpl.class,
						primaryKey);

				if (vcmsArticleStatus != null) {
					cacheResult(vcmsArticleStatus);
				}
				else {
					entityCache.putResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleStatusImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsArticleStatusModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsArticleStatus;
	}

	/**
	 * Returns the vcms article status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsArticleStatusPK the primary key of the vcms article status
	 * @return the vcms article status, or <code>null</code> if a vcms article status with the primary key could not be found
	 */
	@Override
	public VcmsArticleStatus fetchByPrimaryKey(
		VcmsArticleStatusPK vcmsArticleStatusPK) {
		return fetchByPrimaryKey((Serializable)vcmsArticleStatusPK);
	}

	@Override
	public Map<Serializable, VcmsArticleStatus> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsArticleStatus> map = new HashMap<Serializable, VcmsArticleStatus>();

		for (Serializable primaryKey : primaryKeys) {
			VcmsArticleStatus vcmsArticleStatus = fetchByPrimaryKey(primaryKey);

			if (vcmsArticleStatus != null) {
				map.put(primaryKey, vcmsArticleStatus);
			}
		}

		return map;
	}

	/**
	 * Returns all the vcms article statuses.
	 *
	 * @return the vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @return the range of vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findAll(int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article statuses
	 * @param end the upper bound of the range of vcms article statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms article statuses
	 */
	@Override
	public List<VcmsArticleStatus> findAll(int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
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

		List<VcmsArticleStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleStatus>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSARTICLESTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLESTATUS;

				if (pagination) {
					sql = sql.concat(VcmsArticleStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleStatus>)QueryUtil.list(q,
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
	 * Removes all the vcms article statuses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsArticleStatus vcmsArticleStatus : findAll()) {
			remove(vcmsArticleStatus);
		}
	}

	/**
	 * Returns the number of vcms article statuses.
	 *
	 * @return the number of vcms article statuses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLESTATUS);

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
		return VcmsArticleStatusModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms article status persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsArticleStatusImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSARTICLESTATUS = "SELECT vcmsArticleStatus FROM VcmsArticleStatus vcmsArticleStatus";
	private static final String _SQL_SELECT_VCMSARTICLESTATUS_WHERE = "SELECT vcmsArticleStatus FROM VcmsArticleStatus vcmsArticleStatus WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLESTATUS = "SELECT COUNT(vcmsArticleStatus) FROM VcmsArticleStatus vcmsArticleStatus";
	private static final String _SQL_COUNT_VCMSARTICLESTATUS_WHERE = "SELECT COUNT(vcmsArticleStatus) FROM VcmsArticleStatus vcmsArticleStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticleStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticleStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticleStatus exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsArticleStatusPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"active"
			});
}