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

import vn.gov.hoabinh.exception.NoSuchVcmsTARelationException;
import vn.gov.hoabinh.model.VcmsTARelation;

/**
 * The persistence interface for the vcms t a relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsTARelationPersistenceImpl
 * @see VcmsTARelationUtil
 * @generated
 */
@ProviderType
public interface VcmsTARelationPersistence extends BasePersistence<VcmsTARelation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsTARelationUtil} to access the vcms t a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms t a relations where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @return the matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByThread(
		java.lang.String threadId);

	/**
	* Returns a range of all the vcms t a relations where threadId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param threadId the thread ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByThread(
		java.lang.String threadId, int start, int end);

	/**
	* Returns an ordered range of all the vcms t a relations where threadId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param threadId the thread ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByThread(
		java.lang.String threadId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms t a relations where threadId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param threadId the thread ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByThread(
		java.lang.String threadId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation findByThread_First(java.lang.String threadId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException;

	/**
	* Returns the first vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation fetchByThread_First(java.lang.String threadId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns the last vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation findByThread_Last(java.lang.String threadId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException;

	/**
	* Returns the last vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation fetchByThread_Last(java.lang.String threadId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns the vcms t a relations before and after the current vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param vcmsTARelationPK the primary key of the current vcms t a relation
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms t a relation
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public VcmsTARelation[] findByThread_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK,
		java.lang.String threadId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException;

	/**
	* Removes all the vcms t a relations where threadId = &#63; from the database.
	*
	* @param threadId the thread ID
	*/
	public void removeByThread(java.lang.String threadId);

	/**
	* Returns the number of vcms t a relations where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @return the number of matching vcms t a relations
	*/
	public int countByThread(java.lang.String threadId);

	/**
	* Returns all the vcms t a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByArticle(
		java.lang.String articleId);

	/**
	* Returns a range of all the vcms t a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByArticle(
		java.lang.String articleId, int start, int end);

	/**
	* Returns an ordered range of all the vcms t a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms t a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException;

	/**
	* Returns the first vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns the last vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException;

	/**
	* Returns the last vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public VcmsTARelation fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns the vcms t a relations before and after the current vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param vcmsTARelationPK the primary key of the current vcms t a relation
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms t a relation
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public VcmsTARelation[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator)
		throws NoSuchVcmsTARelationException;

	/**
	* Removes all the vcms t a relations where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms t a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms t a relations
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Caches the vcms t a relation in the entity cache if it is enabled.
	*
	* @param vcmsTARelation the vcms t a relation
	*/
	public void cacheResult(VcmsTARelation vcmsTARelation);

	/**
	* Caches the vcms t a relations in the entity cache if it is enabled.
	*
	* @param vcmsTARelations the vcms t a relations
	*/
	public void cacheResult(java.util.List<VcmsTARelation> vcmsTARelations);

	/**
	* Creates a new vcms t a relation with the primary key. Does not add the vcms t a relation to the database.
	*
	* @param vcmsTARelationPK the primary key for the new vcms t a relation
	* @return the new vcms t a relation
	*/
	public VcmsTARelation create(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK);

	/**
	* Removes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation that was removed
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public VcmsTARelation remove(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws NoSuchVcmsTARelationException;

	public VcmsTARelation updateImpl(VcmsTARelation vcmsTARelation);

	/**
	* Returns the vcms t a relation with the primary key or throws a {@link NoSuchVcmsTARelationException} if it could not be found.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public VcmsTARelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws NoSuchVcmsTARelationException;

	/**
	* Returns the vcms t a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation, or <code>null</code> if a vcms t a relation with the primary key could not be found
	*/
	public VcmsTARelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK);

	@Override
	public java.util.Map<java.io.Serializable, VcmsTARelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms t a relations.
	*
	* @return the vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findAll();

	/**
	* Returns a range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms t a relations
	*/
	public java.util.List<VcmsTARelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms t a relations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms t a relations.
	*
	* @return the number of vcms t a relations
	*/
	public int countAll();
}