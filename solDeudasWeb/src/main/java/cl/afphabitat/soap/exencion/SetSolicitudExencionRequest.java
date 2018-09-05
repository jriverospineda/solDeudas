/**
 * SetSolicitudExencionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.exencion;

public class SetSolicitudExencionRequest  implements java.io.Serializable {
    private java.math.BigDecimal rutRepresentante;

    private java.lang.String dvRepresentante;

    private java.math.BigDecimal rutAfiliado;

    private java.lang.String dvAfiliado;

    private int idSucursal;

    private java.math.BigDecimal rutEmpleado;

    private java.lang.String dvEmpleado;

    private int idTipoCanal;

    public SetSolicitudExencionRequest() {
    }

    public SetSolicitudExencionRequest(
           java.math.BigDecimal rutRepresentante,
           java.lang.String dvRepresentante,
           java.math.BigDecimal rutAfiliado,
           java.lang.String dvAfiliado,
           int idSucursal,
           java.math.BigDecimal rutEmpleado,
           java.lang.String dvEmpleado,
           int idTipoCanal) {
           this.rutRepresentante = rutRepresentante;
           this.dvRepresentante = dvRepresentante;
           this.rutAfiliado = rutAfiliado;
           this.dvAfiliado = dvAfiliado;
           this.idSucursal = idSucursal;
           this.rutEmpleado = rutEmpleado;
           this.dvEmpleado = dvEmpleado;
           this.idTipoCanal = idTipoCanal;
    }


    /**
     * Gets the rutRepresentante value for this SetSolicitudExencionRequest.
     * 
     * @return rutRepresentante
     */
    public java.math.BigDecimal getRutRepresentante() {
        return rutRepresentante;
    }


    /**
     * Sets the rutRepresentante value for this SetSolicitudExencionRequest.
     * 
     * @param rutRepresentante
     */
    public void setRutRepresentante(java.math.BigDecimal rutRepresentante) {
        this.rutRepresentante = rutRepresentante;
    }


    /**
     * Gets the dvRepresentante value for this SetSolicitudExencionRequest.
     * 
     * @return dvRepresentante
     */
    public java.lang.String getDvRepresentante() {
        return dvRepresentante;
    }


    /**
     * Sets the dvRepresentante value for this SetSolicitudExencionRequest.
     * 
     * @param dvRepresentante
     */
    public void setDvRepresentante(java.lang.String dvRepresentante) {
        this.dvRepresentante = dvRepresentante;
    }


    /**
     * Gets the rutAfiliado value for this SetSolicitudExencionRequest.
     * 
     * @return rutAfiliado
     */
    public java.math.BigDecimal getRutAfiliado() {
        return rutAfiliado;
    }


    /**
     * Sets the rutAfiliado value for this SetSolicitudExencionRequest.
     * 
     * @param rutAfiliado
     */
    public void setRutAfiliado(java.math.BigDecimal rutAfiliado) {
        this.rutAfiliado = rutAfiliado;
    }


    /**
     * Gets the dvAfiliado value for this SetSolicitudExencionRequest.
     * 
     * @return dvAfiliado
     */
    public java.lang.String getDvAfiliado() {
        return dvAfiliado;
    }


    /**
     * Sets the dvAfiliado value for this SetSolicitudExencionRequest.
     * 
     * @param dvAfiliado
     */
    public void setDvAfiliado(java.lang.String dvAfiliado) {
        this.dvAfiliado = dvAfiliado;
    }


    /**
     * Gets the idSucursal value for this SetSolicitudExencionRequest.
     * 
     * @return idSucursal
     */
    public int getIdSucursal() {
        return idSucursal;
    }


    /**
     * Sets the idSucursal value for this SetSolicitudExencionRequest.
     * 
     * @param idSucursal
     */
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }


    /**
     * Gets the rutEmpleado value for this SetSolicitudExencionRequest.
     * 
     * @return rutEmpleado
     */
    public java.math.BigDecimal getRutEmpleado() {
        return rutEmpleado;
    }


    /**
     * Sets the rutEmpleado value for this SetSolicitudExencionRequest.
     * 
     * @param rutEmpleado
     */
    public void setRutEmpleado(java.math.BigDecimal rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }


    /**
     * Gets the dvEmpleado value for this SetSolicitudExencionRequest.
     * 
     * @return dvEmpleado
     */
    public java.lang.String getDvEmpleado() {
        return dvEmpleado;
    }


    /**
     * Sets the dvEmpleado value for this SetSolicitudExencionRequest.
     * 
     * @param dvEmpleado
     */
    public void setDvEmpleado(java.lang.String dvEmpleado) {
        this.dvEmpleado = dvEmpleado;
    }


    /**
     * Gets the idTipoCanal value for this SetSolicitudExencionRequest.
     * 
     * @return idTipoCanal
     */
    public int getIdTipoCanal() {
        return idTipoCanal;
    }


    /**
     * Sets the idTipoCanal value for this SetSolicitudExencionRequest.
     * 
     * @param idTipoCanal
     */
    public void setIdTipoCanal(int idTipoCanal) {
        this.idTipoCanal = idTipoCanal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetSolicitudExencionRequest)) return false;
        SetSolicitudExencionRequest other = (SetSolicitudExencionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rutRepresentante==null && other.getRutRepresentante()==null) || 
             (this.rutRepresentante!=null &&
              this.rutRepresentante.equals(other.getRutRepresentante()))) &&
            ((this.dvRepresentante==null && other.getDvRepresentante()==null) || 
             (this.dvRepresentante!=null &&
              this.dvRepresentante.equals(other.getDvRepresentante()))) &&
            ((this.rutAfiliado==null && other.getRutAfiliado()==null) || 
             (this.rutAfiliado!=null &&
              this.rutAfiliado.equals(other.getRutAfiliado()))) &&
            ((this.dvAfiliado==null && other.getDvAfiliado()==null) || 
             (this.dvAfiliado!=null &&
              this.dvAfiliado.equals(other.getDvAfiliado()))) &&
            this.idSucursal == other.getIdSucursal() &&
            ((this.rutEmpleado==null && other.getRutEmpleado()==null) || 
             (this.rutEmpleado!=null &&
              this.rutEmpleado.equals(other.getRutEmpleado()))) &&
            ((this.dvEmpleado==null && other.getDvEmpleado()==null) || 
             (this.dvEmpleado!=null &&
              this.dvEmpleado.equals(other.getDvEmpleado()))) &&
            this.idTipoCanal == other.getIdTipoCanal();
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
        if (getRutRepresentante() != null) {
            _hashCode += getRutRepresentante().hashCode();
        }
        if (getDvRepresentante() != null) {
            _hashCode += getDvRepresentante().hashCode();
        }
        if (getRutAfiliado() != null) {
            _hashCode += getRutAfiliado().hashCode();
        }
        if (getDvAfiliado() != null) {
            _hashCode += getDvAfiliado().hashCode();
        }
        _hashCode += getIdSucursal();
        if (getRutEmpleado() != null) {
            _hashCode += getRutEmpleado().hashCode();
        }
        if (getDvEmpleado() != null) {
            _hashCode += getDvEmpleado().hashCode();
        }
        _hashCode += getIdTipoCanal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetSolicitudExencionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", ">setSolicitudExencionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutRepresentante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "rutRepresentante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvRepresentante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "dvRepresentante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutAfiliado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "rutAfiliado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvAfiliado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "dvAfiliado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "idSucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutEmpleado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "rutEmpleado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvEmpleado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "dvEmpleado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoCanal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/exencion", "idTipoCanal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
