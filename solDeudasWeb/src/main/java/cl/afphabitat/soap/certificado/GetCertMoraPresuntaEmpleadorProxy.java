package cl.afphabitat.soap.certificado;

public class GetCertMoraPresuntaEmpleadorProxy implements cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_PortType getCertMoraPresuntaEmpleador_PortType = null;
  
  public GetCertMoraPresuntaEmpleadorProxy() {
    _initGetCertMoraPresuntaEmpleadorProxy();
  }
  
  public GetCertMoraPresuntaEmpleadorProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetCertMoraPresuntaEmpleadorProxy();
  }
  
  private void _initGetCertMoraPresuntaEmpleadorProxy() {
    try {
      getCertMoraPresuntaEmpleador_PortType = (new cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_ServiceLocator()).getgetCertMoraPresuntaEmpleadorSOAP();
      if (getCertMoraPresuntaEmpleador_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getCertMoraPresuntaEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getCertMoraPresuntaEmpleador_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getCertMoraPresuntaEmpleador_PortType != null)
      ((javax.xml.rpc.Stub)getCertMoraPresuntaEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_PortType getGetCertMoraPresuntaEmpleador_PortType() {
    if (getCertMoraPresuntaEmpleador_PortType == null)
      _initGetCertMoraPresuntaEmpleadorProxy();
    return getCertMoraPresuntaEmpleador_PortType;
  }
  
  public cl.afphabitat.soap.certificado.GetCertMoraPresuntaResponse getCertMoraPresuntaEmpleador(cl.afphabitat.soap.certificado.GetCertMoraPresuntaRequest parameters) throws java.rmi.RemoteException{
    if (getCertMoraPresuntaEmpleador_PortType == null)
      _initGetCertMoraPresuntaEmpleadorProxy();
    return getCertMoraPresuntaEmpleador_PortType.getCertMoraPresuntaEmpleador(parameters);
  }
  
  
}