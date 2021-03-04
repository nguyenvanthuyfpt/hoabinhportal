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

import vn.gov.hoabinh.exception.NoSuchVcmsPortionException;
import vn.gov.hoabinh.model.VcmsPortion;
import vn.gov.hoabinh.model.impl.VcmsPortionImpl;
import vn.gov.hoabinh.model.impl.VcmsPortionModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsPortionPersistence;

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
 * The persistence implementation for the vcms portion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPortionPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsPortionUtil
 * @generated
 */
@ProviderType
public class VcmsPortionPersistenceImpl extends BasePersistenceImpl<VcmsPortion>
	implements VcmsPortionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsPortionUtil} to access the vcms portion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsPortionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			VcmsPortionModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsPortionModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsPortionModelImpl.CATEGORIZABLE_COLUMN_BITMASK |
			VcmsPortionModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_C = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @return the matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L_C(long groupId, String language,
		boolean categorizable) {
		return findByG_L_C(groupId, language, categorizable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @return the range of matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L_C(long groupId, String language,
		boolean categorizable, int start, int end) {
		return findByG_L_C(groupId, language, categorizable, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L_C(long groupId, String language,
		boolean categorizable, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return findByG_L_C(groupId, language, categorizable, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L_C(long groupId, String language,
		boolean categorizable, int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C;
			finderArgs = new Object[] { groupId, language, categorizable };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C;
			finderArgs = new Object[] {
					groupId, language, categorizable,
					
					start, end, orderByComparator
				};
		}

		List<VcmsPortion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsPortion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsPortion vcmsPortion : list) {
					if ((groupId != vcmsPortion.getGroupId()) ||
							!Objects.equals(language, vcmsPortion.getLanguage()) ||
							(categorizable != vcmsPortion.getCategorizable())) {
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

			query.append(_SQL_SELECT_VCMSPORTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_C_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_C_CATEGORIZABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsPortionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(categorizable);

				if (!pagination) {
					list = (List<VcmsPortion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsPortion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms portion
	 * @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion findByG_L_C_First(long groupId, String language,
		boolean categorizable, OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = fetchByG_L_C_First(groupId, language,
				categorizable, orderByComparator);

		if (vcmsPortion != null) {
			return vcmsPortion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", categorizable=");
		msg.append(categorizable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPortionException(msg.toString());
	}

	/**
	 * Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion fetchByG_L_C_First(long groupId, String language,
		boolean categorizable, OrderByComparator<VcmsPortion> orderByComparator) {
		List<VcmsPortion> list = findByG_L_C(groupId, language, categorizable,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms portion
	 * @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion findByG_L_C_Last(long groupId, String language,
		boolean categorizable, OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = fetchByG_L_C_Last(groupId, language,
				categorizable, orderByComparator);

		if (vcmsPortion != null) {
			return vcmsPortion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", categorizable=");
		msg.append(categorizable);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPortionException(msg.toString());
	}

	/**
	 * Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion fetchByG_L_C_Last(long groupId, String language,
		boolean categorizable, OrderByComparator<VcmsPortion> orderByComparator) {
		int count = countByG_L_C(groupId, language, categorizable);

		if (count == 0) {
			return null;
		}

		List<VcmsPortion> list = findByG_L_C(groupId, language, categorizable,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param portionId the primary key of the current vcms portion
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms portion
	 * @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion[] findByG_L_C_PrevAndNext(String portionId,
		long groupId, String language, boolean categorizable,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = findByPrimaryKey(portionId);

		Session session = null;

		try {
			session = openSession();

			VcmsPortion[] array = new VcmsPortionImpl[3];

			array[0] = getByG_L_C_PrevAndNext(session, vcmsPortion, groupId,
					language, categorizable, orderByComparator, true);

			array[1] = vcmsPortion;

			array[2] = getByG_L_C_PrevAndNext(session, vcmsPortion, groupId,
					language, categorizable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsPortion getByG_L_C_PrevAndNext(Session session,
		VcmsPortion vcmsPortion, long groupId, String language,
		boolean categorizable,
		OrderByComparator<VcmsPortion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VCMSPORTION_WHERE);

		query.append(_FINDER_COLUMN_G_L_C_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_C_CATEGORIZABLE_2);

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
			query.append(VcmsPortionModelImpl.ORDER_BY_JPQL);
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

		qPos.add(categorizable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsPortion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsPortion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 */
	@Override
	public void removeByG_L_C(long groupId, String language,
		boolean categorizable) {
		for (VcmsPortion vcmsPortion : findByG_L_C(groupId, language,
				categorizable, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsPortion);
		}
	}

	/**
	 * Returns the number of vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categorizable the categorizable
	 * @return the number of matching vcms portions
	 */
	@Override
	public int countByG_L_C(long groupId, String language, boolean categorizable) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_C;

		Object[] finderArgs = new Object[] { groupId, language, categorizable };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSPORTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_C_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_C_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_C_CATEGORIZABLE_2);

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

				qPos.add(categorizable);

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

	private static final String _FINDER_COLUMN_G_L_C_GROUPID_2 = "vcmsPortion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_LANGUAGE_1 = "vcmsPortion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_C_LANGUAGE_2 = "vcmsPortion.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_LANGUAGE_3 = "(vcmsPortion.language IS NULL OR vcmsPortion.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_C_CATEGORIZABLE_2 = "vcmsPortion.categorizable = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_S_C = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByS_C",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsPortionModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsPortionModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_S_C = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByS_C",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vcms portion where groupId = &#63; and code = &#63; or throws a {@link NoSuchVcmsPortionException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching vcms portion
	 * @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion findByS_C(long groupId, String code)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = fetchByS_C(groupId, code);

		if (vcmsPortion == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVcmsPortionException(msg.toString());
		}

		return vcmsPortion;
	}

	/**
	 * Returns the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion fetchByS_C(long groupId, String code) {
		return fetchByS_C(groupId, code, true);
	}

	/**
	 * Returns the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion fetchByS_C(long groupId, String code,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, code };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_S_C,
					finderArgs, this);
		}

		if (result instanceof VcmsPortion) {
			VcmsPortion vcmsPortion = (VcmsPortion)result;

			if ((groupId != vcmsPortion.getGroupId()) ||
					!Objects.equals(code, vcmsPortion.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCMSPORTION_WHERE);

			query.append(_FINDER_COLUMN_S_C_GROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_S_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_S_C_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCode) {
					qPos.add(code);
				}

				List<VcmsPortion> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_S_C, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsPortionPersistenceImpl.fetchByS_C(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsPortion vcmsPortion = list.get(0);

					result = vcmsPortion;

					cacheResult(vcmsPortion);

					if ((vcmsPortion.getGroupId() != groupId) ||
							(vcmsPortion.getCode() == null) ||
							!vcmsPortion.getCode().equals(code)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_S_C,
							finderArgs, vcmsPortion);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_S_C, finderArgs);

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
			return (VcmsPortion)result;
		}
	}

	/**
	 * Removes the vcms portion where groupId = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the vcms portion that was removed
	 */
	@Override
	public VcmsPortion removeByS_C(long groupId, String code)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = findByS_C(groupId, code);

		return remove(vcmsPortion);
	}

	/**
	 * Returns the number of vcms portions where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the number of matching vcms portions
	 */
	@Override
	public int countByS_C(long groupId, String code) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_S_C;

		Object[] finderArgs = new Object[] { groupId, code };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSPORTION_WHERE);

			query.append(_FINDER_COLUMN_S_C_GROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_S_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_S_C_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_S_C_GROUPID_2 = "vcmsPortion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_C_CODE_1 = "vcmsPortion.code IS NULL";
	private static final String _FINDER_COLUMN_S_C_CODE_2 = "vcmsPortion.code = ?";
	private static final String _FINDER_COLUMN_S_C_CODE_3 = "(vcmsPortion.code IS NULL OR vcmsPortion.code = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, VcmsPortionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsPortionModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsPortionModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsPortionModelImpl.MODIFIEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms portions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms portions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @return the range of matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L(long groupId, String language,
		int start, int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<VcmsPortion> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms portions
	 */
	@Override
	public List<VcmsPortion> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] { groupId, language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] {
					groupId, language,
					
					start, end, orderByComparator
				};
		}

		List<VcmsPortion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsPortion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsPortion vcmsPortion : list) {
					if ((groupId != vcmsPortion.getGroupId()) ||
							!Objects.equals(language, vcmsPortion.getLanguage())) {
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

			query.append(_SQL_SELECT_VCMSPORTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsPortionModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsPortion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsPortion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms portion
	 * @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion findByG_L_First(long groupId, String language,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vcmsPortion != null) {
			return vcmsPortion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPortionException(msg.toString());
	}

	/**
	 * Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion fetchByG_L_First(long groupId, String language,
		OrderByComparator<VcmsPortion> orderByComparator) {
		List<VcmsPortion> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms portion
	 * @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion findByG_L_Last(long groupId, String language,
		OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (vcmsPortion != null) {
			return vcmsPortion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsPortionException(msg.toString());
	}

	/**
	 * Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	 */
	@Override
	public VcmsPortion fetchByG_L_Last(long groupId, String language,
		OrderByComparator<VcmsPortion> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VcmsPortion> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param portionId the primary key of the current vcms portion
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms portion
	 * @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion[] findByG_L_PrevAndNext(String portionId, long groupId,
		String language, OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = findByPrimaryKey(portionId);

		Session session = null;

		try {
			session = openSession();

			VcmsPortion[] array = new VcmsPortionImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vcmsPortion, groupId,
					language, orderByComparator, true);

			array[1] = vcmsPortion;

			array[2] = getByG_L_PrevAndNext(session, vcmsPortion, groupId,
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

	protected VcmsPortion getByG_L_PrevAndNext(Session session,
		VcmsPortion vcmsPortion, long groupId, String language,
		OrderByComparator<VcmsPortion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSPORTION_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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
			query.append(VcmsPortionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsPortion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsPortion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms portions where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (VcmsPortion vcmsPortion : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsPortion);
		}
	}

	/**
	 * Returns the number of vcms portions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vcms portions
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSPORTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vcmsPortion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vcmsPortion.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vcmsPortion.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vcmsPortion.language IS NULL OR vcmsPortion.language = '')";

	public VcmsPortionPersistenceImpl() {
		setModelClass(VcmsPortion.class);
	}

	/**
	 * Caches the vcms portion in the entity cache if it is enabled.
	 *
	 * @param vcmsPortion the vcms portion
	 */
	@Override
	public void cacheResult(VcmsPortion vcmsPortion) {
		entityCache.putResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionImpl.class, vcmsPortion.getPrimaryKey(), vcmsPortion);

		finderCache.putResult(FINDER_PATH_FETCH_BY_S_C,
			new Object[] { vcmsPortion.getGroupId(), vcmsPortion.getCode() },
			vcmsPortion);

		vcmsPortion.resetOriginalValues();
	}

	/**
	 * Caches the vcms portions in the entity cache if it is enabled.
	 *
	 * @param vcmsPortions the vcms portions
	 */
	@Override
	public void cacheResult(List<VcmsPortion> vcmsPortions) {
		for (VcmsPortion vcmsPortion : vcmsPortions) {
			if (entityCache.getResult(
						VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsPortionImpl.class, vcmsPortion.getPrimaryKey()) == null) {
				cacheResult(vcmsPortion);
			}
			else {
				vcmsPortion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms portions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsPortionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms portion.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsPortion vcmsPortion) {
		entityCache.removeResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionImpl.class, vcmsPortion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VcmsPortionModelImpl)vcmsPortion);
	}

	@Override
	public void clearCache(List<VcmsPortion> vcmsPortions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsPortion vcmsPortion : vcmsPortions) {
			entityCache.removeResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsPortionImpl.class, vcmsPortion.getPrimaryKey());

			clearUniqueFindersCache((VcmsPortionModelImpl)vcmsPortion);
		}
	}

	protected void cacheUniqueFindersCache(
		VcmsPortionModelImpl vcmsPortionModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vcmsPortionModelImpl.getGroupId(),
					vcmsPortionModelImpl.getCode()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_S_C, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_S_C, args,
				vcmsPortionModelImpl);
		}
		else {
			if ((vcmsPortionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_S_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsPortionModelImpl.getGroupId(),
						vcmsPortionModelImpl.getCode()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_S_C, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_S_C, args,
					vcmsPortionModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		VcmsPortionModelImpl vcmsPortionModelImpl) {
		Object[] args = new Object[] {
				vcmsPortionModelImpl.getGroupId(),
				vcmsPortionModelImpl.getCode()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_S_C, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_S_C, args);

		if ((vcmsPortionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_S_C.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsPortionModelImpl.getOriginalGroupId(),
					vcmsPortionModelImpl.getOriginalCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_S_C, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_S_C, args);
		}
	}

	/**
	 * Creates a new vcms portion with the primary key. Does not add the vcms portion to the database.
	 *
	 * @param portionId the primary key for the new vcms portion
	 * @return the new vcms portion
	 */
	@Override
	public VcmsPortion create(String portionId) {
		VcmsPortion vcmsPortion = new VcmsPortionImpl();

		vcmsPortion.setNew(true);
		vcmsPortion.setPrimaryKey(portionId);

		vcmsPortion.setCompanyId(companyProvider.getCompanyId());

		return vcmsPortion;
	}

	/**
	 * Removes the vcms portion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portionId the primary key of the vcms portion
	 * @return the vcms portion that was removed
	 * @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion remove(String portionId)
		throws NoSuchVcmsPortionException {
		return remove((Serializable)portionId);
	}

	/**
	 * Removes the vcms portion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms portion
	 * @return the vcms portion that was removed
	 * @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion remove(Serializable primaryKey)
		throws NoSuchVcmsPortionException {
		Session session = null;

		try {
			session = openSession();

			VcmsPortion vcmsPortion = (VcmsPortion)session.get(VcmsPortionImpl.class,
					primaryKey);

			if (vcmsPortion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsPortionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsPortion);
		}
		catch (NoSuchVcmsPortionException nsee) {
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
	protected VcmsPortion removeImpl(VcmsPortion vcmsPortion) {
		vcmsPortion = toUnwrappedModel(vcmsPortion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsPortion)) {
				vcmsPortion = (VcmsPortion)session.get(VcmsPortionImpl.class,
						vcmsPortion.getPrimaryKeyObj());
			}

			if (vcmsPortion != null) {
				session.delete(vcmsPortion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsPortion != null) {
			clearCache(vcmsPortion);
		}

		return vcmsPortion;
	}

	@Override
	public VcmsPortion updateImpl(VcmsPortion vcmsPortion) {
		vcmsPortion = toUnwrappedModel(vcmsPortion);

		boolean isNew = vcmsPortion.isNew();

		VcmsPortionModelImpl vcmsPortionModelImpl = (VcmsPortionModelImpl)vcmsPortion;

		Session session = null;

		try {
			session = openSession();

			if (vcmsPortion.isNew()) {
				session.save(vcmsPortion);

				vcmsPortion.setNew(false);
			}
			else {
				vcmsPortion = (VcmsPortion)session.merge(vcmsPortion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsPortionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsPortionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsPortionModelImpl.getOriginalGroupId(),
						vcmsPortionModelImpl.getOriginalLanguage(),
						vcmsPortionModelImpl.getOriginalCategorizable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C,
					args);

				args = new Object[] {
						vcmsPortionModelImpl.getGroupId(),
						vcmsPortionModelImpl.getLanguage(),
						vcmsPortionModelImpl.getCategorizable()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C,
					args);
			}

			if ((vcmsPortionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsPortionModelImpl.getOriginalGroupId(),
						vcmsPortionModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vcmsPortionModelImpl.getGroupId(),
						vcmsPortionModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}
		}

		entityCache.putResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPortionImpl.class, vcmsPortion.getPrimaryKey(), vcmsPortion,
			false);

		clearUniqueFindersCache(vcmsPortionModelImpl);
		cacheUniqueFindersCache(vcmsPortionModelImpl, isNew);

		vcmsPortion.resetOriginalValues();

		return vcmsPortion;
	}

	protected VcmsPortion toUnwrappedModel(VcmsPortion vcmsPortion) {
		if (vcmsPortion instanceof VcmsPortionImpl) {
			return vcmsPortion;
		}

		VcmsPortionImpl vcmsPortionImpl = new VcmsPortionImpl();

		vcmsPortionImpl.setNew(vcmsPortion.isNew());
		vcmsPortionImpl.setPrimaryKey(vcmsPortion.getPrimaryKey());

		vcmsPortionImpl.setPortionId(vcmsPortion.getPortionId());
		vcmsPortionImpl.setGroupId(vcmsPortion.getGroupId());
		vcmsPortionImpl.setCompanyId(vcmsPortion.getCompanyId());
		vcmsPortionImpl.setCreatedDate(vcmsPortion.getCreatedDate());
		vcmsPortionImpl.setCreatedByUser(vcmsPortion.getCreatedByUser());
		vcmsPortionImpl.setModifiedDate(vcmsPortion.getModifiedDate());
		vcmsPortionImpl.setModifiedByUser(vcmsPortion.getModifiedByUser());
		vcmsPortionImpl.setCode(vcmsPortion.getCode());
		vcmsPortionImpl.setName(vcmsPortion.getName());
		vcmsPortionImpl.setDescription(vcmsPortion.getDescription());
		vcmsPortionImpl.setCategorizable(vcmsPortion.isCategorizable());
		vcmsPortionImpl.setLanguage(vcmsPortion.getLanguage());

		return vcmsPortionImpl;
	}

	/**
	 * Returns the vcms portion with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms portion
	 * @return the vcms portion
	 * @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsPortionException {
		VcmsPortion vcmsPortion = fetchByPrimaryKey(primaryKey);

		if (vcmsPortion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsPortionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsPortion;
	}

	/**
	 * Returns the vcms portion with the primary key or throws a {@link NoSuchVcmsPortionException} if it could not be found.
	 *
	 * @param portionId the primary key of the vcms portion
	 * @return the vcms portion
	 * @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion findByPrimaryKey(String portionId)
		throws NoSuchVcmsPortionException {
		return findByPrimaryKey((Serializable)portionId);
	}

	/**
	 * Returns the vcms portion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms portion
	 * @return the vcms portion, or <code>null</code> if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsPortionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsPortion vcmsPortion = (VcmsPortion)serializable;

		if (vcmsPortion == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsPortion = (VcmsPortion)session.get(VcmsPortionImpl.class,
						primaryKey);

				if (vcmsPortion != null) {
					cacheResult(vcmsPortion);
				}
				else {
					entityCache.putResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsPortionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsPortionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsPortion;
	}

	/**
	 * Returns the vcms portion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param portionId the primary key of the vcms portion
	 * @return the vcms portion, or <code>null</code> if a vcms portion with the primary key could not be found
	 */
	@Override
	public VcmsPortion fetchByPrimaryKey(String portionId) {
		return fetchByPrimaryKey((Serializable)portionId);
	}

	@Override
	public Map<Serializable, VcmsPortion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsPortion> map = new HashMap<Serializable, VcmsPortion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsPortion vcmsPortion = fetchByPrimaryKey(primaryKey);

			if (vcmsPortion != null) {
				map.put(primaryKey, vcmsPortion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsPortionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsPortion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSPORTION_WHERE_PKS_IN);

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

			for (VcmsPortion vcmsPortion : (List<VcmsPortion>)q.list()) {
				map.put(vcmsPortion.getPrimaryKeyObj(), vcmsPortion);

				cacheResult(vcmsPortion);

				uncachedPrimaryKeys.remove(vcmsPortion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsPortionModelImpl.ENTITY_CACHE_ENABLED,
					VcmsPortionImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms portions.
	 *
	 * @return the vcms portions
	 */
	@Override
	public List<VcmsPortion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms portions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @return the range of vcms portions
	 */
	@Override
	public List<VcmsPortion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms portions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms portions
	 */
	@Override
	public List<VcmsPortion> findAll(int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms portions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms portions
	 * @param end the upper bound of the range of vcms portions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms portions
	 */
	@Override
	public List<VcmsPortion> findAll(int start, int end,
		OrderByComparator<VcmsPortion> orderByComparator,
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

		List<VcmsPortion> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsPortion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSPORTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSPORTION;

				if (pagination) {
					sql = sql.concat(VcmsPortionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsPortion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsPortion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms portions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsPortion vcmsPortion : findAll()) {
			remove(vcmsPortion);
		}
	}

	/**
	 * Returns the number of vcms portions.
	 *
	 * @return the number of vcms portions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSPORTION);

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
		return VcmsPortionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms portion persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsPortionImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSPORTION = "SELECT vcmsPortion FROM VcmsPortion vcmsPortion";
	private static final String _SQL_SELECT_VCMSPORTION_WHERE_PKS_IN = "SELECT vcmsPortion FROM VcmsPortion vcmsPortion WHERE portionId IN (";
	private static final String _SQL_SELECT_VCMSPORTION_WHERE = "SELECT vcmsPortion FROM VcmsPortion vcmsPortion WHERE ";
	private static final String _SQL_COUNT_VCMSPORTION = "SELECT COUNT(vcmsPortion) FROM VcmsPortion vcmsPortion";
	private static final String _SQL_COUNT_VCMSPORTION_WHERE = "SELECT COUNT(vcmsPortion) FROM VcmsPortion vcmsPortion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsPortion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsPortion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsPortion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsPortionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code"
			});
}