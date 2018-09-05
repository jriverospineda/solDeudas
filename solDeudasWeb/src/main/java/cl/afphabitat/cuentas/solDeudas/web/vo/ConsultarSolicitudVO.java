package cl.afphabitat.cuentas.solDeudas.web.vo;

public class ConsultarSolicitudVO {

	private String rutAfiliado;
	private String fechaInicial;
	private String fechaFinal;
	private java.math.BigDecimal folio;
	private String tipoSolicitud;
	private String boton;
	
	public String getRutAfiliado() {
		return rutAfiliado;
	}
	public void setRutAfiliado(String rutAfiliado) {
		this.rutAfiliado = rutAfiliado;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public java.math.BigDecimal getFolio() {
		return folio;
	}
	public void setFolio(java.math.BigDecimal folio) {
		this.folio = folio;
	}
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public String getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public String getBoton() {
		return boton;
	}
	public void setBoton(String boton) {
		this.boton = boton;
	}

	
}
