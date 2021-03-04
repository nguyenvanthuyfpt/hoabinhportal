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

import vn.gov.hoabinh.exception.NoSuchFAQAnswerException;
import vn.gov.hoabinh.model.FAQAnswer;
import vn.gov.hoabinh.model.impl.FAQAnswerImpl;
import vn.gov.hoabinh.model.impl.FAQAnswerModelImpl;
import vn.gov.hoabinh.service.persistence.FAQAnswerPersistence;

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
 * The persistence implementation for the f a q answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswerPersistence
 * @see vn.gov.hoabinh.service.persistence.FAQAnswerUtil
 * @generated
 */
@ProviderType
public class FAQAnswerPersistenceImpl extends BasePersistenceImpl<FAQAnswer>
	implements FAQAnswerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FAQAnswerUtil} to access the f a q answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FAQAnswerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { String.class.getName() },
			FAQAnswerModelImpl.LANGUAGE_COLUMN_BITMASK |
			FAQAnswerModelImpl.ANSWEREDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { String.class.getName() });

	/**
	 * Returns all the f a q answers where language = &#63;.
	 *
	 * @param language the language
	 * @return the matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByG_L(String language) {
		return findByG_L(language, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q answers where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param language the language
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @return the range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByG_L(String language, int start, int end) {
		return findByG_L(language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q answers where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param language the language
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByG_L(String language, int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return findByG_L(language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q answers where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param language the language
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByG_L(String language, int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] { language };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L;
			finderArgs = new Object[] { language, start, end, orderByComparator };
		}

		List<FAQAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<FAQAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQAnswer faqAnswer : list) {
					if (!Objects.equals(language, faqAnswer.getLanguage())) {
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

			query.append(_SQL_SELECT_FAQANSWER_WHERE);

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
				query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLanguage) {
					qPos.add(language);
				}

				if (!pagination) {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q answer in the ordered set where language = &#63;.
	 *
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByG_L_First(String language,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByG_L_First(language, orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the first f a q answer in the ordered set where language = &#63;.
	 *
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByG_L_First(String language,
		OrderByComparator<FAQAnswer> orderByComparator) {
		List<FAQAnswer> list = findByG_L(language, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q answer in the ordered set where language = &#63;.
	 *
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByG_L_Last(String language,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByG_L_Last(language, orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the last f a q answer in the ordered set where language = &#63;.
	 *
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByG_L_Last(String language,
		OrderByComparator<FAQAnswer> orderByComparator) {
		int count = countByG_L(language);

		if (count == 0) {
			return null;
		}

		List<FAQAnswer> list = findByG_L(language, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q answers before and after the current f a q answer in the ordered set where language = &#63;.
	 *
	 * @param id the primary key of the current f a q answer
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q answer
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer[] findByG_L_PrevAndNext(long id, String language,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQAnswer[] array = new FAQAnswerImpl[3];

			array[0] = getByG_L_PrevAndNext(session, faqAnswer, language,
					orderByComparator, true);

			array[1] = faqAnswer;

			array[2] = getByG_L_PrevAndNext(session, faqAnswer, language,
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

	protected FAQAnswer getByG_L_PrevAndNext(Session session,
		FAQAnswer faqAnswer, String language,
		OrderByComparator<FAQAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQANSWER_WHERE);

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
			query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLanguage) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q answers where language = &#63; from the database.
	 *
	 * @param language the language
	 */
	@Override
	public void removeByG_L(String language) {
		for (FAQAnswer faqAnswer : findByG_L(language, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(faqAnswer);
		}
	}

	/**
	 * Returns the number of f a q answers where language = &#63;.
	 *
	 * @param language the language
	 * @return the number of matching f a q answers
	 */
	@Override
	public int countByG_L(String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQANSWER_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "faqAnswer.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "faqAnswer.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(faqAnswer.language IS NULL OR faqAnswer.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPROVED = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApproved",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED =
		new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApproved",
			new String[] { Boolean.class.getName() },
			FAQAnswerModelImpl.APPROVED_COLUMN_BITMASK |
			FAQAnswerModelImpl.ANSWEREDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPROVED = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApproved",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the f a q answers where approved = &#63;.
	 *
	 * @param approved the approved
	 * @return the matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByApproved(boolean approved) {
		return findByApproved(approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the f a q answers where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @return the range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByApproved(boolean approved, int start, int end) {
		return findByApproved(approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q answers where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByApproved(boolean approved, int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return findByApproved(approved, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q answers where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByApproved(boolean approved, int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED;
			finderArgs = new Object[] { approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPROVED;
			finderArgs = new Object[] { approved, start, end, orderByComparator };
		}

		List<FAQAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<FAQAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQAnswer faqAnswer : list) {
					if ((approved != faqAnswer.getApproved())) {
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

			query.append(_SQL_SELECT_FAQANSWER_WHERE);

			query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				if (!pagination) {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q answer in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByApproved_First(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByApproved_First(approved, orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the first f a q answer in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByApproved_First(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		List<FAQAnswer> list = findByApproved(approved, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q answer in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByApproved_Last(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByApproved_Last(approved, orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the last f a q answer in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByApproved_Last(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		int count = countByApproved(approved);

		if (count == 0) {
			return null;
		}

		List<FAQAnswer> list = findByApproved(approved, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q answers before and after the current f a q answer in the ordered set where approved = &#63;.
	 *
	 * @param id the primary key of the current f a q answer
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q answer
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer[] findByApproved_PrevAndNext(long id, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQAnswer[] array = new FAQAnswerImpl[3];

			array[0] = getByApproved_PrevAndNext(session, faqAnswer, approved,
					orderByComparator, true);

			array[1] = faqAnswer;

			array[2] = getByApproved_PrevAndNext(session, faqAnswer, approved,
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

	protected FAQAnswer getByApproved_PrevAndNext(Session session,
		FAQAnswer faqAnswer, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQANSWER_WHERE);

		query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

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
			query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q answers where approved = &#63; from the database.
	 *
	 * @param approved the approved
	 */
	@Override
	public void removeByApproved(boolean approved) {
		for (FAQAnswer faqAnswer : findByApproved(approved, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(faqAnswer);
		}
	}

	/**
	 * Returns the number of f a q answers where approved = &#63;.
	 *
	 * @param approved the approved
	 * @return the number of matching f a q answers
	 */
	@Override
	public int countByApproved(boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPROVED;

		Object[] finderArgs = new Object[] { approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQANSWER_WHERE);

			query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_APPROVED_APPROVED_2 = "faqAnswer.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTIONID =
		new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuestionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID =
		new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuestionId",
			new String[] { Long.class.getName() },
			FAQAnswerModelImpl.QUESTIONID_COLUMN_BITMASK |
			FAQAnswerModelImpl.ANSWEREDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUESTIONID = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the f a q answers where questionid = &#63;.
	 *
	 * @param questionid the questionid
	 * @return the matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQuestionId(long questionid) {
		return findByQuestionId(questionid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q answers where questionid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionid the questionid
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @return the range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQuestionId(long questionid, int start, int end) {
		return findByQuestionId(questionid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q answers where questionid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionid the questionid
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQuestionId(long questionid, int start,
		int end, OrderByComparator<FAQAnswer> orderByComparator) {
		return findByQuestionId(questionid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q answers where questionid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionid the questionid
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQuestionId(long questionid, int start,
		int end, OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID;
			finderArgs = new Object[] { questionid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTIONID;
			finderArgs = new Object[] { questionid, start, end, orderByComparator };
		}

		List<FAQAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<FAQAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQAnswer faqAnswer : list) {
					if ((questionid != faqAnswer.getQuestionid())) {
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

			query.append(_SQL_SELECT_FAQANSWER_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionid);

				if (!pagination) {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q answer in the ordered set where questionid = &#63;.
	 *
	 * @param questionid the questionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByQuestionId_First(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByQuestionId_First(questionid,
				orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionid=");
		msg.append(questionid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the first f a q answer in the ordered set where questionid = &#63;.
	 *
	 * @param questionid the questionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByQuestionId_First(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator) {
		List<FAQAnswer> list = findByQuestionId(questionid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q answer in the ordered set where questionid = &#63;.
	 *
	 * @param questionid the questionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByQuestionId_Last(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByQuestionId_Last(questionid,
				orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionid=");
		msg.append(questionid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the last f a q answer in the ordered set where questionid = &#63;.
	 *
	 * @param questionid the questionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByQuestionId_Last(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator) {
		int count = countByQuestionId(questionid);

		if (count == 0) {
			return null;
		}

		List<FAQAnswer> list = findByQuestionId(questionid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63;.
	 *
	 * @param id the primary key of the current f a q answer
	 * @param questionid the questionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q answer
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer[] findByQuestionId_PrevAndNext(long id, long questionid,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQAnswer[] array = new FAQAnswerImpl[3];

			array[0] = getByQuestionId_PrevAndNext(session, faqAnswer,
					questionid, orderByComparator, true);

			array[1] = faqAnswer;

			array[2] = getByQuestionId_PrevAndNext(session, faqAnswer,
					questionid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQAnswer getByQuestionId_PrevAndNext(Session session,
		FAQAnswer faqAnswer, long questionid,
		OrderByComparator<FAQAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQANSWER_WHERE);

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
			query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q answers where questionid = &#63; from the database.
	 *
	 * @param questionid the questionid
	 */
	@Override
	public void removeByQuestionId(long questionid) {
		for (FAQAnswer faqAnswer : findByQuestionId(questionid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqAnswer);
		}
	}

	/**
	 * Returns the number of f a q answers where questionid = &#63;.
	 *
	 * @param questionid the questionid
	 * @return the number of matching f a q answers
	 */
	@Override
	public int countByQuestionId(long questionid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUESTIONID;

		Object[] finderArgs = new Object[] { questionid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQANSWER_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONID_QUESTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionid);

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

	private static final String _FINDER_COLUMN_QUESTIONID_QUESTIONID_2 = "faqAnswer.questionid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_Q_A = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQ_A",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Q_A = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, FAQAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQ_A",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			FAQAnswerModelImpl.QUESTIONID_COLUMN_BITMASK |
			FAQAnswerModelImpl.APPROVED_COLUMN_BITMASK |
			FAQAnswerModelImpl.ANSWEREDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_Q_A = new FinderPath(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQ_A",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the f a q answers where questionid = &#63; and approved = &#63;.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @return the matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQ_A(long questionid, boolean approved) {
		return findByQ_A(questionid, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q answers where questionid = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @return the range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQ_A(long questionid, boolean approved,
		int start, int end) {
		return findByQ_A(questionid, approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q answers where questionid = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQ_A(long questionid, boolean approved,
		int start, int end, OrderByComparator<FAQAnswer> orderByComparator) {
		return findByQ_A(questionid, approved, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the f a q answers where questionid = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q answers
	 */
	@Override
	public List<FAQAnswer> findByQ_A(long questionid, boolean approved,
		int start, int end, OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Q_A;
			finderArgs = new Object[] { questionid, approved };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_Q_A;
			finderArgs = new Object[] {
					questionid, approved,
					
					start, end, orderByComparator
				};
		}

		List<FAQAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<FAQAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQAnswer faqAnswer : list) {
					if ((questionid != faqAnswer.getQuestionid()) ||
							(approved != faqAnswer.getApproved())) {
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

			query.append(_SQL_SELECT_FAQANSWER_WHERE);

			query.append(_FINDER_COLUMN_Q_A_QUESTIONID_2);

			query.append(_FINDER_COLUMN_Q_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionid);

				qPos.add(approved);

				if (!pagination) {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByQ_A_First(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByQ_A_First(questionid, approved,
				orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionid=");
		msg.append(questionid);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the first f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByQ_A_First(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		List<FAQAnswer> list = findByQ_A(questionid, approved, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer
	 * @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer findByQ_A_Last(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByQ_A_Last(questionid, approved,
				orderByComparator);

		if (faqAnswer != null) {
			return faqAnswer;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionid=");
		msg.append(questionid);

		msg.append(", approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQAnswerException(msg.toString());
	}

	/**
	 * Returns the last f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	 */
	@Override
	public FAQAnswer fetchByQ_A_Last(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		int count = countByQ_A(questionid, approved);

		if (count == 0) {
			return null;
		}

		List<FAQAnswer> list = findByQ_A(questionid, approved, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	 *
	 * @param id the primary key of the current f a q answer
	 * @param questionid the questionid
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q answer
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer[] findByQ_A_PrevAndNext(long id, long questionid,
		boolean approved, OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQAnswer[] array = new FAQAnswerImpl[3];

			array[0] = getByQ_A_PrevAndNext(session, faqAnswer, questionid,
					approved, orderByComparator, true);

			array[1] = faqAnswer;

			array[2] = getByQ_A_PrevAndNext(session, faqAnswer, questionid,
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

	protected FAQAnswer getByQ_A_PrevAndNext(Session session,
		FAQAnswer faqAnswer, long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FAQANSWER_WHERE);

		query.append(_FINDER_COLUMN_Q_A_QUESTIONID_2);

		query.append(_FINDER_COLUMN_Q_A_APPROVED_2);

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
			query.append(FAQAnswerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionid);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q answers where questionid = &#63; and approved = &#63; from the database.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 */
	@Override
	public void removeByQ_A(long questionid, boolean approved) {
		for (FAQAnswer faqAnswer : findByQ_A(questionid, approved,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqAnswer);
		}
	}

	/**
	 * Returns the number of f a q answers where questionid = &#63; and approved = &#63;.
	 *
	 * @param questionid the questionid
	 * @param approved the approved
	 * @return the number of matching f a q answers
	 */
	@Override
	public int countByQ_A(long questionid, boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_Q_A;

		Object[] finderArgs = new Object[] { questionid, approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FAQANSWER_WHERE);

			query.append(_FINDER_COLUMN_Q_A_QUESTIONID_2);

			query.append(_FINDER_COLUMN_Q_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionid);

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

	private static final String _FINDER_COLUMN_Q_A_QUESTIONID_2 = "faqAnswer.questionid = ? AND ";
	private static final String _FINDER_COLUMN_Q_A_APPROVED_2 = "faqAnswer.approved = ?";

	public FAQAnswerPersistenceImpl() {
		setModelClass(FAQAnswer.class);
	}

	/**
	 * Caches the f a q answer in the entity cache if it is enabled.
	 *
	 * @param faqAnswer the f a q answer
	 */
	@Override
	public void cacheResult(FAQAnswer faqAnswer) {
		entityCache.putResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerImpl.class, faqAnswer.getPrimaryKey(), faqAnswer);

		faqAnswer.resetOriginalValues();
	}

	/**
	 * Caches the f a q answers in the entity cache if it is enabled.
	 *
	 * @param faqAnswers the f a q answers
	 */
	@Override
	public void cacheResult(List<FAQAnswer> faqAnswers) {
		for (FAQAnswer faqAnswer : faqAnswers) {
			if (entityCache.getResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
						FAQAnswerImpl.class, faqAnswer.getPrimaryKey()) == null) {
				cacheResult(faqAnswer);
			}
			else {
				faqAnswer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all f a q answers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FAQAnswerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the f a q answer.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FAQAnswer faqAnswer) {
		entityCache.removeResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerImpl.class, faqAnswer.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FAQAnswer> faqAnswers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FAQAnswer faqAnswer : faqAnswers) {
			entityCache.removeResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
				FAQAnswerImpl.class, faqAnswer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	 *
	 * @param id the primary key for the new f a q answer
	 * @return the new f a q answer
	 */
	@Override
	public FAQAnswer create(long id) {
		FAQAnswer faqAnswer = new FAQAnswerImpl();

		faqAnswer.setNew(true);
		faqAnswer.setPrimaryKey(id);

		return faqAnswer;
	}

	/**
	 * Removes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the f a q answer
	 * @return the f a q answer that was removed
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer remove(long id) throws NoSuchFAQAnswerException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q answer
	 * @return the f a q answer that was removed
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer remove(Serializable primaryKey)
		throws NoSuchFAQAnswerException {
		Session session = null;

		try {
			session = openSession();

			FAQAnswer faqAnswer = (FAQAnswer)session.get(FAQAnswerImpl.class,
					primaryKey);

			if (faqAnswer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFAQAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faqAnswer);
		}
		catch (NoSuchFAQAnswerException nsee) {
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
	protected FAQAnswer removeImpl(FAQAnswer faqAnswer) {
		faqAnswer = toUnwrappedModel(faqAnswer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(faqAnswer)) {
				faqAnswer = (FAQAnswer)session.get(FAQAnswerImpl.class,
						faqAnswer.getPrimaryKeyObj());
			}

			if (faqAnswer != null) {
				session.delete(faqAnswer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (faqAnswer != null) {
			clearCache(faqAnswer);
		}

		return faqAnswer;
	}

	@Override
	public FAQAnswer updateImpl(FAQAnswer faqAnswer) {
		faqAnswer = toUnwrappedModel(faqAnswer);

		boolean isNew = faqAnswer.isNew();

		FAQAnswerModelImpl faqAnswerModelImpl = (FAQAnswerModelImpl)faqAnswer;

		Session session = null;

		try {
			session = openSession();

			if (faqAnswer.isNew()) {
				session.save(faqAnswer);

				faqAnswer.setNew(false);
			}
			else {
				faqAnswer = (FAQAnswer)session.merge(faqAnswer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FAQAnswerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((faqAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqAnswerModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] { faqAnswerModelImpl.getLanguage() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((faqAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqAnswerModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVED, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED,
					args);

				args = new Object[] { faqAnswerModelImpl.getApproved() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVED, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED,
					args);
			}

			if ((faqAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqAnswerModelImpl.getOriginalQuestionid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID,
					args);

				args = new Object[] { faqAnswerModelImpl.getQuestionid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTIONID,
					args);
			}

			if ((faqAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Q_A.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqAnswerModelImpl.getOriginalQuestionid(),
						faqAnswerModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_Q_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Q_A,
					args);

				args = new Object[] {
						faqAnswerModelImpl.getQuestionid(),
						faqAnswerModelImpl.getApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_Q_A, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_Q_A,
					args);
			}
		}

		entityCache.putResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
			FAQAnswerImpl.class, faqAnswer.getPrimaryKey(), faqAnswer, false);

		faqAnswer.resetOriginalValues();

		return faqAnswer;
	}

	protected FAQAnswer toUnwrappedModel(FAQAnswer faqAnswer) {
		if (faqAnswer instanceof FAQAnswerImpl) {
			return faqAnswer;
		}

		FAQAnswerImpl faqAnswerImpl = new FAQAnswerImpl();

		faqAnswerImpl.setNew(faqAnswer.isNew());
		faqAnswerImpl.setPrimaryKey(faqAnswer.getPrimaryKey());

		faqAnswerImpl.setId(faqAnswer.getId());
		faqAnswerImpl.setQuestionid(faqAnswer.getQuestionid());
		faqAnswerImpl.setContent(faqAnswer.getContent());
		faqAnswerImpl.setAnswerOrder(faqAnswer.getAnswerOrder());
		faqAnswerImpl.setAnsweredByUser(faqAnswer.getAnsweredByUser());
		faqAnswerImpl.setAnsweredDate(faqAnswer.getAnsweredDate());
		faqAnswerImpl.setModifiedByUser(faqAnswer.getModifiedByUser());
		faqAnswerImpl.setLanguage(faqAnswer.getLanguage());
		faqAnswerImpl.setModifiedDate(faqAnswer.getModifiedDate());
		faqAnswerImpl.setApproved(faqAnswer.isApproved());
		faqAnswerImpl.setApprovedByUser(faqAnswer.getApprovedByUser());
		faqAnswerImpl.setApprovedDate(faqAnswer.getApprovedDate());
		faqAnswerImpl.setUserId(faqAnswer.getUserId());
		faqAnswerImpl.setAttachName(faqAnswer.getAttachName());
		faqAnswerImpl.setFolderId(faqAnswer.getFolderId());

		return faqAnswerImpl;
	}

	/**
	 * Returns the f a q answer with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q answer
	 * @return the f a q answer
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFAQAnswerException {
		FAQAnswer faqAnswer = fetchByPrimaryKey(primaryKey);

		if (faqAnswer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFAQAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return faqAnswer;
	}

	/**
	 * Returns the f a q answer with the primary key or throws a {@link NoSuchFAQAnswerException} if it could not be found.
	 *
	 * @param id the primary key of the f a q answer
	 * @return the f a q answer
	 * @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer findByPrimaryKey(long id) throws NoSuchFAQAnswerException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the f a q answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q answer
	 * @return the f a q answer, or <code>null</code> if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
				FAQAnswerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		FAQAnswer faqAnswer = (FAQAnswer)serializable;

		if (faqAnswer == null) {
			Session session = null;

			try {
				session = openSession();

				faqAnswer = (FAQAnswer)session.get(FAQAnswerImpl.class,
						primaryKey);

				if (faqAnswer != null) {
					cacheResult(faqAnswer);
				}
				else {
					entityCache.putResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
						FAQAnswerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
					FAQAnswerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return faqAnswer;
	}

	/**
	 * Returns the f a q answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the f a q answer
	 * @return the f a q answer, or <code>null</code> if a f a q answer with the primary key could not be found
	 */
	@Override
	public FAQAnswer fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, FAQAnswer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, FAQAnswer> map = new HashMap<Serializable, FAQAnswer>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			FAQAnswer faqAnswer = fetchByPrimaryKey(primaryKey);

			if (faqAnswer != null) {
				map.put(primaryKey, faqAnswer);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
					FAQAnswerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (FAQAnswer)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FAQANSWER_WHERE_PKS_IN);

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

			for (FAQAnswer faqAnswer : (List<FAQAnswer>)q.list()) {
				map.put(faqAnswer.getPrimaryKeyObj(), faqAnswer);

				cacheResult(faqAnswer);

				uncachedPrimaryKeys.remove(faqAnswer.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FAQAnswerModelImpl.ENTITY_CACHE_ENABLED,
					FAQAnswerImpl.class, primaryKey, nullModel);
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
	 * Returns all the f a q answers.
	 *
	 * @return the f a q answers
	 */
	@Override
	public List<FAQAnswer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @return the range of f a q answers
	 */
	@Override
	public List<FAQAnswer> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of f a q answers
	 */
	@Override
	public List<FAQAnswer> findAll(int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q answers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q answers
	 * @param end the upper bound of the range of f a q answers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of f a q answers
	 */
	@Override
	public List<FAQAnswer> findAll(int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator,
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

		List<FAQAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<FAQAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAQANSWER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQANSWER;

				if (pagination) {
					sql = sql.concat(FAQAnswerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQAnswer>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the f a q answers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FAQAnswer faqAnswer : findAll()) {
			remove(faqAnswer);
		}
	}

	/**
	 * Returns the number of f a q answers.
	 *
	 * @return the number of f a q answers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAQANSWER);

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
		return FAQAnswerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the f a q answer persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FAQAnswerImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAQANSWER = "SELECT faqAnswer FROM FAQAnswer faqAnswer";
	private static final String _SQL_SELECT_FAQANSWER_WHERE_PKS_IN = "SELECT faqAnswer FROM FAQAnswer faqAnswer WHERE id_ IN (";
	private static final String _SQL_SELECT_FAQANSWER_WHERE = "SELECT faqAnswer FROM FAQAnswer faqAnswer WHERE ";
	private static final String _SQL_COUNT_FAQANSWER = "SELECT COUNT(faqAnswer) FROM FAQAnswer faqAnswer";
	private static final String _SQL_COUNT_FAQANSWER_WHERE = "SELECT COUNT(faqAnswer) FROM FAQAnswer faqAnswer WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faqAnswer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQAnswer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FAQAnswer exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FAQAnswerPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}