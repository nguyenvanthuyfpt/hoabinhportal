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

import vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException;
import vn.gov.hoabinh.model.VcmsArticleVersion;
import vn.gov.hoabinh.model.impl.VcmsArticleVersionImpl;
import vn.gov.hoabinh.model.impl.VcmsArticleVersionModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsArticleVersionPersistence;

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
 * The persistence implementation for the vcms article version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleVersionPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsArticleVersionUtil
 * @generated
 */
@ProviderType
public class VcmsArticleVersionPersistenceImpl extends BasePersistenceImpl<VcmsArticleVersion>
	implements VcmsArticleVersionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsArticleVersionUtil} to access the vcms article version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleVersionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleVersionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsArticleVersionModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsArticleVersionModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms article versions where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms article versions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article versions
	 * @param end the upper bound of the range of vcms article versions (not inclusive)
	 * @return the range of matching vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article versions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article versions
	 * @param end the upper bound of the range of vcms article versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article versions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article versions
	 * @param end the upper bound of the range of vcms article versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsArticleVersion> orderByComparator,
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

		List<VcmsArticleVersion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleVersion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleVersion vcmsArticleVersion : list) {
					if (!Objects.equals(articleId,
								vcmsArticleVersion.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSARTICLEVERSION_WHERE);

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
				query.append(VcmsArticleVersionModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsArticleVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleVersion>)QueryUtil.list(q,
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
	 * Returns the first vcms article version in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article version
	 * @throws NoSuchVcmsArticleVersionException if a matching vcms article version could not be found
	 */
	@Override
	public VcmsArticleVersion findByArticle_First(String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws NoSuchVcmsArticleVersionException {
		VcmsArticleVersion vcmsArticleVersion = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsArticleVersion != null) {
			return vcmsArticleVersion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleVersionException(msg.toString());
	}

	/**
	 * Returns the first vcms article version in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article version, or <code>null</code> if a matching vcms article version could not be found
	 */
	@Override
	public VcmsArticleVersion fetchByArticle_First(String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		List<VcmsArticleVersion> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article version in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article version
	 * @throws NoSuchVcmsArticleVersionException if a matching vcms article version could not be found
	 */
	@Override
	public VcmsArticleVersion findByArticle_Last(String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws NoSuchVcmsArticleVersionException {
		VcmsArticleVersion vcmsArticleVersion = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsArticleVersion != null) {
			return vcmsArticleVersion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleVersionException(msg.toString());
	}

	/**
	 * Returns the last vcms article version in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article version, or <code>null</code> if a matching vcms article version could not be found
	 */
	@Override
	public VcmsArticleVersion fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleVersion> list = findByArticle(articleId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article versions before and after the current vcms article version in the ordered set where articleId = &#63;.
	 *
	 * @param articleVersionId the primary key of the current vcms article version
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article version
	 * @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion[] findByArticle_PrevAndNext(
		long articleVersionId, String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws NoSuchVcmsArticleVersionException {
		VcmsArticleVersion vcmsArticleVersion = findByPrimaryKey(articleVersionId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleVersion[] array = new VcmsArticleVersionImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsArticleVersion,
					articleId, orderByComparator, true);

			array[1] = vcmsArticleVersion;

			array[2] = getByArticle_PrevAndNext(session, vcmsArticleVersion,
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

	protected VcmsArticleVersion getByArticle_PrevAndNext(Session session,
		VcmsArticleVersion vcmsArticleVersion, String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSARTICLEVERSION_WHERE);

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
			query.append(VcmsArticleVersionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleVersion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleVersion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article versions where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsArticleVersion vcmsArticleVersion : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleVersion);
		}
	}

	/**
	 * Returns the number of vcms article versions where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms article versions
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLEVERSION_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsArticleVersion.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsArticleVersion.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsArticleVersion.articleId IS NULL OR vcmsArticleVersion.articleId = '')";

	public VcmsArticleVersionPersistenceImpl() {
		setModelClass(VcmsArticleVersion.class);
	}

	/**
	 * Caches the vcms article version in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleVersion the vcms article version
	 */
	@Override
	public void cacheResult(VcmsArticleVersion vcmsArticleVersion) {
		entityCache.putResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionImpl.class, vcmsArticleVersion.getPrimaryKey(),
			vcmsArticleVersion);

		vcmsArticleVersion.resetOriginalValues();
	}

	/**
	 * Caches the vcms article versions in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleVersions the vcms article versions
	 */
	@Override
	public void cacheResult(List<VcmsArticleVersion> vcmsArticleVersions) {
		for (VcmsArticleVersion vcmsArticleVersion : vcmsArticleVersions) {
			if (entityCache.getResult(
						VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleVersionImpl.class,
						vcmsArticleVersion.getPrimaryKey()) == null) {
				cacheResult(vcmsArticleVersion);
			}
			else {
				vcmsArticleVersion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms article versions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsArticleVersionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms article version.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsArticleVersion vcmsArticleVersion) {
		entityCache.removeResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionImpl.class, vcmsArticleVersion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsArticleVersion> vcmsArticleVersions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsArticleVersion vcmsArticleVersion : vcmsArticleVersions) {
			entityCache.removeResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleVersionImpl.class, vcmsArticleVersion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms article version with the primary key. Does not add the vcms article version to the database.
	 *
	 * @param articleVersionId the primary key for the new vcms article version
	 * @return the new vcms article version
	 */
	@Override
	public VcmsArticleVersion create(long articleVersionId) {
		VcmsArticleVersion vcmsArticleVersion = new VcmsArticleVersionImpl();

		vcmsArticleVersion.setNew(true);
		vcmsArticleVersion.setPrimaryKey(articleVersionId);

		vcmsArticleVersion.setCompanyId(companyProvider.getCompanyId());

		return vcmsArticleVersion;
	}

	/**
	 * Removes the vcms article version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param articleVersionId the primary key of the vcms article version
	 * @return the vcms article version that was removed
	 * @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion remove(long articleVersionId)
		throws NoSuchVcmsArticleVersionException {
		return remove((Serializable)articleVersionId);
	}

	/**
	 * Removes the vcms article version with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article version
	 * @return the vcms article version that was removed
	 * @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion remove(Serializable primaryKey)
		throws NoSuchVcmsArticleVersionException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticleVersion vcmsArticleVersion = (VcmsArticleVersion)session.get(VcmsArticleVersionImpl.class,
					primaryKey);

			if (vcmsArticleVersion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsArticleVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsArticleVersion);
		}
		catch (NoSuchVcmsArticleVersionException nsee) {
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
	protected VcmsArticleVersion removeImpl(
		VcmsArticleVersion vcmsArticleVersion) {
		vcmsArticleVersion = toUnwrappedModel(vcmsArticleVersion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsArticleVersion)) {
				vcmsArticleVersion = (VcmsArticleVersion)session.get(VcmsArticleVersionImpl.class,
						vcmsArticleVersion.getPrimaryKeyObj());
			}

			if (vcmsArticleVersion != null) {
				session.delete(vcmsArticleVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsArticleVersion != null) {
			clearCache(vcmsArticleVersion);
		}

		return vcmsArticleVersion;
	}

	@Override
	public VcmsArticleVersion updateImpl(VcmsArticleVersion vcmsArticleVersion) {
		vcmsArticleVersion = toUnwrappedModel(vcmsArticleVersion);

		boolean isNew = vcmsArticleVersion.isNew();

		VcmsArticleVersionModelImpl vcmsArticleVersionModelImpl = (VcmsArticleVersionModelImpl)vcmsArticleVersion;

		Session session = null;

		try {
			session = openSession();

			if (vcmsArticleVersion.isNew()) {
				session.save(vcmsArticleVersion);

				vcmsArticleVersion.setNew(false);
			}
			else {
				vcmsArticleVersion = (VcmsArticleVersion)session.merge(vcmsArticleVersion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsArticleVersionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsArticleVersionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleVersionModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsArticleVersionModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}
		}

		entityCache.putResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleVersionImpl.class, vcmsArticleVersion.getPrimaryKey(),
			vcmsArticleVersion, false);

		vcmsArticleVersion.resetOriginalValues();

		return vcmsArticleVersion;
	}

	protected VcmsArticleVersion toUnwrappedModel(
		VcmsArticleVersion vcmsArticleVersion) {
		if (vcmsArticleVersion instanceof VcmsArticleVersionImpl) {
			return vcmsArticleVersion;
		}

		VcmsArticleVersionImpl vcmsArticleVersionImpl = new VcmsArticleVersionImpl();

		vcmsArticleVersionImpl.setNew(vcmsArticleVersion.isNew());
		vcmsArticleVersionImpl.setPrimaryKey(vcmsArticleVersion.getPrimaryKey());

		vcmsArticleVersionImpl.setArticleVersionId(vcmsArticleVersion.getArticleVersionId());
		vcmsArticleVersionImpl.setGroupId(vcmsArticleVersion.getGroupId());
		vcmsArticleVersionImpl.setCompanyId(vcmsArticleVersion.getCompanyId());
		vcmsArticleVersionImpl.setArticleId(vcmsArticleVersion.getArticleId());
		vcmsArticleVersionImpl.setCreatedByUser(vcmsArticleVersion.getCreatedByUser());
		vcmsArticleVersionImpl.setCreatedDate(vcmsArticleVersion.getCreatedDate());
		vcmsArticleVersionImpl.setTypeIds(vcmsArticleVersion.getTypeIds());
		vcmsArticleVersionImpl.setStatus(vcmsArticleVersion.getStatus());
		vcmsArticleVersionImpl.setVersionName(vcmsArticleVersion.getVersionName());
		vcmsArticleVersionImpl.setTitle(vcmsArticleVersion.getTitle());
		vcmsArticleVersionImpl.setLead(vcmsArticleVersion.getLead());
		vcmsArticleVersionImpl.setContent(vcmsArticleVersion.getContent());
		vcmsArticleVersionImpl.setHasImage(vcmsArticleVersion.isHasImage());
		vcmsArticleVersionImpl.setImageTitle(vcmsArticleVersion.getImageTitle());
		vcmsArticleVersionImpl.setImage(vcmsArticleVersion.getImage());
		vcmsArticleVersionImpl.setLanguage(vcmsArticleVersion.getLanguage());
		vcmsArticleVersionImpl.setUserHit(vcmsArticleVersion.getUserHit());
		vcmsArticleVersionImpl.setAuthor(vcmsArticleVersion.getAuthor());
		vcmsArticleVersionImpl.setSource(vcmsArticleVersion.getSource());
		vcmsArticleVersionImpl.setDiscussible(vcmsArticleVersion.isDiscussible());
		vcmsArticleVersionImpl.setHasAttachment(vcmsArticleVersion.isHasAttachment());
		vcmsArticleVersionImpl.setHasPoll(vcmsArticleVersion.isHasPoll());
		vcmsArticleVersionImpl.setPollId(vcmsArticleVersion.getPollId());
		vcmsArticleVersionImpl.setPublishedByUser(vcmsArticleVersion.getPublishedByUser());
		vcmsArticleVersionImpl.setModifiedByUser(vcmsArticleVersion.getModifiedByUser());
		vcmsArticleVersionImpl.setModifiedDate(vcmsArticleVersion.getModifiedDate());
		vcmsArticleVersionImpl.setPublishedDate(vcmsArticleVersion.getPublishedDate());
		vcmsArticleVersionImpl.setEffectiveDate(vcmsArticleVersion.getEffectiveDate());
		vcmsArticleVersionImpl.setExpireDate(vcmsArticleVersion.getExpireDate());
		vcmsArticleVersionImpl.setStickyExpireDate(vcmsArticleVersion.getStickyExpireDate());
		vcmsArticleVersionImpl.setSticky(vcmsArticleVersion.isSticky());
		vcmsArticleVersionImpl.setStickyNeverExpired(vcmsArticleVersion.isStickyNeverExpired());

		return vcmsArticleVersionImpl;
	}

	/**
	 * Returns the vcms article version with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article version
	 * @return the vcms article version
	 * @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsArticleVersionException {
		VcmsArticleVersion vcmsArticleVersion = fetchByPrimaryKey(primaryKey);

		if (vcmsArticleVersion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsArticleVersionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsArticleVersion;
	}

	/**
	 * Returns the vcms article version with the primary key or throws a {@link NoSuchVcmsArticleVersionException} if it could not be found.
	 *
	 * @param articleVersionId the primary key of the vcms article version
	 * @return the vcms article version
	 * @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion findByPrimaryKey(long articleVersionId)
		throws NoSuchVcmsArticleVersionException {
		return findByPrimaryKey((Serializable)articleVersionId);
	}

	/**
	 * Returns the vcms article version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article version
	 * @return the vcms article version, or <code>null</code> if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleVersionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsArticleVersion vcmsArticleVersion = (VcmsArticleVersion)serializable;

		if (vcmsArticleVersion == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticleVersion = (VcmsArticleVersion)session.get(VcmsArticleVersionImpl.class,
						primaryKey);

				if (vcmsArticleVersion != null) {
					cacheResult(vcmsArticleVersion);
				}
				else {
					entityCache.putResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleVersionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleVersionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsArticleVersion;
	}

	/**
	 * Returns the vcms article version with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param articleVersionId the primary key of the vcms article version
	 * @return the vcms article version, or <code>null</code> if a vcms article version with the primary key could not be found
	 */
	@Override
	public VcmsArticleVersion fetchByPrimaryKey(long articleVersionId) {
		return fetchByPrimaryKey((Serializable)articleVersionId);
	}

	@Override
	public Map<Serializable, VcmsArticleVersion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsArticleVersion> map = new HashMap<Serializable, VcmsArticleVersion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsArticleVersion vcmsArticleVersion = fetchByPrimaryKey(primaryKey);

			if (vcmsArticleVersion != null) {
				map.put(primaryKey, vcmsArticleVersion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleVersionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsArticleVersion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VCMSARTICLEVERSION_WHERE_PKS_IN);

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

			for (VcmsArticleVersion vcmsArticleVersion : (List<VcmsArticleVersion>)q.list()) {
				map.put(vcmsArticleVersion.getPrimaryKeyObj(),
					vcmsArticleVersion);

				cacheResult(vcmsArticleVersion);

				uncachedPrimaryKeys.remove(vcmsArticleVersion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsArticleVersionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleVersionImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms article versions.
	 *
	 * @return the vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article versions
	 * @param end the upper bound of the range of vcms article versions (not inclusive)
	 * @return the range of vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article versions
	 * @param end the upper bound of the range of vcms article versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findAll(int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article versions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article versions
	 * @param end the upper bound of the range of vcms article versions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms article versions
	 */
	@Override
	public List<VcmsArticleVersion> findAll(int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator,
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

		List<VcmsArticleVersion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleVersion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSARTICLEVERSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLEVERSION;

				if (pagination) {
					sql = sql.concat(VcmsArticleVersionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsArticleVersion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleVersion>)QueryUtil.list(q,
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
	 * Removes all the vcms article versions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsArticleVersion vcmsArticleVersion : findAll()) {
			remove(vcmsArticleVersion);
		}
	}

	/**
	 * Returns the number of vcms article versions.
	 *
	 * @return the number of vcms article versions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLEVERSION);

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
		return VcmsArticleVersionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms article version persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsArticleVersionImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSARTICLEVERSION = "SELECT vcmsArticleVersion FROM VcmsArticleVersion vcmsArticleVersion";
	private static final String _SQL_SELECT_VCMSARTICLEVERSION_WHERE_PKS_IN = "SELECT vcmsArticleVersion FROM VcmsArticleVersion vcmsArticleVersion WHERE articleVersionId IN (";
	private static final String _SQL_SELECT_VCMSARTICLEVERSION_WHERE = "SELECT vcmsArticleVersion FROM VcmsArticleVersion vcmsArticleVersion WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLEVERSION = "SELECT COUNT(vcmsArticleVersion) FROM VcmsArticleVersion vcmsArticleVersion";
	private static final String _SQL_COUNT_VCMSARTICLEVERSION_WHERE = "SELECT COUNT(vcmsArticleVersion) FROM VcmsArticleVersion vcmsArticleVersion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticleVersion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticleVersion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticleVersion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsArticleVersionPersistenceImpl.class);
}