package cl.afphabitat.soap.certificado;

public class GetCertDeudaTotalEmpleadorProxy implements cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_PortType getCertDeudaTotalEmpleador_PortType = null;
  
  public GetCertDeudaTotalEmpleadorProxy() {
    _initGetCertDeudaTotalEmpleadorProxy();
  }
  
  public GetCertDeudaTotalEmpleadorProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetCertDeudaTotalEmpleadorProxy();
  }
  
  private void _initGetCertDeudaTotalEmpleadorProxy() {
    try {
      getCertDeudaTotalEmpleador_PortType = (new cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_ServiceLocator()).getgetCertDeudaTotalEmpleadorSOAP();
      if (getCertDeudaTotalEmpleador_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getCertDeudaTotalEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getCertDeudaTotalEmpleador_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getCertDeudaTotalEmpleador_PortType != null)
      ((javax.xml.rpc.Stub)getCertDeudaTotalEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_PortType getGetCertDeudaTotalEmpleador_PortType() {
    if (getCertDeudaTotalEmpleador_PortType == null)
      _initGetCertDeudaTotalEmpleadorProxy();
    return getCertDeudaTotalEmpleador_PortType;
  }
  
  public cl.afphabitat.soap.certificado.GetCertDeudaResponse getCertDeudaTotalEmpleador(cl.afphabitat.soap.certificado.GetCertDeudaRequest parameters) throws java.rmi.RemoteException{
    if (getCertDeudaTotalEmpleador_PortType == null)
      _initGetCertDeudaTotalEmpleadorProxy();
    return getCertDeudaTotalEmpleador_PortType.getCertDeudaTotalEmpleador(parameters);
  }
  
  
}