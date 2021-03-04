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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchFAQQuestionException;
import vn.gov.hoabinh.model.FAQQuestion;
import vn.gov.hoabinh.model.impl.FAQQuestionImpl;
import vn.gov.hoabinh.model.impl.FAQQuestionModelImpl;
import vn.gov.hoabinh.service.persistence.FAQQuestionPersistence;

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
 * The persistence implementation for the f a q question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestionPersistence
 * @see vn.gov.hoabinh.service.persistence.FAQQuestionUtil
 * @generated
 */
@ProviderType
public class FAQQuestionPersistenceImpl extends BasePersistenceImpl<FAQQuestion>
	implements FAQQuestionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FAQQuestionUtil} to access the f a q question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FAQQuestionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_T",
			new String[] { Long.class.getName(), String.class.getName() },
			FAQQuestionModelImpl.GROUPID_COLUMN_BITMASK |
			FAQQuestionModelImpl.QUESTIONTYPE_COLUMN_BITMASK |
			FAQQuestionModelImpl.SENTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_T",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the f a q questions where groupId = &#63; and questionType = &#63;.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @return the matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_T(long groupId, String questionType) {
		return findByG_T(groupId, questionType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_T(long groupId, String questionType,
		int start, int end) {
		return findByG_T(groupId, questionType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_T(long groupId, String questionType,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator) {
		return findByG_T(groupId, questionType, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_T(long groupId, String questionType,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T;
			finderArgs = new Object[] { groupId, questionType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T;
			finderArgs = new Object[] {
					groupId, questionType,
					
					start, end, orderByComparator
				};
		}

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQQuestion faqQuestion : list) {
					if ((groupId != faqQuestion.getGroupId()) ||
							!Objects.equals(questionType,
								faqQuestion.getQuestionType())) {
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

			query.append(_SQL_SELECT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			boolean bindQuestionType = false;

			if (questionType == null) {
				query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_1);
			}
			else if (questionType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_3);
			}
			else {
				bindQuestionType = true;

				query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindQuestionType) {
					qPos.add(questionType);
				}

				if (!pagination) {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_T_First(long groupId, String questionType,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_T_First(groupId, questionType,
				orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", questionType=");
		msg.append(questionType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_T_First(long groupId, String questionType,
		OrderByComparator<FAQQuestion> orderByComparator) {
		List<FAQQuestion> list = findByG_T(groupId, questionType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_T_Last(long groupId, String questionType,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_T_Last(groupId, questionType,
				orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", questionType=");
		msg.append(questionType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_T_Last(long groupId, String questionType,
		OrderByComparator<FAQQuestion> orderByComparator) {
		int count = countByG_T(groupId, questionType);

		if (count == 0) {
			return null;
		}

		List<FAQQuestion> list = findByG_T(groupId, questionType, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	 *
	 * @param id the primary key of the current f a q question
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion[] findByG_T_PrevAndNext(long id, long groupId,
		String questionType, OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQQuestion[] array = new FAQQuestionImpl[3];

			array[0] = getByG_T_PrevAndNext(session, faqQuestion, groupId,
					questionType, orderByComparator, true);

			array[1] = faqQuestion;

			array[2] = getByG_T_PrevAndNext(session, faqQuestion, groupId,
					questionType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQQuestion getByG_T_PrevAndNext(Session session,
		FAQQuestion faqQuestion, long groupId, String questionType,
		OrderByComparator<FAQQuestion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FAQQUESTION_WHERE);

		query.append(_FINDER_COLUMN_G_T_GROUPID_2);

		boolean bindQuestionType = false;

		if (questionType == null) {
			query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_1);
		}
		else if (questionType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_3);
		}
		else {
			bindQuestionType = true;

			query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_2);
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
			query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindQuestionType) {
			qPos.add(questionType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q questions where groupId = &#63; and questionType = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 */
	@Override
	public void removeByG_T(long groupId, String questionType) {
		for (FAQQuestion faqQuestion : findByG_T(groupId, questionType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions where groupId = &#63; and questionType = &#63;.
	 *
	 * @param groupId the group ID
	 * @param questionType the question type
	 * @return the number of matching f a q questions
	 */
	@Override
	public int countByG_T(long groupId, String questionType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_T;

		Object[] finderArgs = new Object[] { groupId, questionType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			boolean bindQuestionType = false;

			if (questionType == null) {
				query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_1);
			}
			else if (questionType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_3);
			}
			else {
				bindQuestionType = true;

				query.append(_FINDER_COLUMN_G_T_QUESTIONTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindQuestionType) {
					qPos.add(questionType);
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

	private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "faqQuestion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_QUESTIONTYPE_1 = "faqQuestion.questionType IS NULL";
	private static final String _FINDER_COLUMN_G_T_QUESTIONTYPE_2 = "faqQuestion.questionType = ?";
	private static final String _FINDER_COLUMN_G_T_QUESTIONTYPE_3 = "(faqQuestion.questionType IS NULL OR faqQuestion.questionType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_A",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_A",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			FAQQuestionModelImpl.GROUPID_COLUMN_BITMASK |
			FAQQuestionModelImpl.APPROVED_COLUMN_BITMASK |
			FAQQuestionModelImpl.SENTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_A",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the f a q questions where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @return the matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_A(long groupId, boolean approved) {
		return findByG_A(groupId, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_A(long groupId, boolean approved,
		int start, int end) {
		return findByG_A(groupId, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_A(long groupId, boolean approved,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator) {
		return findByG_A(groupId, approved, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_A(long groupId, boolean approved,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A;
			finderArgs = new Object[] { groupId, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A;
			finderArgs = new Object[] {
					groupId, approved,
					
					start, end, orderByComparator
				};
		}

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQQuestion faqQuestion : list) {
					if ((groupId != faqQuestion.getGroupId()) ||
							(approved != faqQuestion.getApproved())) {
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

			query.append(_SQL_SELECT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_A_GROUPID_2);

			query.append(_FINDER_COLUMN_G_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(approved);

				if (!pagination) {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_A_First(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_A_First(groupId, approved,
				orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_A_First(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		List<FAQQuestion> list = findByG_A(groupId, approved, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_A_Last(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_A_Last(groupId, approved,
				orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_A_Last(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		int count = countByG_A(groupId, approved);

		if (count == 0) {
			return null;
		}

		List<FAQQuestion> list = findByG_A(groupId, approved, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	 *
	 * @param id the primary key of the current f a q question
	 * @param groupId the group ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion[] findByG_A_PrevAndNext(long id, long groupId,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQQuestion[] array = new FAQQuestionImpl[3];

			array[0] = getByG_A_PrevAndNext(session, faqQuestion, groupId,
					approved, orderByComparator, true);

			array[1] = faqQuestion;

			array[2] = getByG_A_PrevAndNext(session, faqQuestion, groupId,
					approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQQuestion getByG_A_PrevAndNext(Session session,
		FAQQuestion faqQuestion, long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FAQQUESTION_WHERE);

		query.append(_FINDER_COLUMN_G_A_GROUPID_2);

		query.append(_FINDER_COLUMN_G_A_APPROVED_2);

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
			query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q questions where groupId = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 */
	@Override
	public void removeByG_A(long groupId, boolean approved) {
		for (FAQQuestion faqQuestion : findByG_A(groupId, approved,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions where groupId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param approved the approved
	 * @return the number of matching f a q questions
	 */
	@Override
	public int countByG_A(long groupId, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_A;

		Object[] finderArgs = new Object[] { groupId, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_A_GROUPID_2);

			query.append(_FINDER_COLUMN_G_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_G_A_GROUPID_2 = "faqQuestion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_A_APPROVED_2 = "faqQuestion.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			FAQQuestionModelImpl.GROUPID_COLUMN_BITMASK |
			FAQQuestionModelImpl.LANGUAGE_COLUMN_BITMASK |
			FAQQuestionModelImpl.SENTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the f a q questions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L(long groupId, String language,
		int start, int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator,
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

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQQuestion faqQuestion : list) {
					if ((groupId != faqQuestion.getGroupId()) ||
							!Objects.equals(language, faqQuestion.getLanguage())) {
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

			query.append(_SQL_SELECT_FAQQUESTION_WHERE);

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
				query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_First(long groupId, String language,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_First(long groupId, String language,
		OrderByComparator<FAQQuestion> orderByComparator) {
		List<FAQQuestion> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_Last(long groupId, String language,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_Last(long groupId, String language,
		OrderByComparator<FAQQuestion> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<FAQQuestion> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param id the primary key of the current f a q question
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion[] findByG_L_PrevAndNext(long id, long groupId,
		String language, OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQQuestion[] array = new FAQQuestionImpl[3];

			array[0] = getByG_L_PrevAndNext(session, faqQuestion, groupId,
					language, orderByComparator, true);

			array[1] = faqQuestion;

			array[2] = getByG_L_PrevAndNext(session, faqQuestion, groupId,
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

	protected FAQQuestion getByG_L_PrevAndNext(Session session,
		FAQQuestion faqQuestion, long groupId, String language,
		OrderByComparator<FAQQuestion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FAQQUESTION_WHERE);

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
			query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(faqQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q questions where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (FAQQuestion faqQuestion : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching f a q questions
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FAQQUESTION_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "faqQuestion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "faqQuestion.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "faqQuestion.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(faqQuestion.language IS NULL OR faqQuestion.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			FAQQuestionModelImpl.GROUPID_COLUMN_BITMASK |
			FAQQuestionModelImpl.LANGUAGE_COLUMN_BITMASK |
			FAQQuestionModelImpl.APPROVED_COLUMN_BITMASK |
			FAQQuestionModelImpl.SENTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_A(long groupId, String language,
		boolean approved) {
		return findByG_L_A(groupId, language, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_A(long groupId, String language,
		boolean approved, int start, int end) {
		return findByG_L_A(groupId, language, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_A(long groupId, String language,
		boolean approved, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return findByG_L_A(groupId, language, approved, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_A(long groupId, String language,
		boolean approved, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A;
			finderArgs = new Object[] { groupId, language, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_A;
			finderArgs = new Object[] {
					groupId, language, approved,
					
					start, end, orderByComparator
				};
		}

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQQuestion faqQuestion : list) {
					if ((groupId != faqQuestion.getGroupId()) ||
							!Objects.equals(language, faqQuestion.getLanguage()) ||
							(approved != faqQuestion.getApproved())) {
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

			query.append(_SQL_SELECT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(approved);

				if (!pagination) {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_A_First(long groupId, String language,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_A_First(groupId, language,
				approved, orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_A_First(long groupId, String language,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator) {
		List<FAQQuestion> list = findByG_L_A(groupId, language, approved, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_A_Last(long groupId, String language,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_A_Last(groupId, language,
				approved, orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_A_Last(long groupId, String language,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator) {
		int count = countByG_L_A(groupId, language, approved);

		if (count == 0) {
			return null;
		}

		List<FAQQuestion> list = findByG_L_A(groupId, language, approved,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param id the primary key of the current f a q question
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion[] findByG_L_A_PrevAndNext(long id, long groupId,
		String language, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQQuestion[] array = new FAQQuestionImpl[3];

			array[0] = getByG_L_A_PrevAndNext(session, faqQuestion, groupId,
					language, approved, orderByComparator, true);

			array[1] = faqQuestion;

			array[2] = getByG_L_A_PrevAndNext(session, faqQuestion, groupId,
					language, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQQuestion getByG_L_A_PrevAndNext(Session session,
		FAQQuestion faqQuestion, long groupId, String language,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator,
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

		query.append(_SQL_SELECT_FAQQUESTION_WHERE);

		query.append(_FINDER_COLUMN_G_L_A_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_A_APPROVED_2);

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
			query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 */
	@Override
	public void removeByG_L_A(long groupId, String language, boolean approved) {
		for (FAQQuestion faqQuestion : findByG_L_A(groupId, language, approved,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param approved the approved
	 * @return the number of matching f a q questions
	 */
	@Override
	public int countByG_L_A(long groupId, String language, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_A;

		Object[] finderArgs = new Object[] { groupId, language, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_A_APPROVED_2);

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

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_G_L_A_GROUPID_2 = "faqQuestion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_1 = "faqQuestion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_2 = "faqQuestion.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_A_LANGUAGE_3 = "(faqQuestion.language IS NULL OR faqQuestion.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_A_APPROVED_2 = "faqQuestion.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_C_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C_A =
		new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_C_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			},
			FAQQuestionModelImpl.GROUPID_COLUMN_BITMASK |
			FAQQuestionModelImpl.LANGUAGE_COLUMN_BITMASK |
			FAQQuestionModelImpl.CATEGORYID_COLUMN_BITMASK |
			FAQQuestionModelImpl.APPROVED_COLUMN_BITMASK |
			FAQQuestionModelImpl.SENTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_C_A = new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_C_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @return the matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A(long groupId, String language,
		long categoryId, boolean approved) {
		return findByG_L_C_A(groupId, language, categoryId, approved,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A(long groupId, String language,
		long categoryId, boolean approved, int start, int end) {
		return findByG_L_C_A(groupId, language, categoryId, approved, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A(long groupId, String language,
		long categoryId, boolean approved, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return findByG_L_C_A(groupId, language, categoryId, approved, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A(long groupId, String language,
		long categoryId, boolean approved, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C_A;
			finderArgs = new Object[] { groupId, language, categoryId, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C_A;
			finderArgs = new Object[] {
					groupId, language, categoryId, approved,
					
					start, end, orderByComparator
				};
		}

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQQuestion faqQuestion : list) {
					if ((groupId != faqQuestion.getGroupId()) ||
							!Objects.equals(language, faqQuestion.getLanguage()) ||
							(categoryId != faqQuestion.getCategoryId()) ||
							(approved != faqQuestion.getApproved())) {
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

			query.append(_SQL_SELECT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_C_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_C_A_CATEGORYID_2);

			query.append(_FINDER_COLUMN_G_L_C_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(categoryId);

				qPos.add(approved);

				if (!pagination) {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_C_A_First(long groupId, String language,
		long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_C_A_First(groupId, language,
				categoryId, approved, orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_C_A_First(long groupId, String language,
		long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		List<FAQQuestion> list = findByG_L_C_A(groupId, language, categoryId,
				approved, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_C_A_Last(long groupId, String language,
		long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_C_A_Last(groupId, language,
				categoryId, approved, orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_C_A_Last(long groupId, String language,
		long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		int count = countByG_L_C_A(groupId, language, categoryId, approved);

		if (count == 0) {
			return null;
		}

		List<FAQQuestion> list = findByG_L_C_A(groupId, language, categoryId,
				approved, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param id the primary key of the current f a q question
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion[] findByG_L_C_A_PrevAndNext(long id, long groupId,
		String language, long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQQuestion[] array = new FAQQuestionImpl[3];

			array[0] = getByG_L_C_A_PrevAndNext(session, faqQuestion, groupId,
					language, categoryId, approved, orderByComparator, true);

			array[1] = faqQuestion;

			array[2] = getByG_L_C_A_PrevAndNext(session, faqQuestion, groupId,
					language, categoryId, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQQuestion getByG_L_C_A_PrevAndNext(Session session,
		FAQQuestion faqQuestion, long groupId, String language,
		long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_FAQQUESTION_WHERE);

		query.append(_FINDER_COLUMN_G_L_C_A_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_C_A_CATEGORYID_2);

		query.append(_FINDER_COLUMN_G_L_C_A_APPROVED_2);

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
			query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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

		qPos.add(categoryId);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 */
	@Override
	public void removeByG_L_C_A(long groupId, String language, long categoryId,
		boolean approved) {
		for (FAQQuestion faqQuestion : findByG_L_C_A(groupId, language,
				categoryId, approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @return the number of matching f a q questions
	 */
	@Override
	public int countByG_L_C_A(long groupId, String language, long categoryId,
		boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_C_A;

		Object[] finderArgs = new Object[] {
				groupId, language, categoryId, approved
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_C_A_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_C_A_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_C_A_CATEGORYID_2);

			query.append(_FINDER_COLUMN_G_L_C_A_APPROVED_2);

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

				qPos.add(categoryId);

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_G_L_C_A_GROUPID_2 = "faqQuestion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_LANGUAGE_1 = "faqQuestion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_LANGUAGE_2 = "faqQuestion.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_LANGUAGE_3 = "(faqQuestion.language IS NULL OR faqQuestion.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_CATEGORYID_2 = "faqQuestion.categoryId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_APPROVED_2 = "faqQuestion.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C_A_Q =
		new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, FAQQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_C_A_Q",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_C_A_Q =
		new FinderPath(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByG_L_C_A_Q",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @return the matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A_Q(long groupId, String language,
		long categoryId, boolean approved, long id) {
		return findByG_L_C_A_Q(groupId, language, categoryId, approved, id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A_Q(long groupId, String language,
		long categoryId, boolean approved, long id, int start, int end) {
		return findByG_L_C_A_Q(groupId, language, categoryId, approved, id,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A_Q(long groupId, String language,
		long categoryId, boolean approved, long id, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return findByG_L_C_A_Q(groupId, language, categoryId, approved, id,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q questions
	 */
	@Override
	public List<FAQQuestion> findByG_L_C_A_Q(long groupId, String language,
		long categoryId, boolean approved, long id, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_C_A_Q;
		finderArgs = new Object[] {
				groupId, language, categoryId, approved, id,
				
				start, end, orderByComparator
			};

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQQuestion faqQuestion : list) {
					if ((groupId != faqQuestion.getGroupId()) ||
							!Objects.equals(language, faqQuestion.getLanguage()) ||
							(categoryId != faqQuestion.getCategoryId()) ||
							(approved != faqQuestion.getApproved()) ||
							(id == faqQuestion.getId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_C_A_Q_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_C_A_Q_CATEGORYID_2);

			query.append(_FINDER_COLUMN_G_L_C_A_Q_APPROVED_2);

			query.append(_FINDER_COLUMN_G_L_C_A_Q_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQQuestionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(categoryId);

				qPos.add(approved);

				qPos.add(id);

				if (!pagination) {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_C_A_Q_First(long groupId, String language,
		long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_C_A_Q_First(groupId, language,
				categoryId, approved, id, orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(", id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_C_A_Q_First(long groupId, String language,
		long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator) {
		List<FAQQuestion> list = findByG_L_C_A_Q(groupId, language, categoryId,
				approved, id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question
	 * @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion findByG_L_C_A_Q_Last(long groupId, String language,
		long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByG_L_C_A_Q_Last(groupId, language,
				categoryId, approved, id, orderByComparator);

		if (faqQuestion != null) {
			return faqQuestion;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", categoryId=");
		msg.append(categoryId);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(", id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	 */
	@Override
	public FAQQuestion fetchByG_L_C_A_Q_Last(long groupId, String language,
		long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator) {
		int count = countByG_L_C_A_Q(groupId, language, categoryId, approved, id);

		if (count == 0) {
			return null;
		}

		List<FAQQuestion> list = findByG_L_C_A_Q(groupId, language, categoryId,
				approved, id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 */
	@Override
	public void removeByG_L_C_A_Q(long groupId, String language,
		long categoryId, boolean approved, long id) {
		for (FAQQuestion faqQuestion : findByG_L_C_A_Q(groupId, language,
				categoryId, approved, id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param categoryId the category ID
	 * @param approved the approved
	 * @param id the ID
	 * @return the number of matching f a q questions
	 */
	@Override
	public int countByG_L_C_A_Q(long groupId, String language, long categoryId,
		boolean approved, long id) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_G_L_C_A_Q;

		Object[] finderArgs = new Object[] {
				groupId, language, categoryId, approved, id
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_FAQQUESTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_C_A_Q_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_C_A_Q_CATEGORYID_2);

			query.append(_FINDER_COLUMN_G_L_C_A_Q_APPROVED_2);

			query.append(_FINDER_COLUMN_G_L_C_A_Q_ID_2);

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

				qPos.add(categoryId);

				qPos.add(approved);

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

	private static final String _FINDER_COLUMN_G_L_C_A_Q_GROUPID_2 = "faqQuestion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_1 = "faqQuestion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_2 = "faqQuestion.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_Q_LANGUAGE_3 = "(faqQuestion.language IS NULL OR faqQuestion.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_Q_CATEGORYID_2 = "faqQuestion.categoryId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_Q_APPROVED_2 = "faqQuestion.approved = ? AND ";
	private static final String _FINDER_COLUMN_G_L_C_A_Q_ID_2 = "faqQuestion.id != ?";

	public FAQQuestionPersistenceImpl() {
		setModelClass(FAQQuestion.class);
	}

	/**
	 * Caches the f a q question in the entity cache if it is enabled.
	 *
	 * @param faqQuestion the f a q question
	 */
	@Override
	public void cacheResult(FAQQuestion faqQuestion) {
		entityCache.putResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionImpl.class, faqQuestion.getPrimaryKey(), faqQuestion);

		faqQuestion.resetOriginalValues();
	}

	/**
	 * Caches the f a q questions in the entity cache if it is enabled.
	 *
	 * @param faqQuestions the f a q questions
	 */
	@Override
	public void cacheResult(List<FAQQuestion> faqQuestions) {
		for (FAQQuestion faqQuestion : faqQuestions) {
			if (entityCache.getResult(
						FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
						FAQQuestionImpl.class, faqQuestion.getPrimaryKey()) == null) {
				cacheResult(faqQuestion);
			}
			else {
				faqQuestion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all f a q questions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FAQQuestionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the f a q question.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FAQQuestion faqQuestion) {
		entityCache.removeResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionImpl.class, faqQuestion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FAQQuestion> faqQuestions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FAQQuestion faqQuestion : faqQuestions) {
			entityCache.removeResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
				FAQQuestionImpl.class, faqQuestion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new f a q question with the primary key. Does not add the f a q question to the database.
	 *
	 * @param id the primary key for the new f a q question
	 * @return the new f a q question
	 */
	@Override
	public FAQQuestion create(long id) {
		FAQQuestion faqQuestion = new FAQQuestionImpl();

		faqQuestion.setNew(true);
		faqQuestion.setPrimaryKey(id);

		return faqQuestion;
	}

	/**
	 * Removes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the f a q question
	 * @return the f a q question that was removed
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion remove(long id) throws NoSuchFAQQuestionException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q question
	 * @return the f a q question that was removed
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion remove(Serializable primaryKey)
		throws NoSuchFAQQuestionException {
		Session session = null;

		try {
			session = openSession();

			FAQQuestion faqQuestion = (FAQQuestion)session.get(FAQQuestionImpl.class,
					primaryKey);

			if (faqQuestion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFAQQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faqQuestion);
		}
		catch (NoSuchFAQQuestionException nsee) {
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
	protected FAQQuestion removeImpl(FAQQuestion faqQuestion) {
		faqQuestion = toUnwrappedModel(faqQuestion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(faqQuestion)) {
				faqQuestion = (FAQQuestion)session.get(FAQQuestionImpl.class,
						faqQuestion.getPrimaryKeyObj());
			}

			if (faqQuestion != null) {
				session.delete(faqQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (faqQuestion != null) {
			clearCache(faqQuestion);
		}

		return faqQuestion;
	}

	@Override
	public FAQQuestion updateImpl(FAQQuestion faqQuestion) {
		faqQuestion = toUnwrappedModel(faqQuestion);

		boolean isNew = faqQuestion.isNew();

		FAQQuestionModelImpl faqQuestionModelImpl = (FAQQuestionModelImpl)faqQuestion;

		Session session = null;

		try {
			session = openSession();

			if (faqQuestion.isNew()) {
				session.save(faqQuestion);

				faqQuestion.setNew(false);
			}
			else {
				faqQuestion = (FAQQuestion)session.merge(faqQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FAQQuestionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((faqQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqQuestionModelImpl.getOriginalGroupId(),
						faqQuestionModelImpl.getOriginalQuestionType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
					args);

				args = new Object[] {
						faqQuestionModelImpl.getGroupId(),
						faqQuestionModelImpl.getQuestionType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
					args);
			}

			if ((faqQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqQuestionModelImpl.getOriginalGroupId(),
						faqQuestionModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
					args);

				args = new Object[] {
						faqQuestionModelImpl.getGroupId(),
						faqQuestionModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
					args);
			}

			if ((faqQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqQuestionModelImpl.getOriginalGroupId(),
						faqQuestionModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						faqQuestionModelImpl.getGroupId(),
						faqQuestionModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((faqQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqQuestionModelImpl.getOriginalGroupId(),
						faqQuestionModelImpl.getOriginalLanguage(),
						faqQuestionModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A,
					args);

				args = new Object[] {
						faqQuestionModelImpl.getGroupId(),
						faqQuestionModelImpl.getLanguage(),
						faqQuestionModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_A,
					args);
			}

			if ((faqQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqQuestionModelImpl.getOriginalGroupId(),
						faqQuestionModelImpl.getOriginalLanguage(),
						faqQuestionModelImpl.getOriginalCategoryId(),
						faqQuestionModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_C_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C_A,
					args);

				args = new Object[] {
						faqQuestionModelImpl.getGroupId(),
						faqQuestionModelImpl.getLanguage(),
						faqQuestionModelImpl.getCategoryId(),
						faqQuestionModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_C_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_C_A,
					args);
			}
		}

		entityCache.putResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQQuestionImpl.class, faqQuestion.getPrimaryKey(), faqQuestion,
			false);

		faqQuestion.resetOriginalValues();

		return faqQuestion;
	}

	protected FAQQuestion toUnwrappedModel(FAQQuestion faqQuestion) {
		if (faqQuestion instanceof FAQQuestionImpl) {
			return faqQuestion;
		}

		FAQQuestionImpl faqQuestionImpl = new FAQQuestionImpl();

		faqQuestionImpl.setNew(faqQuestion.isNew());
		faqQuestionImpl.setPrimaryKey(faqQuestion.getPrimaryKey());

		faqQuestionImpl.setId(faqQuestion.getId());
		faqQuestionImpl.setTitle(faqQuestion.getTitle());
		faqQuestionImpl.setContent(faqQuestion.getContent());
		faqQuestionImpl.setLanguage(faqQuestion.getLanguage());
		faqQuestionImpl.setQuestionOrder(faqQuestion.getQuestionOrder());
		faqQuestionImpl.setSentDate(faqQuestion.getSentDate());
		faqQuestionImpl.setSentByUser(faqQuestion.getSentByUser());
		faqQuestionImpl.setSenderEmail(faqQuestion.getSenderEmail());
		faqQuestionImpl.setQuestionType(faqQuestion.getQuestionType());
		faqQuestionImpl.setModifiedByUser(faqQuestion.getModifiedByUser());
		faqQuestionImpl.setModifiedDate(faqQuestion.getModifiedDate());
		faqQuestionImpl.setHitCount(faqQuestion.getHitCount());
		faqQuestionImpl.setApproved(faqQuestion.isApproved());
		faqQuestionImpl.setGroupId(faqQuestion.getGroupId());
		faqQuestionImpl.setUserId(faqQuestion.getUserId());
		faqQuestionImpl.setCategoryId(faqQuestion.getCategoryId());

		return faqQuestionImpl;
	}

	/**
	 * Returns the f a q question with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q question
	 * @return the f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFAQQuestionException {
		FAQQuestion faqQuestion = fetchByPrimaryKey(primaryKey);

		if (faqQuestion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFAQQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return faqQuestion;
	}

	/**
	 * Returns the f a q question with the primary key or throws a {@link NoSuchFAQQuestionException} if it could not be found.
	 *
	 * @param id the primary key of the f a q question
	 * @return the f a q question
	 * @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion findByPrimaryKey(long id)
		throws NoSuchFAQQuestionException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the f a q question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q question
	 * @return the f a q question, or <code>null</code> if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
				FAQQuestionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		FAQQuestion faqQuestion = (FAQQuestion)serializable;

		if (faqQuestion == null) {
			Session session = null;

			try {
				session = openSession();

				faqQuestion = (FAQQuestion)session.get(FAQQuestionImpl.class,
						primaryKey);

				if (faqQuestion != null) {
					cacheResult(faqQuestion);
				}
				else {
					entityCache.putResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
						FAQQuestionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
					FAQQuestionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return faqQuestion;
	}

	/**
	 * Returns the f a q question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the f a q question
	 * @return the f a q question, or <code>null</code> if a f a q question with the primary key could not be found
	 */
	@Override
	public FAQQuestion fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, FAQQuestion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, FAQQuestion> map = new HashMap<Serializable, FAQQuestion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			FAQQuestion faqQuestion = fetchByPrimaryKey(primaryKey);

			if (faqQuestion != null) {
				map.put(primaryKey, faqQuestion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
					FAQQuestionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (FAQQuestion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FAQQUESTION_WHERE_PKS_IN);

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

			for (FAQQuestion faqQuestion : (List<FAQQuestion>)q.list()) {
				map.put(faqQuestion.getPrimaryKeyObj(), faqQuestion);

				cacheResult(faqQuestion);

				uncachedPrimaryKeys.remove(faqQuestion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FAQQuestionModelImpl.ENTITY_CACHE_ENABLED,
					FAQQuestionImpl.class, primaryKey, nullModel);
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
	 * Returns all the f a q questions.
	 *
	 * @return the f a q questions
	 */
	@Override
	public List<FAQQuestion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @return the range of f a q questions
	 */
	@Override
	public List<FAQQuestion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of f a q questions
	 */
	@Override
	public List<FAQQuestion> findAll(int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q questions
	 * @param end the upper bound of the range of f a q questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of f a q questions
	 */
	@Override
	public List<FAQQuestion> findAll(int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
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

		List<FAQQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAQQUESTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQQUESTION;

				if (pagination) {
					sql = sql.concat(FAQQuestionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQQuestion>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the f a q questions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FAQQuestion faqQuestion : findAll()) {
			remove(faqQuestion);
		}
	}

	/**
	 * Returns the number of f a q questions.
	 *
	 * @return the number of f a q questions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAQQUESTION);

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
		return FAQQuestionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the f a q question persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FAQQuestionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAQQUESTION = "SELECT faqQuestion FROM FAQQuestion faqQuestion";
	private static final String _SQL_SELECT_FAQQUESTION_WHERE_PKS_IN = "SELECT faqQuestion FROM FAQQuestion faqQuestion WHERE id_ IN (";
	private static final String _SQL_SELECT_FAQQUESTION_WHERE = "SELECT faqQuestion FROM FAQQuestion faqQuestion WHERE ";
	private static final String _SQL_COUNT_FAQQUESTION = "SELECT COUNT(faqQuestion) FROM FAQQuestion faqQuestion";
	private static final String _SQL_COUNT_FAQQUESTION_WHERE = "SELECT COUNT(faqQuestion) FROM FAQQuestion faqQuestion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faqQuestion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQQuestion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FAQQuestion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FAQQuestionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}