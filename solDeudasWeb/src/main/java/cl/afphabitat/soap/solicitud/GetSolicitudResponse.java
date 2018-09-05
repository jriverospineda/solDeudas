/**
 * GetSolicitudResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.solicitud;

public class GetSolicitudResponse  implements java.io.Serializable {
    private cl.afphabitat.soap.solicitud.GetSolicitudResponseInformacionSolicitudSolicitud[] informacionSolicitud;

    private cl.afphabitat.soap.solicitud.GetSolicitudResponseCondicion condicion;

    public GetSolicitudResponse() {
    }

    public GetSolicitudResponse(
           cl.afphabitat.soap.solicitud.GetSolicitudResponseInformacionSolicitudSolicitud[] informacionSolicitud,
           cl.afphabitat.soap.solicitud.GetSolicitudResponseCondicion condicion) {
           this.informacionSolicitud = informacionSolicitud;
           this.condicion = condicion;
    }


    /**
     * Gets the informacionSolicitud value for this GetSolicitudResponse.
     * 
     * @return informacionSolicitud
     */
    public cl.afphabitat.soap.solicitud.GetSolicitudResponseInformacionSolicitudSolicitud[] getInformacionSolicitud() {
        return informacionSolicitud;
    }


    /**
     * Sets the informacionSolicitud value for this GetSolicitudResponse.
     * 
     * @param informacionSolicitud
     */
    public void setInformacionSolicitud(cl.afphabitat.soap.solicitud.GetSolicitudResponseInformacionSolicitudSolicitud[] informacionSolicitud) {
        this.informacionSolicitud = informacionSolicitud;
    }


    /**
     * Gets the condicion value for this GetSolicitudResponse.
     * 
     * @return condicion
     */
    public cl.afphabitat.soap.solicitud.GetSolicitudResponseCondicion getCondicion() {
        return condicion;
    }


    /**
     * Sets the condicion value for this GetSolicitudResponse.
     * 
     * @param condicion
     */
    public void setCondicion(cl.afphabitat.soap.solicitud.GetSolicitudResponseCondicion condicion) {
        this.condicion = condicion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSolicitudResponse)) return false;
        GetSolicitudResponse other = (GetSolicitudResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.informacionSolicitud==null && other.getInformacionSolicitud()==null) || 
             (this.informacionSolicitud!=null &&
              java.util.Arrays.equals(this.informacionSolicitud, other.getInformacionSolicitud()))) &&
            ((this.condicion==null && other.getCondicion()==null) || 
             (this.condicion!=null &&
              this.condicion.equals(other.getCondicion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInformacionSolicitud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformacionSolicitud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformacionSolicitud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCondicion() != null) {
            _hashCode += getCondicion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSolicitudResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", ">getSolicitudResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacionSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", ">>>getSolicitudResponse>informacionSolicitud>solicitud"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "solicitud"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", ">>getSolicitudResponse>condicion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
