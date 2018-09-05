package cl.afphabitat.cuentas.solDeudas.web.vo;

public class DocumentoVO {

	private java.math.BigDecimal idDocumento;
	private String nombreDocumento;
	private java.util.Calendar fechaDocumento;		
	private String fechaDocumentoString;	
	private String rutaDocumento;
	
	public java.math.BigDecimal getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(java.math.BigDecimal idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getNombreDocumento() {
		return nombreDocumento;
	}
	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}
	public java.util.Calendar getFechaDocumento() {
		return fechaDocumento;
	}
	public void setFechaDocumento(java.util.Calendar fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}
	public String getFechaDocumentoString() {
		return fechaDocumentoString;
	}
	public void setFechaDocumentoString(String fechaDocumentoString) {
		this.fechaDocumentoString = fechaDocumentoString;
	}
	public String getRutaDocumento() {
		return rutaDocumento;
	}
	public void setRutaDocumento(String rutaDocumento) {
		this.rutaDocumento = rutaDocumento;
	}
	
	
	
	
	
}
