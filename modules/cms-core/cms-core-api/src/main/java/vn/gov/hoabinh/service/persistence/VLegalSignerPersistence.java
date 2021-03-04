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

import vn.gov.hoabinh.exception.NoSuchVLegalSignerException;
import vn.gov.hoabinh.model.VLegalSigner;

/**
 * The persistence interface for the v legal signer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalSignerPersistenceImpl
 * @see VLegalSignerUtil
 * @generated
 */
@ProviderType
public interface VLegalSignerPersistence extends BasePersistence<VLegalSigner> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalSignerUtil} to access the v legal signer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal signers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63;.
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public VLegalSigner[] findByGroupId_PrevAndNext(java.lang.String sigId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Removes all the v legal signers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal signers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal signers
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the v legal signer where groupId = &#63; and sigId = &#63; or throws a {@link NoSuchVLegalSignerException} if it could not be found.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByG_S(long groupId, java.lang.String sigId)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByG_S(long groupId, java.lang.String sigId);

	/**
	* Returns the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByG_S(long groupId, java.lang.String sigId,
		boolean retrieveFromCache);

	/**
	* Removes the v legal signer where groupId = &#63; and sigId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the v legal signer that was removed
	*/
	public VLegalSigner removeByG_S(long groupId, java.lang.String sigId)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the number of v legal signers where groupId = &#63; and sigId = &#63;.
	*
	* @param groupId the group ID
	* @param sigId the sig ID
	* @return the number of matching v legal signers
	*/
	public int countByG_S(long groupId, java.lang.String sigId);

	/**
	* Returns all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByGroup_Lang(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByGroup_Lang_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByGroup_Lang_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByGroup_Lang_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByGroup_Lang_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public VLegalSigner[] findByGroup_Lang_PrevAndNext(java.lang.String sigId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByGroup_Lang(long groupId, java.lang.String language);

	/**
	* Returns the number of v legal signers where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal signers
	*/
	public int countByGroup_Lang(long groupId, java.lang.String language);

	/**
	* Returns all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @return the matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner);

	/**
	* Returns a range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner, int start, int end);

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal signers
	*/
	public java.util.List<VLegalSigner> findByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByG_L_S_First(long groupId,
		java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByG_L_S_First(long groupId,
		java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer
	* @throws NoSuchVLegalSignerException if a matching v legal signer could not be found
	*/
	public VLegalSigner findByG_L_S_Last(long groupId,
		java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	*/
	public VLegalSigner fetchByG_L_S_Last(long groupId,
		java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param sigId the primary key of the current v legal signer
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public VLegalSigner[] findByG_L_S_PrevAndNext(java.lang.String sigId,
		long groupId, java.lang.String language, boolean statusSigner,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator)
		throws NoSuchVLegalSignerException;

	/**
	* Removes all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	*/
	public void removeByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner);

	/**
	* Returns the number of v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusSigner the status signer
	* @return the number of matching v legal signers
	*/
	public int countByG_L_S(long groupId, java.lang.String language,
		boolean statusSigner);

	/**
	* Caches the v legal signer in the entity cache if it is enabled.
	*
	* @param vLegalSigner the v legal signer
	*/
	public void cacheResult(VLegalSigner vLegalSigner);

	/**
	* Caches the v legal signers in the entity cache if it is enabled.
	*
	* @param vLegalSigners the v legal signers
	*/
	public void cacheResult(java.util.List<VLegalSigner> vLegalSigners);

	/**
	* Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	*
	* @param sigId the primary key for the new v legal signer
	* @return the new v legal signer
	*/
	public VLegalSigner create(java.lang.String sigId);

	/**
	* Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer that was removed
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public VLegalSigner remove(java.lang.String sigId)
		throws NoSuchVLegalSignerException;

	public VLegalSigner updateImpl(VLegalSigner vLegalSigner);

	/**
	* Returns the v legal signer with the primary key or throws a {@link NoSuchVLegalSignerException} if it could not be found.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer
	* @throws NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	*/
	public VLegalSigner findByPrimaryKey(java.lang.String sigId)
		throws NoSuchVLegalSignerException;

	/**
	* Returns the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sigId the primary key of the v legal signer
	* @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	*/
	public VLegalSigner fetchByPrimaryKey(java.lang.String sigId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalSigner> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal signers.
	*
	* @return the v legal signers
	*/
	public java.util.List<VLegalSigner> findAll();

	/**
	* Returns a range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @return the range of v legal signers
	*/
	public java.util.List<VLegalSigner> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal signers
	*/
	public java.util.List<VLegalSigner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator);

	/**
	* Returns an ordered range of all the v legal signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal signers
	* @param end the upper bound of the range of v legal signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal signers
	*/
	public java.util.List<VLegalSigner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSigner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal signers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal signers.
	*
	* @return the number of v legal signers
	*/
	public int countAll();
}