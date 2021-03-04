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

import vn.gov.hoabinh.exception.NoSuchvdocDocumentException;
import vn.gov.hoabinh.model.impl.vdocDocumentImpl;
import vn.gov.hoabinh.model.impl.vdocDocumentModelImpl;
import vn.gov.hoabinh.model.vdocDocument;
import vn.gov.hoabinh.service.persistence.vdocDocumentPersistence;

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
 * The persistence implementation for the vdoc document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.vdocDocumentUtil
 * @generated
 */
@ProviderType
public class vdocDocumentPersistenceImpl extends BasePersistenceImpl<vdocDocument>
	implements vdocDocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vdocDocumentUtil} to access the vdoc document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vdocDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L",
			new String[] { Long.class.getName(), String.class.getName() },
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L(long groupId, String language) {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L(long groupId, String language,
		int start, int end) {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L(groupId, language, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator<vdocDocument> orderByComparator,
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

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

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
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_First(long groupId, String language,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_First(groupId, language,
				orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_First(long groupId, String language,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_Last(long groupId, String language,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_Last(groupId, language,
				orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_Last(long groupId, String language,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L(groupId, language);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L(groupId, language, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_PrevAndNext(String docId, long groupId,
		String language, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vdocDocument, groupId,
					language, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_PrevAndNext(session, vdocDocument, groupId,
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

	protected vdocDocument getByG_L_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 */
	@Override
	public void removeByG_L(long groupId, String language) {
		for (vdocDocument vdocDocument : findByG_L(groupId, language,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L(long groupId, String language) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L;

		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

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

	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vdocDocument.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vdocDocument.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc) {
		return findByG_L_S(groupId, language, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc, int start, int end) {
		return findByG_L_S(groupId, language, statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L_S(groupId, language, statusDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S(long groupId, String language,
		int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S;
			finderArgs = new Object[] { groupId, language, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S;
			finderArgs = new Object[] {
					groupId, language, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage()) ||
							(statusDoc != vdocDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_First(long groupId, String language,
		int statusDoc, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_First(groupId, language,
				statusDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_First(long groupId, String language,
		int statusDoc, OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L_S(groupId, language, statusDoc, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_Last(long groupId, String language,
		int statusDoc, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_Last(groupId, language,
				statusDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_Last(long groupId, String language,
		int statusDoc, OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L_S(groupId, language, statusDoc);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L_S(groupId, language, statusDoc,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_S_PrevAndNext(String docId, long groupId,
		String language, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_S_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, OrderByComparator<vdocDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_STATUSDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByG_L_S(long groupId, String language, int statusDoc) {
		for (vdocDocument vdocDocument : findByG_L_S(groupId, language,
				statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L_S(long groupId, String language, int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S;

		Object[] finderArgs = new Object[] { groupId, language, statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSDOC_2);

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

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_G_L_S_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_STATUSDOC_2 = "vdocDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_S =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Boolean.class.getName()
			},
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.HASSERVICE_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_S(long groupId, String language,
		int statusDoc, boolean hasService) {
		return findByG_L_S_S(groupId, language, statusDoc, hasService,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_S(long groupId, String language,
		int statusDoc, boolean hasService, int start, int end) {
		return findByG_L_S_S(groupId, language, statusDoc, hasService, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_S(long groupId, String language,
		int statusDoc, boolean hasService, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L_S_S(groupId, language, statusDoc, hasService, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_S(long groupId, String language,
		int statusDoc, boolean hasService, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_S;
			finderArgs = new Object[] { groupId, language, statusDoc, hasService };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_S;
			finderArgs = new Object[] {
					groupId, language, statusDoc, hasService,
					
					start, end, orderByComparator
				};
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage()) ||
							(statusDoc != vdocDocument.getStatusDoc()) ||
							(hasService != vdocDocument.getHasService())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_S_STATUSDOC_2);

			query.append(_FINDER_COLUMN_G_L_S_S_HASSERVICE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				qPos.add(hasService);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_S_First(long groupId, String language,
		int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_S_First(groupId, language,
				statusDoc, hasService, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", hasService=");
		msg.append(hasService);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_S_First(long groupId, String language,
		int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L_S_S(groupId, language, statusDoc,
				hasService, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_S_Last(long groupId, String language,
		int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_S_Last(groupId, language,
				statusDoc, hasService, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", hasService=");
		msg.append(hasService);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_S_Last(long groupId, String language,
		int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L_S_S(groupId, language, statusDoc, hasService);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L_S_S(groupId, language, statusDoc,
				hasService, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_S_S_PrevAndNext(String docId, long groupId,
		String language, int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_S_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, hasService, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_S_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, hasService, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_S_S_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_S_STATUSDOC_2);

		query.append(_FINDER_COLUMN_G_L_S_S_HASSERVICE_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		qPos.add(hasService);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 */
	@Override
	public void removeByG_L_S_S(long groupId, String language, int statusDoc,
		boolean hasService) {
		for (vdocDocument vdocDocument : findByG_L_S_S(groupId, language,
				statusDoc, hasService, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param hasService the has service
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L_S_S(long groupId, String language, int statusDoc,
		boolean hasService) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S_S;

		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc, hasService
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_S_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_S_STATUSDOC_2);

			query.append(_FINDER_COLUMN_G_L_S_S_HASSERVICE_2);

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

				qPos.add(statusDoc);

				qPos.add(hasService);

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

	private static final String _FINDER_COLUMN_G_L_S_S_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_S_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_S_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_S_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_S_STATUSDOC_2 = "vdocDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_S_HASSERVICE_2 = "vdocDocument.hasService = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId) {
		return findByG_L_F(groupId, language, fieldId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end) {
		return findByG_L_F(groupId, language, fieldId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F;
			finderArgs = new Object[] { groupId, language, fieldId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F;
			finderArgs = new Object[] {
					groupId, language, fieldId,
					
					start, end, orderByComparator
				};
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage()) ||
							!Objects.equals(fieldId, vdocDocument.getFieldId())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_F_First(long groupId, String language,
		String fieldId, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_F_First(groupId, language,
				fieldId, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_F_First(long groupId, String language,
		String fieldId, OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L_F(groupId, language, fieldId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_F_Last(long groupId, String language,
		String fieldId, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_F_Last(groupId, language,
				fieldId, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_F_Last(long groupId, String language,
		String fieldId, OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L_F(groupId, language, fieldId);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L_F(groupId, language, fieldId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_F_PrevAndNext(String docId, long groupId,
		String language, String fieldId,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_F_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_F_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_F_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		String fieldId, OrderByComparator<vdocDocument> orderByComparator,
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

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
		}

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 */
	@Override
	public void removeByG_L_F(long groupId, String language, String fieldId) {
		for (vdocDocument vdocDocument : findByG_L_F(groupId, language,
				fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L_F(long groupId, String language, String fieldId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_F;

		Object[] finderArgs = new Object[] { groupId, language, fieldId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
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

	private static final String _FINDER_COLUMN_G_L_F_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_1 = "vdocDocument.fieldId IS NULL";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_2 = "vdocDocument.fieldId = ?";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			vdocDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F_S = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc) {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end) {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S;
			finderArgs = new Object[] { groupId, language, fieldId, statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_F_S;
			finderArgs = new Object[] {
					groupId, language, fieldId, statusDoc,
					
					start, end, orderByComparator
				};
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage()) ||
							!Objects.equals(fieldId, vdocDocument.getFieldId()) ||
							(statusDoc != vdocDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_F_S_First(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_F_S_First(groupId, language,
				fieldId, statusDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_F_S_First(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_F_S_Last(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_F_S_Last(groupId, language,
				fieldId, statusDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_F_S_Last(long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L_F_S(groupId, language, fieldId, statusDoc);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_F_S_PrevAndNext(String docId, long groupId,
		String language, String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_F_S_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, statusDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_F_S_PrevAndNext(session, vdocDocument, groupId,
					language, fieldId, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_F_S_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
		}

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
		}

		query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) {
		for (vdocDocument vdocDocument : findByG_L_F_S(groupId, language,
				fieldId, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param fieldId the field ID
	 * @param statusDoc the status doc
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_F_S;

		Object[] finderArgs = new Object[] { groupId, language, fieldId, statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
			}

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

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

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_G_L_F_S_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_1 = "vdocDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_2 = "vdocDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_STATUSDOC_2 = "vdocDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_T =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			},
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.TYPEDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc) {
		return findByG_L_S_T(groupId, language, statusDoc, typeDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc, int start, int end) {
		return findByG_L_S_T(groupId, language, statusDoc, typeDoc, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L_S_T(groupId, language, statusDoc, typeDoc, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_T(long groupId, String language,
		int statusDoc, int typeDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_T;
			finderArgs = new Object[] { groupId, language, statusDoc, typeDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_T;
			finderArgs = new Object[] {
					groupId, language, statusDoc, typeDoc,
					
					start, end, orderByComparator
				};
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage()) ||
							(statusDoc != vdocDocument.getStatusDoc()) ||
							(typeDoc != vdocDocument.getTypeDoc())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_T_STATUSDOC_2);

			query.append(_FINDER_COLUMN_G_L_S_T_TYPEDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				qPos.add(typeDoc);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_T_First(long groupId, String language,
		int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_T_First(groupId, language,
				statusDoc, typeDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", typeDoc=");
		msg.append(typeDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_T_First(long groupId, String language,
		int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L_S_T(groupId, language, statusDoc,
				typeDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_T_Last(long groupId, String language,
		int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_T_Last(groupId, language,
				statusDoc, typeDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", typeDoc=");
		msg.append(typeDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_T_Last(long groupId, String language,
		int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L_S_T(groupId, language, statusDoc, typeDoc);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L_S_T(groupId, language, statusDoc,
				typeDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_S_T_PrevAndNext(String docId, long groupId,
		String language, int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_T_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, typeDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_T_PrevAndNext(session, vdocDocument, groupId,
					language, statusDoc, typeDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByG_L_S_T_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_T_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_T_STATUSDOC_2);

		query.append(_FINDER_COLUMN_G_L_S_T_TYPEDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		qPos.add(typeDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 */
	@Override
	public void removeByG_L_S_T(long groupId, String language, int statusDoc,
		int typeDoc) {
		for (vdocDocument vdocDocument : findByG_L_S_T(groupId, language,
				statusDoc, typeDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param typeDoc the type doc
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L_S_T(long groupId, String language, int statusDoc,
		int typeDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S_T;

		Object[] finderArgs = new Object[] { groupId, language, statusDoc, typeDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_T_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_T_STATUSDOC_2);

			query.append(_FINDER_COLUMN_G_L_S_T_TYPEDOC_2);

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

				qPos.add(statusDoc);

				qPos.add(typeDoc);

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

	private static final String _FINDER_COLUMN_G_L_S_T_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_STATUSDOC_2 = "vdocDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_T_TYPEDOC_2 = "vdocDocument.typeDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_F_T =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_L_S_F_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_F_T =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_L_S_F_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			vdocDocumentModelImpl.GROUPID_COLUMN_BITMASK |
			vdocDocumentModelImpl.LANGUAGE_COLUMN_BITMASK |
			vdocDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.FIELDID_COLUMN_BITMASK |
			vdocDocumentModelImpl.TYPEDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_F_T = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_L_S_F_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc) {
		return findByG_L_S_F_T(groupId, language, statusDoc, fieldId, typeDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc, int start, int end) {
		return findByG_L_S_F_T(groupId, language, statusDoc, fieldId, typeDoc,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByG_L_S_F_T(groupId, language, statusDoc, fieldId, typeDoc,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByG_L_S_F_T(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_F_T;
			finderArgs = new Object[] {
					groupId, language, statusDoc, fieldId, typeDoc
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_L_S_F_T;
			finderArgs = new Object[] {
					groupId, language, statusDoc, fieldId, typeDoc,
					
					start, end, orderByComparator
				};
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((groupId != vdocDocument.getGroupId()) ||
							!Objects.equals(language, vdocDocument.getLanguage()) ||
							(statusDoc != vdocDocument.getStatusDoc()) ||
							!Objects.equals(fieldId, vdocDocument.getFieldId()) ||
							(typeDoc != vdocDocument.getTypeDoc())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_F_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusDoc);

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				qPos.add(typeDoc);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_F_T_First(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_F_T_First(groupId, language,
				statusDoc, fieldId, typeDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", typeDoc=");
		msg.append(typeDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_F_T_First(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByG_L_S_F_T(groupId, language, statusDoc,
				fieldId, typeDoc, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByG_L_S_F_T_Last(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByG_L_S_F_T_Last(groupId, language,
				statusDoc, fieldId, typeDoc, orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", language=");
		msg.append(language);

		msg.append(", statusDoc=");
		msg.append(statusDoc);

		msg.append(", fieldId=");
		msg.append(fieldId);

		msg.append(", typeDoc=");
		msg.append(typeDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByG_L_S_F_T_Last(long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByG_L_S_F_T(groupId, language, statusDoc, fieldId,
				typeDoc);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByG_L_S_F_T(groupId, language, statusDoc,
				fieldId, typeDoc, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByG_L_S_F_T_PrevAndNext(String docId,
		long groupId, String language, int statusDoc, String fieldId,
		int typeDoc, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByG_L_S_F_T_PrevAndNext(session, vdocDocument,
					groupId, language, statusDoc, fieldId, typeDoc,
					orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByG_L_S_F_T_PrevAndNext(session, vdocDocument,
					groupId, language, statusDoc, fieldId, typeDoc,
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

	protected vdocDocument getByG_L_S_F_T_PrevAndNext(Session session,
		vdocDocument vdocDocument, long groupId, String language,
		int statusDoc, String fieldId, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(8 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(7);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_F_T_GROUPID_2);

		boolean bindLanguage = false;

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1);
		}
		else if (language.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3);
		}
		else {
			bindLanguage = true;

			query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2);

		boolean bindFieldId = false;

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_1);
		}
		else if (fieldId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_3);
		}
		else {
			bindFieldId = true;

			query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_2);
		}

		query.append(_FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusDoc);

		if (bindFieldId) {
			qPos.add(fieldId);
		}

		qPos.add(typeDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 */
	@Override
	public void removeByG_L_S_F_T(long groupId, String language, int statusDoc,
		String fieldId, int typeDoc) {
		for (vdocDocument vdocDocument : findByG_L_S_F_T(groupId, language,
				statusDoc, fieldId, typeDoc, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	 *
	 * @param groupId the group ID
	 * @param language the language
	 * @param statusDoc the status doc
	 * @param fieldId the field ID
	 * @param typeDoc the type doc
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByG_L_S_F_T(long groupId, String language, int statusDoc,
		String fieldId, int typeDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_L_S_F_T;

		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc, fieldId, typeDoc
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_F_T_GROUPID_2);

			boolean bindLanguage = false;

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1);
			}
			else if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3);
			}
			else {
				bindLanguage = true;

				query.append(_FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2);

			boolean bindFieldId = false;

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_1);
			}
			else if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_3);
			}
			else {
				bindFieldId = true;

				query.append(_FINDER_COLUMN_G_L_S_F_T_FIELDID_2);
			}

			query.append(_FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2);

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

				qPos.add(statusDoc);

				if (bindFieldId) {
					qPos.add(fieldId);
				}

				qPos.add(typeDoc);

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

	private static final String _FINDER_COLUMN_G_L_S_F_T_GROUPID_2 = "vdocDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_LANGUAGE_1 = "vdocDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_LANGUAGE_2 = "vdocDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_LANGUAGE_3 = "(vdocDocument.language IS NULL OR vdocDocument.language = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_STATUSDOC_2 = "vdocDocument.statusDoc = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_FIELDID_1 = "vdocDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_FIELDID_2 = "vdocDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_FIELDID_3 = "(vdocDocument.fieldId IS NULL OR vdocDocument.fieldId = '') AND ";
	private static final String _FINDER_COLUMN_G_L_S_F_T_TYPEDOC_2 = "vdocDocument.typeDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Integer.class.getName() },
			vdocDocumentModelImpl.STATUSDOC_COLUMN_BITMASK |
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the vdoc documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByStatus(int statusDoc) {
		return findByStatus(statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vdoc documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByStatus(int statusDoc, int start, int end) {
		return findByStatus(statusDoc, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByStatus(int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByStatus(statusDoc, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param statusDoc the status doc
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByStatus(int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { statusDoc };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { statusDoc, start, end, orderByComparator };
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((statusDoc != vdocDocument.getStatusDoc())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByStatus_First(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByStatus_First(statusDoc,
				orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByStatus_First(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByStatus(statusDoc, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByStatus_Last(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByStatus_Last(statusDoc,
				orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("statusDoc=");
		msg.append(statusDoc);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByStatus_Last(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByStatus(statusDoc);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByStatus(statusDoc, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where statusDoc = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param statusDoc the status doc
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByStatus_PrevAndNext(String docId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vdocDocument,
					statusDoc, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByStatus_PrevAndNext(session, vdocDocument,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByStatus_PrevAndNext(Session session,
		vdocDocument vdocDocument, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where statusDoc = &#63; from the database.
	 *
	 * @param statusDoc the status doc
	 */
	@Override
	public void removeByStatus(int statusDoc) {
		for (vdocDocument vdocDocument : findByStatus(statusDoc,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByStatus(int statusDoc) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { statusDoc };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

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

	private static final String _FINDER_COLUMN_STATUS_STATUSDOC_2 = "vdocDocument.statusDoc = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITION = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPosition",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION =
		new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, vdocDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPosition",
			new String[] { Integer.class.getName() },
			vdocDocumentModelImpl.POSITION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POSITION = new FinderPath(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPosition",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the vdoc documents where position = &#63;.
	 *
	 * @param position the position
	 * @return the matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByPosition(int position) {
		return findByPosition(position, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vdoc documents where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param position the position
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByPosition(int position, int start, int end) {
		return findByPosition(position, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param position the position
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByPosition(int position, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findByPosition(position, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents where position = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param position the position
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vdoc documents
	 */
	@Override
	public List<vdocDocument> findByPosition(int position, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION;
			finderArgs = new Object[] { position };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITION;
			finderArgs = new Object[] { position, start, end, orderByComparator };
		}

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (vdocDocument vdocDocument : list) {
					if ((position != vdocDocument.getPosition())) {
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

			query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_POSITION_POSITION_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(position);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vdoc document in the ordered set where position = &#63;.
	 *
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByPosition_First(int position,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByPosition_First(position,
				orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("position=");
		msg.append(position);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the first vdoc document in the ordered set where position = &#63;.
	 *
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByPosition_First(int position,
		OrderByComparator<vdocDocument> orderByComparator) {
		List<vdocDocument> list = findByPosition(position, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vdoc document in the ordered set where position = &#63;.
	 *
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document
	 * @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument findByPosition_Last(int position,
		OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByPosition_Last(position,
				orderByComparator);

		if (vdocDocument != null) {
			return vdocDocument;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("position=");
		msg.append(position);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvdocDocumentException(msg.toString());
	}

	/**
	 * Returns the last vdoc document in the ordered set where position = &#63;.
	 *
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	 */
	@Override
	public vdocDocument fetchByPosition_Last(int position,
		OrderByComparator<vdocDocument> orderByComparator) {
		int count = countByPosition(position);

		if (count == 0) {
			return null;
		}

		List<vdocDocument> list = findByPosition(position, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vdoc documents before and after the current vdoc document in the ordered set where position = &#63;.
	 *
	 * @param docId the primary key of the current vdoc document
	 * @param position the position
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument[] findByPosition_PrevAndNext(String docId,
		int position, OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			vdocDocument[] array = new vdocDocumentImpl[3];

			array[0] = getByPosition_PrevAndNext(session, vdocDocument,
					position, orderByComparator, true);

			array[1] = vdocDocument;

			array[2] = getByPosition_PrevAndNext(session, vdocDocument,
					position, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocDocument getByPosition_PrevAndNext(Session session,
		vdocDocument vdocDocument, int position,
		OrderByComparator<vdocDocument> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_POSITION_POSITION_2);

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
			query.append(vdocDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(position);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vdocDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vdoc documents where position = &#63; from the database.
	 *
	 * @param position the position
	 */
	@Override
	public void removeByPosition(int position) {
		for (vdocDocument vdocDocument : findByPosition(position,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents where position = &#63;.
	 *
	 * @param position the position
	 * @return the number of matching vdoc documents
	 */
	@Override
	public int countByPosition(int position) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POSITION;

		Object[] finderArgs = new Object[] { position };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_POSITION_POSITION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(position);

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

	private static final String _FINDER_COLUMN_POSITION_POSITION_2 = "vdocDocument.position = ?";

	public vdocDocumentPersistenceImpl() {
		setModelClass(vdocDocument.class);
	}

	/**
	 * Caches the vdoc document in the entity cache if it is enabled.
	 *
	 * @param vdocDocument the vdoc document
	 */
	@Override
	public void cacheResult(vdocDocument vdocDocument) {
		entityCache.putResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey(), vdocDocument);

		vdocDocument.resetOriginalValues();
	}

	/**
	 * Caches the vdoc documents in the entity cache if it is enabled.
	 *
	 * @param vdocDocuments the vdoc documents
	 */
	@Override
	public void cacheResult(List<vdocDocument> vdocDocuments) {
		for (vdocDocument vdocDocument : vdocDocuments) {
			if (entityCache.getResult(
						vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
						vdocDocumentImpl.class, vdocDocument.getPrimaryKey()) == null) {
				cacheResult(vdocDocument);
			}
			else {
				vdocDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vdoc documents.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vdocDocumentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vdoc document.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vdocDocument vdocDocument) {
		entityCache.removeResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<vdocDocument> vdocDocuments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vdocDocument vdocDocument : vdocDocuments) {
			entityCache.removeResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
				vdocDocumentImpl.class, vdocDocument.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vdoc document with the primary key. Does not add the vdoc document to the database.
	 *
	 * @param docId the primary key for the new vdoc document
	 * @return the new vdoc document
	 */
	@Override
	public vdocDocument create(String docId) {
		vdocDocument vdocDocument = new vdocDocumentImpl();

		vdocDocument.setNew(true);
		vdocDocument.setPrimaryKey(docId);

		vdocDocument.setCompanyId(companyProvider.getCompanyId());

		return vdocDocument;
	}

	/**
	 * Removes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the vdoc document
	 * @return the vdoc document that was removed
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument remove(String docId) throws NoSuchvdocDocumentException {
		return remove((Serializable)docId);
	}

	/**
	 * Removes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc document
	 * @return the vdoc document that was removed
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument remove(Serializable primaryKey)
		throws NoSuchvdocDocumentException {
		Session session = null;

		try {
			session = openSession();

			vdocDocument vdocDocument = (vdocDocument)session.get(vdocDocumentImpl.class,
					primaryKey);

			if (vdocDocument == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvdocDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vdocDocument);
		}
		catch (NoSuchvdocDocumentException nsee) {
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
	protected vdocDocument removeImpl(vdocDocument vdocDocument) {
		vdocDocument = toUnwrappedModel(vdocDocument);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vdocDocument)) {
				vdocDocument = (vdocDocument)session.get(vdocDocumentImpl.class,
						vdocDocument.getPrimaryKeyObj());
			}

			if (vdocDocument != null) {
				session.delete(vdocDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vdocDocument != null) {
			clearCache(vdocDocument);
		}

		return vdocDocument;
	}

	@Override
	public vdocDocument updateImpl(vdocDocument vdocDocument) {
		vdocDocument = toUnwrappedModel(vdocDocument);

		boolean isNew = vdocDocument.isNew();

		vdocDocumentModelImpl vdocDocumentModelImpl = (vdocDocumentModelImpl)vdocDocument;

		Session session = null;

		try {
			session = openSession();

			if (vdocDocument.isNew()) {
				session.save(vdocDocument);

				vdocDocument.setNew(false);
			}
			else {
				vdocDocument = (vdocDocument)session.merge(vdocDocument);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !vdocDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage(),
						vdocDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage(),
						vdocDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage(),
						vdocDocumentModelImpl.getOriginalStatusDoc(),
						vdocDocumentModelImpl.getOriginalHasService()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_S,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage(),
						vdocDocumentModelImpl.getStatusDoc(),
						vdocDocumentModelImpl.getHasService()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_S,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage(),
						vdocDocumentModelImpl.getOriginalFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage(),
						vdocDocumentModelImpl.getFieldId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage(),
						vdocDocumentModelImpl.getOriginalFieldId(),
						vdocDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage(),
						vdocDocumentModelImpl.getFieldId(),
						vdocDocumentModelImpl.getStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_F_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_F_S,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage(),
						vdocDocumentModelImpl.getOriginalStatusDoc(),
						vdocDocumentModelImpl.getOriginalTypeDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_T,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage(),
						vdocDocumentModelImpl.getStatusDoc(),
						vdocDocumentModelImpl.getTypeDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_T,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_F_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalGroupId(),
						vdocDocumentModelImpl.getOriginalLanguage(),
						vdocDocumentModelImpl.getOriginalStatusDoc(),
						vdocDocumentModelImpl.getOriginalFieldId(),
						vdocDocumentModelImpl.getOriginalTypeDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_F_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_F_T,
					args);

				args = new Object[] {
						vdocDocumentModelImpl.getGroupId(),
						vdocDocumentModelImpl.getLanguage(),
						vdocDocumentModelImpl.getStatusDoc(),
						vdocDocumentModelImpl.getFieldId(),
						vdocDocumentModelImpl.getTypeDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_L_S_F_T, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_L_S_F_T,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalStatusDoc()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { vdocDocumentModelImpl.getStatusDoc() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((vdocDocumentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vdocDocumentModelImpl.getOriginalPosition()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_POSITION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION,
					args);

				args = new Object[] { vdocDocumentModelImpl.getPosition() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_POSITION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION,
					args);
			}
		}

		entityCache.putResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
			vdocDocumentImpl.class, vdocDocument.getPrimaryKey(), vdocDocument,
			false);

		vdocDocument.resetOriginalValues();

		return vdocDocument;
	}

	protected vdocDocument toUnwrappedModel(vdocDocument vdocDocument) {
		if (vdocDocument instanceof vdocDocumentImpl) {
			return vdocDocument;
		}

		vdocDocumentImpl vdocDocumentImpl = new vdocDocumentImpl();

		vdocDocumentImpl.setNew(vdocDocument.isNew());
		vdocDocumentImpl.setPrimaryKey(vdocDocument.getPrimaryKey());

		vdocDocumentImpl.setDocId(vdocDocument.getDocId());
		vdocDocumentImpl.setGroupId(vdocDocument.getGroupId());
		vdocDocumentImpl.setLanguage(vdocDocument.getLanguage());
		vdocDocumentImpl.setCompanyId(vdocDocument.getCompanyId());
		vdocDocumentImpl.setUserId(vdocDocument.getUserId());
		vdocDocumentImpl.setCreatedByUser(vdocDocument.getCreatedByUser());
		vdocDocumentImpl.setCreatedDate(vdocDocument.getCreatedDate());
		vdocDocumentImpl.setModifiedByUser(vdocDocument.getModifiedByUser());
		vdocDocumentImpl.setModifiedDate(vdocDocument.getModifiedDate());
		vdocDocumentImpl.setApprovedByUser(vdocDocument.getApprovedByUser());
		vdocDocumentImpl.setApprovedDate(vdocDocument.getApprovedDate());
		vdocDocumentImpl.setPublishedByUser(vdocDocument.getPublishedByUser());
		vdocDocumentImpl.setPublishedDate(vdocDocument.getPublishedDate());
		vdocDocumentImpl.setPromulDate(vdocDocument.getPromulDate());
		vdocDocumentImpl.setEffectivedDate(vdocDocument.getEffectivedDate());
		vdocDocumentImpl.setExpiredDate(vdocDocument.getExpiredDate());
		vdocDocumentImpl.setReplaceDoc(vdocDocument.getReplaceDoc());
		vdocDocumentImpl.setTitle(vdocDocument.getTitle());
		vdocDocumentImpl.setContent(vdocDocument.getContent());
		vdocDocumentImpl.setProcess(vdocDocument.getProcess());
		vdocDocumentImpl.setBase(vdocDocument.getBase());
		vdocDocumentImpl.setTimeProcess(vdocDocument.getTimeProcess());
		vdocDocumentImpl.setCost(vdocDocument.getCost());
		vdocDocumentImpl.setRequireDoc(vdocDocument.getRequireDoc());
		vdocDocumentImpl.setResult(vdocDocument.getResult());
		vdocDocumentImpl.setObjects(vdocDocument.getObjects());
		vdocDocumentImpl.setStyle(vdocDocument.getStyle());
		vdocDocumentImpl.setPosition(vdocDocument.getPosition());
		vdocDocumentImpl.setNote(vdocDocument.getNote());
		vdocDocumentImpl.setExecuteOrg(vdocDocument.getExecuteOrg());
		vdocDocumentImpl.setUserHit(vdocDocument.getUserHit());
		vdocDocumentImpl.setStatusDoc(vdocDocument.getStatusDoc());
		vdocDocumentImpl.setTypeDoc(vdocDocument.getTypeDoc());
		vdocDocumentImpl.setHasService(vdocDocument.isHasService());
		vdocDocumentImpl.setHasAttachment(vdocDocument.isHasAttachment());
		vdocDocumentImpl.setFieldId(vdocDocument.getFieldId());
		vdocDocumentImpl.setOrgRels(vdocDocument.getOrgRels());
		vdocDocumentImpl.setFieldRels(vdocDocument.getFieldRels());
		vdocDocumentImpl.setLevels(vdocDocument.getLevels());

		return vdocDocumentImpl;
	}

	/**
	 * Returns the vdoc document with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc document
	 * @return the vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvdocDocumentException {
		vdocDocument vdocDocument = fetchByPrimaryKey(primaryKey);

		if (vdocDocument == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvdocDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vdocDocument;
	}

	/**
	 * Returns the vdoc document with the primary key or throws a {@link NoSuchvdocDocumentException} if it could not be found.
	 *
	 * @param docId the primary key of the vdoc document
	 * @return the vdoc document
	 * @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument findByPrimaryKey(String docId)
		throws NoSuchvdocDocumentException {
		return findByPrimaryKey((Serializable)docId);
	}

	/**
	 * Returns the vdoc document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc document
	 * @return the vdoc document, or <code>null</code> if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
				vdocDocumentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		vdocDocument vdocDocument = (vdocDocument)serializable;

		if (vdocDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vdocDocument = (vdocDocument)session.get(vdocDocumentImpl.class,
						primaryKey);

				if (vdocDocument != null) {
					cacheResult(vdocDocument);
				}
				else {
					entityCache.putResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
						vdocDocumentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
					vdocDocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vdocDocument;
	}

	/**
	 * Returns the vdoc document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docId the primary key of the vdoc document
	 * @return the vdoc document, or <code>null</code> if a vdoc document with the primary key could not be found
	 */
	@Override
	public vdocDocument fetchByPrimaryKey(String docId) {
		return fetchByPrimaryKey((Serializable)docId);
	}

	@Override
	public Map<Serializable, vdocDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, vdocDocument> map = new HashMap<Serializable, vdocDocument>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			vdocDocument vdocDocument = fetchByPrimaryKey(primaryKey);

			if (vdocDocument != null) {
				map.put(primaryKey, vdocDocument);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
					vdocDocumentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (vdocDocument)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 4) +
				1);

		query.append(_SQL_SELECT_VDOCDOCUMENT_WHERE_PKS_IN);

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

			for (vdocDocument vdocDocument : (List<vdocDocument>)q.list()) {
				map.put(vdocDocument.getPrimaryKeyObj(), vdocDocument);

				cacheResult(vdocDocument);

				uncachedPrimaryKeys.remove(vdocDocument.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(vdocDocumentModelImpl.ENTITY_CACHE_ENABLED,
					vdocDocumentImpl.class, primaryKey, nullModel);
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
	 * Returns all the vdoc documents.
	 *
	 * @return the vdoc documents
	 */
	@Override
	public List<vdocDocument> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vdoc documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @return the range of vdoc documents
	 */
	@Override
	public List<vdocDocument> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vdoc documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vdoc documents
	 */
	@Override
	public List<vdocDocument> findAll(int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vdoc documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc documents
	 * @param end the upper bound of the range of vdoc documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vdoc documents
	 */
	@Override
	public List<vdocDocument> findAll(int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
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

		List<vdocDocument> list = null;

		if (retrieveFromCache) {
			list = (List<vdocDocument>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VDOCDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCDOCUMENT;

				if (pagination) {
					sql = sql.concat(vdocDocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<vdocDocument>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vdoc documents from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vdocDocument vdocDocument : findAll()) {
			remove(vdocDocument);
		}
	}

	/**
	 * Returns the number of vdoc documents.
	 *
	 * @return the number of vdoc documents
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VDOCDOCUMENT);

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
		return vdocDocumentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vdoc document persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(vdocDocumentImpl.class.getName());
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
	private static final String _SQL_SELECT_VDOCDOCUMENT = "SELECT vdocDocument FROM vdocDocument vdocDocument";
	private static final String _SQL_SELECT_VDOCDOCUMENT_WHERE_PKS_IN = "SELECT vdocDocument FROM vdocDocument vdocDocument WHERE docId IN (";
	private static final String _SQL_SELECT_VDOCDOCUMENT_WHERE = "SELECT vdocDocument FROM vdocDocument vdocDocument WHERE ";
	private static final String _SQL_COUNT_VDOCDOCUMENT = "SELECT COUNT(vdocDocument) FROM vdocDocument vdocDocument";
	private static final String _SQL_COUNT_VDOCDOCUMENT_WHERE = "SELECT COUNT(vdocDocument) FROM vdocDocument vdocDocument WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocDocument exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(vdocDocumentPersistenceImpl.class);
}