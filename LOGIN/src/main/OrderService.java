/**
 * OrderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface OrderService extends javax.xml.rpc.Service {
    public java.lang.String getOrderAddress();

    public main.Order getOrder() throws javax.xml.rpc.ServiceException;

    public main.Order getOrder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
