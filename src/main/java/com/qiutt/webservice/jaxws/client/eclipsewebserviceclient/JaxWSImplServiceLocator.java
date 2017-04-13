/**
 * JaxWSImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.qiutt.webservice.jaxws.client.eclipsewebserviceclient;

public class JaxWSImplServiceLocator extends org.apache.axis.client.Service implements com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.JaxWSImplService {

    public JaxWSImplServiceLocator() {
    }


    public JaxWSImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JaxWSImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JaxWSImplPort
    private java.lang.String JaxWSImplPort_address = "http://localhost:8080/springmvcmybatis/services/IJaxWS";

    public java.lang.String getJaxWSImplPortAddress() {
        return JaxWSImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JaxWSImplPortWSDDServiceName = "JaxWSImplPort";

    public java.lang.String getJaxWSImplPortWSDDServiceName() {
        return JaxWSImplPortWSDDServiceName;
    }

    public void setJaxWSImplPortWSDDServiceName(java.lang.String name) {
        JaxWSImplPortWSDDServiceName = name;
    }

    public com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.IJaxWS getJaxWSImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JaxWSImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJaxWSImplPort(endpoint);
    }

    public com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.IJaxWS getJaxWSImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.JaxWSImplPortBindingStub _stub = new com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.JaxWSImplPortBindingStub(portAddress, this);
            _stub.setPortName(getJaxWSImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJaxWSImplPortEndpointAddress(java.lang.String address) {
        JaxWSImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.IJaxWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.JaxWSImplPortBindingStub _stub = new com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.JaxWSImplPortBindingStub(new java.net.URL(JaxWSImplPort_address), this);
                _stub.setPortName(getJaxWSImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JaxWSImplPort".equals(inputPortName)) {
            return getJaxWSImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.jaxws.webservice.qiutt.com/", "JaxWSImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.jaxws.webservice.qiutt.com/", "JaxWSImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JaxWSImplPort".equals(portName)) {
            setJaxWSImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
