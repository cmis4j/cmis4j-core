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
import java.util.logging.Logger;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.Query;
import org.oasis_open.docs.ns.cmis.messaging._200908.QueryResponse;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.DiscoveryServicePort;

@WebService(serviceName = "DiscoveryService", portName = "DiscoveryServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.DiscoveryServicePort")
public class DiscoveryServicePortImpl implements DiscoveryServicePort {
	private static final Logger LOG = Logger.getLogger(DiscoveryServicePortImpl.class
			.getName());
	private CmisServiceBase service;
	
	public DiscoveryServicePortImpl(CmisServiceBase service) {
		this.service = service;
	}
	
	@Override
	public QueryResponse query(Query parameters) throws CmisException {
		LOG.info("repositoryId: " + ((parameters != null) ? parameters.getRepositoryId() : "null"));
		LOG.info("statement: " + ((parameters != null) ? parameters.getStatement() : "null"));
		return service.query(parameters);
	}

	@Override
	public void getContentChanges(String repositoryId,
			Holder<String> changeLogToken, Boolean includeProperties,
			String filter, Boolean includePolicyIds, Boolean includeACL,
			BigInteger maxItems, CmisExtensionType extension,
			Holder<CmisObjectListType> objects) throws CmisException {
		LOG.info("repositoryId: " + repositoryId);
		LOG.info("changeLogToken: " + changeLogToken);
		LOG.info("filter: " + filter);
		service.getContentChanges(repositoryId, changeLogToken, includeProperties, filter, includePolicyIds, includeACL, maxItems, extension, objects);
	}
}
