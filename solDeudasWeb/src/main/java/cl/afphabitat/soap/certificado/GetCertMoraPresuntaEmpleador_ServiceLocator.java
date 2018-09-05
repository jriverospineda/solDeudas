/**
 * GetCertMoraPresuntaEmpleador_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertMoraPresuntaEmpleador_ServiceLocator extends org.apache.axis.client.Service implements cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_Service {

    public GetCertMoraPresuntaEmpleador_ServiceLocator() {
    }


    public GetCertMoraPresuntaEmpleador_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetCertMoraPresuntaEmpleador_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getCertMoraPresuntaEmpleadorSOAP
    private java.lang.String getCertMoraPresuntaEmpleadorSOAP_address = "http://127.0.0.1:7101/OSBGetCertMoraPresuntaEmpleador/Service/proxy/GetCertMoraPresuntaEmpleador";

    public java.lang.String getgetCertMoraPresuntaEmpleadorSOAPAddress() {
        return getCertMoraPresuntaEmpleadorSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getCertMoraPresuntaEmpleadorSOAPWSDDServiceName = "getCertMoraPresuntaEmpleadorSOAP";

    public java.lang.String getgetCertMoraPresuntaEmpleadorSOAPWSDDServiceName() {
        return getCertMoraPresuntaEmpleadorSOAPWSDDServiceName;
    }

    public void setgetCertMoraPresuntaEmpleadorSOAPWSDDServiceName(java.lang.String name) {
        getCertMoraPresuntaEmpleadorSOAPWSDDServiceName = name;
    }

    public cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_PortType getgetCertMoraPresuntaEmpleadorSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCertMoraPresuntaEmpleadorSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetCertMoraPresuntaEmpleadorSOAP(endpoint);
    }

    public cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_PortType getgetCertMoraPresuntaEmpleadorSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleadorSOAPStub _stub = new cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleadorSOAPStub(portAddress, this);
            _stub.setPortName(getgetCertMoraPresuntaEmpleadorSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetCertMoraPresuntaEmpleadorSOAPEndpointAddress(java.lang.String address) {
        getCertMoraPresuntaEmpleadorSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleador_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleadorSOAPStub _stub = new cl.afphabitat.soap.certificado.GetCertMoraPresuntaEmpleadorSOAPStub(new java.net.URL(getCertMoraPresuntaEmpleadorSOAP_address), this);
                _stub.setPortName(getgetCertMoraPresuntaEmpleadorSOAPWSDDServiceName());
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
        if ("getCertMoraPresuntaEmpleadorSOAP".equals(inputPortName)) {
            return getgetCertMoraPresuntaEmpleadorSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "getCertMoraPresuntaEmpleador");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "getCertMoraPresuntaEmpleadorSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getCertMoraPresuntaEmpleadorSOAP".equals(portName)) {
            setgetCertMoraPresuntaEmpleadorSOAPEndpointAddress(address);
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
