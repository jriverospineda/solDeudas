package cl.afphabitat.soap.empleador;

public class GetEmpleadorProxy implements cl.afphabitat.soap.empleador.GetEmpleador_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.empleador.GetEmpleador_PortType getEmpleador_PortType = null;
  
  public GetEmpleadorProxy() {
    _initGetEmpleadorProxy();
  }
  
  public GetEmpleadorProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetEmpleadorProxy();
  }
  
  private void _initGetEmpleadorProxy() {
    try {
      getEmpleador_PortType = (new cl.afphabitat.soap.empleador.GetEmpleador_ServiceLocator()).getgetEmpleadorSOAP();
      if (getEmpleador_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getEmpleador_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getEmpleador_PortType != null)
      ((javax.xml.rpc.Stub)getEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.empleador.GetEmpleador_PortType getGetEmpleador_PortType() {
    if (getEmpleador_PortType == null)
      _initGetEmpleadorProxy();
    return getEmpleador_PortType;
  }
  
  public cl.afphabitat.soap.empleador.GetEmpleadorResponse getEmpleador(cl.afphabitat.soap.empleador.GetEmpleadorRequest parameters) throws java.rmi.RemoteException{
    if (getEmpleador_PortType == null)
      _initGetEmpleadorProxy();
    return getEmpleador_PortType.getEmpleador(parameters);
  }
  
  
}