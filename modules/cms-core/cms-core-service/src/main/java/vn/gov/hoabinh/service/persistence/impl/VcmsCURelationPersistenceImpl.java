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

import vn.gov.hoabinh.exception.NoSuchVcmsCURelationException;
import vn.gov.hoabinh.model.VcmsCURelation;
import vn.gov.hoabinh.model.impl.VcmsCURelationImpl;
import vn.gov.hoabinh.model.impl.VcmsCURelationModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsCURelationPK;
import vn.gov.hoabinh.service.persistence.VcmsCURelationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms c u relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCURelationPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsCURelationUtil
 * @generated
 */
@ProviderType
public class VcmsCURelationPersistenceImpl extends BasePersistenceImpl<VcmsCURelation>
	implements VcmsCURelationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsCURelationUtil} to access the vcms c u relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsCURelationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCURelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCURelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORY = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCURelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCategory",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY =
		new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCURelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCategory",
			new String[] { String.class.getName() },
			VcmsCURelationModelImpl.CATEGORYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORY = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategory",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms c u relations where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByCategory(String categoryId) {
		return findByCategory(categoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms c u relations where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @return the range of matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByCategory(String categoryId, int start,
		int end) {
		return findByCategory(categoryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms c u relations where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByCategory(String categoryId, int start,
		int end, OrderByComparator<VcmsCURelation> orderByComparator) {
		return findByCategory(categoryId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms c u relations where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByCategory(String categoryId, int start,
		int end, OrderByComparator<VcmsCURelation> orderByComparator,
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

		List<VcmsCURelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCURelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCURelation vcmsCURelation : list) {
					if (!Objects.equals(categoryId,
								vcmsCURelation.getCategoryId())) {
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

			query.append(_SQL_SELECT_VCMSCURELATION_WHERE);

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
				query.append(VcmsCURelationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsCURelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCURelation>)QueryUtil.list(q,
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
	 * Returns the first vcms c u relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation findByCategory_First(String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = fetchByCategory_First(categoryId,
				orderByComparator);

		if (vcmsCURelation != null) {
			return vcmsCURelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCURelationException(msg.toString());
	}

	/**
	 * Returns the first vcms c u relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation fetchByCategory_First(String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		List<VcmsCURelation> list = findByCategory(categoryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms c u relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation findByCategory_Last(String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = fetchByCategory_Last(categoryId,
				orderByComparator);

		if (vcmsCURelation != null) {
			return vcmsCURelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCURelationException(msg.toString());
	}

	/**
	 * Returns the last vcms c u relation in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation fetchByCategory_Last(String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		int count = countByCategory(categoryId);

		if (count == 0) {
			return null;
		}

		List<VcmsCURelation> list = findByCategory(categoryId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms c u relations before and after the current vcms c u relation in the ordered set where categoryId = &#63;.
	 *
	 * @param vcmsCURelationPK the primary key of the current vcms c u relation
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation[] findByCategory_PrevAndNext(
		VcmsCURelationPK vcmsCURelationPK, String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = findByPrimaryKey(vcmsCURelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsCURelation[] array = new VcmsCURelationImpl[3];

			array[0] = getByCategory_PrevAndNext(session, vcmsCURelation,
					categoryId, orderByComparator, true);

			array[1] = vcmsCURelation;

			array[2] = getByCategory_PrevAndNext(session, vcmsCURelation,
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

	protected VcmsCURelation getByCategory_PrevAndNext(Session session,
		VcmsCURelation vcmsCURelation, String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSCURELATION_WHERE);

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
			query.append(VcmsCURelationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCURelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCURelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms c u relations where categoryId = &#63; from the database.
	 *
	 * @param categoryId the category ID
	 */
	@Override
	public void removeByCategory(String categoryId) {
		for (VcmsCURelation vcmsCURelation : findByCategory(categoryId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCURelation);
		}
	}

	/**
	 * Returns the number of vcms c u relations where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the number of matching vcms c u relations
	 */
	@Override
	public int countByCategory(String categoryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORY;

		Object[] finderArgs = new Object[] { categoryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSCURELATION_WHERE);

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

	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_1 = "vcmsCURelation.id.categoryId IS NULL";
	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_2 = "vcmsCURelation.id.categoryId = ?";
	private static final String _FINDER_COLUMN_CATEGORY_CATEGORYID_3 = "(vcmsCURelation.id.categoryId IS NULL OR vcmsCURelation.id.categoryId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCURelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUser",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsCURelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUser",
			new String[] { String.class.getName() },
			VcmsCURelationModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER = new FinderPath(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUser",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms c u relations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByUser(String userId) {
		return findByUser(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms c u relations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @return the range of matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByUser(String userId, int start, int end) {
		return findByUser(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms c u relations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByUser(String userId, int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return findByUser(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms c u relations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findByUser(String userId, int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USER;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<VcmsCURelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCURelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCURelation vcmsCURelation : list) {
					if (!Objects.equals(userId, vcmsCURelation.getUserId())) {
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

			query.append(_SQL_SELECT_VCMSCURELATION_WHERE);

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_USER_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USER_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_USER_USERID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsCURelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserId) {
					qPos.add(userId);
				}

				if (!pagination) {
					list = (List<VcmsCURelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCURelation>)QueryUtil.list(q,
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
	 * Returns the first vcms c u relation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation findByUser_First(String userId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = fetchByUser_First(userId,
				orderByComparator);

		if (vcmsCURelation != null) {
			return vcmsCURelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCURelationException(msg.toString());
	}

	/**
	 * Returns the first vcms c u relation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation fetchByUser_First(String userId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		List<VcmsCURelation> list = findByUser(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms c u relation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation findByUser_Last(String userId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = fetchByUser_Last(userId,
				orderByComparator);

		if (vcmsCURelation != null) {
			return vcmsCURelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCURelationException(msg.toString());
	}

	/**
	 * Returns the last vcms c u relation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	 */
	@Override
	public VcmsCURelation fetchByUser_Last(String userId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		int count = countByUser(userId);

		if (count == 0) {
			return null;
		}

		List<VcmsCURelation> list = findByUser(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms c u relations before and after the current vcms c u relation in the ordered set where userId = &#63;.
	 *
	 * @param vcmsCURelationPK the primary key of the current vcms c u relation
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation[] findByUser_PrevAndNext(
		VcmsCURelationPK vcmsCURelationPK, String userId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = findByPrimaryKey(vcmsCURelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsCURelation[] array = new VcmsCURelationImpl[3];

			array[0] = getByUser_PrevAndNext(session, vcmsCURelation, userId,
					orderByComparator, true);

			array[1] = vcmsCURelation;

			array[2] = getByUser_PrevAndNext(session, vcmsCURelation, userId,
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

	protected VcmsCURelation getByUser_PrevAndNext(Session session,
		VcmsCURelation vcmsCURelation, String userId,
		OrderByComparator<VcmsCURelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSCURELATION_WHERE);

		boolean bindUserId = false;

		if (userId == null) {
			query.append(_FINDER_COLUMN_USER_USERID_1);
		}
		else if (userId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USER_USERID_3);
		}
		else {
			bindUserId = true;

			query.append(_FINDER_COLUMN_USER_USERID_2);
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
			query.append(VcmsCURelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUserId) {
			qPos.add(userId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCURelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCURelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms c u relations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUser(String userId) {
		for (VcmsCURelation vcmsCURelation : findByUser(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCURelation);
		}
	}

	/**
	 * Returns the number of vcms c u relations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching vcms c u relations
	 */
	@Override
	public int countByUser(String userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSCURELATION_WHERE);

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_USER_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USER_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_USER_USERID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserId) {
					qPos.add(userId);
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

	private static final String _FINDER_COLUMN_USER_USERID_1 = "vcmsCURelation.id.userId IS NULL";
	private static final String _FINDER_COLUMN_USER_USERID_2 = "vcmsCURelation.id.userId = ?";
	private static final String _FINDER_COLUMN_USER_USERID_3 = "(vcmsCURelation.id.userId IS NULL OR vcmsCURelation.id.userId = '')";

	public VcmsCURelationPersistenceImpl() {
		setModelClass(VcmsCURelation.class);
	}

	/**
	 * Caches the vcms c u relation in the entity cache if it is enabled.
	 *
	 * @param vcmsCURelation the vcms c u relation
	 */
	@Override
	public void cacheResult(VcmsCURelation vcmsCURelation) {
		entityCache.putResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationImpl.class, vcmsCURelation.getPrimaryKey(),
			vcmsCURelation);

		vcmsCURelation.resetOriginalValues();
	}

	/**
	 * Caches the vcms c u relations in the entity cache if it is enabled.
	 *
	 * @param vcmsCURelations the vcms c u relations
	 */
	@Override
	public void cacheResult(List<VcmsCURelation> vcmsCURelations) {
		for (VcmsCURelation vcmsCURelation : vcmsCURelations) {
			if (entityCache.getResult(
						VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsCURelationImpl.class, vcmsCURelation.getPrimaryKey()) == null) {
				cacheResult(vcmsCURelation);
			}
			else {
				vcmsCURelation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms c u relations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsCURelationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms c u relation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsCURelation vcmsCURelation) {
		entityCache.removeResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationImpl.class, vcmsCURelation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsCURelation> vcmsCURelations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsCURelation vcmsCURelation : vcmsCURelations) {
			entityCache.removeResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsCURelationImpl.class, vcmsCURelation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms c u relation with the primary key. Does not add the vcms c u relation to the database.
	 *
	 * @param vcmsCURelationPK the primary key for the new vcms c u relation
	 * @return the new vcms c u relation
	 */
	@Override
	public VcmsCURelation create(VcmsCURelationPK vcmsCURelationPK) {
		VcmsCURelation vcmsCURelation = new VcmsCURelationImpl();

		vcmsCURelation.setNew(true);
		vcmsCURelation.setPrimaryKey(vcmsCURelationPK);

		return vcmsCURelation;
	}

	/**
	 * Removes the vcms c u relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsCURelationPK the primary key of the vcms c u relation
	 * @return the vcms c u relation that was removed
	 * @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation remove(VcmsCURelationPK vcmsCURelationPK)
		throws NoSuchVcmsCURelationException {
		return remove((Serializable)vcmsCURelationPK);
	}

	/**
	 * Removes the vcms c u relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms c u relation
	 * @return the vcms c u relation that was removed
	 * @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation remove(Serializable primaryKey)
		throws NoSuchVcmsCURelationException {
		Session session = null;

		try {
			session = openSession();

			VcmsCURelation vcmsCURelation = (VcmsCURelation)session.get(VcmsCURelationImpl.class,
					primaryKey);

			if (vcmsCURelation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsCURelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsCURelation);
		}
		catch (NoSuchVcmsCURelationException nsee) {
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
	protected VcmsCURelation removeImpl(VcmsCURelation vcmsCURelation) {
		vcmsCURelation = toUnwrappedModel(vcmsCURelation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsCURelation)) {
				vcmsCURelation = (VcmsCURelation)session.get(VcmsCURelationImpl.class,
						vcmsCURelation.getPrimaryKeyObj());
			}

			if (vcmsCURelation != null) {
				session.delete(vcmsCURelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsCURelation != null) {
			clearCache(vcmsCURelation);
		}

		return vcmsCURelation;
	}

	@Override
	public VcmsCURelation updateImpl(VcmsCURelation vcmsCURelation) {
		vcmsCURelation = toUnwrappedModel(vcmsCURelation);

		boolean isNew = vcmsCURelation.isNew();

		VcmsCURelationModelImpl vcmsCURelationModelImpl = (VcmsCURelationModelImpl)vcmsCURelation;

		Session session = null;

		try {
			session = openSession();

			if (vcmsCURelation.isNew()) {
				session.save(vcmsCURelation);

				vcmsCURelation.setNew(false);
			}
			else {
				vcmsCURelation = (VcmsCURelation)session.merge(vcmsCURelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsCURelationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsCURelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCURelationModelImpl.getOriginalCategoryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY,
					args);

				args = new Object[] { vcmsCURelationModelImpl.getCategoryId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY,
					args);
			}

			if ((vcmsCURelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCURelationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER,
					args);

				args = new Object[] { vcmsCURelationModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER,
					args);
			}
		}

		entityCache.putResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCURelationImpl.class, vcmsCURelation.getPrimaryKey(),
			vcmsCURelation, false);

		vcmsCURelation.resetOriginalValues();

		return vcmsCURelation;
	}

	protected VcmsCURelation toUnwrappedModel(VcmsCURelation vcmsCURelation) {
		if (vcmsCURelation instanceof VcmsCURelationImpl) {
			return vcmsCURelation;
		}

		VcmsCURelationImpl vcmsCURelationImpl = new VcmsCURelationImpl();

		vcmsCURelationImpl.setNew(vcmsCURelation.isNew());
		vcmsCURelationImpl.setPrimaryKey(vcmsCURelation.getPrimaryKey());

		vcmsCURelationImpl.setCategoryId(vcmsCURelation.getCategoryId());
		vcmsCURelationImpl.setUserId(vcmsCURelation.getUserId());

		return vcmsCURelationImpl;
	}

	/**
	 * Returns the vcms c u relation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms c u relation
	 * @return the vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsCURelationException {
		VcmsCURelation vcmsCURelation = fetchByPrimaryKey(primaryKey);

		if (vcmsCURelation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsCURelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsCURelation;
	}

	/**
	 * Returns the vcms c u relation with the primary key or throws a {@link NoSuchVcmsCURelationException} if it could not be found.
	 *
	 * @param vcmsCURelationPK the primary key of the vcms c u relation
	 * @return the vcms c u relation
	 * @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation findByPrimaryKey(VcmsCURelationPK vcmsCURelationPK)
		throws NoSuchVcmsCURelationException {
		return findByPrimaryKey((Serializable)vcmsCURelationPK);
	}

	/**
	 * Returns the vcms c u relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms c u relation
	 * @return the vcms c u relation, or <code>null</code> if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsCURelationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsCURelation vcmsCURelation = (VcmsCURelation)serializable;

		if (vcmsCURelation == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsCURelation = (VcmsCURelation)session.get(VcmsCURelationImpl.class,
						primaryKey);

				if (vcmsCURelation != null) {
					cacheResult(vcmsCURelation);
				}
				else {
					entityCache.putResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsCURelationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsCURelationModelImpl.ENTITY_CACHE_ENABLED,
					VcmsCURelationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsCURelation;
	}

	/**
	 * Returns the vcms c u relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsCURelationPK the primary key of the vcms c u relation
	 * @return the vcms c u relation, or <code>null</code> if a vcms c u relation with the primary key could not be found
	 */
	@Override
	public VcmsCURelation fetchByPrimaryKey(VcmsCURelationPK vcmsCURelationPK) {
		return fetchByPrimaryKey((Serializable)vcmsCURelationPK);
	}

	@Override
	public Map<Serializable, VcmsCURelation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsCURelation> map = new HashMap<Serializable, VcmsCURelation>();

		for (Serializable primaryKey : primaryKeys) {
			VcmsCURelation vcmsCURelation = fetchByPrimaryKey(primaryKey);

			if (vcmsCURelation != null) {
				map.put(primaryKey, vcmsCURelation);
			}
		}

		return map;
	}

	/**
	 * Returns all the vcms c u relations.
	 *
	 * @return the vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms c u relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @return the range of vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms c u relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findAll(int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms c u relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms c u relations
	 * @param end the upper bound of the range of vcms c u relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms c u relations
	 */
	@Override
	public List<VcmsCURelation> findAll(int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator,
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

		List<VcmsCURelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCURelation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSCURELATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSCURELATION;

				if (pagination) {
					sql = sql.concat(VcmsCURelationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsCURelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCURelation>)QueryUtil.list(q,
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
	 * Removes all the vcms c u relations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsCURelation vcmsCURelation : findAll()) {
			remove(vcmsCURelation);
		}
	}

	/**
	 * Returns the number of vcms c u relations.
	 *
	 * @return the number of vcms c u relations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSCURELATION);

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
		return VcmsCURelationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms c u relation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsCURelationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSCURELATION = "SELECT vcmsCURelation FROM VcmsCURelation vcmsCURelation";
	private static final String _SQL_SELECT_VCMSCURELATION_WHERE = "SELECT vcmsCURelation FROM VcmsCURelation vcmsCURelation WHERE ";
	private static final String _SQL_COUNT_VCMSCURELATION = "SELECT COUNT(vcmsCURelation) FROM VcmsCURelation vcmsCURelation";
	private static final String _SQL_COUNT_VCMSCURELATION_WHERE = "SELECT COUNT(vcmsCURelation) FROM VcmsCURelation vcmsCURelation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsCURelation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsCURelation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsCURelation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsCURelationPersistenceImpl.class);
}