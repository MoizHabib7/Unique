package main;

public class Order_trackingProxy implements main.Order_tracking {
  private String _endpoint = null;
  private main.Order_tracking order_tracking = null;
  
  public Order_trackingProxy() {
    _initOrder_trackingProxy();
  }
  
  public Order_trackingProxy(String endpoint) {
    _endpoint = endpoint;
    _initOrder_trackingProxy();
  }
  
  private void _initOrder_trackingProxy() {
    try {
      order_tracking = (new main.Order_trackingServiceLocator()).getOrder_tracking();
      if (order_tracking != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)order_tracking)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)order_tracking)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (order_tracking != null)
      ((javax.xml.rpc.Stub)order_tracking)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Order_tracking getOrder_tracking() {
    if (order_tracking == null)
      _initOrder_trackingProxy();
    return order_tracking;
  }
  
  public main.Order track(int id) throws java.rmi.RemoteException{
    if (order_tracking == null)
      _initOrder_trackingProxy();
    return order_tracking.track(id);
  }
  
  
}