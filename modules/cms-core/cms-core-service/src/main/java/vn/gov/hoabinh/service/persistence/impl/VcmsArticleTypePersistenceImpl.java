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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException;
import vn.gov.hoabinh.model.VcmsArticleType;
import vn.gov.hoabinh.model.impl.VcmsArticleTypeImpl;
import vn.gov.hoabinh.model.impl.VcmsArticleTypeModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsArticleTypePK;
import vn.gov.hoabinh.service.persistence.VcmsArticleTypePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms article type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleTypePersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsArticleTypeUtil
 * @generated
 */
@ProviderType
public class VcmsArticleTypePersistenceImpl extends BasePersistenceImpl<VcmsArticleType>
	implements VcmsArticleTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsArticleTypeUtil} to access the vcms article type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByType",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByType",
			new String[] { Long.class.getName() },
			VcmsArticleTypeModelImpl.TYPEID_COLUMN_BITMASK |
			VcmsArticleTypeModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vcms article types where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByType(long typeId) {
		return findByType(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article types where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @return the range of matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByType(long typeId, int start, int end) {
		return findByType(typeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article types where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByType(long typeId, int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return findByType(typeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article types where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByType(long typeId, int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { typeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { typeId, start, end, orderByComparator };
		}

		List<VcmsArticleType> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleType vcmsArticleType : list) {
					if ((typeId != vcmsArticleType.getTypeId())) {
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

			query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_TYPE_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				if (!pagination) {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
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
	 * Returns the first vcms article type in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType findByType_First(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = fetchByType_First(typeId,
				orderByComparator);

		if (vcmsArticleType != null) {
			return vcmsArticleType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleTypeException(msg.toString());
	}

	/**
	 * Returns the first vcms article type in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType fetchByType_First(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		List<VcmsArticleType> list = findByType(typeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article type in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType findByType_Last(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = fetchByType_Last(typeId,
				orderByComparator);

		if (vcmsArticleType != null) {
			return vcmsArticleType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleTypeException(msg.toString());
	}

	/**
	 * Returns the last vcms article type in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType fetchByType_Last(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		int count = countByType(typeId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleType> list = findByType(typeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article types before and after the current vcms article type in the ordered set where typeId = &#63;.
	 *
	 * @param vcmsArticleTypePK the primary key of the current vcms article type
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType[] findByType_PrevAndNext(
		VcmsArticleTypePK vcmsArticleTypePK, long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = findByPrimaryKey(vcmsArticleTypePK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleType[] array = new VcmsArticleTypeImpl[3];

			array[0] = getByType_PrevAndNext(session, vcmsArticleType, typeId,
					orderByComparator, true);

			array[1] = vcmsArticleType;

			array[2] = getByType_PrevAndNext(session, vcmsArticleType, typeId,
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

	protected VcmsArticleType getByType_PrevAndNext(Session session,
		VcmsArticleType vcmsArticleType, long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

		query.append(_FINDER_COLUMN_TYPE_TYPEID_2);

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
			query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article types where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	@Override
	public void removeByType(long typeId) {
		for (VcmsArticleType vcmsArticleType : findByType(typeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleType);
		}
	}

	/**
	 * Returns the number of vcms article types where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching vcms article types
	 */
	@Override
	public int countByType(long typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_TYPE_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

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

	private static final String _FINDER_COLUMN_TYPE_TYPEID_2 = "vcmsArticleType.id.typeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsArticleTypeModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsArticleTypeModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms article types where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms article types where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @return the range of matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article types where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsArticleType> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article types where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article types
	 */
	@Override
	public List<VcmsArticleType> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsArticleType> orderByComparator,
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

		List<VcmsArticleType> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleType vcmsArticleType : list) {
					if (!Objects.equals(articleId,
								vcmsArticleType.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

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
				query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsArticleType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
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
	 * Returns the first vcms article type in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType findByArticle_First(String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsArticleType != null) {
			return vcmsArticleType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleTypeException(msg.toString());
	}

	/**
	 * Returns the first vcms article type in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType fetchByArticle_First(String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		List<VcmsArticleType> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article type in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType findByArticle_Last(String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsArticleType != null) {
			return vcmsArticleType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleTypeException(msg.toString());
	}

	/**
	 * Returns the last vcms article type in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleType> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article types before and after the current vcms article type in the ordered set where articleId = &#63;.
	 *
	 * @param vcmsArticleTypePK the primary key of the current vcms article type
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType[] findByArticle_PrevAndNext(
		VcmsArticleTypePK vcmsArticleTypePK, String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = findByPrimaryKey(vcmsArticleTypePK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleType[] array = new VcmsArticleTypeImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsArticleType,
					articleId, orderByComparator, true);

			array[1] = vcmsArticleType;

			array[2] = getByArticle_PrevAndNext(session, vcmsArticleType,
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

	protected VcmsArticleType getByArticle_PrevAndNext(Session session,
		VcmsArticleType vcmsArticleType, String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

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
			query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article types where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsArticleType vcmsArticleType : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleType);
		}
	}

	/**
	 * Returns the number of vcms article types where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms article types
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLETYPE_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsArticleType.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsArticleType.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsArticleType.id.articleId IS NULL OR vcmsArticleType.id.articleId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_T_A = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByT_A",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsArticleTypeModelImpl.TYPEID_COLUMN_BITMASK |
			VcmsArticleTypeModelImpl.ARTICLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_T_A = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByT_A",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vcms article type where typeId = &#63; and articleId = &#63; or throws a {@link NoSuchVcmsArticleTypeException} if it could not be found.
	 *
	 * @param typeId the type ID
	 * @param articleId the article ID
	 * @return the matching vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType findByT_A(long typeId, String articleId)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = fetchByT_A(typeId, articleId);

		if (vcmsArticleType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(", articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsArticleTypeException(msg.toString());
		}

		return vcmsArticleType;
	}

	/**
	 * Returns the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeId the type ID
	 * @param articleId the article ID
	 * @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType fetchByT_A(long typeId, String articleId) {
		return fetchByT_A(typeId, articleId, true);
	}

	/**
	 * Returns the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeId the type ID
	 * @param articleId the article ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 */
	@Override
	public VcmsArticleType fetchByT_A(long typeId, String articleId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { typeId, articleId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_T_A,
					finderArgs, this);
		}

		if (result instanceof VcmsArticleType) {
			VcmsArticleType vcmsArticleType = (VcmsArticleType)result;

			if ((typeId != vcmsArticleType.getTypeId()) ||
					!Objects.equals(articleId, vcmsArticleType.getArticleId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_T_A_TYPEID_2);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_T_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_T_A_ARTICLEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				List<VcmsArticleType> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_T_A, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsArticleTypePersistenceImpl.fetchByT_A(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsArticleType vcmsArticleType = list.get(0);

					result = vcmsArticleType;

					cacheResult(vcmsArticleType);

					if ((vcmsArticleType.getTypeId() != typeId) ||
							(vcmsArticleType.getArticleId() == null) ||
							!vcmsArticleType.getArticleId().equals(articleId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_T_A,
							finderArgs, vcmsArticleType);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_T_A, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (VcmsArticleType)result;
		}
	}

	/**
	 * Removes the vcms article type where typeId = &#63; and articleId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 * @param articleId the article ID
	 * @return the vcms article type that was removed
	 */
	@Override
	public VcmsArticleType removeByT_A(long typeId, String articleId)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = findByT_A(typeId, articleId);

		return remove(vcmsArticleType);
	}

	/**
	 * Returns the number of vcms article types where typeId = &#63; and articleId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param articleId the article ID
	 * @return the number of matching vcms article types
	 */
	@Override
	public int countByT_A(long typeId, String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_T_A;

		Object[] finderArgs = new Object[] { typeId, articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_T_A_TYPEID_2);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_T_A_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_T_A_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_T_A_ARTICLEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

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

	private static final String _FINDER_COLUMN_T_A_TYPEID_2 = "vcmsArticleType.id.typeId = ? AND ";
	private static final String _FINDER_COLUMN_T_A_ARTICLEID_1 = "vcmsArticleType.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_T_A_ARTICLEID_2 = "vcmsArticleType.id.articleId = ?";
	private static final String _FINDER_COLUMN_T_A_ARTICLEID_3 = "(vcmsArticleType.id.articleId IS NULL OR vcmsArticleType.id.articleId = '')";

	public VcmsArticleTypePersistenceImpl() {
		setModelClass(VcmsArticleType.class);
	}

	/**
	 * Caches the vcms article type in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleType the vcms article type
	 */
	@Override
	public void cacheResult(VcmsArticleType vcmsArticleType) {
		entityCache.putResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey(),
			vcmsArticleType);

		finderCache.putResult(FINDER_PATH_FETCH_BY_T_A,
			new Object[] {
				vcmsArticleType.getTypeId(), vcmsArticleType.getArticleId()
			}, vcmsArticleType);

		vcmsArticleType.resetOriginalValues();
	}

	/**
	 * Caches the vcms article types in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleTypes the vcms article types
	 */
	@Override
	public void cacheResult(List<VcmsArticleType> vcmsArticleTypes) {
		for (VcmsArticleType vcmsArticleType : vcmsArticleTypes) {
			if (entityCache.getResult(
						VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleTypeImpl.class,
						vcmsArticleType.getPrimaryKey()) == null) {
				cacheResult(vcmsArticleType);
			}
			else {
				vcmsArticleType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms article types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsArticleTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms article type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsArticleType vcmsArticleType) {
		entityCache.removeResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VcmsArticleTypeModelImpl)vcmsArticleType);
	}

	@Override
	public void clearCache(List<VcmsArticleType> vcmsArticleTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsArticleType vcmsArticleType : vcmsArticleTypes) {
			entityCache.removeResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey());

			clearUniqueFindersCache((VcmsArticleTypeModelImpl)vcmsArticleType);
		}
	}

	protected void cacheUniqueFindersCache(
		VcmsArticleTypeModelImpl vcmsArticleTypeModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vcmsArticleTypeModelImpl.getTypeId(),
					vcmsArticleTypeModelImpl.getArticleId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_T_A, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_T_A, args,
				vcmsArticleTypeModelImpl);
		}
		else {
			if ((vcmsArticleTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_T_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleTypeModelImpl.getTypeId(),
						vcmsArticleTypeModelImpl.getArticleId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_T_A, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_T_A, args,
					vcmsArticleTypeModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VcmsArticleTypeModelImpl vcmsArticleTypeModelImpl) {
		Object[] args = new Object[] {
				vcmsArticleTypeModelImpl.getTypeId(),
				vcmsArticleTypeModelImpl.getArticleId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_T_A, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_T_A, args);

		if ((vcmsArticleTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_T_A.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsArticleTypeModelImpl.getOriginalTypeId(),
					vcmsArticleTypeModelImpl.getOriginalArticleId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_T_A, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_T_A, args);
		}
	}

	/**
	 * Creates a new vcms article type with the primary key. Does not add the vcms article type to the database.
	 *
	 * @param vcmsArticleTypePK the primary key for the new vcms article type
	 * @return the new vcms article type
	 */
	@Override
	public VcmsArticleType create(VcmsArticleTypePK vcmsArticleTypePK) {
		VcmsArticleType vcmsArticleType = new VcmsArticleTypeImpl();

		vcmsArticleType.setNew(true);
		vcmsArticleType.setPrimaryKey(vcmsArticleTypePK);

		return vcmsArticleType;
	}

	/**
	 * Removes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsArticleTypePK the primary key of the vcms article type
	 * @return the vcms article type that was removed
	 * @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType remove(VcmsArticleTypePK vcmsArticleTypePK)
		throws NoSuchVcmsArticleTypeException {
		return remove((Serializable)vcmsArticleTypePK);
	}

	/**
	 * Removes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article type
	 * @return the vcms article type that was removed
	 * @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType remove(Serializable primaryKey)
		throws NoSuchVcmsArticleTypeException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticleType vcmsArticleType = (VcmsArticleType)session.get(VcmsArticleTypeImpl.class,
					primaryKey);

			if (vcmsArticleType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsArticleTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsArticleType);
		}
		catch (NoSuchVcmsArticleTypeException nsee) {
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
	protected VcmsArticleType removeImpl(VcmsArticleType vcmsArticleType) {
		vcmsArticleType = toUnwrappedModel(vcmsArticleType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsArticleType)) {
				vcmsArticleType = (VcmsArticleType)session.get(VcmsArticleTypeImpl.class,
						vcmsArticleType.getPrimaryKeyObj());
			}

			if (vcmsArticleType != null) {
				session.delete(vcmsArticleType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsArticleType != null) {
			clearCache(vcmsArticleType);
		}

		return vcmsArticleType;
	}

	@Override
	public VcmsArticleType updateImpl(VcmsArticleType vcmsArticleType) {
		vcmsArticleType = toUnwrappedModel(vcmsArticleType);

		boolean isNew = vcmsArticleType.isNew();

		VcmsArticleTypeModelImpl vcmsArticleTypeModelImpl = (VcmsArticleTypeModelImpl)vcmsArticleType;

		Session session = null;

		try {
			session = openSession();

			if (vcmsArticleType.isNew()) {
				session.save(vcmsArticleType);

				vcmsArticleType.setNew(false);
			}
			else {
				vcmsArticleType = (VcmsArticleType)session.merge(vcmsArticleType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsArticleTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsArticleTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleTypeModelImpl.getOriginalTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);

				args = new Object[] { vcmsArticleTypeModelImpl.getTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);
			}

			if ((vcmsArticleTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleTypeModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsArticleTypeModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}
		}

		entityCache.putResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey(),
			vcmsArticleType, false);

		clearUniqueFindersCache(vcmsArticleTypeModelImpl);
		cacheUniqueFindersCache(vcmsArticleTypeModelImpl, isNew);

		vcmsArticleType.resetOriginalValues();

		return vcmsArticleType;
	}

	protected VcmsArticleType toUnwrappedModel(VcmsArticleType vcmsArticleType) {
		if (vcmsArticleType instanceof VcmsArticleTypeImpl) {
			return vcmsArticleType;
		}

		VcmsArticleTypeImpl vcmsArticleTypeImpl = new VcmsArticleTypeImpl();

		vcmsArticleTypeImpl.setNew(vcmsArticleType.isNew());
		vcmsArticleTypeImpl.setPrimaryKey(vcmsArticleType.getPrimaryKey());

		vcmsArticleTypeImpl.setTypeId(vcmsArticleType.getTypeId());
		vcmsArticleTypeImpl.setArticleId(vcmsArticleType.getArticleId());
		vcmsArticleTypeImpl.setPosition(vcmsArticleType.getPosition());

		return vcmsArticleTypeImpl;
	}

	/**
	 * Returns the vcms article type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article type
	 * @return the vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsArticleTypeException {
		VcmsArticleType vcmsArticleType = fetchByPrimaryKey(primaryKey);

		if (vcmsArticleType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsArticleTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsArticleType;
	}

	/**
	 * Returns the vcms article type with the primary key or throws a {@link NoSuchVcmsArticleTypeException} if it could not be found.
	 *
	 * @param vcmsArticleTypePK the primary key of the vcms article type
	 * @return the vcms article type
	 * @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType findByPrimaryKey(VcmsArticleTypePK vcmsArticleTypePK)
		throws NoSuchVcmsArticleTypeException {
		return findByPrimaryKey((Serializable)vcmsArticleTypePK);
	}

	/**
	 * Returns the vcms article type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article type
	 * @return the vcms article type, or <code>null</code> if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsArticleType vcmsArticleType = (VcmsArticleType)serializable;

		if (vcmsArticleType == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticleType = (VcmsArticleType)session.get(VcmsArticleTypeImpl.class,
						primaryKey);

				if (vcmsArticleType != null) {
					cacheResult(vcmsArticleType);
				}
				else {
					entityCache.putResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsArticleType;
	}

	/**
	 * Returns the vcms article type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsArticleTypePK the primary key of the vcms article type
	 * @return the vcms article type, or <code>null</code> if a vcms article type with the primary key could not be found
	 */
	@Override
	public VcmsArticleType fetchByPrimaryKey(
		VcmsArticleTypePK vcmsArticleTypePK) {
		return fetchByPrimaryKey((Serializable)vcmsArticleTypePK);
	}

	@Override
	public Map<Serializable, VcmsArticleType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsArticleType> map = new HashMap<Serializable, VcmsArticleType>();

		for (Serializable primaryKey : primaryKeys) {
			VcmsArticleType vcmsArticleType = fetchByPrimaryKey(primaryKey);

			if (vcmsArticleType != null) {
				map.put(primaryKey, vcmsArticleType);
			}
		}

		return map;
	}

	/**
	 * Returns all the vcms article types.
	 *
	 * @return the vcms article types
	 */
	@Override
	public List<VcmsArticleType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @return the range of vcms article types
	 */
	@Override
	public List<VcmsArticleType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms article types
	 */
	@Override
	public List<VcmsArticleType> findAll(int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article types
	 * @param end the upper bound of the range of vcms article types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms article types
	 */
	@Override
	public List<VcmsArticleType> findAll(int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator,
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

		List<VcmsArticleType> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleType>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSARTICLETYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLETYPE;

				if (pagination) {
					sql = sql.concat(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
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
	 * Removes all the vcms article types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsArticleType vcmsArticleType : findAll()) {
			remove(vcmsArticleType);
		}
	}

	/**
	 * Returns the number of vcms article types.
	 *
	 * @return the number of vcms article types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLETYPE);

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
		return VcmsArticleTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms article type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsArticleTypeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSARTICLETYPE = "SELECT vcmsArticleType FROM VcmsArticleType vcmsArticleType";
	private static final String _SQL_SELECT_VCMSARTICLETYPE_WHERE = "SELECT vcmsArticleType FROM VcmsArticleType vcmsArticleType WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLETYPE = "SELECT COUNT(vcmsArticleType) FROM VcmsArticleType vcmsArticleType";
	private static final String _SQL_COUNT_VCMSARTICLETYPE_WHERE = "SELECT COUNT(vcmsArticleType) FROM VcmsArticleType vcmsArticleType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticleType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticleType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticleType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsArticleTypePersistenceImpl.class);
}