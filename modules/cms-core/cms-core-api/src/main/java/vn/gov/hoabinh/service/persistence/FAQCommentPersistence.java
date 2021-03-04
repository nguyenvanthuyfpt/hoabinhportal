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

import vn.gov.hoabinh.exception.NoSuchFAQCommentException;
import vn.gov.hoabinh.model.FAQComment;

/**
 * The persistence interface for the f a q comment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.FAQCommentPersistenceImpl
 * @see FAQCommentUtil
 * @generated
 */
@ProviderType
public interface FAQCommentPersistence extends BasePersistence<FAQComment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQCommentUtil} to access the f a q comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the f a q comments where approved = &#63;.
	*
	* @param approved the approved
	* @return the matching f a q comments
	*/
	public java.util.List<FAQComment> findByApproved(boolean approved);

	/**
	* Returns a range of all the f a q comments where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @return the range of matching f a q comments
	*/
	public java.util.List<FAQComment> findByApproved(boolean approved,
		int start, int end);

	/**
	* Returns an ordered range of all the f a q comments where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q comments
	*/
	public java.util.List<FAQComment> findByApproved(boolean approved,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns an ordered range of all the f a q comments where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q comments
	*/
	public java.util.List<FAQComment> findByApproved(boolean approved,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public FAQComment findByApproved_First(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException;

	/**
	* Returns the first f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public FAQComment fetchByApproved_First(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns the last f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public FAQComment findByApproved_Last(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException;

	/**
	* Returns the last f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public FAQComment fetchByApproved_Last(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns the f a q comments before and after the current f a q comment in the ordered set where approved = &#63;.
	*
	* @param id the primary key of the current f a q comment
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q comment
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public FAQComment[] findByApproved_PrevAndNext(long id, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException;

	/**
	* Removes all the f a q comments where approved = &#63; from the database.
	*
	* @param approved the approved
	*/
	public void removeByApproved(boolean approved);

	/**
	* Returns the number of f a q comments where approved = &#63;.
	*
	* @param approved the approved
	* @return the number of matching f a q comments
	*/
	public int countByApproved(boolean approved);

	/**
	* Returns all the f a q comments where answerid = &#63;.
	*
	* @param answerid the answerid
	* @return the matching f a q comments
	*/
	public java.util.List<FAQComment> findByAnswerid(long answerid);

	/**
	* Returns a range of all the f a q comments where answerid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param answerid the answerid
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @return the range of matching f a q comments
	*/
	public java.util.List<FAQComment> findByAnswerid(long answerid, int start,
		int end);

	/**
	* Returns an ordered range of all the f a q comments where answerid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param answerid the answerid
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q comments
	*/
	public java.util.List<FAQComment> findByAnswerid(long answerid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns an ordered range of all the f a q comments where answerid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param answerid the answerid
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q comments
	*/
	public java.util.List<FAQComment> findByAnswerid(long answerid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public FAQComment findByAnswerid_First(long answerid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException;

	/**
	* Returns the first f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public FAQComment fetchByAnswerid_First(long answerid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns the last f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public FAQComment findByAnswerid_Last(long answerid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException;

	/**
	* Returns the last f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public FAQComment fetchByAnswerid_Last(long answerid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns the f a q comments before and after the current f a q comment in the ordered set where answerid = &#63;.
	*
	* @param id the primary key of the current f a q comment
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q comment
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public FAQComment[] findByAnswerid_PrevAndNext(long id, long answerid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator)
		throws NoSuchFAQCommentException;

	/**
	* Removes all the f a q comments where answerid = &#63; from the database.
	*
	* @param answerid the answerid
	*/
	public void removeByAnswerid(long answerid);

	/**
	* Returns the number of f a q comments where answerid = &#63;.
	*
	* @param answerid the answerid
	* @return the number of matching f a q comments
	*/
	public int countByAnswerid(long answerid);

	/**
	* Caches the f a q comment in the entity cache if it is enabled.
	*
	* @param faqComment the f a q comment
	*/
	public void cacheResult(FAQComment faqComment);

	/**
	* Caches the f a q comments in the entity cache if it is enabled.
	*
	* @param faqComments the f a q comments
	*/
	public void cacheResult(java.util.List<FAQComment> faqComments);

	/**
	* Creates a new f a q comment with the primary key. Does not add the f a q comment to the database.
	*
	* @param id the primary key for the new f a q comment
	* @return the new f a q comment
	*/
	public FAQComment create(long id);

	/**
	* Removes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment that was removed
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public FAQComment remove(long id) throws NoSuchFAQCommentException;

	public FAQComment updateImpl(FAQComment faqComment);

	/**
	* Returns the f a q comment with the primary key or throws a {@link NoSuchFAQCommentException} if it could not be found.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public FAQComment findByPrimaryKey(long id)
		throws NoSuchFAQCommentException;

	/**
	* Returns the f a q comment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment, or <code>null</code> if a f a q comment with the primary key could not be found
	*/
	public FAQComment fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, FAQComment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the f a q comments.
	*
	* @return the f a q comments
	*/
	public java.util.List<FAQComment> findAll();

	/**
	* Returns a range of all the f a q comments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @return the range of f a q comments
	*/
	public java.util.List<FAQComment> findAll(int start, int end);

	/**
	* Returns an ordered range of all the f a q comments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q comments
	*/
	public java.util.List<FAQComment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator);

	/**
	* Returns an ordered range of all the f a q comments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q comments
	*/
	public java.util.List<FAQComment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the f a q comments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of f a q comments.
	*
	* @return the number of f a q comments
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}