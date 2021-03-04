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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsStatusException;
import vn.gov.hoabinh.model.VcmsStatus;
import vn.gov.hoabinh.model.impl.VcmsStatusImpl;
import vn.gov.hoabinh.model.impl.VcmsStatusModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsStatusPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the vcms status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsStatusPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsStatusUtil
 * @generated
 */
@ProviderType
public class VcmsStatusPersistenceImpl extends BasePersistenceImpl<VcmsStatus>
	implements VcmsStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsStatusUtil} to access the vcms status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK |
			VcmsStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vcms statuses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByCompanyId(long companyId) {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms statuses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsStatus vcmsStatus : list) {
					if ((companyId != vcmsStatus.getCompanyId())) {
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

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms status in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByCompanyId_First(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms status in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByCompanyId_First(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		List<VcmsStatus> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByCompanyId_Last(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByCompanyId_Last(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<VcmsStatus> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63;.
	 *
	 * @param statusId the primary key of the current vcms status
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus[] findByCompanyId_PrevAndNext(long statusId,
		long companyId, OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByPrimaryKey(statusId);

		Session session = null;

		try {
			session = openSession();

			VcmsStatus[] array = new VcmsStatusImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, vcmsStatus,
					companyId, orderByComparator, true);

			array[1] = vcmsStatus;

			array[2] = getByCompanyId_PrevAndNext(session, vcmsStatus,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsStatus getByCompanyId_PrevAndNext(Session session,
		VcmsStatus vcmsStatus, long companyId,
		OrderByComparator<VcmsStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms statuses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (VcmsStatus vcmsStatus : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "vcmsStatus.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK |
			VcmsStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vcms statuses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_G(long companyId, long groupId) {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_G(long companyId, long groupId, int start,
		int end) {
		return findByC_G(companyId, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_G(long companyId, long groupId, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return findByC_G(companyId, groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_G(long companyId, long groupId, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsStatus vcmsStatus : list) {
					if ((companyId != vcmsStatus.getCompanyId()) ||
							(groupId != vcmsStatus.getGroupId())) {
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

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_G_First(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_G_First(companyId, groupId,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_First(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		List<VcmsStatus> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_G_Last(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<VcmsStatus> list = findByC_G(companyId, groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param statusId the primary key of the current vcms status
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus[] findByC_G_PrevAndNext(long statusId, long companyId,
		long groupId, OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByPrimaryKey(statusId);

		Session session = null;

		try {
			session = openSession();

			VcmsStatus[] array = new VcmsStatusImpl[3];

			array[0] = getByC_G_PrevAndNext(session, vcmsStatus, companyId,
					groupId, orderByComparator, true);

			array[1] = vcmsStatus;

			array[2] = getByC_G_PrevAndNext(session, vcmsStatus, companyId,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsStatus getByC_G_PrevAndNext(Session session,
		VcmsStatus vcmsStatus, long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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
			query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms statuses where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByC_G(long companyId, long groupId) {
		for (VcmsStatus vcmsStatus : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByC_G(long companyId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "vcmsStatus.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "vcmsStatus.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] { Long.class.getName(), Integer.class.getName() },
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK |
			VcmsStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the vcms statuses where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @return the matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByG_P(long groupId, int position) {
		return findByG_P(groupId, position, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms statuses where groupId = &#63; and position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByG_P(long groupId, int position, int start,
		int end) {
		return findByG_P(groupId, position, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where groupId = &#63; and position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByG_P(long groupId, int position, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return findByG_P(groupId, position, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where groupId = &#63; and position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByG_P(long groupId, int position, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P;
			finderArgs = new Object[] { groupId, position };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P;
			finderArgs = new Object[] {
					groupId, position,
					
					start, end, orderByComparator
				};
		}

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsStatus vcmsStatus : list) {
					if ((groupId != vcmsStatus.getGroupId()) ||
							(position != vcmsStatus.getPosition())) {
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

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_G_P_GROUPID_2);

			query.append(_FINDER_COLUMN_G_P_POSITION_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(position);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByG_P_First(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByG_P_First(groupId, position,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", position=");
		msg.append(position);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByG_P_First(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator) {
		List<VcmsStatus> list = findByG_P(groupId, position, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByG_P_Last(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByG_P_Last(groupId, position,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", position=");
		msg.append(position);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByG_P_Last(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator) {
		int count = countByG_P(groupId, position);

		if (count == 0) {
			return null;
		}

		List<VcmsStatus> list = findByG_P(groupId, position, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63; and position = &#63;.
	 *
	 * @param statusId the primary key of the current vcms status
	 * @param groupId the group ID
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus[] findByG_P_PrevAndNext(long statusId, long groupId,
		int position, OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByPrimaryKey(statusId);

		Session session = null;

		try {
			session = openSession();

			VcmsStatus[] array = new VcmsStatusImpl[3];

			array[0] = getByG_P_PrevAndNext(session, vcmsStatus, groupId,
					position, orderByComparator, true);

			array[1] = vcmsStatus;

			array[2] = getByG_P_PrevAndNext(session, vcmsStatus, groupId,
					position, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsStatus getByG_P_PrevAndNext(Session session,
		VcmsStatus vcmsStatus, long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

		query.append(_FINDER_COLUMN_G_P_GROUPID_2);

		query.append(_FINDER_COLUMN_G_P_POSITION_2);

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
			query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(position);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms statuses where groupId = &#63; and position = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 */
	@Override
	public void removeByG_P(long groupId, int position) {
		for (VcmsStatus vcmsStatus : findByG_P(groupId, position,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByG_P(long groupId, int position) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P;

		Object[] finderArgs = new Object[] { groupId, position };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_G_P_GROUPID_2);

			query.append(_FINDER_COLUMN_G_P_POSITION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(position);

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

	private static final String _FINDER_COLUMN_G_P_GROUPID_2 = "vcmsStatus.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_POSITION_2 = "vcmsStatus.position = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK |
			VcmsStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vcms statuses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms statuses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsStatus vcmsStatus : list) {
					if ((groupId != vcmsStatus.getGroupId())) {
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

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByGroupId_First(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByGroupId_First(groupId, orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByGroupId_First(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		List<VcmsStatus> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByGroupId_Last(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByGroupId_Last(groupId, orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms status in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByGroupId_Last(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VcmsStatus> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63;.
	 *
	 * @param statusId the primary key of the current vcms status
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus[] findByGroupId_PrevAndNext(long statusId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByPrimaryKey(statusId);

		Session session = null;

		try {
			session = openSession();

			VcmsStatus[] array = new VcmsStatusImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vcmsStatus, groupId,
					orderByComparator, true);

			array[1] = vcmsStatus;

			array[2] = getByGroupId_PrevAndNext(session, vcmsStatus, groupId,
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

	protected VcmsStatus getByGroupId_PrevAndNext(Session session,
		VcmsStatus vcmsStatus, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms statuses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VcmsStatus vcmsStatus : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vcmsStatus.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_G_A",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_A",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_G_A(long companyId, long groupId, boolean active)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_G_A(companyId, groupId, active);

		if (vcmsStatus == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsStatusException(msg.toString());
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_A(long companyId, long groupId, boolean active) {
		return fetchByC_G_A(companyId, groupId, active, true);
	}

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param active the active
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_A(long companyId, long groupId,
		boolean active, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { companyId, groupId, active };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_G_A,
					finderArgs, this);
		}

		if (result instanceof VcmsStatus) {
			VcmsStatus vcmsStatus = (VcmsStatus)result;

			if ((companyId != vcmsStatus.getCompanyId()) ||
					(groupId != vcmsStatus.getGroupId()) ||
					(active != vcmsStatus.getActive())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_A_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(active);

				List<VcmsStatus> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_A,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsStatusPersistenceImpl.fetchByC_G_A(long, long, boolean, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsStatus vcmsStatus = list.get(0);

					result = vcmsStatus;

					cacheResult(vcmsStatus);

					if ((vcmsStatus.getCompanyId() != companyId) ||
							(vcmsStatus.getGroupId() != groupId) ||
							(vcmsStatus.getActive() != active)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_A,
							finderArgs, vcmsStatus);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_A, finderArgs);

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
			return (VcmsStatus)result;
		}
	}

	/**
	 * Removes the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param active the active
	 * @return the vcms status that was removed
	 */
	@Override
	public VcmsStatus removeByC_G_A(long companyId, long groupId, boolean active)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByC_G_A(companyId, groupId, active);

		return remove(vcmsStatus);
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByC_G_A(long companyId, long groupId, boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_A;

		Object[] finderArgs = new Object[] { companyId, groupId, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_A_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_C_G_A_COMPANYID_2 = "vcmsStatus.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_A_GROUPID_2 = "vcmsStatus.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_A_ACTIVE_2 = "vcmsStatus.active = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G_P_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_G_P_A",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(), Boolean.class.getName()
			},
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.ISPRIMARY_COLUMN_BITMASK |
			VcmsStatusModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_P_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_P_A",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @param active the active
	 * @return the matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_G_P_A(companyId, groupId, isPrimary,
				active);

		if (vcmsStatus == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", isPrimary=");
			msg.append(isPrimary);

			msg.append(", active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsStatusException(msg.toString());
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @param active the active
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) {
		return fetchByC_G_P_A(companyId, groupId, isPrimary, active, true);
	}

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @param active the active
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { companyId, groupId, isPrimary, active };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_G_P_A,
					finderArgs, this);
		}

		if (result instanceof VcmsStatus) {
			VcmsStatus vcmsStatus = (VcmsStatus)result;

			if ((companyId != vcmsStatus.getCompanyId()) ||
					(groupId != vcmsStatus.getGroupId()) ||
					(isPrimary != vcmsStatus.getIsPrimary()) ||
					(active != vcmsStatus.getActive())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_P_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_P_A_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_P_A_ISPRIMARY_2);

			query.append(_FINDER_COLUMN_C_G_P_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(isPrimary);

				qPos.add(active);

				List<VcmsStatus> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P_A,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsStatusPersistenceImpl.fetchByC_G_P_A(long, long, boolean, boolean, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsStatus vcmsStatus = list.get(0);

					result = vcmsStatus;

					cacheResult(vcmsStatus);

					if ((vcmsStatus.getCompanyId() != companyId) ||
							(vcmsStatus.getGroupId() != groupId) ||
							(vcmsStatus.getIsPrimary() != isPrimary) ||
							(vcmsStatus.getActive() != active)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P_A,
							finderArgs, vcmsStatus);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_P_A,
					finderArgs);

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
			return (VcmsStatus)result;
		}
	}

	/**
	 * Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @param active the active
	 * @return the vcms status that was removed
	 */
	@Override
	public VcmsStatus removeByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByC_G_P_A(companyId, groupId, isPrimary,
				active);

		return remove(vcmsStatus);
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @param active the active
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByC_G_P_A(long companyId, long groupId, boolean isPrimary,
		boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_P_A;

		Object[] finderArgs = new Object[] { companyId, groupId, isPrimary, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_P_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_P_A_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_P_A_ISPRIMARY_2);

			query.append(_FINDER_COLUMN_C_G_P_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(isPrimary);

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

	private static final String _FINDER_COLUMN_C_G_P_A_COMPANYID_2 = "vcmsStatus.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_P_A_GROUPID_2 = "vcmsStatus.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_P_A_ISPRIMARY_2 = "vcmsStatus.isPrimary = ? AND ";
	private static final String _FINDER_COLUMN_C_G_P_A_ACTIVE_2 = "vcmsStatus.active = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByA",
			new String[] { Boolean.class.getName() },
			VcmsStatusModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns the vcms status where active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	 *
	 * @param active the active
	 * @return the matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByA(boolean active) throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByA(active);

		if (vcmsStatus == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsStatusException(msg.toString());
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status where active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param active the active
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByA(boolean active) {
		return fetchByA(active, true);
	}

	/**
	 * Returns the vcms status where active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param active the active
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByA(boolean active, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { active };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_A, finderArgs,
					this);
		}

		if (result instanceof VcmsStatus) {
			VcmsStatus vcmsStatus = (VcmsStatus)result;

			if ((active != vcmsStatus.getActive())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

				List<VcmsStatus> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_A, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsStatusPersistenceImpl.fetchByA(boolean, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsStatus vcmsStatus = list.get(0);

					result = vcmsStatus;

					cacheResult(vcmsStatus);

					if ((vcmsStatus.getActive() != active)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_A,
							finderArgs, vcmsStatus);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_A, finderArgs);

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
			return (VcmsStatus)result;
		}
	}

	/**
	 * Removes the vcms status where active = &#63; from the database.
	 *
	 * @param active the active
	 * @return the vcms status that was removed
	 */
	@Override
	public VcmsStatus removeByA(boolean active)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByA(active);

		return remove(vcmsStatus);
	}

	/**
	 * Returns the number of vcms statuses where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByA(boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A;

		Object[] finderArgs = new Object[] { active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_A_ACTIVE_2);

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

	private static final String _FINDER_COLUMN_A_ACTIVE_2 = "vcmsStatus.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_A",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_A",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.ACTIVE_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK |
			VcmsStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_A = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_A",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vcms statuses where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_A(long companyId, boolean active) {
		return findByC_A(companyId, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms statuses where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end) {
		return findByC_A(companyId, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return findByC_A(companyId, active, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A;
			finderArgs = new Object[] { companyId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_A;
			finderArgs = new Object[] {
					companyId, active,
					
					start, end, orderByComparator
				};
		}

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsStatus vcmsStatus : list) {
					if ((companyId != vcmsStatus.getCompanyId()) ||
							(active != vcmsStatus.getActive())) {
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

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_A_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(active);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_A_First(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_A_First(companyId, active,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_A_First(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator) {
		List<VcmsStatus> list = findByC_A(companyId, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_A_Last(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_A_Last(companyId, active,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_A_Last(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator) {
		int count = countByC_A(companyId, active);

		if (count == 0) {
			return null;
		}

		List<VcmsStatus> list = findByC_A(companyId, active, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and active = &#63;.
	 *
	 * @param statusId the primary key of the current vcms status
	 * @param companyId the company ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus[] findByC_A_PrevAndNext(long statusId, long companyId,
		boolean active, OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByPrimaryKey(statusId);

		Session session = null;

		try {
			session = openSession();

			VcmsStatus[] array = new VcmsStatusImpl[3];

			array[0] = getByC_A_PrevAndNext(session, vcmsStatus, companyId,
					active, orderByComparator, true);

			array[1] = vcmsStatus;

			array[2] = getByC_A_PrevAndNext(session, vcmsStatus, companyId,
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

	protected VcmsStatus getByC_A_PrevAndNext(Session session,
		VcmsStatus vcmsStatus, long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

		query.append(_FINDER_COLUMN_C_A_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_A_ACTIVE_2);

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
			query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms statuses where companyId = &#63; and active = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 */
	@Override
	public void removeByC_A(long companyId, boolean active) {
		for (VcmsStatus vcmsStatus : findByC_A(companyId, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63; and active = &#63;.
	 *
	 * @param companyId the company ID
	 * @param active the active
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByC_A(long companyId, boolean active) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_A;

		Object[] finderArgs = new Object[] { companyId, active };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_A_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_A_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_C_A_COMPANYID_2 = "vcmsStatus.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_A_ACTIVE_2 = "vcmsStatus.active = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_G_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByC_G_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.ISPRIMARY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @return the matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_G_P(long companyId, long groupId,
		boolean isPrimary) throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_G_P(companyId, groupId, isPrimary);

		if (vcmsStatus == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", isPrimary=");
			msg.append(isPrimary);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsStatusException(msg.toString());
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_P(long companyId, long groupId,
		boolean isPrimary) {
		return fetchByC_G_P(companyId, groupId, isPrimary, true);
	}

	/**
	 * Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_G_P(long companyId, long groupId,
		boolean isPrimary, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { companyId, groupId, isPrimary };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_G_P,
					finderArgs, this);
		}

		if (result instanceof VcmsStatus) {
			VcmsStatus vcmsStatus = (VcmsStatus)result;

			if ((companyId != vcmsStatus.getCompanyId()) ||
					(groupId != vcmsStatus.getGroupId()) ||
					(isPrimary != vcmsStatus.getIsPrimary())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_P_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_P_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_P_ISPRIMARY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(isPrimary);

				List<VcmsStatus> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsStatusPersistenceImpl.fetchByC_G_P(long, long, boolean, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsStatus vcmsStatus = list.get(0);

					result = vcmsStatus;

					cacheResult(vcmsStatus);

					if ((vcmsStatus.getCompanyId() != companyId) ||
							(vcmsStatus.getGroupId() != groupId) ||
							(vcmsStatus.getIsPrimary() != isPrimary)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P,
							finderArgs, vcmsStatus);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_P, finderArgs);

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
			return (VcmsStatus)result;
		}
	}

	/**
	 * Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @return the vcms status that was removed
	 */
	@Override
	public VcmsStatus removeByC_G_P(long companyId, long groupId,
		boolean isPrimary) throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByC_G_P(companyId, groupId, isPrimary);

		return remove(vcmsStatus);
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param isPrimary the is primary
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByC_G_P(long companyId, long groupId, boolean isPrimary) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G_P;

		Object[] finderArgs = new Object[] { companyId, groupId, isPrimary };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_G_P_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_P_GROUPID_2);

			query.append(_FINDER_COLUMN_C_G_P_ISPRIMARY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(isPrimary);

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

	private static final String _FINDER_COLUMN_C_G_P_COMPANYID_2 = "vcmsStatus.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_P_GROUPID_2 = "vcmsStatus.groupId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_P_ISPRIMARY_2 = "vcmsStatus.isPrimary = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_P",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_P",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VcmsStatusModelImpl.COMPANYID_COLUMN_BITMASK |
			VcmsStatusModelImpl.ISPRIMARY_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK |
			VcmsStatusModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_P = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_P",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @return the matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_P(long companyId, boolean isPrimary) {
		return findByC_P(companyId, isPrimary, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_P(long companyId, boolean isPrimary,
		int start, int end) {
		return findByC_P(companyId, isPrimary, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_P(long companyId, boolean isPrimary,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return findByC_P(companyId, isPrimary, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms statuses
	 */
	@Override
	public List<VcmsStatus> findByC_P(long companyId, boolean isPrimary,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P;
			finderArgs = new Object[] { companyId, isPrimary };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_P;
			finderArgs = new Object[] {
					companyId, isPrimary,
					
					start, end, orderByComparator
				};
		}

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsStatus vcmsStatus : list) {
					if ((companyId != vcmsStatus.getCompanyId()) ||
							(isPrimary != vcmsStatus.getIsPrimary())) {
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

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_P_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_P_ISPRIMARY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(isPrimary);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_P_First(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_P_First(companyId, isPrimary,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", isPrimary=");
		msg.append(isPrimary);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_P_First(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator) {
		List<VcmsStatus> list = findByC_P(companyId, isPrimary, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByC_P_Last(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByC_P_Last(companyId, isPrimary,
				orderByComparator);

		if (vcmsStatus != null) {
			return vcmsStatus;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", isPrimary=");
		msg.append(isPrimary);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsStatusException(msg.toString());
	}

	/**
	 * Returns the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByC_P_Last(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator) {
		int count = countByC_P(companyId, isPrimary);

		if (count == 0) {
			return null;
		}

		List<VcmsStatus> list = findByC_P(companyId, isPrimary, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param statusId the primary key of the current vcms status
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus[] findByC_P_PrevAndNext(long statusId, long companyId,
		boolean isPrimary, OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByPrimaryKey(statusId);

		Session session = null;

		try {
			session = openSession();

			VcmsStatus[] array = new VcmsStatusImpl[3];

			array[0] = getByC_P_PrevAndNext(session, vcmsStatus, companyId,
					isPrimary, orderByComparator, true);

			array[1] = vcmsStatus;

			array[2] = getByC_P_PrevAndNext(session, vcmsStatus, companyId,
					isPrimary, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsStatus getByC_P_PrevAndNext(Session session,
		VcmsStatus vcmsStatus, long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

		query.append(_FINDER_COLUMN_C_P_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_P_ISPRIMARY_2);

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
			query.append(VcmsStatusModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(isPrimary);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsStatus);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsStatus> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms statuses where companyId = &#63; and isPrimary = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 */
	@Override
	public void removeByC_P(long companyId, boolean isPrimary) {
		for (VcmsStatus vcmsStatus : findByC_P(companyId, isPrimary,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses where companyId = &#63; and isPrimary = &#63;.
	 *
	 * @param companyId the company ID
	 * @param isPrimary the is primary
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByC_P(long companyId, boolean isPrimary) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_P;

		Object[] finderArgs = new Object[] { companyId, isPrimary };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_C_P_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_P_ISPRIMARY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(isPrimary);

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

	private static final String _FINDER_COLUMN_C_P_COMPANYID_2 = "vcmsStatus.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_P_ISPRIMARY_2 = "vcmsStatus.isPrimary = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_POS = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, VcmsStatusImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_Pos",
			new String[] { Long.class.getName(), Integer.class.getName() },
			VcmsStatusModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsStatusModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_POS = new FinderPath(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_Pos",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns the vcms status where groupId = &#63; and position = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @return the matching vcms status
	 * @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus findByG_Pos(long groupId, int position)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByG_Pos(groupId, position);

		if (vcmsStatus == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", position=");
			msg.append(position);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsStatusException(msg.toString());
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status where groupId = &#63; and position = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByG_Pos(long groupId, int position) {
		return fetchByG_Pos(groupId, position, true);
	}

	/**
	 * Returns the vcms status where groupId = &#63; and position = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	 */
	@Override
	public VcmsStatus fetchByG_Pos(long groupId, int position,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, position };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_POS,
					finderArgs, this);
		}

		if (result instanceof VcmsStatus) {
			VcmsStatus vcmsStatus = (VcmsStatus)result;

			if ((groupId != vcmsStatus.getGroupId()) ||
					(position != vcmsStatus.getPosition())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_G_POS_GROUPID_2);

			query.append(_FINDER_COLUMN_G_POS_POSITION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(position);

				List<VcmsStatus> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_POS,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsStatusPersistenceImpl.fetchByG_Pos(long, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsStatus vcmsStatus = list.get(0);

					result = vcmsStatus;

					cacheResult(vcmsStatus);

					if ((vcmsStatus.getGroupId() != groupId) ||
							(vcmsStatus.getPosition() != position)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_POS,
							finderArgs, vcmsStatus);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_POS, finderArgs);

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
			return (VcmsStatus)result;
		}
	}

	/**
	 * Removes the vcms status where groupId = &#63; and position = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @return the vcms status that was removed
	 */
	@Override
	public VcmsStatus removeByG_Pos(long groupId, int position)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = findByG_Pos(groupId, position);

		return remove(vcmsStatus);
	}

	/**
	 * Returns the number of vcms statuses where groupId = &#63; and position = &#63;.
	 *
	 * @param groupId the group ID
	 * @param position the position
	 * @return the number of matching vcms statuses
	 */
	@Override
	public int countByG_Pos(long groupId, int position) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_POS;

		Object[] finderArgs = new Object[] { groupId, position };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSSTATUS_WHERE);

			query.append(_FINDER_COLUMN_G_POS_GROUPID_2);

			query.append(_FINDER_COLUMN_G_POS_POSITION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(position);

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

	private static final String _FINDER_COLUMN_G_POS_GROUPID_2 = "vcmsStatus.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_POS_POSITION_2 = "vcmsStatus.position = ?";

	public VcmsStatusPersistenceImpl() {
		setModelClass(VcmsStatus.class);
	}

	/**
	 * Caches the vcms status in the entity cache if it is enabled.
	 *
	 * @param vcmsStatus the vcms status
	 */
	@Override
	public void cacheResult(VcmsStatus vcmsStatus) {
		entityCache.putResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusImpl.class, vcmsStatus.getPrimaryKey(), vcmsStatus);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_A,
			new Object[] {
				vcmsStatus.getCompanyId(), vcmsStatus.getGroupId(),
				vcmsStatus.getActive()
			}, vcmsStatus);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P_A,
			new Object[] {
				vcmsStatus.getCompanyId(), vcmsStatus.getGroupId(),
				vcmsStatus.getIsPrimary(), vcmsStatus.getActive()
			}, vcmsStatus);

		finderCache.putResult(FINDER_PATH_FETCH_BY_A,
			new Object[] { vcmsStatus.getActive() }, vcmsStatus);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P,
			new Object[] {
				vcmsStatus.getCompanyId(), vcmsStatus.getGroupId(),
				vcmsStatus.getIsPrimary()
			}, vcmsStatus);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_POS,
			new Object[] { vcmsStatus.getGroupId(), vcmsStatus.getPosition() },
			vcmsStatus);

		vcmsStatus.resetOriginalValues();
	}

	/**
	 * Caches the vcms statuses in the entity cache if it is enabled.
	 *
	 * @param vcmsStatuses the vcms statuses
	 */
	@Override
	public void cacheResult(List<VcmsStatus> vcmsStatuses) {
		for (VcmsStatus vcmsStatus : vcmsStatuses) {
			if (entityCache.getResult(
						VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
						VcmsStatusImpl.class, vcmsStatus.getPrimaryKey()) == null) {
				cacheResult(vcmsStatus);
			}
			else {
				vcmsStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms statuses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsStatusImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms status.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsStatus vcmsStatus) {
		entityCache.removeResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusImpl.class, vcmsStatus.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VcmsStatusModelImpl)vcmsStatus);
	}

	@Override
	public void clearCache(List<VcmsStatus> vcmsStatuses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsStatus vcmsStatus : vcmsStatuses) {
			entityCache.removeResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
				VcmsStatusImpl.class, vcmsStatus.getPrimaryKey());

			clearUniqueFindersCache((VcmsStatusModelImpl)vcmsStatus);
		}
	}

	protected void cacheUniqueFindersCache(
		VcmsStatusModelImpl vcmsStatusModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vcmsStatusModelImpl.getCompanyId(),
					vcmsStatusModelImpl.getGroupId(),
					vcmsStatusModelImpl.getActive()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_G_A, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_A, args,
				vcmsStatusModelImpl);

			args = new Object[] {
					vcmsStatusModelImpl.getCompanyId(),
					vcmsStatusModelImpl.getGroupId(),
					vcmsStatusModelImpl.getIsPrimary(),
					vcmsStatusModelImpl.getActive()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_G_P_A, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P_A, args,
				vcmsStatusModelImpl);

			args = new Object[] { vcmsStatusModelImpl.getActive() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_A, args, Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_A, args,
				vcmsStatusModelImpl);

			args = new Object[] {
					vcmsStatusModelImpl.getCompanyId(),
					vcmsStatusModelImpl.getGroupId(),
					vcmsStatusModelImpl.getIsPrimary()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_C_G_P, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P, args,
				vcmsStatusModelImpl);

			args = new Object[] {
					vcmsStatusModelImpl.getGroupId(),
					vcmsStatusModelImpl.getPosition()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_POS, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_POS, args,
				vcmsStatusModelImpl);
		}
		else {
			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_G_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getCompanyId(),
						vcmsStatusModelImpl.getGroupId(),
						vcmsStatusModelImpl.getActive()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_G_A, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_A, args,
					vcmsStatusModelImpl);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_G_P_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getCompanyId(),
						vcmsStatusModelImpl.getGroupId(),
						vcmsStatusModelImpl.getIsPrimary(),
						vcmsStatusModelImpl.getActive()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_G_P_A, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P_A, args,
					vcmsStatusModelImpl);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { vcmsStatusModelImpl.getActive() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_A, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_A, args,
					vcmsStatusModelImpl);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_G_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getCompanyId(),
						vcmsStatusModelImpl.getGroupId(),
						vcmsStatusModelImpl.getIsPrimary()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_C_G_P, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_C_G_P, args,
					vcmsStatusModelImpl);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_POS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getGroupId(),
						vcmsStatusModelImpl.getPosition()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_POS, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_POS, args,
					vcmsStatusModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VcmsStatusModelImpl vcmsStatusModelImpl) {
		Object[] args = new Object[] {
				vcmsStatusModelImpl.getCompanyId(),
				vcmsStatusModelImpl.getGroupId(),
				vcmsStatusModelImpl.getActive()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G_A, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_A, args);

		if ((vcmsStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_G_A.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsStatusModelImpl.getOriginalCompanyId(),
					vcmsStatusModelImpl.getOriginalGroupId(),
					vcmsStatusModelImpl.getOriginalActive()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G_A, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_A, args);
		}

		args = new Object[] {
				vcmsStatusModelImpl.getCompanyId(),
				vcmsStatusModelImpl.getGroupId(),
				vcmsStatusModelImpl.getIsPrimary(),
				vcmsStatusModelImpl.getActive()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G_P_A, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_P_A, args);

		if ((vcmsStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_G_P_A.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsStatusModelImpl.getOriginalCompanyId(),
					vcmsStatusModelImpl.getOriginalGroupId(),
					vcmsStatusModelImpl.getOriginalIsPrimary(),
					vcmsStatusModelImpl.getOriginalActive()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G_P_A, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_P_A, args);
		}

		args = new Object[] { vcmsStatusModelImpl.getActive() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_A, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_A, args);

		if ((vcmsStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_A.getColumnBitmask()) != 0) {
			args = new Object[] { vcmsStatusModelImpl.getOriginalActive() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_A, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_A, args);
		}

		args = new Object[] {
				vcmsStatusModelImpl.getCompanyId(),
				vcmsStatusModelImpl.getGroupId(),
				vcmsStatusModelImpl.getIsPrimary()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G_P, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_P, args);

		if ((vcmsStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_G_P.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsStatusModelImpl.getOriginalCompanyId(),
					vcmsStatusModelImpl.getOriginalGroupId(),
					vcmsStatusModelImpl.getOriginalIsPrimary()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G_P, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_G_P, args);
		}

		args = new Object[] {
				vcmsStatusModelImpl.getGroupId(),
				vcmsStatusModelImpl.getPosition()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_POS, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_POS, args);

		if ((vcmsStatusModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_POS.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsStatusModelImpl.getOriginalGroupId(),
					vcmsStatusModelImpl.getOriginalPosition()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_POS, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_POS, args);
		}
	}

	/**
	 * Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	 *
	 * @param statusId the primary key for the new vcms status
	 * @return the new vcms status
	 */
	@Override
	public VcmsStatus create(long statusId) {
		VcmsStatus vcmsStatus = new VcmsStatusImpl();

		vcmsStatus.setNew(true);
		vcmsStatus.setPrimaryKey(statusId);

		vcmsStatus.setCompanyId(companyProvider.getCompanyId());

		return vcmsStatus;
	}

	/**
	 * Removes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statusId the primary key of the vcms status
	 * @return the vcms status that was removed
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus remove(long statusId) throws NoSuchVcmsStatusException {
		return remove((Serializable)statusId);
	}

	/**
	 * Removes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms status
	 * @return the vcms status that was removed
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus remove(Serializable primaryKey)
		throws NoSuchVcmsStatusException {
		Session session = null;

		try {
			session = openSession();

			VcmsStatus vcmsStatus = (VcmsStatus)session.get(VcmsStatusImpl.class,
					primaryKey);

			if (vcmsStatus == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsStatus);
		}
		catch (NoSuchVcmsStatusException nsee) {
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
	protected VcmsStatus removeImpl(VcmsStatus vcmsStatus) {
		vcmsStatus = toUnwrappedModel(vcmsStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsStatus)) {
				vcmsStatus = (VcmsStatus)session.get(VcmsStatusImpl.class,
						vcmsStatus.getPrimaryKeyObj());
			}

			if (vcmsStatus != null) {
				session.delete(vcmsStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsStatus != null) {
			clearCache(vcmsStatus);
		}

		return vcmsStatus;
	}

	@Override
	public VcmsStatus updateImpl(VcmsStatus vcmsStatus) {
		vcmsStatus = toUnwrappedModel(vcmsStatus);

		boolean isNew = vcmsStatus.isNew();

		VcmsStatusModelImpl vcmsStatusModelImpl = (VcmsStatusModelImpl)vcmsStatus;

		Session session = null;

		try {
			session = openSession();

			if (vcmsStatus.isNew()) {
				session.save(vcmsStatus);

				vcmsStatus.setNew(false);
			}
			else {
				vcmsStatus = (VcmsStatus)session.merge(vcmsStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsStatusModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { vcmsStatusModelImpl.getCompanyId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getOriginalCompanyId(),
						vcmsStatusModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						vcmsStatusModelImpl.getCompanyId(),
						vcmsStatusModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getOriginalGroupId(),
						vcmsStatusModelImpl.getOriginalPosition()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P,
					args);

				args = new Object[] {
						vcmsStatusModelImpl.getGroupId(),
						vcmsStatusModelImpl.getPosition()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P,
					args);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vcmsStatusModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getOriginalCompanyId(),
						vcmsStatusModelImpl.getOriginalActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A,
					args);

				args = new Object[] {
						vcmsStatusModelImpl.getCompanyId(),
						vcmsStatusModelImpl.getActive()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_A,
					args);
			}

			if ((vcmsStatusModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsStatusModelImpl.getOriginalCompanyId(),
						vcmsStatusModelImpl.getOriginalIsPrimary()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P,
					args);

				args = new Object[] {
						vcmsStatusModelImpl.getCompanyId(),
						vcmsStatusModelImpl.getIsPrimary()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_P,
					args);
			}
		}

		entityCache.putResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
			VcmsStatusImpl.class, vcmsStatus.getPrimaryKey(), vcmsStatus, false);

		clearUniqueFindersCache(vcmsStatusModelImpl);
		cacheUniqueFindersCache(vcmsStatusModelImpl, isNew);

		vcmsStatus.resetOriginalValues();

		return vcmsStatus;
	}

	protected VcmsStatus toUnwrappedModel(VcmsStatus vcmsStatus) {
		if (vcmsStatus instanceof VcmsStatusImpl) {
			return vcmsStatus;
		}

		VcmsStatusImpl vcmsStatusImpl = new VcmsStatusImpl();

		vcmsStatusImpl.setNew(vcmsStatus.isNew());
		vcmsStatusImpl.setPrimaryKey(vcmsStatus.getPrimaryKey());

		vcmsStatusImpl.setStatusId(vcmsStatus.getStatusId());
		vcmsStatusImpl.setCompanyId(vcmsStatus.getCompanyId());
		vcmsStatusImpl.setGroupId(vcmsStatus.getGroupId());
		vcmsStatusImpl.setCreatedDate(vcmsStatus.getCreatedDate());
		vcmsStatusImpl.setCreatedByUser(vcmsStatus.getCreatedByUser());
		vcmsStatusImpl.setModifiedDate(vcmsStatus.getModifiedDate());
		vcmsStatusImpl.setModifiedByUser(vcmsStatus.getModifiedByUser());
		vcmsStatusImpl.setName(vcmsStatus.getName());
		vcmsStatusImpl.setDescription(vcmsStatus.getDescription());
		vcmsStatusImpl.setCssClass(vcmsStatus.getCssClass());
		vcmsStatusImpl.setTextColor(vcmsStatus.getTextColor());
		vcmsStatusImpl.setPosition(vcmsStatus.getPosition());
		vcmsStatusImpl.setIsPrimary(vcmsStatus.isIsPrimary());
		vcmsStatusImpl.setActive(vcmsStatus.isActive());

		return vcmsStatusImpl;
	}

	/**
	 * Returns the vcms status with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms status
	 * @return the vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsStatusException {
		VcmsStatus vcmsStatus = fetchByPrimaryKey(primaryKey);

		if (vcmsStatus == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status with the primary key or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	 *
	 * @param statusId the primary key of the vcms status
	 * @return the vcms status
	 * @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus findByPrimaryKey(long statusId)
		throws NoSuchVcmsStatusException {
		return findByPrimaryKey((Serializable)statusId);
	}

	/**
	 * Returns the vcms status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms status
	 * @return the vcms status, or <code>null</code> if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
				VcmsStatusImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsStatus vcmsStatus = (VcmsStatus)serializable;

		if (vcmsStatus == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsStatus = (VcmsStatus)session.get(VcmsStatusImpl.class,
						primaryKey);

				if (vcmsStatus != null) {
					cacheResult(vcmsStatus);
				}
				else {
					entityCache.putResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
						VcmsStatusImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
					VcmsStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsStatus;
	}

	/**
	 * Returns the vcms status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statusId the primary key of the vcms status
	 * @return the vcms status, or <code>null</code> if a vcms status with the primary key could not be found
	 */
	@Override
	public VcmsStatus fetchByPrimaryKey(long statusId) {
		return fetchByPrimaryKey((Serializable)statusId);
	}

	@Override
	public Map<Serializable, VcmsStatus> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsStatus> map = new HashMap<Serializable, VcmsStatus>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsStatus vcmsStatus = fetchByPrimaryKey(primaryKey);

			if (vcmsStatus != null) {
				map.put(primaryKey, vcmsStatus);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
					VcmsStatusImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsStatus)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VCMSSTATUS_WHERE_PKS_IN);

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

			for (VcmsStatus vcmsStatus : (List<VcmsStatus>)q.list()) {
				map.put(vcmsStatus.getPrimaryKeyObj(), vcmsStatus);

				cacheResult(vcmsStatus);

				uncachedPrimaryKeys.remove(vcmsStatus.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsStatusModelImpl.ENTITY_CACHE_ENABLED,
					VcmsStatusImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms statuses.
	 *
	 * @return the vcms statuses
	 */
	@Override
	public List<VcmsStatus> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @return the range of vcms statuses
	 */
	@Override
	public List<VcmsStatus> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms statuses
	 */
	@Override
	public List<VcmsStatus> findAll(int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms statuses
	 * @param end the upper bound of the range of vcms statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms statuses
	 */
	@Override
	public List<VcmsStatus> findAll(int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator,
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

		List<VcmsStatus> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsStatus>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSSTATUS;

				if (pagination) {
					sql = sql.concat(VcmsStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsStatus>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms statuses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsStatus vcmsStatus : findAll()) {
			remove(vcmsStatus);
		}
	}

	/**
	 * Returns the number of vcms statuses.
	 *
	 * @return the number of vcms statuses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSSTATUS);

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
		return VcmsStatusModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms status persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsStatusImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSSTATUS = "SELECT vcmsStatus FROM VcmsStatus vcmsStatus";
	private static final String _SQL_SELECT_VCMSSTATUS_WHERE_PKS_IN = "SELECT vcmsStatus FROM VcmsStatus vcmsStatus WHERE statusId IN (";
	private static final String _SQL_SELECT_VCMSSTATUS_WHERE = "SELECT vcmsStatus FROM VcmsStatus vcmsStatus WHERE ";
	private static final String _SQL_COUNT_VCMSSTATUS = "SELECT COUNT(vcmsStatus) FROM VcmsStatus vcmsStatus";
	private static final String _SQL_COUNT_VCMSSTATUS_WHERE = "SELECT COUNT(vcmsStatus) FROM VcmsStatus vcmsStatus WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsStatus exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsStatus exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsStatusPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"active"
			});
}