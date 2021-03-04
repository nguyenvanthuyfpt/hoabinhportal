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

import vn.gov.hoabinh.exception.NoSuchVcmsPARelationException;
import vn.gov.hoabinh.model.VcmsPARelation;

/**
 * The persistence interface for the vcms p a relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsPARelationPersistenceImpl
 * @see VcmsPARelationUtil
 * @generated
 */
@ProviderType
public interface VcmsPARelationPersistence extends BasePersistence<VcmsPARelation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsPARelationUtil} to access the vcms p a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms p a relations where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @return the matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByPortion(
		java.lang.String portionId);

	/**
	* Returns a range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end);

	/**
	* Returns an ordered range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation findByPortion_First(java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException;

	/**
	* Returns the first vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation fetchByPortion_First(java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns the last vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation findByPortion_Last(java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException;

	/**
	* Returns the last vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation fetchByPortion_Last(java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns the vcms p a relations before and after the current vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param vcmsPARelationPK the primary key of the current vcms p a relation
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms p a relation
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public VcmsPARelation[] findByPortion_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK,
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException;

	/**
	* Removes all the vcms p a relations where portionId = &#63; from the database.
	*
	* @param portionId the portion ID
	*/
	public void removeByPortion(java.lang.String portionId);

	/**
	* Returns the number of vcms p a relations where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @return the number of matching vcms p a relations
	*/
	public int countByPortion(java.lang.String portionId);

	/**
	* Returns all the vcms p a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByArticle(
		java.lang.String articleId);

	/**
	* Returns a range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end);

	/**
	* Returns an ordered range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException;

	/**
	* Returns the first vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns the last vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException;

	/**
	* Returns the last vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public VcmsPARelation fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns the vcms p a relations before and after the current vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param vcmsPARelationPK the primary key of the current vcms p a relation
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms p a relation
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public VcmsPARelation[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator)
		throws NoSuchVcmsPARelationException;

	/**
	* Removes all the vcms p a relations where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms p a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms p a relations
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Caches the vcms p a relation in the entity cache if it is enabled.
	*
	* @param vcmsPARelation the vcms p a relation
	*/
	public void cacheResult(VcmsPARelation vcmsPARelation);

	/**
	* Caches the vcms p a relations in the entity cache if it is enabled.
	*
	* @param vcmsPARelations the vcms p a relations
	*/
	public void cacheResult(java.util.List<VcmsPARelation> vcmsPARelations);

	/**
	* Creates a new vcms p a relation with the primary key. Does not add the vcms p a relation to the database.
	*
	* @param vcmsPARelationPK the primary key for the new vcms p a relation
	* @return the new vcms p a relation
	*/
	public VcmsPARelation create(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK);

	/**
	* Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation that was removed
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public VcmsPARelation remove(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK)
		throws NoSuchVcmsPARelationException;

	public VcmsPARelation updateImpl(VcmsPARelation vcmsPARelation);

	/**
	* Returns the vcms p a relation with the primary key or throws a {@link NoSuchVcmsPARelationException} if it could not be found.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public VcmsPARelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK)
		throws NoSuchVcmsPARelationException;

	/**
	* Returns the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	*/
	public VcmsPARelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK);

	@Override
	public java.util.Map<java.io.Serializable, VcmsPARelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms p a relations.
	*
	* @return the vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findAll();

	/**
	* Returns a range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms p a relations
	*/
	public java.util.List<VcmsPARelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms p a relations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms p a relations.
	*
	* @return the number of vcms p a relations
	*/
	public int countAll();
}