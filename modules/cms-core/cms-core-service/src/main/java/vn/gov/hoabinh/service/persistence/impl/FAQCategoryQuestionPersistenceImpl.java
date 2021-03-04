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

import vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException;
import vn.gov.hoabinh.model.FAQCategoryQuestion;
import vn.gov.hoabinh.model.impl.FAQCategoryQuestionImpl;
import vn.gov.hoabinh.model.impl.FAQCategoryQuestionModelImpl;
import vn.gov.hoabinh.service.persistence.FAQCategoryQuestionPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the f a q category question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestionPersistence
 * @see vn.gov.hoabinh.service.persistence.FAQCategoryQuestionUtil
 * @generated
 */
@ProviderType
public class FAQCategoryQuestionPersistenceImpl extends BasePersistenceImpl<FAQCategoryQuestion>
	implements FAQCategoryQuestionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FAQCategoryQuestionUtil} to access the f a q category question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FAQCategoryQuestionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTIONID =
		new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuestionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID =
		new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuestionId",
			new String[] { Long.class.getName() },
			FAQCategoryQuestionModelImpl.QUESTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUESTIONID = new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the f a q category questions where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByQuestionId(long questionId) {
		return findByQuestionId(questionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q category questions where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionId the question ID
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @return the range of matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByQuestionId(long questionId,
		int start, int end) {
		return findByQuestionId(questionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q category questions where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionId the question ID
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByQuestionId(long questionId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return findByQuestionId(questionId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q category questions where questionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionId the question ID
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByQuestionId(long questionId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID;
			finderArgs = new Object[] { questionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTIONID;
			finderArgs = new Object[] { questionId, start, end, orderByComparator };
		}

		List<FAQCategoryQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategoryQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategoryQuestion faqCategoryQuestion : list) {
					if ((questionId != faqCategoryQuestion.getQuestionId())) {
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

			query.append(_SQL_SELECT_FAQCATEGORYQUESTION_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCategoryQuestionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				if (!pagination) {
					list = (List<FAQCategoryQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategoryQuestion>)QueryUtil.list(q,
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
	 * Returns the first f a q category question in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion findByQuestionId_First(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = fetchByQuestionId_First(questionId,
				orderByComparator);

		if (faqCategoryQuestion != null) {
			return faqCategoryQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionId=");
		msg.append(questionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q category question in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion fetchByQuestionId_First(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		List<FAQCategoryQuestion> list = findByQuestionId(questionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q category question in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion findByQuestionId_Last(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = fetchByQuestionId_Last(questionId,
				orderByComparator);

		if (faqCategoryQuestion != null) {
			return faqCategoryQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionId=");
		msg.append(questionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q category question in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion fetchByQuestionId_Last(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		int count = countByQuestionId(questionId);

		if (count == 0) {
			return null;
		}

		List<FAQCategoryQuestion> list = findByQuestionId(questionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q category questions before and after the current f a q category question in the ordered set where questionId = &#63;.
	 *
	 * @param id the primary key of the current f a q category question
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion[] findByQuestionId_PrevAndNext(long id,
		long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQCategoryQuestion[] array = new FAQCategoryQuestionImpl[3];

			array[0] = getByQuestionId_PrevAndNext(session,
					faqCategoryQuestion, questionId, orderByComparator, true);

			array[1] = faqCategoryQuestion;

			array[2] = getByQuestionId_PrevAndNext(session,
					faqCategoryQuestion, questionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQCategoryQuestion getByQuestionId_PrevAndNext(Session session,
		FAQCategoryQuestion faqCategoryQuestion, long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
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

		query.append(_SQL_SELECT_FAQCATEGORYQUESTION_WHERE);

		query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

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
			query.append(FAQCategoryQuestionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqCategoryQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQCategoryQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q category questions where questionId = &#63; from the database.
	 *
	 * @param questionId the question ID
	 */
	@Override
	public void removeByQuestionId(long questionId) {
		for (FAQCategoryQuestion faqCategoryQuestion : findByQuestionId(
				questionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqCategoryQuestion);
		}
	}

	/**
	 * Returns the number of f a q category questions where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the number of matching f a q category questions
	 */
	@Override
	public int countByQuestionId(long questionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUESTIONID;

		Object[] finderArgs = new Object[] { questionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCATEGORYQUESTION_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

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

	private static final String _FINDER_COLUMN_QUESTIONID_QUESTIONID_2 = "faqCategoryQuestion.questionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYID =
		new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCategoryId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYID =
		new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCategoryId",
			new String[] { Long.class.getName() },
			FAQCategoryQuestionModelImpl.CATEGORYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYID = new FinderPath(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategoryId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the f a q category questions where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByCategoryId(long categoryId) {
		return findByCategoryId(categoryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q category questions where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @return the range of matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByCategoryId(long categoryId,
		int start, int end) {
		return findByCategoryId(categoryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q category questions where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByCategoryId(long categoryId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return findByCategoryId(categoryId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q category questions where categoryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param categoryId the category ID
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findByCategoryId(long categoryId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYID;
			finderArgs = new Object[] { categoryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYID;
			finderArgs = new Object[] { categoryId, start, end, orderByComparator };
		}

		List<FAQCategoryQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategoryQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQCategoryQuestion faqCategoryQuestion : list) {
					if ((categoryId != faqCategoryQuestion.getCategoryId())) {
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

			query.append(_SQL_SELECT_FAQCATEGORYQUESTION_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCategoryQuestionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryId);

				if (!pagination) {
					list = (List<FAQCategoryQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategoryQuestion>)QueryUtil.list(q,
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
	 * Returns the first f a q category question in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion findByCategoryId_First(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = fetchByCategoryId_First(categoryId,
				orderByComparator);

		if (faqCategoryQuestion != null) {
			return faqCategoryQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryQuestionException(msg.toString());
	}

	/**
	 * Returns the first f a q category question in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion fetchByCategoryId_First(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		List<FAQCategoryQuestion> list = findByCategoryId(categoryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q category question in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion findByCategoryId_Last(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = fetchByCategoryId_Last(categoryId,
				orderByComparator);

		if (faqCategoryQuestion != null) {
			return faqCategoryQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("categoryId=");
		msg.append(categoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCategoryQuestionException(msg.toString());
	}

	/**
	 * Returns the last f a q category question in the ordered set where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	 */
	@Override
	public FAQCategoryQuestion fetchByCategoryId_Last(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		int count = countByCategoryId(categoryId);

		if (count == 0) {
			return null;
		}

		List<FAQCategoryQuestion> list = findByCategoryId(categoryId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q category questions before and after the current f a q category question in the ordered set where categoryId = &#63;.
	 *
	 * @param id the primary key of the current f a q category question
	 * @param categoryId the category ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion[] findByCategoryId_PrevAndNext(long id,
		long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQCategoryQuestion[] array = new FAQCategoryQuestionImpl[3];

			array[0] = getByCategoryId_PrevAndNext(session,
					faqCategoryQuestion, categoryId, orderByComparator, true);

			array[1] = faqCategoryQuestion;

			array[2] = getByCategoryId_PrevAndNext(session,
					faqCategoryQuestion, categoryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQCategoryQuestion getByCategoryId_PrevAndNext(Session session,
		FAQCategoryQuestion faqCategoryQuestion, long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
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

		query.append(_SQL_SELECT_FAQCATEGORYQUESTION_WHERE);

		query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

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
			query.append(FAQCategoryQuestionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(categoryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqCategoryQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQCategoryQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q category questions where categoryId = &#63; from the database.
	 *
	 * @param categoryId the category ID
	 */
	@Override
	public void removeByCategoryId(long categoryId) {
		for (FAQCategoryQuestion faqCategoryQuestion : findByCategoryId(
				categoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqCategoryQuestion);
		}
	}

	/**
	 * Returns the number of f a q category questions where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the number of matching f a q category questions
	 */
	@Override
	public int countByCategoryId(long categoryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYID;

		Object[] finderArgs = new Object[] { categoryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCATEGORYQUESTION_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryId);

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

	private static final String _FINDER_COLUMN_CATEGORYID_CATEGORYID_2 = "faqCategoryQuestion.categoryId = ?";

	public FAQCategoryQuestionPersistenceImpl() {
		setModelClass(FAQCategoryQuestion.class);
	}

	/**
	 * Caches the f a q category question in the entity cache if it is enabled.
	 *
	 * @param faqCategoryQuestion the f a q category question
	 */
	@Override
	public void cacheResult(FAQCategoryQuestion faqCategoryQuestion) {
		entityCache.putResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class, faqCategoryQuestion.getPrimaryKey(),
			faqCategoryQuestion);

		faqCategoryQuestion.resetOriginalValues();
	}

	/**
	 * Caches the f a q category questions in the entity cache if it is enabled.
	 *
	 * @param faqCategoryQuestions the f a q category questions
	 */
	@Override
	public void cacheResult(List<FAQCategoryQuestion> faqCategoryQuestions) {
		for (FAQCategoryQuestion faqCategoryQuestion : faqCategoryQuestions) {
			if (entityCache.getResult(
						FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
						FAQCategoryQuestionImpl.class,
						faqCategoryQuestion.getPrimaryKey()) == null) {
				cacheResult(faqCategoryQuestion);
			}
			else {
				faqCategoryQuestion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all f a q category questions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FAQCategoryQuestionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the f a q category question.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FAQCategoryQuestion faqCategoryQuestion) {
		entityCache.removeResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class, faqCategoryQuestion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FAQCategoryQuestion> faqCategoryQuestions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FAQCategoryQuestion faqCategoryQuestion : faqCategoryQuestions) {
			entityCache.removeResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
				FAQCategoryQuestionImpl.class,
				faqCategoryQuestion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	 *
	 * @param id the primary key for the new f a q category question
	 * @return the new f a q category question
	 */
	@Override
	public FAQCategoryQuestion create(long id) {
		FAQCategoryQuestion faqCategoryQuestion = new FAQCategoryQuestionImpl();

		faqCategoryQuestion.setNew(true);
		faqCategoryQuestion.setPrimaryKey(id);

		return faqCategoryQuestion;
	}

	/**
	 * Removes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the f a q category question
	 * @return the f a q category question that was removed
	 * @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion remove(long id)
		throws NoSuchFAQCategoryQuestionException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q category question
	 * @return the f a q category question that was removed
	 * @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion remove(Serializable primaryKey)
		throws NoSuchFAQCategoryQuestionException {
		Session session = null;

		try {
			session = openSession();

			FAQCategoryQuestion faqCategoryQuestion = (FAQCategoryQuestion)session.get(FAQCategoryQuestionImpl.class,
					primaryKey);

			if (faqCategoryQuestion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFAQCategoryQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faqCategoryQuestion);
		}
		catch (NoSuchFAQCategoryQuestionException nsee) {
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
	protected FAQCategoryQuestion removeImpl(
		FAQCategoryQuestion faqCategoryQuestion) {
		faqCategoryQuestion = toUnwrappedModel(faqCategoryQuestion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(faqCategoryQuestion)) {
				faqCategoryQuestion = (FAQCategoryQuestion)session.get(FAQCategoryQuestionImpl.class,
						faqCategoryQuestion.getPrimaryKeyObj());
			}

			if (faqCategoryQuestion != null) {
				session.delete(faqCategoryQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (faqCategoryQuestion != null) {
			clearCache(faqCategoryQuestion);
		}

		return faqCategoryQuestion;
	}

	@Override
	public FAQCategoryQuestion updateImpl(
		FAQCategoryQuestion faqCategoryQuestion) {
		faqCategoryQuestion = toUnwrappedModel(faqCategoryQuestion);

		boolean isNew = faqCategoryQuestion.isNew();

		FAQCategoryQuestionModelImpl faqCategoryQuestionModelImpl = (FAQCategoryQuestionModelImpl)faqCategoryQuestion;

		Session session = null;

		try {
			session = openSession();

			if (faqCategoryQuestion.isNew()) {
				session.save(faqCategoryQuestion);

				faqCategoryQuestion.setNew(false);
			}
			else {
				faqCategoryQuestion = (FAQCategoryQuestion)session.merge(faqCategoryQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FAQCategoryQuestionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((faqCategoryQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCategoryQuestionModelImpl.getOriginalQuestionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID,
					args);

				args = new Object[] { faqCategoryQuestionModelImpl.getQuestionId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID,
					args);
			}

			if ((faqCategoryQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCategoryQuestionModelImpl.getOriginalCategoryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYID,
					args);

				args = new Object[] { faqCategoryQuestionModelImpl.getCategoryId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYID,
					args);
			}
		}

		entityCache.putResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
			FAQCategoryQuestionImpl.class, faqCategoryQuestion.getPrimaryKey(),
			faqCategoryQuestion, false);

		faqCategoryQuestion.resetOriginalValues();

		return faqCategoryQuestion;
	}

	protected FAQCategoryQuestion toUnwrappedModel(
		FAQCategoryQuestion faqCategoryQuestion) {
		if (faqCategoryQuestion instanceof FAQCategoryQuestionImpl) {
			return faqCategoryQuestion;
		}

		FAQCategoryQuestionImpl faqCategoryQuestionImpl = new FAQCategoryQuestionImpl();

		faqCategoryQuestionImpl.setNew(faqCategoryQuestion.isNew());
		faqCategoryQuestionImpl.setPrimaryKey(faqCategoryQuestion.getPrimaryKey());

		faqCategoryQuestionImpl.setId(faqCategoryQuestion.getId());
		faqCategoryQuestionImpl.setQuestionId(faqCategoryQuestion.getQuestionId());
		faqCategoryQuestionImpl.setCategoryId(faqCategoryQuestion.getCategoryId());

		return faqCategoryQuestionImpl;
	}

	/**
	 * Returns the f a q category question with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q category question
	 * @return the f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFAQCategoryQuestionException {
		FAQCategoryQuestion faqCategoryQuestion = fetchByPrimaryKey(primaryKey);

		if (faqCategoryQuestion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFAQCategoryQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return faqCategoryQuestion;
	}

	/**
	 * Returns the f a q category question with the primary key or throws a {@link NoSuchFAQCategoryQuestionException} if it could not be found.
	 *
	 * @param id the primary key of the f a q category question
	 * @return the f a q category question
	 * @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion findByPrimaryKey(long id)
		throws NoSuchFAQCategoryQuestionException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the f a q category question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q category question
	 * @return the f a q category question, or <code>null</code> if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
				FAQCategoryQuestionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		FAQCategoryQuestion faqCategoryQuestion = (FAQCategoryQuestion)serializable;

		if (faqCategoryQuestion == null) {
			Session session = null;

			try {
				session = openSession();

				faqCategoryQuestion = (FAQCategoryQuestion)session.get(FAQCategoryQuestionImpl.class,
						primaryKey);

				if (faqCategoryQuestion != null) {
					cacheResult(faqCategoryQuestion);
				}
				else {
					entityCache.putResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
						FAQCategoryQuestionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
					FAQCategoryQuestionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return faqCategoryQuestion;
	}

	/**
	 * Returns the f a q category question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the f a q category question
	 * @return the f a q category question, or <code>null</code> if a f a q category question with the primary key could not be found
	 */
	@Override
	public FAQCategoryQuestion fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, FAQCategoryQuestion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, FAQCategoryQuestion> map = new HashMap<Serializable, FAQCategoryQuestion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			FAQCategoryQuestion faqCategoryQuestion = fetchByPrimaryKey(primaryKey);

			if (faqCategoryQuestion != null) {
				map.put(primaryKey, faqCategoryQuestion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
					FAQCategoryQuestionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (FAQCategoryQuestion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FAQCATEGORYQUESTION_WHERE_PKS_IN);

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

			for (FAQCategoryQuestion faqCategoryQuestion : (List<FAQCategoryQuestion>)q.list()) {
				map.put(faqCategoryQuestion.getPrimaryKeyObj(),
					faqCategoryQuestion);

				cacheResult(faqCategoryQuestion);

				uncachedPrimaryKeys.remove(faqCategoryQuestion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FAQCategoryQuestionModelImpl.ENTITY_CACHE_ENABLED,
					FAQCategoryQuestionImpl.class, primaryKey, nullModel);
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
	 * Returns all the f a q category questions.
	 *
	 * @return the f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q category questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @return the range of f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q category questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findAll(int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q category questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q category questions
	 * @param end the upper bound of the range of f a q category questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of f a q category questions
	 */
	@Override
	public List<FAQCategoryQuestion> findAll(int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
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

		List<FAQCategoryQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<FAQCategoryQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAQCATEGORYQUESTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQCATEGORYQUESTION;

				if (pagination) {
					sql = sql.concat(FAQCategoryQuestionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FAQCategoryQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQCategoryQuestion>)QueryUtil.list(q,
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
	 * Removes all the f a q category questions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FAQCategoryQuestion faqCategoryQuestion : findAll()) {
			remove(faqCategoryQuestion);
		}
	}

	/**
	 * Returns the number of f a q category questions.
	 *
	 * @return the number of f a q category questions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAQCATEGORYQUESTION);

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
		return FAQCategoryQuestionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the f a q category question persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FAQCategoryQuestionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAQCATEGORYQUESTION = "SELECT faqCategoryQuestion FROM FAQCategoryQuestion faqCategoryQuestion";
	private static final String _SQL_SELECT_FAQCATEGORYQUESTION_WHERE_PKS_IN = "SELECT faqCategoryQuestion FROM FAQCategoryQuestion faqCategoryQuestion WHERE id_ IN (";
	private static final String _SQL_SELECT_FAQCATEGORYQUESTION_WHERE = "SELECT faqCategoryQuestion FROM FAQCategoryQuestion faqCategoryQuestion WHERE ";
	private static final String _SQL_COUNT_FAQCATEGORYQUESTION = "SELECT COUNT(faqCategoryQuestion) FROM FAQCategoryQuestion faqCategoryQuestion";
	private static final String _SQL_COUNT_FAQCATEGORYQUESTION_WHERE = "SELECT COUNT(faqCategoryQuestion) FROM FAQCategoryQuestion faqCategoryQuestion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faqCategoryQuestion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQCategoryQuestion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FAQCategoryQuestion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FAQCategoryQuestionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}