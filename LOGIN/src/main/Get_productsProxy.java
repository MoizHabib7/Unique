package main;

public class Get_productsProxy implements main.Get_products {
  private String _endpoint = null;
  private main.Get_products get_products = null;
  
  public Get_productsProxy() {
    _initGet_productsProxy();
  }
  
  public Get_productsProxy(String endpoint) {
    _endpoint = endpoint;
    _initGet_productsProxy();
  }
  
  private void _initGet_productsProxy() {
    try {
      get_products = (new main.Get_productsServiceLocator()).getGet_products();
      if (get_products != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)get_products)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)get_products)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (get_products != null)
      ((javax.xml.rpc.Stub)get_products)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Get_products getGet_products() {
    if (get_products == null)
      _initGet_productsProxy();
    return get_products;
  }
  
  public main.Searching[] dashboard() throws java.rmi.RemoteException{
    if (get_products == null)
      _initGet_productsProxy();
    return get_products.dashboard();
  }
  
  
}