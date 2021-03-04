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

import vn.gov.hoabinh.exception.NoSuchVLegalOrgException;
import vn.gov.hoabinh.model.VLegalOrg;

/**
 * The persistence interface for the v legal org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalOrgPersistenceImpl
 * @see VLegalOrgUtil
 * @generated
 */
@ProviderType
public interface VLegalOrgPersistence extends BasePersistence<VLegalOrg> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalOrgUtil} to access the v legal org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal orgs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg[] findByGroupId_PrevAndNext(java.lang.String orgId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal orgs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal orgs
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg[] findByG_L_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal orgs
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns the v legal org where groupId = &#63; and orgId = &#63; or throws a {@link NoSuchVLegalOrgException} if it could not be found.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_O(long groupId, java.lang.String orgId)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_O(long groupId, java.lang.String orgId);

	/**
	* Returns the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_O(long groupId, java.lang.String orgId,
		boolean retrieveFromCache);

	/**
	* Removes the v legal org where groupId = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the v legal org that was removed
	*/
	public VLegalOrg removeByG_O(long groupId, java.lang.String orgId)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the number of v legal orgs where groupId = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the number of matching v legal orgs
	*/
	public int countByG_O(long groupId, java.lang.String orgId);

	/**
	* Returns all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @return the matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language);

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByS_L_First(long groupId, boolean statusOrg,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByS_L_First(long groupId, boolean statusOrg,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByS_L_Last(long groupId, boolean statusOrg,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByS_L_Last(long groupId, boolean statusOrg,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg[] findByS_L_PrevAndNext(java.lang.String orgId,
		long groupId, boolean statusOrg, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	*/
	public void removeByS_L(long groupId, boolean statusOrg,
		java.lang.String language);

	/**
	* Returns the number of v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @return the number of matching v legal orgs
	*/
	public int countByS_L(long groupId, boolean statusOrg,
		java.lang.String language);

	/**
	* Returns all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @return the matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_Rss(long groupId,
		boolean statusOrg, boolean rssable);

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_Rss(long groupId,
		boolean statusOrg, boolean rssable, int start, int end);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_Rss(long groupId,
		boolean statusOrg, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByS_Rss(long groupId,
		boolean statusOrg, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg[] findByS_Rss_PrevAndNext(java.lang.String orgId,
		long groupId, boolean statusOrg, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	*/
	public void removeByS_Rss(long groupId, boolean statusOrg, boolean rssable);

	/**
	* Returns the number of v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @return the number of matching v legal orgs
	*/
	public int countByS_Rss(long groupId, boolean statusOrg, boolean rssable);

	/**
	* Returns all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId);

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_L_P_First(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_L_P_Last(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_L_P_Last(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg[] findByG_L_P_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	*/
	public void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId);

	/**
	* Returns the number of v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching v legal orgs
	*/
	public int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId);

	/**
	* Returns all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @return the matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId, boolean statusOrg);

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public java.util.List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_L_P_S_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_L_P_S_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public VLegalOrg findByG_L_P_S_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public VLegalOrg fetchByG_L_P_S_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg[] findByG_L_P_S_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator)
		throws NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	*/
	public void removeByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg);

	/**
	* Returns the number of v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @return the number of matching v legal orgs
	*/
	public int countByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg);

	/**
	* Caches the v legal org in the entity cache if it is enabled.
	*
	* @param vLegalOrg the v legal org
	*/
	public void cacheResult(VLegalOrg vLegalOrg);

	/**
	* Caches the v legal orgs in the entity cache if it is enabled.
	*
	* @param vLegalOrgs the v legal orgs
	*/
	public void cacheResult(java.util.List<VLegalOrg> vLegalOrgs);

	/**
	* Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	*
	* @param orgId the primary key for the new v legal org
	* @return the new v legal org
	*/
	public VLegalOrg create(java.lang.String orgId);

	/**
	* Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org that was removed
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg remove(java.lang.String orgId)
		throws NoSuchVLegalOrgException;

	public VLegalOrg updateImpl(VLegalOrg vLegalOrg);

	/**
	* Returns the v legal org with the primary key or throws a {@link NoSuchVLegalOrgException} if it could not be found.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public VLegalOrg findByPrimaryKey(java.lang.String orgId)
		throws NoSuchVLegalOrgException;

	/**
	* Returns the v legal org with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	*/
	public VLegalOrg fetchByPrimaryKey(java.lang.String orgId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalOrg> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal orgs.
	*
	* @return the v legal orgs
	*/
	public java.util.List<VLegalOrg> findAll();

	/**
	* Returns a range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of v legal orgs
	*/
	public java.util.List<VLegalOrg> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal orgs
	*/
	public java.util.List<VLegalOrg> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator);

	/**
	* Returns an ordered range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal orgs
	*/
	public java.util.List<VLegalOrg> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal orgs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal orgs.
	*
	* @return the number of v legal orgs
	*/
	public int countAll();
}