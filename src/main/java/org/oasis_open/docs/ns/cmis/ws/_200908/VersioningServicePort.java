package org.oasis_open.docs.ns.cmis.ws._200908;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7 2014-02-24T15:14:54.968-06:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "VersioningServicePort")
@XmlSeeAlso({ org.oasis_open.docs.ns.cmis.core._200908.ObjectFactory.class,
		org.oasis_open.docs.ns.cmis.messaging._200908.ObjectFactory.class })
public interface VersioningServicePort {

	@WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
	@RequestWrapper(localName = "getAllVersions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetAllVersions")
	@WebMethod(action = "getAllVersions")
	@ResponseWrapper(localName = "getAllVersionsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetAllVersionsResponse")
	public java.util.List<org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType> getAllVersions(
			@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String repositoryId,
			@WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String objectId,
			@WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String filter,
			@WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean includeAllowableActions,
			@WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension)
			throws CmisException;

	@RequestWrapper(localName = "checkOut", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.CheckOut")
	@WebMethod(action = "checkOut")
	@ResponseWrapper(localName = "checkOutResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.CheckOutResponse")
	public void checkOut(
			@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String repositoryId,
			@WebParam(mode = WebParam.Mode.INOUT, name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") javax.xml.ws.Holder<java.lang.String> objectId,
			@WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") javax.xml.ws.Holder<org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType> extension,
			@WebParam(mode = WebParam.Mode.OUT, name = "contentCopied", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") javax.xml.ws.Holder<java.lang.Boolean> contentCopied)
			throws CmisException;

	@WebResult(name = "object", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
	@RequestWrapper(localName = "getObjectOfLatestVersion", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetObjectOfLatestVersion")
	@WebMethod(action = "getObjectOfLatestVersion")
	@ResponseWrapper(localName = "getObjectOfLatestVersionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetObjectOfLatestVersionResponse")
	public org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType getObjectOfLatestVersion(
			@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String repositoryId,
			@WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String objectId,
			@WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean major,
			@WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String filter,
			@WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean includeAllowableActions,
			@WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships includeRelationships,
			@WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String renditionFilter,
			@WebParam(name = "includePolicyIds", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean includePolicyIds,
			@WebParam(name = "includeACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean includeACL,
			@WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension)
			throws CmisException;

	@WebResult(name = "properties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
	@RequestWrapper(localName = "getPropertiesOfLatestVersion", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetPropertiesOfLatestVersion")
	@WebMethod(action = "getPropertiesOfLatestVersion")
	@ResponseWrapper(localName = "getPropertiesOfLatestVersionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.GetPropertiesOfLatestVersionResponse")
	public org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType getPropertiesOfLatestVersion(
			@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String repositoryId,
			@WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String objectId,
			@WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean major,
			@WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String filter,
			@WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType extension)
			throws CmisException;

	@RequestWrapper(localName = "cancelCheckOut", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.CancelCheckOut")
	@WebMethod(action = "cancelCheckOut")
	@ResponseWrapper(localName = "cancelCheckOutResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.CancelCheckOutResponse")
	public void cancelCheckOut(
			@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String repositoryId,
			@WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String objectId,
			@WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") javax.xml.ws.Holder<org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType> extension)
			throws CmisException;

	@RequestWrapper(localName = "checkIn", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.CheckIn")
	@WebMethod(action = "checkIn")
	@ResponseWrapper(localName = "checkInResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.oasis_open.docs.ns.cmis.messaging._200908.CheckInResponse")
	public void checkIn(
			@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String repositoryId,
			@WebParam(mode = WebParam.Mode.INOUT, name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") javax.xml.ws.Holder<java.lang.String> objectId,
			@WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.Boolean major,
			@WebParam(name = "properties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType properties,
			@WebParam(name = "contentStream", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.messaging._200908.CmisContentStreamType contentStream,
			@WebParam(name = "checkinComment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.lang.String checkinComment,
			@WebParam(name = "policies", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") java.util.List<java.lang.String> policies,
			@WebParam(name = "addACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType addACEs,
			@WebParam(name = "removeACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType removeACEs,
			@WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") javax.xml.ws.Holder<org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType> extension)
			throws CmisException;
}
