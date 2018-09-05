package cl.afphabitat.soap.solicitud;

public class GetSolicitudProxy implements cl.afphabitat.soap.solicitud.GetSolicitud_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.solicitud.GetSolicitud_PortType getSolicitud_PortType = null;
  
  public GetSolicitudProxy() {
    _initGetSolicitudProxy();
  }
  
  public GetSolicitudProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetSolicitudProxy();
  }
  
  private void _initGetSolicitudProxy() {
    try {
      getSolicitud_PortType = (new cl.afphabitat.soap.solicitud.GetSolicitud_ServiceLocator()).getgetSolicitudSOAP();
      if (getSolicitud_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getSolicitud_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getSolicitud_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getSolicitud_PortType != null)
      ((javax.xml.rpc.Stub)getSolicitud_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.solicitud.GetSolicitud_PortType getGetSolicitud_PortType() {
    if (getSolicitud_PortType == null)
      _initGetSolicitudProxy();
    return getSolicitud_PortType;
  }
  
  public cl.afphabitat.soap.solicitud.GetSolicitudResponse getSolicitud(cl.afphabitat.soap.solicitud.GetSolicitudRequest parameters) throws java.rmi.RemoteException{
    if (getSolicitud_PortType == null)
      _initGetSolicitudProxy();
    return getSolicitud_PortType.getSolicitud(parameters);
  }
  
  
}