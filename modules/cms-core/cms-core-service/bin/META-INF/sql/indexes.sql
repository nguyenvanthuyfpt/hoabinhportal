create index IX_4BF1A84 on AdvItem (groupId, status);
create index IX_9DCA0FAD on AdvItem (groupId, typeId, status);
create index IX_78DD58B5 on AdvItem (typeId);

create index IX_7483F717 on AdvType (groupId);

create index IX_FA9C39A7 on Attachment (entryClass[$COLUMN_LENGTH:75$], entryId, fileEntryId);
create index IX_CF9C9A2C on Attachment (entryClass[$COLUMN_LENGTH:75$], entryId, imageId);
create index IX_F436FE5B on Attachment (entryClass[$COLUMN_LENGTH:75$], fileEntryId, folderId);
create index IX_8C77225B on Attachment (entryClass[$COLUMN_LENGTH:75$], folderId, fileName[$COLUMN_LENGTH:75$]);
create index IX_25178B38 on Attachment (entryId, entryClass[$COLUMN_LENGTH:75$], imageId);

create index IX_84A050CF on Clip (clipTypeId[$COLUMN_LENGTH:75$]);
create index IX_D3BEE589 on Clip (groupId, language[$COLUMN_LENGTH:75$], active_);
create index IX_646A6C19 on Clip (groupId, language[$COLUMN_LENGTH:75$], clipTypeId[$COLUMN_LENGTH:75$]);

create index IX_8A4ED763 on ClipType (groupId, language[$COLUMN_LENGTH:75$], active_);
create index IX_11FC09C4 on ClipType (id_[$COLUMN_LENGTH:75$]);
create index IX_FF81562D on ClipType (language[$COLUMN_LENGTH:75$], active_);

create index IX_C0110085 on FAQAnswer (approved);
create index IX_82A588E6 on FAQAnswer (language[$COLUMN_LENGTH:75$]);
create index IX_76A3C8FA on FAQAnswer (questionid, approved);

create index IX_1A6252FA on FAQCategory (groupId, language[$COLUMN_LENGTH:75$], parent);
create index IX_AADB2B3A on FAQCategory (id_);
create index IX_13335878 on FAQCategory (parent);

create index IX_C911624D on FAQCategoryQuestion (categoryId);
create index IX_A5672D35 on FAQCategoryQuestion (questionId);

create index IX_BF4A535C on FAQComment (answerid);
create index IX_B8F7853A on FAQComment (approved);

create index IX_B5871F13 on FAQQuestion (groupId, approved);
create index IX_9074965F on FAQQuestion (groupId, language[$COLUMN_LENGTH:75$], approved);
create index IX_6E47848 on FAQQuestion (groupId, language[$COLUMN_LENGTH:75$], categoryId, approved, id_);
create index IX_157D15C on FAQQuestion (groupId, questionType[$COLUMN_LENGTH:75$]);

create index IX_9E3197FF on LinkGroup (groupId);
create index IX_F66F5FC5 on LinkGroup (linkgroupId);

create index IX_62178E65 on Links (groupId, linkgroupId);
create index IX_AAE91831 on Links (linkgroupId);

create index IX_CE570F60 on VContact (groupId, status);
create index IX_BBEFCF16 on VContact (status);

create index IX_3C72EC06 on VLegalAttachedMessage (articleId[$COLUMN_LENGTH:75$], readMessage);
create index IX_FD87179D on VLegalAttachedMessage (groupId, readMessage);

create index IX_B8ED99DD on VLegalDDRel (departmentId);
create index IX_102FAEC7 on VLegalDDRel (docId[$COLUMN_LENGTH:75$]);

create index IX_ED35BBC9 on VLegalDFRel (docId[$COLUMN_LENGTH:75$]);
create index IX_D58CFD8B on VLegalDFRel (fieldId[$COLUMN_LENGTH:75$]);

create index IX_9DD1056 on VLegalDSRel (docId[$COLUMN_LENGTH:75$]);
create index IX_1955D36F on VLegalDSRel (sigId[$COLUMN_LENGTH:75$]);

create index IX_1AACD62C on VLegalDURel (departmentId);
create index IX_B4BC0BC5 on VLegalDURel (userid);

create index IX_E478BA36 on VLegalDocument (groupId, createdByUser, language[$COLUMN_LENGTH:75$], statusDoc);
create index IX_71A4DCFD on VLegalDocument (groupId, docId[$COLUMN_LENGTH:75$]);
create index IX_F704EB40 on VLegalDocument (groupId, language[$COLUMN_LENGTH:75$], fieldId[$COLUMN_LENGTH:75$], statusDoc, docId[$COLUMN_LENGTH:75$]);
create index IX_590ED0AA on VLegalDocument (groupId, language[$COLUMN_LENGTH:75$], orgId[$COLUMN_LENGTH:75$], statusDoc, docId[$COLUMN_LENGTH:75$]);
create index IX_B8A7E764 on VLegalDocument (groupId, language[$COLUMN_LENGTH:75$], statusDoc);
create index IX_E97FAFE4 on VLegalDocument (groupId, language[$COLUMN_LENGTH:75$], typeDocId[$COLUMN_LENGTH:75$], statusDoc, docId[$COLUMN_LENGTH:75$]);
create index IX_A26BD8EA on VLegalDocument (groupId, language[$COLUMN_LENGTH:75$], userId, statusDoc);
create index IX_A142D85C on VLegalDocument (groupId, num[$COLUMN_LENGTH:75$], symbol[$COLUMN_LENGTH:75$]);
create index IX_7B826FCA on VLegalDocument (groupId, orgId[$COLUMN_LENGTH:75$], typeDocId[$COLUMN_LENGTH:75$], language[$COLUMN_LENGTH:75$], statusDoc);
create index IX_D6CA4911 on VLegalDocument (groupId, typeDocId[$COLUMN_LENGTH:75$], orgId[$COLUMN_LENGTH:75$], fieldId[$COLUMN_LENGTH:75$], language[$COLUMN_LENGTH:75$], statusDoc);
create index IX_772E8512 on VLegalDocument (statusDoc);
create index IX_E4A1AFD1 on VLegalDocument (typeDocId[$COLUMN_LENGTH:75$], language[$COLUMN_LENGTH:75$]);

create index IX_1DA85BF6 on VLegalDraftDocument (docCode[$COLUMN_LENGTH:75$]);
create index IX_92A02BC1 on VLegalDraftDocument (groupId, draftId[$COLUMN_LENGTH:75$]);
create index IX_6ED4537B on VLegalDraftDocument (groupId, language[$COLUMN_LENGTH:75$], fieldId[$COLUMN_LENGTH:75$], statusDraft, draftId[$COLUMN_LENGTH:75$]);
create index IX_547D0A8 on VLegalDraftDocument (groupId, language[$COLUMN_LENGTH:75$], statusDraft);
create index IX_51A938D on VLegalDraftDocument (groupId, language[$COLUMN_LENGTH:75$], typeId[$COLUMN_LENGTH:75$], statusDraft, draftId[$COLUMN_LENGTH:75$]);
create index IX_D233D292 on VLegalDraftDocument (groupId, statusDraft, createdByUser, language[$COLUMN_LENGTH:75$]);
create index IX_F1B4AC01 on VLegalDraftDocument (groupId, statusDraft, docCode[$COLUMN_LENGTH:75$]);
create index IX_5A125871 on VLegalDraftDocument (groupId, statusDraft, fieldId[$COLUMN_LENGTH:75$]);
create index IX_BC902300 on VLegalDraftDocument (groupId, statusDraft, language[$COLUMN_LENGTH:75$]);
create index IX_8DD1B3DD on VLegalDraftDocument (groupId, statusDraft, typeId[$COLUMN_LENGTH:75$]);

create index IX_C1677592 on VLegalFORel (fieldId[$COLUMN_LENGTH:75$]);
create index IX_5EC7FD3C on VLegalFORel (orgId[$COLUMN_LENGTH:75$]);

create index IX_82B088D7 on VLegalFTRel (fieldId[$COLUMN_LENGTH:75$]);
create index IX_6E18DEB7 on VLegalFTRel (typeId[$COLUMN_LENGTH:75$]);

create index IX_9772F3B8 on VLegalField (groupId, fieldId[$COLUMN_LENGTH:75$]);
create index IX_A98B577 on VLegalField (groupId, statusField, language[$COLUMN_LENGTH:75$]);
create index IX_DDC8BC51 on VLegalField (groupId, statusField, rssable);

create index IX_1284667D on VLegalLogger (groupId, createdByUser, createdDate);
create index IX_1C786C10 on VLegalLogger (groupId, loggerId[$COLUMN_LENGTH:75$]);

create index IX_CEF13BA on VLegalOrg (groupId, language[$COLUMN_LENGTH:75$], parentId[$COLUMN_LENGTH:75$], statusOrg);
create index IX_5262EF8C on VLegalOrg (groupId, orgId[$COLUMN_LENGTH:75$]);
create index IX_B3E8794B on VLegalOrg (groupId, statusOrg, language[$COLUMN_LENGTH:75$]);
create index IX_4472DFD on VLegalOrg (groupId, statusOrg, rssable);

create index IX_C7B4B773 on VLegalSigner (groupId, language[$COLUMN_LENGTH:75$], statusSigner);
create index IX_C3CAB525 on VLegalSigner (groupId, sigId[$COLUMN_LENGTH:75$]);

create index IX_99478CFF on VLegalSuggestDocument (approved, draftId[$COLUMN_LENGTH:75$]);
create index IX_6B60FA0A on VLegalSuggestDocument (draftId[$COLUMN_LENGTH:75$]);
create index IX_1323C5D3 on VLegalSuggestDocument (groupId, approved);
create index IX_189C1C8D on VLegalSuggestDocument (groupId, language[$COLUMN_LENGTH:75$], approved, draftId[$COLUMN_LENGTH:75$]);
create index IX_2FEA4408 on VLegalSuggestDocument (groupId, sugId[$COLUMN_LENGTH:75$]);

create index IX_2E0C48B7 on VLegalTDRel (docId[$COLUMN_LENGTH:75$]);
create index IX_64C48219 on VLegalTDRel (tagId[$COLUMN_LENGTH:75$]);

create index IX_BC7DC247 on VLegalTags (groupId, statusTags);

create index IX_75950C73 on VLegalType (groupId, statusType, language[$COLUMN_LENGTH:75$]);
create index IX_8EA795D5 on VLegalType (groupId, statusType, rssable);
create index IX_899506D0 on VLegalType (groupId, typeId[$COLUMN_LENGTH:75$]);

create index IX_EA5DCD4B on VcmsArticle (groupId, createdByUser[$COLUMN_LENGTH:75$], language[$COLUMN_LENGTH:75$], status);
create index IX_472B6941 on VcmsArticle (groupId, language[$COLUMN_LENGTH:75$], status, categoryId[$COLUMN_LENGTH:75$], articleId[$COLUMN_LENGTH:75$]);
create index IX_ED9A3727 on VcmsArticle (groupId, language[$COLUMN_LENGTH:75$], status, createdByUser[$COLUMN_LENGTH:75$]);
create index IX_1EB6824F on VcmsArticle (groupId, language[$COLUMN_LENGTH:75$], status, discussible);
create index IX_46F64490 on VcmsArticle (groupId, language[$COLUMN_LENGTH:75$], status, sticky);
create index IX_33D7812F on VcmsArticle (status);

create index IX_580AFE06 on VcmsArticleRating (articleId, sessionId[$COLUMN_LENGTH:75$]);

create index IX_5360C0CE on VcmsArticleStatus (active_);
create index IX_6DC0A4A6 on VcmsArticleStatus (articleId[$COLUMN_LENGTH:75$]);
create index IX_FE2B9FEA on VcmsArticleStatus (createdByUser[$COLUMN_LENGTH:75$], active_);

create index IX_FDB3859E on VcmsArticleType (articleId[$COLUMN_LENGTH:75$]);
create index IX_BB5908D5 on VcmsArticleType (typeId, articleId[$COLUMN_LENGTH:75$]);

create index IX_91BB47A6 on VcmsArticleVersion (articleId[$COLUMN_LENGTH:75$]);

create index IX_8DA4A0D6 on VcmsAttachedMessage (articleId[$COLUMN_LENGTH:75$], readMessage);
create index IX_9A3FC06D on VcmsAttachedMessage (groupId, readMessage);
create index IX_ADCC096B on VcmsAttachedMessage (readMessage);

create index IX_FD995FCE on VcmsCARelation (articleId[$COLUMN_LENGTH:75$]);
create index IX_E7B3ACE0 on VcmsCARelation (categoryId[$COLUMN_LENGTH:75$]);

create index IX_B393A5F4 on VcmsCURelation (categoryId[$COLUMN_LENGTH:75$]);
create index IX_523532C1 on VcmsCURelation (userId[$COLUMN_LENGTH:75$]);

create index IX_8BC2744 on VcmsCategory (categoryId[$COLUMN_LENGTH:75$]);
create index IX_8BBE54FA on VcmsCategory (groupId, language[$COLUMN_LENGTH:75$], parentId[$COLUMN_LENGTH:75$], portionId[$COLUMN_LENGTH:75$]);
create index IX_239878F3 on VcmsCategory (groupId, language[$COLUMN_LENGTH:75$], portionId[$COLUMN_LENGTH:75$]);

create index IX_75CDD2AB on VcmsDiscussion (articleId[$COLUMN_LENGTH:75$], approved);
create index IX_B32BDA21 on VcmsDiscussion (articleId[$COLUMN_LENGTH:75$], groupId, language[$COLUMN_LENGTH:75$], approved);
create index IX_4C2E8DC0 on VcmsDiscussion (groupId, language[$COLUMN_LENGTH:75$], approved);

create index IX_333A73D5 on VcmsLogger (createdByUser[$COLUMN_LENGTH:75$], createdDate);
create index IX_59787362 on VcmsLogger (entryId[$COLUMN_LENGTH:75$], classEntry[$COLUMN_LENGTH:75$]);

create index IX_C21E281B on VcmsPARelation (articleId[$COLUMN_LENGTH:75$]);
create index IX_2FCF1E8C on VcmsPARelation (portionId[$COLUMN_LENGTH:75$]);

create index IX_9C480852 on VcmsPortion (groupId, code_[$COLUMN_LENGTH:75$]);
create index IX_9D31F81A on VcmsPortion (groupId, language[$COLUMN_LENGTH:75$], categorizable);

create index IX_BACA41DE on VcmsStatus (active_);
create index IX_62B01DEC on VcmsStatus (companyId, active_);
create index IX_18B3FA1C on VcmsStatus (companyId, groupId, active_);
create index IX_50C257EE on VcmsStatus (companyId, groupId, isPrimary, active_);
create index IX_8E5C014B on VcmsStatus (companyId, isPrimary);
create index IX_5A7F429C on VcmsStatus (groupId, position);

create index IX_EAE48D1F on VcmsTARelation (articleId[$COLUMN_LENGTH:75$]);
create index IX_F92945BB on VcmsTARelation (threadId[$COLUMN_LENGTH:75$]);

create index IX_76326DF3 on VcmsThread (groupId, language[$COLUMN_LENGTH:75$]);

create index IX_C4B97BEB on VcmsType (groupId, code_[$COLUMN_LENGTH:75$]);
create index IX_291FDA03 on VcmsType (groupId, language[$COLUMN_LENGTH:75$]);

create index IX_7C3F8DD2 on VisitorTracker (companyId, groupId);

create index IX_B9D3BD11 on vdocDORel (docId[$COLUMN_LENGTH:75$]);
create index IX_50F30BD on vdocDORel (orgId[$COLUMN_LENGTH:75$]);

create index IX_D70312A4 on vdocDocument (groupId, language[$COLUMN_LENGTH:75$], fieldId[$COLUMN_LENGTH:75$], statusDoc);
create index IX_73B15EC on vdocDocument (groupId, language[$COLUMN_LENGTH:75$], statusDoc, fieldId[$COLUMN_LENGTH:75$], typeDoc);
create index IX_1D222B52 on vdocDocument (groupId, language[$COLUMN_LENGTH:75$], statusDoc, hasService);
create index IX_44E3ED4B on vdocDocument (groupId, language[$COLUMN_LENGTH:75$], statusDoc, typeDoc);
create index IX_18BE5AE0 on vdocDocument (position);
create index IX_D0A17973 on vdocDocument (statusDoc);

create index IX_D6CC7F1 on vdocField (groupId, language[$COLUMN_LENGTH:75$], parentId[$COLUMN_LENGTH:75$]);
create index IX_21F0DE77 on vdocField (parentId[$COLUMN_LENGTH:75$]);

create index IX_FBE2BAD2 on vdocFieldLevelRel (fieldId[$COLUMN_LENGTH:75$]);
create index IX_4DC1605C on vdocFieldLevelRel (levelId[$COLUMN_LENGTH:75$]);

create index IX_D052708E on vdocLevel (groupId, language[$COLUMN_LENGTH:75$]);

create index IX_C1CD3C08 on vdocLogger (groupId, entryId[$COLUMN_LENGTH:75$], className[$COLUMN_LENGTH:75$]);

create index IX_2BCEF420 on vdocOrg (groupId, code_[$COLUMN_LENGTH:75$]);
create index IX_9E191D47 on vdocOrg (groupId, language[$COLUMN_LENGTH:75$], parentId[$COLUMN_LENGTH:75$]);
create index IX_3C1C8CE1 on vdocOrg (parentId[$COLUMN_LENGTH:75$]);