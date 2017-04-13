package com.qiutt.webservice.jaxws.client.eclipsewebserviceclient;

public class IJaxWSProxy implements com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.IJaxWS {
  private String _endpoint = null;
  private com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.IJaxWS iJaxWS = null;
  
  public IJaxWSProxy() {
    _initIJaxWSProxy();
  }
  
  public IJaxWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initIJaxWSProxy();
  }
  
  private void _initIJaxWSProxy() {
    try {
      iJaxWS = (new com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.JaxWSImplServiceLocator()).getJaxWSImplPort();
      if (iJaxWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iJaxWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iJaxWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iJaxWS != null)
      ((javax.xml.rpc.Stub)iJaxWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.qiutt.webservice.jaxws.client.eclipsewebserviceclient.IJaxWS getIJaxWS() {
    if (iJaxWS == null)
      _initIJaxWSProxy();
    return iJaxWS;
  }
  
  public java.lang.String byJaxWS1(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iJaxWS == null)
      _initIJaxWSProxy();
    return iJaxWS.byJaxWS1(arg0);
  }
  
  public java.lang.String byJaxWS(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iJaxWS == null)
      _initIJaxWSProxy();
    return iJaxWS.byJaxWS(arg0);
  }
  
  
}