/**
 * GetCertDicomEmpleador_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertDicomEmpleador_ServiceLocator extends org.apache.axis.client.Service implements cl.afphabitat.soap.certificado.GetCertDicomEmpleador_Service {

    public GetCertDicomEmpleador_ServiceLocator() {
    }


    public GetCertDicomEmpleador_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetCertDicomEmpleador_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getCertDicomEmpleadorSOAP
    private java.lang.String getCertDicomEmpleadorSOAP_address = "http://localhost:8081/OSBGetCertDicomEmpleador/Service/proxy/GetCertDicomEmpleador";

    public java.lang.String getgetCertDicomEmpleadorSOAPAddress() {
        return getCertDicomEmpleadorSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getCertDicomEmpleadorSOAPWSDDServiceName = "getCertDicomEmpleadorSOAP";

    public java.lang.String getgetCertDicomEmpleadorSOAPWSDDServiceName() {
        return getCertDicomEmpleadorSOAPWSDDServiceName;
    }

    public void setgetCertDicomEmpleadorSOAPWSDDServiceName(java.lang.String name) {
        getCertDicomEmpleadorSOAPWSDDServiceName = name;
    }

    public cl.afphabitat.soap.certificado.GetCertDicomEmpleador_PortType getgetCertDicomEmpleadorSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCertDicomEmpleadorSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetCertDicomEmpleadorSOAP(endpoint);
    }

    public cl.afphabitat.soap.certificado.GetCertDicomEmpleador_PortType getgetCertDicomEmpleadorSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.afphabitat.soap.certificado.GetCertDicomEmpleadorSOAPStub _stub = new cl.afphabitat.soap.certificado.GetCertDicomEmpleadorSOAPStub(portAddress, this);
            _stub.setPortName(getgetCertDicomEmpleadorSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetCertDicomEmpleadorSOAPEndpointAddress(java.lang.String address) {
        getCertDicomEmpleadorSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.afphabitat.soap.certificado.GetCertDicomEmpleador_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.afphabitat.soap.certificado.GetCertDicomEmpleadorSOAPStub _stub = new cl.afphabitat.soap.certificado.GetCertDicomEmpleadorSOAPStub(new java.net.URL(getCertDicomEmpleadorSOAP_address), this);
                _stub.setPortName(getgetCertDicomEmpleadorSOAPWSDDServiceName());
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
        if ("getCertDicomEmpleadorSOAP".equals(inputPortName)) {
            return getgetCertDicomEmpleadorSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "getCertDicomEmpleador");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "getCertDicomEmpleadorSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getCertDicomEmpleadorSOAP".equals(portName)) {
            setgetCertDicomEmpleadorSOAPEndpointAddress(address);
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
