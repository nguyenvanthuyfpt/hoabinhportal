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

import vn.gov.hoabinh.exception.NoSuchVcmsCURelationException;
import vn.gov.hoabinh.model.VcmsCURelation;

/**
 * The persistence interface for the vcms c u relation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsCURelationPersistenceImpl
 * @see VcmsCURelationUtil
 * @generated
 */
@ProviderType
public interface VcmsCURelationPersistence extends BasePersistence<VcmsCURelation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsCURelationUtil} to access the vcms c u relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms c u relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByCategory(
		java.lang.String categoryId);

	/**
	* Returns a range of all the vcms c u relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByCategory(
		java.lang.String categoryId, int start, int end);

	/**
	* Returns an ordered range of all the vcms c u relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms c u relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation findByCategory_First(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException;

	/**
	* Returns the first vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation fetchByCategory_First(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns the last vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation findByCategory_Last(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException;

	/**
	* Returns the last vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation fetchByCategory_Last(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns the vcms c u relations before and after the current vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param vcmsCURelationPK the primary key of the current vcms c u relation
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c u relation
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public VcmsCURelation[] findByCategory_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK,
		java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException;

	/**
	* Removes all the vcms c u relations where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public void removeByCategory(java.lang.String categoryId);

	/**
	* Returns the number of vcms c u relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching vcms c u relations
	*/
	public int countByCategory(java.lang.String categoryId);

	/**
	* Returns all the vcms c u relations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByUser(java.lang.String userId);

	/**
	* Returns a range of all the vcms c u relations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByUser(java.lang.String userId,
		int start, int end);

	/**
	* Returns an ordered range of all the vcms c u relations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByUser(java.lang.String userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms c u relations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findByUser(java.lang.String userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation findByUser_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException;

	/**
	* Returns the first vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation fetchByUser_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns the last vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation findByUser_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException;

	/**
	* Returns the last vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public VcmsCURelation fetchByUser_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns the vcms c u relations before and after the current vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param vcmsCURelationPK the primary key of the current vcms c u relation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c u relation
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public VcmsCURelation[] findByUser_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK,
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator)
		throws NoSuchVcmsCURelationException;

	/**
	* Removes all the vcms c u relations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUser(java.lang.String userId);

	/**
	* Returns the number of vcms c u relations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching vcms c u relations
	*/
	public int countByUser(java.lang.String userId);

	/**
	* Caches the vcms c u relation in the entity cache if it is enabled.
	*
	* @param vcmsCURelation the vcms c u relation
	*/
	public void cacheResult(VcmsCURelation vcmsCURelation);

	/**
	* Caches the vcms c u relations in the entity cache if it is enabled.
	*
	* @param vcmsCURelations the vcms c u relations
	*/
	public void cacheResult(java.util.List<VcmsCURelation> vcmsCURelations);

	/**
	* Creates a new vcms c u relation with the primary key. Does not add the vcms c u relation to the database.
	*
	* @param vcmsCURelationPK the primary key for the new vcms c u relation
	* @return the new vcms c u relation
	*/
	public VcmsCURelation create(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK);

	/**
	* Removes the vcms c u relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation that was removed
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public VcmsCURelation remove(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK)
		throws NoSuchVcmsCURelationException;

	public VcmsCURelation updateImpl(VcmsCURelation vcmsCURelation);

	/**
	* Returns the vcms c u relation with the primary key or throws a {@link NoSuchVcmsCURelationException} if it could not be found.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public VcmsCURelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK)
		throws NoSuchVcmsCURelationException;

	/**
	* Returns the vcms c u relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation, or <code>null</code> if a vcms c u relation with the primary key could not be found
	*/
	public VcmsCURelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK);

	@Override
	public java.util.Map<java.io.Serializable, VcmsCURelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms c u relations.
	*
	* @return the vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findAll();

	/**
	* Returns a range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator);

	/**
	* Returns an ordered range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms c u relations
	*/
	public java.util.List<VcmsCURelation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms c u relations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms c u relations.
	*
	* @return the number of vcms c u relations
	*/
	public int countAll();
}