package main;

public class Buy_productProxy implements main.Buy_product {
  private String _endpoint = null;
  private main.Buy_product buy_product = null;
  
  public Buy_productProxy() {
    _initBuy_productProxy();
  }
  
  public Buy_productProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuy_productProxy();
  }
  
  private void _initBuy_productProxy() {
    try {
      buy_product = (new main.Buy_productServiceLocator()).getBuy_product();
      if (buy_product != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buy_product)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buy_product)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buy_product != null)
      ((javax.xml.rpc.Stub)buy_product)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Buy_product getBuy_product() {
    if (buy_product == null)
      _initBuy_productProxy();
    return buy_product;
  }
  
  public void create_order(java.lang.String add, java.lang.String date, int pay, java.lang.String user) throws java.rmi.RemoteException{
    if (buy_product == null)
      _initBuy_productProxy();
    buy_product.create_order(add, date, pay, user);
  }
  
  
}