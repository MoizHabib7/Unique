/**
 * Login_UserServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Login_UserServiceLocator extends org.apache.axis.client.Service implements main.Login_UserService {

    public Login_UserServiceLocator() {
    }


    public Login_UserServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Login_UserServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Login_User
    private java.lang.String Login_User_address = "http://localhost:8080/scd-bp-project/services/Login_User";

    public java.lang.String getLogin_UserAddress() {
        return Login_User_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Login_UserWSDDServiceName = "Login_User";

    public java.lang.String getLogin_UserWSDDServiceName() {
        return Login_UserWSDDServiceName;
    }

    public void setLogin_UserWSDDServiceName(java.lang.String name) {
        Login_UserWSDDServiceName = name;
    }

    public main.Login_User getLogin_User() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Login_User_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLogin_User(endpoint);
    }

    public main.Login_User getLogin_User(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Login_UserSoapBindingStub _stub = new main.Login_UserSoapBindingStub(portAddress, this);
            _stub.setPortName(getLogin_UserWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLogin_UserEndpointAddress(java.lang.String address) {
        Login_User_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Login_User.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Login_UserSoapBindingStub _stub = new main.Login_UserSoapBindingStub(new java.net.URL(Login_User_address), this);
                _stub.setPortName(getLogin_UserWSDDServiceName());
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
        if ("Login_User".equals(inputPortName)) {
            return getLogin_User();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "Login_UserService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Login_User"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Login_User".equals(portName)) {
            setLogin_UserEndpointAddress(address);
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
