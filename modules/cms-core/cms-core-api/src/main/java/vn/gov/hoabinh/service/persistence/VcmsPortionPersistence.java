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

import vn.gov.hoabinh.exception.NoSuchVcmsPortionException;
import vn.gov.hoabinh.model.VcmsPortion;

/**
 * The persistence interface for the vcms portion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsPortionPersistenceImpl
 * @see VcmsPortionUtil
 * @generated
 */
@ProviderType
public interface VcmsPortionPersistence extends BasePersistence<VcmsPortion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsPortionUtil} to access the vcms portion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @return the matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable);

	/**
	* Returns a range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @return the range of matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable, int start, int end);

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L_C(long groupId,
		java.lang.String language, boolean categorizable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public VcmsPortion findByG_L_C_First(long groupId,
		java.lang.String language, boolean categorizable,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public VcmsPortion fetchByG_L_C_First(long groupId,
		java.lang.String language, boolean categorizable,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public VcmsPortion findByG_L_C_Last(long groupId,
		java.lang.String language, boolean categorizable,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public VcmsPortion fetchByG_L_C_Last(long groupId,
		java.lang.String language, boolean categorizable,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param portionId the primary key of the current vcms portion
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms portion
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public VcmsPortion[] findByG_L_C_PrevAndNext(java.lang.String portionId,
		long groupId, java.lang.String language, boolean categorizable,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException;

	/**
	* Removes all the vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	*/
	public void removeByG_L_C(long groupId, java.lang.String language,
		boolean categorizable);

	/**
	* Returns the number of vcms portions where groupId = &#63; and language = &#63; and categorizable = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categorizable the categorizable
	* @return the number of matching vcms portions
	*/
	public int countByG_L_C(long groupId, java.lang.String language,
		boolean categorizable);

	/**
	* Returns the vcms portion where groupId = &#63; and code = &#63; or throws a {@link NoSuchVcmsPortionException} if it could not be found.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public VcmsPortion findByS_C(long groupId, java.lang.String code)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public VcmsPortion fetchByS_C(long groupId, java.lang.String code);

	/**
	* Returns the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public VcmsPortion fetchByS_C(long groupId, java.lang.String code,
		boolean retrieveFromCache);

	/**
	* Removes the vcms portion where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the vcms portion that was removed
	*/
	public VcmsPortion removeByS_C(long groupId, java.lang.String code)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the number of vcms portions where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the number of matching vcms portions
	*/
	public int countByS_C(long groupId, java.lang.String code);

	/**
	* Returns all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @return the range of matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms portions
	*/
	public java.util.List<VcmsPortion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public VcmsPortion findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public VcmsPortion fetchByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion
	* @throws NoSuchVcmsPortionException if a matching vcms portion could not be found
	*/
	public VcmsPortion findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	*/
	public VcmsPortion fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param portionId the primary key of the current vcms portion
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms portion
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public VcmsPortion[] findByG_L_PrevAndNext(java.lang.String portionId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator)
		throws NoSuchVcmsPortionException;

	/**
	* Removes all the vcms portions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vcms portions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms portions
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Caches the vcms portion in the entity cache if it is enabled.
	*
	* @param vcmsPortion the vcms portion
	*/
	public void cacheResult(VcmsPortion vcmsPortion);

	/**
	* Caches the vcms portions in the entity cache if it is enabled.
	*
	* @param vcmsPortions the vcms portions
	*/
	public void cacheResult(java.util.List<VcmsPortion> vcmsPortions);

	/**
	* Creates a new vcms portion with the primary key. Does not add the vcms portion to the database.
	*
	* @param portionId the primary key for the new vcms portion
	* @return the new vcms portion
	*/
	public VcmsPortion create(java.lang.String portionId);

	/**
	* Removes the vcms portion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portionId the primary key of the vcms portion
	* @return the vcms portion that was removed
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public VcmsPortion remove(java.lang.String portionId)
		throws NoSuchVcmsPortionException;

	public VcmsPortion updateImpl(VcmsPortion vcmsPortion);

	/**
	* Returns the vcms portion with the primary key or throws a {@link NoSuchVcmsPortionException} if it could not be found.
	*
	* @param portionId the primary key of the vcms portion
	* @return the vcms portion
	* @throws NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	*/
	public VcmsPortion findByPrimaryKey(java.lang.String portionId)
		throws NoSuchVcmsPortionException;

	/**
	* Returns the vcms portion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portionId the primary key of the vcms portion
	* @return the vcms portion, or <code>null</code> if a vcms portion with the primary key could not be found
	*/
	public VcmsPortion fetchByPrimaryKey(java.lang.String portionId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsPortion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms portions.
	*
	* @return the vcms portions
	*/
	public java.util.List<VcmsPortion> findAll();

	/**
	* Returns a range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @return the range of vcms portions
	*/
	public java.util.List<VcmsPortion> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms portions
	*/
	public java.util.List<VcmsPortion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator);

	/**
	* Returns an ordered range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPortionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions
	* @param end the upper bound of the range of vcms portions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms portions
	*/
	public java.util.List<VcmsPortion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsPortion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms portions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms portions.
	*
	* @return the number of vcms portions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}