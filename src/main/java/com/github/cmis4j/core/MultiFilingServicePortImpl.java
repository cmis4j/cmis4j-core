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

import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.MultiFilingServicePort;

@WebService(serviceName = "MultiFilingService", portName = "MultiFilingServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.MultiFilingServicePort")
public class MultiFilingServicePortImpl implements MultiFilingServicePort {
	private CmisService service;
	
	public MultiFilingServicePortImpl(CmisService service) {
		this.service = service;
	}

	@Override
	public void removeObjectFromFolder(String repositoryId, String objectId,
			String folderId, Holder<CmisExtensionType> extension)
			throws CmisException {
		service.removeObjectFromFolder(repositoryId, objectId, folderId, extension);
	}

	@Override
	public void addObjectToFolder(String repositoryId, String objectId,
			String folderId, Boolean allVersions,
			Holder<CmisExtensionType> extension) throws CmisException {
		service.addObjectToFolder(repositoryId, objectId, folderId, allVersions, extension);
	}
}
