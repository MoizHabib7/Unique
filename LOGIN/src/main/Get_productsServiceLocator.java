/**
 * Get_productsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Get_productsServiceLocator extends org.apache.axis.client.Service implements main.Get_productsService {

    public Get_productsServiceLocator() {
    }


    public Get_productsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Get_productsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Get_products
    private java.lang.String Get_products_address = "http://localhost:8080/scd-bp-project/services/Get_products";

    public java.lang.String getGet_productsAddress() {
        return Get_products_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Get_productsWSDDServiceName = "Get_products";

    public java.lang.String getGet_productsWSDDServiceName() {
        return Get_productsWSDDServiceName;
    }

    public void setGet_productsWSDDServiceName(java.lang.String name) {
        Get_productsWSDDServiceName = name;
    }

    public main.Get_products getGet_products() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Get_products_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGet_products(endpoint);
    }

    public main.Get_products getGet_products(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Get_productsSoapBindingStub _stub = new main.Get_productsSoapBindingStub(portAddress, this);
            _stub.setPortName(getGet_productsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGet_productsEndpointAddress(java.lang.String address) {
        Get_products_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Get_products.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Get_productsSoapBindingStub _stub = new main.Get_productsSoapBindingStub(new java.net.URL(Get_products_address), this);
                _stub.setPortName(getGet_productsWSDDServiceName());
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
        if ("Get_products".equals(inputPortName)) {
            return getGet_products();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Get_productsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Get_products"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Get_products".equals(portName)) {
            setGet_productsEndpointAddress(address);
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
