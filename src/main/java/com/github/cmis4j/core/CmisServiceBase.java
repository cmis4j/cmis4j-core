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

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;

import org.oasis_open.docs.ns.cmis.messaging._200908.CmisFaultType;
import org.oasis_open.docs.ns.cmis.messaging._200908.EnumServiceException;
import org.oasis_open.docs.ns.cmis.ws._200908.ACLServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.DiscoveryServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.MultiFilingServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.NavigationServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.ObjectServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.RelationshipServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.RepositoryServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.VersioningServicePort;

public abstract class CmisServiceBase implements ACLServicePort,
		DiscoveryServicePort, MultiFilingServicePort, NavigationServicePort,
		ObjectServicePort, PolicyServicePort, RelationshipServicePort,
		RepositoryServicePort, VersioningServicePort {
	@Resource
	private WebServiceContext ctx;
	private enum ErrorMessage {
		NOT_IMPLEMENTED(-1, "not implemented"),
		INVALID_CONTEXT(-2, "invalid context");
		private final int code;
		private final String message;
		private ErrorMessage(int code, String message) {
			this.code = code;
			this.message = message;
		}
	}

	private void cmisException(ErrorMessage error, EnumServiceException reason) throws CmisException {
		CmisFaultType cmisFault = new CmisFaultType();
		cmisFault.setCode(BigInteger.valueOf(error.code));
		cmisFault.setMessage(error.message);
		cmisFault.setType(reason);
		throw new CmisException(error.message, cmisFault);
	}

	protected void notImplemented() throws CmisException {
		cmisException(ErrorMessage.NOT_IMPLEMENTED, EnumServiceException.NOT_SUPPORTED);
	}
	
	protected void invalidContext() throws CmisException {
		cmisException(ErrorMessage.INVALID_CONTEXT, EnumServiceException.NOT_SUPPORTED);
	}
	
	protected WebServiceContext getContext() throws CmisException {
		if (ctx == null) {
			invalidContext();
		}
		return ctx;
	}
}
