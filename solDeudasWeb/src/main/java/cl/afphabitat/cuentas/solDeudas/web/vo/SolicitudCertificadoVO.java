package cl.afphabitat.cuentas.solDeudas.web.vo;

public class SolicitudCertificadoVO {

	private String rutEmpresa;
	private String fechaInicio;
	private String fechaFinal;
	private int tipoCertificado;
	private String boton;
	
	public String getRutEmpresa() {
		return rutEmpresa;
	}
	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public int getTipoCertificado() {
		return tipoCertificado;
	}
	public void setTipoCertificado(int tipoCertificado) {
		this.tipoCertificado = tipoCertificado;
	}
	public String getBoton() {
		return boton;
	}
	public void setBoton(String boton) {
		this.boton = boton;
	}

}
