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

import vn.gov.hoabinh.exception.NoSuchVcmsAttachedMessageException;
import vn.gov.hoabinh.model.VcmsAttachedMessage;
import vn.gov.hoabinh.model.impl.VcmsAttachedMessageImpl;
import vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsAttachedMessagePersistence;

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
 * The persistence implementation for the vcms attached message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessagePersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsAttachedMessageUtil
 * @generated
 */
@ProviderType
public class VcmsAttachedMessagePersistenceImpl extends BasePersistenceImpl<VcmsAttachedMessage>
	implements VcmsAttachedMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsAttachedMessageUtil} to access the vcms attached message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsAttachedMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARTICLE = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArticle",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE =
		new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArticle",
			new String[] { String.class.getName() },
			VcmsAttachedMessageModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArticle",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vcms attached messages where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByArticle(String articleId) {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @return the range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByArticle(String articleId, int start,
		int end) {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return findByArticle(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByArticle(String articleId, int start,
		int end, OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		List<VcmsAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsAttachedMessage vcmsAttachedMessage : list) {
					if (!Objects.equals(articleId,
								vcmsAttachedMessage.getArticleId())) {
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

			query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

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
				query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first vcms attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByArticle_First(String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByArticle_First(articleId,
				orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first vcms attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByArticle_First(String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		List<VcmsAttachedMessage> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByArticle_Last(String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByArticle_Last(articleId,
				orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last vcms attached message in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByArticle_Last(String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		int count = countByArticle(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsAttachedMessage> list = findByArticle(articleId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms attached messages before and after the current vcms attached message in the ordered set where articleId = &#63;.
	 *
	 * @param messageId the primary key of the current vcms attached message
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage[] findByArticle_PrevAndNext(String messageId,
		String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VcmsAttachedMessage[] array = new VcmsAttachedMessageImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsAttachedMessage,
					articleId, orderByComparator, true);

			array[1] = vcmsAttachedMessage;

			array[2] = getByArticle_PrevAndNext(session, vcmsAttachedMessage,
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

	protected VcmsAttachedMessage getByArticle_PrevAndNext(Session session,
		VcmsAttachedMessage vcmsAttachedMessage, String articleId,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

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
			query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms attached messages where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByArticle(String articleId) {
		for (VcmsAttachedMessage vcmsAttachedMessage : findByArticle(
				articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsAttachedMessage);
		}
	}

	/**
	 * Returns the number of vcms attached messages where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms attached messages
	 */
	@Override
	public int countByArticle(String articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ARTICLE;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSATTACHEDMESSAGE_WHERE);

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

	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsAttachedMessage.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsAttachedMessage.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsAttachedMessage.articleId IS NULL OR vcmsAttachedMessage.articleId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UNREAD = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUnRead",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNREAD =
		new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUnRead",
			new String[] { Boolean.class.getName() },
			VcmsAttachedMessageModelImpl.READMESSAGE_COLUMN_BITMASK |
			VcmsAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UNREAD = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUnRead",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the vcms attached messages where readMessage = &#63;.
	 *
	 * @param readMessage the read message
	 * @return the matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByUnRead(boolean readMessage) {
		return findByUnRead(readMessage, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vcms attached messages where readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @return the range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByUnRead(boolean readMessage,
		int start, int end) {
		return findByUnRead(readMessage, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByUnRead(boolean readMessage,
		int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return findByUnRead(readMessage, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByUnRead(boolean readMessage,
		int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNREAD;
			finderArgs = new Object[] { readMessage };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UNREAD;
			finderArgs = new Object[] { readMessage, start, end, orderByComparator };
		}

		List<VcmsAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsAttachedMessage vcmsAttachedMessage : list) {
					if ((readMessage != vcmsAttachedMessage.getReadMessage())) {
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

			query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_UNREAD_READMESSAGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(readMessage);

				if (!pagination) {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first vcms attached message in the ordered set where readMessage = &#63;.
	 *
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByUnRead_First(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByUnRead_First(readMessage,
				orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first vcms attached message in the ordered set where readMessage = &#63;.
	 *
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByUnRead_First(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		List<VcmsAttachedMessage> list = findByUnRead(readMessage, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms attached message in the ordered set where readMessage = &#63;.
	 *
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByUnRead_Last(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByUnRead_Last(readMessage,
				orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last vcms attached message in the ordered set where readMessage = &#63;.
	 *
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByUnRead_Last(boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		int count = countByUnRead(readMessage);

		if (count == 0) {
			return null;
		}

		List<VcmsAttachedMessage> list = findByUnRead(readMessage, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms attached messages before and after the current vcms attached message in the ordered set where readMessage = &#63;.
	 *
	 * @param messageId the primary key of the current vcms attached message
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage[] findByUnRead_PrevAndNext(String messageId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VcmsAttachedMessage[] array = new VcmsAttachedMessageImpl[3];

			array[0] = getByUnRead_PrevAndNext(session, vcmsAttachedMessage,
					readMessage, orderByComparator, true);

			array[1] = vcmsAttachedMessage;

			array[2] = getByUnRead_PrevAndNext(session, vcmsAttachedMessage,
					readMessage, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsAttachedMessage getByUnRead_PrevAndNext(Session session,
		VcmsAttachedMessage vcmsAttachedMessage, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

		query.append(_FINDER_COLUMN_UNREAD_READMESSAGE_2);

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
			query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(readMessage);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms attached messages where readMessage = &#63; from the database.
	 *
	 * @param readMessage the read message
	 */
	@Override
	public void removeByUnRead(boolean readMessage) {
		for (VcmsAttachedMessage vcmsAttachedMessage : findByUnRead(
				readMessage, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsAttachedMessage);
		}
	}

	/**
	 * Returns the number of vcms attached messages where readMessage = &#63;.
	 *
	 * @param readMessage the read message
	 * @return the number of matching vcms attached messages
	 */
	@Override
	public int countByUnRead(boolean readMessage) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UNREAD;

		Object[] finderArgs = new Object[] { readMessage };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_UNREAD_READMESSAGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_UNREAD_READMESSAGE_2 = "vcmsAttachedMessage.readMessage = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_R = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_R",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_R",
			new String[] { String.class.getName(), Boolean.class.getName() },
			VcmsAttachedMessageModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsAttachedMessageModelImpl.READMESSAGE_COLUMN_BITMASK |
			VcmsAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_R = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_R",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @return the matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByA_R(String articleId,
		boolean readMessage) {
		return findByA_R(articleId, readMessage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @return the range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end) {
		return findByA_R(articleId, readMessage, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return findByA_R(articleId, readMessage, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByA_R(String articleId,
		boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		List<VcmsAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsAttachedMessage vcmsAttachedMessage : list) {
					if (!Objects.equals(articleId,
								vcmsAttachedMessage.getArticleId()) ||
							(readMessage != vcmsAttachedMessage.getReadMessage())) {
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

			query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

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
				query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByA_R_First(String articleId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByA_R_First(articleId,
				readMessage, orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByA_R_First(String articleId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		List<VcmsAttachedMessage> list = findByA_R(articleId, readMessage, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByA_R_Last(String articleId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByA_R_Last(articleId,
				readMessage, orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByA_R_Last(String articleId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		int count = countByA_R(articleId, readMessage);

		if (count == 0) {
			return null;
		}

		List<VcmsAttachedMessage> list = findByA_R(articleId, readMessage,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms attached messages before and after the current vcms attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param messageId the primary key of the current vcms attached message
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage[] findByA_R_PrevAndNext(String messageId,
		String articleId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VcmsAttachedMessage[] array = new VcmsAttachedMessageImpl[3];

			array[0] = getByA_R_PrevAndNext(session, vcmsAttachedMessage,
					articleId, readMessage, orderByComparator, true);

			array[1] = vcmsAttachedMessage;

			array[2] = getByA_R_PrevAndNext(session, vcmsAttachedMessage,
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

	protected VcmsAttachedMessage getByA_R_PrevAndNext(Session session,
		VcmsAttachedMessage vcmsAttachedMessage, String articleId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

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
			query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms attached messages where articleId = &#63; and readMessage = &#63; from the database.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 */
	@Override
	public void removeByA_R(String articleId, boolean readMessage) {
		for (VcmsAttachedMessage vcmsAttachedMessage : findByA_R(articleId,
				readMessage, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsAttachedMessage);
		}
	}

	/**
	 * Returns the number of vcms attached messages where articleId = &#63; and readMessage = &#63;.
	 *
	 * @param articleId the article ID
	 * @param readMessage the read message
	 * @return the number of matching vcms attached messages
	 */
	@Override
	public int countByA_R(String articleId, boolean readMessage) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_R;

		Object[] finderArgs = new Object[] { articleId, readMessage };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSATTACHEDMESSAGE_WHERE);

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

	private static final String _FINDER_COLUMN_A_R_ARTICLEID_1 = "vcmsAttachedMessage.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_2 = "vcmsAttachedMessage.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_R_ARTICLEID_3 = "(vcmsAttachedMessage.articleId IS NULL OR vcmsAttachedMessage.articleId = '') AND ";
	private static final String _FINDER_COLUMN_A_R_READMESSAGE_2 = "vcmsAttachedMessage.readMessage = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_R",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_R",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			VcmsAttachedMessageModelImpl.GROUPID_COLUMN_BITMASK |
			VcmsAttachedMessageModelImpl.READMESSAGE_COLUMN_BITMASK |
			VcmsAttachedMessageModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_R = new FinderPath(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_R",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @return the matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByG_R(long groupId, boolean readMessage) {
		return findByG_R(groupId, readMessage, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @return the range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end) {
		return findByG_R(groupId, readMessage, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return findByG_R(groupId, readMessage, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findByG_R(long groupId,
		boolean readMessage, int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R;
			finderArgs = new Object[] { groupId, readMessage };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_R;
			finderArgs = new Object[] {
					groupId, readMessage,
					
					start, end, orderByComparator
				};
		}

		List<VcmsAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsAttachedMessage vcmsAttachedMessage : list) {
					if ((groupId != vcmsAttachedMessage.getGroupId()) ||
							(readMessage != vcmsAttachedMessage.getReadMessage())) {
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

			query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_G_R_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_READMESSAGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
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
	 * Returns the first vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByG_R_First(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByG_R_First(groupId,
				readMessage, orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the first vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByG_R_First(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		List<VcmsAttachedMessage> list = findByG_R(groupId, readMessage, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage findByG_R_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByG_R_Last(groupId,
				readMessage, orderByComparator);

		if (vcmsAttachedMessage != null) {
			return vcmsAttachedMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", readMessage=");
		msg.append(readMessage);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsAttachedMessageException(msg.toString());
	}

	/**
	 * Returns the last vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms attached message, or <code>null</code> if a matching vcms attached message could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByG_R_Last(long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		int count = countByG_R(groupId, readMessage);

		if (count == 0) {
			return null;
		}

		List<VcmsAttachedMessage> list = findByG_R(groupId, readMessage,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms attached messages before and after the current vcms attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param messageId the primary key of the current vcms attached message
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage[] findByG_R_PrevAndNext(String messageId,
		long groupId, boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = findByPrimaryKey(messageId);

		Session session = null;

		try {
			session = openSession();

			VcmsAttachedMessage[] array = new VcmsAttachedMessageImpl[3];

			array[0] = getByG_R_PrevAndNext(session, vcmsAttachedMessage,
					groupId, readMessage, orderByComparator, true);

			array[1] = vcmsAttachedMessage;

			array[2] = getByG_R_PrevAndNext(session, vcmsAttachedMessage,
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

	protected VcmsAttachedMessage getByG_R_PrevAndNext(Session session,
		VcmsAttachedMessage vcmsAttachedMessage, long groupId,
		boolean readMessage,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE);

		query.append(_FINDER_COLUMN_G_R_GROUPID_2);

		query.append(_FINDER_COLUMN_G_R_READMESSAGE_2);

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
			query.append(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(readMessage);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsAttachedMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsAttachedMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms attached messages where groupId = &#63; and readMessage = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 */
	@Override
	public void removeByG_R(long groupId, boolean readMessage) {
		for (VcmsAttachedMessage vcmsAttachedMessage : findByG_R(groupId,
				readMessage, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsAttachedMessage);
		}
	}

	/**
	 * Returns the number of vcms attached messages where groupId = &#63; and readMessage = &#63;.
	 *
	 * @param groupId the group ID
	 * @param readMessage the read message
	 * @return the number of matching vcms attached messages
	 */
	@Override
	public int countByG_R(long groupId, boolean readMessage) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_R;

		Object[] finderArgs = new Object[] { groupId, readMessage };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSATTACHEDMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_G_R_GROUPID_2);

			query.append(_FINDER_COLUMN_G_R_READMESSAGE_2);

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

	private static final String _FINDER_COLUMN_G_R_GROUPID_2 = "vcmsAttachedMessage.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_R_READMESSAGE_2 = "vcmsAttachedMessage.readMessage = ?";

	public VcmsAttachedMessagePersistenceImpl() {
		setModelClass(VcmsAttachedMessage.class);
	}

	/**
	 * Caches the vcms attached message in the entity cache if it is enabled.
	 *
	 * @param vcmsAttachedMessage the vcms attached message
	 */
	@Override
	public void cacheResult(VcmsAttachedMessage vcmsAttachedMessage) {
		entityCache.putResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class, vcmsAttachedMessage.getPrimaryKey(),
			vcmsAttachedMessage);

		vcmsAttachedMessage.resetOriginalValues();
	}

	/**
	 * Caches the vcms attached messages in the entity cache if it is enabled.
	 *
	 * @param vcmsAttachedMessages the vcms attached messages
	 */
	@Override
	public void cacheResult(List<VcmsAttachedMessage> vcmsAttachedMessages) {
		for (VcmsAttachedMessage vcmsAttachedMessage : vcmsAttachedMessages) {
			if (entityCache.getResult(
						VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
						VcmsAttachedMessageImpl.class,
						vcmsAttachedMessage.getPrimaryKey()) == null) {
				cacheResult(vcmsAttachedMessage);
			}
			else {
				vcmsAttachedMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms attached messages.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsAttachedMessageImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms attached message.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsAttachedMessage vcmsAttachedMessage) {
		entityCache.removeResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class, vcmsAttachedMessage.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsAttachedMessage> vcmsAttachedMessages) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsAttachedMessage vcmsAttachedMessage : vcmsAttachedMessages) {
			entityCache.removeResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
				VcmsAttachedMessageImpl.class,
				vcmsAttachedMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms attached message with the primary key. Does not add the vcms attached message to the database.
	 *
	 * @param messageId the primary key for the new vcms attached message
	 * @return the new vcms attached message
	 */
	@Override
	public VcmsAttachedMessage create(String messageId) {
		VcmsAttachedMessage vcmsAttachedMessage = new VcmsAttachedMessageImpl();

		vcmsAttachedMessage.setNew(true);
		vcmsAttachedMessage.setPrimaryKey(messageId);

		vcmsAttachedMessage.setCompanyId(companyProvider.getCompanyId());

		return vcmsAttachedMessage;
	}

	/**
	 * Removes the vcms attached message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param messageId the primary key of the vcms attached message
	 * @return the vcms attached message that was removed
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage remove(String messageId)
		throws NoSuchVcmsAttachedMessageException {
		return remove((Serializable)messageId);
	}

	/**
	 * Removes the vcms attached message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms attached message
	 * @return the vcms attached message that was removed
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage remove(Serializable primaryKey)
		throws NoSuchVcmsAttachedMessageException {
		Session session = null;

		try {
			session = openSession();

			VcmsAttachedMessage vcmsAttachedMessage = (VcmsAttachedMessage)session.get(VcmsAttachedMessageImpl.class,
					primaryKey);

			if (vcmsAttachedMessage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsAttachedMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsAttachedMessage);
		}
		catch (NoSuchVcmsAttachedMessageException nsee) {
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
	protected VcmsAttachedMessage removeImpl(
		VcmsAttachedMessage vcmsAttachedMessage) {
		vcmsAttachedMessage = toUnwrappedModel(vcmsAttachedMessage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsAttachedMessage)) {
				vcmsAttachedMessage = (VcmsAttachedMessage)session.get(VcmsAttachedMessageImpl.class,
						vcmsAttachedMessage.getPrimaryKeyObj());
			}

			if (vcmsAttachedMessage != null) {
				session.delete(vcmsAttachedMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsAttachedMessage != null) {
			clearCache(vcmsAttachedMessage);
		}

		return vcmsAttachedMessage;
	}

	@Override
	public VcmsAttachedMessage updateImpl(
		VcmsAttachedMessage vcmsAttachedMessage) {
		vcmsAttachedMessage = toUnwrappedModel(vcmsAttachedMessage);

		boolean isNew = vcmsAttachedMessage.isNew();

		VcmsAttachedMessageModelImpl vcmsAttachedMessageModelImpl = (VcmsAttachedMessageModelImpl)vcmsAttachedMessage;

		Session session = null;

		try {
			session = openSession();

			if (vcmsAttachedMessage.isNew()) {
				session.save(vcmsAttachedMessage);

				vcmsAttachedMessage.setNew(false);
			}
			else {
				vcmsAttachedMessage = (VcmsAttachedMessage)session.merge(vcmsAttachedMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsAttachedMessageModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsAttachedMessageModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);

				args = new Object[] { vcmsAttachedMessageModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ARTICLE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARTICLE,
					args);
			}

			if ((vcmsAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNREAD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsAttachedMessageModelImpl.getOriginalReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UNREAD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNREAD,
					args);

				args = new Object[] {
						vcmsAttachedMessageModelImpl.getReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UNREAD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNREAD,
					args);
			}

			if ((vcmsAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsAttachedMessageModelImpl.getOriginalArticleId(),
						vcmsAttachedMessageModelImpl.getOriginalReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R,
					args);

				args = new Object[] {
						vcmsAttachedMessageModelImpl.getArticleId(),
						vcmsAttachedMessageModelImpl.getReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R,
					args);
			}

			if ((vcmsAttachedMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsAttachedMessageModelImpl.getOriginalGroupId(),
						vcmsAttachedMessageModelImpl.getOriginalReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R,
					args);

				args = new Object[] {
						vcmsAttachedMessageModelImpl.getGroupId(),
						vcmsAttachedMessageModelImpl.getReadMessage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_R,
					args);
			}
		}

		entityCache.putResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
			VcmsAttachedMessageImpl.class, vcmsAttachedMessage.getPrimaryKey(),
			vcmsAttachedMessage, false);

		vcmsAttachedMessage.resetOriginalValues();

		return vcmsAttachedMessage;
	}

	protected VcmsAttachedMessage toUnwrappedModel(
		VcmsAttachedMessage vcmsAttachedMessage) {
		if (vcmsAttachedMessage instanceof VcmsAttachedMessageImpl) {
			return vcmsAttachedMessage;
		}

		VcmsAttachedMessageImpl vcmsAttachedMessageImpl = new VcmsAttachedMessageImpl();

		vcmsAttachedMessageImpl.setNew(vcmsAttachedMessage.isNew());
		vcmsAttachedMessageImpl.setPrimaryKey(vcmsAttachedMessage.getPrimaryKey());

		vcmsAttachedMessageImpl.setMessageId(vcmsAttachedMessage.getMessageId());
		vcmsAttachedMessageImpl.setGroupId(vcmsAttachedMessage.getGroupId());
		vcmsAttachedMessageImpl.setCompanyId(vcmsAttachedMessage.getCompanyId());
		vcmsAttachedMessageImpl.setCreatedDate(vcmsAttachedMessage.getCreatedDate());
		vcmsAttachedMessageImpl.setCreatedByUser(vcmsAttachedMessage.getCreatedByUser());
		vcmsAttachedMessageImpl.setArticleId(vcmsAttachedMessage.getArticleId());
		vcmsAttachedMessageImpl.setContent(vcmsAttachedMessage.getContent());
		vcmsAttachedMessageImpl.setReadMessage(vcmsAttachedMessage.isReadMessage());

		return vcmsAttachedMessageImpl;
	}

	/**
	 * Returns the vcms attached message with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms attached message
	 * @return the vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsAttachedMessageException {
		VcmsAttachedMessage vcmsAttachedMessage = fetchByPrimaryKey(primaryKey);

		if (vcmsAttachedMessage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsAttachedMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsAttachedMessage;
	}

	/**
	 * Returns the vcms attached message with the primary key or throws a {@link NoSuchVcmsAttachedMessageException} if it could not be found.
	 *
	 * @param messageId the primary key of the vcms attached message
	 * @return the vcms attached message
	 * @throws NoSuchVcmsAttachedMessageException if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage findByPrimaryKey(String messageId)
		throws NoSuchVcmsAttachedMessageException {
		return findByPrimaryKey((Serializable)messageId);
	}

	/**
	 * Returns the vcms attached message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms attached message
	 * @return the vcms attached message, or <code>null</code> if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
				VcmsAttachedMessageImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsAttachedMessage vcmsAttachedMessage = (VcmsAttachedMessage)serializable;

		if (vcmsAttachedMessage == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsAttachedMessage = (VcmsAttachedMessage)session.get(VcmsAttachedMessageImpl.class,
						primaryKey);

				if (vcmsAttachedMessage != null) {
					cacheResult(vcmsAttachedMessage);
				}
				else {
					entityCache.putResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
						VcmsAttachedMessageImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
					VcmsAttachedMessageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsAttachedMessage;
	}

	/**
	 * Returns the vcms attached message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param messageId the primary key of the vcms attached message
	 * @return the vcms attached message, or <code>null</code> if a vcms attached message with the primary key could not be found
	 */
	@Override
	public VcmsAttachedMessage fetchByPrimaryKey(String messageId) {
		return fetchByPrimaryKey((Serializable)messageId);
	}

	@Override
	public Map<Serializable, VcmsAttachedMessage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsAttachedMessage> map = new HashMap<Serializable, VcmsAttachedMessage>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsAttachedMessage vcmsAttachedMessage = fetchByPrimaryKey(primaryKey);

			if (vcmsAttachedMessage != null) {
				map.put(primaryKey, vcmsAttachedMessage);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
					VcmsAttachedMessageImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsAttachedMessage)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE_PKS_IN);

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

			for (VcmsAttachedMessage vcmsAttachedMessage : (List<VcmsAttachedMessage>)q.list()) {
				map.put(vcmsAttachedMessage.getPrimaryKeyObj(),
					vcmsAttachedMessage);

				cacheResult(vcmsAttachedMessage);

				uncachedPrimaryKeys.remove(vcmsAttachedMessage.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsAttachedMessageModelImpl.ENTITY_CACHE_ENABLED,
					VcmsAttachedMessageImpl.class, primaryKey, nullModel);
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
	 * Returns all the vcms attached messages.
	 *
	 * @return the vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @return the range of vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findAll(int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms attached messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms attached messages
	 * @param end the upper bound of the range of vcms attached messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms attached messages
	 */
	@Override
	public List<VcmsAttachedMessage> findAll(int start, int end,
		OrderByComparator<VcmsAttachedMessage> orderByComparator,
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

		List<VcmsAttachedMessage> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsAttachedMessage>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSATTACHEDMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSATTACHEDMESSAGE;

				if (pagination) {
					sql = sql.concat(VcmsAttachedMessageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsAttachedMessage>)QueryUtil.list(q,
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
	 * Removes all the vcms attached messages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsAttachedMessage vcmsAttachedMessage : findAll()) {
			remove(vcmsAttachedMessage);
		}
	}

	/**
	 * Returns the number of vcms attached messages.
	 *
	 * @return the number of vcms attached messages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSATTACHEDMESSAGE);

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
		return VcmsAttachedMessageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms attached message persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsAttachedMessageImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSATTACHEDMESSAGE = "SELECT vcmsAttachedMessage FROM VcmsAttachedMessage vcmsAttachedMessage";
	private static final String _SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE_PKS_IN = "SELECT vcmsAttachedMessage FROM VcmsAttachedMessage vcmsAttachedMessage WHERE messageId IN (";
	private static final String _SQL_SELECT_VCMSATTACHEDMESSAGE_WHERE = "SELECT vcmsAttachedMessage FROM VcmsAttachedMessage vcmsAttachedMessage WHERE ";
	private static final String _SQL_COUNT_VCMSATTACHEDMESSAGE = "SELECT COUNT(vcmsAttachedMessage) FROM VcmsAttachedMessage vcmsAttachedMessage";
	private static final String _SQL_COUNT_VCMSATTACHEDMESSAGE_WHERE = "SELECT COUNT(vcmsAttachedMessage) FROM VcmsAttachedMessage vcmsAttachedMessage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsAttachedMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsAttachedMessage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsAttachedMessage exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsAttachedMessagePersistenceImpl.class);
}