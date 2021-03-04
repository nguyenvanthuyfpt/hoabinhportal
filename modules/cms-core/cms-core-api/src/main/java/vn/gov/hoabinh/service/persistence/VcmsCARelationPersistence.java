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

import vn.gov.hoabinh.exception.NoSuchVcmsCARelationException;
import vn.gov.hoabinh.model.VcmsCARelation;

/**
 * The persistence interface for the vcms c a relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsCARelationPersistenceImpl
 * @see VcmsCARelationUtil
 * @generated
 */
@ProviderType
public interface VcmsCARelationPersistence extends BasePersistence<VcmsCARelation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsCARelationUtil} to access the vcms c a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms c a relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByCategory(
		java.lang.String categoryId);

	/**
	* Returns a range of all the vcms c a relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByCategory(
		java.lang.String categoryId, int start, int end);

	/**
	* Returns an ordered range of all the vcms c a relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms c a relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation findByCategory_First(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException;

	/**
	* Returns the first vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation fetchByCategory_First(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns the last vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation findByCategory_Last(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException;

	/**
	* Returns the last vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation fetchByCategory_Last(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns the vcms c a relations before and after the current vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param vcmsCARelationPK the primary key of the current vcms c a relation
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c a relation
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public VcmsCARelation[] findByCategory_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK,
		java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException;

	/**
	* Removes all the vcms c a relations where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public void removeByCategory(java.lang.String categoryId);

	/**
	* Returns the number of vcms c a relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching vcms c a relations
	*/
	public int countByCategory(java.lang.String categoryId);

	/**
	* Returns all the vcms c a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByArticle(
		java.lang.String articleId);

	/**
	* Returns a range of all the vcms c a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByArticle(
		java.lang.String articleId, int start, int end);

	/**
	* Returns an ordered range of all the vcms c a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms c a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException;

	/**
	* Returns the first vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns the last vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException;

	/**
	* Returns the last vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public VcmsCARelation fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns the vcms c a relations before and after the current vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param vcmsCARelationPK the primary key of the current vcms c a relation
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c a relation
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public VcmsCARelation[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator)
		throws NoSuchVcmsCARelationException;

	/**
	* Removes all the vcms c a relations where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms c a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms c a relations
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Caches the vcms c a relation in the entity cache if it is enabled.
	*
	* @param vcmsCARelation the vcms c a relation
	*/
	public void cacheResult(VcmsCARelation vcmsCARelation);

	/**
	* Caches the vcms c a relations in the entity cache if it is enabled.
	*
	* @param vcmsCARelations the vcms c a relations
	*/
	public void cacheResult(java.util.List<VcmsCARelation> vcmsCARelations);

	/**
	* Creates a new vcms c a relation with the primary key. Does not add the vcms c a relation to the database.
	*
	* @param vcmsCARelationPK the primary key for the new vcms c a relation
	* @return the new vcms c a relation
	*/
	public VcmsCARelation create(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK);

	/**
	* Removes the vcms c a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation that was removed
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public VcmsCARelation remove(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK)
		throws NoSuchVcmsCARelationException;

	public VcmsCARelation updateImpl(VcmsCARelation vcmsCARelation);

	/**
	* Returns the vcms c a relation with the primary key or throws a {@link NoSuchVcmsCARelationException} if it could not be found.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public VcmsCARelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK)
		throws NoSuchVcmsCARelationException;

	/**
	* Returns the vcms c a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation, or <code>null</code> if a vcms c a relation with the primary key could not be found
	*/
	public VcmsCARelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK);

	@Override
	public java.util.Map<java.io.Serializable, VcmsCARelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms c a relations.
	*
	* @return the vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findAll();

	/**
	* Returns a range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms c a relations
	*/
	public java.util.List<VcmsCARelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms c a relations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms c a relations.
	*
	* @return the number of vcms c a relations
	*/
	public int countAll();
}