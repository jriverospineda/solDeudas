/**
 * GetSolicitudRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.solicitud;

public class GetSolicitudRequest  implements java.io.Serializable {
    private java.math.BigDecimal rutAfiliadoIn;

    private java.lang.String dvAfiliadoIn;

    private java.util.Calendar fechaInicialIn;

    private java.util.Calendar fechaFinalIn;

    private java.lang.String idTipoSolicitud;

    private java.math.BigDecimal folio;

    public GetSolicitudRequest() {
    }

    public GetSolicitudRequest(
           java.math.BigDecimal rutAfiliadoIn,
           java.lang.String dvAfiliadoIn,
           java.util.Calendar fechaInicialIn,
           java.util.Calendar fechaFinalIn,
           java.lang.String idTipoSolicitud,
           java.math.BigDecimal folio) {
           this.rutAfiliadoIn = rutAfiliadoIn;
           this.dvAfiliadoIn = dvAfiliadoIn;
           this.fechaInicialIn = fechaInicialIn;
           this.fechaFinalIn = fechaFinalIn;
           this.idTipoSolicitud = idTipoSolicitud;
           this.folio = folio;
    }


    /**
     * Gets the rutAfiliadoIn value for this GetSolicitudRequest.
     * 
     * @return rutAfiliadoIn
     */
    public java.math.BigDecimal getRutAfiliadoIn() {
        return rutAfiliadoIn;
    }


    /**
     * Sets the rutAfiliadoIn value for this GetSolicitudRequest.
     * 
     * @param rutAfiliadoIn
     */
    public void setRutAfiliadoIn(java.math.BigDecimal rutAfiliadoIn) {
        this.rutAfiliadoIn = rutAfiliadoIn;
    }


    /**
     * Gets the dvAfiliadoIn value for this GetSolicitudRequest.
     * 
     * @return dvAfiliadoIn
     */
    public java.lang.String getDvAfiliadoIn() {
        return dvAfiliadoIn;
    }


    /**
     * Sets the dvAfiliadoIn value for this GetSolicitudRequest.
     * 
     * @param dvAfiliadoIn
     */
    public void setDvAfiliadoIn(java.lang.String dvAfiliadoIn) {
        this.dvAfiliadoIn = dvAfiliadoIn;
    }


    /**
     * Gets the fechaInicialIn value for this GetSolicitudRequest.
     * 
     * @return fechaInicialIn
     */
    public java.util.Calendar getFechaInicialIn() {
        return fechaInicialIn;
    }


    /**
     * Sets the fechaInicialIn value for this GetSolicitudRequest.
     * 
     * @param fechaInicialIn
     */
    public void setFechaInicialIn(java.util.Calendar fechaInicialIn) {
        this.fechaInicialIn = fechaInicialIn;
    }


    /**
     * Gets the fechaFinalIn value for this GetSolicitudRequest.
     * 
     * @return fechaFinalIn
     */
    public java.util.Calendar getFechaFinalIn() {
        return fechaFinalIn;
    }


    /**
     * Sets the fechaFinalIn value for this GetSolicitudRequest.
     * 
     * @param fechaFinalIn
     */
    public void setFechaFinalIn(java.util.Calendar fechaFinalIn) {
        this.fechaFinalIn = fechaFinalIn;
    }


    /**
     * Gets the idTipoSolicitud value for this GetSolicitudRequest.
     * 
     * @return idTipoSolicitud
     */
    public java.lang.String getIdTipoSolicitud() {
        return idTipoSolicitud;
    }


    /**
     * Sets the idTipoSolicitud value for this GetSolicitudRequest.
     * 
     * @param idTipoSolicitud
     */
    public void setIdTipoSolicitud(java.lang.String idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }


    /**
     * Gets the folio value for this GetSolicitudRequest.
     * 
     * @return folio
     */
    public java.math.BigDecimal getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this GetSolicitudRequest.
     * 
     * @param folio
     */
    public void setFolio(java.math.BigDecimal folio) {
        this.folio = folio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSolicitudRequest)) return false;
        GetSolicitudRequest other = (GetSolicitudRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rutAfiliadoIn==null && other.getRutAfiliadoIn()==null) || 
             (this.rutAfiliadoIn!=null &&
              this.rutAfiliadoIn.equals(other.getRutAfiliadoIn()))) &&
            ((this.dvAfiliadoIn==null && other.getDvAfiliadoIn()==null) || 
             (this.dvAfiliadoIn!=null &&
              this.dvAfiliadoIn.equals(other.getDvAfiliadoIn()))) &&
            ((this.fechaInicialIn==null && other.getFechaInicialIn()==null) || 
             (this.fechaInicialIn!=null &&
              this.fechaInicialIn.equals(other.getFechaInicialIn()))) &&
            ((this.fechaFinalIn==null && other.getFechaFinalIn()==null) || 
             (this.fechaFinalIn!=null &&
              this.fechaFinalIn.equals(other.getFechaFinalIn()))) &&
            ((this.idTipoSolicitud==null && other.getIdTipoSolicitud()==null) || 
             (this.idTipoSolicitud!=null &&
              this.idTipoSolicitud.equals(other.getIdTipoSolicitud()))) &&
            ((this.folio==null && other.getFolio()==null) || 
             (this.folio!=null &&
              this.folio.equals(other.getFolio())));
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
        if (getRutAfiliadoIn() != null) {
            _hashCode += getRutAfiliadoIn().hashCode();
        }
        if (getDvAfiliadoIn() != null) {
            _hashCode += getDvAfiliadoIn().hashCode();
        }
        if (getFechaInicialIn() != null) {
            _hashCode += getFechaInicialIn().hashCode();
        }
        if (getFechaFinalIn() != null) {
            _hashCode += getFechaFinalIn().hashCode();
        }
        if (getIdTipoSolicitud() != null) {
            _hashCode += getIdTipoSolicitud().hashCode();
        }
        if (getFolio() != null) {
            _hashCode += getFolio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSolicitudRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", ">getSolicitudRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutAfiliadoIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", "rutAfiliadoIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvAfiliadoIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", "dvAfiliadoIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicialIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", "fechaInicialIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinalIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", "fechaFinalIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", "idTipoSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/solicitud", "folio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
