/**
 * Login_UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Login_UserService extends javax.xml.rpc.Service {
    public java.lang.String getLogin_UserAddress();

    public main.Login_User getLogin_User() throws javax.xml.rpc.ServiceException;

    public main.Login_User getLogin_User(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
