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

package vn.gov.hoabinh.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.service.base.AttachmentLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.AttachmentUtil;

/**
 * The implementation of the attachment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.AttachmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttachmentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.AttachmentLocalServiceUtil
 */
@ProviderType
public class AttachmentLocalServiceImpl extends AttachmentLocalServiceBaseImpl {

	public Attachment addAttachment(FileEntry entry, long companyId, long groupId, long entryId, Class entryClass,
			long folderId, String fileName, boolean isImage) throws PortalException, SystemException {
		long attachmentId = CounterLocalServiceUtil.increment(Attachment.class.getName());
		Attachment attachment = attachmentPersistence.create(attachmentId);
		attachment.setCompanyId(companyId);
		attachment.setGroupId(groupId);
		attachment.setEntryId(entryId);
		attachment.setEntryClass(entryClass.getName());
		attachment.setFileName(fileName);
		attachment.setFolderId(folderId);
		attachment.setExtension(fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()));
		attachment.setFileEntryId(entry.getFileEntryId());
		attachment.setImageId(isImage ? entryId : 0);
		attachmentPersistence.update(attachment);
		return attachment;
	}

	public Attachment addAttachment(Class entryClass, long entryId, long fileEntryId)
			throws PortalException, SystemException {
		return addAttachment(entryClass, entryId, fileEntryId, false);
	}

	public Attachment addAttachment(Class entryClass, long entryId, long fileEntryId, boolean isImage)
			throws PortalException, SystemException {
		long attachmentId = CounterLocalServiceUtil.increment(Attachment.class.getName());
		Attachment attachment = AttachmentUtil.create(attachmentId);

		attachment.setEntryId(entryId);
		attachment.setEntryClass(entryClass.getName());

		if (isImage) {
			attachment.setImageId(entryId);
		} else {
			attachment.setFileEntryId(fileEntryId);
		}
		attachmentPersistence.update(attachment);
		return attachment;
	}

	public Attachment getAttachment(Class entryClass, long folderId, String fileName)
			throws PortalException, SystemException {
		Attachment attachment = attachmentPersistence.findByC_F_N(entryClass.getName(), folderId, fileName);
		return attachment;
	}

	/*public Attachment getAttachment(long entryId, Class entryClass) throws PortalException, SystemException {
		Attachment attachment = attachmentPersistence.findByE_E(entryId, entryClass.getName());
		return attachment;
	}*/
	
	public Attachment getAttachment(Class entryClass, long entryId, long imageId) throws PortalException, SystemException {
		Attachment attachment = attachmentPersistence.findByC_E_I(entryClass.getName(), entryId, imageId);
		return attachment;
	}
	
	public Attachment getAttachment(Class entryClass, long entryId) throws PortalException, SystemException {
		Attachment attachment = attachmentPersistence.findByC_E(entryClass.getName(), entryId);
		return attachment;
	}

	public void deleteAttachment(Class entryClass, long entryId, long fileEntryId, boolean deleteImage, boolean deleteAll)
			throws PortalException, SystemException {
		try {
			long attachId = 0;
			if (deleteAll) {
				List<Attachment> attachments = attachmentPersistence.findByEntry(entryId, entryClass.getName());
				for (int i = 0; i < attachments.size(); i++) {
					Attachment attachment = (Attachment) attachments.get(i);
					attachId = attachment.getAttachmentId();
					try {
						DLFileEntryLocalServiceUtil.deleteFileEntry(attachment.getFileEntryId());
						attachmentPersistence.remove(attachId);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				deleteAttachments(entryClass, entryId);
			} else {
				Attachment attachment = null;
				if (deleteImage) {
					attachment = attachmentPersistence.findByC_E_I(entryClass.getName(), entryId, entryId);
					fileEntryId =  attachment.getFileEntryId();
				} else {
					attachment = getAttachmentByC_E_F(entryClass, entryId, fileEntryId);
				} 
				
				if (Validator.isNotNull(attachment)) {
					attachId = attachment.getAttachmentId();
					DLFileEntryLocalServiceUtil.deleteFileEntry(fileEntryId);
					attachmentPersistence.remove(attachId);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAttachments(Class entryClass, long entryId) throws PortalException, SystemException {
		if (entryClass == null) {
			return;
		}

		List<Attachment> attachments = attachmentPersistence.findByEntry(entryId, entryClass.getName());
		if (attachments == null) {
			return;
		}

		for (int i = 0; i < attachments.size(); i++) {
			Attachment attachment = (Attachment) attachments.get(i);
			try {
				DLFileEntryLocalServiceUtil.deleteFileEntry(attachment.getFileEntryId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			deleteAttachment(attachment.getAttachmentId());
		}
	}

	public Attachment getAttachment(long attachmentId) throws PortalException, SystemException {
		return attachmentPersistence.findByPrimaryKey(attachmentId);
	}

	public Attachment getAttachmentByC_E_F(Class entryClass, long entryId, long fileEntryId)
			throws PortalException, SystemException {
		return attachmentPersistence.findByC_E_F(entryClass.getName(), entryId, fileEntryId);
	}

	public List<Attachment> getAttachments(long entryId, Class entryClass) throws PortalException, SystemException {
		if (entryClass == null) {
			return new ArrayList();
		}
		return attachmentPersistence.findByEntry(entryId, entryClass.getName());
	}

	public List<Attachment> getAttachmentByE_E_I(long entryId, Class entryClass, long imageId)
			throws PortalException, SystemException {
		return attachmentPersistence.findByE_E_I(entryId, entryClass.getName(), imageId);
	}

	public void deleteFileEntry(Class entryClass, long fileEntryId, long folderId)
			throws PortalException, SystemException {
		attachmentPersistence.removeByC_F_F(entryClass.getName(), fileEntryId, folderId);
	}

	public void deleteByC_E_F(Class entryClass, long entryId, long fileEntryId)
			throws PortalException, SystemException {
		attachmentPersistence.removeByC_E_F(entryClass.getName(), entryId, fileEntryId);
	}
}