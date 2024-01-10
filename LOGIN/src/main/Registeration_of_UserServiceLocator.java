/**
 * Registeration_of_UserServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Registeration_of_UserServiceLocator extends org.apache.axis.client.Service implements main.Registeration_of_UserService {

    public Registeration_of_UserServiceLocator() {
    }


    public Registeration_of_UserServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Registeration_of_UserServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Registeration_of_User
    private java.lang.String Registeration_of_User_address = "http://localhost:8080/scd-bp-project/services/Registeration_of_User";

    public java.lang.String getRegisteration_of_UserAddress() {
        return Registeration_of_User_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Registeration_of_UserWSDDServiceName = "Registeration_of_User";

    public java.lang.String getRegisteration_of_UserWSDDServiceName() {
        return Registeration_of_UserWSDDServiceName;
    }

    public void setRegisteration_of_UserWSDDServiceName(java.lang.String name) {
        Registeration_of_UserWSDDServiceName = name;
    }

    public main.Registeration_of_User getRegisteration_of_User() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Registeration_of_User_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegisteration_of_User(endpoint);
    }

    public main.Registeration_of_User getRegisteration_of_User(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Registeration_of_UserSoapBindingStub _stub = new main.Registeration_of_UserSoapBindingStub(portAddress, this);
            _stub.setPortName(getRegisteration_of_UserWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegisteration_of_UserEndpointAddress(java.lang.String address) {
        Registeration_of_User_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Registeration_of_User.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Registeration_of_UserSoapBindingStub _stub = new main.Registeration_of_UserSoapBindingStub(new java.net.URL(Registeration_of_User_address), this);
                _stub.setPortName(getRegisteration_of_UserWSDDServiceName());
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
        if ("Registeration_of_User".equals(inputPortName)) {
            return getRegisteration_of_User();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Registeration_of_UserService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Registeration_of_User"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Registeration_of_User".equals(portName)) {
            setRegisteration_of_UserEndpointAddress(address);
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
