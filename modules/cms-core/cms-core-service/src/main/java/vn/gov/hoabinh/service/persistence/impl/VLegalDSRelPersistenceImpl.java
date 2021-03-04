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

import vn.gov.hoabinh.exception.NoSuchVLegalDSRelException;
import vn.gov.hoabinh.model.VLegalDSRel;
import vn.gov.hoabinh.model.impl.VLegalDSRelImpl;
import vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalDSRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDSRelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the v legal d s rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRelPersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalDSRelUtil
 * @generated
 */
@ProviderType
public class VLegalDSRelPersistenceImpl extends BasePersistenceImpl<VLegalDSRel>
	implements VLegalDSRelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalDSRelUtil} to access the v legal d s rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDSRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, VLegalDSRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, VLegalDSRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SIGNER = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, VLegalDSRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySigner",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIGNER =
		new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, VLegalDSRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySigner",
			new String[] { String.class.getName() },
			VLegalDSRelModelImpl.SIGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SIGNER = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySigner",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal d s rels where sigId = &#63;.
	 *
	 * @param sigId the sig ID
	 * @return the matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findBySigner(String sigId) {
		return findBySigner(sigId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d s rels where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sigId the sig ID
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @return the range of matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findBySigner(String sigId, int start, int end) {
		return findBySigner(sigId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d s rels where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sigId the sig ID
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findBySigner(String sigId, int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return findBySigner(sigId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d s rels where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param sigId the sig ID
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findBySigner(String sigId, int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIGNER;
			finderArgs = new Object[] { sigId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SIGNER;
			finderArgs = new Object[] { sigId, start, end, orderByComparator };
		}

		List<VLegalDSRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDSRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDSRel vLegalDSRel : list) {
					if (!Objects.equals(sigId, vLegalDSRel.getSigId())) {
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

			query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

			boolean bindSigId = false;

			if (sigId == null) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_1);
			}
			else if (sigId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_3);
			}
			else {
				bindSigId = true;

				query.append(_FINDER_COLUMN_SIGNER_SIGID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSigId) {
					qPos.add(sigId);
				}

				if (!pagination) {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * @param sigId the sig ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel findBySigner_First(String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = fetchBySigner_First(sigId, orderByComparator);

		if (vLegalDSRel != null) {
			return vLegalDSRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("sigId=");
		msg.append(sigId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDSRelException(msg.toString());
	}

	/**
	 * Returns the first v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * @param sigId the sig ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel fetchBySigner_First(String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		List<VLegalDSRel> list = findBySigner(sigId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * @param sigId the sig ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel findBySigner_Last(String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = fetchBySigner_Last(sigId, orderByComparator);

		if (vLegalDSRel != null) {
			return vLegalDSRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("sigId=");
		msg.append(sigId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDSRelException(msg.toString());
	}

	/**
	 * Returns the last v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * @param sigId the sig ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel fetchBySigner_Last(String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		int count = countBySigner(sigId);

		if (count == 0) {
			return null;
		}

		List<VLegalDSRel> list = findBySigner(sigId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d s rels before and after the current v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * @param vLegalDSRelPK the primary key of the current v legal d s rel
	 * @param sigId the sig ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel[] findBySigner_PrevAndNext(VLegalDSRelPK vLegalDSRelPK,
		String sigId, OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = findByPrimaryKey(vLegalDSRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDSRel[] array = new VLegalDSRelImpl[3];

			array[0] = getBySigner_PrevAndNext(session, vLegalDSRel, sigId,
					orderByComparator, true);

			array[1] = vLegalDSRel;

			array[2] = getBySigner_PrevAndNext(session, vLegalDSRel, sigId,
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

	protected VLegalDSRel getBySigner_PrevAndNext(Session session,
		VLegalDSRel vLegalDSRel, String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

		boolean bindSigId = false;

		if (sigId == null) {
			query.append(_FINDER_COLUMN_SIGNER_SIGID_1);
		}
		else if (sigId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SIGNER_SIGID_3);
		}
		else {
			bindSigId = true;

			query.append(_FINDER_COLUMN_SIGNER_SIGID_2);
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
			query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSigId) {
			qPos.add(sigId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDSRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDSRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d s rels where sigId = &#63; from the database.
	 *
	 * @param sigId the sig ID
	 */
	@Override
	public void removeBySigner(String sigId) {
		for (VLegalDSRel vLegalDSRel : findBySigner(sigId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDSRel);
		}
	}

	/**
	 * Returns the number of v legal d s rels where sigId = &#63;.
	 *
	 * @param sigId the sig ID
	 * @return the number of matching v legal d s rels
	 */
	@Override
	public int countBySigner(String sigId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SIGNER;

		Object[] finderArgs = new Object[] { sigId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDSREL_WHERE);

			boolean bindSigId = false;

			if (sigId == null) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_1);
			}
			else if (sigId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_3);
			}
			else {
				bindSigId = true;

				query.append(_FINDER_COLUMN_SIGNER_SIGID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_SIGNER_SIGID_1 = "vLegalDSRel.id.sigId IS NULL";
	private static final String _FINDER_COLUMN_SIGNER_SIGID_2 = "vLegalDSRel.id.sigId = ?";
	private static final String _FINDER_COLUMN_SIGNER_SIGID_3 = "(vLegalDSRel.id.sigId IS NULL OR vLegalDSRel.id.sigId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOC = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, VLegalDSRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDoc",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, VLegalDSRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDoc",
			new String[] { String.class.getName() },
			VLegalDSRelModelImpl.DOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOC = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDoc",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal d s rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findByDoc(String docId) {
		return findByDoc(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d s rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @return the range of matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findByDoc(String docId, int start, int end) {
		return findByDoc(docId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d s rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findByDoc(String docId, int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return findByDoc(docId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d s rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docId the doc ID
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findByDoc(String docId, int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator,
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

		List<VLegalDSRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDSRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalDSRel vLegalDSRel : list) {
					if (!Objects.equals(docId, vLegalDSRel.getDocId())) {
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

			query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

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
				query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel findByDoc_First(String docId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = fetchByDoc_First(docId, orderByComparator);

		if (vLegalDSRel != null) {
			return vLegalDSRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDSRelException(msg.toString());
	}

	/**
	 * Returns the first v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel fetchByDoc_First(String docId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		List<VLegalDSRel> list = findByDoc(docId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel findByDoc_Last(String docId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = fetchByDoc_Last(docId, orderByComparator);

		if (vLegalDSRel != null) {
			return vLegalDSRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docId=");
		msg.append(docId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalDSRelException(msg.toString());
	}

	/**
	 * Returns the last v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	 */
	@Override
	public VLegalDSRel fetchByDoc_Last(String docId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		int count = countByDoc(docId);

		if (count == 0) {
			return null;
		}

		List<VLegalDSRel> list = findByDoc(docId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal d s rels before and after the current v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * @param vLegalDSRelPK the primary key of the current v legal d s rel
	 * @param docId the doc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel[] findByDoc_PrevAndNext(VLegalDSRelPK vLegalDSRelPK,
		String docId, OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = findByPrimaryKey(vLegalDSRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDSRel[] array = new VLegalDSRelImpl[3];

			array[0] = getByDoc_PrevAndNext(session, vLegalDSRel, docId,
					orderByComparator, true);

			array[1] = vLegalDSRel;

			array[2] = getByDoc_PrevAndNext(session, vLegalDSRel, docId,
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

	protected VLegalDSRel getByDoc_PrevAndNext(Session session,
		VLegalDSRel vLegalDSRel, String docId,
		OrderByComparator<VLegalDSRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

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
			query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalDSRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDSRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal d s rels where docId = &#63; from the database.
	 *
	 * @param docId the doc ID
	 */
	@Override
	public void removeByDoc(String docId) {
		for (VLegalDSRel vLegalDSRel : findByDoc(docId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vLegalDSRel);
		}
	}

	/**
	 * Returns the number of v legal d s rels where docId = &#63;.
	 *
	 * @param docId the doc ID
	 * @return the number of matching v legal d s rels
	 */
	@Override
	public int countByDoc(String docId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOC;

		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDSREL_WHERE);

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

	private static final String _FINDER_COLUMN_DOC_DOCID_1 = "vLegalDSRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOC_DOCID_2 = "vLegalDSRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_3 = "(vLegalDSRel.id.docId IS NULL OR vLegalDSRel.id.docId = '')";

	public VLegalDSRelPersistenceImpl() {
		setModelClass(VLegalDSRel.class);
	}

	/**
	 * Caches the v legal d s rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDSRel the v legal d s rel
	 */
	@Override
	public void cacheResult(VLegalDSRel vLegalDSRel) {
		entityCache.putResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey(), vLegalDSRel);

		vLegalDSRel.resetOriginalValues();
	}

	/**
	 * Caches the v legal d s rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDSRels the v legal d s rels
	 */
	@Override
	public void cacheResult(List<VLegalDSRel> vLegalDSRels) {
		for (VLegalDSRel vLegalDSRel : vLegalDSRels) {
			if (entityCache.getResult(
						VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey()) == null) {
				cacheResult(vLegalDSRel);
			}
			else {
				vLegalDSRel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal d s rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalDSRelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal d s rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalDSRel vLegalDSRel) {
		entityCache.removeResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalDSRel> vLegalDSRels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalDSRel vLegalDSRel : vLegalDSRels) {
			entityCache.removeResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	 *
	 * @param vLegalDSRelPK the primary key for the new v legal d s rel
	 * @return the new v legal d s rel
	 */
	@Override
	public VLegalDSRel create(VLegalDSRelPK vLegalDSRelPK) {
		VLegalDSRel vLegalDSRel = new VLegalDSRelImpl();

		vLegalDSRel.setNew(true);
		vLegalDSRel.setPrimaryKey(vLegalDSRelPK);

		return vLegalDSRel;
	}

	/**
	 * Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDSRelPK the primary key of the v legal d s rel
	 * @return the v legal d s rel that was removed
	 * @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel remove(VLegalDSRelPK vLegalDSRelPK)
		throws NoSuchVLegalDSRelException {
		return remove((Serializable)vLegalDSRelPK);
	}

	/**
	 * Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d s rel
	 * @return the v legal d s rel that was removed
	 * @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel remove(Serializable primaryKey)
		throws NoSuchVLegalDSRelException {
		Session session = null;

		try {
			session = openSession();

			VLegalDSRel vLegalDSRel = (VLegalDSRel)session.get(VLegalDSRelImpl.class,
					primaryKey);

			if (vLegalDSRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalDSRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalDSRel);
		}
		catch (NoSuchVLegalDSRelException nsee) {
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
	protected VLegalDSRel removeImpl(VLegalDSRel vLegalDSRel) {
		vLegalDSRel = toUnwrappedModel(vLegalDSRel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalDSRel)) {
				vLegalDSRel = (VLegalDSRel)session.get(VLegalDSRelImpl.class,
						vLegalDSRel.getPrimaryKeyObj());
			}

			if (vLegalDSRel != null) {
				session.delete(vLegalDSRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalDSRel != null) {
			clearCache(vLegalDSRel);
		}

		return vLegalDSRel;
	}

	@Override
	public VLegalDSRel updateImpl(VLegalDSRel vLegalDSRel) {
		vLegalDSRel = toUnwrappedModel(vLegalDSRel);

		boolean isNew = vLegalDSRel.isNew();

		VLegalDSRelModelImpl vLegalDSRelModelImpl = (VLegalDSRelModelImpl)vLegalDSRel;

		Session session = null;

		try {
			session = openSession();

			if (vLegalDSRel.isNew()) {
				session.save(vLegalDSRel);

				vLegalDSRel.setNew(false);
			}
			else {
				vLegalDSRel = (VLegalDSRel)session.merge(vLegalDSRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalDSRelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalDSRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIGNER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDSRelModelImpl.getOriginalSigId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIGNER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIGNER,
					args);

				args = new Object[] { vLegalDSRelModelImpl.getSigId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIGNER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIGNER,
					args);
			}

			if ((vLegalDSRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalDSRelModelImpl.getOriginalDocId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC,
					args);

				args = new Object[] { vLegalDSRelModelImpl.getDocId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOC, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOC,
					args);
			}
		}

		entityCache.putResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey(), vLegalDSRel,
			false);

		vLegalDSRel.resetOriginalValues();

		return vLegalDSRel;
	}

	protected VLegalDSRel toUnwrappedModel(VLegalDSRel vLegalDSRel) {
		if (vLegalDSRel instanceof VLegalDSRelImpl) {
			return vLegalDSRel;
		}

		VLegalDSRelImpl vLegalDSRelImpl = new VLegalDSRelImpl();

		vLegalDSRelImpl.setNew(vLegalDSRel.isNew());
		vLegalDSRelImpl.setPrimaryKey(vLegalDSRel.getPrimaryKey());

		vLegalDSRelImpl.setSigId(vLegalDSRel.getSigId());
		vLegalDSRelImpl.setDocId(vLegalDSRel.getDocId());

		return vLegalDSRelImpl;
	}

	/**
	 * Returns the v legal d s rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d s rel
	 * @return the v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalDSRelException {
		VLegalDSRel vLegalDSRel = fetchByPrimaryKey(primaryKey);

		if (vLegalDSRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalDSRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalDSRel;
	}

	/**
	 * Returns the v legal d s rel with the primary key or throws a {@link NoSuchVLegalDSRelException} if it could not be found.
	 *
	 * @param vLegalDSRelPK the primary key of the v legal d s rel
	 * @return the v legal d s rel
	 * @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel findByPrimaryKey(VLegalDSRelPK vLegalDSRelPK)
		throws NoSuchVLegalDSRelException {
		return findByPrimaryKey((Serializable)vLegalDSRelPK);
	}

	/**
	 * Returns the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d s rel
	 * @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDSRelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalDSRel vLegalDSRel = (VLegalDSRel)serializable;

		if (vLegalDSRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDSRel = (VLegalDSRel)session.get(VLegalDSRelImpl.class,
						primaryKey);

				if (vLegalDSRel != null) {
					cacheResult(vLegalDSRel);
				}
				else {
					entityCache.putResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDSRelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
					VLegalDSRelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalDSRel;
	}

	/**
	 * Returns the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDSRelPK the primary key of the v legal d s rel
	 * @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	 */
	@Override
	public VLegalDSRel fetchByPrimaryKey(VLegalDSRelPK vLegalDSRelPK) {
		return fetchByPrimaryKey((Serializable)vLegalDSRelPK);
	}

	@Override
	public Map<Serializable, VLegalDSRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalDSRel> map = new HashMap<Serializable, VLegalDSRel>();

		for (Serializable primaryKey : primaryKeys) {
			VLegalDSRel vLegalDSRel = fetchByPrimaryKey(primaryKey);

			if (vLegalDSRel != null) {
				map.put(primaryKey, vLegalDSRel);
			}
		}

		return map;
	}

	/**
	 * Returns all the v legal d s rels.
	 *
	 * @return the v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal d s rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @return the range of v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal d s rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findAll(int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal d s rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d s rels
	 * @param end the upper bound of the range of v legal d s rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal d s rels
	 */
	@Override
	public List<VLegalDSRel> findAll(int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator,
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

		List<VLegalDSRel> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalDSRel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALDSREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDSREL;

				if (pagination) {
					sql = sql.concat(VLegalDSRelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d s rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalDSRel vLegalDSRel : findAll()) {
			remove(vLegalDSRel);
		}
	}

	/**
	 * Returns the number of v legal d s rels.
	 *
	 * @return the number of v legal d s rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDSREL);

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
		return VLegalDSRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal d s rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalDSRelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VLEGALDSREL = "SELECT vLegalDSRel FROM VLegalDSRel vLegalDSRel";
	private static final String _SQL_SELECT_VLEGALDSREL_WHERE = "SELECT vLegalDSRel FROM VLegalDSRel vLegalDSRel WHERE ";
	private static final String _SQL_COUNT_VLEGALDSREL = "SELECT COUNT(vLegalDSRel) FROM VLegalDSRel vLegalDSRel";
	private static final String _SQL_COUNT_VLEGALDSREL_WHERE = "SELECT COUNT(vLegalDSRel) FROM VLegalDSRel vLegalDSRel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDSRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDSRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDSRel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalDSRelPersistenceImpl.class);
}