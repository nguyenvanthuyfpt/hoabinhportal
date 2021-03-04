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

import vn.gov.hoabinh.exception.NoSuchVLegalDURelException;
import vn.gov.hoabinh.model.VLegalDURel;
import vn.gov.hoabinh.model.impl.VLegalDURelImpl;
import vn.gov.hoabinh.model.impl.VLegalDURelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalDURelPK;
import vn.gov.hoabinh.service.persistence.VLegalDURelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the v legal d u rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalDURelUtil
 * @generated
 */
@ProviderType
public class VLegalDURelPersistenceImpl extends BasePersistenceImpl<VLegalDURel>
	implements VLegalDURelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalDURelUtil} to access the v legal d u rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDURelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTAMENT =
		new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepartament",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT =
		new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepartament",
			new String[] { Long.class.getName() },
			VLegalDURelModelImpl.DEPARTMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTAMENT = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepartament",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal d u rels where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @return the matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByDepartament(long departmentId) {
		return findByDepartament(departmentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d u rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param departmentId the department ID
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @return the range of matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByDepartament(long departmentId, int start,
		int end) {
		return findByDepartament(departmentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d u rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param departmentId the department ID
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByDepartament(long departmentId, int start,
		int end, OrderByComparator<VLegalDURel> orderByComparator) {
		return findByDepartament(departmentId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the v legal d u rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param departmentId the department ID
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByDepartament(long departmentId, int start,
		int end, OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT;
			finderArgs = new Object[] { departmentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTAMENT;
			finderArgs = new Object[] {
					departmentId,
					
					start, end, orderByComparator
				};
		}

		List<VLegalDURel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDURel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDURel vLegalDURel : list) {
					if ((departmentId != vLegalDURel.getDepartmentId())) {
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

			query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				if (!pagination) {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d u rel
	 * @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel findByDepartament_First(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = fetchByDepartament_First(departmentId,
				orderByComparator);

		if (vLegalDURel != null) {
			return vLegalDURel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("departmentId=");
		msg.append(departmentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDURelException(msg.toString());
	}

	/**
	 * Returns the first v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel fetchByDepartament_First(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator) {
		List<VLegalDURel> list = findByDepartament(departmentId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d u rel
	 * @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel findByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = fetchByDepartament_Last(departmentId,
				orderByComparator);

		if (vLegalDURel != null) {
			return vLegalDURel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("departmentId=");
		msg.append(departmentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDURelException(msg.toString());
	}

	/**
	 * Returns the last v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel fetchByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator) {
		int count = countByDepartament(departmentId);

		if (count == 0) {
			return null;
		}

		List<VLegalDURel> list = findByDepartament(departmentId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d u rels before and after the current v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * @param vLegalDURelPK the primary key of the current v legal d u rel
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d u rel
	 * @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel[] findByDepartament_PrevAndNext(
		VLegalDURelPK vLegalDURelPK, long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = findByPrimaryKey(vLegalDURelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDURel[] array = new VLegalDURelImpl[3];

			array[0] = getByDepartament_PrevAndNext(session, vLegalDURel,
					departmentId, orderByComparator, true);

			array[1] = vLegalDURel;

			array[2] = getByDepartament_PrevAndNext(session, vLegalDURel,
					departmentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDURel getByDepartament_PrevAndNext(Session session,
		VLegalDURel vLegalDURel, long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

		query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

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
			query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDURel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDURel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d u rels where departmentId = &#63; from the database.
	 *
	 * @param departmentId the department ID
	 */
	@Override
	public void removeByDepartament(long departmentId) {
		for (VLegalDURel vLegalDURel : findByDepartament(departmentId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDURel);
		}
	}

	/**
	 * Returns the number of v legal d u rels where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @return the number of matching v legal d u rels
	 */
	@Override
	public int countByDepartament(long departmentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEPARTAMENT;

		Object[] finderArgs = new Object[] { departmentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

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

	private static final String _FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2 = "vLegalDURel.id.departmentId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUser",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUser",
			new String[] { Long.class.getName() },
			VLegalDURelModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUser",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal d u rels where userid = &#63;.
	 *
	 * @param userid the userid
	 * @return the matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByUser(long userid) {
		return findByUser(userid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d u rels where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userid the userid
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @return the range of matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByUser(long userid, int start, int end) {
		return findByUser(userid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d u rels where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userid the userid
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByUser(long userid, int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return findByUser(userid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d u rels where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userid the userid
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findByUser(long userid, int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER;
			finderArgs = new Object[] { userid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USER;
			finderArgs = new Object[] { userid, start, end, orderByComparator };
		}

		List<VLegalDURel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDURel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDURel vLegalDURel : list) {
					if ((userid != vLegalDURel.getUserid())) {
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

			query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				if (!pagination) {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d u rel
	 * @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel findByUser_First(long userid,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = fetchByUser_First(userid, orderByComparator);

		if (vLegalDURel != null) {
			return vLegalDURel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDURelException(msg.toString());
	}

	/**
	 * Returns the first v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel fetchByUser_First(long userid,
		OrderByComparator<VLegalDURel> orderByComparator) {
		List<VLegalDURel> list = findByUser(userid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d u rel
	 * @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel findByUser_Last(long userid,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = fetchByUser_Last(userid, orderByComparator);

		if (vLegalDURel != null) {
			return vLegalDURel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDURelException(msg.toString());
	}

	/**
	 * Returns the last v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel fetchByUser_Last(long userid,
		OrderByComparator<VLegalDURel> orderByComparator) {
		int count = countByUser(userid);

		if (count == 0) {
			return null;
		}

		List<VLegalDURel> list = findByUser(userid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d u rels before and after the current v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * @param vLegalDURelPK the primary key of the current v legal d u rel
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d u rel
	 * @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel[] findByUser_PrevAndNext(VLegalDURelPK vLegalDURelPK,
		long userid, OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = findByPrimaryKey(vLegalDURelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDURel[] array = new VLegalDURelImpl[3];

			array[0] = getByUser_PrevAndNext(session, vLegalDURel, userid,
					orderByComparator, true);

			array[1] = vLegalDURel;

			array[2] = getByUser_PrevAndNext(session, vLegalDURel, userid,
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

	protected VLegalDURel getByUser_PrevAndNext(Session session,
		VLegalDURel vLegalDURel, long userid,
		OrderByComparator<VLegalDURel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

		query.append(_FINDER_COLUMN_USER_USERID_2);

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
			query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDURel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDURel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d u rels where userid = &#63; from the database.
	 *
	 * @param userid the userid
	 */
	@Override
	public void removeByUser(long userid) {
		for (VLegalDURel vLegalDURel : findByUser(userid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDURel);
		}
	}

	/**
	 * Returns the number of v legal d u rels where userid = &#63;.
	 *
	 * @param userid the userid
	 * @return the number of matching v legal d u rels
	 */
	@Override
	public int countByUser(long userid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER;

		Object[] finderArgs = new Object[] { userid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USER_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

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

	private static final String _FINDER_COLUMN_USER_USERID_2 = "vLegalDURel.id.userid = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, VLegalDURelImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] { Long.class.getName() },
			VLegalDURelModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the v legal d u rel where userid = &#63; or throws a {@link NoSuchVLegalDURelException} if it could not be found.
	 *
	 * @param userid the userid
	 * @return the matching v legal d u rel
	 * @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel findByUserId(long userid)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = fetchByUserId(userid);

		if (vLegalDURel == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userid=");
			msg.append(userid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalDURelException(msg.toString());
		}

		return vLegalDURel;
	}

	/**
	 * Returns the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userid the userid
	 * @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel fetchByUserId(long userid) {
		return fetchByUserId(userid, true);
	}

	/**
	 * Returns the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userid the userid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 */
	@Override
	public VLegalDURel fetchByUserId(long userid, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { userid };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result instanceof VLegalDURel) {
			VLegalDURel vLegalDURel = (VLegalDURel)result;

			if ((userid != vLegalDURel.getUserid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				List<VLegalDURel> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalDURelPersistenceImpl.fetchByUserId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalDURel vLegalDURel = list.get(0);

					result = vLegalDURel;

					cacheResult(vLegalDURel);

					if ((vLegalDURel.getUserid() != userid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, vLegalDURel);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_USERID, finderArgs);

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
			return (VLegalDURel)result;
		}
	}

	/**
	 * Removes the v legal d u rel where userid = &#63; from the database.
	 *
	 * @param userid the userid
	 * @return the v legal d u rel that was removed
	 */
	@Override
	public VLegalDURel removeByUserId(long userid)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = findByUserId(userid);

		return remove(vLegalDURel);
	}

	/**
	 * Returns the number of v legal d u rels where userid = &#63;.
	 *
	 * @param userid the userid
	 * @return the number of matching v legal d u rels
	 */
	@Override
	public int countByUserId(long userid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "vLegalDURel.id.userid = ?";

	public VLegalDURelPersistenceImpl() {
		setModelClass(VLegalDURel.class);
	}

	/**
	 * Caches the v legal d u rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDURel the v legal d u rel
	 */
	@Override
	public void cacheResult(VLegalDURel vLegalDURel) {
		entityCache.putResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey(), vLegalDURel);

		finderCache.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { vLegalDURel.getUserid() }, vLegalDURel);

		vLegalDURel.resetOriginalValues();
	}

	/**
	 * Caches the v legal d u rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDURels the v legal d u rels
	 */
	@Override
	public void cacheResult(List<VLegalDURel> vLegalDURels) {
		for (VLegalDURel vLegalDURel : vLegalDURels) {
			if (entityCache.getResult(
						VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDURelImpl.class, vLegalDURel.getPrimaryKey()) == null) {
				cacheResult(vLegalDURel);
			}
			else {
				vLegalDURel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal d u rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalDURelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal d u rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalDURel vLegalDURel) {
		entityCache.removeResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalDURelModelImpl)vLegalDURel);
	}

	@Override
	public void clearCache(List<VLegalDURel> vLegalDURels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalDURel vLegalDURel : vLegalDURels) {
			entityCache.removeResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDURelImpl.class, vLegalDURel.getPrimaryKey());

			clearUniqueFindersCache((VLegalDURelModelImpl)vLegalDURel);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalDURelModelImpl vLegalDURelModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] { vLegalDURelModelImpl.getUserid() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_USERID, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_USERID, args,
				vLegalDURelModelImpl);
		}
		else {
			if ((vLegalDURelModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { vLegalDURelModelImpl.getUserid() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_USERID, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_USERID, args,
					vLegalDURelModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalDURelModelImpl vLegalDURelModelImpl) {
		Object[] args = new Object[] { vLegalDURelModelImpl.getUserid() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_USERID, args);

		if ((vLegalDURelModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERID.getColumnBitmask()) != 0) {
			args = new Object[] { vLegalDURelModelImpl.getOriginalUserid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_USERID, args);
		}
	}

	/**
	 * Creates a new v legal d u rel with the primary key. Does not add the v legal d u rel to the database.
	 *
	 * @param vLegalDURelPK the primary key for the new v legal d u rel
	 * @return the new v legal d u rel
	 */
	@Override
	public VLegalDURel create(VLegalDURelPK vLegalDURelPK) {
		VLegalDURel vLegalDURel = new VLegalDURelImpl();

		vLegalDURel.setNew(true);
		vLegalDURel.setPrimaryKey(vLegalDURelPK);

		return vLegalDURel;
	}

	/**
	 * Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDURelPK the primary key of the v legal d u rel
	 * @return the v legal d u rel that was removed
	 * @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel remove(VLegalDURelPK vLegalDURelPK)
		throws NoSuchVLegalDURelException {
		return remove((Serializable)vLegalDURelPK);
	}

	/**
	 * Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d u rel
	 * @return the v legal d u rel that was removed
	 * @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel remove(Serializable primaryKey)
		throws NoSuchVLegalDURelException {
		Session session = null;

		try {
			session = openSession();

			VLegalDURel vLegalDURel = (VLegalDURel)session.get(VLegalDURelImpl.class,
					primaryKey);

			if (vLegalDURel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalDURelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalDURel);
		}
		catch (NoSuchVLegalDURelException nsee) {
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
	protected VLegalDURel removeImpl(VLegalDURel vLegalDURel) {
		vLegalDURel = toUnwrappedModel(vLegalDURel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalDURel)) {
				vLegalDURel = (VLegalDURel)session.get(VLegalDURelImpl.class,
						vLegalDURel.getPrimaryKeyObj());
			}

			if (vLegalDURel != null) {
				session.delete(vLegalDURel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalDURel != null) {
			clearCache(vLegalDURel);
		}

		return vLegalDURel;
	}

	@Override
	public VLegalDURel updateImpl(VLegalDURel vLegalDURel) {
		vLegalDURel = toUnwrappedModel(vLegalDURel);

		boolean isNew = vLegalDURel.isNew();

		VLegalDURelModelImpl vLegalDURelModelImpl = (VLegalDURelModelImpl)vLegalDURel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalDURel.isNew()) {
				session.save(vLegalDURel);

				vLegalDURel.setNew(false);
			}
			else {
				vLegalDURel = (VLegalDURel)session.merge(vLegalDURel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalDURelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalDURelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDURelModelImpl.getOriginalDepartmentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEPARTAMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT,
					args);

				args = new Object[] { vLegalDURelModelImpl.getDepartmentId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEPARTAMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT,
					args);
			}

			if ((vLegalDURelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDURelModelImpl.getOriginalUserid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER,
					args);

				args = new Object[] { vLegalDURelModelImpl.getUserid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER,
					args);
			}
		}

		entityCache.putResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey(), vLegalDURel,
			false);

		clearUniqueFindersCache(vLegalDURelModelImpl);
		cacheUniqueFindersCache(vLegalDURelModelImpl, isNew);

		vLegalDURel.resetOriginalValues();

		return vLegalDURel;
	}

	protected VLegalDURel toUnwrappedModel(VLegalDURel vLegalDURel) {
		if (vLegalDURel instanceof VLegalDURelImpl) {
			return vLegalDURel;
		}

		VLegalDURelImpl vLegalDURelImpl = new VLegalDURelImpl();

		vLegalDURelImpl.setNew(vLegalDURel.isNew());
		vLegalDURelImpl.setPrimaryKey(vLegalDURel.getPrimaryKey());

		vLegalDURelImpl.setDepartmentId(vLegalDURel.getDepartmentId());
		vLegalDURelImpl.setUserid(vLegalDURel.getUserid());

		return vLegalDURelImpl;
	}

	/**
	 * Returns the v legal d u rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d u rel
	 * @return the v legal d u rel
	 * @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalDURelException {
		VLegalDURel vLegalDURel = fetchByPrimaryKey(primaryKey);

		if (vLegalDURel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalDURelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalDURel;
	}

	/**
	 * Returns the v legal d u rel with the primary key or throws a {@link NoSuchVLegalDURelException} if it could not be found.
	 *
	 * @param vLegalDURelPK the primary key of the v legal d u rel
	 * @return the v legal d u rel
	 * @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel findByPrimaryKey(VLegalDURelPK vLegalDURelPK)
		throws NoSuchVLegalDURelException {
		return findByPrimaryKey((Serializable)vLegalDURelPK);
	}

	/**
	 * Returns the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d u rel
	 * @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDURelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalDURel vLegalDURel = (VLegalDURel)serializable;

		if (vLegalDURel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDURel = (VLegalDURel)session.get(VLegalDURelImpl.class,
						primaryKey);

				if (vLegalDURel != null) {
					cacheResult(vLegalDURel);
				}
				else {
					entityCache.putResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDURelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDURelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalDURel;
	}

	/**
	 * Returns the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDURelPK the primary key of the v legal d u rel
	 * @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	 */
	@Override
	public VLegalDURel fetchByPrimaryKey(VLegalDURelPK vLegalDURelPK) {
		return fetchByPrimaryKey((Serializable)vLegalDURelPK);
	}

	@Override
	public Map<Serializable, VLegalDURel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalDURel> map = new HashMap<Serializable, VLegalDURel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalDURel vLegalDURel = fetchByPrimaryKey(primaryKey);

			if (vLegalDURel != null) {
				map.put(primaryKey, vLegalDURel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal d u rels.
	 *
	 * @return the v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d u rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @return the range of v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d u rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findAll(int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d u rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d u rels
	 * @param end the upper bound of the range of v legal d u rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal d u rels
	 */
	@Override
	public List<VLegalDURel> findAll(int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator,
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

		List<VLegalDURel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDURel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALDUREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDUREL;

				if (pagination) {
					sql = sql.concat(VLegalDURelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d u rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalDURel vLegalDURel : findAll()) {
			remove(vLegalDURel);
		}
	}

	/**
	 * Returns the number of v legal d u rels.
	 *
	 * @return the number of v legal d u rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDUREL);

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
		return VLegalDURelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal d u rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalDURelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALDUREL = "SELECT vLegalDURel FROM VLegalDURel vLegalDURel";
	private static final String _SQL_SELECT_VLEGALDUREL_WHERE = "SELECT vLegalDURel FROM VLegalDURel vLegalDURel WHERE ";
	private static final String _SQL_COUNT_VLEGALDUREL = "SELECT COUNT(vLegalDURel) FROM VLegalDURel vLegalDURel";
	private static final String _SQL_COUNT_VLEGALDUREL_WHERE = "SELECT COUNT(vLegalDURel) FROM VLegalDURel vLegalDURel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDURel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDURel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDURel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalDURelPersistenceImpl.class);
}