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
import java.util.logging.Logger;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisAllowableActionsType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisBulkUpdateType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectIdAndChangeTokenType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisRenditionType;
import org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships;
import org.oasis_open.docs.ns.cmis.core._200908.EnumUnfileObject;
import org.oasis_open.docs.ns.cmis.core._200908.EnumVersioningState;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisContentStreamType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.DeleteTreeResponse.FailedToDelete;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.ObjectServicePort;

@WebService(serviceName = "ObjectService", portName = "ObjectServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.ObjectServicePort")
public class ObjectServicePortImpl implements ObjectServicePort {
	private static final Logger LOG = Logger.getLogger(ObjectServicePortImpl.class
			.getName());
	private CmisServiceBase service;

	public ObjectServicePortImpl(CmisServiceBase service) {
		this.service = service;
	}

	@Override
	public CmisPropertiesType getProperties(String repositoryId,
			String objectId, String filter, CmisExtensionType extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("filter: " + filter);
		return service.getProperties(repositoryId, objectId, filter, extension);
	}

	@Override
	public void deleteObject(String repositoryId, String objectId,
			Boolean allVersions, Holder<CmisExtensionType> extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.deleteObject(repositoryId, objectId, allVersions, extension);
	}

	@Override
	public CmisObjectType getObject(String repositoryId, String objectId,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("filter: " + filter);
		return service.getObject(repositoryId, objectId, filter, includeAllowableActions, includeRelationships, renditionFilter, includePolicyIds, includeACL, extension);
	}

	@Override
	public void createDocumentFromSource(String repositoryId, String sourceId,
			CmisPropertiesType properties, String folderId,
			EnumVersioningState versioningState, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("sourceId: " + sourceId);
		LOG.info("folderId: " + folderId);
		LOG.info("properties: " + properties);
		service.createDocumentFromSource(repositoryId, sourceId, properties, folderId, versioningState, policies, addACEs, removeACEs, extension, objectId);
	}

	@Override
	public CmisAllowableActionsType getAllowableActions(String repositoryId,
			String objectId, CmisExtensionType extension) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		return service.getAllowableActions(repositoryId, objectId, extension);
	}

	@Override
	public void createRelationship(String repositoryId,
			CmisPropertiesType properties, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("properties: " + properties);
		service.createRelationship(repositoryId, properties, policies, addACEs, removeACEs, extension, objectId);
	}

	@Override
	public void deleteContentStream(String repositoryId,
			Holder<String> objectId, Holder<String> changeToken,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.deleteContentStream(repositoryId, objectId, changeToken, extension);
	}

	@Override
	public void bulkUpdateProperties(String repositoryId,
			CmisBulkUpdateType bulkUpdateData,
			Holder<CmisExtensionType> extension,
			Holder<CmisObjectIdAndChangeTokenType> objectIdAndChangeToken)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		service.bulkUpdateProperties(repositoryId, bulkUpdateData, extension, objectIdAndChangeToken);
	}

	@Override
	public CmisContentStreamType getContentStream(String repositoryId,
			String objectId, String streamId, BigInteger offset,
			BigInteger length, CmisExtensionType extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("streamId: " + streamId);
		return service.getContentStream(repositoryId, objectId, streamId, offset, length, extension);
	}

	@Override
	public FailedToDelete deleteTree(String repositoryId, String folderId,
			Boolean allVersions, EnumUnfileObject unfileObjects,
			Boolean continueOnFailure, CmisExtensionType extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("folderId: " + folderId);
		return service.deleteTree(repositoryId, folderId, allVersions, unfileObjects, continueOnFailure, extension);
	}

	@Override
	public CmisObjectType getObjectByPath(String repositoryId, String path,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("path: " + path);
		LOG.info("filter: " + filter);
		return service.getObjectByPath(repositoryId, path, filter, includeAllowableActions, includeRelationships, renditionFilter, includePolicyIds, includeACL, extension);
	}

	@Override
	public void updateProperties(String repositoryId, Holder<String> objectId,
			Holder<String> changeToken, CmisPropertiesType properties,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("properties: " + properties);
		service.updateProperties(repositoryId, objectId, changeToken, properties, extension);
	}

	@Override
	public void createItem(String repositoryId, CmisPropertiesType properties,
			String folderId, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("folderId: " + folderId);
		LOG.info("properties: " + properties);
		service.createItem(repositoryId, properties, folderId, addACEs, removeACEs, extension, objectId);
	}

	@Override
	public void createDocument(String repositoryId,
			CmisPropertiesType properties, String folderId,
			CmisContentStreamType contentStream,
			EnumVersioningState versioningState, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("folderId: " + folderId);
		LOG.info("properties: " + properties);
		service.createDocument(repositoryId, properties, folderId, contentStream, versioningState, policies, addACEs, removeACEs, extension, objectId);
	}

	@Override
	public void createPolicy(String repositoryId,
			CmisPropertiesType properties, String folderId,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("folderId: " + folderId);
		LOG.info("properties: " + properties);
		service.createPolicy(repositoryId, properties, folderId, policies, addACEs, removeACEs, extension, objectId);
	}

	@Override
	public void appendContentStream(String repositoryId,
			Holder<String> objectId, Boolean isLastChunk,
			Holder<String> changeToken, CmisContentStreamType contentStream,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.appendContentStream(repositoryId, objectId, isLastChunk, changeToken, contentStream, extension);
	}

	@Override
	public List<CmisRenditionType> getRenditions(String repositoryId,
			String objectId, String renditionFilter, BigInteger maxItems,
			BigInteger skipCount, CmisExtensionType extension)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		return service.getRenditions(repositoryId, objectId, renditionFilter, maxItems, skipCount, extension);
	}

	@Override
	public void setContentStream(String repositoryId, Holder<String> objectId,
			Boolean overwriteFlag, Holder<String> changeToken,
			CmisContentStreamType contentStream,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.setContentStream(repositoryId, objectId, overwriteFlag, changeToken, contentStream, extension);
	}

	@Override
	public void moveObject(String repositoryId, Holder<String> objectId,
			String targetFolderId, String sourceFolderId,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.moveObject(repositoryId, objectId, targetFolderId, sourceFolderId, extension);
	}

	@Override
	public void createFolder(String repositoryId,
			CmisPropertiesType properties, String folderId,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("folderId: " + folderId);
		LOG.info("properties: " + properties);
		service.createFolder(repositoryId, properties, folderId, policies, addACEs, removeACEs, extension, objectId);
	}
}
