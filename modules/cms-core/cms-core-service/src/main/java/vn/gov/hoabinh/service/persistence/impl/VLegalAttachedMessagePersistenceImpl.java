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

import vn.gov.hoabinh.exception.NoSuchVLegalAttachedMessageException;
import vn.gov.hoabinh.model.VLegalAttachedMessage;
import vn.gov.hoabinh.model.impl.VLegalAttachedMessageImpl;
import vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl;
import vn.gov.hoabinh.service.persistence.VLegalAttachedMessagePersistence;

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
 * The persistence implementation for the v legal attached message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessagePersistence
 * @see vn.gov.hoabinh.service.persistence.VLegalAttachedMessageUtil
 * @generated
 */
@ProviderType
public class VLegalAttachedMessagePersistenceImpl extends BasePersistenceImpl<VLegalAttachedMessage>
	implements VLegalAttachedMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VLegalAttachedMessageUtil} to access the v legal attached message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalAttachedMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VLegalAttachedMessageModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the v legal attached messages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal attached messages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @return the range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByGroupId(long groupId, int start,
		int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalAttachedMessage> orderByComparator,
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

		List<VLegalAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalAttachedMessage vLegalAttachedMessage : list) {
					if ((groupId != vLegalAttachedMessage.getGroupId())) {
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByGroupId_First(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByGroupId_First(groupId,
				orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		List<VLegalAttachedMessage> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByGroupId_Last(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VLegalAttachedMessage> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63;.
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage[] findByGroupId_PrevAndNext(String messageId,
		long groupId, OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalAttachedMessage,
					groupId, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByGroupId_PrevAndNext(session, vLegalAttachedMessage,
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

	protected VLegalAttachedMessage getByGroupId_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, long groupId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal attached messages where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByGroupId(
				groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Returns the number of v legal attached messages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching v legal attached messages
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalAttachedMessage.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VLegalAttachedMessageModelImpl.ARTICLEID_COLUMN_BITMASK |
			VLegalAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the v legal attached messages where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the v legal attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @return the range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByArticle(String articleId,
		int start, int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByArticle(String articleId,
		int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByArticle(String articleId,
		int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
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

		List<VLegalAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalAttachedMessage vLegalAttachedMessage : list) {
					if (!Objects.equals(articleId,
								vLegalAttachedMessage.getArticleId())) {
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

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
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByArticle_First(String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByArticle_First(articleId,
				orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByArticle_First(String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		List<VLegalAttachedMessage> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByArticle_Last(String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByArticle_Last(String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VLegalAttachedMessage> list = findByArticle(articleId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63;.
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage[] findByArticle_PrevAndNext(String messageId,
		String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vLegalAttachedMessage,
					articleId, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByArticle_PrevAndNext(session, vLegalAttachedMessage,
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

	protected VLegalAttachedMessage getByArticle_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, String articleId,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal attached messages where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByArticle(
				articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Returns the number of v legal attached messages where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching v legal attached messages
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vLegalAttachedMessage.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vLegalAttachedMessage.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vLegalAttachedMessage.articleId IS NULL OR vLegalAttachedMessage.articleId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_R = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_R",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_R",
			new String[] { String.class.getName(), Boolean.class.getName() },
			VLegalAttachedMessageModelImpl.ARTICLEID_COLUMN_BITMASK |
			VLegalAttachedMessageModelImpl.READMESSAGE_COLUMN_BITMASK |
			VLegalAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_R = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_R",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @return the matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage) {
		return findByA_R(articleId, readMessage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @return the range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end) {
		return findByA_R(articleId, readMessage, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return findByA_R(articleId, readMessage, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R;
			finderArgs = new Object[] { articleId, readMessage };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_R;
			finderArgs = new Object[] {
					articleId, readMessage,
					
					start, end, orderByComparator
				};
		}

		List<VLegalAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalAttachedMessage vLegalAttachedMessage : list) {
					if (!Objects.equals(articleId,
								vLegalAttachedMessage.getArticleId()) ||
							(readMessage != vLegalAttachedMessage.getReadMessage())) {
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);
			}

			query.append(_FINDER_COLUMN_A_R_READMESSAGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
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

				qPos.add(readMessage);

				if (!pagination) {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByA_R_First(String articleId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByA_R_First(articleId,
				readMessage, orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByA_R_First(String articleId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		List<VLegalAttachedMessage> list = findByA_R(articleId, readMessage, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByA_R_Last(String articleId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByA_R_Last(articleId,
				readMessage, orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByA_R_Last(String articleId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		int count = countByA_R(articleId, readMessage);

		if (count == 0) {
			return null;
		}

		List<VLegalAttachedMessage> list = findByA_R(articleId, readMessage,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage[] findByA_R_PrevAndNext(String messageId,
		String articleId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByA_R_PrevAndNext(session, vLegalAttachedMessage,
					articleId, readMessage, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByA_R_PrevAndNext(session, vLegalAttachedMessage,
					articleId, readMessage, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage getByA_R_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, String articleId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

		boolean bindArticleId = false;

		if (articleId == null) {
			query.append(_FINDER_COLUMN_A_R_ARTICLEID_1);
		}
		else if (articleId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_R_ARTICLEID_3);
		}
		else {
			bindArticleId = true;

			query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);
		}

		query.append(_FINDER_COLUMN_A_R_READMESSAGE_2);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindArticleId) {
			qPos.add(articleId);
		}

		qPos.add(readMessage);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal attached messages where articleId = &#63; and readMessage = &#63; from the database.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 */
	@Override
	public void removeByA_R(String articleId, boolean readMessage) {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByA_R(
				articleId, readMessage, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Returns the number of v legal attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @return the number of matching v legal attached messages
	 */
	@Override
	public int countByA_R(String articleId, boolean readMessage) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_R;

		Object[] finderArgs = new Object[] { articleId, readMessage };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

			boolean bindArticleId = false;

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_1);
			}
			else if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_R_ARTICLEID_3);
			}
			else {
				bindArticleId = true;

				query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);
			}

			query.append(_FINDER_COLUMN_A_R_READMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindArticleId) {
					qPos.add(articleId);
				}

				qPos.add(readMessage);

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

	private static final String _FINDER_COLUMN_A_R_ARTICLEID_1 = "vLegalAttachedMessage.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_2 = "vLegalAttachedMessage.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_3 = "(vLegalAttachedMessage.articleId IS NULL OR vLegalAttachedMessage.articleId = '') AND ";
	private static final String _FINDER_COLUMN_A_R_READMESSAGE_2 = "vLegalAttachedMessage.readMessage = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VLegalAttachedMessageModelImpl.GROUPID_COLUMN_BITMASK |
			VLegalAttachedMessageModelImpl.READMESSAGE_COLUMN_BITMASK |
			VLegalAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @return the matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage) {
		return findByStatus(groupId, readMessage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @return the range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end) {
		return findByStatus(groupId, readMessage, start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return findByStatus(groupId, readMessage, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findByStatus(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { groupId, readMessage };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] {
					groupId, readMessage,
					
					start, end, orderByComparator
				};
		}

		List<VLegalAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VLegalAttachedMessage vLegalAttachedMessage : list) {
					if ((groupId != vLegalAttachedMessage.getGroupId()) ||
							(readMessage != vLegalAttachedMessage.getReadMessage())) {
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

			query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_READMESSAGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(readMessage);

				if (!pagination) {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByStatus_First(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByStatus_First(groupId,
				readMessage, orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByStatus_First(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		List<VLegalAttachedMessage> list = findByStatus(groupId, readMessage,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage findByStatus_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByStatus_Last(groupId,
				readMessage, orderByComparator);

		if (vLegalAttachedMessage != null) {
			return vLegalAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVLegalAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching v legal attached message, or <code>null</code> if a matching v legal attached message could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByStatus_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		int count = countByStatus(groupId, readMessage);

		if (count == 0) {
			return null;
		}

		List<VLegalAttachedMessage> list = findByStatus(groupId, readMessage,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param messageId the primary key of the current v legal attached message
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage[] findByStatus_PrevAndNext(String messageId,
		long groupId, boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage[] array = new VLegalAttachedMessageImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vLegalAttachedMessage,
					groupId, readMessage, orderByComparator, true);

			array[1] = vLegalAttachedMessage;

			array[2] = getByStatus_PrevAndNext(session, vLegalAttachedMessage,
					groupId, readMessage, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalAttachedMessage getByStatus_PrevAndNext(Session session,
		VLegalAttachedMessage vLegalAttachedMessage, long groupId,
		boolean readMessage,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE);

		query.append(_FINDER_COLUMN_STATUS_GROUPID_2);

		query.append(_FINDER_COLUMN_STATUS_READMESSAGE_2);

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
			query.append(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(readMessage);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vLegalAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the v legal attached messages where groupId = &#63; and readMessage = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 */
	@Override
	public void removeByStatus(long groupId, boolean readMessage) {
		for (VLegalAttachedMessage vLegalAttachedMessage : findByStatus(
				groupId, readMessage, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Returns the number of v legal attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @return the number of matching v legal attached messages
	 */
	@Override
	public int countByStatus(long groupId, boolean readMessage) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { groupId, readMessage };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_READMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(readMessage);

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

	private static final String _FINDER_COLUMN_STATUS_GROUPID_2 = "vLegalAttachedMessage.groupId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_READMESSAGE_2 = "vLegalAttachedMessage.readMessage = ?";

	public VLegalAttachedMessagePersistenceImpl() {
		setModelClass(VLegalAttachedMessage.class);
	}

	/**
	 * Caches the v legal attached message in the entity cache if it is enabled.
	 *
	 * @param vLegalAttachedMessage the v legal attached message
	 */
	@Override
	public void cacheResult(VLegalAttachedMessage vLegalAttachedMessage) {
		entityCache.putResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey(), vLegalAttachedMessage);

		vLegalAttachedMessage.resetOriginalValues();
	}

	/**
	 * Caches the v legal attached messages in the entity cache if it is enabled.
	 *
	 * @param vLegalAttachedMessages the v legal attached messages
	 */
	@Override
	public void cacheResult(List<VLegalAttachedMessage> vLegalAttachedMessages) {
		for (VLegalAttachedMessage vLegalAttachedMessage : vLegalAttachedMessages) {
			if (entityCache.getResult(
						VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
						VLegalAttachedMessageImpl.class,
						vLegalAttachedMessage.getPrimaryKey()) == null) {
				cacheResult(vLegalAttachedMessage);
			}
			else {
				vLegalAttachedMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v legal attached messages.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VLegalAttachedMessageImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v legal attached message.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VLegalAttachedMessage vLegalAttachedMessage) {
		entityCache.removeResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VLegalAttachedMessage> vLegalAttachedMessages) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VLegalAttachedMessage vLegalAttachedMessage : vLegalAttachedMessages) {
			entityCache.removeResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
				VLegalAttachedMessageImpl.class,
				vLegalAttachedMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	 *
	 * @param messageId the primary key for the new v legal attached message
	 * @return the new v legal attached message
	 */
	@Override
	public VLegalAttachedMessage create(String messageId) {
		VLegalAttachedMessage vLegalAttachedMessage = new VLegalAttachedMessageImpl();

		vLegalAttachedMessage.setNew(true);
		vLegalAttachedMessage.setPrimaryKey(messageId);

		vLegalAttachedMessage.setCompanyId(companyProvider.getCompanyId());

		return vLegalAttachedMessage;
	}

	/**
	 * Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param messageId the primary key of the v legal attached message
	 * @return the v legal attached message that was removed
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage remove(String messageId)
		throws NoSuchVLegalAttachedMessageException {
		return remove((Serializable)messageId);
	}

	/**
	 * Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal attached message
	 * @return the v legal attached message that was removed
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage remove(Serializable primaryKey)
		throws NoSuchVLegalAttachedMessageException {
		Session session = null;

		try {
			session = openSession();

			VLegalAttachedMessage vLegalAttachedMessage = (VLegalAttachedMessage)session.get(VLegalAttachedMessageImpl.class,
					primaryKey);

			if (vLegalAttachedMessage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVLegalAttachedMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vLegalAttachedMessage);
		}
		catch (NoSuchVLegalAttachedMessageException nsee) {
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
	protected VLegalAttachedMessage removeImpl(
		VLegalAttachedMessage vLegalAttachedMessage) {
		vLegalAttachedMessage = toUnwrappedModel(vLegalAttachedMessage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vLegalAttachedMessage)) {
				vLegalAttachedMessage = (VLegalAttachedMessage)session.get(VLegalAttachedMessageImpl.class,
						vLegalAttachedMessage.getPrimaryKeyObj());
			}

			if (vLegalAttachedMessage != null) {
				session.delete(vLegalAttachedMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vLegalAttachedMessage != null) {
			clearCache(vLegalAttachedMessage);
		}

		return vLegalAttachedMessage;
	}

	@Override
	public VLegalAttachedMessage updateImpl(
		VLegalAttachedMessage vLegalAttachedMessage) {
		vLegalAttachedMessage = toUnwrappedModel(vLegalAttachedMessage);

		boolean isNew = vLegalAttachedMessage.isNew();

		VLegalAttachedMessageModelImpl vLegalAttachedMessageModelImpl = (VLegalAttachedMessageModelImpl)vLegalAttachedMessage;

		Session session = null;

		try {
			session = openSession();

			if (vLegalAttachedMessage.isNew()) {
				session.save(vLegalAttachedMessage);

				vLegalAttachedMessage.setNew(false);
			}
			else {
				vLegalAttachedMessage = (VLegalAttachedMessage)session.merge(vLegalAttachedMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VLegalAttachedMessageModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vLegalAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalAttachedMessageModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { vLegalAttachedMessageModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((vLegalAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalAttachedMessageModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] {
						vLegalAttachedMessageModelImpl.getArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}

			if ((vLegalAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalAttachedMessageModelImpl.getOriginalArticleId(),
						vLegalAttachedMessageModelImpl.getOriginalReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R,
					args);

				args = new Object[] {
						vLegalAttachedMessageModelImpl.getArticleId(),
						vLegalAttachedMessageModelImpl.getReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R,
					args);
			}

			if ((vLegalAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vLegalAttachedMessageModelImpl.getOriginalGroupId(),
						vLegalAttachedMessageModelImpl.getOriginalReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] {
						vLegalAttachedMessageModelImpl.getGroupId(),
						vLegalAttachedMessageModelImpl.getReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VLegalAttachedMessageImpl.class,
			vLegalAttachedMessage.getPrimaryKey(), vLegalAttachedMessage, false);

		vLegalAttachedMessage.resetOriginalValues();

		return vLegalAttachedMessage;
	}

	protected VLegalAttachedMessage toUnwrappedModel(
		VLegalAttachedMessage vLegalAttachedMessage) {
		if (vLegalAttachedMessage instanceof VLegalAttachedMessageImpl) {
			return vLegalAttachedMessage;
		}

		VLegalAttachedMessageImpl vLegalAttachedMessageImpl = new VLegalAttachedMessageImpl();

		vLegalAttachedMessageImpl.setNew(vLegalAttachedMessage.isNew());
		vLegalAttachedMessageImpl.setPrimaryKey(vLegalAttachedMessage.getPrimaryKey());

		vLegalAttachedMessageImpl.setMessageId(vLegalAttachedMessage.getMessageId());
		vLegalAttachedMessageImpl.setGroupId(vLegalAttachedMessage.getGroupId());
		vLegalAttachedMessageImpl.setCompanyId(vLegalAttachedMessage.getCompanyId());
		vLegalAttachedMessageImpl.setUserId(vLegalAttachedMessage.getUserId());
		vLegalAttachedMessageImpl.setCreatedDate(vLegalAttachedMessage.getCreatedDate());
		vLegalAttachedMessageImpl.setCreatedByUser(vLegalAttachedMessage.getCreatedByUser());
		vLegalAttachedMessageImpl.setArticleId(vLegalAttachedMessage.getArticleId());
		vLegalAttachedMessageImpl.setContent(vLegalAttachedMessage.getContent());
		vLegalAttachedMessageImpl.setReadMessage(vLegalAttachedMessage.isReadMessage());

		return vLegalAttachedMessageImpl;
	}

	/**
	 * Returns the v legal attached message with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal attached message
	 * @return the v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVLegalAttachedMessageException {
		VLegalAttachedMessage vLegalAttachedMessage = fetchByPrimaryKey(primaryKey);

		if (vLegalAttachedMessage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVLegalAttachedMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vLegalAttachedMessage;
	}

	/**
	 * Returns the v legal attached message with the primary key or throws a {@link NoSuchVLegalAttachedMessageException} if it could not be found.
	 *
	 * @param messageId the primary key of the v legal attached message
	 * @return the v legal attached message
	 * @throws NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage findByPrimaryKey(String messageId)
		throws NoSuchVLegalAttachedMessageException {
		return findByPrimaryKey((Serializable)messageId);
	}

	/**
	 * Returns the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal attached message
	 * @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
				VLegalAttachedMessageImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VLegalAttachedMessage vLegalAttachedMessage = (VLegalAttachedMessage)serializable;

		if (vLegalAttachedMessage == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalAttachedMessage = (VLegalAttachedMessage)session.get(VLegalAttachedMessageImpl.class,
						primaryKey);

				if (vLegalAttachedMessage != null) {
					cacheResult(vLegalAttachedMessage);
				}
				else {
					entityCache.putResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
						VLegalAttachedMessageImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
					VLegalAttachedMessageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vLegalAttachedMessage;
	}

	/**
	 * Returns the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param messageId the primary key of the v legal attached message
	 * @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	 */
	@Override
	public VLegalAttachedMessage fetchByPrimaryKey(String messageId) {
		return fetchByPrimaryKey((Serializable)messageId);
	}

	@Override
	public Map<Serializable, VLegalAttachedMessage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VLegalAttachedMessage> map = new HashMap<Serializable, VLegalAttachedMessage>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VLegalAttachedMessage vLegalAttachedMessage = fetchByPrimaryKey(primaryKey);

			if (vLegalAttachedMessage != null) {
				map.put(primaryKey, vLegalAttachedMessage);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
					VLegalAttachedMessageImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VLegalAttachedMessage)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE_PKS_IN);

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

			for (VLegalAttachedMessage vLegalAttachedMessage : (List<VLegalAttachedMessage>)q.list()) {
				map.put(vLegalAttachedMessage.getPrimaryKeyObj(),
					vLegalAttachedMessage);

				cacheResult(vLegalAttachedMessage);

				uncachedPrimaryKeys.remove(vLegalAttachedMessage.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VLegalAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
					VLegalAttachedMessageImpl.class, primaryKey, nullModel);
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
	 * Returns all the v legal attached messages.
	 *
	 * @return the v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v legal attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @return the range of v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findAll(int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the v legal attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal attached messages
	 * @param end the upper bound of the range of v legal attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of v legal attached messages
	 */
	@Override
	public List<VLegalAttachedMessage> findAll(int start, int end,
		OrderByComparator<VLegalAttachedMessage> orderByComparator,
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

		List<VLegalAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VLegalAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VLEGALATTACHEDMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALATTACHEDMESSAGE;

				if (pagination) {
					sql = sql.concat(VLegalAttachedMessageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VLegalAttachedMessage>)QueryUtil.list(q,
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
	 * Removes all the v legal attached messages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VLegalAttachedMessage vLegalAttachedMessage : findAll()) {
			remove(vLegalAttachedMessage);
		}
	}

	/**
	 * Returns the number of v legal attached messages.
	 *
	 * @return the number of v legal attached messages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALATTACHEDMESSAGE);

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
		return VLegalAttachedMessageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the v legal attached message persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VLegalAttachedMessageImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALATTACHEDMESSAGE = "SELECT vLegalAttachedMessage FROM VLegalAttachedMessage vLegalAttachedMessage";
	private static final String _SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE_PKS_IN = "SELECT vLegalAttachedMessage FROM VLegalAttachedMessage vLegalAttachedMessage WHERE messageId IN (";
	private static final String _SQL_SELECT_VLEGALATTACHEDMESSAGE_WHERE = "SELECT vLegalAttachedMessage FROM VLegalAttachedMessage vLegalAttachedMessage WHERE ";
	private static final String _SQL_COUNT_VLEGALATTACHEDMESSAGE = "SELECT COUNT(vLegalAttachedMessage) FROM VLegalAttachedMessage vLegalAttachedMessage";
	private static final String _SQL_COUNT_VLEGALATTACHEDMESSAGE_WHERE = "SELECT COUNT(vLegalAttachedMessage) FROM VLegalAttachedMessage vLegalAttachedMessage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalAttachedMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalAttachedMessage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalAttachedMessage exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VLegalAttachedMessagePersistenceImpl.class);
}