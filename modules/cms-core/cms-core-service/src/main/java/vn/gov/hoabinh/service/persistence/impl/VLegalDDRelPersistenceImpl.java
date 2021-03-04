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

import vn.gov.hoabinh.exception.NoSuchVLegalDDRelException;
import vn.gov.hoabinh.model.VLegalDDRel;
import vn.gov.hoabinh.model.impl.VLegalDDRelImpl;
import vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalDDRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDDRelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal d d rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalDDRelUtil
 * @generated
 */
@ProviderType
public class VLegalDDRelPersistenceImpl extends BasePersistenceImpl<VLegalDDRel>
	implements VLegalDDRelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalDDRelUtil} to access the v legal d d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDDRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, VLegalDDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, VLegalDDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPARTAMENT =
		new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, VLegalDDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepartament",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT =
		new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, VLegalDDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepartament",
			new String[] { Long.class.getName() },
			VLegalDDRelModelImpl.DEPARTMENTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTAMENT = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepartament",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal d d rels where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @return the matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDepartament(long departmentId) {
		return findByDepartament(departmentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d d rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param departmentId the department ID
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @return the range of matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDepartament(long departmentId, int start,
		int end) {
		return findByDepartament(departmentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d d rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param departmentId the department ID
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDepartament(long departmentId, int start,
		int end, OrderByComparator<VLegalDDRel> orderByComparator) {
		return findByDepartament(departmentId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the v legal d d rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param departmentId the department ID
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDepartament(long departmentId, int start,
		int end, OrderByComparator<VLegalDDRel> orderByComparator,
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

		List<VLegalDDRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDDRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDDRel vLegalDDRel : list) {
					if ((departmentId != vLegalDDRel.getDepartmentId())) {
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

			query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

			query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				if (!pagination) {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel findByDepartament_First(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = fetchByDepartament_First(departmentId,
				orderByComparator);

		if (vLegalDDRel != null) {
			return vLegalDDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("departmentId=");
		msg.append(departmentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDDRelException(msg.toString());
	}

	/**
	 * Returns the first v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel fetchByDepartament_First(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		List<VLegalDDRel> list = findByDepartament(departmentId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel findByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = fetchByDepartament_Last(departmentId,
				orderByComparator);

		if (vLegalDDRel != null) {
			return vLegalDDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("departmentId=");
		msg.append(departmentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDDRelException(msg.toString());
	}

	/**
	 * Returns the last v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel fetchByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		int count = countByDepartament(departmentId);

		if (count == 0) {
			return null;
		}

		List<VLegalDDRel> list = findByDepartament(departmentId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d d rels before and after the current v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * @param vLegalDDRelPK the primary key of the current v legal d d rel
	 * @param departmentId the department ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel[] findByDepartament_PrevAndNext(
		VLegalDDRelPK vLegalDDRelPK, long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = findByPrimaryKey(vLegalDDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDDRel[] array = new VLegalDDRelImpl[3];

			array[0] = getByDepartament_PrevAndNext(session, vLegalDDRel,
					departmentId, orderByComparator, true);

			array[1] = vLegalDDRel;

			array[2] = getByDepartament_PrevAndNext(session, vLegalDDRel,
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

	protected VLegalDDRel getByDepartament_PrevAndNext(Session session,
		VLegalDDRel vLegalDDRel, long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

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
			query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d d rels where departmentId = &#63; from the database.
	 *
	 * @param departmentId the department ID
	 */
	@Override
	public void removeByDepartament(long departmentId) {
		for (VLegalDDRel vLegalDDRel : findByDepartament(departmentId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalDDRel);
		}
	}

	/**
	 * Returns the number of v legal d d rels where departmentId = &#63;.
	 *
	 * @param departmentId the department ID
	 * @return the number of matching v legal d d rels
	 */
	@Override
	public int countByDepartament(long departmentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEPARTAMENT;

		Object[] finderArgs = new Object[] { departmentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDDREL_WHERE);

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

	private static final String _FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2 = "vLegalDDRel.id.departmentId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOC = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, VLegalDDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDoc",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, VLegalDDRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDoc",
			new String[] { String.class.getName() },
			VLegalDDRelModelImpl.DOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOC = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDoc",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal d d rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDoc(String docId) {
		return findByDoc(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @return the range of matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDoc(String docId, int start, int end) {
		return findByDoc(docId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDoc(String docId, int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return findByDoc(docId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findByDoc(String docId, int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC;
			finderArgs = new Object[] { docId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOC;
			finderArgs = new Object[] { docId, start, end, orderByComparator };
		}

		List<VLegalDDRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDDRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDDRel vLegalDDRel : list) {
					if (!Objects.equals(docId, vLegalDDRel.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOC_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOC_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_DOC_DOCID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocId) {
					qPos.add(docId);
				}

				if (!pagination) {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel findByDoc_First(String docId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = fetchByDoc_First(docId, orderByComparator);

		if (vLegalDDRel != null) {
			return vLegalDDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDDRelException(msg.toString());
	}

	/**
	 * Returns the first v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel fetchByDoc_First(String docId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		List<VLegalDDRel> list = findByDoc(docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel findByDoc_Last(String docId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = fetchByDoc_Last(docId, orderByComparator);

		if (vLegalDDRel != null) {
			return vLegalDDRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDDRelException(msg.toString());
	}

	/**
	 * Returns the last v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	 */
	@Override
	public VLegalDDRel fetchByDoc_Last(String docId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		int count = countByDoc(docId);

		if (count == 0) {
			return null;
		}

		List<VLegalDDRel> list = findByDoc(docId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d d rels before and after the current v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * @param vLegalDDRelPK the primary key of the current v legal d d rel
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel[] findByDoc_PrevAndNext(VLegalDDRelPK vLegalDDRelPK,
		String docId, OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = findByPrimaryKey(vLegalDDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDDRel[] array = new VLegalDDRelImpl[3];

			array[0] = getByDoc_PrevAndNext(session, vLegalDDRel, docId,
					orderByComparator, true);

			array[1] = vLegalDDRel;

			array[2] = getByDoc_PrevAndNext(session, vLegalDDRel, docId,
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

	protected VLegalDDRel getByDoc_PrevAndNext(Session session,
		VLegalDDRel vLegalDDRel, String docId,
		OrderByComparator<VLegalDDRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

		boolean bindDocId = false;

		if (docId == null) {
			query.append(_FINDER_COLUMN_DOC_DOCID_1);
		}
		else if (docId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOC_DOCID_3);
		}
		else {
			bindDocId = true;

			query.append(_FINDER_COLUMN_DOC_DOCID_2);
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
			query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocId) {
			qPos.add(docId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d d rels where docId = &#63; from the database.
	 *
	 * @param docId the doc ID
	 */
	@Override
	public void removeByDoc(String docId) {
		for (VLegalDDRel vLegalDDRel : findByDoc(docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDDRel);
		}
	}

	/**
	 * Returns the number of v legal d d rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the number of matching v legal d d rels
	 */
	@Override
	public int countByDoc(String docId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOC;

		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDDREL_WHERE);

			boolean bindDocId = false;

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOC_DOCID_1);
			}
			else if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOC_DOCID_3);
			}
			else {
				bindDocId = true;

				query.append(_FINDER_COLUMN_DOC_DOCID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocId) {
					qPos.add(docId);
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

	private static final String _FINDER_COLUMN_DOC_DOCID_1 = "vLegalDDRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOC_DOCID_2 = "vLegalDDRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_3 = "(vLegalDDRel.id.docId IS NULL OR vLegalDDRel.id.docId = '')";

	public VLegalDDRelPersistenceImpl() {
		setModelClass(VLegalDDRel.class);
	}

	/**
	 * Caches the v legal d d rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDDRel the v legal d d rel
	 */
	@Override
	public void cacheResult(VLegalDDRel vLegalDDRel) {
		entityCache.putResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey(), vLegalDDRel);

		vLegalDDRel.resetOriginalValues();
	}

	/**
	 * Caches the v legal d d rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDDRels the v legal d d rels
	 */
	@Override
	public void cacheResult(List<VLegalDDRel> vLegalDDRels) {
		for (VLegalDDRel vLegalDDRel : vLegalDDRels) {
			if (entityCache.getResult(
						VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey()) == null) {
				cacheResult(vLegalDDRel);
			}
			else {
				vLegalDDRel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal d d rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalDDRelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal d d rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalDDRel vLegalDDRel) {
		entityCache.removeResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalDDRel> vLegalDDRels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalDDRel vLegalDDRel : vLegalDDRels) {
			entityCache.removeResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	 *
	 * @param vLegalDDRelPK the primary key for the new v legal d d rel
	 * @return the new v legal d d rel
	 */
	@Override
	public VLegalDDRel create(VLegalDDRelPK vLegalDDRelPK) {
		VLegalDDRel vLegalDDRel = new VLegalDDRelImpl();

		vLegalDDRel.setNew(true);
		vLegalDDRel.setPrimaryKey(vLegalDDRelPK);

		return vLegalDDRel;
	}

	/**
	 * Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDDRelPK the primary key of the v legal d d rel
	 * @return the v legal d d rel that was removed
	 * @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel remove(VLegalDDRelPK vLegalDDRelPK)
		throws NoSuchVLegalDDRelException {
		return remove((Serializable)vLegalDDRelPK);
	}

	/**
	 * Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d d rel
	 * @return the v legal d d rel that was removed
	 * @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel remove(Serializable primaryKey)
		throws NoSuchVLegalDDRelException {
		Session session = null;

		try {
			session = openSession();

			VLegalDDRel vLegalDDRel = (VLegalDDRel)session.get(VLegalDDRelImpl.class,
					primaryKey);

			if (vLegalDDRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalDDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalDDRel);
		}
		catch (NoSuchVLegalDDRelException nsee) {
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
	protected VLegalDDRel removeImpl(VLegalDDRel vLegalDDRel) {
		vLegalDDRel = toUnwrappedModel(vLegalDDRel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalDDRel)) {
				vLegalDDRel = (VLegalDDRel)session.get(VLegalDDRelImpl.class,
						vLegalDDRel.getPrimaryKeyObj());
			}

			if (vLegalDDRel != null) {
				session.delete(vLegalDDRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalDDRel != null) {
			clearCache(vLegalDDRel);
		}

		return vLegalDDRel;
	}

	@Override
	public VLegalDDRel updateImpl(VLegalDDRel vLegalDDRel) {
		vLegalDDRel = toUnwrappedModel(vLegalDDRel);

		boolean isNew = vLegalDDRel.isNew();

		VLegalDDRelModelImpl vLegalDDRelModelImpl = (VLegalDDRelModelImpl)vLegalDDRel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalDDRel.isNew()) {
				session.save(vLegalDDRel);

				vLegalDDRel.setNew(false);
			}
			else {
				vLegalDDRel = (VLegalDDRel)session.merge(vLegalDDRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalDDRelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalDDRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDDRelModelImpl.getOriginalDepartmentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEPARTAMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT,
					args);

				args = new Object[] { vLegalDDRelModelImpl.getDepartmentId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEPARTAMENT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPARTAMENT,
					args);
			}

			if ((vLegalDDRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDDRelModelImpl.getOriginalDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC,
					args);

				args = new Object[] { vLegalDDRelModelImpl.getDocId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC,
					args);
			}
		}

		entityCache.putResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey(), vLegalDDRel,
			false);

		vLegalDDRel.resetOriginalValues();

		return vLegalDDRel;
	}

	protected VLegalDDRel toUnwrappedModel(VLegalDDRel vLegalDDRel) {
		if (vLegalDDRel instanceof VLegalDDRelImpl) {
			return vLegalDDRel;
		}

		VLegalDDRelImpl vLegalDDRelImpl = new VLegalDDRelImpl();

		vLegalDDRelImpl.setNew(vLegalDDRel.isNew());
		vLegalDDRelImpl.setPrimaryKey(vLegalDDRel.getPrimaryKey());

		vLegalDDRelImpl.setDepartmentId(vLegalDDRel.getDepartmentId());
		vLegalDDRelImpl.setDocId(vLegalDDRel.getDocId());

		return vLegalDDRelImpl;
	}

	/**
	 * Returns the v legal d d rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d d rel
	 * @return the v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalDDRelException {
		VLegalDDRel vLegalDDRel = fetchByPrimaryKey(primaryKey);

		if (vLegalDDRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalDDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalDDRel;
	}

	/**
	 * Returns the v legal d d rel with the primary key or throws a {@link NoSuchVLegalDDRelException} if it could not be found.
	 *
	 * @param vLegalDDRelPK the primary key of the v legal d d rel
	 * @return the v legal d d rel
	 * @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel findByPrimaryKey(VLegalDDRelPK vLegalDDRelPK)
		throws NoSuchVLegalDDRelException {
		return findByPrimaryKey((Serializable)vLegalDDRelPK);
	}

	/**
	 * Returns the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d d rel
	 * @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDDRelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalDDRel vLegalDDRel = (VLegalDDRel)serializable;

		if (vLegalDDRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDDRel = (VLegalDDRel)session.get(VLegalDDRelImpl.class,
						primaryKey);

				if (vLegalDDRel != null) {
					cacheResult(vLegalDDRel);
				}
				else {
					entityCache.putResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDDRelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDDRelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalDDRel;
	}

	/**
	 * Returns the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDDRelPK the primary key of the v legal d d rel
	 * @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	 */
	@Override
	public VLegalDDRel fetchByPrimaryKey(VLegalDDRelPK vLegalDDRelPK) {
		return fetchByPrimaryKey((Serializable)vLegalDDRelPK);
	}

	@Override
	public Map<Serializable, VLegalDDRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalDDRel> map = new HashMap<Serializable, VLegalDDRel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalDDRel vLegalDDRel = fetchByPrimaryKey(primaryKey);

			if (vLegalDDRel != null) {
				map.put(primaryKey, vLegalDDRel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal d d rels.
	 *
	 * @return the v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @return the range of v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findAll(int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d d rels
	 * @param end the upper bound of the range of v legal d d rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal d d rels
	 */
	@Override
	public List<VLegalDDRel> findAll(int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator,
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

		List<VLegalDDRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDDRel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALDDREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDDREL;

				if (pagination) {
					sql = sql.concat(VLegalDDRelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d d rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalDDRel vLegalDDRel : findAll()) {
			remove(vLegalDDRel);
		}
	}

	/**
	 * Returns the number of v legal d d rels.
	 *
	 * @return the number of v legal d d rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDDREL);

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
		return VLegalDDRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal d d rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalDDRelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALDDREL = "SELECT vLegalDDRel FROM VLegalDDRel vLegalDDRel";
	private static final String _SQL_SELECT_VLEGALDDREL_WHERE = "SELECT vLegalDDRel FROM VLegalDDRel vLegalDDRel WHERE ";
	private static final String _SQL_COUNT_VLEGALDDREL = "SELECT COUNT(vLegalDDRel) FROM VLegalDDRel vLegalDDRel";
	private static final String _SQL_COUNT_VLEGALDDREL_WHERE = "SELECT COUNT(vLegalDDRel) FROM VLegalDDRel vLegalDDRel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDDRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDDRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDDRel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalDDRelPersistenceImpl.class);
}