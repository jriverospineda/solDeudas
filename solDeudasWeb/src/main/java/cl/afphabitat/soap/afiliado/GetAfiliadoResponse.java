/**
 * GetAfiliadoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.afiliado;

public class GetAfiliadoResponse  implements java.io.Serializable {
    private cl.afphabitat.soap.afiliado.GetAfiliadoResponseInformacionAfiliado informacionAfiliado;

    private cl.afphabitat.soap.afiliado.GetAfiliadoResponseCondicion condicion;

    public GetAfiliadoResponse() {
    }

    public GetAfiliadoResponse(
           cl.afphabitat.soap.afiliado.GetAfiliadoResponseInformacionAfiliado informacionAfiliado,
           cl.afphabitat.soap.afiliado.GetAfiliadoResponseCondicion condicion) {
           this.informacionAfiliado = informacionAfiliado;
           this.condicion = condicion;
    }


    /**
     * Gets the informacionAfiliado value for this GetAfiliadoResponse.
     * 
     * @return informacionAfiliado
     */
    public cl.afphabitat.soap.afiliado.GetAfiliadoResponseInformacionAfiliado getInformacionAfiliado() {
        return informacionAfiliado;
    }


    /**
     * Sets the informacionAfiliado value for this GetAfiliadoResponse.
     * 
     * @param informacionAfiliado
     */
    public void setInformacionAfiliado(cl.afphabitat.soap.afiliado.GetAfiliadoResponseInformacionAfiliado informacionAfiliado) {
        this.informacionAfiliado = informacionAfiliado;
    }


    /**
     * Gets the condicion value for this GetAfiliadoResponse.
     * 
     * @return condicion
     */
    public cl.afphabitat.soap.afiliado.GetAfiliadoResponseCondicion getCondicion() {
        return condicion;
    }


    /**
     * Sets the condicion value for this GetAfiliadoResponse.
     * 
     * @param condicion
     */
    public void setCondicion(cl.afphabitat.soap.afiliado.GetAfiliadoResponseCondicion condicion) {
        this.condicion = condicion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAfiliadoResponse)) return false;
        GetAfiliadoResponse other = (GetAfiliadoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.informacionAfiliado==null && other.getInformacionAfiliado()==null) || 
             (this.informacionAfiliado!=null &&
              this.informacionAfiliado.equals(other.getInformacionAfiliado()))) &&
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
        if (getInformacionAfiliado() != null) {
            _hashCode += getInformacionAfiliado().hashCode();
        }
        if (getCondicion() != null) {
            _hashCode += getCondicion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAfiliadoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", ">getAfiliadoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionAfiliado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacionAfiliado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", ">>getAfiliadoResponse>informacionAfiliado"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", ">>getAfiliadoResponse>condicion"));
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
