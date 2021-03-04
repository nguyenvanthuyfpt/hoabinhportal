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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVLegalSignerException;
import vn.gov.hoabinh.model.VLegalSigner;
import vn.gov.hoabinh.model.impl.VLegalSignerImpl;
import vn.gov.hoabinh.model.impl.VLegalSignerModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalSignerPersistence;

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
 * The persistence implementation for the v legal signer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSignerPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalSignerUtil
 * @generated
 */
@ProviderType
public class VLegalSignerPersistenceImpl extends BasePersistenceImpl<VLegalSigner>
	implements VLegalSignerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalSignerUtil} to access the v legal signer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalSignerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalSignerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSignerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal signers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal signers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @return the range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal signers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal signers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator,
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

		List<VLegalSigner> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSigner>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSigner vLegalSigner : list) {
					if ((groupId != vLegalSigner.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal signer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByGroupId_First(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalSigner != null) {
			return vLegalSigner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSignerException(msg.toString());
	}

	/**
	 * Returns the first v legal signer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator) {
		List<VLegalSigner> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal signer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByGroupId_Last(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (vLegalSigner != null) {
			return vLegalSigner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSignerException(msg.toString());
	}

	/**
	 * Returns the last v legal signer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalSigner> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalSigner> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63;.
	 *
	 * @param sigId the primary key of the current v legal signer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal signer
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner[] findByGroupId_PrevAndNext(String sigId, long groupId,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = findByPrimaryKey(sigId);

		Session session = null;

		try {
			session = openSession();

			VLegalSigner[] array = new VLegalSignerImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalSigner, groupId,
					orderByComparator, true);

			array[1] = vLegalSigner;

			array[2] = getByGroupId_PrevAndNext(session, vLegalSigner, groupId,
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

	protected VLegalSigner getByGroupId_PrevAndNext(Session session,
		VLegalSigner vLegalSigner, long groupId,
		OrderByComparator<VLegalSigner> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

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
			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal signers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalSigner vLegalSigner : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Returns the number of v legal signers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal signers
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalSigner.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_S",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalSignerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSignerModelImpl.SIGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the v legal signer where groupId = &#63; and sigId = &#63; or throws a {@link NoSuchVLegalSignerException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param sigId the sig ID
	 * @return the matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByG_S(long groupId, String sigId)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByG_S(groupId, sigId);

		if (vLegalSigner == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", sigId=");
			msg.append(sigId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVLegalSignerException(msg.toString());
		}

		return vLegalSigner;
	}

	/**
	 * Returns the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param sigId the sig ID
	 * @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByG_S(long groupId, String sigId) {
		return fetchByG_S(groupId, sigId, true);
	}

	/**
	 * Returns the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param sigId the sig ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByG_S(long groupId, String sigId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, sigId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_S,
					finderArgs, this);
		}

		if (result instanceof VLegalSigner) {
			VLegalSigner vLegalSigner = (VLegalSigner)result;

			if ((groupId != vLegalSigner.getGroupId()) ||
					!Objects.equals(sigId, vLegalSigner.getSigId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			boolean bindSigId = false;

			if (sigId == null) {
				query.append(_FINDER_COLUMN_G_S_SIGID_1);
			}
			else if (sigId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_SIGID_3);
			}
			else {
				bindSigId = true;

				query.append(_FINDER_COLUMN_G_S_SIGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindSigId) {
					qPos.add(sigId);
				}

				List<VLegalSigner> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_S, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VLegalSignerPersistenceImpl.fetchByG_S(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VLegalSigner vLegalSigner = list.get(0);

					result = vLegalSigner;

					cacheResult(vLegalSigner);

					if ((vLegalSigner.getGroupId() != groupId) ||
							(vLegalSigner.getSigId() == null) ||
							!vLegalSigner.getSigId().equals(sigId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_S,
							finderArgs, vLegalSigner);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_S, finderArgs);

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
			return (VLegalSigner)result;
		}
	}

	/**
	 * Removes the v legal signer where groupId = &#63; and sigId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param sigId the sig ID
	 * @return the v legal signer that was removed
	 */
	@Override
	public VLegalSigner removeByG_S(long groupId, String sigId)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = findByG_S(groupId, sigId);

		return remove(vLegalSigner);
	}

	/**
	 * Returns the number of v legal signers where groupId = &#63; and sigId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param sigId the sig ID
	 * @return the number of matching v legal signers
	 */
	@Override
	public int countByG_S(long groupId, String sigId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, sigId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			boolean bindSigId = false;

			if (sigId == null) {
				query.append(_FINDER_COLUMN_G_S_SIGID_1);
			}
			else if (sigId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_S_SIGID_3);
			}
			else {
				bindSigId = true;

				query.append(_FINDER_COLUMN_G_S_SIGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindSigId) {
					qPos.add(sigId);
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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "vLegalSigner.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_SIGID_1 = "vLegalSigner.sigId IS NULL";
	private static final String _FINDER_COLUMN_G_S_SIGID_2 = "vLegalSigner.sigId = ?";
	private static final String _FINDER_COLUMN_G_S_SIGID_3 = "(vLegalSigner.sigId IS NULL OR vLegalSigner.sigId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUP_LANG =
		new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroup_Lang",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUP_LANG =
		new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroup_Lang",
			new String[] { Long.class.getName(), String.class.getName() },
			VLegalSignerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSignerModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalSignerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUP_LANG = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroup_Lang",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language) {
		return findByGroup_Lang(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @return the range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language,
		int start, int end) {
		return findByGroup_Lang(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language,
		int start, int end, OrderByComparator<VLegalSigner> orderByComparator) {
		return findByGroup_Lang(groupId, language, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language,
		int start, int end, OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUP_LANG;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUP_LANG;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VLegalSigner> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSigner>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSigner vLegalSigner : list) {
					if ((groupId != vLegalSigner.getGroupId()) ||
							!Objects.equals(language, vLegalSigner.getLanguage())) {
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

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_GROUP_LANG_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByGroup_Lang_First(long groupId, String language,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByGroup_Lang_First(groupId, language,
				orderByComparator);

		if (vLegalSigner != null) {
			return vLegalSigner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSignerException(msg.toString());
	}

	/**
	 * Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByGroup_Lang_First(long groupId, String language,
		OrderByComparator<VLegalSigner> orderByComparator) {
		List<VLegalSigner> list = findByGroup_Lang(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByGroup_Lang_Last(long groupId, String language,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByGroup_Lang_Last(groupId, language,
				orderByComparator);

		if (vLegalSigner != null) {
			return vLegalSigner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSignerException(msg.toString());
	}

	/**
	 * Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByGroup_Lang_Last(long groupId, String language,
		OrderByComparator<VLegalSigner> orderByComparator) {
		int count = countByGroup_Lang(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VLegalSigner> list = findByGroup_Lang(groupId, language,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param sigId the primary key of the current v legal signer
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal signer
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner[] findByGroup_Lang_PrevAndNext(String sigId,
		long groupId, String language,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = findByPrimaryKey(sigId);

		Session session = null;

		try {
			session = openSession();

			VLegalSigner[] array = new VLegalSignerImpl[3];

			array[0] = getByGroup_Lang_PrevAndNext(session, vLegalSigner,
					groupId, language, orderByComparator, true);

			array[1] = vLegalSigner;

			array[2] = getByGroup_Lang_PrevAndNext(session, vLegalSigner,
					groupId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSigner getByGroup_Lang_PrevAndNext(Session session,
		VLegalSigner vLegalSigner, long groupId, String language,
		OrderByComparator<VLegalSigner> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

		query.append(_FINDER_COLUMN_GROUP_LANG_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_2);
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
			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal signers where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByGroup_Lang(long groupId, String language) {
		for (VLegalSigner vLegalSigner : findByGroup_Lang(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Returns the number of v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching v legal signers
	 */
	@Override
	public int countByGroup_Lang(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUP_LANG;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_GROUP_LANG_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_2);
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

	private static final String _FINDER_COLUMN_GROUP_LANG_GROUPID_2 = "vLegalSigner.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP_LANG_LANGUAGE_1 = "vLegalSigner.language IS NULL";
	private static final String _FINDER_COLUMN_GROUP_LANG_LANGUAGE_2 = "vLegalSigner.language = ?";
	private static final String _FINDER_COLUMN_GROUP_LANG_LANGUAGE_3 = "(vLegalSigner.language IS NULL OR vLegalSigner.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, VLegalSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VLegalSignerModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalSignerModelImpl.LANGUAGE_COLUMN_BITMASK |
			VLegalSignerModelImpl.STATUSSIGNER_COLUMN_BITMASK |
			VLegalSignerModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @return the matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner) {
		return findByG_L_S(groupId, language, statusSigner, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @return the range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner, int start, int end) {
		return findByG_L_S(groupId, language, statusSigner, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return findByG_L_S(groupId, language, statusSigner, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal signers
	 */
	@Override
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner, int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S;
			finderArgs = new Object[] { groupId, language, statusSigner };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S;
			finderArgs = new Object[] {
					groupId, language, statusSigner,
					
					start, end, orderByComparator
				};
		}

		List<VLegalSigner> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSigner>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalSigner vLegalSigner : list) {
					if ((groupId != vLegalSigner.getGroupId()) ||
							!Objects.equals(language, vLegalSigner.getLanguage()) ||
							(statusSigner != vLegalSigner.getStatusSigner())) {
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

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSSIGNER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusSigner);

				if (!pagination) {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByG_L_S_First(long groupId, String language,
		boolean statusSigner, OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByG_L_S_First(groupId, language,
				statusSigner, orderByComparator);

		if (vLegalSigner != null) {
			return vLegalSigner;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusSigner=");
		msg.append(statusSigner);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSignerException(msg.toString());
	}

	/**
	 * Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByG_L_S_First(long groupId, String language,
		boolean statusSigner, OrderByComparator<VLegalSigner> orderByComparator) {
		List<VLegalSigner> list = findByG_L_S(groupId, language, statusSigner,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal signer
	 * @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner findByG_L_S_Last(long groupId, String language,
		boolean statusSigner, OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByG_L_S_Last(groupId, language,
				statusSigner, orderByComparator);

		if (vLegalSigner != null) {
			return vLegalSigner;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusSigner=");
		msg.append(statusSigner);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalSignerException(msg.toString());
	}

	/**
	 * Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 */
	@Override
	public VLegalSigner fetchByG_L_S_Last(long groupId, String language,
		boolean statusSigner, OrderByComparator<VLegalSigner> orderByComparator) {
		int count = countByG_L_S(groupId, language, statusSigner);

		if (count == 0) {
			return null;
		}

		List<VLegalSigner> list = findByG_L_S(groupId, language, statusSigner,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param sigId the primary key of the current v legal signer
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal signer
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner[] findByG_L_S_PrevAndNext(String sigId, long groupId,
		String language, boolean statusSigner,
		OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = findByPrimaryKey(sigId);

		Session session = null;

		try {
			session = openSession();

			VLegalSigner[] array = new VLegalSignerImpl[3];

			array[0] = getByG_L_S_PrevAndNext(session, vLegalSigner, groupId,
					language, statusSigner, orderByComparator, true);

			array[1] = vLegalSigner;

			array[2] = getByG_L_S_PrevAndNext(session, vLegalSigner, groupId,
					language, statusSigner, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSigner getByG_L_S_PrevAndNext(Session session,
		VLegalSigner vLegalSigner, long groupId, String language,
		boolean statusSigner,
		OrderByComparator<VLegalSigner> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_STATUSSIGNER_2);

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
			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusSigner);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 */
	@Override
	public void removeByG_L_S(long groupId, String language,
		boolean statusSigner) {
		for (VLegalSigner vLegalSigner : findByG_L_S(groupId, language,
				statusSigner, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Returns the number of v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusSigner the status signer
	 * @return the number of matching v legal signers
	 */
	@Override
	public int countByG_L_S(long groupId, String language, boolean statusSigner) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S;

		Object[] finderArgs = new Object[] { groupId, language, statusSigner };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSSIGNER_2);

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

				qPos.add(statusSigner);

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

	private static final String _FINDER_COLUMN_G_L_S_GROUPID_2 = "vLegalSigner.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_1 = "vLegalSigner.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_2 = "vLegalSigner.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_3 = "(vLegalSigner.language IS NULL OR vLegalSigner.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_STATUSSIGNER_2 = "vLegalSigner.statusSigner = ?";

	public VLegalSignerPersistenceImpl() {
		setModelClass(VLegalSigner.class);
	}

	/**
	 * Caches the v legal signer in the entity cache if it is enabled.
	 *
	 * @param vLegalSigner the v legal signer
	 */
	@Override
	public void cacheResult(VLegalSigner vLegalSigner) {
		entityCache.putResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey(), vLegalSigner);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] { vLegalSigner.getGroupId(), vLegalSigner.getSigId() },
			vLegalSigner);

		vLegalSigner.resetOriginalValues();
	}

	/**
	 * Caches the v legal signers in the entity cache if it is enabled.
	 *
	 * @param vLegalSigners the v legal signers
	 */
	@Override
	public void cacheResult(List<VLegalSigner> vLegalSigners) {
		for (VLegalSigner vLegalSigner : vLegalSigners) {
			if (entityCache.getResult(
						VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
						VLegalSignerImpl.class, vLegalSigner.getPrimaryKey()) == null) {
				cacheResult(vLegalSigner);
			}
			else {
				vLegalSigner.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal signers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalSignerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal signer.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalSigner vLegalSigner) {
		entityCache.removeResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VLegalSignerModelImpl)vLegalSigner);
	}

	@Override
	public void clearCache(List<VLegalSigner> vLegalSigners) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalSigner vLegalSigner : vLegalSigners) {
			entityCache.removeResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
				VLegalSignerImpl.class, vLegalSigner.getPrimaryKey());

			clearUniqueFindersCache((VLegalSignerModelImpl)vLegalSigner);
		}
	}

	protected void cacheUniqueFindersCache(
		VLegalSignerModelImpl vLegalSignerModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vLegalSignerModelImpl.getGroupId(),
					vLegalSignerModelImpl.getSigId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_S, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_S, args,
				vLegalSignerModelImpl);
		}
		else {
			if ((vLegalSignerModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSignerModelImpl.getGroupId(),
						vLegalSignerModelImpl.getSigId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_S, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_S, args,
					vLegalSignerModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VLegalSignerModelImpl vLegalSignerModelImpl) {
		Object[] args = new Object[] {
				vLegalSignerModelImpl.getGroupId(),
				vLegalSignerModelImpl.getSigId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_S, args);

		if ((vLegalSignerModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_S.getColumnBitmask()) != 0) {
			args = new Object[] {
					vLegalSignerModelImpl.getOriginalGroupId(),
					vLegalSignerModelImpl.getOriginalSigId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_S, args);
		}
	}

	/**
	 * Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	 *
	 * @param sigId the primary key for the new v legal signer
	 * @return the new v legal signer
	 */
	@Override
	public VLegalSigner create(String sigId) {
		VLegalSigner vLegalSigner = new VLegalSignerImpl();

		vLegalSigner.setNew(true);
		vLegalSigner.setPrimaryKey(sigId);

		vLegalSigner.setCompanyId(companyProvider.getCompanyId());

		return vLegalSigner;
	}

	/**
	 * Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sigId the primary key of the v legal signer
	 * @return the v legal signer that was removed
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner remove(String sigId) throws NoSuchVLegalSignerException {
		return remove((Serializable)sigId);
	}

	/**
	 * Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal signer
	 * @return the v legal signer that was removed
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner remove(Serializable primaryKey)
		throws NoSuchVLegalSignerException {
		Session session = null;

		try {
			session = openSession();

			VLegalSigner vLegalSigner = (VLegalSigner)session.get(VLegalSignerImpl.class,
					primaryKey);

			if (vLegalSigner == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalSignerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalSigner);
		}
		catch (NoSuchVLegalSignerException nsee) {
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
	protected VLegalSigner removeImpl(VLegalSigner vLegalSigner) {
		vLegalSigner = toUnwrappedModel(vLegalSigner);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalSigner)) {
				vLegalSigner = (VLegalSigner)session.get(VLegalSignerImpl.class,
						vLegalSigner.getPrimaryKeyObj());
			}

			if (vLegalSigner != null) {
				session.delete(vLegalSigner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalSigner != null) {
			clearCache(vLegalSigner);
		}

		return vLegalSigner;
	}

	@Override
	public VLegalSigner updateImpl(VLegalSigner vLegalSigner) {
		vLegalSigner = toUnwrappedModel(vLegalSigner);

		boolean isNew = vLegalSigner.isNew();

		VLegalSignerModelImpl vLegalSignerModelImpl = (VLegalSignerModelImpl)vLegalSigner;

		Session session = null;

		try {
			session = openSession();

			if (vLegalSigner.isNew()) {
				session.save(vLegalSigner);

				vLegalSigner.setNew(false);
			}
			else {
				vLegalSigner = (VLegalSigner)session.merge(vLegalSigner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalSignerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalSignerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSignerModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalSignerModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalSignerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUP_LANG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSignerModelImpl.getOriginalGroupId(),
						vLegalSignerModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUP_LANG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUP_LANG,
					args);

				args = new Object[] {
						vLegalSignerModelImpl.getGroupId(),
						vLegalSignerModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUP_LANG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUP_LANG,
					args);
			}

			if ((vLegalSignerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalSignerModelImpl.getOriginalGroupId(),
						vLegalSignerModelImpl.getOriginalLanguage(),
						vLegalSignerModelImpl.getOriginalStatusSigner()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S,
					args);

				args = new Object[] {
						vLegalSignerModelImpl.getGroupId(),
						vLegalSignerModelImpl.getLanguage(),
						vLegalSignerModelImpl.getStatusSigner()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S,
					args);
			}
		}

		entityCache.putResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey(), vLegalSigner,
			false);

		clearUniqueFindersCache(vLegalSignerModelImpl);
		cacheUniqueFindersCache(vLegalSignerModelImpl, isNew);

		vLegalSigner.resetOriginalValues();

		return vLegalSigner;
	}

	protected VLegalSigner toUnwrappedModel(VLegalSigner vLegalSigner) {
		if (vLegalSigner instanceof VLegalSignerImpl) {
			return vLegalSigner;
		}

		VLegalSignerImpl vLegalSignerImpl = new VLegalSignerImpl();

		vLegalSignerImpl.setNew(vLegalSigner.isNew());
		vLegalSignerImpl.setPrimaryKey(vLegalSigner.getPrimaryKey());

		vLegalSignerImpl.setSigId(vLegalSigner.getSigId());
		vLegalSignerImpl.setGroupId(vLegalSigner.getGroupId());
		vLegalSignerImpl.setCompanyId(vLegalSigner.getCompanyId());
		vLegalSignerImpl.setUserId(vLegalSigner.getUserId());
		vLegalSignerImpl.setCreatedDate(vLegalSigner.getCreatedDate());
		vLegalSignerImpl.setModifiedDate(vLegalSigner.getModifiedDate());
		vLegalSignerImpl.setCreatedByUser(vLegalSigner.getCreatedByUser());
		vLegalSignerImpl.setModifiedByUser(vLegalSigner.getModifiedByUser());
		vLegalSignerImpl.setFirstName(vLegalSigner.getFirstName());
		vLegalSignerImpl.setLastName(vLegalSigner.getLastName());
		vLegalSignerImpl.setLanguage(vLegalSigner.getLanguage());
		vLegalSignerImpl.setStatusSigner(vLegalSigner.isStatusSigner());

		return vLegalSignerImpl;
	}

	/**
	 * Returns the v legal signer with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal signer
	 * @return the v legal signer
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalSignerException {
		VLegalSigner vLegalSigner = fetchByPrimaryKey(primaryKey);

		if (vLegalSigner == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalSignerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalSigner;
	}

	/**
	 * Returns the v legal signer with the primary key or throws a {@link NoSuchVLegalSignerException} if it could not be found.
	 *
	 * @param sigId the primary key of the v legal signer
	 * @return the v legal signer
	 * @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner findByPrimaryKey(String sigId)
		throws NoSuchVLegalSignerException {
		return findByPrimaryKey((Serializable)sigId);
	}

	/**
	 * Returns the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal signer
	 * @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
				VLegalSignerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalSigner vLegalSigner = (VLegalSigner)serializable;

		if (vLegalSigner == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalSigner = (VLegalSigner)session.get(VLegalSignerImpl.class,
						primaryKey);

				if (vLegalSigner != null) {
					cacheResult(vLegalSigner);
				}
				else {
					entityCache.putResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
						VLegalSignerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
					VLegalSignerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalSigner;
	}

	/**
	 * Returns the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sigId the primary key of the v legal signer
	 * @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	 */
	@Override
	public VLegalSigner fetchByPrimaryKey(String sigId) {
		return fetchByPrimaryKey((Serializable)sigId);
	}

	@Override
	public Map<Serializable, VLegalSigner> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalSigner> map = new HashMap<Serializable, VLegalSigner>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalSigner vLegalSigner = fetchByPrimaryKey(primaryKey);

			if (vLegalSigner != null) {
				map.put(primaryKey, vLegalSigner);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
					VLegalSignerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalSigner)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE_PKS_IN);

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

			for (VLegalSigner vLegalSigner : (List<VLegalSigner>)q.list()) {
				map.put(vLegalSigner.getPrimaryKeyObj(), vLegalSigner);

				cacheResult(vLegalSigner);

				uncachedPrimaryKeys.remove(vLegalSigner.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
					VLegalSignerImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal signers.
	 *
	 * @return the v legal signers
	 */
	@Override
	public List<VLegalSigner> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @return the range of v legal signers
	 */
	@Override
	public List<VLegalSigner> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal signers
	 */
	@Override
	public List<VLegalSigner> findAll(int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal signers
	 * @param end the upper bound of the range of v legal signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal signers
	 */
	@Override
	public List<VLegalSigner> findAll(int start, int end,
		OrderByComparator<VLegalSigner> orderByComparator,
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

		List<VLegalSigner> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalSigner>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALSIGNER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALSIGNER;

				if (pagination) {
					sql = sql.concat(VLegalSignerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal signers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalSigner vLegalSigner : findAll()) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Returns the number of v legal signers.
	 *
	 * @return the number of v legal signers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALSIGNER);

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
		return VLegalSignerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal signer persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalSignerImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALSIGNER = "SELECT vLegalSigner FROM VLegalSigner vLegalSigner";
	private static final String _SQL_SELECT_VLEGALSIGNER_WHERE_PKS_IN = "SELECT vLegalSigner FROM VLegalSigner vLegalSigner WHERE sigId IN (";
	private static final String _SQL_SELECT_VLEGALSIGNER_WHERE = "SELECT vLegalSigner FROM VLegalSigner vLegalSigner WHERE ";
	private static final String _SQL_COUNT_VLEGALSIGNER = "SELECT COUNT(vLegalSigner) FROM VLegalSigner vLegalSigner";
	private static final String _SQL_COUNT_VLEGALSIGNER_WHERE = "SELECT COUNT(vLegalSigner) FROM VLegalSigner vLegalSigner WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalSigner.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalSigner exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalSigner exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalSignerPersistenceImpl.class);
}