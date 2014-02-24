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

import javax.jws.WebService;

import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType;
import org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderContainerType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectParentsType;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.NavigationServicePort;

@WebService(serviceName = "NavigationService", portName = "NavigationServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.NavigationServicePort")
public class NavigationServicePortImpl implements NavigationServicePort {
	private CmisService service;
	
	public NavigationServicePortImpl(CmisService service) {
		this.service = service;
	}

	@Override
	public CmisObjectListType getCheckedOutDocs(String repositoryId,
			String folderId, String filter, String orderBy,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		return service.getCheckedOutDocs(repositoryId, folderId, filter, orderBy, includeAllowableActions, includeRelationships, renditionFilter, maxItems, skipCount, extension);
	}

	@Override
	public List<CmisObjectParentsType> getObjectParents(String repositoryId,
			String objectId, String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includeRelativePathSegment,
			CmisExtensionType extension) throws CmisException {
		return service.getObjectParents(repositoryId, objectId, filter, includeAllowableActions, includeRelationships, renditionFilter, includeRelativePathSegment, extension);
	}

	@Override
	public List<CmisObjectInFolderContainerType> getDescendants(
			String repositoryId, String folderId, BigInteger depth,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			CmisExtensionType extension) throws CmisException {
		return service.getDescendants(repositoryId, folderId, depth, filter, includeAllowableActions, includeRelationships, renditionFilter, includePathSegment, extension);
	}

	@Override
	public CmisObjectInFolderListType getChildren(String repositoryId,
			String folderId, String filter, String orderBy,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		return service.getChildren(repositoryId, folderId, filter, orderBy, includeAllowableActions, includeRelationships, renditionFilter, includePathSegment, maxItems, skipCount, extension);
	}

	@Override
	public List<CmisObjectInFolderContainerType> getFolderTree(
			String repositoryId, String folderId, BigInteger depth,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			CmisExtensionType extension) throws CmisException {
		return service.getFolderTree(repositoryId, folderId, depth, filter, includeAllowableActions, includeRelationships, renditionFilter, includePathSegment, extension);
	}

	@Override
	public CmisObjectType getFolderParent(String repositoryId, String folderId,
			String filter, CmisExtensionType extension) throws CmisException {
		return service.getFolderParent(repositoryId, folderId, filter, extension);
	}
}
