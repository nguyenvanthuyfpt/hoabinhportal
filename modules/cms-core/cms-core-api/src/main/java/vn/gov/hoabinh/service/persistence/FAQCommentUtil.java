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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.FAQComment;

import java.util.List;

/**
 * The persistence utility for the f a q comment service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.FAQCommentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCommentPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.FAQCommentPersistenceImpl
 * @generated
 */
@ProviderType
public class FAQCommentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FAQComment faqComment) {
		getPersistence().clearCache(faqComment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FAQComment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQComment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQComment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FAQComment update(FAQComment faqComment) {
		return getPersistence().update(faqComment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FAQComment update(FAQComment faqComment,
		ServiceContext serviceContext) {
		return getPersistence().update(faqComment, serviceContext);
	}

	/**
	* Returns all the f a q comments where approved = &#63;.
	*
	* @param approved the approved
	* @return the matching f a q comments
	*/
	public static List<FAQComment> findByApproved(boolean approved) {
		return getPersistence().findByApproved(approved);
	}

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
	public static List<FAQComment> findByApproved(boolean approved, int start,
		int end) {
		return getPersistence().findByApproved(approved, start, end);
	}

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
	public static List<FAQComment> findByApproved(boolean approved, int start,
		int end, OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence()
				   .findByApproved(approved, start, end, orderByComparator);
	}

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
	public static List<FAQComment> findByApproved(boolean approved, int start,
		int end, OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApproved(approved, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public static FAQComment findByApproved_First(boolean approved,
		OrderByComparator<FAQComment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence().findByApproved_First(approved, orderByComparator);
	}

	/**
	* Returns the first f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public static FAQComment fetchByApproved_First(boolean approved,
		OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence()
				   .fetchByApproved_First(approved, orderByComparator);
	}

	/**
	* Returns the last f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public static FAQComment findByApproved_Last(boolean approved,
		OrderByComparator<FAQComment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence().findByApproved_Last(approved, orderByComparator);
	}

	/**
	* Returns the last f a q comment in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public static FAQComment fetchByApproved_Last(boolean approved,
		OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence().fetchByApproved_Last(approved, orderByComparator);
	}

	/**
	* Returns the f a q comments before and after the current f a q comment in the ordered set where approved = &#63;.
	*
	* @param id the primary key of the current f a q comment
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q comment
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public static FAQComment[] findByApproved_PrevAndNext(long id,
		boolean approved, OrderByComparator<FAQComment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence()
				   .findByApproved_PrevAndNext(id, approved, orderByComparator);
	}

	/**
	* Removes all the f a q comments where approved = &#63; from the database.
	*
	* @param approved the approved
	*/
	public static void removeByApproved(boolean approved) {
		getPersistence().removeByApproved(approved);
	}

	/**
	* Returns the number of f a q comments where approved = &#63;.
	*
	* @param approved the approved
	* @return the number of matching f a q comments
	*/
	public static int countByApproved(boolean approved) {
		return getPersistence().countByApproved(approved);
	}

	/**
	* Returns all the f a q comments where answerid = &#63;.
	*
	* @param answerid the answerid
	* @return the matching f a q comments
	*/
	public static List<FAQComment> findByAnswerid(long answerid) {
		return getPersistence().findByAnswerid(answerid);
	}

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
	public static List<FAQComment> findByAnswerid(long answerid, int start,
		int end) {
		return getPersistence().findByAnswerid(answerid, start, end);
	}

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
	public static List<FAQComment> findByAnswerid(long answerid, int start,
		int end, OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence()
				   .findByAnswerid(answerid, start, end, orderByComparator);
	}

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
	public static List<FAQComment> findByAnswerid(long answerid, int start,
		int end, OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAnswerid(answerid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public static FAQComment findByAnswerid_First(long answerid,
		OrderByComparator<FAQComment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence().findByAnswerid_First(answerid, orderByComparator);
	}

	/**
	* Returns the first f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public static FAQComment fetchByAnswerid_First(long answerid,
		OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence()
				   .fetchByAnswerid_First(answerid, orderByComparator);
	}

	/**
	* Returns the last f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment
	* @throws NoSuchFAQCommentException if a matching f a q comment could not be found
	*/
	public static FAQComment findByAnswerid_Last(long answerid,
		OrderByComparator<FAQComment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence().findByAnswerid_Last(answerid, orderByComparator);
	}

	/**
	* Returns the last f a q comment in the ordered set where answerid = &#63;.
	*
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q comment, or <code>null</code> if a matching f a q comment could not be found
	*/
	public static FAQComment fetchByAnswerid_Last(long answerid,
		OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence().fetchByAnswerid_Last(answerid, orderByComparator);
	}

	/**
	* Returns the f a q comments before and after the current f a q comment in the ordered set where answerid = &#63;.
	*
	* @param id the primary key of the current f a q comment
	* @param answerid the answerid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q comment
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public static FAQComment[] findByAnswerid_PrevAndNext(long id,
		long answerid, OrderByComparator<FAQComment> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence()
				   .findByAnswerid_PrevAndNext(id, answerid, orderByComparator);
	}

	/**
	* Removes all the f a q comments where answerid = &#63; from the database.
	*
	* @param answerid the answerid
	*/
	public static void removeByAnswerid(long answerid) {
		getPersistence().removeByAnswerid(answerid);
	}

	/**
	* Returns the number of f a q comments where answerid = &#63;.
	*
	* @param answerid the answerid
	* @return the number of matching f a q comments
	*/
	public static int countByAnswerid(long answerid) {
		return getPersistence().countByAnswerid(answerid);
	}

	/**
	* Caches the f a q comment in the entity cache if it is enabled.
	*
	* @param faqComment the f a q comment
	*/
	public static void cacheResult(FAQComment faqComment) {
		getPersistence().cacheResult(faqComment);
	}

	/**
	* Caches the f a q comments in the entity cache if it is enabled.
	*
	* @param faqComments the f a q comments
	*/
	public static void cacheResult(List<FAQComment> faqComments) {
		getPersistence().cacheResult(faqComments);
	}

	/**
	* Creates a new f a q comment with the primary key. Does not add the f a q comment to the database.
	*
	* @param id the primary key for the new f a q comment
	* @return the new f a q comment
	*/
	public static FAQComment create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment that was removed
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public static FAQComment remove(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence().remove(id);
	}

	public static FAQComment updateImpl(FAQComment faqComment) {
		return getPersistence().updateImpl(faqComment);
	}

	/**
	* Returns the f a q comment with the primary key or throws a {@link NoSuchFAQCommentException} if it could not be found.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment
	* @throws NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	*/
	public static FAQComment findByPrimaryKey(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQCommentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the f a q comment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment, or <code>null</code> if a f a q comment with the primary key could not be found
	*/
	public static FAQComment fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, FAQComment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the f a q comments.
	*
	* @return the f a q comments
	*/
	public static List<FAQComment> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FAQComment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<FAQComment> findAll(int start, int end,
		OrderByComparator<FAQComment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FAQComment> findAll(int start, int end,
		OrderByComparator<FAQComment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the f a q comments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of f a q comments.
	*
	* @return the number of f a q comments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FAQCommentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQCommentPersistence, FAQCommentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FAQCommentPersistence.class);
}