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

import vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException;
import vn.gov.hoabinh.model.impl.vdocFieldLevelRelImpl;
import vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl;
import vn.gov.hoabinh.model.vdocFieldLevelRel;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vdoc field level rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelPersistence
 * @see vn.gov.hoabinh.service.persistence.vdocFieldLevelRelUtil
 * @generated
 */
@ProviderType
public class vdocFieldLevelRelPersistenceImpl extends BasePersistenceImpl<vdocFieldLevelRel>
	implements vdocFieldLevelRelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vdocFieldLevelRelUtil} to access the vdoc field level rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vdocFieldLevelRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LEVEL = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLevel",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEVEL = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLevel",
			new String[] { String.class.getName() },
			vdocFieldLevelRelModelImpl.LEVELID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LEVEL = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLevel",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vdoc field level rels where levelId = &#63;.
	 *
	 * @param levelId the level ID
	 * @return the matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByLevel(String levelId) {
		return findByLevel(levelId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc field level rels where levelId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param levelId the level ID
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @return the range of matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByLevel(String levelId, int start,
		int end) {
		return findByLevel(levelId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc field level rels where levelId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param levelId the level ID
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByLevel(String levelId, int start,
		int end, OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return findByLevel(levelId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc field level rels where levelId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param levelId the level ID
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByLevel(String levelId, int start,
		int end, OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEVEL;
			finderArgs = new Object[] { levelId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LEVEL;
			finderArgs = new Object[] { levelId, start, end, orderByComparator };
		}

		List<vdocFieldLevelRel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocFieldLevelRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocFieldLevelRel vdocFieldLevelRel : list) {
					if (!Objects.equals(levelId, vdocFieldLevelRel.getLevelId())) {
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

			query.append(_SQL_SELECT_VDOCFIELDLEVELREL_WHERE);

			boolean bindLevelId = false;

			if (levelId == null) {
				query.append(_FINDER_COLUMN_LEVEL_LEVELID_1);
			}
			else if (levelId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LEVEL_LEVELID_3);
			}
			else {
				bindLevelId = true;

				query.append(_FINDER_COLUMN_LEVEL_LEVELID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocFieldLevelRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLevelId) {
					qPos.add(levelId);
				}

				if (!pagination) {
					list = (List<vdocFieldLevelRel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocFieldLevelRel>)QueryUtil.list(q,
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
	 * Returns the first vdoc field level rel in the ordered set where levelId = &#63;.
	 *
	 * @param levelId the level ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel findByLevel_First(String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = fetchByLevel_First(levelId,
				orderByComparator);

		if (vdocFieldLevelRel != null) {
			return vdocFieldLevelRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("levelId=");
		msg.append(levelId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocFieldLevelRelException(msg.toString());
	}

	/**
	 * Returns the first vdoc field level rel in the ordered set where levelId = &#63;.
	 *
	 * @param levelId the level ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel fetchByLevel_First(String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		List<vdocFieldLevelRel> list = findByLevel(levelId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc field level rel in the ordered set where levelId = &#63;.
	 *
	 * @param levelId the level ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel findByLevel_Last(String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = fetchByLevel_Last(levelId,
				orderByComparator);

		if (vdocFieldLevelRel != null) {
			return vdocFieldLevelRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("levelId=");
		msg.append(levelId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocFieldLevelRelException(msg.toString());
	}

	/**
	 * Returns the last vdoc field level rel in the ordered set where levelId = &#63;.
	 *
	 * @param levelId the level ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel fetchByLevel_Last(String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		int count = countByLevel(levelId);

		if (count == 0) {
			return null;
		}

		List<vdocFieldLevelRel> list = findByLevel(levelId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc field level rels before and after the current vdoc field level rel in the ordered set where levelId = &#63;.
	 *
	 * @param vdocFieldLevelRelPK the primary key of the current vdoc field level rel
	 * @param levelId the level ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel[] findByLevel_PrevAndNext(
		vdocFieldLevelRelPK vdocFieldLevelRelPK, String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = findByPrimaryKey(vdocFieldLevelRelPK);

		Session session = null;

		try {
			session = openSession();

			vdocFieldLevelRel[] array = new vdocFieldLevelRelImpl[3];

			array[0] = getByLevel_PrevAndNext(session, vdocFieldLevelRel,
					levelId, orderByComparator, true);

			array[1] = vdocFieldLevelRel;

			array[2] = getByLevel_PrevAndNext(session, vdocFieldLevelRel,
					levelId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocFieldLevelRel getByLevel_PrevAndNext(Session session,
		vdocFieldLevelRel vdocFieldLevelRel, String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCFIELDLEVELREL_WHERE);

		boolean bindLevelId = false;

		if (levelId == null) {
			query.append(_FINDER_COLUMN_LEVEL_LEVELID_1);
		}
		else if (levelId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LEVEL_LEVELID_3);
		}
		else {
			bindLevelId = true;

			query.append(_FINDER_COLUMN_LEVEL_LEVELID_2);
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
			query.append(vdocFieldLevelRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLevelId) {
			qPos.add(levelId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocFieldLevelRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocFieldLevelRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc field level rels where levelId = &#63; from the database.
	 *
	 * @param levelId the level ID
	 */
	@Override
	public void removeByLevel(String levelId) {
		for (vdocFieldLevelRel vdocFieldLevelRel : findByLevel(levelId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocFieldLevelRel);
		}
	}

	/**
	 * Returns the number of vdoc field level rels where levelId = &#63;.
	 *
	 * @param levelId the level ID
	 * @return the number of matching vdoc field level rels
	 */
	@Override
	public int countByLevel(String levelId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LEVEL;

		Object[] finderArgs = new Object[] { levelId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCFIELDLEVELREL_WHERE);

			boolean bindLevelId = false;

			if (levelId == null) {
				query.append(_FINDER_COLUMN_LEVEL_LEVELID_1);
			}
			else if (levelId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LEVEL_LEVELID_3);
			}
			else {
				bindLevelId = true;

				query.append(_FINDER_COLUMN_LEVEL_LEVELID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLevelId) {
					qPos.add(levelId);
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

	private static final String _FINDER_COLUMN_LEVEL_LEVELID_1 = "vdocFieldLevelRel.id.levelId IS NULL";
	private static final String _FINDER_COLUMN_LEVEL_LEVELID_2 = "vdocFieldLevelRel.id.levelId = ?";
	private static final String _FINDER_COLUMN_LEVEL_LEVELID_3 = "(vdocFieldLevelRel.id.levelId IS NULL OR vdocFieldLevelRel.id.levelId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField",
			new String[] { String.class.getName() },
			vdocFieldLevelRelModelImpl.FIELDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vdoc field level rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByField(String fieldId) {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc field level rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @return the range of matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByField(String fieldId, int start,
		int end) {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc field level rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByField(String fieldId, int start,
		int end, OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return findByField(fieldId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc field level rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findByField(String fieldId, int start,
		int end, OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD;
			finderArgs = new Object[] { fieldId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD;
			finderArgs = new Object[] { fieldId, start, end, orderByComparator };
		}

		List<vdocFieldLevelRel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocFieldLevelRel>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocFieldLevelRel vdocFieldLevelRel : list) {
					if (!Objects.equals(fieldId, vdocFieldLevelRel.getFieldId())) {
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

			query.append(_SQL_SELECT_VDOCFIELDLEVELREL_WHERE);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocFieldLevelRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				if (!pagination) {
					list = (List<vdocFieldLevelRel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocFieldLevelRel>)QueryUtil.list(q,
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
	 * Returns the first vdoc field level rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel findByField_First(String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = fetchByField_First(fieldId,
				orderByComparator);

		if (vdocFieldLevelRel != null) {
			return vdocFieldLevelRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocFieldLevelRelException(msg.toString());
	}

	/**
	 * Returns the first vdoc field level rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel fetchByField_First(String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		List<vdocFieldLevelRel> list = findByField(fieldId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc field level rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel findByField_Last(String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = fetchByField_Last(fieldId,
				orderByComparator);

		if (vdocFieldLevelRel != null) {
			return vdocFieldLevelRel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocFieldLevelRelException(msg.toString());
	}

	/**
	 * Returns the last vdoc field level rel in the ordered set where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	 */
	@Override
	public vdocFieldLevelRel fetchByField_Last(String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		int count = countByField(fieldId);

		if (count == 0) {
			return null;
		}

		List<vdocFieldLevelRel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc field level rels before and after the current vdoc field level rel in the ordered set where fieldId = &#63;.
	 *
	 * @param vdocFieldLevelRelPK the primary key of the current vdoc field level rel
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel[] findByField_PrevAndNext(
		vdocFieldLevelRelPK vdocFieldLevelRelPK, String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = findByPrimaryKey(vdocFieldLevelRelPK);

		Session session = null;

		try {
			session = openSession();

			vdocFieldLevelRel[] array = new vdocFieldLevelRelImpl[3];

			array[0] = getByField_PrevAndNext(session, vdocFieldLevelRel,
					fieldId, orderByComparator, true);

			array[1] = vdocFieldLevelRel;

			array[2] = getByField_PrevAndNext(session, vdocFieldLevelRel,
					fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocFieldLevelRel getByField_PrevAndNext(Session session,
		vdocFieldLevelRel vdocFieldLevelRel, String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCFIELDLEVELREL_WHERE);

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
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
			query.append(vdocFieldLevelRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocFieldLevelRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocFieldLevelRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc field level rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByField(String fieldId) {
		for (vdocFieldLevelRel vdocFieldLevelRel : findByField(fieldId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocFieldLevelRel);
		}
	}

	/**
	 * Returns the number of vdoc field level rels where fieldId = &#63;.
	 *
	 * @param fieldId the field ID
	 * @return the number of matching vdoc field level rels
	 */
	@Override
	public int countByField(String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD;

		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCFIELDLEVELREL_WHERE);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFieldId) {
					qPos.add(fieldId);
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

	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vdocFieldLevelRel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vdocFieldLevelRel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vdocFieldLevelRel.id.fieldId IS NULL OR vdocFieldLevelRel.id.fieldId = '')";

	public vdocFieldLevelRelPersistenceImpl() {
		setModelClass(vdocFieldLevelRel.class);
	}

	/**
	 * Caches the vdoc field level rel in the entity cache if it is enabled.
	 *
	 * @param vdocFieldLevelRel the vdoc field level rel
	 */
	@Override
	public void cacheResult(vdocFieldLevelRel vdocFieldLevelRel) {
		entityCache.putResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class, vdocFieldLevelRel.getPrimaryKey(),
			vdocFieldLevelRel);

		vdocFieldLevelRel.resetOriginalValues();
	}

	/**
	 * Caches the vdoc field level rels in the entity cache if it is enabled.
	 *
	 * @param vdocFieldLevelRels the vdoc field level rels
	 */
	@Override
	public void cacheResult(List<vdocFieldLevelRel> vdocFieldLevelRels) {
		for (vdocFieldLevelRel vdocFieldLevelRel : vdocFieldLevelRels) {
			if (entityCache.getResult(
						vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
						vdocFieldLevelRelImpl.class,
						vdocFieldLevelRel.getPrimaryKey()) == null) {
				cacheResult(vdocFieldLevelRel);
			}
			else {
				vdocFieldLevelRel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vdoc field level rels.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vdocFieldLevelRelImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vdoc field level rel.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vdocFieldLevelRel vdocFieldLevelRel) {
		entityCache.removeResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class, vdocFieldLevelRel.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<vdocFieldLevelRel> vdocFieldLevelRels) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vdocFieldLevelRel vdocFieldLevelRel : vdocFieldLevelRels) {
			entityCache.removeResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
				vdocFieldLevelRelImpl.class, vdocFieldLevelRel.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vdoc field level rel with the primary key. Does not add the vdoc field level rel to the database.
	 *
	 * @param vdocFieldLevelRelPK the primary key for the new vdoc field level rel
	 * @return the new vdoc field level rel
	 */
	@Override
	public vdocFieldLevelRel create(vdocFieldLevelRelPK vdocFieldLevelRelPK) {
		vdocFieldLevelRel vdocFieldLevelRel = new vdocFieldLevelRelImpl();

		vdocFieldLevelRel.setNew(true);
		vdocFieldLevelRel.setPrimaryKey(vdocFieldLevelRelPK);

		return vdocFieldLevelRel;
	}

	/**
	 * Removes the vdoc field level rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	 * @return the vdoc field level rel that was removed
	 * @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel remove(vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws NoSuchvdocFieldLevelRelException {
		return remove((Serializable)vdocFieldLevelRelPK);
	}

	/**
	 * Removes the vdoc field level rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc field level rel
	 * @return the vdoc field level rel that was removed
	 * @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel remove(Serializable primaryKey)
		throws NoSuchvdocFieldLevelRelException {
		Session session = null;

		try {
			session = openSession();

			vdocFieldLevelRel vdocFieldLevelRel = (vdocFieldLevelRel)session.get(vdocFieldLevelRelImpl.class,
					primaryKey);

			if (vdocFieldLevelRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvdocFieldLevelRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vdocFieldLevelRel);
		}
		catch (NoSuchvdocFieldLevelRelException nsee) {
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
	protected vdocFieldLevelRel removeImpl(vdocFieldLevelRel vdocFieldLevelRel) {
		vdocFieldLevelRel = toUnwrappedModel(vdocFieldLevelRel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vdocFieldLevelRel)) {
				vdocFieldLevelRel = (vdocFieldLevelRel)session.get(vdocFieldLevelRelImpl.class,
						vdocFieldLevelRel.getPrimaryKeyObj());
			}

			if (vdocFieldLevelRel != null) {
				session.delete(vdocFieldLevelRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vdocFieldLevelRel != null) {
			clearCache(vdocFieldLevelRel);
		}

		return vdocFieldLevelRel;
	}

	@Override
	public vdocFieldLevelRel updateImpl(vdocFieldLevelRel vdocFieldLevelRel) {
		vdocFieldLevelRel = toUnwrappedModel(vdocFieldLevelRel);

		boolean isNew = vdocFieldLevelRel.isNew();

		vdocFieldLevelRelModelImpl vdocFieldLevelRelModelImpl = (vdocFieldLevelRelModelImpl)vdocFieldLevelRel;

		Session session = null;

		try {
			session = openSession();

			if (vdocFieldLevelRel.isNew()) {
				session.save(vdocFieldLevelRel);

				vdocFieldLevelRel.setNew(false);
			}
			else {
				vdocFieldLevelRel = (vdocFieldLevelRel)session.merge(vdocFieldLevelRel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !vdocFieldLevelRelModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vdocFieldLevelRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocFieldLevelRelModelImpl.getOriginalLevelId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LEVEL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEVEL,
					args);

				args = new Object[] { vdocFieldLevelRelModelImpl.getLevelId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LEVEL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEVEL,
					args);
			}

			if ((vdocFieldLevelRelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocFieldLevelRelModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);

				args = new Object[] { vdocFieldLevelRelModelImpl.getFieldId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD,
					args);
			}
		}

		entityCache.putResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldLevelRelImpl.class, vdocFieldLevelRel.getPrimaryKey(),
			vdocFieldLevelRel, false);

		vdocFieldLevelRel.resetOriginalValues();

		return vdocFieldLevelRel;
	}

	protected vdocFieldLevelRel toUnwrappedModel(
		vdocFieldLevelRel vdocFieldLevelRel) {
		if (vdocFieldLevelRel instanceof vdocFieldLevelRelImpl) {
			return vdocFieldLevelRel;
		}

		vdocFieldLevelRelImpl vdocFieldLevelRelImpl = new vdocFieldLevelRelImpl();

		vdocFieldLevelRelImpl.setNew(vdocFieldLevelRel.isNew());
		vdocFieldLevelRelImpl.setPrimaryKey(vdocFieldLevelRel.getPrimaryKey());

		vdocFieldLevelRelImpl.setFieldId(vdocFieldLevelRel.getFieldId());
		vdocFieldLevelRelImpl.setLevelId(vdocFieldLevelRel.getLevelId());

		return vdocFieldLevelRelImpl;
	}

	/**
	 * Returns the vdoc field level rel with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc field level rel
	 * @return the vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvdocFieldLevelRelException {
		vdocFieldLevelRel vdocFieldLevelRel = fetchByPrimaryKey(primaryKey);

		if (vdocFieldLevelRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvdocFieldLevelRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vdocFieldLevelRel;
	}

	/**
	 * Returns the vdoc field level rel with the primary key or throws a {@link NoSuchvdocFieldLevelRelException} if it could not be found.
	 *
	 * @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	 * @return the vdoc field level rel
	 * @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel findByPrimaryKey(
		vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws NoSuchvdocFieldLevelRelException {
		return findByPrimaryKey((Serializable)vdocFieldLevelRelPK);
	}

	/**
	 * Returns the vdoc field level rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc field level rel
	 * @return the vdoc field level rel, or <code>null</code> if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
				vdocFieldLevelRelImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		vdocFieldLevelRel vdocFieldLevelRel = (vdocFieldLevelRel)serializable;

		if (vdocFieldLevelRel == null) {
			Session session = null;

			try {
				session = openSession();

				vdocFieldLevelRel = (vdocFieldLevelRel)session.get(vdocFieldLevelRelImpl.class,
						primaryKey);

				if (vdocFieldLevelRel != null) {
					cacheResult(vdocFieldLevelRel);
				}
				else {
					entityCache.putResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
						vdocFieldLevelRelImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(vdocFieldLevelRelModelImpl.ENTITY_CACHE_ENABLED,
					vdocFieldLevelRelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vdocFieldLevelRel;
	}

	/**
	 * Returns the vdoc field level rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	 * @return the vdoc field level rel, or <code>null</code> if a vdoc field level rel with the primary key could not be found
	 */
	@Override
	public vdocFieldLevelRel fetchByPrimaryKey(
		vdocFieldLevelRelPK vdocFieldLevelRelPK) {
		return fetchByPrimaryKey((Serializable)vdocFieldLevelRelPK);
	}

	@Override
	public Map<Serializable, vdocFieldLevelRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, vdocFieldLevelRel> map = new HashMap<Serializable, vdocFieldLevelRel>();

		for (Serializable primaryKey : primaryKeys) {
			vdocFieldLevelRel vdocFieldLevelRel = fetchByPrimaryKey(primaryKey);

			if (vdocFieldLevelRel != null) {
				map.put(primaryKey, vdocFieldLevelRel);
			}
		}

		return map;
	}

	/**
	 * Returns all the vdoc field level rels.
	 *
	 * @return the vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc field level rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @return the range of vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc field level rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findAll(int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc field level rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc field level rels
	 * @param end the upper bound of the range of vdoc field level rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vdoc field level rels
	 */
	@Override
	public List<vdocFieldLevelRel> findAll(int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator,
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

		List<vdocFieldLevelRel> list = null;

		if (retrieveFromCache) {
			list = (List<vdocFieldLevelRel>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VDOCFIELDLEVELREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCFIELDLEVELREL;

				if (pagination) {
					sql = sql.concat(vdocFieldLevelRelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vdocFieldLevelRel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocFieldLevelRel>)QueryUtil.list(q,
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
	 * Removes all the vdoc field level rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vdocFieldLevelRel vdocFieldLevelRel : findAll()) {
			remove(vdocFieldLevelRel);
		}
	}

	/**
	 * Returns the number of vdoc field level rels.
	 *
	 * @return the number of vdoc field level rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VDOCFIELDLEVELREL);

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
		return vdocFieldLevelRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vdoc field level rel persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(vdocFieldLevelRelImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VDOCFIELDLEVELREL = "SELECT vdocFieldLevelRel FROM vdocFieldLevelRel vdocFieldLevelRel";
	private static final String _SQL_SELECT_VDOCFIELDLEVELREL_WHERE = "SELECT vdocFieldLevelRel FROM vdocFieldLevelRel vdocFieldLevelRel WHERE ";
	private static final String _SQL_COUNT_VDOCFIELDLEVELREL = "SELECT COUNT(vdocFieldLevelRel) FROM vdocFieldLevelRel vdocFieldLevelRel";
	private static final String _SQL_COUNT_VDOCFIELDLEVELREL_WHERE = "SELECT COUNT(vdocFieldLevelRel) FROM vdocFieldLevelRel vdocFieldLevelRel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocFieldLevelRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocFieldLevelRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocFieldLevelRel exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(vdocFieldLevelRelPersistenceImpl.class);
}