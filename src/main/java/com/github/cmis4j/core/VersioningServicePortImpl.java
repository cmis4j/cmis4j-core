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

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceContext;

import org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType;
import org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisContentStreamType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.VersioningServicePort;

@javax.jws.WebService(serviceName = "VersioningService", portName = "VersioningServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.VersioningServicePort")
public class VersioningServicePortImpl implements VersioningServicePort {
	private static final Logger LOG = Logger.getLogger(VersioningServicePortImpl.class
			.getName());
	private CmisServiceBase service;
	@Resource
	private WebServiceContext ctx;
	
	public VersioningServicePortImpl(CmisServiceBase service) {
		this.service = service;
	}

	private synchronized String getUser() {
		if (ctx != null) {
			Principal principal = ctx.getUserPrincipal();
			if (principal != null) {
				return principal.getName();
			}
		}
		return "";
	}
	
	@Override
	public List<CmisObjectType> getAllVersions(String repositoryId,
			String objectId, String filter, Boolean includeAllowableActions,
			CmisExtensionType extension) throws CmisException {
		LOG.info("user: " + getUser());
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("filter: " + filter);
		return service.getAllVersions(getUser(), repositoryId, objectId, filter, includeAllowableActions, extension);
	}

	@Override
	public void checkOut(String repositoryId, Holder<String> objectId,
			Holder<CmisExtensionType> extension, Holder<Boolean> contentCopied)
			throws CmisException {
		LOG.info("user: " + getUser());
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.checkOut(getUser(), repositoryId, objectId, extension, contentCopied);
	}

	@Override
	public CmisObjectType getObjectOfLatestVersion(String repositoryId,
			String objectId, Boolean major, String filter,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException {
		LOG.info("user: " + getUser());
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("filter: " + filter);
		return service.getObjectOfLatestVersion(getUser(), repositoryId, objectId, major, filter, includeAllowableActions, includeRelationships, renditionFilter, includePolicyIds, includeACL, extension);
	}

	@Override
	public CmisPropertiesType getPropertiesOfLatestVersion(String repositoryId,
			String objectId, Boolean major, String filter,
			CmisExtensionType extension) throws CmisException {
		LOG.info("user: " + getUser());
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("filter: " + filter);
		return service.getPropertiesOfLatestVersion(getUser(), repositoryId, objectId, major, filter, extension);
	}

	@Override
	public void cancelCheckOut(String repositoryId, String objectId,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("user: " + getUser());
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		service.cancelCheckOut(getUser(), repositoryId, objectId, extension);
	}

	@Override
	public void checkIn(String repositoryId, Holder<String> objectId,
			Boolean major, CmisPropertiesType properties,
			CmisContentStreamType contentStream, String checkinComment,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension) throws CmisException {
		LOG.info("user: " + getUser());
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("objectId: " + objectId);
		LOG.info("properties: " + properties);
		service.checkIn(getUser(), repositoryId, objectId, major, properties, contentStream, checkinComment, policies, addACEs, removeACEs, extension);
	}
}