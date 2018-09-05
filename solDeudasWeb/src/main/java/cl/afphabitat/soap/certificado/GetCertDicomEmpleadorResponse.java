/**
 * GetCertDicomEmpleadorResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertDicomEmpleadorResponse  implements java.io.Serializable {
    private cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseInformacionCertificadoCertificado[] informacionCertificado;

    private cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseCondicion condicion;

    public GetCertDicomEmpleadorResponse() {
    }

    public GetCertDicomEmpleadorResponse(
           cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseInformacionCertificadoCertificado[] informacionCertificado,
           cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseCondicion condicion) {
           this.informacionCertificado = informacionCertificado;
           this.condicion = condicion;
    }


    /**
     * Gets the informacionCertificado value for this GetCertDicomEmpleadorResponse.
     * 
     * @return informacionCertificado
     */
    public cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseInformacionCertificadoCertificado[] getInformacionCertificado() {
        return informacionCertificado;
    }


    /**
     * Sets the informacionCertificado value for this GetCertDicomEmpleadorResponse.
     * 
     * @param informacionCertificado
     */
    public void setInformacionCertificado(cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseInformacionCertificadoCertificado[] informacionCertificado) {
        this.informacionCertificado = informacionCertificado;
    }


    /**
     * Gets the condicion value for this GetCertDicomEmpleadorResponse.
     * 
     * @return condicion
     */
    public cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseCondicion getCondicion() {
        return condicion;
    }


    /**
     * Sets the condicion value for this GetCertDicomEmpleadorResponse.
     * 
     * @param condicion
     */
    public void setCondicion(cl.afphabitat.soap.certificado.GetCertDicomEmpleadorResponseCondicion condicion) {
        this.condicion = condicion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCertDicomEmpleadorResponse)) return false;
        GetCertDicomEmpleadorResponse other = (GetCertDicomEmpleadorResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.informacionCertificado==null && other.getInformacionCertificado()==null) || 
             (this.informacionCertificado!=null &&
              java.util.Arrays.equals(this.informacionCertificado, other.getInformacionCertificado()))) &&
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
        if (getInformacionCertificado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformacionCertificado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformacionCertificado(), i);
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
        new org.apache.axis.description.TypeDesc(GetCertDicomEmpleadorResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", ">getCertDicomEmpleadorResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informacionCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", ">>>getCertDicomEmpleadorResponse>informacionCertificado>certificado"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "certificado"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", ">>getCertDicomEmpleadorResponse>condicion"));
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
