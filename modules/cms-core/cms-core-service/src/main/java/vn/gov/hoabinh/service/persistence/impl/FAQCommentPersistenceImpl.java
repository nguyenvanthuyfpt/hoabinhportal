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

import vn.gov.hoabinh.exception.NoSuchFAQCommentException;
import vn.gov.hoabinh.model.FAQComment;
import vn.gov.hoabinh.model.impl.FAQCommentImpl;
import vn.gov.hoabinh.model.impl.FAQCommentModelImpl;
import vn.gov.hoabinh.service.persistence.FAQCommentPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the f a q comment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCommentPersistence
 * @see vn.gov.hoabinh.service.persistence.FAQCommentUtil
 * @generated
 */
@ProviderType
public class FAQCommentPersistenceImpl extends BasePersistenceImpl<FAQComment>
	implements FAQCommentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FAQCommentUtil} to access the f a q comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FAQCommentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FAQCommentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FAQCommentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPROVED = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FAQCommentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApproved",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED =
		new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FAQCommentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApproved",
			new String[] { Boolean.class.getName() },
			FAQCommentModelImpl.APPROVED_COLUMN_BITMASK |
			FAQCommentModelImpl.COMMDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPROVED = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApproved",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the f a q comments where approved = &#63;.
	 *
	 * @param approved the approved
	 * @return the matching f a q comments
	 */
	@Override
	public List<FAQComment> findByApproved(boolean approved) {
		return findByApproved(approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the f a q comments where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @return the range of matching f a q comments
	 */
	@Override
	public List<FAQComment> findByApproved(boolean approved, int start, int end) {
		return findByApproved(approved, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q comments where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q comments
	 */
	@Override
	public List<FAQComment> findByApproved(boolean approved, int start,
		int end, OrderByComparator<FAQComment> orderByComparator) {
		return findByApproved(approved, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q comments where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param approved the approved
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q comments
	 */
	@Override
	public List<FAQComment> findByApproved(boolean approved, int start,
		int end, OrderByComparator<FAQComment> orderByComparator,
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

		List<FAQComment> list = null;

		if (retrieveFromCache) {
			list = (List<FAQComment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQComment faqComment : list) {
					if ((approved != faqComment.getApproved())) {
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

			query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				if (!pagination) {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q comment in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q comment
	 * @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment findByApproved_First(boolean approved,
		OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = fetchByApproved_First(approved,
				orderByComparator);

		if (faqComment != null) {
			return faqComment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCommentException(msg.toString());
	}

	/**
	 * Returns the first f a q comment in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment fetchByApproved_First(boolean approved,
		OrderByComparator<FAQComment> orderByComparator) {
		List<FAQComment> list = findByApproved(approved, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q comment in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q comment
	 * @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment findByApproved_Last(boolean approved,
		OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = fetchByApproved_Last(approved, orderByComparator);

		if (faqComment != null) {
			return faqComment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("approved=");
		msg.append(approved);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCommentException(msg.toString());
	}

	/**
	 * Returns the last f a q comment in the ordered set where approved = &#63;.
	 *
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment fetchByApproved_Last(boolean approved,
		OrderByComparator<FAQComment> orderByComparator) {
		int count = countByApproved(approved);

		if (count == 0) {
			return null;
		}

		List<FAQComment> list = findByApproved(approved, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q comments before and after the current f a q comment in the ordered set where approved = &#63;.
	 *
	 * @param id the primary key of the current f a q comment
	 * @param approved the approved
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q comment
	 * @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment[] findByApproved_PrevAndNext(long id, boolean approved,
		OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQComment[] array = new FAQCommentImpl[3];

			array[0] = getByApproved_PrevAndNext(session, faqComment, approved,
					orderByComparator, true);

			array[1] = faqComment;

			array[2] = getByApproved_PrevAndNext(session, faqComment, approved,
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

	protected FAQComment getByApproved_PrevAndNext(Session session,
		FAQComment faqComment, boolean approved,
		OrderByComparator<FAQComment> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

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
			query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q comments where approved = &#63; from the database.
	 *
	 * @param approved the approved
	 */
	@Override
	public void removeByApproved(boolean approved) {
		for (FAQComment faqComment : findByApproved(approved,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqComment);
		}
	}

	/**
	 * Returns the number of f a q comments where approved = &#63;.
	 *
	 * @param approved the approved
	 * @return the number of matching f a q comments
	 */
	@Override
	public int countByApproved(boolean approved) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPROVED;

		Object[] finderArgs = new Object[] { approved };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCOMMENT_WHERE);

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

	private static final String _FINDER_COLUMN_APPROVED_APPROVED_2 = "faqComment.approved = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ANSWERID = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FAQCommentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAnswerid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERID =
		new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FAQCommentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAnswerid",
			new String[] { Long.class.getName() },
			FAQCommentModelImpl.ANSWERID_COLUMN_BITMASK |
			FAQCommentModelImpl.COMMDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ANSWERID = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAnswerid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the f a q comments where answerid = &#63;.
	 *
	 * @param answerid the answerid
	 * @return the matching f a q comments
	 */
	@Override
	public List<FAQComment> findByAnswerid(long answerid) {
		return findByAnswerid(answerid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the f a q comments where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param answerid the answerid
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @return the range of matching f a q comments
	 */
	@Override
	public List<FAQComment> findByAnswerid(long answerid, int start, int end) {
		return findByAnswerid(answerid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q comments where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param answerid the answerid
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching f a q comments
	 */
	@Override
	public List<FAQComment> findByAnswerid(long answerid, int start, int end,
		OrderByComparator<FAQComment> orderByComparator) {
		return findByAnswerid(answerid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q comments where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param answerid the answerid
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching f a q comments
	 */
	@Override
	public List<FAQComment> findByAnswerid(long answerid, int start, int end,
		OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERID;
			finderArgs = new Object[] { answerid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ANSWERID;
			finderArgs = new Object[] { answerid, start, end, orderByComparator };
		}

		List<FAQComment> list = null;

		if (retrieveFromCache) {
			list = (List<FAQComment>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FAQComment faqComment : list) {
					if ((answerid != faqComment.getAnswerid())) {
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

			query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_ANSWERID_ANSWERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(answerid);

				if (!pagination) {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first f a q comment in the ordered set where answerid = &#63;.
	 *
	 * @param answerid the answerid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q comment
	 * @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment findByAnswerid_First(long answerid,
		OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = fetchByAnswerid_First(answerid,
				orderByComparator);

		if (faqComment != null) {
			return faqComment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("answerid=");
		msg.append(answerid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCommentException(msg.toString());
	}

	/**
	 * Returns the first f a q comment in the ordered set where answerid = &#63;.
	 *
	 * @param answerid the answerid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment fetchByAnswerid_First(long answerid,
		OrderByComparator<FAQComment> orderByComparator) {
		List<FAQComment> list = findByAnswerid(answerid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last f a q comment in the ordered set where answerid = &#63;.
	 *
	 * @param answerid the answerid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q comment
	 * @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment findByAnswerid_Last(long answerid,
		OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = fetchByAnswerid_Last(answerid, orderByComparator);

		if (faqComment != null) {
			return faqComment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("answerid=");
		msg.append(answerid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFAQCommentException(msg.toString());
	}

	/**
	 * Returns the last f a q comment in the ordered set where answerid = &#63;.
	 *
	 * @param answerid the answerid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	 */
	@Override
	public FAQComment fetchByAnswerid_Last(long answerid,
		OrderByComparator<FAQComment> orderByComparator) {
		int count = countByAnswerid(answerid);

		if (count == 0) {
			return null;
		}

		List<FAQComment> list = findByAnswerid(answerid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the f a q comments before and after the current f a q comment in the ordered set where answerid = &#63;.
	 *
	 * @param id the primary key of the current f a q comment
	 * @param answerid the answerid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next f a q comment
	 * @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment[] findByAnswerid_PrevAndNext(long id, long answerid,
		OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQComment[] array = new FAQCommentImpl[3];

			array[0] = getByAnswerid_PrevAndNext(session, faqComment, answerid,
					orderByComparator, true);

			array[1] = faqComment;

			array[2] = getByAnswerid_PrevAndNext(session, faqComment, answerid,
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

	protected FAQComment getByAnswerid_PrevAndNext(Session session,
		FAQComment faqComment, long answerid,
		OrderByComparator<FAQComment> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

		query.append(_FINDER_COLUMN_ANSWERID_ANSWERID_2);

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
			query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(answerid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(faqComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the f a q comments where answerid = &#63; from the database.
	 *
	 * @param answerid the answerid
	 */
	@Override
	public void removeByAnswerid(long answerid) {
		for (FAQComment faqComment : findByAnswerid(answerid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(faqComment);
		}
	}

	/**
	 * Returns the number of f a q comments where answerid = &#63;.
	 *
	 * @param answerid the answerid
	 * @return the number of matching f a q comments
	 */
	@Override
	public int countByAnswerid(long answerid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ANSWERID;

		Object[] finderArgs = new Object[] { answerid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_ANSWERID_ANSWERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(answerid);

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

	private static final String _FINDER_COLUMN_ANSWERID_ANSWERID_2 = "faqComment.answerid = ?";

	public FAQCommentPersistenceImpl() {
		setModelClass(FAQComment.class);
	}

	/**
	 * Caches the f a q comment in the entity cache if it is enabled.
	 *
	 * @param faqComment the f a q comment
	 */
	@Override
	public void cacheResult(FAQComment faqComment) {
		entityCache.putResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey(), faqComment);

		faqComment.resetOriginalValues();
	}

	/**
	 * Caches the f a q comments in the entity cache if it is enabled.
	 *
	 * @param faqComments the f a q comments
	 */
	@Override
	public void cacheResult(List<FAQComment> faqComments) {
		for (FAQComment faqComment : faqComments) {
			if (entityCache.getResult(
						FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
						FAQCommentImpl.class, faqComment.getPrimaryKey()) == null) {
				cacheResult(faqComment);
			}
			else {
				faqComment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all f a q comments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FAQCommentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the f a q comment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FAQComment faqComment) {
		entityCache.removeResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FAQComment> faqComments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FAQComment faqComment : faqComments) {
			entityCache.removeResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
				FAQCommentImpl.class, faqComment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new f a q comment with the primary key. Does not add the f a q comment to the database.
	 *
	 * @param id the primary key for the new f a q comment
	 * @return the new f a q comment
	 */
	@Override
	public FAQComment create(long id) {
		FAQComment faqComment = new FAQCommentImpl();

		faqComment.setNew(true);
		faqComment.setPrimaryKey(id);

		return faqComment;
	}

	/**
	 * Removes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the f a q comment
	 * @return the f a q comment that was removed
	 * @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment remove(long id) throws NoSuchFAQCommentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q comment
	 * @return the f a q comment that was removed
	 * @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment remove(Serializable primaryKey)
		throws NoSuchFAQCommentException {
		Session session = null;

		try {
			session = openSession();

			FAQComment faqComment = (FAQComment)session.get(FAQCommentImpl.class,
					primaryKey);

			if (faqComment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFAQCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faqComment);
		}
		catch (NoSuchFAQCommentException nsee) {
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
	protected FAQComment removeImpl(FAQComment faqComment) {
		faqComment = toUnwrappedModel(faqComment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(faqComment)) {
				faqComment = (FAQComment)session.get(FAQCommentImpl.class,
						faqComment.getPrimaryKeyObj());
			}

			if (faqComment != null) {
				session.delete(faqComment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (faqComment != null) {
			clearCache(faqComment);
		}

		return faqComment;
	}

	@Override
	public FAQComment updateImpl(FAQComment faqComment) {
		faqComment = toUnwrappedModel(faqComment);

		boolean isNew = faqComment.isNew();

		FAQCommentModelImpl faqCommentModelImpl = (FAQCommentModelImpl)faqComment;

		Session session = null;

		try {
			session = openSession();

			if (faqComment.isNew()) {
				session.save(faqComment);

				faqComment.setNew(false);
			}
			else {
				faqComment = (FAQComment)session.merge(faqComment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FAQCommentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((faqCommentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCommentModelImpl.getOriginalApproved()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVED, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED,
					args);

				args = new Object[] { faqCommentModelImpl.getApproved() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPROVED, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPROVED,
					args);
			}

			if ((faqCommentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						faqCommentModelImpl.getOriginalAnswerid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ANSWERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERID,
					args);

				args = new Object[] { faqCommentModelImpl.getAnswerid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ANSWERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANSWERID,
					args);
			}
		}

		entityCache.putResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey(), faqComment, false);

		faqComment.resetOriginalValues();

		return faqComment;
	}

	protected FAQComment toUnwrappedModel(FAQComment faqComment) {
		if (faqComment instanceof FAQCommentImpl) {
			return faqComment;
		}

		FAQCommentImpl faqCommentImpl = new FAQCommentImpl();

		faqCommentImpl.setNew(faqComment.isNew());
		faqCommentImpl.setPrimaryKey(faqComment.getPrimaryKey());

		faqCommentImpl.setId(faqComment.getId());
		faqCommentImpl.setAnswerid(faqComment.getAnswerid());
		faqCommentImpl.setContent(faqComment.getContent());
		faqCommentImpl.setCommName(faqComment.getCommName());
		faqCommentImpl.setCommEmail(faqComment.getCommEmail());
		faqCommentImpl.setApproved(faqComment.isApproved());
		faqCommentImpl.setApproveByUser(faqComment.getApproveByUser());
		faqCommentImpl.setApprovedDate(faqComment.getApprovedDate());
		faqCommentImpl.setCommDate(faqComment.getCommDate());
		faqCommentImpl.setUserId(faqComment.getUserId());

		return faqCommentImpl;
	}

	/**
	 * Returns the f a q comment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q comment
	 * @return the f a q comment
	 * @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFAQCommentException {
		FAQComment faqComment = fetchByPrimaryKey(primaryKey);

		if (faqComment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFAQCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return faqComment;
	}

	/**
	 * Returns the f a q comment with the primary key or throws a {@link NoSuchFAQCommentException} if it could not be found.
	 *
	 * @param id the primary key of the f a q comment
	 * @return the f a q comment
	 * @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment findByPrimaryKey(long id)
		throws NoSuchFAQCommentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the f a q comment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q comment
	 * @return the f a q comment, or <code>null</code> if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
				FAQCommentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		FAQComment faqComment = (FAQComment)serializable;

		if (faqComment == null) {
			Session session = null;

			try {
				session = openSession();

				faqComment = (FAQComment)session.get(FAQCommentImpl.class,
						primaryKey);

				if (faqComment != null) {
					cacheResult(faqComment);
				}
				else {
					entityCache.putResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
						FAQCommentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
					FAQCommentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return faqComment;
	}

	/**
	 * Returns the f a q comment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the f a q comment
	 * @return the f a q comment, or <code>null</code> if a f a q comment with the primary key could not be found
	 */
	@Override
	public FAQComment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, FAQComment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, FAQComment> map = new HashMap<Serializable, FAQComment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			FAQComment faqComment = fetchByPrimaryKey(primaryKey);

			if (faqComment != null) {
				map.put(primaryKey, faqComment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
					FAQCommentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (FAQComment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FAQCOMMENT_WHERE_PKS_IN);

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

			for (FAQComment faqComment : (List<FAQComment>)q.list()) {
				map.put(faqComment.getPrimaryKeyObj(), faqComment);

				cacheResult(faqComment);

				uncachedPrimaryKeys.remove(faqComment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
					FAQCommentImpl.class, primaryKey, nullModel);
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
	 * Returns all the f a q comments.
	 *
	 * @return the f a q comments
	 */
	@Override
	public List<FAQComment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the f a q comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @return the range of f a q comments
	 */
	@Override
	public List<FAQComment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the f a q comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of f a q comments
	 */
	@Override
	public List<FAQComment> findAll(int start, int end,
		OrderByComparator<FAQComment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the f a q comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q comments
	 * @param end the upper bound of the range of f a q comments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of f a q comments
	 */
	@Override
	public List<FAQComment> findAll(int start, int end,
		OrderByComparator<FAQComment> orderByComparator,
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

		List<FAQComment> list = null;

		if (retrieveFromCache) {
			list = (List<FAQComment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAQCOMMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQCOMMENT;

				if (pagination) {
					sql = sql.concat(FAQCommentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the f a q comments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FAQComment faqComment : findAll()) {
			remove(faqComment);
		}
	}

	/**
	 * Returns the number of f a q comments.
	 *
	 * @return the number of f a q comments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAQCOMMENT);

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
		return FAQCommentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the f a q comment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FAQCommentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAQCOMMENT = "SELECT faqComment FROM FAQComment faqComment";
	private static final String _SQL_SELECT_FAQCOMMENT_WHERE_PKS_IN = "SELECT faqComment FROM FAQComment faqComment WHERE id_ IN (";
	private static final String _SQL_SELECT_FAQCOMMENT_WHERE = "SELECT faqComment FROM FAQComment faqComment WHERE ";
	private static final String _SQL_COUNT_FAQCOMMENT = "SELECT COUNT(faqComment) FROM FAQComment faqComment";
	private static final String _SQL_COUNT_FAQCOMMENT_WHERE = "SELECT COUNT(faqComment) FROM FAQComment faqComment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faqComment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQComment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FAQComment exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FAQCommentPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}