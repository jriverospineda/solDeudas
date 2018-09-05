/**
 * GetCertDeudaTotalEmpleador_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertDeudaTotalEmpleador_ServiceLocator extends org.apache.axis.client.Service implements cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_Service {

    public GetCertDeudaTotalEmpleador_ServiceLocator() {
    }


    public GetCertDeudaTotalEmpleador_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetCertDeudaTotalEmpleador_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getCertDeudaTotalEmpleadorSOAP
    private java.lang.String getCertDeudaTotalEmpleadorSOAP_address = "http://afphabitat.cl/soap/certificado";

    public java.lang.String getgetCertDeudaTotalEmpleadorSOAPAddress() {
        return getCertDeudaTotalEmpleadorSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getCertDeudaTotalEmpleadorSOAPWSDDServiceName = "getCertDeudaTotalEmpleadorSOAP";

    public java.lang.String getgetCertDeudaTotalEmpleadorSOAPWSDDServiceName() {
        return getCertDeudaTotalEmpleadorSOAPWSDDServiceName;
    }

    public void setgetCertDeudaTotalEmpleadorSOAPWSDDServiceName(java.lang.String name) {
        getCertDeudaTotalEmpleadorSOAPWSDDServiceName = name;
    }

    public cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_PortType getgetCertDeudaTotalEmpleadorSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCertDeudaTotalEmpleadorSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetCertDeudaTotalEmpleadorSOAP(endpoint);
    }

    public cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_PortType getgetCertDeudaTotalEmpleadorSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleadorSOAPStub _stub = new cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleadorSOAPStub(portAddress, this);
            _stub.setPortName(getgetCertDeudaTotalEmpleadorSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetCertDeudaTotalEmpleadorSOAPEndpointAddress(java.lang.String address) {
        getCertDeudaTotalEmpleadorSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleador_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleadorSOAPStub _stub = new cl.afphabitat.soap.certificado.GetCertDeudaTotalEmpleadorSOAPStub(new java.net.URL(getCertDeudaTotalEmpleadorSOAP_address), this);
                _stub.setPortName(getgetCertDeudaTotalEmpleadorSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("getCertDeudaTotalEmpleadorSOAP".equals(inputPortName)) {
            return getgetCertDeudaTotalEmpleadorSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "getCertDeudaTotalEmpleador");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "getCertDeudaTotalEmpleadorSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getCertDeudaTotalEmpleadorSOAP".equals(portName)) {
            setgetCertDeudaTotalEmpleadorSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
