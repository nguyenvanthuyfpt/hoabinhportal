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

import vn.gov.hoabinh.exception.NoSuchFAQAnswerException;
import vn.gov.hoabinh.model.FAQAnswer;

/**
 * The persistence interface for the f a q answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.FAQAnswerPersistenceImpl
 * @see FAQAnswerUtil
 * @generated
 */
@ProviderType
public interface FAQAnswerPersistence extends BasePersistence<FAQAnswer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQAnswerUtil} to access the f a q answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the f a q answers where language = &#63;.
	*
	* @param language the language
	* @return the matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByG_L(java.lang.String language);

	/**
	* Returns a range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByG_L(java.lang.String language,
		int start, int end);

	/**
	* Returns an ordered range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByG_L(java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns an ordered range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByG_L(java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByG_L_First(java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the first f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByG_L_First(java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the last f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByG_L_Last(java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the last f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByG_L_Last(java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where language = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer[] findByG_L_PrevAndNext(long id,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Removes all the f a q answers where language = &#63; from the database.
	*
	* @param language the language
	*/
	public void removeByG_L(java.lang.String language);

	/**
	* Returns the number of f a q answers where language = &#63;.
	*
	* @param language the language
	* @return the number of matching f a q answers
	*/
	public int countByG_L(java.lang.String language);

	/**
	* Returns all the f a q answers where approved = &#63;.
	*
	* @param approved the approved
	* @return the matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByApproved(boolean approved);

	/**
	* Returns a range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByApproved(boolean approved,
		int start, int end);

	/**
	* Returns an ordered range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByApproved(boolean approved,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns an ordered range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByApproved(boolean approved,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByApproved_First(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the first f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByApproved_First(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the last f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByApproved_Last(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the last f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByApproved_Last(boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where approved = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer[] findByApproved_PrevAndNext(long id, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Removes all the f a q answers where approved = &#63; from the database.
	*
	* @param approved the approved
	*/
	public void removeByApproved(boolean approved);

	/**
	* Returns the number of f a q answers where approved = &#63;.
	*
	* @param approved the approved
	* @return the number of matching f a q answers
	*/
	public int countByApproved(boolean approved);

	/**
	* Returns all the f a q answers where questionid = &#63;.
	*
	* @param questionid the questionid
	* @return the matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQuestionId(long questionid);

	/**
	* Returns a range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQuestionId(long questionid,
		int start, int end);

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQuestionId(long questionid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQuestionId(long questionid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByQuestionId_First(long questionid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByQuestionId_First(long questionid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByQuestionId_Last(long questionid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByQuestionId_Last(long questionid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer[] findByQuestionId_PrevAndNext(long id, long questionid,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Removes all the f a q answers where questionid = &#63; from the database.
	*
	* @param questionid the questionid
	*/
	public void removeByQuestionId(long questionid);

	/**
	* Returns the number of f a q answers where questionid = &#63;.
	*
	* @param questionid the questionid
	* @return the number of matching f a q answers
	*/
	public int countByQuestionId(long questionid);

	/**
	* Returns all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @return the matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQ_A(long questionid, boolean approved);

	/**
	* Returns a range of all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQ_A(long questionid,
		boolean approved, int start, int end);

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQ_A(long questionid,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public java.util.List<FAQAnswer> findByQ_A(long questionid,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByQ_A_First(long questionid, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByQ_A_First(long questionid, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public FAQAnswer findByQ_A_Last(long questionid, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public FAQAnswer fetchByQ_A_Last(long questionid, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer[] findByQ_A_PrevAndNext(long id, long questionid,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator)
		throws NoSuchFAQAnswerException;

	/**
	* Removes all the f a q answers where questionid = &#63; and approved = &#63; from the database.
	*
	* @param questionid the questionid
	* @param approved the approved
	*/
	public void removeByQ_A(long questionid, boolean approved);

	/**
	* Returns the number of f a q answers where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @return the number of matching f a q answers
	*/
	public int countByQ_A(long questionid, boolean approved);

	/**
	* Caches the f a q answer in the entity cache if it is enabled.
	*
	* @param faqAnswer the f a q answer
	*/
	public void cacheResult(FAQAnswer faqAnswer);

	/**
	* Caches the f a q answers in the entity cache if it is enabled.
	*
	* @param faqAnswers the f a q answers
	*/
	public void cacheResult(java.util.List<FAQAnswer> faqAnswers);

	/**
	* Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	*
	* @param id the primary key for the new f a q answer
	* @return the new f a q answer
	*/
	public FAQAnswer create(long id);

	/**
	* Removes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer that was removed
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer remove(long id) throws NoSuchFAQAnswerException;

	public FAQAnswer updateImpl(FAQAnswer faqAnswer);

	/**
	* Returns the f a q answer with the primary key or throws a {@link NoSuchFAQAnswerException} if it could not be found.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer findByPrimaryKey(long id) throws NoSuchFAQAnswerException;

	/**
	* Returns the f a q answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer, or <code>null</code> if a f a q answer with the primary key could not be found
	*/
	public FAQAnswer fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, FAQAnswer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the f a q answers.
	*
	* @return the f a q answers
	*/
	public java.util.List<FAQAnswer> findAll();

	/**
	* Returns a range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of f a q answers
	*/
	public java.util.List<FAQAnswer> findAll(int start, int end);

	/**
	* Returns an ordered range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q answers
	*/
	public java.util.List<FAQAnswer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator);

	/**
	* Returns an ordered range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q answers
	*/
	public java.util.List<FAQAnswer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the f a q answers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of f a q answers.
	*
	* @return the number of f a q answers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}