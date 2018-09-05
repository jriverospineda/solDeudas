/**
 * GetAfiliadoResponseInformacionAfiliado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.afphabitat.soap.afiliado;

public class GetAfiliadoResponseInformacionAfiliado  implements java.io.Serializable {
    private java.math.BigDecimal idMaePersona;

    private java.math.BigDecimal idTipoTrabajador;

    private java.math.BigDecimal idClaseCotizante;

    private java.math.BigDecimal idCodActividadEconomica;

    private java.math.BigDecimal idMedioEnvio;

    private java.math.BigDecimal idTipoPersona;

    private java.math.BigDecimal rutMaePersona;

    private java.lang.String codPersona;

    private java.lang.String dvMaePersona;

    private java.lang.String apellidoPaterno;

    private java.lang.String apellidoMaterno;

    private java.lang.String nombrePrimer;

    private java.lang.String nombreSegundo;

    private java.lang.String razonSocial;

    private java.lang.String codSexo;

    private java.util.Calendar fechaNacimiento;

    private java.lang.String lugarNacimiento;

    private java.util.Calendar fechaAfiliacion;

    private java.util.Calendar fechaIncorporacion;

    private java.lang.String email;

    private java.lang.String sistemaSalud;

    private java.lang.String regimenPrevisional;

    private java.lang.String codControl;

    private java.math.BigDecimal mtoRentaImponible;

    private java.util.Calendar fechaVerificacion;

    private java.lang.String audCreadoPor;

    private java.util.Calendar audFechaCreacion;

    private java.lang.String audModificadoPor;

    private java.util.Calendar audFechaModificacion;

    private java.math.BigDecimal idTipoNivelEstudio;

    private java.math.BigDecimal idTipoEstadoCivil;

    private java.util.Calendar fechaFallecimiento;

    private java.math.BigDecimal idEntidadMulti;

    private java.math.BigDecimal indCartolaDet;

    private java.lang.String codVendedor;

    private java.math.BigDecimal rutVendedor;

    private java.lang.String dvVendedor;

    private java.lang.String nombreVendedor;

    private java.math.BigDecimal indCarpeta;

    private java.math.BigDecimal indEnvioRc;

    private java.math.BigDecimal idEntidadCarpeta;

    private java.util.Calendar fechaSuscripcionPension;

    private java.math.BigDecimal pafe;

    private java.math.BigDecimal idTipoModPension;

    private java.math.BigDecimal rentaLiquida;

    private java.lang.String desActividad;

    private java.math.BigDecimal idTipoCargoPersona;

    private java.math.BigDecimal indTipoTributante;

    private java.math.BigDecimal idTipoSegmentacion;

    private java.math.BigDecimal idTipoCausalFallecido;

    private java.util.Calendar fechaInicioSTJ;

    private int codigoRespuesta;

    private java.lang.String descripcionRespuesta;

    public GetAfiliadoResponseInformacionAfiliado() {
    }

    public GetAfiliadoResponseInformacionAfiliado(
           java.math.BigDecimal idMaePersona,
           java.math.BigDecimal idTipoTrabajador,
           java.math.BigDecimal idClaseCotizante,
           java.math.BigDecimal idCodActividadEconomica,
           java.math.BigDecimal idMedioEnvio,
           java.math.BigDecimal idTipoPersona,
           java.math.BigDecimal rutMaePersona,
           java.lang.String codPersona,
           java.lang.String dvMaePersona,
           java.lang.String apellidoPaterno,
           java.lang.String apellidoMaterno,
           java.lang.String nombrePrimer,
           java.lang.String nombreSegundo,
           java.lang.String razonSocial,
           java.lang.String codSexo,
           java.util.Calendar fechaNacimiento,
           java.lang.String lugarNacimiento,
           java.util.Calendar fechaAfiliacion,
           java.util.Calendar fechaIncorporacion,
           java.lang.String email,
           java.lang.String sistemaSalud,
           java.lang.String regimenPrevisional,
           java.lang.String codControl,
           java.math.BigDecimal mtoRentaImponible,
           java.util.Calendar fechaVerificacion,
           java.lang.String audCreadoPor,
           java.util.Calendar audFechaCreacion,
           java.lang.String audModificadoPor,
           java.util.Calendar audFechaModificacion,
           java.math.BigDecimal idTipoNivelEstudio,
           java.math.BigDecimal idTipoEstadoCivil,
           java.util.Calendar fechaFallecimiento,
           java.math.BigDecimal idEntidadMulti,
           java.math.BigDecimal indCartolaDet,
           java.lang.String codVendedor,
           java.math.BigDecimal rutVendedor,
           java.lang.String dvVendedor,
           java.lang.String nombreVendedor,
           java.math.BigDecimal indCarpeta,
           java.math.BigDecimal indEnvioRc,
           java.math.BigDecimal idEntidadCarpeta,
           java.util.Calendar fechaSuscripcionPension,
           java.math.BigDecimal pafe,
           java.math.BigDecimal idTipoModPension,
           java.math.BigDecimal rentaLiquida,
           java.lang.String desActividad,
           java.math.BigDecimal idTipoCargoPersona,
           java.math.BigDecimal indTipoTributante,
           java.math.BigDecimal idTipoSegmentacion,
           java.math.BigDecimal idTipoCausalFallecido,
           java.util.Calendar fechaInicioSTJ,
           int codigoRespuesta,
           java.lang.String descripcionRespuesta) {
           this.idMaePersona = idMaePersona;
           this.idTipoTrabajador = idTipoTrabajador;
           this.idClaseCotizante = idClaseCotizante;
           this.idCodActividadEconomica = idCodActividadEconomica;
           this.idMedioEnvio = idMedioEnvio;
           this.idTipoPersona = idTipoPersona;
           this.rutMaePersona = rutMaePersona;
           this.codPersona = codPersona;
           this.dvMaePersona = dvMaePersona;
           this.apellidoPaterno = apellidoPaterno;
           this.apellidoMaterno = apellidoMaterno;
           this.nombrePrimer = nombrePrimer;
           this.nombreSegundo = nombreSegundo;
           this.razonSocial = razonSocial;
           this.codSexo = codSexo;
           this.fechaNacimiento = fechaNacimiento;
           this.lugarNacimiento = lugarNacimiento;
           this.fechaAfiliacion = fechaAfiliacion;
           this.fechaIncorporacion = fechaIncorporacion;
           this.email = email;
           this.sistemaSalud = sistemaSalud;
           this.regimenPrevisional = regimenPrevisional;
           this.codControl = codControl;
           this.mtoRentaImponible = mtoRentaImponible;
           this.fechaVerificacion = fechaVerificacion;
           this.audCreadoPor = audCreadoPor;
           this.audFechaCreacion = audFechaCreacion;
           this.audModificadoPor = audModificadoPor;
           this.audFechaModificacion = audFechaModificacion;
           this.idTipoNivelEstudio = idTipoNivelEstudio;
           this.idTipoEstadoCivil = idTipoEstadoCivil;
           this.fechaFallecimiento = fechaFallecimiento;
           this.idEntidadMulti = idEntidadMulti;
           this.indCartolaDet = indCartolaDet;
           this.codVendedor = codVendedor;
           this.rutVendedor = rutVendedor;
           this.dvVendedor = dvVendedor;
           this.nombreVendedor = nombreVendedor;
           this.indCarpeta = indCarpeta;
           this.indEnvioRc = indEnvioRc;
           this.idEntidadCarpeta = idEntidadCarpeta;
           this.fechaSuscripcionPension = fechaSuscripcionPension;
           this.pafe = pafe;
           this.idTipoModPension = idTipoModPension;
           this.rentaLiquida = rentaLiquida;
           this.desActividad = desActividad;
           this.idTipoCargoPersona = idTipoCargoPersona;
           this.indTipoTributante = indTipoTributante;
           this.idTipoSegmentacion = idTipoSegmentacion;
           this.idTipoCausalFallecido = idTipoCausalFallecido;
           this.fechaInicioSTJ = fechaInicioSTJ;
           this.codigoRespuesta = codigoRespuesta;
           this.descripcionRespuesta = descripcionRespuesta;
    }


    /**
     * Gets the idMaePersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idMaePersona
     */
    public java.math.BigDecimal getIdMaePersona() {
        return idMaePersona;
    }


    /**
     * Sets the idMaePersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idMaePersona
     */
    public void setIdMaePersona(java.math.BigDecimal idMaePersona) {
        this.idMaePersona = idMaePersona;
    }


    /**
     * Gets the idTipoTrabajador value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoTrabajador
     */
    public java.math.BigDecimal getIdTipoTrabajador() {
        return idTipoTrabajador;
    }


    /**
     * Sets the idTipoTrabajador value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoTrabajador
     */
    public void setIdTipoTrabajador(java.math.BigDecimal idTipoTrabajador) {
        this.idTipoTrabajador = idTipoTrabajador;
    }


    /**
     * Gets the idClaseCotizante value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idClaseCotizante
     */
    public java.math.BigDecimal getIdClaseCotizante() {
        return idClaseCotizante;
    }


    /**
     * Sets the idClaseCotizante value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idClaseCotizante
     */
    public void setIdClaseCotizante(java.math.BigDecimal idClaseCotizante) {
        this.idClaseCotizante = idClaseCotizante;
    }


    /**
     * Gets the idCodActividadEconomica value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idCodActividadEconomica
     */
    public java.math.BigDecimal getIdCodActividadEconomica() {
        return idCodActividadEconomica;
    }


    /**
     * Sets the idCodActividadEconomica value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idCodActividadEconomica
     */
    public void setIdCodActividadEconomica(java.math.BigDecimal idCodActividadEconomica) {
        this.idCodActividadEconomica = idCodActividadEconomica;
    }


    /**
     * Gets the idMedioEnvio value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idMedioEnvio
     */
    public java.math.BigDecimal getIdMedioEnvio() {
        return idMedioEnvio;
    }


    /**
     * Sets the idMedioEnvio value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idMedioEnvio
     */
    public void setIdMedioEnvio(java.math.BigDecimal idMedioEnvio) {
        this.idMedioEnvio = idMedioEnvio;
    }


    /**
     * Gets the idTipoPersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoPersona
     */
    public java.math.BigDecimal getIdTipoPersona() {
        return idTipoPersona;
    }


    /**
     * Sets the idTipoPersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoPersona
     */
    public void setIdTipoPersona(java.math.BigDecimal idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }


    /**
     * Gets the rutMaePersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return rutMaePersona
     */
    public java.math.BigDecimal getRutMaePersona() {
        return rutMaePersona;
    }


    /**
     * Sets the rutMaePersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param rutMaePersona
     */
    public void setRutMaePersona(java.math.BigDecimal rutMaePersona) {
        this.rutMaePersona = rutMaePersona;
    }


    /**
     * Gets the codPersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return codPersona
     */
    public java.lang.String getCodPersona() {
        return codPersona;
    }


    /**
     * Sets the codPersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param codPersona
     */
    public void setCodPersona(java.lang.String codPersona) {
        this.codPersona = codPersona;
    }


    /**
     * Gets the dvMaePersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return dvMaePersona
     */
    public java.lang.String getDvMaePersona() {
        return dvMaePersona;
    }


    /**
     * Sets the dvMaePersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param dvMaePersona
     */
    public void setDvMaePersona(java.lang.String dvMaePersona) {
        this.dvMaePersona = dvMaePersona;
    }


    /**
     * Gets the apellidoPaterno value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return apellidoPaterno
     */
    public java.lang.String getApellidoPaterno() {
        return apellidoPaterno;
    }


    /**
     * Sets the apellidoPaterno value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }


    /**
     * Gets the apellidoMaterno value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return apellidoMaterno
     */
    public java.lang.String getApellidoMaterno() {
        return apellidoMaterno;
    }


    /**
     * Sets the apellidoMaterno value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    /**
     * Gets the nombrePrimer value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return nombrePrimer
     */
    public java.lang.String getNombrePrimer() {
        return nombrePrimer;
    }


    /**
     * Sets the nombrePrimer value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param nombrePrimer
     */
    public void setNombrePrimer(java.lang.String nombrePrimer) {
        this.nombrePrimer = nombrePrimer;
    }


    /**
     * Gets the nombreSegundo value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return nombreSegundo
     */
    public java.lang.String getNombreSegundo() {
        return nombreSegundo;
    }


    /**
     * Sets the nombreSegundo value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param nombreSegundo
     */
    public void setNombreSegundo(java.lang.String nombreSegundo) {
        this.nombreSegundo = nombreSegundo;
    }


    /**
     * Gets the razonSocial value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return razonSocial
     */
    public java.lang.String getRazonSocial() {
        return razonSocial;
    }


    /**
     * Sets the razonSocial value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param razonSocial
     */
    public void setRazonSocial(java.lang.String razonSocial) {
        this.razonSocial = razonSocial;
    }


    /**
     * Gets the codSexo value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return codSexo
     */
    public java.lang.String getCodSexo() {
        return codSexo;
    }


    /**
     * Sets the codSexo value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param codSexo
     */
    public void setCodSexo(java.lang.String codSexo) {
        this.codSexo = codSexo;
    }


    /**
     * Gets the fechaNacimiento value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the lugarNacimiento value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return lugarNacimiento
     */
    public java.lang.String getLugarNacimiento() {
        return lugarNacimiento;
    }


    /**
     * Sets the lugarNacimiento value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param lugarNacimiento
     */
    public void setLugarNacimiento(java.lang.String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }


    /**
     * Gets the fechaAfiliacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaAfiliacion
     */
    public java.util.Calendar getFechaAfiliacion() {
        return fechaAfiliacion;
    }


    /**
     * Sets the fechaAfiliacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaAfiliacion
     */
    public void setFechaAfiliacion(java.util.Calendar fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }


    /**
     * Gets the fechaIncorporacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaIncorporacion
     */
    public java.util.Calendar getFechaIncorporacion() {
        return fechaIncorporacion;
    }


    /**
     * Sets the fechaIncorporacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaIncorporacion
     */
    public void setFechaIncorporacion(java.util.Calendar fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }


    /**
     * Gets the email value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the sistemaSalud value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return sistemaSalud
     */
    public java.lang.String getSistemaSalud() {
        return sistemaSalud;
    }


    /**
     * Sets the sistemaSalud value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param sistemaSalud
     */
    public void setSistemaSalud(java.lang.String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }


    /**
     * Gets the regimenPrevisional value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return regimenPrevisional
     */
    public java.lang.String getRegimenPrevisional() {
        return regimenPrevisional;
    }


    /**
     * Sets the regimenPrevisional value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param regimenPrevisional
     */
    public void setRegimenPrevisional(java.lang.String regimenPrevisional) {
        this.regimenPrevisional = regimenPrevisional;
    }


    /**
     * Gets the codControl value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return codControl
     */
    public java.lang.String getCodControl() {
        return codControl;
    }


    /**
     * Sets the codControl value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param codControl
     */
    public void setCodControl(java.lang.String codControl) {
        this.codControl = codControl;
    }


    /**
     * Gets the mtoRentaImponible value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return mtoRentaImponible
     */
    public java.math.BigDecimal getMtoRentaImponible() {
        return mtoRentaImponible;
    }


    /**
     * Sets the mtoRentaImponible value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param mtoRentaImponible
     */
    public void setMtoRentaImponible(java.math.BigDecimal mtoRentaImponible) {
        this.mtoRentaImponible = mtoRentaImponible;
    }


    /**
     * Gets the fechaVerificacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaVerificacion
     */
    public java.util.Calendar getFechaVerificacion() {
        return fechaVerificacion;
    }


    /**
     * Sets the fechaVerificacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaVerificacion
     */
    public void setFechaVerificacion(java.util.Calendar fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }


    /**
     * Gets the audCreadoPor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return audCreadoPor
     */
    public java.lang.String getAudCreadoPor() {
        return audCreadoPor;
    }


    /**
     * Sets the audCreadoPor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param audCreadoPor
     */
    public void setAudCreadoPor(java.lang.String audCreadoPor) {
        this.audCreadoPor = audCreadoPor;
    }


    /**
     * Gets the audFechaCreacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return audFechaCreacion
     */
    public java.util.Calendar getAudFechaCreacion() {
        return audFechaCreacion;
    }


    /**
     * Sets the audFechaCreacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param audFechaCreacion
     */
    public void setAudFechaCreacion(java.util.Calendar audFechaCreacion) {
        this.audFechaCreacion = audFechaCreacion;
    }


    /**
     * Gets the audModificadoPor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return audModificadoPor
     */
    public java.lang.String getAudModificadoPor() {
        return audModificadoPor;
    }


    /**
     * Sets the audModificadoPor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param audModificadoPor
     */
    public void setAudModificadoPor(java.lang.String audModificadoPor) {
        this.audModificadoPor = audModificadoPor;
    }


    /**
     * Gets the audFechaModificacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return audFechaModificacion
     */
    public java.util.Calendar getAudFechaModificacion() {
        return audFechaModificacion;
    }


    /**
     * Sets the audFechaModificacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param audFechaModificacion
     */
    public void setAudFechaModificacion(java.util.Calendar audFechaModificacion) {
        this.audFechaModificacion = audFechaModificacion;
    }


    /**
     * Gets the idTipoNivelEstudio value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoNivelEstudio
     */
    public java.math.BigDecimal getIdTipoNivelEstudio() {
        return idTipoNivelEstudio;
    }


    /**
     * Sets the idTipoNivelEstudio value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoNivelEstudio
     */
    public void setIdTipoNivelEstudio(java.math.BigDecimal idTipoNivelEstudio) {
        this.idTipoNivelEstudio = idTipoNivelEstudio;
    }


    /**
     * Gets the idTipoEstadoCivil value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoEstadoCivil
     */
    public java.math.BigDecimal getIdTipoEstadoCivil() {
        return idTipoEstadoCivil;
    }


    /**
     * Sets the idTipoEstadoCivil value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoEstadoCivil
     */
    public void setIdTipoEstadoCivil(java.math.BigDecimal idTipoEstadoCivil) {
        this.idTipoEstadoCivil = idTipoEstadoCivil;
    }


    /**
     * Gets the fechaFallecimiento value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaFallecimiento
     */
    public java.util.Calendar getFechaFallecimiento() {
        return fechaFallecimiento;
    }


    /**
     * Sets the fechaFallecimiento value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaFallecimiento
     */
    public void setFechaFallecimiento(java.util.Calendar fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }


    /**
     * Gets the idEntidadMulti value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idEntidadMulti
     */
    public java.math.BigDecimal getIdEntidadMulti() {
        return idEntidadMulti;
    }


    /**
     * Sets the idEntidadMulti value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idEntidadMulti
     */
    public void setIdEntidadMulti(java.math.BigDecimal idEntidadMulti) {
        this.idEntidadMulti = idEntidadMulti;
    }


    /**
     * Gets the indCartolaDet value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return indCartolaDet
     */
    public java.math.BigDecimal getIndCartolaDet() {
        return indCartolaDet;
    }


    /**
     * Sets the indCartolaDet value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param indCartolaDet
     */
    public void setIndCartolaDet(java.math.BigDecimal indCartolaDet) {
        this.indCartolaDet = indCartolaDet;
    }


    /**
     * Gets the codVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return codVendedor
     */
    public java.lang.String getCodVendedor() {
        return codVendedor;
    }


    /**
     * Sets the codVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param codVendedor
     */
    public void setCodVendedor(java.lang.String codVendedor) {
        this.codVendedor = codVendedor;
    }


    /**
     * Gets the rutVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return rutVendedor
     */
    public java.math.BigDecimal getRutVendedor() {
        return rutVendedor;
    }


    /**
     * Sets the rutVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param rutVendedor
     */
    public void setRutVendedor(java.math.BigDecimal rutVendedor) {
        this.rutVendedor = rutVendedor;
    }


    /**
     * Gets the dvVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return dvVendedor
     */
    public java.lang.String getDvVendedor() {
        return dvVendedor;
    }


    /**
     * Sets the dvVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param dvVendedor
     */
    public void setDvVendedor(java.lang.String dvVendedor) {
        this.dvVendedor = dvVendedor;
    }


    /**
     * Gets the nombreVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return nombreVendedor
     */
    public java.lang.String getNombreVendedor() {
        return nombreVendedor;
    }


    /**
     * Sets the nombreVendedor value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param nombreVendedor
     */
    public void setNombreVendedor(java.lang.String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }


    /**
     * Gets the indCarpeta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return indCarpeta
     */
    public java.math.BigDecimal getIndCarpeta() {
        return indCarpeta;
    }


    /**
     * Sets the indCarpeta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param indCarpeta
     */
    public void setIndCarpeta(java.math.BigDecimal indCarpeta) {
        this.indCarpeta = indCarpeta;
    }


    /**
     * Gets the indEnvioRc value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return indEnvioRc
     */
    public java.math.BigDecimal getIndEnvioRc() {
        return indEnvioRc;
    }


    /**
     * Sets the indEnvioRc value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param indEnvioRc
     */
    public void setIndEnvioRc(java.math.BigDecimal indEnvioRc) {
        this.indEnvioRc = indEnvioRc;
    }


    /**
     * Gets the idEntidadCarpeta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idEntidadCarpeta
     */
    public java.math.BigDecimal getIdEntidadCarpeta() {
        return idEntidadCarpeta;
    }


    /**
     * Sets the idEntidadCarpeta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idEntidadCarpeta
     */
    public void setIdEntidadCarpeta(java.math.BigDecimal idEntidadCarpeta) {
        this.idEntidadCarpeta = idEntidadCarpeta;
    }


    /**
     * Gets the fechaSuscripcionPension value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaSuscripcionPension
     */
    public java.util.Calendar getFechaSuscripcionPension() {
        return fechaSuscripcionPension;
    }


    /**
     * Sets the fechaSuscripcionPension value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaSuscripcionPension
     */
    public void setFechaSuscripcionPension(java.util.Calendar fechaSuscripcionPension) {
        this.fechaSuscripcionPension = fechaSuscripcionPension;
    }


    /**
     * Gets the pafe value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return pafe
     */
    public java.math.BigDecimal getPafe() {
        return pafe;
    }


    /**
     * Sets the pafe value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param pafe
     */
    public void setPafe(java.math.BigDecimal pafe) {
        this.pafe = pafe;
    }


    /**
     * Gets the idTipoModPension value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoModPension
     */
    public java.math.BigDecimal getIdTipoModPension() {
        return idTipoModPension;
    }


    /**
     * Sets the idTipoModPension value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoModPension
     */
    public void setIdTipoModPension(java.math.BigDecimal idTipoModPension) {
        this.idTipoModPension = idTipoModPension;
    }


    /**
     * Gets the rentaLiquida value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return rentaLiquida
     */
    public java.math.BigDecimal getRentaLiquida() {
        return rentaLiquida;
    }


    /**
     * Sets the rentaLiquida value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param rentaLiquida
     */
    public void setRentaLiquida(java.math.BigDecimal rentaLiquida) {
        this.rentaLiquida = rentaLiquida;
    }


    /**
     * Gets the desActividad value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return desActividad
     */
    public java.lang.String getDesActividad() {
        return desActividad;
    }


    /**
     * Sets the desActividad value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param desActividad
     */
    public void setDesActividad(java.lang.String desActividad) {
        this.desActividad = desActividad;
    }


    /**
     * Gets the idTipoCargoPersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoCargoPersona
     */
    public java.math.BigDecimal getIdTipoCargoPersona() {
        return idTipoCargoPersona;
    }


    /**
     * Sets the idTipoCargoPersona value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoCargoPersona
     */
    public void setIdTipoCargoPersona(java.math.BigDecimal idTipoCargoPersona) {
        this.idTipoCargoPersona = idTipoCargoPersona;
    }


    /**
     * Gets the indTipoTributante value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return indTipoTributante
     */
    public java.math.BigDecimal getIndTipoTributante() {
        return indTipoTributante;
    }


    /**
     * Sets the indTipoTributante value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param indTipoTributante
     */
    public void setIndTipoTributante(java.math.BigDecimal indTipoTributante) {
        this.indTipoTributante = indTipoTributante;
    }


    /**
     * Gets the idTipoSegmentacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoSegmentacion
     */
    public java.math.BigDecimal getIdTipoSegmentacion() {
        return idTipoSegmentacion;
    }


    /**
     * Sets the idTipoSegmentacion value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoSegmentacion
     */
    public void setIdTipoSegmentacion(java.math.BigDecimal idTipoSegmentacion) {
        this.idTipoSegmentacion = idTipoSegmentacion;
    }


    /**
     * Gets the idTipoCausalFallecido value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return idTipoCausalFallecido
     */
    public java.math.BigDecimal getIdTipoCausalFallecido() {
        return idTipoCausalFallecido;
    }


    /**
     * Sets the idTipoCausalFallecido value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param idTipoCausalFallecido
     */
    public void setIdTipoCausalFallecido(java.math.BigDecimal idTipoCausalFallecido) {
        this.idTipoCausalFallecido = idTipoCausalFallecido;
    }


    /**
     * Gets the fechaInicioSTJ value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return fechaInicioSTJ
     */
    public java.util.Calendar getFechaInicioSTJ() {
        return fechaInicioSTJ;
    }


    /**
     * Sets the fechaInicioSTJ value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param fechaInicioSTJ
     */
    public void setFechaInicioSTJ(java.util.Calendar fechaInicioSTJ) {
        this.fechaInicioSTJ = fechaInicioSTJ;
    }


    /**
     * Gets the codigoRespuesta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return codigoRespuesta
     */
    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }


    /**
     * Sets the codigoRespuesta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param codigoRespuesta
     */
    public void setCodigoRespuesta(int codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }


    /**
     * Gets the descripcionRespuesta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @return descripcionRespuesta
     */
    public java.lang.String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }


    /**
     * Sets the descripcionRespuesta value for this GetAfiliadoResponseInformacionAfiliado.
     * 
     * @param descripcionRespuesta
     */
    public void setDescripcionRespuesta(java.lang.String descripcionRespuesta) {
        this.descripcionRespuesta = descripcionRespuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAfiliadoResponseInformacionAfiliado)) return false;
        GetAfiliadoResponseInformacionAfiliado other = (GetAfiliadoResponseInformacionAfiliado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idMaePersona==null && other.getIdMaePersona()==null) || 
             (this.idMaePersona!=null &&
              this.idMaePersona.equals(other.getIdMaePersona()))) &&
            ((this.idTipoTrabajador==null && other.getIdTipoTrabajador()==null) || 
             (this.idTipoTrabajador!=null &&
              this.idTipoTrabajador.equals(other.getIdTipoTrabajador()))) &&
            ((this.idClaseCotizante==null && other.getIdClaseCotizante()==null) || 
             (this.idClaseCotizante!=null &&
              this.idClaseCotizante.equals(other.getIdClaseCotizante()))) &&
            ((this.idCodActividadEconomica==null && other.getIdCodActividadEconomica()==null) || 
             (this.idCodActividadEconomica!=null &&
              this.idCodActividadEconomica.equals(other.getIdCodActividadEconomica()))) &&
            ((this.idMedioEnvio==null && other.getIdMedioEnvio()==null) || 
             (this.idMedioEnvio!=null &&
              this.idMedioEnvio.equals(other.getIdMedioEnvio()))) &&
            ((this.idTipoPersona==null && other.getIdTipoPersona()==null) || 
             (this.idTipoPersona!=null &&
              this.idTipoPersona.equals(other.getIdTipoPersona()))) &&
            ((this.rutMaePersona==null && other.getRutMaePersona()==null) || 
             (this.rutMaePersona!=null &&
              this.rutMaePersona.equals(other.getRutMaePersona()))) &&
            ((this.codPersona==null && other.getCodPersona()==null) || 
             (this.codPersona!=null &&
              this.codPersona.equals(other.getCodPersona()))) &&
            ((this.dvMaePersona==null && other.getDvMaePersona()==null) || 
             (this.dvMaePersona!=null &&
              this.dvMaePersona.equals(other.getDvMaePersona()))) &&
            ((this.apellidoPaterno==null && other.getApellidoPaterno()==null) || 
             (this.apellidoPaterno!=null &&
              this.apellidoPaterno.equals(other.getApellidoPaterno()))) &&
            ((this.apellidoMaterno==null && other.getApellidoMaterno()==null) || 
             (this.apellidoMaterno!=null &&
              this.apellidoMaterno.equals(other.getApellidoMaterno()))) &&
            ((this.nombrePrimer==null && other.getNombrePrimer()==null) || 
             (this.nombrePrimer!=null &&
              this.nombrePrimer.equals(other.getNombrePrimer()))) &&
            ((this.nombreSegundo==null && other.getNombreSegundo()==null) || 
             (this.nombreSegundo!=null &&
              this.nombreSegundo.equals(other.getNombreSegundo()))) &&
            ((this.razonSocial==null && other.getRazonSocial()==null) || 
             (this.razonSocial!=null &&
              this.razonSocial.equals(other.getRazonSocial()))) &&
            ((this.codSexo==null && other.getCodSexo()==null) || 
             (this.codSexo!=null &&
              this.codSexo.equals(other.getCodSexo()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.lugarNacimiento==null && other.getLugarNacimiento()==null) || 
             (this.lugarNacimiento!=null &&
              this.lugarNacimiento.equals(other.getLugarNacimiento()))) &&
            ((this.fechaAfiliacion==null && other.getFechaAfiliacion()==null) || 
             (this.fechaAfiliacion!=null &&
              this.fechaAfiliacion.equals(other.getFechaAfiliacion()))) &&
            ((this.fechaIncorporacion==null && other.getFechaIncorporacion()==null) || 
             (this.fechaIncorporacion!=null &&
              this.fechaIncorporacion.equals(other.getFechaIncorporacion()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.sistemaSalud==null && other.getSistemaSalud()==null) || 
             (this.sistemaSalud!=null &&
              this.sistemaSalud.equals(other.getSistemaSalud()))) &&
            ((this.regimenPrevisional==null && other.getRegimenPrevisional()==null) || 
             (this.regimenPrevisional!=null &&
              this.regimenPrevisional.equals(other.getRegimenPrevisional()))) &&
            ((this.codControl==null && other.getCodControl()==null) || 
             (this.codControl!=null &&
              this.codControl.equals(other.getCodControl()))) &&
            ((this.mtoRentaImponible==null && other.getMtoRentaImponible()==null) || 
             (this.mtoRentaImponible!=null &&
              this.mtoRentaImponible.equals(other.getMtoRentaImponible()))) &&
            ((this.fechaVerificacion==null && other.getFechaVerificacion()==null) || 
             (this.fechaVerificacion!=null &&
              this.fechaVerificacion.equals(other.getFechaVerificacion()))) &&
            ((this.audCreadoPor==null && other.getAudCreadoPor()==null) || 
             (this.audCreadoPor!=null &&
              this.audCreadoPor.equals(other.getAudCreadoPor()))) &&
            ((this.audFechaCreacion==null && other.getAudFechaCreacion()==null) || 
             (this.audFechaCreacion!=null &&
              this.audFechaCreacion.equals(other.getAudFechaCreacion()))) &&
            ((this.audModificadoPor==null && other.getAudModificadoPor()==null) || 
             (this.audModificadoPor!=null &&
              this.audModificadoPor.equals(other.getAudModificadoPor()))) &&
            ((this.audFechaModificacion==null && other.getAudFechaModificacion()==null) || 
             (this.audFechaModificacion!=null &&
              this.audFechaModificacion.equals(other.getAudFechaModificacion()))) &&
            ((this.idTipoNivelEstudio==null && other.getIdTipoNivelEstudio()==null) || 
             (this.idTipoNivelEstudio!=null &&
              this.idTipoNivelEstudio.equals(other.getIdTipoNivelEstudio()))) &&
            ((this.idTipoEstadoCivil==null && other.getIdTipoEstadoCivil()==null) || 
             (this.idTipoEstadoCivil!=null &&
              this.idTipoEstadoCivil.equals(other.getIdTipoEstadoCivil()))) &&
            ((this.fechaFallecimiento==null && other.getFechaFallecimiento()==null) || 
             (this.fechaFallecimiento!=null &&
              this.fechaFallecimiento.equals(other.getFechaFallecimiento()))) &&
            ((this.idEntidadMulti==null && other.getIdEntidadMulti()==null) || 
             (this.idEntidadMulti!=null &&
              this.idEntidadMulti.equals(other.getIdEntidadMulti()))) &&
            ((this.indCartolaDet==null && other.getIndCartolaDet()==null) || 
             (this.indCartolaDet!=null &&
              this.indCartolaDet.equals(other.getIndCartolaDet()))) &&
            ((this.codVendedor==null && other.getCodVendedor()==null) || 
             (this.codVendedor!=null &&
              this.codVendedor.equals(other.getCodVendedor()))) &&
            ((this.rutVendedor==null && other.getRutVendedor()==null) || 
             (this.rutVendedor!=null &&
              this.rutVendedor.equals(other.getRutVendedor()))) &&
            ((this.dvVendedor==null && other.getDvVendedor()==null) || 
             (this.dvVendedor!=null &&
              this.dvVendedor.equals(other.getDvVendedor()))) &&
            ((this.nombreVendedor==null && other.getNombreVendedor()==null) || 
             (this.nombreVendedor!=null &&
              this.nombreVendedor.equals(other.getNombreVendedor()))) &&
            ((this.indCarpeta==null && other.getIndCarpeta()==null) || 
             (this.indCarpeta!=null &&
              this.indCarpeta.equals(other.getIndCarpeta()))) &&
            ((this.indEnvioRc==null && other.getIndEnvioRc()==null) || 
             (this.indEnvioRc!=null &&
              this.indEnvioRc.equals(other.getIndEnvioRc()))) &&
            ((this.idEntidadCarpeta==null && other.getIdEntidadCarpeta()==null) || 
             (this.idEntidadCarpeta!=null &&
              this.idEntidadCarpeta.equals(other.getIdEntidadCarpeta()))) &&
            ((this.fechaSuscripcionPension==null && other.getFechaSuscripcionPension()==null) || 
             (this.fechaSuscripcionPension!=null &&
              this.fechaSuscripcionPension.equals(other.getFechaSuscripcionPension()))) &&
            ((this.pafe==null && other.getPafe()==null) || 
             (this.pafe!=null &&
              this.pafe.equals(other.getPafe()))) &&
            ((this.idTipoModPension==null && other.getIdTipoModPension()==null) || 
             (this.idTipoModPension!=null &&
              this.idTipoModPension.equals(other.getIdTipoModPension()))) &&
            ((this.rentaLiquida==null && other.getRentaLiquida()==null) || 
             (this.rentaLiquida!=null &&
              this.rentaLiquida.equals(other.getRentaLiquida()))) &&
            ((this.desActividad==null && other.getDesActividad()==null) || 
             (this.desActividad!=null &&
              this.desActividad.equals(other.getDesActividad()))) &&
            ((this.idTipoCargoPersona==null && other.getIdTipoCargoPersona()==null) || 
             (this.idTipoCargoPersona!=null &&
              this.idTipoCargoPersona.equals(other.getIdTipoCargoPersona()))) &&
            ((this.indTipoTributante==null && other.getIndTipoTributante()==null) || 
             (this.indTipoTributante!=null &&
              this.indTipoTributante.equals(other.getIndTipoTributante()))) &&
            ((this.idTipoSegmentacion==null && other.getIdTipoSegmentacion()==null) || 
             (this.idTipoSegmentacion!=null &&
              this.idTipoSegmentacion.equals(other.getIdTipoSegmentacion()))) &&
            ((this.idTipoCausalFallecido==null && other.getIdTipoCausalFallecido()==null) || 
             (this.idTipoCausalFallecido!=null &&
              this.idTipoCausalFallecido.equals(other.getIdTipoCausalFallecido()))) &&
            ((this.fechaInicioSTJ==null && other.getFechaInicioSTJ()==null) || 
             (this.fechaInicioSTJ!=null &&
              this.fechaInicioSTJ.equals(other.getFechaInicioSTJ()))) &&
            this.codigoRespuesta == other.getCodigoRespuesta() &&
            ((this.descripcionRespuesta==null && other.getDescripcionRespuesta()==null) || 
             (this.descripcionRespuesta!=null &&
              this.descripcionRespuesta.equals(other.getDescripcionRespuesta())));
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
        if (getIdMaePersona() != null) {
            _hashCode += getIdMaePersona().hashCode();
        }
        if (getIdTipoTrabajador() != null) {
            _hashCode += getIdTipoTrabajador().hashCode();
        }
        if (getIdClaseCotizante() != null) {
            _hashCode += getIdClaseCotizante().hashCode();
        }
        if (getIdCodActividadEconomica() != null) {
            _hashCode += getIdCodActividadEconomica().hashCode();
        }
        if (getIdMedioEnvio() != null) {
            _hashCode += getIdMedioEnvio().hashCode();
        }
        if (getIdTipoPersona() != null) {
            _hashCode += getIdTipoPersona().hashCode();
        }
        if (getRutMaePersona() != null) {
            _hashCode += getRutMaePersona().hashCode();
        }
        if (getCodPersona() != null) {
            _hashCode += getCodPersona().hashCode();
        }
        if (getDvMaePersona() != null) {
            _hashCode += getDvMaePersona().hashCode();
        }
        if (getApellidoPaterno() != null) {
            _hashCode += getApellidoPaterno().hashCode();
        }
        if (getApellidoMaterno() != null) {
            _hashCode += getApellidoMaterno().hashCode();
        }
        if (getNombrePrimer() != null) {
            _hashCode += getNombrePrimer().hashCode();
        }
        if (getNombreSegundo() != null) {
            _hashCode += getNombreSegundo().hashCode();
        }
        if (getRazonSocial() != null) {
            _hashCode += getRazonSocial().hashCode();
        }
        if (getCodSexo() != null) {
            _hashCode += getCodSexo().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getLugarNacimiento() != null) {
            _hashCode += getLugarNacimiento().hashCode();
        }
        if (getFechaAfiliacion() != null) {
            _hashCode += getFechaAfiliacion().hashCode();
        }
        if (getFechaIncorporacion() != null) {
            _hashCode += getFechaIncorporacion().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSistemaSalud() != null) {
            _hashCode += getSistemaSalud().hashCode();
        }
        if (getRegimenPrevisional() != null) {
            _hashCode += getRegimenPrevisional().hashCode();
        }
        if (getCodControl() != null) {
            _hashCode += getCodControl().hashCode();
        }
        if (getMtoRentaImponible() != null) {
            _hashCode += getMtoRentaImponible().hashCode();
        }
        if (getFechaVerificacion() != null) {
            _hashCode += getFechaVerificacion().hashCode();
        }
        if (getAudCreadoPor() != null) {
            _hashCode += getAudCreadoPor().hashCode();
        }
        if (getAudFechaCreacion() != null) {
            _hashCode += getAudFechaCreacion().hashCode();
        }
        if (getAudModificadoPor() != null) {
            _hashCode += getAudModificadoPor().hashCode();
        }
        if (getAudFechaModificacion() != null) {
            _hashCode += getAudFechaModificacion().hashCode();
        }
        if (getIdTipoNivelEstudio() != null) {
            _hashCode += getIdTipoNivelEstudio().hashCode();
        }
        if (getIdTipoEstadoCivil() != null) {
            _hashCode += getIdTipoEstadoCivil().hashCode();
        }
        if (getFechaFallecimiento() != null) {
            _hashCode += getFechaFallecimiento().hashCode();
        }
        if (getIdEntidadMulti() != null) {
            _hashCode += getIdEntidadMulti().hashCode();
        }
        if (getIndCartolaDet() != null) {
            _hashCode += getIndCartolaDet().hashCode();
        }
        if (getCodVendedor() != null) {
            _hashCode += getCodVendedor().hashCode();
        }
        if (getRutVendedor() != null) {
            _hashCode += getRutVendedor().hashCode();
        }
        if (getDvVendedor() != null) {
            _hashCode += getDvVendedor().hashCode();
        }
        if (getNombreVendedor() != null) {
            _hashCode += getNombreVendedor().hashCode();
        }
        if (getIndCarpeta() != null) {
            _hashCode += getIndCarpeta().hashCode();
        }
        if (getIndEnvioRc() != null) {
            _hashCode += getIndEnvioRc().hashCode();
        }
        if (getIdEntidadCarpeta() != null) {
            _hashCode += getIdEntidadCarpeta().hashCode();
        }
        if (getFechaSuscripcionPension() != null) {
            _hashCode += getFechaSuscripcionPension().hashCode();
        }
        if (getPafe() != null) {
            _hashCode += getPafe().hashCode();
        }
        if (getIdTipoModPension() != null) {
            _hashCode += getIdTipoModPension().hashCode();
        }
        if (getRentaLiquida() != null) {
            _hashCode += getRentaLiquida().hashCode();
        }
        if (getDesActividad() != null) {
            _hashCode += getDesActividad().hashCode();
        }
        if (getIdTipoCargoPersona() != null) {
            _hashCode += getIdTipoCargoPersona().hashCode();
        }
        if (getIndTipoTributante() != null) {
            _hashCode += getIndTipoTributante().hashCode();
        }
        if (getIdTipoSegmentacion() != null) {
            _hashCode += getIdTipoSegmentacion().hashCode();
        }
        if (getIdTipoCausalFallecido() != null) {
            _hashCode += getIdTipoCausalFallecido().hashCode();
        }
        if (getFechaInicioSTJ() != null) {
            _hashCode += getFechaInicioSTJ().hashCode();
        }
        _hashCode += getCodigoRespuesta();
        if (getDescripcionRespuesta() != null) {
            _hashCode += getDescripcionRespuesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAfiliadoResponseInformacionAfiliado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", ">>getAfiliadoResponse>informacionAfiliado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMaePersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idMaePersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoTrabajador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoTrabajador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClaseCotizante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idClaseCotizante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCodActividadEconomica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idCodActividadEconomica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMedioEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idMedioEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutMaePersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "rutMaePersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "codPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvMaePersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "dvMaePersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "apellidoPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "apellidoMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePrimer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "nombrePrimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreSegundo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "nombreSegundo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "razonSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "codSexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugarNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "lugarNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAfiliacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaAfiliacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaIncorporacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaIncorporacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaSalud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "sistemaSalud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regimenPrevisional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "regimenPrevisional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "codControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtoRentaImponible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "mtoRentaImponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVerificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaVerificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audCreadoPor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "audCreadoPor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audFechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "audFechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audModificadoPor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "audModificadoPor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audFechaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "audFechaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoNivelEstudio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoNivelEstudio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoEstadoCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoEstadoCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFallecimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaFallecimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEntidadMulti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idEntidadMulti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indCartolaDet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "indCartolaDet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codVendedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "codVendedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rutVendedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "rutVendedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvVendedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "dvVendedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreVendedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "nombreVendedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indCarpeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "indCarpeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indEnvioRc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "indEnvioRc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEntidadCarpeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idEntidadCarpeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaSuscripcionPension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaSuscripcionPension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pafe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "pafe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoModPension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoModPension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentaLiquida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "rentaLiquida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desActividad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "desActividad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoCargoPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoCargoPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indTipoTributante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "indTipoTributante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoSegmentacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoSegmentacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoCausalFallecido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "idTipoCausalFallecido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioSTJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "fechaInicioSTJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "codigoRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://afphabitat.cl/soap/afiliado", "descripcionRespuesta"));
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
