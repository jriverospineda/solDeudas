package cl.afphabitat.soap.certificado;

public class GetCertDicomEmpleadorProxy implements cl.afphabitat.soap.certificado.GetCertDicomEmpleador_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.certificado.GetCertDicomEmpleador_PortType getCertDicomEmpleador_PortType = null;
  
  public GetCertDicomEmpleadorProxy() {
    _initGetCertDicomEmpleadorProxy();
  }
  
  public GetCertDicomEmpleadorProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetCertDicomEmpleadorProxy();
  }
  
  private void _initGetCertDicomEmpleadorProxy() {
    try {
      getCertDicomEmpleador_PortType = (new cl.afphabitat.soap.certificado.GetCertDicomEmpleador_ServiceLocator()).getgetCertDicomEmpleadorSOAP();
      if (getCertDicomEmpleador_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getCertDicomEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getCertDicomEmpleador_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getCertDicomEmpleador_PortType != null)
      ((javax.xml.rpc.Stub)getCertDicomEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.certificado.GetCertDicomEmpleador_PortType getGetCertDicomEmpleador_PortType() {
    if (getCertDicomEmpleador_PortType == null)
      _initGetCertDicomEmpleadorProxy();
    return getCertDicomEmpleador_PortType;
  }
  
  public cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponse getCertDicomEmpleador(cl.afphabitat.soap.certificado.GetCertDicomEmpleadorRequest parameters) throws java.rmi.RemoteException{
    if (getCertDicomEmpleador_PortType == null)
      _initGetCertDicomEmpleadorProxy();
    return getCertDicomEmpleador_PortType.getCertDicomEmpleador(parameters);
  }
  
  
}