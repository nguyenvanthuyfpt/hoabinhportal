create table AdvItem (
	itemId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	expriedDate DATE null,
	groupId LONG,
	companyId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	url VARCHAR(75) null,
	isTargetBlank BOOLEAN,
	txtMouseOver VARCHAR(75) null,
	folderId LONG,
	status BOOLEAN,
	typeId LONG
);

create table AdvType (
	typeId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	groupId LONG,
	companyId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table Attachment (
	attachmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	entryId LONG,
	entryClass VARCHAR(75) null,
	fileEntryId LONG,
	folderId LONG,
	fileName VARCHAR(75) null,
	imageId LONG,
	extension VARCHAR(75) null
);

create table Clip (
	id_ VARCHAR(75) not null primary key,
	clipTypeId VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	url VARCHAR(75) null,
	name VARCHAR(75) null,
	title VARCHAR(75) null,
	image VARCHAR(75) null,
	description VARCHAR(75) null,
	active_ BOOLEAN,
	language VARCHAR(75) null,
	hitcount INTEGER,
	hitcountview INTEGER
);

create table ClipType (
	id_ VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	active_ BOOLEAN,
	language VARCHAR(75) null
);

create table DataConvert (
	id_ LONG not null primary key,
	folderId LONG,
	dataId VARCHAR(75) null,
	groupId LONG,
	fileEntryId LONG,
	createdDate DATE null,
	fileName VARCHAR(75) null,
	url VARCHAR(75) null
);

create table FAQAnswer (
	id_ LONG not null primary key,
	questionid LONG,
	content VARCHAR(75) null,
	answerOrder INTEGER,
	answeredByUser VARCHAR(75) null,
	answeredDate DATE null,
	modifiedByUser VARCHAR(75) null,
	language VARCHAR(75) null,
	modifiedDate DATE null,
	approved BOOLEAN,
	approvedByUser VARCHAR(75) null,
	approvedDate DATE null,
	userId LONG,
	attachName VARCHAR(75) null,
	folderId LONG
);

create table FAQCategory (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	language VARCHAR(75) null,
	parent LONG,
	catorder INTEGER,
	catlevel INTEGER,
	image VARCHAR(75) null,
	createdByUser VARCHAR(75) null,
	createdDate DATE null,
	modifiedByUser VARCHAR(75) null,
	modifiedDate DATE null,
	groupId LONG,
	userId LONG
);

create table FAQCategoryQuestion (
	id_ LONG not null primary key,
	questionId LONG,
	categoryId LONG
);

create table FAQComment (
	id_ LONG not null primary key,
	answerid LONG,
	content VARCHAR(75) null,
	commName VARCHAR(75) null,
	commEmail VARCHAR(75) null,
	approved BOOLEAN,
	approveByUser VARCHAR(75) null,
	approvedDate DATE null,
	commDate DATE null,
	userId LONG
);

create table FAQQuestion (
	id_ LONG not null primary key,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	language VARCHAR(75) null,
	questionOrder INTEGER,
	sentDate DATE null,
	sentByUser VARCHAR(75) null,
	senderEmail VARCHAR(75) null,
	questionType VARCHAR(75) null,
	modifiedByUser VARCHAR(75) null,
	modifiedDate DATE null,
	hitCount INTEGER,
	approved BOOLEAN,
	groupId LONG,
	userId LONG,
	categoryId LONG
);

create table LinkGroup (
	linkgroupId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	position INTEGER
);

create table Links (
	linkId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	linkgroupId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	url VARCHAR(75) null,
	position INTEGER,
	image VARCHAR(75) null
);

create table VContact (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	guestName VARCHAR(75) null,
	email VARCHAR(75) null,
	title VARCHAR(75) null,
	address VARCHAR(75) null,
	phone VARCHAR(75) null,
	fax VARCHAR(75) null,
	content VARCHAR(75) null,
	hasAttach BOOLEAN,
	status INTEGER
);

create table VLegalAttachedMessage (
	messageId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	createdByUser LONG,
	articleId VARCHAR(75) null,
	content VARCHAR(75) null,
	readMessage BOOLEAN
);

create table VLegalDDRel (
	departmentId LONG not null,
	docId VARCHAR(75) not null,
	primary key (departmentId, docId)
);

create table VLegalDFRel (
	fieldId VARCHAR(75) not null,
	docId VARCHAR(75) not null,
	primary key (fieldId, docId)
);

create table VLegalDSRel (
	sigId VARCHAR(75) not null,
	docId VARCHAR(75) not null,
	primary key (sigId, docId)
);

create table VLegalDURel (
	departmentId LONG not null,
	userid LONG not null,
	primary key (departmentId, userid)
);

create table VLegalDocument (
	docId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdByUser LONG,
	createdDate DATE null,
	modifiedByUser LONG,
	modifiedDate DATE null,
	approvedByUser LONG,
	approvedDate DATE null,
	forwardedByUser LONG,
	forwardedDate DATE null,
	publishedByUser LONG,
	publishedDate DATE null,
	symbol VARCHAR(75) null,
	num VARCHAR(75) null,
	promulDate DATE null,
	effectivedDate DATE null,
	expiredDate DATE null,
	replaceDoc VARCHAR(75) null,
	summary VARCHAR(75) null,
	content VARCHAR(75) null,
	language VARCHAR(75) null,
	userHit INTEGER,
	statusDoc INTEGER,
	hasAttachment BOOLEAN,
	typeDocId VARCHAR(75) null,
	fieldId VARCHAR(75) null,
	orgId VARCHAR(75) null,
	orgRels VARCHAR(75) null,
	signerRels VARCHAR(75) null,
	fieldRels VARCHAR(75) null,
	numRels VARCHAR(75) null,
	docCode VARCHAR(75) null,
	departmentRels VARCHAR(75) null
);

create table VLegalDraftDocument (
	draftId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdByUser LONG,
	createdDate DATE null,
	modifiedByUser LONG,
	modifiedDate DATE null,
	approvedByUser LONG,
	approvedDate DATE null,
	publishedByUser LONG,
	publishedDate DATE null,
	title VARCHAR(75) null,
	expiredDate DATE null,
	language VARCHAR(75) null,
	content VARCHAR(75) null,
	typeId VARCHAR(75) null,
	fieldId VARCHAR(75) null,
	hasAttachment BOOLEAN,
	draftLevel INTEGER,
	docCode VARCHAR(75) null,
	statusDraft INTEGER
);

create table VLegalFORel (
	fieldId VARCHAR(75) not null,
	orgId VARCHAR(75) not null,
	primary key (fieldId, orgId)
);

create table VLegalFTRel (
	fieldId VARCHAR(75) not null,
	typeId VARCHAR(75) not null,
	primary key (fieldId, typeId)
);

create table VLegalField (
	fieldId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	createdByUser LONG,
	modifiedByUser LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	language VARCHAR(75) null,
	statusField BOOLEAN,
	rssable BOOLEAN
);

create table VLegalLogger (
	loggerId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	createdByUser LONG,
	content VARCHAR(75) null
);

create table VLegalOrg (
	orgId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	createdByUser LONG,
	modifiedByUser LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	parentId VARCHAR(75) null,
	language VARCHAR(75) null,
	statusOrg BOOLEAN,
	rssable BOOLEAN,
	position INTEGER
);

create table VLegalSigner (
	sigId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	createdByUser LONG,
	modifiedByUser LONG,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	language VARCHAR(75) null,
	statusSigner BOOLEAN
);

create table VLegalSuggestDocument (
	sugId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	modifiedByUser LONG,
	approved BOOLEAN,
	approvedByUser LONG,
	approvedDate DATE null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	language VARCHAR(75) null,
	visitorName VARCHAR(75) null,
	visitorEmail VARCHAR(75) null,
	visitorTel VARCHAR(75) null,
	visitorAddress VARCHAR(75) null,
	draftId VARCHAR(75) null,
	hasAttachment BOOLEAN
);

create table VLegalTDRel (
	docId VARCHAR(75) not null,
	tagId VARCHAR(75) not null,
	primary key (docId, tagId)
);

create table VLegalTags (
	tagId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	statusTags BOOLEAN
);

create table VLegalType (
	typeId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	createdByUser LONG,
	modifiedByUser LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	language VARCHAR(75) null,
	statusType BOOLEAN,
	rssable BOOLEAN,
	position INTEGER
);

create table VcmsArticle (
	articleId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	createdByUser VARCHAR(75) null,
	createdDate DATE null,
	modifiedByUser VARCHAR(75) null,
	modifiedDate DATE null,
	approvedByUser VARCHAR(75) null,
	approvedDate DATE null,
	publishedByUser VARCHAR(75) null,
	publishedDate DATE null,
	status LONG,
	title VARCHAR(75) null,
	lead VARCHAR(75) null,
	content VARCHAR(75) null,
	version DOUBLE,
	hasImage BOOLEAN,
	imageTitle VARCHAR(75) null,
	image VARCHAR(75) null,
	author VARCHAR(75) null,
	source VARCHAR(75) null,
	language VARCHAR(75) null,
	userHit INTEGER,
	discussible BOOLEAN,
	hasAttachment BOOLEAN,
	hasPoll BOOLEAN,
	pollId VARCHAR(75) null,
	effectiveDate DATE null,
	expireDate DATE null,
	sticky BOOLEAN,
	stickyNeverExpired BOOLEAN,
	stickyExpireDate DATE null,
	categoryId VARCHAR(75) null,
	soundLink VARCHAR(75) null
);

create table VcmsArticleRating (
	Id LONG not null primary key,
	createdDate DATE null,
	articleId LONG,
	rating INTEGER,
	sessionId VARCHAR(75) null
);

create table VcmsArticleStatus (
	statusId LONG not null,
	articleId VARCHAR(75) not null,
	categoryId VARCHAR(75) not null,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	active_ BOOLEAN,
	articleVersionId LONG,
	primary key (statusId, articleId, categoryId)
);

create table VcmsArticleType (
	typeId LONG not null,
	articleId VARCHAR(75) not null,
	position INTEGER,
	primary key (typeId, articleId)
);

create table VcmsArticleVersion (
	articleVersionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	articleId VARCHAR(75) null,
	createdByUser VARCHAR(75) null,
	createdDate DATE null,
	typeIds VARCHAR(75) null,
	status LONG,
	versionName VARCHAR(75) null,
	title VARCHAR(75) null,
	lead VARCHAR(75) null,
	content VARCHAR(75) null,
	hasImage BOOLEAN,
	imageTitle VARCHAR(75) null,
	image VARCHAR(75) null,
	language VARCHAR(75) null,
	userHit INTEGER,
	author VARCHAR(75) null,
	source VARCHAR(75) null,
	discussible BOOLEAN,
	hasAttachment BOOLEAN,
	hasPoll BOOLEAN,
	pollId VARCHAR(75) null,
	publishedByUser VARCHAR(75) null,
	modifiedByUser VARCHAR(75) null,
	modifiedDate DATE null,
	publishedDate DATE null,
	effectiveDate DATE null,
	expireDate DATE null,
	stickyExpireDate DATE null,
	sticky BOOLEAN,
	stickyNeverExpired BOOLEAN
);

create table VcmsAttachedMessage (
	messageId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	articleId VARCHAR(75) null,
	content VARCHAR(75) null,
	readMessage BOOLEAN
);

create table VcmsCARelation (
	categoryId VARCHAR(75) not null,
	articleId VARCHAR(75) not null,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	status LONG,
	primary key (categoryId, articleId)
);

create table VcmsCURelation (
	categoryId VARCHAR(75) not null,
	userId VARCHAR(75) not null,
	primary key (categoryId, userId)
);

create table VcmsCategory (
	categoryId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedByUser VARCHAR(75) null,
	portionId VARCHAR(75) null,
	parentId VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	anchored BOOLEAN,
	href VARCHAR(75) null,
	language VARCHAR(75) null,
	hasImage BOOLEAN,
	image VARCHAR(75) null,
	position INTEGER,
	userHit INTEGER,
	rssable BOOLEAN
);

create table VcmsDiscussion (
	discussionId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	visitorName VARCHAR(75) null,
	visitorEmail VARCHAR(75) null,
	visitorPhone VARCHAR(75) null,
	postedDate DATE null,
	approved BOOLEAN,
	approvedByUser VARCHAR(75) null,
	approvedDate DATE null,
	articleId VARCHAR(75) null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	language VARCHAR(75) null,
	hasAttachment BOOLEAN
);

create table VcmsLogger (
	loggerId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	entryId VARCHAR(75) null,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	classEntry VARCHAR(75) null,
	content VARCHAR(75) null
);

create table VcmsPARelation (
	portionId VARCHAR(75) not null,
	articleId VARCHAR(75) not null,
	primary key (portionId, articleId)
);

create table VcmsPortion (
	portionId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedByUser VARCHAR(75) null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	categorizable BOOLEAN,
	language VARCHAR(75) null
);

create table VcmsStatus (
	statusId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedByUser VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	cssClass VARCHAR(75) null,
	textColor VARCHAR(75) null,
	position INTEGER,
	isPrimary BOOLEAN,
	active_ BOOLEAN
);

create table VcmsTARelation (
	threadId VARCHAR(75) not null,
	articleId VARCHAR(75) not null,
	primary key (threadId, articleId)
);

create table VcmsThread (
	threadId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedByUser VARCHAR(75) null,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	hasImage BOOLEAN,
	image VARCHAR(75) null,
	language VARCHAR(75) null
);

create table VcmsType (
	typeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createdDate DATE null,
	createdByUser VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedByUser VARCHAR(75) null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	language VARCHAR(75) null
);

create table VisitorTracker (
	visitorId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	createdDate DATE null,
	expiredDate DATE null
);

create table vdocDORel (
	docId VARCHAR(75) not null,
	orgId VARCHAR(75) not null,
	primary key (docId, orgId)
);

create table vdocDocument (
	docId VARCHAR(75) not null primary key,
	groupId LONG,
	language VARCHAR(75) null,
	companyId LONG,
	userId LONG,
	createdByUser LONG,
	createdDate DATE null,
	modifiedByUser LONG,
	modifiedDate DATE null,
	approvedByUser LONG,
	approvedDate DATE null,
	publishedByUser LONG,
	publishedDate DATE null,
	promulDate DATE null,
	effectivedDate DATE null,
	expiredDate DATE null,
	replaceDoc VARCHAR(75) null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	process VARCHAR(75) null,
	base VARCHAR(75) null,
	timeProcess VARCHAR(75) null,
	cost VARCHAR(75) null,
	requireDoc VARCHAR(75) null,
	result VARCHAR(75) null,
	objects VARCHAR(75) null,
	style VARCHAR(75) null,
	position INTEGER,
	note VARCHAR(75) null,
	executeOrg VARCHAR(75) null,
	userHit INTEGER,
	statusDoc INTEGER,
	typeDoc INTEGER,
	hasService BOOLEAN,
	hasAttachment BOOLEAN,
	fieldId VARCHAR(75) null,
	orgRels VARCHAR(75) null,
	fieldRels VARCHAR(75) null,
	levels VARCHAR(75) null
);

create table vdocField (
	fieldId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	createdByUser LONG,
	modifiedByUser LONG,
	parentId VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	language VARCHAR(75) null,
	statusField BOOLEAN,
	position INTEGER,
	listparent VARCHAR(75) null,
	levels VARCHAR(75) null
);

create table vdocFieldLevelRel (
	fieldId VARCHAR(75) not null,
	levelId VARCHAR(75) not null,
	primary key (fieldId, levelId)
);

create table vdocLevel (
	levelId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	language VARCHAR(75) null,
	position INTEGER
);

create table vdocLogger (
	loggerId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	createdByUser LONG,
	entryId VARCHAR(75) null,
	className VARCHAR(75) null,
	content VARCHAR(75) null
);

create table vdocOrg (
	orgId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createdDate DATE null,
	modifiedDate DATE null,
	createdByUser LONG,
	modifiedByUser LONG,
	parentId VARCHAR(75) null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	address VARCHAR(75) null,
	phone VARCHAR(75) null,
	fax VARCHAR(75) null,
	language VARCHAR(75) null,
	statusOrg BOOLEAN,
	position INTEGER,
	listparent VARCHAR(75) null
);