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

import vn.gov.hoabinh.exception.NoSuchVcmsPARelationException;
import vn.gov.hoabinh.model.VcmsPARelation;
import vn.gov.hoabinh.model.impl.VcmsPARelationImpl;
import vn.gov.hoabinh.model.impl.VcmsPARelationModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsPARelationPK;
import vn.gov.hoabinh.service.persistence.VcmsPARelationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms p a relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelationPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsPARelationUtil
 * @generated
 */
@ProviderType
public class VcmsPARelationPersistenceImpl extends BasePersistenceImpl<VcmsPARelation>
	implements VcmsPARelationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsPARelationUtil} to access the vcms p a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsPARelationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsPARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsPARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTION = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsPARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION =
		new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsPARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortion",
			new String[] { String.class.getName() },
			VcmsPARelationModelImpl.PORTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTION = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms p a relations where portionId = &#63;.
	 *
	 * @param portionId the portion ID
	 * @return the matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByPortion(String portionId) {
		return findByPortion(portionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms p a relations where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @return the range of matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByPortion(String portionId, int start,
		int end) {
		return findByPortion(portionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms p a relations where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByPortion(String portionId, int start,
		int end, OrderByComparator<VcmsPARelation> orderByComparator) {
		return findByPortion(portionId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms p a relations where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByPortion(String portionId, int start,
		int end, OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION;
			finderArgs = new Object[] { portionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTION;
			finderArgs = new Object[] { portionId, start, end, orderByComparator };
		}

		List<VcmsPARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsPARelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsPARelation vcmsPARelation : list) {
					if (!Objects.equals(portionId, vcmsPARelation.getPortionId())) {
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

			query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

			boolean bindPortionId = false;

			if (portionId == null) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_1);
			}
			else if (portionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_3);
			}
			else {
				bindPortionId = true;

				query.append(_FINDER_COLUMN_PORTION_PORTIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortionId) {
					qPos.add(portionId);
				}

				if (!pagination) {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
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
	 * Returns the first vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation findByPortion_First(String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = fetchByPortion_First(portionId,
				orderByComparator);

		if (vcmsPARelation != null) {
			return vcmsPARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portionId=");
		msg.append(portionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPARelationException(msg.toString());
	}

	/**
	 * Returns the first vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation fetchByPortion_First(String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		List<VcmsPARelation> list = findByPortion(portionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation findByPortion_Last(String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = fetchByPortion_Last(portionId,
				orderByComparator);

		if (vcmsPARelation != null) {
			return vcmsPARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portionId=");
		msg.append(portionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPARelationException(msg.toString());
	}

	/**
	 * Returns the last vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation fetchByPortion_Last(String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		int count = countByPortion(portionId);

		if (count == 0) {
			return null;
		}

		List<VcmsPARelation> list = findByPortion(portionId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms p a relations before and after the current vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * @param vcmsPARelationPK the primary key of the current vcms p a relation
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation[] findByPortion_PrevAndNext(
		VcmsPARelationPK vcmsPARelationPK, String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = findByPrimaryKey(vcmsPARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsPARelation[] array = new VcmsPARelationImpl[3];

			array[0] = getByPortion_PrevAndNext(session, vcmsPARelation,
					portionId, orderByComparator, true);

			array[1] = vcmsPARelation;

			array[2] = getByPortion_PrevAndNext(session, vcmsPARelation,
					portionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsPARelation getByPortion_PrevAndNext(Session session,
		VcmsPARelation vcmsPARelation, String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

		boolean bindPortionId = false;

		if (portionId == null) {
			query.append(_FINDER_COLUMN_PORTION_PORTIONID_1);
		}
		else if (portionId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTION_PORTIONID_3);
		}
		else {
			bindPortionId = true;

			query.append(_FINDER_COLUMN_PORTION_PORTIONID_2);
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
			query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPortionId) {
			qPos.add(portionId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsPARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsPARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms p a relations where portionId = &#63; from the database.
	 *
	 * @param portionId the portion ID
	 */
	@Override
	public void removeByPortion(String portionId) {
		for (VcmsPARelation vcmsPARelation : findByPortion(portionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsPARelation);
		}
	}

	/**
	 * Returns the number of vcms p a relations where portionId = &#63;.
	 *
	 * @param portionId the portion ID
	 * @return the number of matching vcms p a relations
	 */
	@Override
	public int countByPortion(String portionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTION;

		Object[] finderArgs = new Object[] { portionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSPARELATION_WHERE);

			boolean bindPortionId = false;

			if (portionId == null) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_1);
			}
			else if (portionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_3);
			}
			else {
				bindPortionId = true;

				query.append(_FINDER_COLUMN_PORTION_PORTIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPortionId) {
					qPos.add(portionId);
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

	private static final String _FINDER_COLUMN_PORTION_PORTIONID_1 = "vcmsPARelation.id.portionId IS NULL";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_2 = "vcmsPARelation.id.portionId = ?";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_3 = "(vcmsPARelation.id.portionId IS NULL OR vcmsPARelation.id.portionId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsPARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsPARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsPARelationModelImpl.ARTICLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms p a relations where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms p a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @return the range of matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms p a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsPARelation> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms p a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsPARelation> orderByComparator,
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

		List<VcmsPARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsPARelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsPARelation vcmsPARelation : list) {
					if (!Objects.equals(articleId, vcmsPARelation.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

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
				query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsPARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
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
	 * Returns the first vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation findByArticle_First(String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsPARelation != null) {
			return vcmsPARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPARelationException(msg.toString());
	}

	/**
	 * Returns the first vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation fetchByArticle_First(String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		List<VcmsPARelation> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation findByArticle_Last(String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsPARelation != null) {
			return vcmsPARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPARelationException(msg.toString());
	}

	/**
	 * Returns the last vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	 */
	@Override
	public VcmsPARelation fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsPARelation> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms p a relations before and after the current vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * @param vcmsPARelationPK the primary key of the current vcms p a relation
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation[] findByArticle_PrevAndNext(
		VcmsPARelationPK vcmsPARelationPK, String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = findByPrimaryKey(vcmsPARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsPARelation[] array = new VcmsPARelationImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsPARelation,
					articleId, orderByComparator, true);

			array[1] = vcmsPARelation;

			array[2] = getByArticle_PrevAndNext(session, vcmsPARelation,
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

	protected VcmsPARelation getByArticle_PrevAndNext(Session session,
		VcmsPARelation vcmsPARelation, String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

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
			query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsPARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsPARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms p a relations where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsPARelation vcmsPARelation : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsPARelation);
		}
	}

	/**
	 * Returns the number of vcms p a relations where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms p a relations
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSPARELATION_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsPARelation.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsPARelation.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsPARelation.id.articleId IS NULL OR vcmsPARelation.id.articleId = '')";

	public VcmsPARelationPersistenceImpl() {
		setModelClass(VcmsPARelation.class);
	}

	/**
	 * Caches the vcms p a relation in the entity cache if it is enabled.
	 *
	 * @param vcmsPARelation the vcms p a relation
	 */
	@Override
	public void cacheResult(VcmsPARelation vcmsPARelation) {
		entityCache.putResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey(),
			vcmsPARelation);

		vcmsPARelation.resetOriginalValues();
	}

	/**
	 * Caches the vcms p a relations in the entity cache if it is enabled.
	 *
	 * @param vcmsPARelations the vcms p a relations
	 */
	@Override
	public void cacheResult(List<VcmsPARelation> vcmsPARelations) {
		for (VcmsPARelation vcmsPARelation : vcmsPARelations) {
			if (entityCache.getResult(
						VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey()) == null) {
				cacheResult(vcmsPARelation);
			}
			else {
				vcmsPARelation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms p a relations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsPARelationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms p a relation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsPARelation vcmsPARelation) {
		entityCache.removeResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsPARelation> vcmsPARelations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsPARelation vcmsPARelation : vcmsPARelations) {
			entityCache.removeResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms p a relation with the primary key. Does not add the vcms p a relation to the database.
	 *
	 * @param vcmsPARelationPK the primary key for the new vcms p a relation
	 * @return the new vcms p a relation
	 */
	@Override
	public VcmsPARelation create(VcmsPARelationPK vcmsPARelationPK) {
		VcmsPARelation vcmsPARelation = new VcmsPARelationImpl();

		vcmsPARelation.setNew(true);
		vcmsPARelation.setPrimaryKey(vcmsPARelationPK);

		return vcmsPARelation;
	}

	/**
	 * Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsPARelationPK the primary key of the vcms p a relation
	 * @return the vcms p a relation that was removed
	 * @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation remove(VcmsPARelationPK vcmsPARelationPK)
		throws NoSuchVcmsPARelationException {
		return remove((Serializable)vcmsPARelationPK);
	}

	/**
	 * Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms p a relation
	 * @return the vcms p a relation that was removed
	 * @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation remove(Serializable primaryKey)
		throws NoSuchVcmsPARelationException {
		Session session = null;

		try {
			session = openSession();

			VcmsPARelation vcmsPARelation = (VcmsPARelation)session.get(VcmsPARelationImpl.class,
					primaryKey);

			if (vcmsPARelation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsPARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsPARelation);
		}
		catch (NoSuchVcmsPARelationException nsee) {
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
	protected VcmsPARelation removeImpl(VcmsPARelation vcmsPARelation) {
		vcmsPARelation = toUnwrappedModel(vcmsPARelation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsPARelation)) {
				vcmsPARelation = (VcmsPARelation)session.get(VcmsPARelationImpl.class,
						vcmsPARelation.getPrimaryKeyObj());
			}

			if (vcmsPARelation != null) {
				session.delete(vcmsPARelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsPARelation != null) {
			clearCache(vcmsPARelation);
		}

		return vcmsPARelation;
	}

	@Override
	public VcmsPARelation updateImpl(VcmsPARelation vcmsPARelation) {
		vcmsPARelation = toUnwrappedModel(vcmsPARelation);

		boolean isNew = vcmsPARelation.isNew();

		VcmsPARelationModelImpl vcmsPARelationModelImpl = (VcmsPARelationModelImpl)vcmsPARelation;

		Session session = null;

		try {
			session = openSession();

			if (vcmsPARelation.isNew()) {
				session.save(vcmsPARelation);

				vcmsPARelation.setNew(false);
			}
			else {
				vcmsPARelation = (VcmsPARelation)session.merge(vcmsPARelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsPARelationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsPARelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsPARelationModelImpl.getOriginalPortionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PORTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION,
					args);

				args = new Object[] { vcmsPARelationModelImpl.getPortionId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PORTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION,
					args);
			}

			if ((vcmsPARelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsPARelationModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsPARelationModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}
		}

		entityCache.putResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey(),
			vcmsPARelation, false);

		vcmsPARelation.resetOriginalValues();

		return vcmsPARelation;
	}

	protected VcmsPARelation toUnwrappedModel(VcmsPARelation vcmsPARelation) {
		if (vcmsPARelation instanceof VcmsPARelationImpl) {
			return vcmsPARelation;
		}

		VcmsPARelationImpl vcmsPARelationImpl = new VcmsPARelationImpl();

		vcmsPARelationImpl.setNew(vcmsPARelation.isNew());
		vcmsPARelationImpl.setPrimaryKey(vcmsPARelation.getPrimaryKey());

		vcmsPARelationImpl.setPortionId(vcmsPARelation.getPortionId());
		vcmsPARelationImpl.setArticleId(vcmsPARelation.getArticleId());

		return vcmsPARelationImpl;
	}

	/**
	 * Returns the vcms p a relation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms p a relation
	 * @return the vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsPARelationException {
		VcmsPARelation vcmsPARelation = fetchByPrimaryKey(primaryKey);

		if (vcmsPARelation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsPARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsPARelation;
	}

	/**
	 * Returns the vcms p a relation with the primary key or throws a {@link NoSuchVcmsPARelationException} if it could not be found.
	 *
	 * @param vcmsPARelationPK the primary key of the vcms p a relation
	 * @return the vcms p a relation
	 * @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation findByPrimaryKey(VcmsPARelationPK vcmsPARelationPK)
		throws NoSuchVcmsPARelationException {
		return findByPrimaryKey((Serializable)vcmsPARelationPK);
	}

	/**
	 * Returns the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms p a relation
	 * @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsPARelationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsPARelation vcmsPARelation = (VcmsPARelation)serializable;

		if (vcmsPARelation == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsPARelation = (VcmsPARelation)session.get(VcmsPARelationImpl.class,
						primaryKey);

				if (vcmsPARelation != null) {
					cacheResult(vcmsPARelation);
				}
				else {
					entityCache.putResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsPARelationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
					VcmsPARelationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsPARelation;
	}

	/**
	 * Returns the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsPARelationPK the primary key of the vcms p a relation
	 * @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	 */
	@Override
	public VcmsPARelation fetchByPrimaryKey(VcmsPARelationPK vcmsPARelationPK) {
		return fetchByPrimaryKey((Serializable)vcmsPARelationPK);
	}

	@Override
	public Map<Serializable, VcmsPARelation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsPARelation> map = new HashMap<Serializable, VcmsPARelation>();

		for (Serializable primaryKey : primaryKeys) {
			VcmsPARelation vcmsPARelation = fetchByPrimaryKey(primaryKey);

			if (vcmsPARelation != null) {
				map.put(primaryKey, vcmsPARelation);
			}
		}

		return map;
	}

	/**
	 * Returns all the vcms p a relations.
	 *
	 * @return the vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms p a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @return the range of vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms p a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findAll(int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms p a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms p a relations
	 * @param end the upper bound of the range of vcms p a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms p a relations
	 */
	@Override
	public List<VcmsPARelation> findAll(int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator,
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

		List<VcmsPARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsPARelation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSPARELATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSPARELATION;

				if (pagination) {
					sql = sql.concat(VcmsPARelationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
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
	 * Removes all the vcms p a relations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsPARelation vcmsPARelation : findAll()) {
			remove(vcmsPARelation);
		}
	}

	/**
	 * Returns the number of vcms p a relations.
	 *
	 * @return the number of vcms p a relations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSPARELATION);

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
		return VcmsPARelationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms p a relation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsPARelationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSPARELATION = "SELECT vcmsPARelation FROM VcmsPARelation vcmsPARelation";
	private static final String _SQL_SELECT_VCMSPARELATION_WHERE = "SELECT vcmsPARelation FROM VcmsPARelation vcmsPARelation WHERE ";
	private static final String _SQL_COUNT_VCMSPARELATION = "SELECT COUNT(vcmsPARelation) FROM VcmsPARelation vcmsPARelation";
	private static final String _SQL_COUNT_VCMSPARELATION_WHERE = "SELECT COUNT(vcmsPARelation) FROM VcmsPARelation vcmsPARelation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsPARelation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsPARelation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsPARelation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsPARelationPersistenceImpl.class);
}