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

import vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException;
import vn.gov.hoabinh.model.VcmsArticleRating;

/**
 * The persistence interface for the vcms article rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleRatingPersistenceImpl
 * @see VcmsArticleRatingUtil
 * @generated
 */
@ProviderType
public interface VcmsArticleRatingPersistence extends BasePersistence<VcmsArticleRating> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsArticleRatingUtil} to access the vcms article rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms article ratings where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_R(long articleId);

	/**
	* Returns a range of all the vcms article ratings where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_R(long articleId,
		int start, int end);

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_R(long articleId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_R(long articleId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating findByA_R_First(long articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating fetchByA_R_First(long articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating findByA_R_Last(long articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating fetchByA_R_Last(long articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns the vcms article ratings before and after the current vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param Id the primary key of the current vcms article rating
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public VcmsArticleRating[] findByA_R_PrevAndNext(long Id, long articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Removes all the vcms article ratings where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByA_R(long articleId);

	/**
	* Returns the number of vcms article ratings where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article ratings
	*/
	public int countByA_R(long articleId);

	/**
	* Returns all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @return the matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId);

	/**
	* Returns a range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId, int start, int end);

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating findByA_S_First(long articleId,
		java.lang.String sessionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating fetchByA_S_First(long articleId,
		java.lang.String sessionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating findByA_S_Last(long articleId,
		java.lang.String sessionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public VcmsArticleRating fetchByA_S_Last(long articleId,
		java.lang.String sessionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns the vcms article ratings before and after the current vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param Id the primary key of the current vcms article rating
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public VcmsArticleRating[] findByA_S_PrevAndNext(long Id, long articleId,
		java.lang.String sessionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Removes all the vcms article ratings where articleId = &#63; and sessionId = &#63; from the database.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	*/
	public void removeByA_S(long articleId, java.lang.String sessionId);

	/**
	* Returns the number of vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @return the number of matching vcms article ratings
	*/
	public int countByA_S(long articleId, java.lang.String sessionId);

	/**
	* Caches the vcms article rating in the entity cache if it is enabled.
	*
	* @param vcmsArticleRating the vcms article rating
	*/
	public void cacheResult(VcmsArticleRating vcmsArticleRating);

	/**
	* Caches the vcms article ratings in the entity cache if it is enabled.
	*
	* @param vcmsArticleRatings the vcms article ratings
	*/
	public void cacheResult(
		java.util.List<VcmsArticleRating> vcmsArticleRatings);

	/**
	* Creates a new vcms article rating with the primary key. Does not add the vcms article rating to the database.
	*
	* @param Id the primary key for the new vcms article rating
	* @return the new vcms article rating
	*/
	public VcmsArticleRating create(long Id);

	/**
	* Removes the vcms article rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating that was removed
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public VcmsArticleRating remove(long Id)
		throws NoSuchVcmsArticleRatingException;

	public VcmsArticleRating updateImpl(VcmsArticleRating vcmsArticleRating);

	/**
	* Returns the vcms article rating with the primary key or throws a {@link NoSuchVcmsArticleRatingException} if it could not be found.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public VcmsArticleRating findByPrimaryKey(long Id)
		throws NoSuchVcmsArticleRatingException;

	/**
	* Returns the vcms article rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating, or <code>null</code> if a vcms article rating with the primary key could not be found
	*/
	public VcmsArticleRating fetchByPrimaryKey(long Id);

	@Override
	public java.util.Map<java.io.Serializable, VcmsArticleRating> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms article ratings.
	*
	* @return the vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findAll();

	/**
	* Returns a range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator);

	/**
	* Returns an ordered range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article ratings
	*/
	public java.util.List<VcmsArticleRating> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms article ratings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms article ratings.
	*
	* @return the number of vcms article ratings
	*/
	public int countAll();
}