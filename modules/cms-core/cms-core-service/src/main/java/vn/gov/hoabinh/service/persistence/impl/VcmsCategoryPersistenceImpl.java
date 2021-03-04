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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsCategoryException;
import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.model.impl.VcmsCategoryImpl;
import vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsCategoryPersistence;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategoryPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsCategoryUtil
 * @generated
 */
@ProviderType
public class VcmsCategoryPersistenceImpl extends BasePersistenceImpl<VcmsCategory>
	implements VcmsCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsCategoryUtil} to access the vcms category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTION = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortion",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION =
		new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortion",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VcmsCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsCategoryModelImpl.PORTIONID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTION = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortion",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @return the matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByPortion(long groupId, String language,
		String portionId) {
		return findByPortion(groupId, language, portionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByPortion(long groupId, String language,
		String portionId, int start, int end) {
		return findByPortion(groupId, language, portionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByPortion(long groupId, String language,
		String portionId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return findByPortion(groupId, language, portionId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByPortion(long groupId, String language,
		String portionId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION;
			finderArgs = new Object[] { groupId, language, portionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTION;
			finderArgs = new Object[] {
					groupId, language, portionId,
					
					start, end, orderByComparator
				};
		}

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCategory vcmsCategory : list) {
					if ((groupId != vcmsCategory.getGroupId()) ||
							!Objects.equals(language, vcmsCategory.getLanguage()) ||
							!Objects.equals(portionId,
								vcmsCategory.getPortionId())) {
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

			query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_PORTION_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_PORTION_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTION_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_PORTION_LANGUAGE_2);
			}

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
				query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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

				if (bindPortionId) {
					qPos.add(portionId);
				}

				if (!pagination) {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByPortion_First(long groupId, String language,
		String portionId, OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByPortion_First(groupId, language,
				portionId, orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", portionId=");
		msg.append(portionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByPortion_First(long groupId, String language,
		String portionId, OrderByComparator<VcmsCategory> orderByComparator) {
		List<VcmsCategory> list = findByPortion(groupId, language, portionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByPortion_Last(long groupId, String language,
		String portionId, OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByPortion_Last(groupId, language,
				portionId, orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", portionId=");
		msg.append(portionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByPortion_Last(long groupId, String language,
		String portionId, OrderByComparator<VcmsCategory> orderByComparator) {
		int count = countByPortion(groupId, language, portionId);

		if (count == 0) {
			return null;
		}

		List<VcmsCategory> list = findByPortion(groupId, language, portionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param categoryId the primary key of the current vcms category
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms category
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory[] findByPortion_PrevAndNext(String categoryId,
		long groupId, String language, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			VcmsCategory[] array = new VcmsCategoryImpl[3];

			array[0] = getByPortion_PrevAndNext(session, vcmsCategory, groupId,
					language, portionId, orderByComparator, true);

			array[1] = vcmsCategory;

			array[2] = getByPortion_PrevAndNext(session, vcmsCategory, groupId,
					language, portionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsCategory getByPortion_PrevAndNext(Session session,
		VcmsCategory vcmsCategory, long groupId, String language,
		String portionId, OrderByComparator<VcmsCategory> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_PORTION_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_PORTION_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PORTION_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_PORTION_LANGUAGE_2);
		}

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
			query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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

		if (bindPortionId) {
			qPos.add(portionId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 */
	@Override
	public void removeByPortion(long groupId, String language, String portionId) {
		for (VcmsCategory vcmsCategory : findByPortion(groupId, language,
				portionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCategory);
		}
	}

	/**
	 * Returns the number of vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param portionId the portion ID
	 * @return the number of matching vcms categories
	 */
	@Override
	public int countByPortion(long groupId, String language, String portionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTION;

		Object[] finderArgs = new Object[] { groupId, language, portionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_PORTION_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_PORTION_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTION_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_PORTION_LANGUAGE_2);
			}

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

				qPos.add(groupId);

				if (bindLanguage) {
					qPos.add(language);
				}

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

	private static final String _FINDER_COLUMN_PORTION_GROUPID_2 = "vcmsCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_PORTION_LANGUAGE_1 = "vcmsCategory.language IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTION_LANGUAGE_2 = "vcmsCategory.language = ? AND ";
	private static final String _FINDER_COLUMN_PORTION_LANGUAGE_3 = "(vcmsCategory.language IS NULL OR vcmsCategory.language = '') AND ";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_1 = "vcmsCategory.portionId IS NULL";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_2 = "vcmsCategory.portionId = ?";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_3 = "(vcmsCategory.portionId IS NULL OR vcmsCategory.portionId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VcmsCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsCategoryModelImpl.PARENTID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @return the matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P(long groupId, String language,
		String parentId) {
		return findByG_L_P(groupId, language, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P(long groupId, String language,
		String parentId, int start, int end) {
		return findByG_L_P(groupId, language, parentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P(long groupId, String language,
		String parentId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P(long groupId, String language,
		String parentId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P;
			finderArgs = new Object[] { groupId, language, parentId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P;
			finderArgs = new Object[] {
					groupId, language, parentId,
					
					start, end, orderByComparator
				};
		}

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCategory vcmsCategory : list) {
					if ((groupId != vcmsCategory.getGroupId()) ||
							!Objects.equals(language, vcmsCategory.getLanguage()) ||
							!Objects.equals(parentId, vcmsCategory.getParentId())) {
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

			query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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

				if (bindParentId) {
					qPos.add(parentId);
				}

				if (!pagination) {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_P_First(groupId, language,
				parentId, orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator<VcmsCategory> orderByComparator) {
		List<VcmsCategory> list = findByG_L_P(groupId, language, parentId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_P_Last(groupId, language,
				parentId, orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator<VcmsCategory> orderByComparator) {
		int count = countByG_L_P(groupId, language, parentId);

		if (count == 0) {
			return null;
		}

		List<VcmsCategory> list = findByG_L_P(groupId, language, parentId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param categoryId the primary key of the current vcms category
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms category
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory[] findByG_L_P_PrevAndNext(String categoryId,
		long groupId, String language, String parentId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			VcmsCategory[] array = new VcmsCategoryImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, vcmsCategory, groupId,
					language, parentId, orderByComparator, true);

			array[1] = vcmsCategory;

			array[2] = getByG_L_P_PrevAndNext(session, vcmsCategory, groupId,
					language, parentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsCategory getByG_L_P_PrevAndNext(Session session,
		VcmsCategory vcmsCategory, long groupId, String language,
		String parentId, OrderByComparator<VcmsCategory> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
		}

		boolean bindParentId = false;

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
		}
		else if (parentId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
		}
		else {
			bindParentId = true;

			query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
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
			query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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

		if (bindParentId) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 */
	@Override
	public void removeByG_L_P(long groupId, String language, String parentId) {
		for (VcmsCategory vcmsCategory : findByG_L_P(groupId, language,
				parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCategory);
		}
	}

	/**
	 * Returns the number of vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @return the number of matching vcms categories
	 */
	@Override
	public int countByG_L_P(long groupId, String language, String parentId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_P;

		Object[] finderArgs = new Object[] { groupId, language, parentId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
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

				if (bindParentId) {
					qPos.add(parentId);
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

	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "vcmsCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "vcmsCategory.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "vcmsCategory.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(vcmsCategory.language IS NULL OR vcmsCategory.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_1 = "vcmsCategory.parentId IS NULL";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_2 = "vcmsCategory.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_3 = "(vcmsCategory.parentId IS NULL OR vcmsCategory.parentId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsCategoryModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms categories where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms categories where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L(long groupId, String language,
		int start, int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<VcmsCategory> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<VcmsCategory> orderByComparator,
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

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCategory vcmsCategory : list) {
					if ((groupId != vcmsCategory.getGroupId()) ||
							!Objects.equals(language, vcmsCategory.getLanguage())) {
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

			query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

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
				query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_First(long groupId, String language,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_First(long groupId, String language,
		OrderByComparator<VcmsCategory> orderByComparator) {
		List<VcmsCategory> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_Last(long groupId, String language,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_Last(long groupId, String language,
		OrderByComparator<VcmsCategory> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VcmsCategory> list = findByG_L(groupId, language, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param categoryId the primary key of the current vcms category
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms category
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory[] findByG_L_PrevAndNext(String categoryId,
		long groupId, String language,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			VcmsCategory[] array = new VcmsCategoryImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vcmsCategory, groupId,
					language, orderByComparator, true);

			array[1] = vcmsCategory;

			array[2] = getByG_L_PrevAndNext(session, vcmsCategory, groupId,
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

	protected VcmsCategory getByG_L_PrevAndNext(Session session,
		VcmsCategory vcmsCategory, long groupId, String language,
		OrderByComparator<VcmsCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

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
			query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms categories where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (VcmsCategory vcmsCategory : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCategory);
		}
	}

	/**
	 * Returns the number of vcms categories where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vcms categories
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSCATEGORY_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vcmsCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vcmsCategory.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vcmsCategory.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vcmsCategory.language IS NULL OR vcmsCategory.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_C",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_C",
			new String[] { String.class.getName() },
			VcmsCategoryModelImpl.CATEGORYID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_C = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_C",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_C = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_C",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms categories where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String categoryId) {
		return findByG_L_C(categoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms categories where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String categoryId, int start, int end) {
		return findByG_L_C(categoryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String categoryId, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator) {
		return findByG_L_C(categoryId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String categoryId, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C;
			finderArgs = new Object[] { categoryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C;
			finderArgs = new Object[] { categoryId, start, end, orderByComparator };
		}

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCategory vcmsCategory : list) {
					if (!Objects.equals(categoryId, vcmsCategory.getCategoryId())) {
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

			query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCategoryId) {
					qPos.add(categoryId);
				}

				if (!pagination) {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms category in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_C_First(String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_C_First(categoryId,
				orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the first vcms category in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_C_First(String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		List<VcmsCategory> list = findByG_L_C(categoryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms category in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_C_Last(String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_C_Last(categoryId,
				orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the last vcms category in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_C_Last(String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		int count = countByG_L_C(categoryId);

		if (count == 0) {
			return null;
		}

		List<VcmsCategory> list = findByG_L_C(categoryId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns all the vcms categories where categoryId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryIds the category IDs
	 * @return the matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String[] categoryIds) {
		return findByG_L_C(categoryIds, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms categories where categoryId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryIds the category IDs
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String[] categoryIds, int start,
		int end) {
		return findByG_L_C(categoryIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories where categoryId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryIds the category IDs
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String[] categoryIds, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator) {
		return findByG_L_C(categoryIds, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories where categoryId = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_C(String[] categoryIds, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		if (categoryIds == null) {
			categoryIds = new String[0];
		}
		else if (categoryIds.length > 1) {
			categoryIds = ArrayUtil.distinct(categoryIds,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(categoryIds, NULL_SAFE_STRING_COMPARATOR);
		}

		if (categoryIds.length == 1) {
			return findByG_L_C(categoryIds[0], start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(categoryIds) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(categoryIds),
					
					start, end, orderByComparator
				};
		}

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCategory vcmsCategory : list) {
					if (!ArrayUtil.contains(categoryIds,
								vcmsCategory.getCategoryId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

			if (categoryIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < categoryIds.length; i++) {
					String categoryId = categoryIds[i];

					if (categoryId == null) {
						query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_1);
					}
					else if (categoryId.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_3);
					}
					else {
						query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_2);
					}

					if ((i + 1) < categoryIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String categoryId : categoryIds) {
					if ((categoryId != null) && !categoryId.isEmpty()) {
						qPos.add(categoryId);
					}
				}

				if (!pagination) {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vcms categories where categoryId = &#63; from the database.
	 *
	 * @param categoryId the category ID
	 */
	@Override
	public void removeByG_L_C(String categoryId) {
		for (VcmsCategory vcmsCategory : findByG_L_C(categoryId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCategory);
		}
	}

	/**
	 * Returns the number of vcms categories where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the number of matching vcms categories
	 */
	@Override
	public int countByG_L_C(String categoryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_C;

		Object[] finderArgs = new Object[] { categoryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSCATEGORY_WHERE);

			boolean bindCategoryId = false;

			if (categoryId == null) {
				query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_1);
			}
			else if (categoryId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_3);
			}
			else {
				bindCategoryId = true;

				query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCategoryId) {
					qPos.add(categoryId);
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

	/**
	 * Returns the number of vcms categories where categoryId = any &#63;.
	 *
	 * @param categoryIds the category IDs
	 * @return the number of matching vcms categories
	 */
	@Override
	public int countByG_L_C(String[] categoryIds) {
		if (categoryIds == null) {
			categoryIds = new String[0];
		}
		else if (categoryIds.length > 1) {
			categoryIds = ArrayUtil.distinct(categoryIds,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(categoryIds, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(categoryIds) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_C,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VCMSCATEGORY_WHERE);

			if (categoryIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < categoryIds.length; i++) {
					String categoryId = categoryIds[i];

					if (categoryId == null) {
						query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_1);
					}
					else if (categoryId.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_3);
					}
					else {
						query.append(_FINDER_COLUMN_G_L_C_CATEGORYID_2);
					}

					if ((i + 1) < categoryIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String categoryId : categoryIds) {
					if ((categoryId != null) && !categoryId.isEmpty()) {
						qPos.add(categoryId);
					}
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_C,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_C,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_L_C_CATEGORYID_1 = "vcmsCategory.categoryId IS NULL";
	private static final String _FINDER_COLUMN_G_L_C_CATEGORYID_2 = "vcmsCategory.categoryId = ?";
	private static final String _FINDER_COLUMN_G_L_C_CATEGORYID_3 = "(vcmsCategory.categoryId IS NULL OR vcmsCategory.categoryId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P_P = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_P_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_P =
		new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, VcmsCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_P_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VcmsCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsCategoryModelImpl.PARENTID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.PORTIONID_COLUMN_BITMASK |
			VcmsCategoryModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P_P = new FinderPath(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_P_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @return the matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P_P(long groupId, String language,
		String parentId, String portionId) {
		return findByG_L_P_P(groupId, language, parentId, portionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P_P(long groupId, String language,
		String parentId, String portionId, int start, int end) {
		return findByG_L_P_P(groupId, language, parentId, portionId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P_P(long groupId, String language,
		String parentId, String portionId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return findByG_L_P_P(groupId, language, parentId, portionId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms categories
	 */
	@Override
	public List<VcmsCategory> findByG_L_P_P(long groupId, String language,
		String parentId, String portionId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_P;
			finderArgs = new Object[] { groupId, language, parentId, portionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P_P;
			finderArgs = new Object[] {
					groupId, language, parentId, portionId,
					
					start, end, orderByComparator
				};
		}

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsCategory vcmsCategory : list) {
					if ((groupId != vcmsCategory.getGroupId()) ||
							!Objects.equals(language, vcmsCategory.getLanguage()) ||
							!Objects.equals(parentId, vcmsCategory.getParentId()) ||
							!Objects.equals(portionId,
								vcmsCategory.getPortionId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_P_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_2);
			}

			boolean bindPortionId = false;

			if (portionId == null) {
				query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_1);
			}
			else if (portionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_3);
			}
			else {
				bindPortionId = true;

				query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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

				if (bindParentId) {
					qPos.add(parentId);
				}

				if (bindPortionId) {
					qPos.add(portionId);
				}

				if (!pagination) {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_P_P_First(long groupId, String language,
		String parentId, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_P_P_First(groupId, language,
				parentId, portionId, orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(", portionId=");
		msg.append(portionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_P_P_First(long groupId, String language,
		String parentId, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		List<VcmsCategory> list = findByG_L_P_P(groupId, language, parentId,
				portionId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category
	 * @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory findByG_L_P_P_Last(long groupId, String language,
		String parentId, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByG_L_P_P_Last(groupId, language,
				parentId, portionId, orderByComparator);

		if (vcmsCategory != null) {
			return vcmsCategory;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parentId=");
		msg.append(parentId);

		msg.append(", portionId=");
		msg.append(portionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsCategoryException(msg.toString());
	}

	/**
	 * Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	 */
	@Override
	public VcmsCategory fetchByG_L_P_P_Last(long groupId, String language,
		String parentId, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		int count = countByG_L_P_P(groupId, language, parentId, portionId);

		if (count == 0) {
			return null;
		}

		List<VcmsCategory> list = findByG_L_P_P(groupId, language, parentId,
				portionId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param categoryId the primary key of the current vcms category
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms category
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory[] findByG_L_P_P_PrevAndNext(String categoryId,
		long groupId, String language, String parentId, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			VcmsCategory[] array = new VcmsCategoryImpl[3];

			array[0] = getByG_L_P_P_PrevAndNext(session, vcmsCategory, groupId,
					language, parentId, portionId, orderByComparator, true);

			array[1] = vcmsCategory;

			array[2] = getByG_L_P_P_PrevAndNext(session, vcmsCategory, groupId,
					language, parentId, portionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsCategory getByG_L_P_P_PrevAndNext(Session session,
		VcmsCategory vcmsCategory, long groupId, String language,
		String parentId, String portionId,
		OrderByComparator<VcmsCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VCMSCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_P_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_2);
		}

		boolean bindParentId = false;

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_1);
		}
		else if (parentId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_3);
		}
		else {
			bindParentId = true;

			query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_2);
		}

		boolean bindPortionId = false;

		if (portionId == null) {
			query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_1);
		}
		else if (portionId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_3);
		}
		else {
			bindPortionId = true;

			query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_2);
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
			query.append(VcmsCategoryModelImpl.ORDER_BY_JPQL);
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

		if (bindParentId) {
			qPos.add(parentId);
		}

		if (bindPortionId) {
			qPos.add(portionId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 */
	@Override
	public void removeByG_L_P_P(long groupId, String language, String parentId,
		String portionId) {
		for (VcmsCategory vcmsCategory : findByG_L_P_P(groupId, language,
				parentId, portionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsCategory);
		}
	}

	/**
	 * Returns the number of vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parentId the parent ID
	 * @param portionId the portion ID
	 * @return the number of matching vcms categories
	 */
	@Override
	public int countByG_L_P_P(long groupId, String language, String parentId,
		String portionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_P_P;

		Object[] finderArgs = new Object[] {
				groupId, language, parentId, portionId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_P_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_P_P_LANGUAGE_2);
			}

			boolean bindParentId = false;

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_1);
			}
			else if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_3);
			}
			else {
				bindParentId = true;

				query.append(_FINDER_COLUMN_G_L_P_P_PARENTID_2);
			}

			boolean bindPortionId = false;

			if (portionId == null) {
				query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_1);
			}
			else if (portionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_3);
			}
			else {
				bindPortionId = true;

				query.append(_FINDER_COLUMN_G_L_P_P_PORTIONID_2);
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

				if (bindParentId) {
					qPos.add(parentId);
				}

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

	private static final String _FINDER_COLUMN_G_L_P_P_GROUPID_2 = "vcmsCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_LANGUAGE_1 = "vcmsCategory.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_LANGUAGE_2 = "vcmsCategory.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_LANGUAGE_3 = "(vcmsCategory.language IS NULL OR vcmsCategory.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_PARENTID_1 = "vcmsCategory.parentId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_PARENTID_2 = "vcmsCategory.parentId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_PARENTID_3 = "(vcmsCategory.parentId IS NULL OR vcmsCategory.parentId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_P_PORTIONID_1 = "vcmsCategory.portionId IS NULL";
	private static final String _FINDER_COLUMN_G_L_P_P_PORTIONID_2 = "vcmsCategory.portionId = ?";
	private static final String _FINDER_COLUMN_G_L_P_P_PORTIONID_3 = "(vcmsCategory.portionId IS NULL OR vcmsCategory.portionId = '')";

	public VcmsCategoryPersistenceImpl() {
		setModelClass(VcmsCategory.class);
	}

	/**
	 * Caches the vcms category in the entity cache if it is enabled.
	 *
	 * @param vcmsCategory the vcms category
	 */
	@Override
	public void cacheResult(VcmsCategory vcmsCategory) {
		entityCache.putResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryImpl.class, vcmsCategory.getPrimaryKey(), vcmsCategory);

		vcmsCategory.resetOriginalValues();
	}

	/**
	 * Caches the vcms categories in the entity cache if it is enabled.
	 *
	 * @param vcmsCategories the vcms categories
	 */
	@Override
	public void cacheResult(List<VcmsCategory> vcmsCategories) {
		for (VcmsCategory vcmsCategory : vcmsCategories) {
			if (entityCache.getResult(
						VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
						VcmsCategoryImpl.class, vcmsCategory.getPrimaryKey()) == null) {
				cacheResult(vcmsCategory);
			}
			else {
				vcmsCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms categories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsCategoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms category.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsCategory vcmsCategory) {
		entityCache.removeResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryImpl.class, vcmsCategory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsCategory> vcmsCategories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsCategory vcmsCategory : vcmsCategories) {
			entityCache.removeResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
				VcmsCategoryImpl.class, vcmsCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms category with the primary key. Does not add the vcms category to the database.
	 *
	 * @param categoryId the primary key for the new vcms category
	 * @return the new vcms category
	 */
	@Override
	public VcmsCategory create(String categoryId) {
		VcmsCategory vcmsCategory = new VcmsCategoryImpl();

		vcmsCategory.setNew(true);
		vcmsCategory.setPrimaryKey(categoryId);

		vcmsCategory.setCompanyId(companyProvider.getCompanyId());

		return vcmsCategory;
	}

	/**
	 * Removes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryId the primary key of the vcms category
	 * @return the vcms category that was removed
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory remove(String categoryId)
		throws NoSuchVcmsCategoryException {
		return remove((Serializable)categoryId);
	}

	/**
	 * Removes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms category
	 * @return the vcms category that was removed
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory remove(Serializable primaryKey)
		throws NoSuchVcmsCategoryException {
		Session session = null;

		try {
			session = openSession();

			VcmsCategory vcmsCategory = (VcmsCategory)session.get(VcmsCategoryImpl.class,
					primaryKey);

			if (vcmsCategory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsCategory);
		}
		catch (NoSuchVcmsCategoryException nsee) {
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
	protected VcmsCategory removeImpl(VcmsCategory vcmsCategory) {
		vcmsCategory = toUnwrappedModel(vcmsCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsCategory)) {
				vcmsCategory = (VcmsCategory)session.get(VcmsCategoryImpl.class,
						vcmsCategory.getPrimaryKeyObj());
			}

			if (vcmsCategory != null) {
				session.delete(vcmsCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsCategory != null) {
			clearCache(vcmsCategory);
		}

		return vcmsCategory;
	}

	@Override
	public VcmsCategory updateImpl(VcmsCategory vcmsCategory) {
		vcmsCategory = toUnwrappedModel(vcmsCategory);

		boolean isNew = vcmsCategory.isNew();

		VcmsCategoryModelImpl vcmsCategoryModelImpl = (VcmsCategoryModelImpl)vcmsCategory;

		Session session = null;

		try {
			session = openSession();

			if (vcmsCategory.isNew()) {
				session.save(vcmsCategory);

				vcmsCategory.setNew(false);
			}
			else {
				vcmsCategory = (VcmsCategory)session.merge(vcmsCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCategoryModelImpl.getOriginalGroupId(),
						vcmsCategoryModelImpl.getOriginalLanguage(),
						vcmsCategoryModelImpl.getOriginalPortionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PORTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION,
					args);

				args = new Object[] {
						vcmsCategoryModelImpl.getGroupId(),
						vcmsCategoryModelImpl.getLanguage(),
						vcmsCategoryModelImpl.getPortionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PORTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTION,
					args);
			}

			if ((vcmsCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCategoryModelImpl.getOriginalGroupId(),
						vcmsCategoryModelImpl.getOriginalLanguage(),
						vcmsCategoryModelImpl.getOriginalParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);

				args = new Object[] {
						vcmsCategoryModelImpl.getGroupId(),
						vcmsCategoryModelImpl.getLanguage(),
						vcmsCategoryModelImpl.getParentId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);
			}

			if ((vcmsCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCategoryModelImpl.getOriginalGroupId(),
						vcmsCategoryModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vcmsCategoryModelImpl.getGroupId(),
						vcmsCategoryModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((vcmsCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCategoryModelImpl.getOriginalCategoryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C,
					args);

				args = new Object[] { vcmsCategoryModelImpl.getCategoryId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C,
					args);
			}

			if ((vcmsCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsCategoryModelImpl.getOriginalGroupId(),
						vcmsCategoryModelImpl.getOriginalLanguage(),
						vcmsCategoryModelImpl.getOriginalParentId(),
						vcmsCategoryModelImpl.getOriginalPortionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_P,
					args);

				args = new Object[] {
						vcmsCategoryModelImpl.getGroupId(),
						vcmsCategoryModelImpl.getLanguage(),
						vcmsCategoryModelImpl.getParentId(),
						vcmsCategoryModelImpl.getPortionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P_P,
					args);
			}
		}

		entityCache.putResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VcmsCategoryImpl.class, vcmsCategory.getPrimaryKey(), vcmsCategory,
			false);

		vcmsCategory.resetOriginalValues();

		return vcmsCategory;
	}

	protected VcmsCategory toUnwrappedModel(VcmsCategory vcmsCategory) {
		if (vcmsCategory instanceof VcmsCategoryImpl) {
			return vcmsCategory;
		}

		VcmsCategoryImpl vcmsCategoryImpl = new VcmsCategoryImpl();

		vcmsCategoryImpl.setNew(vcmsCategory.isNew());
		vcmsCategoryImpl.setPrimaryKey(vcmsCategory.getPrimaryKey());

		vcmsCategoryImpl.setCategoryId(vcmsCategory.getCategoryId());
		vcmsCategoryImpl.setGroupId(vcmsCategory.getGroupId());
		vcmsCategoryImpl.setCompanyId(vcmsCategory.getCompanyId());
		vcmsCategoryImpl.setCreatedDate(vcmsCategory.getCreatedDate());
		vcmsCategoryImpl.setCreatedByUser(vcmsCategory.getCreatedByUser());
		vcmsCategoryImpl.setModifiedDate(vcmsCategory.getModifiedDate());
		vcmsCategoryImpl.setModifiedByUser(vcmsCategory.getModifiedByUser());
		vcmsCategoryImpl.setPortionId(vcmsCategory.getPortionId());
		vcmsCategoryImpl.setParentId(vcmsCategory.getParentId());
		vcmsCategoryImpl.setName(vcmsCategory.getName());
		vcmsCategoryImpl.setDescription(vcmsCategory.getDescription());
		vcmsCategoryImpl.setAnchored(vcmsCategory.isAnchored());
		vcmsCategoryImpl.setHref(vcmsCategory.getHref());
		vcmsCategoryImpl.setLanguage(vcmsCategory.getLanguage());
		vcmsCategoryImpl.setHasImage(vcmsCategory.isHasImage());
		vcmsCategoryImpl.setImage(vcmsCategory.getImage());
		vcmsCategoryImpl.setPosition(vcmsCategory.getPosition());
		vcmsCategoryImpl.setUserHit(vcmsCategory.getUserHit());
		vcmsCategoryImpl.setRssable(vcmsCategory.isRssable());

		return vcmsCategoryImpl;
	}

	/**
	 * Returns the vcms category with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms category
	 * @return the vcms category
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsCategoryException {
		VcmsCategory vcmsCategory = fetchByPrimaryKey(primaryKey);

		if (vcmsCategory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsCategory;
	}

	/**
	 * Returns the vcms category with the primary key or throws a {@link NoSuchVcmsCategoryException} if it could not be found.
	 *
	 * @param categoryId the primary key of the vcms category
	 * @return the vcms category
	 * @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory findByPrimaryKey(String categoryId)
		throws NoSuchVcmsCategoryException {
		return findByPrimaryKey((Serializable)categoryId);
	}

	/**
	 * Returns the vcms category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms category
	 * @return the vcms category, or <code>null</code> if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
				VcmsCategoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsCategory vcmsCategory = (VcmsCategory)serializable;

		if (vcmsCategory == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsCategory = (VcmsCategory)session.get(VcmsCategoryImpl.class,
						primaryKey);

				if (vcmsCategory != null) {
					cacheResult(vcmsCategory);
				}
				else {
					entityCache.putResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
						VcmsCategoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
					VcmsCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsCategory;
	}

	/**
	 * Returns the vcms category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryId the primary key of the vcms category
	 * @return the vcms category, or <code>null</code> if a vcms category with the primary key could not be found
	 */
	@Override
	public VcmsCategory fetchByPrimaryKey(String categoryId) {
		return fetchByPrimaryKey((Serializable)categoryId);
	}

	@Override
	public Map<Serializable, VcmsCategory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsCategory> map = new HashMap<Serializable, VcmsCategory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsCategory vcmsCategory = fetchByPrimaryKey(primaryKey);

			if (vcmsCategory != null) {
				map.put(primaryKey, vcmsCategory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
					VcmsCategoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsCategory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSCATEGORY_WHERE_PKS_IN);

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

			for (VcmsCategory vcmsCategory : (List<VcmsCategory>)q.list()) {
				map.put(vcmsCategory.getPrimaryKeyObj(), vcmsCategory);

				cacheResult(vcmsCategory);

				uncachedPrimaryKeys.remove(vcmsCategory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsCategoryModelImpl.ENTITY_CACHE_ENABLED,
					VcmsCategoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms categories.
	 *
	 * @return the vcms categories
	 */
	@Override
	public List<VcmsCategory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @return the range of vcms categories
	 */
	@Override
	public List<VcmsCategory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms categories
	 */
	@Override
	public List<VcmsCategory> findAll(int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms categories
	 * @param end the upper bound of the range of vcms categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms categories
	 */
	@Override
	public List<VcmsCategory> findAll(int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
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

		List<VcmsCategory> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsCategory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSCATEGORY;

				if (pagination) {
					sql = sql.concat(VcmsCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsCategory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms categories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsCategory vcmsCategory : findAll()) {
			remove(vcmsCategory);
		}
	}

	/**
	 * Returns the number of vcms categories.
	 *
	 * @return the number of vcms categories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSCATEGORY);

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
		return VcmsCategoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms category persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsCategoryImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSCATEGORY = "SELECT vcmsCategory FROM VcmsCategory vcmsCategory";
	private static final String _SQL_SELECT_VCMSCATEGORY_WHERE_PKS_IN = "SELECT vcmsCategory FROM VcmsCategory vcmsCategory WHERE categoryId IN (";
	private static final String _SQL_SELECT_VCMSCATEGORY_WHERE = "SELECT vcmsCategory FROM VcmsCategory vcmsCategory WHERE ";
	private static final String _SQL_COUNT_VCMSCATEGORY = "SELECT COUNT(vcmsCategory) FROM VcmsCategory vcmsCategory";
	private static final String _SQL_COUNT_VCMSCATEGORY_WHERE = "SELECT COUNT(vcmsCategory) FROM VcmsCategory vcmsCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsCategory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsCategoryPersistenceImpl.class);
}