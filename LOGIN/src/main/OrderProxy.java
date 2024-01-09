package main;

public class OrderProxy implements main.Order {
  private String _endpoint = null;
  private main.Order order = null;
  
  public OrderProxy() {
    _initOrderProxy();
  }
  
  public OrderProxy(String endpoint) {
    _endpoint = endpoint;
    _initOrderProxy();
  }
  
  private void _initOrderProxy() {
    try {
      order = (new main.OrderServiceLocator()).getOrder();
      if (order != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)order)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)order)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (order != null)
      ((javax.xml.rpc.Stub)order)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Order getOrder() {
    if (order == null)
      _initOrderProxy();
    return order;
  }
  
  
}