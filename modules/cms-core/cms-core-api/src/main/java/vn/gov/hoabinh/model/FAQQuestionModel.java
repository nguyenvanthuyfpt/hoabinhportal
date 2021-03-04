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

package vn.gov.hoabinh.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FAQQuestion service. Represents a row in the &quot;FAQQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.FAQQuestionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestion
 * @see vn.gov.hoabinh.model.impl.FAQQuestionImpl
 * @see vn.gov.hoabinh.model.impl.FAQQuestionModelImpl
 * @generated
 */
@ProviderType
public interface FAQQuestionModel extends BaseModel<FAQQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a f a q question model instance should use the {@link FAQQuestion} interface instead.
	 */

	/**
	 * Returns the primary key of this f a q question.
	 *
	 * @return the primary key of this f a q question
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this f a q question.
	 *
	 * @param primaryKey the primary key of this f a q question
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this f a q question.
	 *
	 * @return the ID of this f a q question
	 */
	public long getId();

	/**
	 * Sets the ID of this f a q question.
	 *
	 * @param id the ID of this f a q question
	 */
	public void setId(long id);

	/**
	 * Returns the title of this f a q question.
	 *
	 * @return the title of this f a q question
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this f a q question.
	 *
	 * @param title the title of this f a q question
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this f a q question.
	 *
	 * @return the content of this f a q question
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this f a q question.
	 *
	 * @param content the content of this f a q question
	 */
	public void setContent(String content);

	/**
	 * Returns the language of this f a q question.
	 *
	 * @return the language of this f a q question
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this f a q question.
	 *
	 * @param language the language of this f a q question
	 */
	public void setLanguage(String language);

	/**
	 * Returns the question order of this f a q question.
	 *
	 * @return the question order of this f a q question
	 */
	public int getQuestionOrder();

	/**
	 * Sets the question order of this f a q question.
	 *
	 * @param questionOrder the question order of this f a q question
	 */
	public void setQuestionOrder(int questionOrder);

	/**
	 * Returns the sent date of this f a q question.
	 *
	 * @return the sent date of this f a q question
	 */
	public Date getSentDate();

	/**
	 * Sets the sent date of this f a q question.
	 *
	 * @param sentDate the sent date of this f a q question
	 */
	public void setSentDate(Date sentDate);

	/**
	 * Returns the sent by user of this f a q question.
	 *
	 * @return the sent by user of this f a q question
	 */
	@AutoEscape
	public String getSentByUser();

	/**
	 * Sets the sent by user of this f a q question.
	 *
	 * @param sentByUser the sent by user of this f a q question
	 */
	public void setSentByUser(String sentByUser);

	/**
	 * Returns the sender email of this f a q question.
	 *
	 * @return the sender email of this f a q question
	 */
	@AutoEscape
	public String getSenderEmail();

	/**
	 * Sets the sender email of this f a q question.
	 *
	 * @param senderEmail the sender email of this f a q question
	 */
	public void setSenderEmail(String senderEmail);

	/**
	 * Returns the question type of this f a q question.
	 *
	 * @return the question type of this f a q question
	 */
	@AutoEscape
	public String getQuestionType();

	/**
	 * Sets the question type of this f a q question.
	 *
	 * @param questionType the question type of this f a q question
	 */
	public void setQuestionType(String questionType);

	/**
	 * Returns the modified by user of this f a q question.
	 *
	 * @return the modified by user of this f a q question
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this f a q question.
	 *
	 * @param modifiedByUser the modified by user of this f a q question
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Returns the modified date of this f a q question.
	 *
	 * @return the modified date of this f a q question
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this f a q question.
	 *
	 * @param modifiedDate the modified date of this f a q question
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the hit count of this f a q question.
	 *
	 * @return the hit count of this f a q question
	 */
	public int getHitCount();

	/**
	 * Sets the hit count of this f a q question.
	 *
	 * @param hitCount the hit count of this f a q question
	 */
	public void setHitCount(int hitCount);

	/**
	 * Returns the approved of this f a q question.
	 *
	 * @return the approved of this f a q question
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this f a q question is approved.
	 *
	 * @return <code>true</code> if this f a q question is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Sets whether this f a q question is approved.
	 *
	 * @param approved the approved of this f a q question
	 */
	public void setApproved(boolean approved);

	/**
	 * Returns the group ID of this f a q question.
	 *
	 * @return the group ID of this f a q question
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this f a q question.
	 *
	 * @param groupId the group ID of this f a q question
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this f a q question.
	 *
	 * @return the user ID of this f a q question
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this f a q question.
	 *
	 * @param userId the user ID of this f a q question
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this f a q question.
	 *
	 * @return the user uuid of this f a q question
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this f a q question.
	 *
	 * @param userUuid the user uuid of this f a q question
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the category ID of this f a q question.
	 *
	 * @return the category ID of this f a q question
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this f a q question.
	 *
	 * @param categoryId the category ID of this f a q question
	 */
	public void setCategoryId(long categoryId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gov.hoabinh.model.FAQQuestion faqQuestion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.FAQQuestion> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.FAQQuestion toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.FAQQuestion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}