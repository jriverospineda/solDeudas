package cl.afphabitat.soap.certificado;

public class GetCertDetalleDeudaEmpleadorProxy implements cl.afphabitat.soap.certificado.GetCertDetalleDeudaEmpleador_PortType {
  private String _endpoint = null;
  private cl.afphabitat.soap.certificado.GetCertDetalleDeudaEmpleador_PortType getCertDetalleDeudaEmpleador_PortType = null;
  
  public GetCertDetalleDeudaEmpleadorProxy() {
    _initGetCertDetalleDeudaEmpleadorProxy();
  }
  
  public GetCertDetalleDeudaEmpleadorProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetCertDetalleDeudaEmpleadorProxy();
  }
  
  private void _initGetCertDetalleDeudaEmpleadorProxy() {
    try {
      getCertDetalleDeudaEmpleador_PortType = (new cl.afphabitat.soap.certificado.GetCertDetalleDeudaEmpleador_ServiceLocator()).getgetCertDetalleDeudaEmpleadorSOAP();
      if (getCertDetalleDeudaEmpleador_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getCertDetalleDeudaEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getCertDetalleDeudaEmpleador_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getCertDetalleDeudaEmpleador_PortType != null)
      ((javax.xml.rpc.Stub)getCertDetalleDeudaEmpleador_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.afphabitat.soap.certificado.GetCertDetalleDeudaEmpleador_PortType getGetCertDetalleDeudaEmpleador_PortType() {
    if (getCertDetalleDeudaEmpleador_PortType == null)
      _initGetCertDetalleDeudaEmpleadorProxy();
    return getCertDetalleDeudaEmpleador_PortType;
  }
  
  public cl.afphabitat.soap.certificado.GetCertDetDeudaResponse getCertDetalleDeudaEmpleador(cl.afphabitat.soap.certificado.GetCertDetDeudaRequest parameters) throws java.rmi.RemoteException{
    if (getCertDetalleDeudaEmpleador_PortType == null)
      _initGetCertDetalleDeudaEmpleadorProxy();
    return getCertDetalleDeudaEmpleador_PortType.getCertDetalleDeudaEmpleador(parameters);
  }
  
  
}