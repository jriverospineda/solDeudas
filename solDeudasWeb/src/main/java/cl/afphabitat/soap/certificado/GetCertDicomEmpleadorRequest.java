/**
 * GetCertDicomEmpleadorRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertDicomEmpleadorRequest  implements java.io.Serializable {
    private java.lang.String codigoUsuario;

    private java.math.BigDecimal rut;

    private java.lang.String fechaInicio;

    private java.lang.String fechaTermino;

    public GetCertDicomEmpleadorRequest() {
    }

    public GetCertDicomEmpleadorRequest(
           java.lang.String codigoUsuario,
           java.math.BigDecimal rut,
           java.lang.String fechaInicio,
           java.lang.String fechaTermino) {
           this.codigoUsuario = codigoUsuario;
           this.rut = rut;
           this.fechaInicio = fechaInicio;
           this.fechaTermino = fechaTermino;
    }


    /**
     * Gets the codigoUsuario value for this GetCertDicomEmpleadorRequest.
     * 
     * @return codigoUsuario
     */
    public java.lang.String getCodigoUsuario() {
        return codigoUsuario;
    }


    /**
     * Sets the codigoUsuario value for this GetCertDicomEmpleadorRequest.
     * 
     * @param codigoUsuario
     */
    public void setCodigoUsuario(java.lang.String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }


    /**
     * Gets the rut value for this GetCertDicomEmpleadorRequest.
     * 
     * @return rut
     */
    public java.math.BigDecimal getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this GetCertDicomEmpleadorRequest.
     * 
     * @param rut
     */
    public void setRut(java.math.BigDecimal rut) {
        this.rut = rut;
    }


    /**
     * Gets the fechaInicio value for this GetCertDicomEmpleadorRequest.
     * 
     * @return fechaInicio
     */
    public java.lang.String getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this GetCertDicomEmpleadorRequest.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(java.lang.String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaTermino value for this GetCertDicomEmpleadorRequest.
     * 
     * @return fechaTermino
     */
    public java.lang.String getFechaTermino() {
        return fechaTermino;
    }


    /**
     * Sets the fechaTermino value for this GetCertDicomEmpleadorRequest.
     * 
     * @param fechaTermino
     */
    public void setFechaTermino(java.lang.String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCertDicomEmpleadorRequest)) return false;
        GetCertDicomEmpleadorRequest other = (GetCertDicomEmpleadorRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoUsuario==null && other.getCodigoUsuario()==null) || 
             (this.codigoUsuario!=null &&
              this.codigoUsuario.equals(other.getCodigoUsuario()))) &&
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
            ((this.fechaTermino==null && other.getFechaTermino()==null) || 
             (this.fechaTermino!=null &&
              this.fechaTermino.equals(other.getFechaTermino())));
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
        if (getCodigoUsuario() != null) {
            _hashCode += getCodigoUsuario().hashCode();
        }
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getFechaTermino() != null) {
            _hashCode += getFechaTermino().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCertDicomEmpleadorRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", ">getCertDicomEmpleadorRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "codigoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "fechaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaTermino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "fechaTermino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
