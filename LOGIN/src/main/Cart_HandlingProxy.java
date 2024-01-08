package main;

public class Cart_HandlingProxy implements main.Cart_Handling {
  private String _endpoint = null;
  private main.Cart_Handling cart_Handling = null;
  
  public Cart_HandlingProxy() {
    _initCart_HandlingProxy();
  }
  
  public Cart_HandlingProxy(String endpoint) {
    _endpoint = endpoint;
    _initCart_HandlingProxy();
  }
  
  private void _initCart_HandlingProxy() {
    try {
      cart_Handling = (new main.Cart_HandlingServiceLocator()).getCart_Handling();
      if (cart_Handling != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cart_Handling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cart_Handling)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cart_Handling != null)
      ((javax.xml.rpc.Stub)cart_Handling)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Cart_Handling getCart_Handling() {
    if (cart_Handling == null)
      _initCart_HandlingProxy();
    return cart_Handling;
  }
  
  public int add_to_cart(java.lang.String pro, int pri, int dis, int quan, int user) throws java.rmi.RemoteException{
    if (cart_Handling == null)
      _initCart_HandlingProxy();
    return cart_Handling.add_to_cart(pro, pri, dis, quan, user);
  }
  
  
}