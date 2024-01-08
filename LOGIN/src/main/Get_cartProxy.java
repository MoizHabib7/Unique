package main;

public class Get_cartProxy implements main.Get_cart {
  private String _endpoint = null;
  private main.Get_cart get_cart = null;
  
  public Get_cartProxy() {
    _initGet_cartProxy();
  }
  
  public Get_cartProxy(String endpoint) {
    _endpoint = endpoint;
    _initGet_cartProxy();
  }
  
  private void _initGet_cartProxy() {
    try {
      get_cart = (new main.Get_cartServiceLocator()).getGet_cart();
      if (get_cart != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)get_cart)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)get_cart)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (get_cart != null)
      ((javax.xml.rpc.Stub)get_cart)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Get_cart getGet_cart() {
    if (get_cart == null)
      _initGet_cartProxy();
    return get_cart;
  }
  
  public main.Searching[] cart(int id) throws java.rmi.RemoteException{
    if (get_cart == null)
      _initGet_cartProxy();
    return get_cart.cart(id);
  }
  
  
}