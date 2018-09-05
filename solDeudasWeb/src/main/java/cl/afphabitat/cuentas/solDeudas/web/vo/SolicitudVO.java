package cl.afphabitat.cuentas.solDeudas.web.vo;

public class SolicitudVO {

	private java.math.BigDecimal folio;
	private String rutAfiliado;
	private String primerNombre;
	private String segundoNombre;	
	private String apellidoPaterno;	
	private String apellidoMaterno;	
	private String nombreCompleto;
	private java.util.Calendar fechaSolicitud;
	private String fechaSolicitudString;
	private String rutEmpleador;
	private String razonSocial;
	private java.util.Calendar fechaInicial;
	private java.util.Calendar fechaFinal;
	private String fechaInicialString;
	private String fechaFinalString;
	private int idEstado;
	private String estado;
	private String tipoSolicitud;
	private String solicitud;	
	
	public java.math.BigDecimal getFolio() {
		return folio;
	}
	public void setFolio(java.math.BigDecimal folio) {
		this.folio = folio;
	}
	public String getRutAfiliado() {
		return rutAfiliado;
	}
	public void setRutAfiliado(String rutAfiliado) {
		this.rutAfiliado = rutAfiliado;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public java.util.Calendar getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(java.util.Calendar fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getFechaSolicitudString() {
		return fechaSolicitudString;
	}
	public void setFechaSolicitudString(String fechaSolicitudString) {
		this.fechaSolicitudString = fechaSolicitudString;
	}
	public String getRutEmpleador() {
		return rutEmpleador;
	}
	public void setRutEmpleador(String rutEmpleador) {
		this.rutEmpleador = rutEmpleador;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public java.util.Calendar getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(java.util.Calendar fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public java.util.Calendar getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(java.util.Calendar fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public String getFechaInicialString() {
		return fechaInicialString;
	}
	public void setFechaInicialString(String fechaInicialString) {
		this.fechaInicialString = fechaInicialString;
	}
	public String getFechaFinalString() {
		return fechaFinalString;
	}
	public void setFechaFinalString(String fechaFinalString) {
		this.fechaFinalString = fechaFinalString;
	}	
	
}
