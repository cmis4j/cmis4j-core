/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.cmis4j.core.impl;

import java.util.logging.Logger;

import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;
import org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort;

/**
 * This class was generated by Apache CXF 2.7.7 2014-02-19T05:53:39.562-06:00
 * Generated source version: 2.7.7
 * 
 */

@javax.jws.WebService(serviceName = "PolicyService", portName = "PolicyServicePort", targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", endpointInterface = "org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort")
public class PolicyServicePortImpl implements PolicyServicePort {

	private static final Logger LOG = Logger
			.getLogger(PolicyServicePortImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort#removePolicy
	 * (java.lang.String repositoryId ,)java.lang.String policyId
	 * ,)java.lang.String objectId
	 * ,)org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType
	 * extension )*
	 */
	@Override
	public void removePolicy(
			java.lang.String repositoryId,
			java.lang.String policyId,
			java.lang.String objectId,
			javax.xml.ws.Holder<org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType> extension)
			throws CmisException {
		LOG.info("Executing operation removePolicy");
		System.out.println(repositoryId);
		System.out.println(policyId);
		System.out.println(objectId);
		System.out.println(extension.value);
		try {
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		// throw new CmisException("cmisException...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort#applyPolicy(
	 * java.lang.String repositoryId ,)java.lang.String policyId
	 * ,)java.lang.String objectId
	 * ,)org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType
	 * extension )*
	 */
	@Override
	public void applyPolicy(
			java.lang.String repositoryId,
			java.lang.String policyId,
			java.lang.String objectId,
			javax.xml.ws.Holder<org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType> extension)
			throws CmisException {
		LOG.info("Executing operation applyPolicy");
		System.out.println(repositoryId);
		System.out.println(policyId);
		System.out.println(objectId);
		System.out.println(extension.value);
		try {
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		// throw new CmisException("cmisException...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort#getAppliedPolicies
	 * (java.lang.String repositoryId ,)java.lang.String objectId
	 * ,)java.lang.String filter
	 * ,)org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType
	 * extension )*
	 */
	@Override
	public java.util.List<org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType> getAppliedPolicies(
			java.lang.String repositoryId,
			java.lang.String objectId,
			java.lang.String filter,
			org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension)
			throws CmisException {
		LOG.info("Executing operation getAppliedPolicies");
		System.out.println(repositoryId);
		System.out.println(objectId);
		System.out.println(filter);
		System.out.println(extension);
		try {
			java.util.List<org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType> _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		// throw new CmisException("cmisException...");
	}

}
