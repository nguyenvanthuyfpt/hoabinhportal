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

import vn.gov.hoabinh.exception.NoSuchVcmsArticleException;
import vn.gov.hoabinh.model.VcmsArticle;

/**
 * The persistence interface for the vcms article service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticlePersistenceImpl
 * @see VcmsArticleUtil
 * @generated
 */
@ProviderType
public interface VcmsArticlePersistence extends BasePersistence<VcmsArticle> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsArticleUtil} to access the vcms article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status, int start, int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByL_S_First(long groupId, java.lang.String language,
		long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByL_S_First(long groupId,
		java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByL_S_Last(long groupId, java.lang.String language,
		long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByL_S_Last(long groupId, java.lang.String language,
		long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByL_S_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	*/
	public void removeByL_S(long groupId, java.lang.String language, long status);

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @return the number of matching vcms articles
	*/
	public int countByL_S(long groupId, java.lang.String language, long status);

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		int start, int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByG_L_S_C_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByG_L_S_C_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByG_L_S_C_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByG_L_S_C_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByG_L_S_C_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	*/
	public void removeByG_L_S_C(long groupId, java.lang.String language,
		long status, java.lang.String categoryId);

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @return the number of matching vcms articles
	*/
	public int countByG_L_S_C(long groupId, java.lang.String language,
		long status, java.lang.String categoryId);

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int start, int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByG_L_S_C_A_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByG_L_S_C_A_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByG_L_S_C_A_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByG_L_S_C_A_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	*/
	public void removeByG_L_S_C_A(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.lang.String articleId);

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @return the number of matching vcms articles
	*/
	public int countByG_L_S_C_A(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.lang.String articleId);

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		int start, int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByG_L_S_U_First(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByG_L_S_U_First(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByG_L_S_U_Last(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByG_L_S_U_Last(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByG_L_S_U_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	*/
	public void removeByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser);

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @return the number of matching vcms articles
	*/
	public int countByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser);

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky, int start,
		int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByL_S_S_First(long groupId,
		java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByL_S_S_First(long groupId,
		java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByL_S_S_Last(long groupId,
		java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByL_S_S_Last(long groupId,
		java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByL_S_S_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	*/
	public void removeByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky);

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @return the number of matching vcms articles
	*/
	public int countByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky);

	/**
	* Returns all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language, int start,
		int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByU_L_First(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByU_L_First(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByU_L_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByU_L_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByU_L_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	*/
	public void removeByU_L(long groupId, java.lang.String createdByUser,
		java.lang.String language);

	/**
	* Returns the number of vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @return the number of matching vcms articles
	*/
	public int countByU_L(long groupId, java.lang.String createdByUser,
		java.lang.String language);

	/**
	* Returns all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		int start, int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByU_L_S_First(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByU_L_S_First(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByU_L_S_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByU_L_S_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByU_L_S_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	*/
	public void removeByU_L_S(long groupId, java.lang.String createdByUser,
		java.lang.String language, long status);

	/**
	* Returns the number of vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @return the number of matching vcms articles
	*/
	public int countByU_L_S(long groupId, java.lang.String createdByUser,
		java.lang.String language, long status);

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible);

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible, int start,
		int end);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByP_L_S_D_First(long groupId,
		java.lang.String language, long status, boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByP_L_S_D_First(long groupId,
		java.lang.String language, long status, boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByP_L_S_D_Last(long groupId,
		java.lang.String language, long status, boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByP_L_S_D_Last(long groupId,
		java.lang.String language, long status, boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByP_L_S_D_PrevAndNext(java.lang.String articleId,
		long groupId, java.lang.String language, long status,
		boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	*/
	public void removeByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible);

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @return the number of matching vcms articles
	*/
	public int countByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible);

	/**
	* Returns all the vcms articles where status = &#63;.
	*
	* @param status the status
	* @return the matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByStatus(long status);

	/**
	* Returns a range of all the vcms articles where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByStatus(long status, int start,
		int end);

	/**
	* Returns an ordered range of all the vcms articles where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByStatus(long status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public java.util.List<VcmsArticle> findByStatus(long status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByStatus_First(long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the first vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByStatus_First(long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the last vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public VcmsArticle findByStatus_Last(long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the last vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public VcmsArticle fetchByStatus_Last(long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where status = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle[] findByStatus_PrevAndNext(java.lang.String articleId,
		long status,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator)
		throws NoSuchVcmsArticleException;

	/**
	* Removes all the vcms articles where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(long status);

	/**
	* Returns the number of vcms articles where status = &#63;.
	*
	* @param status the status
	* @return the number of matching vcms articles
	*/
	public int countByStatus(long status);

	/**
	* Caches the vcms article in the entity cache if it is enabled.
	*
	* @param vcmsArticle the vcms article
	*/
	public void cacheResult(VcmsArticle vcmsArticle);

	/**
	* Caches the vcms articles in the entity cache if it is enabled.
	*
	* @param vcmsArticles the vcms articles
	*/
	public void cacheResult(java.util.List<VcmsArticle> vcmsArticles);

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	public VcmsArticle create(java.lang.String articleId);

	/**
	* Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article that was removed
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle remove(java.lang.String articleId)
		throws NoSuchVcmsArticleException;

	public VcmsArticle updateImpl(VcmsArticle vcmsArticle);

	/**
	* Returns the vcms article with the primary key or throws a {@link NoSuchVcmsArticleException} if it could not be found.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public VcmsArticle findByPrimaryKey(java.lang.String articleId)
		throws NoSuchVcmsArticleException;

	/**
	* Returns the vcms article with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	*/
	public VcmsArticle fetchByPrimaryKey(java.lang.String articleId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsArticle> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms articles.
	*
	* @return the vcms articles
	*/
	public java.util.List<VcmsArticle> findAll();

	/**
	* Returns a range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of vcms articles
	*/
	public java.util.List<VcmsArticle> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms articles
	*/
	public java.util.List<VcmsArticle> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator);

	/**
	* Returns an ordered range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms articles
	*/
	public java.util.List<VcmsArticle> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms articles from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms articles.
	*
	* @return the number of vcms articles
	*/
	public int countAll();
}