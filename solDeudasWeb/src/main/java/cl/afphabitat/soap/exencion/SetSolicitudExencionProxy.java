package cl.afphabitat.soap.exencion;

public class SetSolicitudExencionProxy implements cl.afphabitat.soap.exencion.SetSolicitudExencion_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.exencion.SetSolicitudExencion_PortType setSolicitudExencion_PortType = null;
  
  public SetSolicitudExencionProxy() {
    _initSetSolicitudExencionProxy();
  }
  
  public SetSolicitudExencionProxy(String endpoint) {
    _endpoint = endpoint;
    _initSetSolicitudExencionProxy();
  }
  
  private void _initSetSolicitudExencionProxy() {
    try {
      setSolicitudExencion_PortType = (new cl.afphabitat.soap.exencion.SetSolicitudExencion_ServiceLocator()).getsetSolicitudExencionSOAP();
      if (setSolicitudExencion_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)setSolicitudExencion_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)setSolicitudExencion_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (setSolicitudExencion_PortType != null)
      ((javax.xml.rpc.Stub)setSolicitudExencion_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.exencion.SetSolicitudExencion_PortType getSetSolicitudExencion_PortType() {
    if (setSolicitudExencion_PortType == null)
      _initSetSolicitudExencionProxy();
    return setSolicitudExencion_PortType;
  }
  
  public cl.afphabitat.soap.exencion.SetSolicitudExencionResponse setSolicitudExencion(cl.afphabitat.soap.exencion.SetSolicitudExencionRequest parameters) throws java.rmi.RemoteException{
    if (setSolicitudExencion_PortType == null)
      _initSetSolicitudExencionProxy();
    return setSolicitudExencion_PortType.setSolicitudExencion(parameters);
  }
  
  
}