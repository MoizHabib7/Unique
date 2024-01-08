/**
 * OrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class OrderServiceLocator extends org.apache.axis.client.Service implements main.OrderService {

    public OrderServiceLocator() {
    }


    public OrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Order
    private java.lang.String Order_address = "http://localhost:8080/scd-bp-project/services/Order";

    public java.lang.String getOrderAddress() {
        return Order_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderWSDDServiceName = "Order";

    public java.lang.String getOrderWSDDServiceName() {
        return OrderWSDDServiceName;
    }

    public void setOrderWSDDServiceName(java.lang.String name) {
        OrderWSDDServiceName = name;
    }

    public main.Order getOrder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Order_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrder(endpoint);
    }

    public main.Order getOrder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.OrderSoapBindingStub _stub = new main.OrderSoapBindingStub(portAddress, this);
            _stub.setPortName(getOrderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderEndpointAddress(java.lang.String address) {
        Order_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Order.class.isAssignableFrom(serviceEndpointInterface)) {
                main.OrderSoapBindingStub _stub = new main.OrderSoapBindingStub(new java.net.URL(Order_address), this);
                _stub.setPortName(getOrderWSDDServiceName());
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
        if ("Order".equals(inputPortName)) {
            return getOrder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "OrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Order"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Order".equals(portName)) {
            setOrderEndpointAddress(address);
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
