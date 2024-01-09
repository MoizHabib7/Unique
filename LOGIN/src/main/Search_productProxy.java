package main;

public class Search_productProxy implements main.Search_product {
  private String _endpoint = null;
  private main.Search_product search_product = null;
  
  public Search_productProxy() {
    _initSearch_productProxy();
  }
  
  public Search_productProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearch_productProxy();
  }
  
  private void _initSearch_productProxy() {
    try {
      search_product = (new main.Search_productServiceLocator()).getSearch_product();
      if (search_product != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)search_product)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)search_product)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (search_product != null)
      ((javax.xml.rpc.Stub)search_product)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Search_product getSearch_product() {
    if (search_product == null)
      _initSearch_productProxy();
    return search_product;
  }
  
  public main.Searching search(int id) throws java.rmi.RemoteException{
    if (search_product == null)
      _initSearch_productProxy();
    return search_product.search(id);
  }
  
  
}