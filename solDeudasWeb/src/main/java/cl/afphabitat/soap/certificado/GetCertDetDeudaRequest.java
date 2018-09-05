/**
 * GetCertDetDeudaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertDetDeudaRequest  implements java.io.Serializable {
    private java.lang.String codigoUsuario;

    private java.math.BigDecimal rutEmpresa;

    private java.lang.String fechaInicio;

    private java.lang.String fechaTermino;

    public GetCertDetDeudaRequest() {
    }

    public GetCertDetDeudaRequest(
           java.lang.String codigoUsuario,
           java.math.BigDecimal rutEmpresa,
           java.lang.String fechaInicio,
           java.lang.String fechaTermino) {
           this.codigoUsuario = codigoUsuario;
           this.rutEmpresa = rutEmpresa;
           this.fechaInicio = fechaInicio;
           this.fechaTermino = fechaTermino;
    }


    /**
     * Gets the codigoUsuario value for this GetCertDetDeudaRequest.
     * 
     * @return codigoUsuario
     */
    public java.lang.String getCodigoUsuario() {
        return codigoUsuario;
    }


    /**
     * Sets the codigoUsuario value for this GetCertDetDeudaRequest.
     * 
     * @param codigoUsuario
     */
    public void setCodigoUsuario(java.lang.String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }


    /**
     * Gets the rutEmpresa value for this GetCertDetDeudaRequest.
     * 
     * @return rutEmpresa
     */
    public java.math.BigDecimal getRutEmpresa() {
        return rutEmpresa;
    }


    /**
     * Sets the rutEmpresa value for this GetCertDetDeudaRequest.
     * 
     * @param rutEmpresa
     */
    public void setRutEmpresa(java.math.BigDecimal rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }


    /**
     * Gets the fechaInicio value for this GetCertDetDeudaRequest.
     * 
     * @return fechaInicio
     */
    public java.lang.String getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this GetCertDetDeudaRequest.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(java.lang.String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaTermino value for this GetCertDetDeudaRequest.
     * 
     * @return fechaTermino
     */
    public java.lang.String getFechaTermino() {
        return fechaTermino;
    }


    /**
     * Sets the fechaTermino value for this GetCertDetDeudaRequest.
     * 
     * @param fechaTermino
     */
    public void setFechaTermino(java.lang.String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCertDetDeudaRequest)) return false;
        GetCertDetDeudaRequest other = (GetCertDetDeudaRequest) obj;
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
            ((this.rutEmpresa==null && other.getRutEmpresa()==null) || 
             (this.rutEmpresa!=null &&
              this.rutEmpresa.equals(other.getRutEmpresa()))) &&
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
        if (getRutEmpresa() != null) {
            _hashCode += getRutEmpresa().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetCertDetDeudaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", ">getCertDetDeudaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "codigoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "rutEmpresa"));
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
