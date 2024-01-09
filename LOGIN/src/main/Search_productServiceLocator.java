/**
 * Search_productServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Search_productServiceLocator extends org.apache.axis.client.Service implements main.Search_productService {

    public Search_productServiceLocator() {
    }


    public Search_productServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Search_productServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Search_product
    private java.lang.String Search_product_address = "http://localhost:8080/scd-bp-project/services/Search_product";

    public java.lang.String getSearch_productAddress() {
        return Search_product_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Search_productWSDDServiceName = "Search_product";

    public java.lang.String getSearch_productWSDDServiceName() {
        return Search_productWSDDServiceName;
    }

    public void setSearch_productWSDDServiceName(java.lang.String name) {
        Search_productWSDDServiceName = name;
    }

    public main.Search_product getSearch_product() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Search_product_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearch_product(endpoint);
    }

    public main.Search_product getSearch_product(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Search_productSoapBindingStub _stub = new main.Search_productSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearch_productWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearch_productEndpointAddress(java.lang.String address) {
        Search_product_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Search_product.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Search_productSoapBindingStub _stub = new main.Search_productSoapBindingStub(new java.net.URL(Search_product_address), this);
                _stub.setPortName(getSearch_productWSDDServiceName());
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
        if ("Search_product".equals(inputPortName)) {
            return getSearch_product();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Search_productService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Search_product"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Search_product".equals(portName)) {
            setSearch_productEndpointAddress(address);
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
