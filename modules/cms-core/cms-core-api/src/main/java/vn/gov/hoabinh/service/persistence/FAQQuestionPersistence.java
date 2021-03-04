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

import vn.gov.hoabinh.exception.NoSuchFAQQuestionException;
import vn.gov.hoabinh.model.FAQQuestion;

/**
 * The persistence interface for the f a q question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.FAQQuestionPersistenceImpl
 * @see FAQQuestionUtil
 * @generated
 */
@ProviderType
public interface FAQQuestionPersistence extends BasePersistence<FAQQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQQuestionUtil} to access the f a q question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @return the matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType);

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType, int start, int end);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_T_First(long groupId,
		java.lang.String questionType,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_T_First(long groupId,
		java.lang.String questionType,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_T_Last(long groupId,
		java.lang.String questionType,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_T_Last(long groupId,
		java.lang.String questionType,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion[] findByG_T_PrevAndNext(long id, long groupId,
		java.lang.String questionType,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Removes all the f a q questions where groupId = &#63; and questionType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param questionType the question type
	*/
	public void removeByG_T(long groupId, java.lang.String questionType);

	/**
	* Returns the number of f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @return the number of matching f a q questions
	*/
	public int countByG_T(long groupId, java.lang.String questionType);

	/**
	* Returns all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_A(long groupId, boolean approved);

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_A(long groupId,
		boolean approved, int start, int end);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_A(long groupId,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_A(long groupId,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_A_First(long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_A_First(long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_A_Last(long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_A_Last(long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion[] findByG_A_PrevAndNext(long id, long groupId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Removes all the f a q questions where groupId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param approved the approved
	*/
	public void removeByG_A(long groupId, boolean approved);

	/**
	* Returns the number of f a q questions where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the number of matching f a q questions
	*/
	public int countByG_A(long groupId, boolean approved);

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion[] findByG_L_PrevAndNext(long id, long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching f a q questions
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved);

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion[] findByG_L_A_PrevAndNext(long id, long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public void removeByG_L_A(long groupId, java.lang.String language,
		boolean approved);

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching f a q questions
	*/
	public int countByG_L_A(long groupId, java.lang.String language,
		boolean approved);

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @return the matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved);

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_C_A_First(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_C_A_First(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_C_A_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_C_A_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion[] findByG_L_C_A_PrevAndNext(long id, long groupId,
		java.lang.String language, long categoryId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	*/
	public void removeByG_L_C_A(long groupId, java.lang.String language,
		long categoryId, boolean approved);

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @return the number of matching f a q questions
	*/
	public int countByG_L_C_A(long groupId, java.lang.String language,
		long categoryId, boolean approved);

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @return the matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id);

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		int start, int end);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public java.util.List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_C_A_Q_First(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_C_A_Q_First(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public FAQQuestion findByG_L_C_A_Q_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public FAQQuestion fetchByG_L_C_A_Q_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	*/
	public void removeByG_L_C_A_Q(long groupId, java.lang.String language,
		long categoryId, boolean approved, long id);

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @return the number of matching f a q questions
	*/
	public int countByG_L_C_A_Q(long groupId, java.lang.String language,
		long categoryId, boolean approved, long id);

	/**
	* Caches the f a q question in the entity cache if it is enabled.
	*
	* @param faqQuestion the f a q question
	*/
	public void cacheResult(FAQQuestion faqQuestion);

	/**
	* Caches the f a q questions in the entity cache if it is enabled.
	*
	* @param faqQuestions the f a q questions
	*/
	public void cacheResult(java.util.List<FAQQuestion> faqQuestions);

	/**
	* Creates a new f a q question with the primary key. Does not add the f a q question to the database.
	*
	* @param id the primary key for the new f a q question
	* @return the new f a q question
	*/
	public FAQQuestion create(long id);

	/**
	* Removes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question that was removed
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion remove(long id) throws NoSuchFAQQuestionException;

	public FAQQuestion updateImpl(FAQQuestion faqQuestion);

	/**
	* Returns the f a q question with the primary key or throws a {@link NoSuchFAQQuestionException} if it could not be found.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public FAQQuestion findByPrimaryKey(long id)
		throws NoSuchFAQQuestionException;

	/**
	* Returns the f a q question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question, or <code>null</code> if a f a q question with the primary key could not be found
	*/
	public FAQQuestion fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, FAQQuestion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the f a q questions.
	*
	* @return the f a q questions
	*/
	public java.util.List<FAQQuestion> findAll();

	/**
	* Returns a range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of f a q questions
	*/
	public java.util.List<FAQQuestion> findAll(int start, int end);

	/**
	* Returns an ordered range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q questions
	*/
	public java.util.List<FAQQuestion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator);

	/**
	* Returns an ordered range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q questions
	*/
	public java.util.List<FAQQuestion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the f a q questions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of f a q questions.
	*
	* @return the number of f a q questions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}