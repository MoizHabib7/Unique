/**
 * Cart_HandlingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Cart_HandlingServiceLocator extends org.apache.axis.client.Service implements main.Cart_HandlingService {

    public Cart_HandlingServiceLocator() {
    }


    public Cart_HandlingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Cart_HandlingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Cart_Handling
    private java.lang.String Cart_Handling_address = "http://localhost:8080/scd-bp-project/services/Cart_Handling";

    public java.lang.String getCart_HandlingAddress() {
        return Cart_Handling_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Cart_HandlingWSDDServiceName = "Cart_Handling";

    public java.lang.String getCart_HandlingWSDDServiceName() {
        return Cart_HandlingWSDDServiceName;
    }

    public void setCart_HandlingWSDDServiceName(java.lang.String name) {
        Cart_HandlingWSDDServiceName = name;
    }

    public main.Cart_Handling getCart_Handling() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Cart_Handling_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCart_Handling(endpoint);
    }

    public main.Cart_Handling getCart_Handling(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Cart_HandlingSoapBindingStub _stub = new main.Cart_HandlingSoapBindingStub(portAddress, this);
            _stub.setPortName(getCart_HandlingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCart_HandlingEndpointAddress(java.lang.String address) {
        Cart_Handling_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Cart_Handling.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Cart_HandlingSoapBindingStub _stub = new main.Cart_HandlingSoapBindingStub(new java.net.URL(Cart_Handling_address), this);
                _stub.setPortName(getCart_HandlingWSDDServiceName());
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
        if ("Cart_Handling".equals(inputPortName)) {
            return getCart_Handling();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Cart_HandlingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Cart_Handling"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Cart_Handling".equals(portName)) {
            setCart_HandlingEndpointAddress(address);
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
