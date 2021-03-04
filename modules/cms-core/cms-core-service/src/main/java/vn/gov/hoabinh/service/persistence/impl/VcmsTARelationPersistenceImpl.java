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

import vn.gov.hoabinh.exception.NoSuchVcmsTARelationException;
import vn.gov.hoabinh.model.VcmsTARelation;
import vn.gov.hoabinh.model.impl.VcmsTARelationImpl;
import vn.gov.hoabinh.model.impl.VcmsTARelationModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsTARelationPK;
import vn.gov.hoabinh.service.persistence.VcmsTARelationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms t a relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTARelationPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsTARelationUtil
 * @generated
 */
@ProviderType
public class VcmsTARelationPersistenceImpl extends BasePersistenceImpl<VcmsTARelation>
	implements VcmsTARelationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsTARelationUtil} to access the vcms t a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsTARelationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsTARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsTARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THREAD = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsTARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByThread",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THREAD =
		new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsTARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByThread",
			new String[] { String.class.getName() },
			VcmsTARelationModelImpl.THREADID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THREAD = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByThread",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms t a relations where threadId = &#63;.
	 *
	 * @param threadId the thread ID
	 * @return the matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByThread(String threadId) {
		return findByThread(threadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms t a relations where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param threadId the thread ID
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @return the range of matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByThread(String threadId, int start, int end) {
		return findByThread(threadId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms t a relations where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param threadId the thread ID
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByThread(String threadId, int start,
		int end, OrderByComparator<VcmsTARelation> orderByComparator) {
		return findByThread(threadId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms t a relations where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param threadId the thread ID
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByThread(String threadId, int start,
		int end, OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THREAD;
			finderArgs = new Object[] { threadId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_THREAD;
			finderArgs = new Object[] { threadId, start, end, orderByComparator };
		}

		List<VcmsTARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsTARelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsTARelation vcmsTARelation : list) {
					if (!Objects.equals(threadId, vcmsTARelation.getThreadId())) {
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

			query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

			boolean bindThreadId = false;

			if (threadId == null) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_1);
			}
			else if (threadId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_3);
			}
			else {
				bindThreadId = true;

				query.append(_FINDER_COLUMN_THREAD_THREADID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindThreadId) {
					qPos.add(threadId);
				}

				if (!pagination) {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
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
	 * Returns the first vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * @param threadId the thread ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation findByThread_First(String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = fetchByThread_First(threadId,
				orderByComparator);

		if (vcmsTARelation != null) {
			return vcmsTARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("threadId=");
		msg.append(threadId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsTARelationException(msg.toString());
	}

	/**
	 * Returns the first vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * @param threadId the thread ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation fetchByThread_First(String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		List<VcmsTARelation> list = findByThread(threadId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * @param threadId the thread ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation findByThread_Last(String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = fetchByThread_Last(threadId,
				orderByComparator);

		if (vcmsTARelation != null) {
			return vcmsTARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("threadId=");
		msg.append(threadId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsTARelationException(msg.toString());
	}

	/**
	 * Returns the last vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * @param threadId the thread ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation fetchByThread_Last(String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		int count = countByThread(threadId);

		if (count == 0) {
			return null;
		}

		List<VcmsTARelation> list = findByThread(threadId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms t a relations before and after the current vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * @param vcmsTARelationPK the primary key of the current vcms t a relation
	 * @param threadId the thread ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation[] findByThread_PrevAndNext(
		VcmsTARelationPK vcmsTARelationPK, String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = findByPrimaryKey(vcmsTARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsTARelation[] array = new VcmsTARelationImpl[3];

			array[0] = getByThread_PrevAndNext(session, vcmsTARelation,
					threadId, orderByComparator, true);

			array[1] = vcmsTARelation;

			array[2] = getByThread_PrevAndNext(session, vcmsTARelation,
					threadId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsTARelation getByThread_PrevAndNext(Session session,
		VcmsTARelation vcmsTARelation, String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

		boolean bindThreadId = false;

		if (threadId == null) {
			query.append(_FINDER_COLUMN_THREAD_THREADID_1);
		}
		else if (threadId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_THREAD_THREADID_3);
		}
		else {
			bindThreadId = true;

			query.append(_FINDER_COLUMN_THREAD_THREADID_2);
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
			query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindThreadId) {
			qPos.add(threadId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsTARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsTARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms t a relations where threadId = &#63; from the database.
	 *
	 * @param threadId the thread ID
	 */
	@Override
	public void removeByThread(String threadId) {
		for (VcmsTARelation vcmsTARelation : findByThread(threadId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsTARelation);
		}
	}

	/**
	 * Returns the number of vcms t a relations where threadId = &#63;.
	 *
	 * @param threadId the thread ID
	 * @return the number of matching vcms t a relations
	 */
	@Override
	public int countByThread(String threadId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THREAD;

		Object[] finderArgs = new Object[] { threadId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSTARELATION_WHERE);

			boolean bindThreadId = false;

			if (threadId == null) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_1);
			}
			else if (threadId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_3);
			}
			else {
				bindThreadId = true;

				query.append(_FINDER_COLUMN_THREAD_THREADID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindThreadId) {
					qPos.add(threadId);
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

	private static final String _FINDER_COLUMN_THREAD_THREADID_1 = "vcmsTARelation.id.threadId IS NULL";
	private static final String _FINDER_COLUMN_THREAD_THREADID_2 = "vcmsTARelation.id.threadId = ?";
	private static final String _FINDER_COLUMN_THREAD_THREADID_3 = "(vcmsTARelation.id.threadId IS NULL OR vcmsTARelation.id.threadId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsTARelationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			VcmsTARelationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsTARelationModelImpl.ARTICLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms t a relations where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms t a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @return the range of matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms t a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsTARelation> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms t a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsTARelation> orderByComparator,
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

		List<VcmsTARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsTARelation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsTARelation vcmsTARelation : list) {
					if (!Objects.equals(articleId, vcmsTARelation.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

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
				query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsTARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
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
	 * Returns the first vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation findByArticle_First(String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsTARelation != null) {
			return vcmsTARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsTARelationException(msg.toString());
	}

	/**
	 * Returns the first vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation fetchByArticle_First(String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		List<VcmsTARelation> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation findByArticle_Last(String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsTARelation != null) {
			return vcmsTARelation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsTARelationException(msg.toString());
	}

	/**
	 * Returns the last vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	 */
	@Override
	public VcmsTARelation fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsTARelation> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms t a relations before and after the current vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * @param vcmsTARelationPK the primary key of the current vcms t a relation
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation[] findByArticle_PrevAndNext(
		VcmsTARelationPK vcmsTARelationPK, String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = findByPrimaryKey(vcmsTARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsTARelation[] array = new VcmsTARelationImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsTARelation,
					articleId, orderByComparator, true);

			array[1] = vcmsTARelation;

			array[2] = getByArticle_PrevAndNext(session, vcmsTARelation,
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

	protected VcmsTARelation getByArticle_PrevAndNext(Session session,
		VcmsTARelation vcmsTARelation, String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

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
			query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsTARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsTARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms t a relations where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsTARelation vcmsTARelation : findByArticle(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsTARelation);
		}
	}

	/**
	 * Returns the number of vcms t a relations where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms t a relations
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSTARELATION_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsTARelation.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsTARelation.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsTARelation.id.articleId IS NULL OR vcmsTARelation.id.articleId = '')";

	public VcmsTARelationPersistenceImpl() {
		setModelClass(VcmsTARelation.class);
	}

	/**
	 * Caches the vcms t a relation in the entity cache if it is enabled.
	 *
	 * @param vcmsTARelation the vcms t a relation
	 */
	@Override
	public void cacheResult(VcmsTARelation vcmsTARelation) {
		entityCache.putResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey(),
			vcmsTARelation);

		vcmsTARelation.resetOriginalValues();
	}

	/**
	 * Caches the vcms t a relations in the entity cache if it is enabled.
	 *
	 * @param vcmsTARelations the vcms t a relations
	 */
	@Override
	public void cacheResult(List<VcmsTARelation> vcmsTARelations) {
		for (VcmsTARelation vcmsTARelation : vcmsTARelations) {
			if (entityCache.getResult(
						VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey()) == null) {
				cacheResult(vcmsTARelation);
			}
			else {
				vcmsTARelation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms t a relations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsTARelationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms t a relation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsTARelation vcmsTARelation) {
		entityCache.removeResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsTARelation> vcmsTARelations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsTARelation vcmsTARelation : vcmsTARelations) {
			entityCache.removeResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms t a relation with the primary key. Does not add the vcms t a relation to the database.
	 *
	 * @param vcmsTARelationPK the primary key for the new vcms t a relation
	 * @return the new vcms t a relation
	 */
	@Override
	public VcmsTARelation create(VcmsTARelationPK vcmsTARelationPK) {
		VcmsTARelation vcmsTARelation = new VcmsTARelationImpl();

		vcmsTARelation.setNew(true);
		vcmsTARelation.setPrimaryKey(vcmsTARelationPK);

		return vcmsTARelation;
	}

	/**
	 * Removes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsTARelationPK the primary key of the vcms t a relation
	 * @return the vcms t a relation that was removed
	 * @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation remove(VcmsTARelationPK vcmsTARelationPK)
		throws NoSuchVcmsTARelationException {
		return remove((Serializable)vcmsTARelationPK);
	}

	/**
	 * Removes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms t a relation
	 * @return the vcms t a relation that was removed
	 * @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation remove(Serializable primaryKey)
		throws NoSuchVcmsTARelationException {
		Session session = null;

		try {
			session = openSession();

			VcmsTARelation vcmsTARelation = (VcmsTARelation)session.get(VcmsTARelationImpl.class,
					primaryKey);

			if (vcmsTARelation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsTARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsTARelation);
		}
		catch (NoSuchVcmsTARelationException nsee) {
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
	protected VcmsTARelation removeImpl(VcmsTARelation vcmsTARelation) {
		vcmsTARelation = toUnwrappedModel(vcmsTARelation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsTARelation)) {
				vcmsTARelation = (VcmsTARelation)session.get(VcmsTARelationImpl.class,
						vcmsTARelation.getPrimaryKeyObj());
			}

			if (vcmsTARelation != null) {
				session.delete(vcmsTARelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsTARelation != null) {
			clearCache(vcmsTARelation);
		}

		return vcmsTARelation;
	}

	@Override
	public VcmsTARelation updateImpl(VcmsTARelation vcmsTARelation) {
		vcmsTARelation = toUnwrappedModel(vcmsTARelation);

		boolean isNew = vcmsTARelation.isNew();

		VcmsTARelationModelImpl vcmsTARelationModelImpl = (VcmsTARelationModelImpl)vcmsTARelation;

		Session session = null;

		try {
			session = openSession();

			if (vcmsTARelation.isNew()) {
				session.save(vcmsTARelation);

				vcmsTARelation.setNew(false);
			}
			else {
				vcmsTARelation = (VcmsTARelation)session.merge(vcmsTARelation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsTARelationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsTARelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THREAD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsTARelationModelImpl.getOriginalThreadId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_THREAD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THREAD,
					args);

				args = new Object[] { vcmsTARelationModelImpl.getThreadId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_THREAD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THREAD,
					args);
			}

			if ((vcmsTARelationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsTARelationModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsTARelationModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}
		}

		entityCache.putResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey(),
			vcmsTARelation, false);

		vcmsTARelation.resetOriginalValues();

		return vcmsTARelation;
	}

	protected VcmsTARelation toUnwrappedModel(VcmsTARelation vcmsTARelation) {
		if (vcmsTARelation instanceof VcmsTARelationImpl) {
			return vcmsTARelation;
		}

		VcmsTARelationImpl vcmsTARelationImpl = new VcmsTARelationImpl();

		vcmsTARelationImpl.setNew(vcmsTARelation.isNew());
		vcmsTARelationImpl.setPrimaryKey(vcmsTARelation.getPrimaryKey());

		vcmsTARelationImpl.setThreadId(vcmsTARelation.getThreadId());
		vcmsTARelationImpl.setArticleId(vcmsTARelation.getArticleId());

		return vcmsTARelationImpl;
	}

	/**
	 * Returns the vcms t a relation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms t a relation
	 * @return the vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsTARelationException {
		VcmsTARelation vcmsTARelation = fetchByPrimaryKey(primaryKey);

		if (vcmsTARelation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsTARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsTARelation;
	}

	/**
	 * Returns the vcms t a relation with the primary key or throws a {@link NoSuchVcmsTARelationException} if it could not be found.
	 *
	 * @param vcmsTARelationPK the primary key of the vcms t a relation
	 * @return the vcms t a relation
	 * @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation findByPrimaryKey(VcmsTARelationPK vcmsTARelationPK)
		throws NoSuchVcmsTARelationException {
		return findByPrimaryKey((Serializable)vcmsTARelationPK);
	}

	/**
	 * Returns the vcms t a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms t a relation
	 * @return the vcms t a relation, or <code>null</code> if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsTARelationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsTARelation vcmsTARelation = (VcmsTARelation)serializable;

		if (vcmsTARelation == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsTARelation = (VcmsTARelation)session.get(VcmsTARelationImpl.class,
						primaryKey);

				if (vcmsTARelation != null) {
					cacheResult(vcmsTARelation);
				}
				else {
					entityCache.putResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsTARelationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
					VcmsTARelationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsTARelation;
	}

	/**
	 * Returns the vcms t a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsTARelationPK the primary key of the vcms t a relation
	 * @return the vcms t a relation, or <code>null</code> if a vcms t a relation with the primary key could not be found
	 */
	@Override
	public VcmsTARelation fetchByPrimaryKey(VcmsTARelationPK vcmsTARelationPK) {
		return fetchByPrimaryKey((Serializable)vcmsTARelationPK);
	}

	@Override
	public Map<Serializable, VcmsTARelation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsTARelation> map = new HashMap<Serializable, VcmsTARelation>();

		for (Serializable primaryKey : primaryKeys) {
			VcmsTARelation vcmsTARelation = fetchByPrimaryKey(primaryKey);

			if (vcmsTARelation != null) {
				map.put(primaryKey, vcmsTARelation);
			}
		}

		return map;
	}

	/**
	 * Returns all the vcms t a relations.
	 *
	 * @return the vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms t a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @return the range of vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms t a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findAll(int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms t a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms t a relations
	 * @param end the upper bound of the range of vcms t a relations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms t a relations
	 */
	@Override
	public List<VcmsTARelation> findAll(int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator,
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

		List<VcmsTARelation> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsTARelation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSTARELATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSTARELATION;

				if (pagination) {
					sql = sql.concat(VcmsTARelationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
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
	 * Removes all the vcms t a relations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsTARelation vcmsTARelation : findAll()) {
			remove(vcmsTARelation);
		}
	}

	/**
	 * Returns the number of vcms t a relations.
	 *
	 * @return the number of vcms t a relations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSTARELATION);

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
		return VcmsTARelationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms t a relation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsTARelationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSTARELATION = "SELECT vcmsTARelation FROM VcmsTARelation vcmsTARelation";
	private static final String _SQL_SELECT_VCMSTARELATION_WHERE = "SELECT vcmsTARelation FROM VcmsTARelation vcmsTARelation WHERE ";
	private static final String _SQL_COUNT_VCMSTARELATION = "SELECT COUNT(vcmsTARelation) FROM VcmsTARelation vcmsTARelation";
	private static final String _SQL_COUNT_VCMSTARELATION_WHERE = "SELECT COUNT(vcmsTARelation) FROM VcmsTARelation vcmsTARelation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsTARelation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsTARelation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsTARelation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsTARelationPersistenceImpl.class);
}