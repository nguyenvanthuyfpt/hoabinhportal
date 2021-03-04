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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsCARelationException;
import vn.gov.hoabinh.model.VcmsCARelation;
import vn.gov.hoabinh.model.impl.VcmsCARelationImpl;
import vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsCARelationPK;
import vn.gov.hoabinh.service.persistence.VcmsCARelationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms c a relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelationPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsCARelationUtil
 * @generated
 */
@ProviderType
public class VcmsCARelationPersistenceImpl extends BasePersistenceImpl<VcmsCARelation>
	implements VcmsCARelationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsCARelationUtil} to access the vcms c a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsCARelationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORY = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCategory",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY =
		new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCategory",
			new String[] { String.class.getName() },
			VcmsCARelationModelImpl.CATEGORYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORY = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategory",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms c a relations where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByCategory(String categoryId) {
		return findByCategory(categoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms c a relations where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @return the range of matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByCategory(String categoryId, int start,
		int end) {
		return findByCategory(categoryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms c a relations where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByCategory(String categoryId, int start,
		int end, OrderByComparator<VcmsCARelation> orderByComparator) {
		return findByCategory(categoryId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms c a relations where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByCategory(String categoryId, int start,
		int end, OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY;
			finderArgs = new Object[] { categoryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORY;
			finderArgs = new Object[] { categoryId, start, end, orderByComparator };
		}

		List<VcmsCARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCARelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCARelation vcmsCARelation : list) {
					if (!Objects.equals(categoryId,
								vcmsCARelation.getCategoryId())) {
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

			query.append(_SQL_SELECT_VCMSCARELATION_WHERE);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsCARelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCategoryId) {
					qPos.add(categoryId);
				}

				if (!pagination) {
					list = (List<VcmsCARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCARelation>)QueryUtil.list(q,
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
	 * Returns the first vcms c a relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation findByCategory_First(String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = fetchByCategory_First(categoryId,
				orderByComparator);

		if (vcmsCARelation != null) {
			return vcmsCARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCARelationException(msg.toString());
	}

	/**
	 * Returns the first vcms c a relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation fetchByCategory_First(String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		List<VcmsCARelation> list = findByCategory(categoryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms c a relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation findByCategory_Last(String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = fetchByCategory_Last(categoryId,
				orderByComparator);

		if (vcmsCARelation != null) {
			return vcmsCARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCARelationException(msg.toString());
	}

	/**
	 * Returns the last vcms c a relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation fetchByCategory_Last(String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		int count = countByCategory(categoryId);

		if (count == 0) {
			return null;
		}

		List<VcmsCARelation> list = findByCategory(categoryId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms c a relations before and after the current vcms c a relation in the ordered set where categoryId = &#63;.
	 *
	 * @param vcmsCARelationPK the primary key of the current vcms c a relation
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation[] findByCategory_PrevAndNext(
		VcmsCARelationPK vcmsCARelationPK, String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = findByPrimaryKey(vcmsCARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsCARelation[] array = new VcmsCARelationImpl[3];

			array[0] = getByCategory_PrevAndNext(session, vcmsCARelation,
					categoryId, orderByComparator, true);

			array[1] = vcmsCARelation;

			array[2] = getByCategory_PrevAndNext(session, vcmsCARelation,
					categoryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsCARelation getByCategory_PrevAndNext(Session session,
		VcmsCARelation vcmsCARelation, String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSCARELATION_WHERE);

		boolean bindCategoryId = false;

		if (categoryId == null) {
			query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_1);
		}
		else if (categoryId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_3);
		}
		else {
			bindCategoryId = true;

			query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_2);
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
			query.append(VcmsCARelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCategoryId) {
			qPos.add(categoryId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms c a relations where categoryId = &#63; from the database.
	 *
	 * @param categoryId the category ID
	 */
	@Override
	public void removeByCategory(String categoryId) {
		for (VcmsCARelation vcmsCARelation : findByCategory(categoryId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCARelation);
		}
	}

	/**
	 * Returns the number of vcms c a relations where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the number of matching vcms c a relations
	 */
	@Override
	public int countByCategory(String categoryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORY;

		Object[] finderArgs = new Object[] { categoryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSCARELATION_WHERE);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_CATEGORY_CATEGORYID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_1 = "vcmsCARelation.id.categoryId IS NULL";
	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_2 = "vcmsCARelation.id.categoryId = ?";
	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_3 = "(vcmsCARelation.id.categoryId IS NULL OR vcmsCARelation.id.categoryId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsCARelationModelImpl.ARTICLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms c a relations where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms c a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @return the range of matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms c a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsCARelation> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms c a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsCARelation> orderByComparator,
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

		List<VcmsCARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCARelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCARelation vcmsCARelation : list) {
					if (!Objects.equals(articleId, vcmsCARelation.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSCARELATION_WHERE);

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
				query.append(VcmsCARelationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsCARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCARelation>)QueryUtil.list(q,
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
	 * Returns the first vcms c a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation findByArticle_First(String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsCARelation != null) {
			return vcmsCARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCARelationException(msg.toString());
	}

	/**
	 * Returns the first vcms c a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation fetchByArticle_First(String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		List<VcmsCARelation> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms c a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation findByArticle_Last(String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsCARelation != null) {
			return vcmsCARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCARelationException(msg.toString());
	}

	/**
	 * Returns the last vcms c a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	 */
	@Override
	public VcmsCARelation fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsCARelation> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms c a relations before and after the current vcms c a relation in the ordered set where articleId = &#63;.
	 *
	 * @param vcmsCARelationPK the primary key of the current vcms c a relation
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation[] findByArticle_PrevAndNext(
		VcmsCARelationPK vcmsCARelationPK, String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = findByPrimaryKey(vcmsCARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsCARelation[] array = new VcmsCARelationImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsCARelation,
					articleId, orderByComparator, true);

			array[1] = vcmsCARelation;

			array[2] = getByArticle_PrevAndNext(session, vcmsCARelation,
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

	protected VcmsCARelation getByArticle_PrevAndNext(Session session,
		VcmsCARelation vcmsCARelation, String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSCARELATION_WHERE);

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
			query.append(VcmsCARelationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms c a relations where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsCARelation vcmsCARelation : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCARelation);
		}
	}

	/**
	 * Returns the number of vcms c a relations where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms c a relations
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSCARELATION_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsCARelation.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsCARelation.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsCARelation.id.articleId IS NULL OR vcmsCARelation.id.articleId = '')";

	public VcmsCARelationPersistenceImpl() {
		setModelClass(VcmsCARelation.class);
	}

	/**
	 * Caches the vcms c a relation in the entity cache if it is enabled.
	 *
	 * @param vcmsCARelation the vcms c a relation
	 */
	@Override
	public void cacheResult(VcmsCARelation vcmsCARelation) {
		entityCache.putResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationImpl.class, vcmsCARelation.getPrimaryKey(),
			vcmsCARelation);

		vcmsCARelation.resetOriginalValues();
	}

	/**
	 * Caches the vcms c a relations in the entity cache if it is enabled.
	 *
	 * @param vcmsCARelations the vcms c a relations
	 */
	@Override
	public void cacheResult(List<VcmsCARelation> vcmsCARelations) {
		for (VcmsCARelation vcmsCARelation : vcmsCARelations) {
			if (entityCache.getResult(
						VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsCARelationImpl.class, vcmsCARelation.getPrimaryKey()) == null) {
				cacheResult(vcmsCARelation);
			}
			else {
				vcmsCARelation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms c a relations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsCARelationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms c a relation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsCARelation vcmsCARelation) {
		entityCache.removeResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationImpl.class, vcmsCARelation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsCARelation> vcmsCARelations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsCARelation vcmsCARelation : vcmsCARelations) {
			entityCache.removeResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsCARelationImpl.class, vcmsCARelation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms c a relation with the primary key. Does not add the vcms c a relation to the database.
	 *
	 * @param vcmsCARelationPK the primary key for the new vcms c a relation
	 * @return the new vcms c a relation
	 */
	@Override
	public VcmsCARelation create(VcmsCARelationPK vcmsCARelationPK) {
		VcmsCARelation vcmsCARelation = new VcmsCARelationImpl();

		vcmsCARelation.setNew(true);
		vcmsCARelation.setPrimaryKey(vcmsCARelationPK);

		return vcmsCARelation;
	}

	/**
	 * Removes the vcms c a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsCARelationPK the primary key of the vcms c a relation
	 * @return the vcms c a relation that was removed
	 * @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation remove(VcmsCARelationPK vcmsCARelationPK)
		throws NoSuchVcmsCARelationException {
		return remove((Serializable)vcmsCARelationPK);
	}

	/**
	 * Removes the vcms c a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms c a relation
	 * @return the vcms c a relation that was removed
	 * @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation remove(Serializable primaryKey)
		throws NoSuchVcmsCARelationException {
		Session session = null;

		try {
			session = openSession();

			VcmsCARelation vcmsCARelation = (VcmsCARelation)session.get(VcmsCARelationImpl.class,
					primaryKey);

			if (vcmsCARelation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsCARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsCARelation);
		}
		catch (NoSuchVcmsCARelationException nsee) {
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
	protected VcmsCARelation removeImpl(VcmsCARelation vcmsCARelation) {
		vcmsCARelation = toUnwrappedModel(vcmsCARelation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsCARelation)) {
				vcmsCARelation = (VcmsCARelation)session.get(VcmsCARelationImpl.class,
						vcmsCARelation.getPrimaryKeyObj());
			}

			if (vcmsCARelation != null) {
				session.delete(vcmsCARelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsCARelation != null) {
			clearCache(vcmsCARelation);
		}

		return vcmsCARelation;
	}

	@Override
	public VcmsCARelation updateImpl(VcmsCARelation vcmsCARelation) {
		vcmsCARelation = toUnwrappedModel(vcmsCARelation);

		boolean isNew = vcmsCARelation.isNew();

		VcmsCARelationModelImpl vcmsCARelationModelImpl = (VcmsCARelationModelImpl)vcmsCARelation;

		Session session = null;

		try {
			session = openSession();

			if (vcmsCARelation.isNew()) {
				session.save(vcmsCARelation);

				vcmsCARelation.setNew(false);
			}
			else {
				vcmsCARelation = (VcmsCARelation)session.merge(vcmsCARelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsCARelationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsCARelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCARelationModelImpl.getOriginalCategoryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY,
					args);

				args = new Object[] { vcmsCARelationModelImpl.getCategoryId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY,
					args);
			}

			if ((vcmsCARelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCARelationModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsCARelationModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}
		}

		entityCache.putResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCARelationImpl.class, vcmsCARelation.getPrimaryKey(),
			vcmsCARelation, false);

		vcmsCARelation.resetOriginalValues();

		return vcmsCARelation;
	}

	protected VcmsCARelation toUnwrappedModel(VcmsCARelation vcmsCARelation) {
		if (vcmsCARelation instanceof VcmsCARelationImpl) {
			return vcmsCARelation;
		}

		VcmsCARelationImpl vcmsCARelationImpl = new VcmsCARelationImpl();

		vcmsCARelationImpl.setNew(vcmsCARelation.isNew());
		vcmsCARelationImpl.setPrimaryKey(vcmsCARelation.getPrimaryKey());

		vcmsCARelationImpl.setCategoryId(vcmsCARelation.getCategoryId());
		vcmsCARelationImpl.setArticleId(vcmsCARelation.getArticleId());
		vcmsCARelationImpl.setCreatedDate(vcmsCARelation.getCreatedDate());
		vcmsCARelationImpl.setCreatedByUser(vcmsCARelation.getCreatedByUser());
		vcmsCARelationImpl.setStatus(vcmsCARelation.getStatus());

		return vcmsCARelationImpl;
	}

	/**
	 * Returns the vcms c a relation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms c a relation
	 * @return the vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsCARelationException {
		VcmsCARelation vcmsCARelation = fetchByPrimaryKey(primaryKey);

		if (vcmsCARelation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsCARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsCARelation;
	}

	/**
	 * Returns the vcms c a relation with the primary key or throws a {@link NoSuchVcmsCARelationException} if it could not be found.
	 *
	 * @param vcmsCARelationPK the primary key of the vcms c a relation
	 * @return the vcms c a relation
	 * @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation findByPrimaryKey(VcmsCARelationPK vcmsCARelationPK)
		throws NoSuchVcmsCARelationException {
		return findByPrimaryKey((Serializable)vcmsCARelationPK);
	}

	/**
	 * Returns the vcms c a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms c a relation
	 * @return the vcms c a relation, or <code>null</code> if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsCARelationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsCARelation vcmsCARelation = (VcmsCARelation)serializable;

		if (vcmsCARelation == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsCARelation = (VcmsCARelation)session.get(VcmsCARelationImpl.class,
						primaryKey);

				if (vcmsCARelation != null) {
					cacheResult(vcmsCARelation);
				}
				else {
					entityCache.putResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsCARelationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsCARelationModelImpl.ENTITY_CACHE_ENABLED,
					VcmsCARelationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsCARelation;
	}

	/**
	 * Returns the vcms c a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsCARelationPK the primary key of the vcms c a relation
	 * @return the vcms c a relation, or <code>null</code> if a vcms c a relation with the primary key could not be found
	 */
	@Override
	public VcmsCARelation fetchByPrimaryKey(VcmsCARelationPK vcmsCARelationPK) {
		return fetchByPrimaryKey((Serializable)vcmsCARelationPK);
	}

	@Override
	public Map<Serializable, VcmsCARelation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsCARelation> map = new HashMap<Serializable, VcmsCARelation>();

		for (Serializable primaryKey : primaryKeys) {
			VcmsCARelation vcmsCARelation = fetchByPrimaryKey(primaryKey);

			if (vcmsCARelation != null) {
				map.put(primaryKey, vcmsCARelation);
			}
		}

		return map;
	}

	/**
	 * Returns all the vcms c a relations.
	 *
	 * @return the vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms c a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @return the range of vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms c a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findAll(int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms c a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms c a relations
	 * @param end the upper bound of the range of vcms c a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms c a relations
	 */
	@Override
	public List<VcmsCARelation> findAll(int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator,
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

		List<VcmsCARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCARelation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSCARELATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSCARELATION;

				if (pagination) {
					sql = sql.concat(VcmsCARelationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsCARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCARelation>)QueryUtil.list(q,
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
	 * Removes all the vcms c a relations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsCARelation vcmsCARelation : findAll()) {
			remove(vcmsCARelation);
		}
	}

	/**
	 * Returns the number of vcms c a relations.
	 *
	 * @return the number of vcms c a relations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSCARELATION);

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
		return VcmsCARelationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms c a relation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsCARelationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSCARELATION = "SELECT vcmsCARelation FROM VcmsCARelation vcmsCARelation";
	private static final String _SQL_SELECT_VCMSCARELATION_WHERE = "SELECT vcmsCARelation FROM VcmsCARelation vcmsCARelation WHERE ";
	private static final String _SQL_COUNT_VCMSCARELATION = "SELECT COUNT(vcmsCARelation) FROM VcmsCARelation vcmsCARelation";
	private static final String _SQL_COUNT_VCMSCARELATION_WHERE = "SELECT COUNT(vcmsCARelation) FROM VcmsCARelation vcmsCARelation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsCARelation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsCARelation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsCARelation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsCARelationPersistenceImpl.class);
}