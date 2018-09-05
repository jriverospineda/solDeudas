/**
 * GetEmpleador_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.empleador;

public class GetEmpleador_ServiceLocator extends org.apache.axis.client.Service implements cl.afphabitat.soap.empleador.GetEmpleador_Service {

    public GetEmpleador_ServiceLocator() {
    }


    public GetEmpleador_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetEmpleador_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getEmpleadorSOAP
    private java.lang.String getEmpleadorSOAP_address = "http://afphabitat.cl/soap/empleador";

    public java.lang.String getgetEmpleadorSOAPAddress() {
        return getEmpleadorSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getEmpleadorSOAPWSDDServiceName = "getEmpleadorSOAP";

    public java.lang.String getgetEmpleadorSOAPWSDDServiceName() {
        return getEmpleadorSOAPWSDDServiceName;
    }

    public void setgetEmpleadorSOAPWSDDServiceName(java.lang.String name) {
        getEmpleadorSOAPWSDDServiceName = name;
    }

    public cl.afphabitat.soap.empleador.GetEmpleador_PortType getgetEmpleadorSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getEmpleadorSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetEmpleadorSOAP(endpoint);
    }

    public cl.afphabitat.soap.empleador.GetEmpleador_PortType getgetEmpleadorSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.afphabitat.soap.empleador.GetEmpleadorSOAPStub _stub = new cl.afphabitat.soap.empleador.GetEmpleadorSOAPStub(portAddress, this);
            _stub.setPortName(getgetEmpleadorSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetEmpleadorSOAPEndpointAddress(java.lang.String address) {
        getEmpleadorSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.afphabitat.soap.empleador.GetEmpleador_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.afphabitat.soap.empleador.GetEmpleadorSOAPStub _stub = new cl.afphabitat.soap.empleador.GetEmpleadorSOAPStub(new java.net.URL(getEmpleadorSOAP_address), this);
                _stub.setPortName(getgetEmpleadorSOAPWSDDServiceName());
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
        if ("getEmpleadorSOAP".equals(inputPortName)) {
            return getgetEmpleadorSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://afphabitat.cl/soap/empleador", "getEmpleador");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://afphabitat.cl/soap/empleador", "getEmpleadorSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getEmpleadorSOAP".equals(portName)) {
            setgetEmpleadorSOAPEndpointAddress(address);
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
