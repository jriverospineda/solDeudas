/**
 * GetCertDeudaResponseInformacionCertificadoCertificado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.certificado;

public class GetCertDeudaResponseInformacionCertificadoCertificado  implements java.io.Serializable {
    private java.math.BigDecimal idEjecucion;

    private java.util.Calendar fechaRegistro;

    private java.math.BigDecimal nud;

    private java.lang.String origen;

    private java.lang.String periodoCotizacion;

    private java.math.BigDecimal montoOriginalDeuda;

    private java.math.BigDecimal saldoNominal;

    private java.math.BigDecimal reajuste;

    private java.math.BigDecimal intereses;

    private java.math.BigDecimal recargoAFP;

    private java.math.BigDecimal totalFondo;

    private java.math.BigDecimal totalAPagar;

    public GetCertDeudaResponseInformacionCertificadoCertificado() {
    }

    public GetCertDeudaResponseInformacionCertificadoCertificado(
           java.math.BigDecimal idEjecucion,
           java.util.Calendar fechaRegistro,
           java.math.BigDecimal nud,
           java.lang.String origen,
           java.lang.String periodoCotizacion,
           java.math.BigDecimal montoOriginalDeuda,
           java.math.BigDecimal saldoNominal,
           java.math.BigDecimal reajuste,
           java.math.BigDecimal intereses,
           java.math.BigDecimal recargoAFP,
           java.math.BigDecimal totalFondo,
           java.math.BigDecimal totalAPagar) {
           this.idEjecucion = idEjecucion;
           this.fechaRegistro = fechaRegistro;
           this.nud = nud;
           this.origen = origen;
           this.periodoCotizacion = periodoCotizacion;
           this.montoOriginalDeuda = montoOriginalDeuda;
           this.saldoNominal = saldoNominal;
           this.reajuste = reajuste;
           this.intereses = intereses;
           this.recargoAFP = recargoAFP;
           this.totalFondo = totalFondo;
           this.totalAPagar = totalAPagar;
    }


    /**
     * Gets the idEjecucion value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return idEjecucion
     */
    public java.math.BigDecimal getIdEjecucion() {
        return idEjecucion;
    }


    /**
     * Sets the idEjecucion value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param idEjecucion
     */
    public void setIdEjecucion(java.math.BigDecimal idEjecucion) {
        this.idEjecucion = idEjecucion;
    }


    /**
     * Gets the fechaRegistro value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return fechaRegistro
     */
    public java.util.Calendar getFechaRegistro() {
        return fechaRegistro;
    }


    /**
     * Sets the fechaRegistro value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param fechaRegistro
     */
    public void setFechaRegistro(java.util.Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    /**
     * Gets the nud value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return nud
     */
    public java.math.BigDecimal getNud() {
        return nud;
    }


    /**
     * Sets the nud value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param nud
     */
    public void setNud(java.math.BigDecimal nud) {
        this.nud = nud;
    }


    /**
     * Gets the origen value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return origen
     */
    public java.lang.String getOrigen() {
        return origen;
    }


    /**
     * Sets the origen value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param origen
     */
    public void setOrigen(java.lang.String origen) {
        this.origen = origen;
    }


    /**
     * Gets the periodoCotizacion value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return periodoCotizacion
     */
    public java.lang.String getPeriodoCotizacion() {
        return periodoCotizacion;
    }


    /**
     * Sets the periodoCotizacion value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param periodoCotizacion
     */
    public void setPeriodoCotizacion(java.lang.String periodoCotizacion) {
        this.periodoCotizacion = periodoCotizacion;
    }


    /**
     * Gets the montoOriginalDeuda value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return montoOriginalDeuda
     */
    public java.math.BigDecimal getMontoOriginalDeuda() {
        return montoOriginalDeuda;
    }


    /**
     * Sets the montoOriginalDeuda value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param montoOriginalDeuda
     */
    public void setMontoOriginalDeuda(java.math.BigDecimal montoOriginalDeuda) {
        this.montoOriginalDeuda = montoOriginalDeuda;
    }


    /**
     * Gets the saldoNominal value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return saldoNominal
     */
    public java.math.BigDecimal getSaldoNominal() {
        return saldoNominal;
    }


    /**
     * Sets the saldoNominal value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param saldoNominal
     */
    public void setSaldoNominal(java.math.BigDecimal saldoNominal) {
        this.saldoNominal = saldoNominal;
    }


    /**
     * Gets the reajuste value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return reajuste
     */
    public java.math.BigDecimal getReajuste() {
        return reajuste;
    }


    /**
     * Sets the reajuste value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param reajuste
     */
    public void setReajuste(java.math.BigDecimal reajuste) {
        this.reajuste = reajuste;
    }


    /**
     * Gets the intereses value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return intereses
     */
    public java.math.BigDecimal getIntereses() {
        return intereses;
    }


    /**
     * Sets the intereses value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param intereses
     */
    public void setIntereses(java.math.BigDecimal intereses) {
        this.intereses = intereses;
    }


    /**
     * Gets the recargoAFP value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return recargoAFP
     */
    public java.math.BigDecimal getRecargoAFP() {
        return recargoAFP;
    }


    /**
     * Sets the recargoAFP value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param recargoAFP
     */
    public void setRecargoAFP(java.math.BigDecimal recargoAFP) {
        this.recargoAFP = recargoAFP;
    }


    /**
     * Gets the totalFondo value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return totalFondo
     */
    public java.math.BigDecimal getTotalFondo() {
        return totalFondo;
    }


    /**
     * Sets the totalFondo value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param totalFondo
     */
    public void setTotalFondo(java.math.BigDecimal totalFondo) {
        this.totalFondo = totalFondo;
    }


    /**
     * Gets the totalAPagar value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @return totalAPagar
     */
    public java.math.BigDecimal getTotalAPagar() {
        return totalAPagar;
    }


    /**
     * Sets the totalAPagar value for this GetCertDeudaResponseInformacionCertificadoCertificado.
     * 
     * @param totalAPagar
     */
    public void setTotalAPagar(java.math.BigDecimal totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCertDeudaResponseInformacionCertificadoCertificado)) return false;
        GetCertDeudaResponseInformacionCertificadoCertificado other = (GetCertDeudaResponseInformacionCertificadoCertificado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idEjecucion==null && other.getIdEjecucion()==null) || 
             (this.idEjecucion!=null &&
              this.idEjecucion.equals(other.getIdEjecucion()))) &&
            ((this.fechaRegistro==null && other.getFechaRegistro()==null) || 
             (this.fechaRegistro!=null &&
              this.fechaRegistro.equals(other.getFechaRegistro()))) &&
            ((this.nud==null && other.getNud()==null) || 
             (this.nud!=null &&
              this.nud.equals(other.getNud()))) &&
            ((this.origen==null && other.getOrigen()==null) || 
             (this.origen!=null &&
              this.origen.equals(other.getOrigen()))) &&
            ((this.periodoCotizacion==null && other.getPeriodoCotizacion()==null) || 
             (this.periodoCotizacion!=null &&
              this.periodoCotizacion.equals(other.getPeriodoCotizacion()))) &&
            ((this.montoOriginalDeuda==null && other.getMontoOriginalDeuda()==null) || 
             (this.montoOriginalDeuda!=null &&
              this.montoOriginalDeuda.equals(other.getMontoOriginalDeuda()))) &&
            ((this.saldoNominal==null && other.getSaldoNominal()==null) || 
             (this.saldoNominal!=null &&
              this.saldoNominal.equals(other.getSaldoNominal()))) &&
            ((this.reajuste==null && other.getReajuste()==null) || 
             (this.reajuste!=null &&
              this.reajuste.equals(other.getReajuste()))) &&
            ((this.intereses==null && other.getIntereses()==null) || 
             (this.intereses!=null &&
              this.intereses.equals(other.getIntereses()))) &&
            ((this.recargoAFP==null && other.getRecargoAFP()==null) || 
             (this.recargoAFP!=null &&
              this.recargoAFP.equals(other.getRecargoAFP()))) &&
            ((this.totalFondo==null && other.getTotalFondo()==null) || 
             (this.totalFondo!=null &&
              this.totalFondo.equals(other.getTotalFondo()))) &&
            ((this.totalAPagar==null && other.getTotalAPagar()==null) || 
             (this.totalAPagar!=null &&
              this.totalAPagar.equals(other.getTotalAPagar())));
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
        if (getIdEjecucion() != null) {
            _hashCode += getIdEjecucion().hashCode();
        }
        if (getFechaRegistro() != null) {
            _hashCode += getFechaRegistro().hashCode();
        }
        if (getNud() != null) {
            _hashCode += getNud().hashCode();
        }
        if (getOrigen() != null) {
            _hashCode += getOrigen().hashCode();
        }
        if (getPeriodoCotizacion() != null) {
            _hashCode += getPeriodoCotizacion().hashCode();
        }
        if (getMontoOriginalDeuda() != null) {
            _hashCode += getMontoOriginalDeuda().hashCode();
        }
        if (getSaldoNominal() != null) {
            _hashCode += getSaldoNominal().hashCode();
        }
        if (getReajuste() != null) {
            _hashCode += getReajuste().hashCode();
        }
        if (getIntereses() != null) {
            _hashCode += getIntereses().hashCode();
        }
        if (getRecargoAFP() != null) {
            _hashCode += getRecargoAFP().hashCode();
        }
        if (getTotalFondo() != null) {
            _hashCode += getTotalFondo().hashCode();
        }
        if (getTotalAPagar() != null) {
            _hashCode += getTotalAPagar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCertDeudaResponseInformacionCertificadoCertificado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", ">>>getCertDeudaResponse>informacionCertificado>certificado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEjecucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "idEjecucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "fechaRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "nud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "origen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoCotizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "periodoCotizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoOriginalDeuda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "montoOriginalDeuda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoNominal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "saldoNominal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reajuste");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "reajuste"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intereses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "intereses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recargoAFP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "recargoAFP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFondo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "totalFondo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAPagar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/certificado", "totalAPagar"));
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
