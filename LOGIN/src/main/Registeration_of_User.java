/**
 * Registeration_of_User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Registeration_of_User extends java.rmi.Remote {
    public int register_user(java.lang.String email, java.lang.String name, java.lang.String password, long phone) throws java.rmi.RemoteException;
}
