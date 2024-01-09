/**
 * Get_cartServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Get_cartServiceLocator extends org.apache.axis.client.Service implements main.Get_cartService {

    public Get_cartServiceLocator() {
    }


    public Get_cartServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Get_cartServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Get_cart
    private java.lang.String Get_cart_address = "http://localhost:8080/scd-bp-project/services/Get_cart";

    public java.lang.String getGet_cartAddress() {
        return Get_cart_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Get_cartWSDDServiceName = "Get_cart";

    public java.lang.String getGet_cartWSDDServiceName() {
        return Get_cartWSDDServiceName;
    }

    public void setGet_cartWSDDServiceName(java.lang.String name) {
        Get_cartWSDDServiceName = name;
    }

    public main.Get_cart getGet_cart() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Get_cart_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGet_cart(endpoint);
    }

    public main.Get_cart getGet_cart(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Get_cartSoapBindingStub _stub = new main.Get_cartSoapBindingStub(portAddress, this);
            _stub.setPortName(getGet_cartWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGet_cartEndpointAddress(java.lang.String address) {
        Get_cart_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Get_cart.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Get_cartSoapBindingStub _stub = new main.Get_cartSoapBindingStub(new java.net.URL(Get_cart_address), this);
                _stub.setPortName(getGet_cartWSDDServiceName());
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
        if ("Get_cart".equals(inputPortName)) {
            return getGet_cart();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Get_cartService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Get_cart"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Get_cart".equals(portName)) {
            setGet_cartEndpointAddress(address);
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
