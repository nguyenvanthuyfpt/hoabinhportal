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

import vn.gov.hoabinh.exception.NoSuchVcmsTypeException;
import vn.gov.hoabinh.model.VcmsType;
import vn.gov.hoabinh.model.impl.VcmsTypeImpl;
import vn.gov.hoabinh.model.impl.VcmsTypeModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsTypePersistence;

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
 * The persistence implementation for the vcms type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTypePersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsTypeUtil
 * @generated
 */
@ProviderType
public class VcmsTypePersistenceImpl extends BasePersistenceImpl<VcmsType>
	implements VcmsTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsTypeUtil} to access the vcms type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, VcmsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, VcmsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_G_C = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, VcmsTypeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_C",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsTypeModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsTypeModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_C = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_C",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vcms type where groupId = &#63; and code = &#63; or throws a {@link NoSuchVcmsTypeException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching vcms type
	 * @throws NoSuchVcmsTypeException if a matching vcms type could not be found
	 */
	@Override
	public VcmsType findByG_C(long groupId, String code)
		throws NoSuchVcmsTypeException {
		VcmsType vcmsType = fetchByG_C(groupId, code);

		if (vcmsType == null) {
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

			throw new NoSuchVcmsTypeException(msg.toString());
		}

		return vcmsType;
	}

	/**
	 * Returns the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	 */
	@Override
	public VcmsType fetchByG_C(long groupId, String code) {
		return fetchByG_C(groupId, code, true);
	}

	/**
	 * Returns the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	 */
	@Override
	public VcmsType fetchByG_C(long groupId, String code,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { groupId, code };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_G_C,
					finderArgs, this);
		}

		if (result instanceof VcmsType) {
			VcmsType vcmsType = (VcmsType)result;

			if ((groupId != vcmsType.getGroupId()) ||
					!Objects.equals(code, vcmsType.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCMSTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_C_GROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_G_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_G_C_CODE_2);
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

				List<VcmsType> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_G_C, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VcmsTypePersistenceImpl.fetchByG_C(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VcmsType vcmsType = list.get(0);

					result = vcmsType;

					cacheResult(vcmsType);

					if ((vcmsType.getGroupId() != groupId) ||
							(vcmsType.getCode() == null) ||
							!vcmsType.getCode().equals(code)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_G_C,
							finderArgs, vcmsType);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_G_C, finderArgs);

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
			return (VcmsType)result;
		}
	}

	/**
	 * Removes the vcms type where groupId = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the vcms type that was removed
	 */
	@Override
	public VcmsType removeByG_C(long groupId, String code)
		throws NoSuchVcmsTypeException {
		VcmsType vcmsType = findByG_C(groupId, code);

		return remove(vcmsType);
	}

	/**
	 * Returns the number of vcms types where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group ID
	 * @param code the code
	 * @return the number of matching vcms types
	 */
	@Override
	public int countByG_C(long groupId, String code) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_C;

		Object[] finderArgs = new Object[] { groupId, code };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_C_GROUPID_2);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_G_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_G_C_CODE_2);
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

	private static final String _FINDER_COLUMN_G_C_GROUPID_2 = "vcmsType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_C_CODE_1 = "vcmsType.code IS NULL";
	private static final String _FINDER_COLUMN_G_C_CODE_2 = "vcmsType.code = ?";
	private static final String _FINDER_COLUMN_G_C_CODE_3 = "(vcmsType.code IS NULL OR vcmsType.code = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, VcmsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, VcmsTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsTypeModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsTypeModelImpl.LANGUAGE_COLUMN_BITMASK |
			VcmsTypeModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vcms types
	 */
	@Override
	public List<VcmsType> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms types
	 * @param end the upper bound of the range of vcms types (not inclusive)
	 * @return the range of matching vcms types
	 */
	@Override
	public List<VcmsType> findByG_L(long groupId, String language, int start,
		int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms types
	 * @param end the upper bound of the range of vcms types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms types
	 */
	@Override
	public List<VcmsType> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<VcmsType> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vcms types
	 * @param end the upper bound of the range of vcms types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms types
	 */
	@Override
	public List<VcmsType> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator<VcmsType> orderByComparator,
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

		List<VcmsType> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsType>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsType vcmsType : list) {
					if ((groupId != vcmsType.getGroupId()) ||
							!Objects.equals(language, vcmsType.getLanguage())) {
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

			query.append(_SQL_SELECT_VCMSTYPE_WHERE);

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
				query.append(VcmsTypeModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsType>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms type
	 * @throws NoSuchVcmsTypeException if a matching vcms type could not be found
	 */
	@Override
	public VcmsType findByG_L_First(long groupId, String language,
		OrderByComparator<VcmsType> orderByComparator)
		throws NoSuchVcmsTypeException {
		VcmsType vcmsType = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vcmsType != null) {
			return vcmsType;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsTypeException(msg.toString());
	}

	/**
	 * Returns the first vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms type, or <code>null</code> if a matching vcms type could not be found
	 */
	@Override
	public VcmsType fetchByG_L_First(long groupId, String language,
		OrderByComparator<VcmsType> orderByComparator) {
		List<VcmsType> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms type
	 * @throws NoSuchVcmsTypeException if a matching vcms type could not be found
	 */
	@Override
	public VcmsType findByG_L_Last(long groupId, String language,
		OrderByComparator<VcmsType> orderByComparator)
		throws NoSuchVcmsTypeException {
		VcmsType vcmsType = fetchByG_L_Last(groupId, language, orderByComparator);

		if (vcmsType != null) {
			return vcmsType;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsTypeException(msg.toString());
	}

	/**
	 * Returns the last vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms type, or <code>null</code> if a matching vcms type could not be found
	 */
	@Override
	public VcmsType fetchByG_L_Last(long groupId, String language,
		OrderByComparator<VcmsType> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<VcmsType> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms types before and after the current vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param typeId the primary key of the current vcms type
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms type
	 * @throws NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType[] findByG_L_PrevAndNext(long typeId, long groupId,
		String language, OrderByComparator<VcmsType> orderByComparator)
		throws NoSuchVcmsTypeException {
		VcmsType vcmsType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VcmsType[] array = new VcmsTypeImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vcmsType, groupId,
					language, orderByComparator, true);

			array[1] = vcmsType;

			array[2] = getByG_L_PrevAndNext(session, vcmsType, groupId,
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

	protected VcmsType getByG_L_PrevAndNext(Session session, VcmsType vcmsType,
		long groupId, String language,
		OrderByComparator<VcmsType> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSTYPE_WHERE);

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
			query.append(VcmsTypeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms types where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (VcmsType vcmsType : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsType);
		}
	}

	/**
	 * Returns the number of vcms types where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vcms types
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSTYPE_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vcmsType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vcmsType.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vcmsType.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vcmsType.language IS NULL OR vcmsType.language = '')";

	public VcmsTypePersistenceImpl() {
		setModelClass(VcmsType.class);
	}

	/**
	 * Caches the vcms type in the entity cache if it is enabled.
	 *
	 * @param vcmsType the vcms type
	 */
	@Override
	public void cacheResult(VcmsType vcmsType) {
		entityCache.putResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey(), vcmsType);

		finderCache.putResult(FINDER_PATH_FETCH_BY_G_C,
			new Object[] { vcmsType.getGroupId(), vcmsType.getCode() }, vcmsType);

		vcmsType.resetOriginalValues();
	}

	/**
	 * Caches the vcms types in the entity cache if it is enabled.
	 *
	 * @param vcmsTypes the vcms types
	 */
	@Override
	public void cacheResult(List<VcmsType> vcmsTypes) {
		for (VcmsType vcmsType : vcmsTypes) {
			if (entityCache.getResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
						VcmsTypeImpl.class, vcmsType.getPrimaryKey()) == null) {
				cacheResult(vcmsType);
			}
			else {
				vcmsType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms types.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsTypeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms type.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsType vcmsType) {
		entityCache.removeResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VcmsTypeModelImpl)vcmsType);
	}

	@Override
	public void clearCache(List<VcmsType> vcmsTypes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsType vcmsType : vcmsTypes) {
			entityCache.removeResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
				VcmsTypeImpl.class, vcmsType.getPrimaryKey());

			clearUniqueFindersCache((VcmsTypeModelImpl)vcmsType);
		}
	}

	protected void cacheUniqueFindersCache(
		VcmsTypeModelImpl vcmsTypeModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					vcmsTypeModelImpl.getGroupId(), vcmsTypeModelImpl.getCode()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_G_C, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_G_C, args,
				vcmsTypeModelImpl);
		}
		else {
			if ((vcmsTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_G_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsTypeModelImpl.getGroupId(),
						vcmsTypeModelImpl.getCode()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_G_C, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_G_C, args,
					vcmsTypeModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(VcmsTypeModelImpl vcmsTypeModelImpl) {
		Object[] args = new Object[] {
				vcmsTypeModelImpl.getGroupId(), vcmsTypeModelImpl.getCode()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_G_C, args);

		if ((vcmsTypeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_G_C.getColumnBitmask()) != 0) {
			args = new Object[] {
					vcmsTypeModelImpl.getOriginalGroupId(),
					vcmsTypeModelImpl.getOriginalCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_G_C, args);
		}
	}

	/**
	 * Creates a new vcms type with the primary key. Does not add the vcms type to the database.
	 *
	 * @param typeId the primary key for the new vcms type
	 * @return the new vcms type
	 */
	@Override
	public VcmsType create(long typeId) {
		VcmsType vcmsType = new VcmsTypeImpl();

		vcmsType.setNew(true);
		vcmsType.setPrimaryKey(typeId);

		vcmsType.setCompanyId(companyProvider.getCompanyId());

		return vcmsType;
	}

	/**
	 * Removes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the vcms type
	 * @return the vcms type that was removed
	 * @throws NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType remove(long typeId) throws NoSuchVcmsTypeException {
		return remove((Serializable)typeId);
	}

	/**
	 * Removes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms type
	 * @return the vcms type that was removed
	 * @throws NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType remove(Serializable primaryKey)
		throws NoSuchVcmsTypeException {
		Session session = null;

		try {
			session = openSession();

			VcmsType vcmsType = (VcmsType)session.get(VcmsTypeImpl.class,
					primaryKey);

			if (vcmsType == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsType);
		}
		catch (NoSuchVcmsTypeException nsee) {
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
	protected VcmsType removeImpl(VcmsType vcmsType) {
		vcmsType = toUnwrappedModel(vcmsType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsType)) {
				vcmsType = (VcmsType)session.get(VcmsTypeImpl.class,
						vcmsType.getPrimaryKeyObj());
			}

			if (vcmsType != null) {
				session.delete(vcmsType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsType != null) {
			clearCache(vcmsType);
		}

		return vcmsType;
	}

	@Override
	public VcmsType updateImpl(VcmsType vcmsType) {
		vcmsType = toUnwrappedModel(vcmsType);

		boolean isNew = vcmsType.isNew();

		VcmsTypeModelImpl vcmsTypeModelImpl = (VcmsTypeModelImpl)vcmsType;

		Session session = null;

		try {
			session = openSession();

			if (vcmsType.isNew()) {
				session.save(vcmsType);

				vcmsType.setNew(false);
			}
			else {
				vcmsType = (VcmsType)session.merge(vcmsType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsTypeModelImpl.getOriginalGroupId(),
						vcmsTypeModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vcmsTypeModelImpl.getGroupId(),
						vcmsTypeModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}
		}

		entityCache.putResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey(), vcmsType, false);

		clearUniqueFindersCache(vcmsTypeModelImpl);
		cacheUniqueFindersCache(vcmsTypeModelImpl, isNew);

		vcmsType.resetOriginalValues();

		return vcmsType;
	}

	protected VcmsType toUnwrappedModel(VcmsType vcmsType) {
		if (vcmsType instanceof VcmsTypeImpl) {
			return vcmsType;
		}

		VcmsTypeImpl vcmsTypeImpl = new VcmsTypeImpl();

		vcmsTypeImpl.setNew(vcmsType.isNew());
		vcmsTypeImpl.setPrimaryKey(vcmsType.getPrimaryKey());

		vcmsTypeImpl.setTypeId(vcmsType.getTypeId());
		vcmsTypeImpl.setGroupId(vcmsType.getGroupId());
		vcmsTypeImpl.setCompanyId(vcmsType.getCompanyId());
		vcmsTypeImpl.setCreatedDate(vcmsType.getCreatedDate());
		vcmsTypeImpl.setCreatedByUser(vcmsType.getCreatedByUser());
		vcmsTypeImpl.setModifiedDate(vcmsType.getModifiedDate());
		vcmsTypeImpl.setModifiedByUser(vcmsType.getModifiedByUser());
		vcmsTypeImpl.setCode(vcmsType.getCode());
		vcmsTypeImpl.setName(vcmsType.getName());
		vcmsTypeImpl.setDescription(vcmsType.getDescription());
		vcmsTypeImpl.setLanguage(vcmsType.getLanguage());

		return vcmsTypeImpl;
	}

	/**
	 * Returns the vcms type with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms type
	 * @return the vcms type
	 * @throws NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsTypeException {
		VcmsType vcmsType = fetchByPrimaryKey(primaryKey);

		if (vcmsType == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsType;
	}

	/**
	 * Returns the vcms type with the primary key or throws a {@link NoSuchVcmsTypeException} if it could not be found.
	 *
	 * @param typeId the primary key of the vcms type
	 * @return the vcms type
	 * @throws NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType findByPrimaryKey(long typeId)
		throws NoSuchVcmsTypeException {
		return findByPrimaryKey((Serializable)typeId);
	}

	/**
	 * Returns the vcms type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms type
	 * @return the vcms type, or <code>null</code> if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
				VcmsTypeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsType vcmsType = (VcmsType)serializable;

		if (vcmsType == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsType = (VcmsType)session.get(VcmsTypeImpl.class, primaryKey);

				if (vcmsType != null) {
					cacheResult(vcmsType);
				}
				else {
					entityCache.putResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
						VcmsTypeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
					VcmsTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsType;
	}

	/**
	 * Returns the vcms type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the vcms type
	 * @return the vcms type, or <code>null</code> if a vcms type with the primary key could not be found
	 */
	@Override
	public VcmsType fetchByPrimaryKey(long typeId) {
		return fetchByPrimaryKey((Serializable)typeId);
	}

	@Override
	public Map<Serializable, VcmsType> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsType> map = new HashMap<Serializable, VcmsType>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsType vcmsType = fetchByPrimaryKey(primaryKey);

			if (vcmsType != null) {
				map.put(primaryKey, vcmsType);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
					VcmsTypeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsType)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VCMSTYPE_WHERE_PKS_IN);

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

			for (VcmsType vcmsType : (List<VcmsType>)q.list()) {
				map.put(vcmsType.getPrimaryKeyObj(), vcmsType);

				cacheResult(vcmsType);

				uncachedPrimaryKeys.remove(vcmsType.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
					VcmsTypeImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms types.
	 *
	 * @return the vcms types
	 */
	@Override
	public List<VcmsType> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms types
	 * @param end the upper bound of the range of vcms types (not inclusive)
	 * @return the range of vcms types
	 */
	@Override
	public List<VcmsType> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms types
	 * @param end the upper bound of the range of vcms types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms types
	 */
	@Override
	public List<VcmsType> findAll(int start, int end,
		OrderByComparator<VcmsType> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms types
	 * @param end the upper bound of the range of vcms types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms types
	 */
	@Override
	public List<VcmsType> findAll(int start, int end,
		OrderByComparator<VcmsType> orderByComparator, boolean retrieveFromCache) {
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

		List<VcmsType> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsType>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSTYPE;

				if (pagination) {
					sql = sql.concat(VcmsTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms types from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsType vcmsType : findAll()) {
			remove(vcmsType);
		}
	}

	/**
	 * Returns the number of vcms types.
	 *
	 * @return the number of vcms types
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSTYPE);

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
		return VcmsTypeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms type persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSTYPE = "SELECT vcmsType FROM VcmsType vcmsType";
	private static final String _SQL_SELECT_VCMSTYPE_WHERE_PKS_IN = "SELECT vcmsType FROM VcmsType vcmsType WHERE typeId IN (";
	private static final String _SQL_SELECT_VCMSTYPE_WHERE = "SELECT vcmsType FROM VcmsType vcmsType WHERE ";
	private static final String _SQL_COUNT_VCMSTYPE = "SELECT COUNT(vcmsType) FROM VcmsType vcmsType";
	private static final String _SQL_COUNT_VCMSTYPE_WHERE = "SELECT COUNT(vcmsType) FROM VcmsType vcmsType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsType exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsTypePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code"
			});
}