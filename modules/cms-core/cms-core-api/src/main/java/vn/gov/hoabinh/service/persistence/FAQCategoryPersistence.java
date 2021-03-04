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

package vn.gov.hoabinh.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchFAQCategoryException;
import vn.gov.hoabinh.model.FAQCategory;

/**
 * The persistence interface for the f a q category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.FAQCategoryPersistenceImpl
 * @see FAQCategoryUtil
 * @generated
 */
@ProviderType
public interface FAQCategoryPersistence extends BasePersistence<FAQCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQCategoryUtil} to access the f a q category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the f a q categories where parent = &#63;.
	*
	* @param parent the parent
	* @return the matching f a q categories
	*/
	public java.util.List<FAQCategory> findByParentId(long parent);

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
	public java.util.List<FAQCategory> findByParentId(long parent, int start,
		int end);

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
	public java.util.List<FAQCategory> findByParentId(long parent, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findByParentId(long parent, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public FAQCategory findByParentId_First(long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the first f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByParentId_First(long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

	/**
	* Returns the last f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public FAQCategory findByParentId_Last(long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the last f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByParentId_Last(long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

	/**
	* Returns the f a q categories before and after the current f a q category in the ordered set where parent = &#63;.
	*
	* @param id the primary key of the current f a q category
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public FAQCategory[] findByParentId_PrevAndNext(long id, long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Removes all the f a q categories where parent = &#63; from the database.
	*
	* @param parent the parent
	*/
	public void removeByParentId(long parent);

	/**
	* Returns the number of f a q categories where parent = &#63;.
	*
	* @param parent the parent
	* @return the number of matching f a q categories
	*/
	public int countByParentId(long parent);

	/**
	* Returns all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching f a q categories
	*/
	public java.util.List<FAQCategory> findByG_L(long groupId,
		java.lang.String language);

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
	public java.util.List<FAQCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end);

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
	public java.util.List<FAQCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public FAQCategory findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public FAQCategory findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public FAQCategory[] findByG_L_PrevAndNext(long id, long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Removes all the f a q categories where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of f a q categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching f a q categories
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @return the matching f a q categories
	*/
	public java.util.List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent);

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
	public java.util.List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent, int start, int end);

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
	public java.util.List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache);

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
	public FAQCategory findByG_L_P_First(long groupId,
		java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByG_L_P_First(long groupId,
		java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public FAQCategory findByG_L_P_Last(long groupId,
		java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByG_L_P_Last(long groupId,
		java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public FAQCategory[] findByG_L_P_PrevAndNext(long id, long groupId,
		java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Removes all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	*/
	public void removeByG_L_P(long groupId, java.lang.String language,
		long parent);

	/**
	* Returns the number of f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @return the number of matching f a q categories
	*/
	public int countByG_L_P(long groupId, java.lang.String language, long parent);

	/**
	* Returns all the f a q categories where id = &#63;.
	*
	* @param id the ID
	* @return the matching f a q categories
	*/
	public java.util.List<FAQCategory> findByMenu(long id);

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
	public java.util.List<FAQCategory> findByMenu(long id, int start, int end);

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
	public java.util.List<FAQCategory> findByMenu(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findByMenu(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public FAQCategory findByMenu_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the first f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByMenu_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

	/**
	* Returns the last f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public FAQCategory findByMenu_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the last f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public FAQCategory fetchByMenu_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findByMenu(long[] ids);

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
	public java.util.List<FAQCategory> findByMenu(long[] ids, int start, int end);

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
	public java.util.List<FAQCategory> findByMenu(long[] ids, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findByMenu(long[] ids, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the f a q categories where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByMenu(long id);

	/**
	* Returns the number of f a q categories where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching f a q categories
	*/
	public int countByMenu(long id);

	/**
	* Returns the number of f a q categories where id = any &#63;.
	*
	* @param ids the IDs
	* @return the number of matching f a q categories
	*/
	public int countByMenu(long[] ids);

	/**
	* Caches the f a q category in the entity cache if it is enabled.
	*
	* @param faqCategory the f a q category
	*/
	public void cacheResult(FAQCategory faqCategory);

	/**
	* Caches the f a q categories in the entity cache if it is enabled.
	*
	* @param faqCategories the f a q categories
	*/
	public void cacheResult(java.util.List<FAQCategory> faqCategories);

	/**
	* Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	*
	* @param id the primary key for the new f a q category
	* @return the new f a q category
	*/
	public FAQCategory create(long id);

	/**
	* Removes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category that was removed
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public FAQCategory remove(long id) throws NoSuchFAQCategoryException;

	public FAQCategory updateImpl(FAQCategory faqCategory);

	/**
	* Returns the f a q category with the primary key or throws a {@link NoSuchFAQCategoryException} if it could not be found.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public FAQCategory findByPrimaryKey(long id)
		throws NoSuchFAQCategoryException;

	/**
	* Returns the f a q category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category, or <code>null</code> if a f a q category with the primary key could not be found
	*/
	public FAQCategory fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, FAQCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the f a q categories.
	*
	* @return the f a q categories
	*/
	public java.util.List<FAQCategory> findAll();

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
	public java.util.List<FAQCategory> findAll(int start, int end);

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
	public java.util.List<FAQCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator);

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
	public java.util.List<FAQCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the f a q categories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of f a q categories.
	*
	* @return the number of f a q categories
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}