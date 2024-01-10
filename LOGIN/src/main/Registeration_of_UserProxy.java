package main;

public class Registeration_of_UserProxy implements main.Registeration_of_User {
  private String _endpoint = null;
  private main.Registeration_of_User registeration_of_User = null;
  
  public Registeration_of_UserProxy() {
    _initRegisteration_of_UserProxy();
  }
  
  public Registeration_of_UserProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegisteration_of_UserProxy();
  }
  
  private void _initRegisteration_of_UserProxy() {
    try {
      registeration_of_User = (new main.Registeration_of_UserServiceLocator()).getRegisteration_of_User();
      if (registeration_of_User != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)registeration_of_User)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)registeration_of_User)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (registeration_of_User != null)
      ((javax.xml.rpc.Stub)registeration_of_User)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Registeration_of_User getRegisteration_of_User() {
    if (registeration_of_User == null)
      _initRegisteration_of_UserProxy();
    return registeration_of_User;
  }
  
  public int register_user(java.lang.String email, java.lang.String name, java.lang.String password, int phone) throws java.rmi.RemoteException{
    if (registeration_of_User == null)
      _initRegisteration_of_UserProxy();
    return registeration_of_User.register_user(email, name, password, phone);
  }
  
  
}