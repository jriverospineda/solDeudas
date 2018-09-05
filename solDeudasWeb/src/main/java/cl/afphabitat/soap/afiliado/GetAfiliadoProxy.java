package cl.afphabitat.soap.afiliado;

public class GetAfiliadoProxy implements cl.afphabitat.soap.afiliado.GetAfiliado_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.afiliado.GetAfiliado_PortType getAfiliado_PortType = null;
  
  public GetAfiliadoProxy() {
    _initGetAfiliadoProxy();
  }
  
  public GetAfiliadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetAfiliadoProxy();
  }
  
  private void _initGetAfiliadoProxy() {
    try {
      getAfiliado_PortType = (new cl.afphabitat.soap.afiliado.GetAfiliado_ServiceLocator()).getgetAfiliadoSOAP();
      if (getAfiliado_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getAfiliado_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getAfiliado_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getAfiliado_PortType != null)
      ((javax.xml.rpc.Stub)getAfiliado_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.afiliado.GetAfiliado_PortType getGetAfiliado_PortType() {
    if (getAfiliado_PortType == null)
      _initGetAfiliadoProxy();
    return getAfiliado_PortType;
  }
  
  public cl.afphabitat.soap.afiliado.GetAfiliadoResponse getAfiliado(cl.afphabitat.soap.afiliado.GetAfiliadoRequest parameters) throws java.rmi.RemoteException{
    if (getAfiliado_PortType == null)
      _initGetAfiliadoProxy();
    return getAfiliado_PortType.getAfiliado(parameters);
  }
  
  
}