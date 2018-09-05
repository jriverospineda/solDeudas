/**
 * GetEmpleadorResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.empleador;

public class GetEmpleadorResponse  implements java.io.Serializable {
    private cl.afphabitat.soap.empleador.GetEmpleadorResponseInformacionEmpleador informacionEmpleador;

    private cl.afphabitat.soap.empleador.GetEmpleadorResponseCondicion condicion;

    public GetEmpleadorResponse() {
    }

    public GetEmpleadorResponse(
           cl.afphabitat.soap.empleador.GetEmpleadorResponseInformacionEmpleador informacionEmpleador,
           cl.afphabitat.soap.empleador.GetEmpleadorResponseCondicion condicion) {
           this.informacionEmpleador = informacionEmpleador;
           this.condicion = condicion;
    }


    /**
     * Gets the informacionEmpleador value for this GetEmpleadorResponse.
     * 
     * @return informacionEmpleador
     */
    public cl.afphabitat.soap.empleador.GetEmpleadorResponseInformacionEmpleador getInformacionEmpleador() {
        return informacionEmpleador;
    }


    /**
     * Sets the informacionEmpleador value for this GetEmpleadorResponse.
     * 
     * @param informacionEmpleador
     */
    public void setInformacionEmpleador(cl.afphabitat.soap.empleador.GetEmpleadorResponseInformacionEmpleador informacionEmpleador) {
        this.informacionEmpleador = informacionEmpleador;
    }


    /**
     * Gets the condicion value for this GetEmpleadorResponse.
     * 
     * @return condicion
     */
    public cl.afphabitat.soap.empleador.GetEmpleadorResponseCondicion getCondicion() {
        return condicion;
    }


    /**
     * Sets the condicion value for this GetEmpleadorResponse.
     * 
     * @param condicion
     */
    public void setCondicion(cl.afphabitat.soap.empleador.GetEmpleadorResponseCondicion condicion) {
        this.condicion = condicion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEmpleadorResponse)) return false;
        GetEmpleadorResponse other = (GetEmpleadorResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.informacionEmpleador==null && other.getInformacionEmpleador()==null) || 
             (this.informacionEmpleador!=null &&
              this.informacionEmpleador.equals(other.getInformacionEmpleador()))) &&
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
        if (getInformacionEmpleador() != null) {
            _hashCode += getInformacionEmpleador().hashCode();
        }
        if (getCondicion() != null) {
            _hashCode += getCondicion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEmpleadorResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/empleador", ">getEmpleadorResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionEmpleador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacionEmpleador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/empleador", ">>getEmpleadorResponse>informacionEmpleador"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/empleador", ">>getEmpleadorResponse>condicion"));
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
