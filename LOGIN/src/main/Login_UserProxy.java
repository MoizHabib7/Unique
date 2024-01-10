package main;

public class Login_UserProxy implements main.Login_User {
  private String _endpoint = null;
  private main.Login_User login_User = null;
  
  public Login_UserProxy() {
    _initLogin_UserProxy();
  }
  
  public Login_UserProxy(String endpoint) {
    _endpoint = endpoint;
    _initLogin_UserProxy();
  }
  
  private void _initLogin_UserProxy() {
    try {
      login_User = (new main.Login_UserServiceLocator()).getLogin_User();
      if (login_User != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)login_User)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)login_User)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (login_User != null)
      ((javax.xml.rpc.Stub)login_User)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Login_User getLogin_User() {
    if (login_User == null)
      _initLogin_UserProxy();
    return login_User;
  }
  
  public int login(int id) throws java.rmi.RemoteException{
    if (login_User == null)
      _initLogin_UserProxy();
    return login_User.login(id);
  }
  
  
}