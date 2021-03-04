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
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsThreadException;
import vn.gov.hoabinh.model.VcmsThread;
import vn.gov.hoabinh.model.impl.VcmsThreadImpl;
import vn.gov.hoabinh.model.impl.VcmsThreadModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsThreadPersistence;

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
 * The persistence implementation for the vcms thread service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsThreadPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsThreadUtil
 * @generated
 */
@ProviderType
public class VcmsThreadPersistenceImpl extends BasePersistenceImpl<VcmsThread>
	implements VcmsThreadPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsThreadUtil} to access the vcms thread persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsThreadImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadModelImpl.FINDER_CACHE_ENABLED, VcmsThreadImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadModelImpl.FINDER_CACHE_ENABLED, VcmsThreadImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L = new FinderPath(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadModelImpl.FINDER_CACHE_ENABLED, VcmsThreadImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L = new FinderPath(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadModelImpl.FINDER_CACHE_ENABLED, VcmsThreadImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsThreadModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsThreadModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsThreadModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms threads where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vcms threads
	 */
	@Override
	public List<VcmsThread> findByP_L(long groupId, String language) {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms threads where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms threads
	 * @param end the upper bound of the range of vcms threads (not inclusive)
	 * @return the range of matching vcms threads
	 */
	@Override
	public List<VcmsThread> findByP_L(long groupId, String language, int start,
		int end) {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms threads where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms threads
	 * @param end the upper bound of the range of vcms threads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms threads
	 */
	@Override
	public List<VcmsThread> findByP_L(long groupId, String language, int start,
		int end, OrderByComparator<VcmsThread> orderByComparator) {
		return findByP_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms threads where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms threads
	 * @param end the upper bound of the range of vcms threads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms threads
	 */
	@Override
	public List<VcmsThread> findByP_L(long groupId, String language, int start,
		int end, OrderByComparator<VcmsThread> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_L;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VcmsThread> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsThread>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsThread vcmsThread : list) {
					if ((groupId != vcmsThread.getGroupId()) ||
							!Objects.equals(language, vcmsThread.getLanguage())) {
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

			query.append(_SQL_SELECT_VCMSTHREAD_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsThreadModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsThread>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsThread>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms thread
	 * @throws NoSuchVcmsThreadException if a matching vcms thread could not be found
	 */
	@Override
	public VcmsThread findByP_L_First(long groupId, String language,
		OrderByComparator<VcmsThread> orderByComparator)
		throws NoSuchVcmsThreadException {
		VcmsThread vcmsThread = fetchByP_L_First(groupId, language,
				orderByComparator);

		if (vcmsThread != null) {
			return vcmsThread;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsThreadException(msg.toString());
	}

	/**
	 * Returns the first vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms thread, or <code>null</code> if a matching vcms thread could not be found
	 */
	@Override
	public VcmsThread fetchByP_L_First(long groupId, String language,
		OrderByComparator<VcmsThread> orderByComparator) {
		List<VcmsThread> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms thread
	 * @throws NoSuchVcmsThreadException if a matching vcms thread could not be found
	 */
	@Override
	public VcmsThread findByP_L_Last(long groupId, String language,
		OrderByComparator<VcmsThread> orderByComparator)
		throws NoSuchVcmsThreadException {
		VcmsThread vcmsThread = fetchByP_L_Last(groupId, language,
				orderByComparator);

		if (vcmsThread != null) {
			return vcmsThread;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsThreadException(msg.toString());
	}

	/**
	 * Returns the last vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms thread, or <code>null</code> if a matching vcms thread could not be found
	 */
	@Override
	public VcmsThread fetchByP_L_Last(long groupId, String language,
		OrderByComparator<VcmsThread> orderByComparator) {
		int count = countByP_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VcmsThread> list = findByP_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms threads before and after the current vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param threadId the primary key of the current vcms thread
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms thread
	 * @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread[] findByP_L_PrevAndNext(String threadId, long groupId,
		String language, OrderByComparator<VcmsThread> orderByComparator)
		throws NoSuchVcmsThreadException {
		VcmsThread vcmsThread = findByPrimaryKey(threadId);

		Session session = null;

		try {
			session = openSession();

			VcmsThread[] array = new VcmsThreadImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vcmsThread, groupId,
					language, orderByComparator, true);

			array[1] = vcmsThread;

			array[2] = getByP_L_PrevAndNext(session, vcmsThread, groupId,
					language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsThread getByP_L_PrevAndNext(Session session,
		VcmsThread vcmsThread, long groupId, String language,
		OrderByComparator<VcmsThread> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSTHREAD_WHERE);

		query.append(_FINDER_COLUMN_P_L_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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
			query.append(VcmsThreadModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsThread);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsThread> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms threads where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByP_L(long groupId, String language) {
		for (VcmsThread vcmsThread : findByP_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsThread);
		}
	}

	/**
	 * Returns the number of vcms threads where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vcms threads
	 */
	@Override
	public int countByP_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSTHREAD_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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

	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vcmsThread.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vcmsThread.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vcmsThread.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vcmsThread.language IS NULL OR vcmsThread.language = '')";

	public VcmsThreadPersistenceImpl() {
		setModelClass(VcmsThread.class);
	}

	/**
	 * Caches the vcms thread in the entity cache if it is enabled.
	 *
	 * @param vcmsThread the vcms thread
	 */
	@Override
	public void cacheResult(VcmsThread vcmsThread) {
		entityCache.putResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadImpl.class, vcmsThread.getPrimaryKey(), vcmsThread);

		vcmsThread.resetOriginalValues();
	}

	/**
	 * Caches the vcms threads in the entity cache if it is enabled.
	 *
	 * @param vcmsThreads the vcms threads
	 */
	@Override
	public void cacheResult(List<VcmsThread> vcmsThreads) {
		for (VcmsThread vcmsThread : vcmsThreads) {
			if (entityCache.getResult(
						VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
						VcmsThreadImpl.class, vcmsThread.getPrimaryKey()) == null) {
				cacheResult(vcmsThread);
			}
			else {
				vcmsThread.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms threads.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsThreadImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms thread.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsThread vcmsThread) {
		entityCache.removeResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadImpl.class, vcmsThread.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsThread> vcmsThreads) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsThread vcmsThread : vcmsThreads) {
			entityCache.removeResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
				VcmsThreadImpl.class, vcmsThread.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms thread with the primary key. Does not add the vcms thread to the database.
	 *
	 * @param threadId the primary key for the new vcms thread
	 * @return the new vcms thread
	 */
	@Override
	public VcmsThread create(String threadId) {
		VcmsThread vcmsThread = new VcmsThreadImpl();

		vcmsThread.setNew(true);
		vcmsThread.setPrimaryKey(threadId);

		vcmsThread.setCompanyId(companyProvider.getCompanyId());

		return vcmsThread;
	}

	/**
	 * Removes the vcms thread with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param threadId the primary key of the vcms thread
	 * @return the vcms thread that was removed
	 * @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread remove(String threadId) throws NoSuchVcmsThreadException {
		return remove((Serializable)threadId);
	}

	/**
	 * Removes the vcms thread with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms thread
	 * @return the vcms thread that was removed
	 * @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread remove(Serializable primaryKey)
		throws NoSuchVcmsThreadException {
		Session session = null;

		try {
			session = openSession();

			VcmsThread vcmsThread = (VcmsThread)session.get(VcmsThreadImpl.class,
					primaryKey);

			if (vcmsThread == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsThreadException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsThread);
		}
		catch (NoSuchVcmsThreadException nsee) {
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
	protected VcmsThread removeImpl(VcmsThread vcmsThread) {
		vcmsThread = toUnwrappedModel(vcmsThread);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsThread)) {
				vcmsThread = (VcmsThread)session.get(VcmsThreadImpl.class,
						vcmsThread.getPrimaryKeyObj());
			}

			if (vcmsThread != null) {
				session.delete(vcmsThread);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsThread != null) {
			clearCache(vcmsThread);
		}

		return vcmsThread;
	}

	@Override
	public VcmsThread updateImpl(VcmsThread vcmsThread) {
		vcmsThread = toUnwrappedModel(vcmsThread);

		boolean isNew = vcmsThread.isNew();

		VcmsThreadModelImpl vcmsThreadModelImpl = (VcmsThreadModelImpl)vcmsThread;

		Session session = null;

		try {
			session = openSession();

			if (vcmsThread.isNew()) {
				session.save(vcmsThread);

				vcmsThread.setNew(false);
			}
			else {
				vcmsThread = (VcmsThread)session.merge(vcmsThread);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsThreadModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsThreadModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsThreadModelImpl.getOriginalGroupId(),
						vcmsThreadModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);

				args = new Object[] {
						vcmsThreadModelImpl.getGroupId(),
						vcmsThreadModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_P_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_L,
					args);
			}
		}

		entityCache.putResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
			VcmsThreadImpl.class, vcmsThread.getPrimaryKey(), vcmsThread, false);

		vcmsThread.resetOriginalValues();

		return vcmsThread;
	}

	protected VcmsThread toUnwrappedModel(VcmsThread vcmsThread) {
		if (vcmsThread instanceof VcmsThreadImpl) {
			return vcmsThread;
		}

		VcmsThreadImpl vcmsThreadImpl = new VcmsThreadImpl();

		vcmsThreadImpl.setNew(vcmsThread.isNew());
		vcmsThreadImpl.setPrimaryKey(vcmsThread.getPrimaryKey());

		vcmsThreadImpl.setThreadId(vcmsThread.getThreadId());
		vcmsThreadImpl.setGroupId(vcmsThread.getGroupId());
		vcmsThreadImpl.setCompanyId(vcmsThread.getCompanyId());
		vcmsThreadImpl.setCreatedDate(vcmsThread.getCreatedDate());
		vcmsThreadImpl.setCreatedByUser(vcmsThread.getCreatedByUser());
		vcmsThreadImpl.setModifiedDate(vcmsThread.getModifiedDate());
		vcmsThreadImpl.setModifiedByUser(vcmsThread.getModifiedByUser());
		vcmsThreadImpl.setTitle(vcmsThread.getTitle());
		vcmsThreadImpl.setDescription(vcmsThread.getDescription());
		vcmsThreadImpl.setHasImage(vcmsThread.isHasImage());
		vcmsThreadImpl.setImage(vcmsThread.getImage());
		vcmsThreadImpl.setLanguage(vcmsThread.getLanguage());

		return vcmsThreadImpl;
	}

	/**
	 * Returns the vcms thread with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms thread
	 * @return the vcms thread
	 * @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsThreadException {
		VcmsThread vcmsThread = fetchByPrimaryKey(primaryKey);

		if (vcmsThread == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsThreadException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsThread;
	}

	/**
	 * Returns the vcms thread with the primary key or throws a {@link NoSuchVcmsThreadException} if it could not be found.
	 *
	 * @param threadId the primary key of the vcms thread
	 * @return the vcms thread
	 * @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread findByPrimaryKey(String threadId)
		throws NoSuchVcmsThreadException {
		return findByPrimaryKey((Serializable)threadId);
	}

	/**
	 * Returns the vcms thread with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms thread
	 * @return the vcms thread, or <code>null</code> if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
				VcmsThreadImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsThread vcmsThread = (VcmsThread)serializable;

		if (vcmsThread == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsThread = (VcmsThread)session.get(VcmsThreadImpl.class,
						primaryKey);

				if (vcmsThread != null) {
					cacheResult(vcmsThread);
				}
				else {
					entityCache.putResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
						VcmsThreadImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
					VcmsThreadImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsThread;
	}

	/**
	 * Returns the vcms thread with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param threadId the primary key of the vcms thread
	 * @return the vcms thread, or <code>null</code> if a vcms thread with the primary key could not be found
	 */
	@Override
	public VcmsThread fetchByPrimaryKey(String threadId) {
		return fetchByPrimaryKey((Serializable)threadId);
	}

	@Override
	public Map<Serializable, VcmsThread> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsThread> map = new HashMap<Serializable, VcmsThread>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsThread vcmsThread = fetchByPrimaryKey(primaryKey);

			if (vcmsThread != null) {
				map.put(primaryKey, vcmsThread);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
					VcmsThreadImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsThread)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSTHREAD_WHERE_PKS_IN);

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

			for (VcmsThread vcmsThread : (List<VcmsThread>)q.list()) {
				map.put(vcmsThread.getPrimaryKeyObj(), vcmsThread);

				cacheResult(vcmsThread);

				uncachedPrimaryKeys.remove(vcmsThread.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsThreadModelImpl.ENTITY_CACHE_ENABLED,
					VcmsThreadImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms threads.
	 *
	 * @return the vcms threads
	 */
	@Override
	public List<VcmsThread> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms threads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms threads
	 * @param end the upper bound of the range of vcms threads (not inclusive)
	 * @return the range of vcms threads
	 */
	@Override
	public List<VcmsThread> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms threads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms threads
	 * @param end the upper bound of the range of vcms threads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms threads
	 */
	@Override
	public List<VcmsThread> findAll(int start, int end,
		OrderByComparator<VcmsThread> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms threads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms threads
	 * @param end the upper bound of the range of vcms threads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms threads
	 */
	@Override
	public List<VcmsThread> findAll(int start, int end,
		OrderByComparator<VcmsThread> orderByComparator,
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

		List<VcmsThread> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsThread>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSTHREAD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSTHREAD;

				if (pagination) {
					sql = sql.concat(VcmsThreadModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsThread>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsThread>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms threads from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsThread vcmsThread : findAll()) {
			remove(vcmsThread);
		}
	}

	/**
	 * Returns the number of vcms threads.
	 *
	 * @return the number of vcms threads
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSTHREAD);

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
		return VcmsThreadModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms thread persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsThreadImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSTHREAD = "SELECT vcmsThread FROM VcmsThread vcmsThread";
	private static final String _SQL_SELECT_VCMSTHREAD_WHERE_PKS_IN = "SELECT vcmsThread FROM VcmsThread vcmsThread WHERE threadId IN (";
	private static final String _SQL_SELECT_VCMSTHREAD_WHERE = "SELECT vcmsThread FROM VcmsThread vcmsThread WHERE ";
	private static final String _SQL_COUNT_VCMSTHREAD = "SELECT COUNT(vcmsThread) FROM VcmsThread vcmsThread";
	private static final String _SQL_COUNT_VCMSTHREAD_WHERE = "SELECT COUNT(vcmsThread) FROM VcmsThread vcmsThread WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsThread.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsThread exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsThread exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsThreadPersistenceImpl.class);
}