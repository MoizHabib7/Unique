/**
 * Order_trackingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Order_trackingServiceLocator extends org.apache.axis.client.Service implements main.Order_trackingService {

    public Order_trackingServiceLocator() {
    }


    public Order_trackingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Order_trackingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Order_tracking
    private java.lang.String Order_tracking_address = "http://localhost:8080/scd-bp-project/services/Order_tracking";

    public java.lang.String getOrder_trackingAddress() {
        return Order_tracking_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Order_trackingWSDDServiceName = "Order_tracking";

    public java.lang.String getOrder_trackingWSDDServiceName() {
        return Order_trackingWSDDServiceName;
    }

    public void setOrder_trackingWSDDServiceName(java.lang.String name) {
        Order_trackingWSDDServiceName = name;
    }

    public main.Order_tracking getOrder_tracking() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Order_tracking_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrder_tracking(endpoint);
    }

    public main.Order_tracking getOrder_tracking(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Order_trackingSoapBindingStub _stub = new main.Order_trackingSoapBindingStub(portAddress, this);
            _stub.setPortName(getOrder_trackingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrder_trackingEndpointAddress(java.lang.String address) {
        Order_tracking_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Order_tracking.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Order_trackingSoapBindingStub _stub = new main.Order_trackingSoapBindingStub(new java.net.URL(Order_tracking_address), this);
                _stub.setPortName(getOrder_trackingWSDDServiceName());
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
        if ("Order_tracking".equals(inputPortName)) {
            return getOrder_tracking();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Order_trackingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Order_tracking"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Order_tracking".equals(portName)) {
            setOrder_trackingEndpointAddress(address);
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
