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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchFAQCategoryException;
import vn.gov.hoabinh.model.FAQCategory;
import vn.gov.hoabinh.model.impl.FAQCategoryImpl;
import vn.gov.hoabinh.model.impl.FAQCategoryModelImpl;
import vn.gov.hoabinh.service.persistence.FAQCategoryPersistence;

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
 * The persistence implementation for the f a q category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryPersistence
 * @see vn.gov.hoabinh.service.persistence.FAQCategoryUtil
 * @generated
 */
@ProviderType
public class FAQCategoryPersistenceImpl extends BasePersistenceImpl<FAQCategory>
	implements FAQCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FAQCategoryUtil} to access the f a q category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FAQCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByParentId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID =
		new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByParentId",
			new String[] { Long.class.getName() },
			FAQCategoryModelImpl.PARENT_COLUMN_BITMASK |
			FAQCategoryModelImpl.CATLEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PARENTID = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByParentId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the f a q categories where parent = &#63;.
	 *
	 * @param parent the parent
	 * @return the matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByParentId(long parent) {
		return findByParentId(parent, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q categories where parent = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parent the parent
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @return the range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByParentId(long parent, int start, int end) {
		return findByParentId(parent, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q categories where parent = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parent the parent
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByParentId(long parent, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return findByParentId(parent, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q categories where parent = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param parent the parent
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByParentId(long parent, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID;
			finderArgs = new Object[] { parent };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARENTID;
			finderArgs = new Object[] { parent, start, end, orderByComparator };
		}

		List<FAQCategory> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategory faqCategory : list) {
					if ((parent != faqCategory.getParent())) {
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

			query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_PARENTID_PARENT_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parent);

				if (!pagination) {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q category in the ordered set where parent = &#63;.
	 *
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByParentId_First(long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByParentId_First(parent,
				orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parent=");
		msg.append(parent);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the first f a q category in the ordered set where parent = &#63;.
	 *
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByParentId_First(long parent,
		OrderByComparator<FAQCategory> orderByComparator) {
		List<FAQCategory> list = findByParentId(parent, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q category in the ordered set where parent = &#63;.
	 *
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByParentId_Last(long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByParentId_Last(parent, orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("parent=");
		msg.append(parent);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the last f a q category in the ordered set where parent = &#63;.
	 *
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByParentId_Last(long parent,
		OrderByComparator<FAQCategory> orderByComparator) {
		int count = countByParentId(parent);

		if (count == 0) {
			return null;
		}

		List<FAQCategory> list = findByParentId(parent, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q categories before and after the current f a q category in the ordered set where parent = &#63;.
	 *
	 * @param id the primary key of the current f a q category
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q category
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory[] findByParentId_PrevAndNext(long id, long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQCategory[] array = new FAQCategoryImpl[3];

			array[0] = getByParentId_PrevAndNext(session, faqCategory, parent,
					orderByComparator, true);

			array[1] = faqCategory;

			array[2] = getByParentId_PrevAndNext(session, faqCategory, parent,
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

	protected FAQCategory getByParentId_PrevAndNext(Session session,
		FAQCategory faqCategory, long parent,
		OrderByComparator<FAQCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_PARENTID_PARENT_2);

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
			query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parent);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q categories where parent = &#63; from the database.
	 *
	 * @param parent the parent
	 */
	@Override
	public void removeByParentId(long parent) {
		for (FAQCategory faqCategory : findByParentId(parent,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqCategory);
		}
	}

	/**
	 * Returns the number of f a q categories where parent = &#63;.
	 *
	 * @param parent the parent
	 * @return the number of matching f a q categories
	 */
	@Override
	public int countByParentId(long parent) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PARENTID;

		Object[] finderArgs = new Object[] { parent };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_PARENTID_PARENT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parent);

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

	private static final String _FINDER_COLUMN_PARENTID_PARENT_2 = "faqCategory.parent = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			FAQCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			FAQCategoryModelImpl.LANGUAGE_COLUMN_BITMASK |
			FAQCategoryModelImpl.CATLEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the f a q categories where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q categories where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @return the range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L(long groupId, String language,
		int start, int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<FAQCategory> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<FAQCategory> orderByComparator,
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

		List<FAQCategory> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategory faqCategory : list) {
					if ((groupId != faqCategory.getGroupId()) ||
							!Objects.equals(language, faqCategory.getLanguage())) {
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

			query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

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
				query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
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
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByG_L_First(long groupId, String language,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByG_L_First(long groupId, String language,
		OrderByComparator<FAQCategory> orderByComparator) {
		List<FAQCategory> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByG_L_Last(long groupId, String language,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByG_L_Last(long groupId, String language,
		OrderByComparator<FAQCategory> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<FAQCategory> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param id the primary key of the current f a q category
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q category
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory[] findByG_L_PrevAndNext(long id, long groupId,
		String language, OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQCategory[] array = new FAQCategoryImpl[3];

			array[0] = getByG_L_PrevAndNext(session, faqCategory, groupId,
					language, orderByComparator, true);

			array[1] = faqCategory;

			array[2] = getByG_L_PrevAndNext(session, faqCategory, groupId,
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

	protected FAQCategory getByG_L_PrevAndNext(Session session,
		FAQCategory faqCategory, long groupId, String language,
		OrderByComparator<FAQCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

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
			query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(faqCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q categories where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (FAQCategory faqCategory : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqCategory);
		}
	}

	/**
	 * Returns the number of f a q categories where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching f a q categories
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FAQCATEGORY_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "faqCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "faqCategory.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "faqCategory.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(faqCategory.language IS NULL OR faqCategory.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			FAQCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			FAQCategoryModelImpl.LANGUAGE_COLUMN_BITMASK |
			FAQCategoryModelImpl.PARENT_COLUMN_BITMASK |
			FAQCategoryModelImpl.CATLEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @return the matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L_P(long groupId, String language,
		long parent) {
		return findByG_L_P(groupId, language, parent, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @return the range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L_P(long groupId, String language,
		long parent, int start, int end) {
		return findByG_L_P(groupId, language, parent, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L_P(long groupId, String language,
		long parent, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return findByG_L_P(groupId, language, parent, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByG_L_P(long groupId, String language,
		long parent, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P;
			finderArgs = new Object[] { groupId, language, parent };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_P;
			finderArgs = new Object[] {
					groupId, language, parent,
					
					start, end, orderByComparator
				};
		}

		List<FAQCategory> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategory faqCategory : list) {
					if ((groupId != faqCategory.getGroupId()) ||
							!Objects.equals(language, faqCategory.getLanguage()) ||
							(parent != faqCategory.getParent())) {
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

			query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

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

			query.append(_FINDER_COLUMN_G_L_P_PARENT_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
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

				qPos.add(parent);

				if (!pagination) {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByG_L_P_First(long groupId, String language,
		long parent, OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByG_L_P_First(groupId, language, parent,
				orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parent=");
		msg.append(parent);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByG_L_P_First(long groupId, String language,
		long parent, OrderByComparator<FAQCategory> orderByComparator) {
		List<FAQCategory> list = findByG_L_P(groupId, language, parent, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByG_L_P_Last(long groupId, String language,
		long parent, OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByG_L_P_Last(groupId, language, parent,
				orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", parent=");
		msg.append(parent);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByG_L_P_Last(long groupId, String language,
		long parent, OrderByComparator<FAQCategory> orderByComparator) {
		int count = countByG_L_P(groupId, language, parent);

		if (count == 0) {
			return null;
		}

		List<FAQCategory> list = findByG_L_P(groupId, language, parent,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param id the primary key of the current f a q category
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q category
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory[] findByG_L_P_PrevAndNext(long id, long groupId,
		String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQCategory[] array = new FAQCategoryImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, faqCategory, groupId,
					language, parent, orderByComparator, true);

			array[1] = faqCategory;

			array[2] = getByG_L_P_PrevAndNext(session, faqCategory, groupId,
					language, parent, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQCategory getByG_L_P_PrevAndNext(Session session,
		FAQCategory faqCategory, long groupId, String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

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

		query.append(_FINDER_COLUMN_G_L_P_PARENT_2);

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
			query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
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

		qPos.add(parent);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 */
	@Override
	public void removeByG_L_P(long groupId, String language, long parent) {
		for (FAQCategory faqCategory : findByG_L_P(groupId, language, parent,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqCategory);
		}
	}

	/**
	 * Returns the number of f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param parent the parent
	 * @return the number of matching f a q categories
	 */
	@Override
	public int countByG_L_P(long groupId, String language, long parent) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_P;

		Object[] finderArgs = new Object[] { groupId, language, parent };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FAQCATEGORY_WHERE);

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

			query.append(_FINDER_COLUMN_G_L_P_PARENT_2);

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

				qPos.add(parent);

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

	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "faqCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "faqCategory.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "faqCategory.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(faqCategory.language IS NULL OR faqCategory.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENT_2 = "faqCategory.parent = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMenu",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, FAQCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMenu",
			new String[] { Long.class.getName() },
			FAQCategoryModelImpl.ID_COLUMN_BITMASK |
			FAQCategoryModelImpl.CATLEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MENU = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMenu",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU = new FinderPath(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByMenu",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the f a q categories where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long id) {
		return findByMenu(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q categories where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @return the range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long id, int start, int end) {
		return findByMenu(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q categories where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long id, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return findByMenu(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q categories where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long id, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU;
			finderArgs = new Object[] { id, start, end, orderByComparator };
		}

		List<FAQCategory> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategory faqCategory : list) {
					if ((id != faqCategory.getId())) {
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

			query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_MENU_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q category in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByMenu_First(long id,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByMenu_First(id, orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the first f a q category in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByMenu_First(long id,
		OrderByComparator<FAQCategory> orderByComparator) {
		List<FAQCategory> list = findByMenu(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q category in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category
	 * @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory findByMenu_Last(long id,
		OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByMenu_Last(id, orderByComparator);

		if (faqCategory != null) {
			return faqCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryException(msg.toString());
	}

	/**
	 * Returns the last f a q category in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	 */
	@Override
	public FAQCategory fetchByMenu_Last(long id,
		OrderByComparator<FAQCategory> orderByComparator) {
		int count = countByMenu(id);

		if (count == 0) {
			return null;
		}

		List<FAQCategory> list = findByMenu(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns all the f a q categories where id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ids the IDs
	 * @return the matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long[] ids) {
		return findByMenu(ids, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q categories where id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ids the IDs
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @return the range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long[] ids, int start, int end) {
		return findByMenu(ids, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q categories where id = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ids the IDs
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long[] ids, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return findByMenu(ids, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q categories where id = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q categories
	 */
	@Override
	public List<FAQCategory> findByMenu(long[] ids, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		if (ids == null) {
			ids = new long[0];
		}
		else if (ids.length > 1) {
			ids = ArrayUtil.unique(ids);

			Arrays.sort(ids);
		}

		if (ids.length == 1) {
			return findByMenu(ids[0], start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(ids) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(ids),
					
					start, end, orderByComparator
				};
		}

		List<FAQCategory> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategory>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategory faqCategory : list) {
					if (!ArrayUtil.contains(ids, faqCategory.getId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_FAQCATEGORY_WHERE);

			if (ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_MENU_ID_7);

				query.append(StringUtil.merge(ids));

				query.append(StringPool.CLOSE_PARENTHESIS);

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
				query.append(FAQCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_MENU,
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
	 * Removes all the f a q categories where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByMenu(long id) {
		for (FAQCategory faqCategory : findByMenu(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(faqCategory);
		}
	}

	/**
	 * Returns the number of f a q categories where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching f a q categories
	 */
	@Override
	public int countByMenu(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MENU;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_MENU_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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
	 * Returns the number of f a q categories where id = any &#63;.
	 *
	 * @param ids the IDs
	 * @return the number of matching f a q categories
	 */
	@Override
	public int countByMenu(long[] ids) {
		if (ids == null) {
			ids = new long[0];
		}
		else if (ids.length > 1) {
			ids = ArrayUtil.unique(ids);

			Arrays.sort(ids);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(ids) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_FAQCATEGORY_WHERE);

			if (ids.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_MENU_ID_7);

				query.append(StringUtil.merge(ids));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_MENU,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MENU_ID_2 = "faqCategory.id = ?";
	private static final String _FINDER_COLUMN_MENU_ID_7 = "faqCategory.id IN (";

	public FAQCategoryPersistenceImpl() {
		setModelClass(FAQCategory.class);
	}

	/**
	 * Caches the f a q category in the entity cache if it is enabled.
	 *
	 * @param faqCategory the f a q category
	 */
	@Override
	public void cacheResult(FAQCategory faqCategory) {
		entityCache.putResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryImpl.class, faqCategory.getPrimaryKey(), faqCategory);

		faqCategory.resetOriginalValues();
	}

	/**
	 * Caches the f a q categories in the entity cache if it is enabled.
	 *
	 * @param faqCategories the f a q categories
	 */
	@Override
	public void cacheResult(List<FAQCategory> faqCategories) {
		for (FAQCategory faqCategory : faqCategories) {
			if (entityCache.getResult(
						FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
						FAQCategoryImpl.class, faqCategory.getPrimaryKey()) == null) {
				cacheResult(faqCategory);
			}
			else {
				faqCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all f a q categories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FAQCategoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the f a q category.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FAQCategory faqCategory) {
		entityCache.removeResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryImpl.class, faqCategory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FAQCategory> faqCategories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FAQCategory faqCategory : faqCategories) {
			entityCache.removeResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
				FAQCategoryImpl.class, faqCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	 *
	 * @param id the primary key for the new f a q category
	 * @return the new f a q category
	 */
	@Override
	public FAQCategory create(long id) {
		FAQCategory faqCategory = new FAQCategoryImpl();

		faqCategory.setNew(true);
		faqCategory.setPrimaryKey(id);

		return faqCategory;
	}

	/**
	 * Removes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the f a q category
	 * @return the f a q category that was removed
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory remove(long id) throws NoSuchFAQCategoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q category
	 * @return the f a q category that was removed
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory remove(Serializable primaryKey)
		throws NoSuchFAQCategoryException {
		Session session = null;

		try {
			session = openSession();

			FAQCategory faqCategory = (FAQCategory)session.get(FAQCategoryImpl.class,
					primaryKey);

			if (faqCategory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFAQCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faqCategory);
		}
		catch (NoSuchFAQCategoryException nsee) {
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
	protected FAQCategory removeImpl(FAQCategory faqCategory) {
		faqCategory = toUnwrappedModel(faqCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(faqCategory)) {
				faqCategory = (FAQCategory)session.get(FAQCategoryImpl.class,
						faqCategory.getPrimaryKeyObj());
			}

			if (faqCategory != null) {
				session.delete(faqCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (faqCategory != null) {
			clearCache(faqCategory);
		}

		return faqCategory;
	}

	@Override
	public FAQCategory updateImpl(FAQCategory faqCategory) {
		faqCategory = toUnwrappedModel(faqCategory);

		boolean isNew = faqCategory.isNew();

		FAQCategoryModelImpl faqCategoryModelImpl = (FAQCategoryModelImpl)faqCategory;

		Session session = null;

		try {
			session = openSession();

			if (faqCategory.isNew()) {
				session.save(faqCategory);

				faqCategory.setNew(false);
			}
			else {
				faqCategory = (FAQCategory)session.merge(faqCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FAQCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((faqCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCategoryModelImpl.getOriginalParent()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
					args);

				args = new Object[] { faqCategoryModelImpl.getParent() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PARENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARENTID,
					args);
			}

			if ((faqCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCategoryModelImpl.getOriginalGroupId(),
						faqCategoryModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						faqCategoryModelImpl.getGroupId(),
						faqCategoryModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((faqCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCategoryModelImpl.getOriginalGroupId(),
						faqCategoryModelImpl.getOriginalLanguage(),
						faqCategoryModelImpl.getOriginalParent()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);

				args = new Object[] {
						faqCategoryModelImpl.getGroupId(),
						faqCategoryModelImpl.getLanguage(),
						faqCategoryModelImpl.getParent()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_P, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_P,
					args);
			}

			if ((faqCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCategoryModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);

				args = new Object[] { faqCategoryModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MENU, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MENU,
					args);
			}
		}

		entityCache.putResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryImpl.class, faqCategory.getPrimaryKey(), faqCategory,
			false);

		faqCategory.resetOriginalValues();

		return faqCategory;
	}

	protected FAQCategory toUnwrappedModel(FAQCategory faqCategory) {
		if (faqCategory instanceof FAQCategoryImpl) {
			return faqCategory;
		}

		FAQCategoryImpl faqCategoryImpl = new FAQCategoryImpl();

		faqCategoryImpl.setNew(faqCategory.isNew());
		faqCategoryImpl.setPrimaryKey(faqCategory.getPrimaryKey());

		faqCategoryImpl.setId(faqCategory.getId());
		faqCategoryImpl.setName(faqCategory.getName());
		faqCategoryImpl.setDescription(faqCategory.getDescription());
		faqCategoryImpl.setLanguage(faqCategory.getLanguage());
		faqCategoryImpl.setParent(faqCategory.getParent());
		faqCategoryImpl.setCatorder(faqCategory.getCatorder());
		faqCategoryImpl.setCatlevel(faqCategory.getCatlevel());
		faqCategoryImpl.setImage(faqCategory.getImage());
		faqCategoryImpl.setCreatedByUser(faqCategory.getCreatedByUser());
		faqCategoryImpl.setCreatedDate(faqCategory.getCreatedDate());
		faqCategoryImpl.setModifiedByUser(faqCategory.getModifiedByUser());
		faqCategoryImpl.setModifiedDate(faqCategory.getModifiedDate());
		faqCategoryImpl.setGroupId(faqCategory.getGroupId());
		faqCategoryImpl.setUserId(faqCategory.getUserId());

		return faqCategoryImpl;
	}

	/**
	 * Returns the f a q category with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q category
	 * @return the f a q category
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFAQCategoryException {
		FAQCategory faqCategory = fetchByPrimaryKey(primaryKey);

		if (faqCategory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFAQCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return faqCategory;
	}

	/**
	 * Returns the f a q category with the primary key or throws a {@link NoSuchFAQCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the f a q category
	 * @return the f a q category
	 * @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory findByPrimaryKey(long id)
		throws NoSuchFAQCategoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the f a q category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q category
	 * @return the f a q category, or <code>null</code> if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
				FAQCategoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		FAQCategory faqCategory = (FAQCategory)serializable;

		if (faqCategory == null) {
			Session session = null;

			try {
				session = openSession();

				faqCategory = (FAQCategory)session.get(FAQCategoryImpl.class,
						primaryKey);

				if (faqCategory != null) {
					cacheResult(faqCategory);
				}
				else {
					entityCache.putResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
						FAQCategoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
					FAQCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return faqCategory;
	}

	/**
	 * Returns the f a q category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the f a q category
	 * @return the f a q category, or <code>null</code> if a f a q category with the primary key could not be found
	 */
	@Override
	public FAQCategory fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, FAQCategory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, FAQCategory> map = new HashMap<Serializable, FAQCategory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			FAQCategory faqCategory = fetchByPrimaryKey(primaryKey);

			if (faqCategory != null) {
				map.put(primaryKey, faqCategory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
					FAQCategoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (FAQCategory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FAQCATEGORY_WHERE_PKS_IN);

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

			for (FAQCategory faqCategory : (List<FAQCategory>)q.list()) {
				map.put(faqCategory.getPrimaryKeyObj(), faqCategory);

				cacheResult(faqCategory);

				uncachedPrimaryKeys.remove(faqCategory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FAQCategoryModelImpl.ENTITY_CACHE_ENABLED,
					FAQCategoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the f a q categories.
	 *
	 * @return the f a q categories
	 */
	@Override
	public List<FAQCategory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @return the range of f a q categories
	 */
	@Override
	public List<FAQCategory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of f a q categories
	 */
	@Override
	public List<FAQCategory> findAll(int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q categories
	 * @param end the upper bound of the range of f a q categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of f a q categories
	 */
	@Override
	public List<FAQCategory> findAll(int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
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

		List<FAQCategory> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAQCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQCATEGORY;

				if (pagination) {
					sql = sql.concat(FAQCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the f a q categories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FAQCategory faqCategory : findAll()) {
			remove(faqCategory);
		}
	}

	/**
	 * Returns the number of f a q categories.
	 *
	 * @return the number of f a q categories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAQCATEGORY);

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
		return FAQCategoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the f a q category persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FAQCategoryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAQCATEGORY = "SELECT faqCategory FROM FAQCategory faqCategory";
	private static final String _SQL_SELECT_FAQCATEGORY_WHERE_PKS_IN = "SELECT faqCategory FROM FAQCategory faqCategory WHERE id_ IN (";
	private static final String _SQL_SELECT_FAQCATEGORY_WHERE = "SELECT faqCategory FROM FAQCategory faqCategory WHERE ";
	private static final String _SQL_COUNT_FAQCATEGORY = "SELECT COUNT(faqCategory) FROM FAQCategory faqCategory";
	private static final String _SQL_COUNT_FAQCATEGORY_WHERE = "SELECT COUNT(faqCategory) FROM FAQCategory faqCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faqCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FAQCategory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FAQCategoryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}