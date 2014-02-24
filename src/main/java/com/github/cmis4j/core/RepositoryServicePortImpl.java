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
import javax.xml.ws.Holder;

import org.oasis_open.docs.ns.cmis.core._200908.CmisRepositoryInfoType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisTypeDefinitionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisRepositoryEntryType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeContainer;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeDefinitionListType;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.RepositoryServicePort;

@WebService(serviceName = "RepositoryService", portName = "RepositoryServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.RepositoryServicePort")
public class RepositoryServicePortImpl implements RepositoryServicePort {
	private CmisService service;
	
	public RepositoryServicePortImpl(CmisService service) {
		this.service = service;
	}
	
	@Override
	public CmisTypeDefinitionListType getTypeChildren(String repositoryId,
			String typeId, Boolean includePropertyDefinitions,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		return service.getTypeChildren(repositoryId, typeId, includePropertyDefinitions, maxItems, skipCount, extension);
	}

	@Override
	public CmisTypeDefinitionType getTypeDefinition(String repositoryId,
			String typeId, CmisExtensionType extension) throws CmisException {
		return service.getTypeDefinition(repositoryId, typeId, extension);
	}

	@Override
	public void updateType(String repositoryId,
			Holder<CmisTypeDefinitionType> type, CmisExtensionType extension)
			throws CmisException {
		service.updateType(repositoryId, type, extension);
	}

	@Override
	public CmisRepositoryInfoType getRepositoryInfo(String repositoryId,
			CmisExtensionType extension) throws CmisException {
		return service.getRepositoryInfo(repositoryId, extension);
	}

	@Override
	public void deleteType(String repositoryId, String typeId,
			Holder<CmisExtensionType> extension) throws CmisException {
		service.deleteType(repositoryId, typeId, extension);
	}

	@Override
	public List<CmisTypeContainer> getTypeDescendants(String repositoryId,
			String typeId, BigInteger depth,
			Boolean includePropertyDefinitions, CmisExtensionType extension)
			throws CmisException {
		return service.getTypeDescendants(repositoryId, typeId, depth, includePropertyDefinitions, extension);
	}

	@Override
	public void createType(String repositoryId,
			Holder<CmisTypeDefinitionType> type, CmisExtensionType extension)
			throws CmisException {
		service.createType(repositoryId, type, extension);
	}

	@Override
	public List<CmisRepositoryEntryType> getRepositories(
			CmisExtensionType extension) throws CmisException {
		return service.getRepositories(extension);
	}

}
