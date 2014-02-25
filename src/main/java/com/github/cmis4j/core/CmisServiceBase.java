/*
The MIT License (MIT)

Copyright (c) 2013, 2014 by ggbusto@gmx.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.github.cmis4j.core;

import java.math.BigInteger;
import java.util.List;

import javax.xml.ws.Holder;

import org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisAllowableActionsType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisBulkUpdateType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectIdAndChangeTokenType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisRenditionType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisRepositoryInfoType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisTypeDefinitionType;
import org.oasis_open.docs.ns.cmis.core._200908.EnumACLPropagation;
import org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships;
import org.oasis_open.docs.ns.cmis.core._200908.EnumRelationshipDirection;
import org.oasis_open.docs.ns.cmis.core._200908.EnumUnfileObject;
import org.oasis_open.docs.ns.cmis.core._200908.EnumVersioningState;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisACLType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisContentStreamType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisFaultType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderContainerType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectParentsType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisRepositoryEntryType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeContainer;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeDefinitionListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.DeleteTreeResponse.FailedToDelete;
import org.oasis_open.docs.ns.cmis.messaging._200908.EnumServiceException;
import org.oasis_open.docs.ns.cmis.messaging._200908.Query;
import org.oasis_open.docs.ns.cmis.messaging._200908.QueryResponse;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;

public abstract class CmisServiceBase {

	public void cmisException(String message, int code,
			EnumServiceException reason) throws CmisException {
		CmisFaultType cmisFault = new CmisFaultType();
		cmisFault.setCode(BigInteger.valueOf(code));
		cmisFault.setMessage(message);
		cmisFault.setType(reason != null ? reason
				: EnumServiceException.RUNTIME);
		throw new CmisException(message, cmisFault);
	}

	public abstract List<CmisObjectType> getAllVersions(String user,
			String repositoryId, String objectId, String filter,
			Boolean includeAllowableActions, CmisExtensionType extension)
			throws CmisException;

	public abstract void checkOut(String user, String repositoryId,
			Holder<String> objectId, Holder<CmisExtensionType> extension,
			Holder<Boolean> contentCopied) throws CmisException;

	public abstract CmisObjectType getObjectOfLatestVersion(String user,
			String repositoryId, String objectId, Boolean major, String filter,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException;

	public abstract CmisPropertiesType getPropertiesOfLatestVersion(
			String user, String repositoryId, String objectId, Boolean major,
			String filter, CmisExtensionType extension) throws CmisException;

	public abstract void cancelCheckOut(String user, String repositoryId,
			String objectId, Holder<CmisExtensionType> extension)
			throws CmisException;

	public abstract void checkIn(String user, String repositoryId,
			Holder<String> objectId, Boolean major,
			CmisPropertiesType properties, CmisContentStreamType contentStream,
			String checkinComment, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract CmisTypeDefinitionListType getTypeChildren(String user,
			String repositoryId, String typeId,
			Boolean includePropertyDefinitions, BigInteger maxItems,
			BigInteger skipCount, CmisExtensionType extension)
			throws CmisException;

	public abstract CmisTypeDefinitionType getTypeDefinition(String user,
			String repositoryId, String typeId, CmisExtensionType extension)
			throws CmisException;

	public abstract void updateType(String user, String repositoryId,
			Holder<CmisTypeDefinitionType> type, CmisExtensionType extension)
			throws CmisException;

	public abstract CmisRepositoryInfoType getRepositoryInfo(String user,
			String repositoryId, CmisExtensionType extension)
			throws CmisException;

	public abstract void deleteType(String user, String repositoryId,
			String typeId, Holder<CmisExtensionType> extension)
			throws CmisException;

	public abstract List<CmisTypeContainer> getTypeDescendants(String user,
			String repositoryId, String typeId, BigInteger depth,
			Boolean includePropertyDefinitions, CmisExtensionType extension)
			throws CmisException;

	public abstract void createType(String user, String repositoryId,
			Holder<CmisTypeDefinitionType> type, CmisExtensionType extension)
			throws CmisException;

	public abstract List<CmisRepositoryEntryType> getRepositories(String user,
			CmisExtensionType extension) throws CmisException;

	public abstract CmisObjectListType getObjectRelationships(String user,
			String repositoryId, String objectId,
			Boolean includeSubRelationshipTypes,
			EnumRelationshipDirection relationshipDirection, String typeId,
			String filter, Boolean includeAllowableActions,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException;

	public abstract void removePolicy(String user, String repositoryId,
			String policyId, String objectId,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract void applyPolicy(String user, String repositoryId,
			String policyId, String objectId,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract List<CmisObjectType> getAppliedPolicies(String user,
			String repositoryId, String objectId, String filter,
			CmisExtensionType extension) throws CmisException;

	public abstract CmisPropertiesType getProperties(String user,
			String repositoryId, String objectId, String filter,
			CmisExtensionType extension) throws CmisException;

	public abstract void deleteObject(String user, String repositoryId,
			String objectId, Boolean allVersions,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract CmisObjectType getObject(String user, String repositoryId,
			String objectId, String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException;

	public abstract void createDocumentFromSource(String user,
			String repositoryId, String sourceId,
			CmisPropertiesType properties, String folderId,
			EnumVersioningState versioningState, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException;

	public abstract CmisAllowableActionsType getAllowableActions(String user,
			String repositoryId, String objectId, CmisExtensionType extension)
			throws CmisException;

	public abstract void createRelationship(String user, String repositoryId,
			CmisPropertiesType properties, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException;

	public abstract void deleteContentStream(String user, String repositoryId,
			Holder<String> objectId, Holder<String> changeToken,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract void bulkUpdateProperties(String user, String repositoryId,
			CmisBulkUpdateType bulkUpdateData,
			Holder<CmisExtensionType> extension,
			Holder<CmisObjectIdAndChangeTokenType> objectIdAndChangeToken)
			throws CmisException;

	public abstract CmisContentStreamType getContentStream(String user,
			String repositoryId, String objectId, String streamId,
			BigInteger offset, BigInteger length, CmisExtensionType extension)
			throws CmisException;

	public abstract FailedToDelete deleteTree(String user, String repositoryId,
			String folderId, Boolean allVersions,
			EnumUnfileObject unfileObjects, Boolean continueOnFailure,
			CmisExtensionType extension) throws CmisException;

	public abstract CmisObjectType getObjectByPath(String user,
			String repositoryId, String path, String filter,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException;

	public abstract void updateProperties(String user, String repositoryId,
			Holder<String> objectId, Holder<String> changeToken,
			CmisPropertiesType properties, Holder<CmisExtensionType> extension)
			throws CmisException;

	public abstract void createItem(String user, String repositoryId,
			CmisPropertiesType properties, String folderId,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException;

	public abstract void createDocument(String user, String repositoryId,
			CmisPropertiesType properties, String folderId,
			CmisContentStreamType contentStream,
			EnumVersioningState versioningState, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException;

	public abstract void createPolicy(String user, String repositoryId,
			CmisPropertiesType properties, String folderId,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException;

	public abstract void appendContentStream(String user, String repositoryId,
			Holder<String> objectId, Boolean isLastChunk,
			Holder<String> changeToken, CmisContentStreamType contentStream,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract List<CmisRenditionType> getRenditions(String user,
			String repositoryId, String objectId, String renditionFilter,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException;

	public abstract void setContentStream(String user, String repositoryId,
			Holder<String> objectId, Boolean overwriteFlag,
			Holder<String> changeToken, CmisContentStreamType contentStream,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract void moveObject(String user, String repositoryId,
			Holder<String> objectId, String targetFolderId,
			String sourceFolderId, Holder<CmisExtensionType> extension)
			throws CmisException;

	public abstract void createFolder(String user, String repositoryId,
			CmisPropertiesType properties, String folderId,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException;

	public abstract CmisObjectListType getCheckedOutDocs(String user,
			String repositoryId, String folderId, String filter,
			String orderBy, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException;

	public abstract List<CmisObjectParentsType> getObjectParents(String user,
			String repositoryId, String objectId, String filter,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includeRelativePathSegment,
			CmisExtensionType extension) throws CmisException;

	public abstract List<CmisObjectInFolderContainerType> getDescendants(
			String user, String repositoryId, String folderId,
			BigInteger depth, String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			CmisExtensionType extension) throws CmisException;

	public abstract CmisObjectInFolderListType getChildren(String user,
			String repositoryId, String folderId, String filter,
			String orderBy, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException;

	public abstract List<CmisObjectInFolderContainerType> getFolderTree(
			String user, String repositoryId, String folderId,
			BigInteger depth, String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			CmisExtensionType extension) throws CmisException;

	public abstract CmisObjectType getFolderParent(String user,
			String repositoryId, String folderId, String filter,
			CmisExtensionType extension) throws CmisException;

	public abstract void removeObjectFromFolder(String user,
			String repositoryId, String objectId, String folderId,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract void addObjectToFolder(String user, String repositoryId,
			String objectId, String folderId, Boolean allVersions,
			Holder<CmisExtensionType> extension) throws CmisException;

	public abstract QueryResponse query(String user, Query parameters) throws CmisException;

	public abstract void getContentChanges(String user, String repositoryId,
			Holder<String> changeLogToken, Boolean includeProperties,
			String filter, Boolean includePolicyIds, Boolean includeACL,
			BigInteger maxItems, CmisExtensionType extension,
			Holder<CmisObjectListType> objects) throws CmisException;

	public abstract CmisACLType applyACL(String user, String repositoryId,
			String objectId, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			EnumACLPropagation aclPropagation, CmisExtensionType extension)
			throws CmisException;

	public abstract CmisACLType getACL(String user, String repositoryId,
			String objectId, Boolean onlyBasicPermissions,
			CmisExtensionType extension) throws CmisException;
}
