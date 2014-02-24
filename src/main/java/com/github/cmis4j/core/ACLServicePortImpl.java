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

import org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType;
import org.oasis_open.docs.ns.cmis.core._200908.EnumACLPropagation;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisACLType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.ws._200908.ACLServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;

@WebService(serviceName = "ACLService", portName = "ACLServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.ACLServicePort")
public class ACLServicePortImpl implements ACLServicePort {
	private CmisService service;
	
	public ACLServicePortImpl(CmisService service) {
		this.service = service;
	}
	
	@Override
	public CmisACLType applyACL(String repositoryId, String objectId,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			EnumACLPropagation aclPropagation, CmisExtensionType extension)
			throws CmisException {
		return service.applyACL(repositoryId, objectId, addACEs, removeACEs, aclPropagation, extension);
	}

	@Override
	public CmisACLType getACL(String repositoryId, String objectId,
			Boolean onlyBasicPermissions, CmisExtensionType extension)
			throws CmisException {
		return service.getACL(repositoryId, objectId, onlyBasicPermissions, extension);
	}

}
