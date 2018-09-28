package cl.afphabitat.cuentas.solDeudas.web.util;

import java.io.FileOutputStream;
import java.util.Date;

import cl.afphabitat.cuentas.solDeudas.web.vo.CertificadoVO;

import com.lowagie.text.Anchor;
import com.lowagie.text.BadElementException;
import com.lowagie.text.Chapter;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.List;
import com.lowagie.text.ListItem;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Section;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import cl.afphabitat.cuentas.solDeudas.web.vo.SolicitudCertificadoVO;


public class CertificadoPDF {
    private static Font tituloGrandeFont = new Font(Font.HELVETICA, 18, Font.BOLDITALIC);
    private static Font tituloPequenoFont = new Font(Font.HELVETICA, 14, Font.BOLD);    
    private static Font subFont = new Font(Font.HELVETICA, 16, Font.BOLD);
    private static Font smallBold = new Font(Font.HELVETICA, 10, Font.BOLD);
    private static Font small = new Font(Font.HELVETICA, 8);    
    private static Font contenido = new Font(Font.HELVETICA, 12);	
    private static Font footerText = new Font(Font.HELVETICA, 10);
	
    public static void getCertDeudaTotalEmpleadorPDF(	String rutaArchivo, 
    													String nombreArchivo, 
    													java.util.List<CertificadoVO> listaCertificadoVO,
    													SolicitudCertificadoVO solicitudCertificadoVO) 
    {
        try 
        {
            Document document = new Document();
            String FILE = rutaArchivo + "/" + nombreArchivo;
            PdfWriter.getInstance(document, new FileOutputStream(FILE));

            document.open();
            addMetaDataCertDeudaTotalEmpleador(document);            
            addContentCertDeudaTotalEmpleador(document,listaCertificadoVO,solicitudCertificadoVO);
            document.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   	
	
    public static void getCertMoraPresuntaEmpleadorPDF(	String rutaArchivo, 
    													String nombreArchivo, 
    													java.util.List<CertificadoVO> listaCertificadoVO,
    													SolicitudCertificadoVO solicitudCertificadoVO) 
    {
		try 
		{
			Document document = new Document();
			String FILE = rutaArchivo + "/" + nombreArchivo;
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			
			document.open();
			addMetaDataCertMoraPresuntaEmpleador(document);            
			addContentCertMoraPresuntaEmpleador(document,listaCertificadoVO,solicitudCertificadoVO);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }   
    
    
    private static void addMetaDataCertDeudaTotalEmpleador(Document document) {
        document.addTitle("Certificado Deuda Toltal Empleador");
        document.addSubject("AFP Habitat");
        document.addKeywords("Habitat, PDF, Solicitud Deudas");
        document.addAuthor("AFP Habitat");
        document.addCreator("AFP Habitat");
    }		
	
    private static void addMetaDataCertMoraPresuntaEmpleador(Document document) {
        document.addTitle("Certificado Deuda Toltal Empleador");
        document.addSubject("AFP Habitat");
        document.addKeywords("Habitat, PDF, Solicitud Deudas");
        document.addAuthor("AFP Habitat");
        document.addCreator("AFP Habitat");
    }	
    
    
    private static void addContentCertDeudaTotalEmpleador(	Document document,
    														java.util.List<CertificadoVO> listaCertificadoVO,
    														SolicitudCertificadoVO solicitudCertificadoVO) throws DocumentException 
    {
        Paragraph tituloCertificado = new Paragraph();
        tituloCertificado.setAlignment(Element.ALIGN_LEFT);
        tituloCertificado.add(new Paragraph("Certificado Empleador", tituloGrandeFont));
        document.add(tituloCertificado);
        
        Paragraph fechaCertificado = new Paragraph();        
        addEmptyLine(fechaCertificado, 1);
        fechaCertificado.setAlignment(Element.ALIGN_RIGHT);
        fechaCertificado.add(new Paragraph(""+ new Date(), smallBold));
        document.add(fechaCertificado);

        
        Paragraph tituloPequeno = new Paragraph();        
        addEmptyLine(tituloPequeno, 1);
        tituloPequeno.setAlignment(Element.ALIGN_CENTER);
        tituloPequeno.add(new Paragraph("Certificado Boletin Previsional", tituloPequenoFont));
        document.add(tituloPequeno);
        
        Paragraph textoCertificado = new Paragraph();        
        addEmptyLine(textoCertificado, 1);
        StringBuffer sfTexto = new StringBuffer();
        sfTexto.append("ADMINISTRADORA DE FONDOS DE PENSIONES HABITAT S.A., certifica de acuerdo a lo dispuesto en la Circular N°");
        sfTexto.append("1187 de la Superintendencia de Administradora de Fondos de Pensiones, que el empleador CORPORACION");
        sfTexto.append("EDUCACIONAL SAN ANTONIO, RUT 65.115.285-2, ha pagado en esta Administradora cotizaciones previsionales");
        sfTexto.append("conforme al siguiente detalle:");
        
        textoCertificado.setAlignment(Element.ALIGN_JUSTIFIED);
        textoCertificado.add(new Paragraph(sfTexto.toString(), contenido));
        document.add(textoCertificado);
        
        Paragraph tituloLista = new Paragraph(); 
        addEmptyLine(tituloLista, 1);
        tituloLista.setAlignment(Element.ALIGN_LEFT);
        tituloLista.add(new Paragraph("Boletin", smallBold));
        document.add(tituloLista);        	

        /* tabla contenido */
        Paragraph tabla = new Paragraph(); 
        addEmptyLine(tabla, 1);
        PdfPTable table = new PdfPTable(3);

        PdfPCell c1 = new PdfPCell(new Phrase("Periodo Cotizado"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Monto"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Origen"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        if (listaCertificadoVO.size() > 0)
        {
        	
        	for (int i=0; i < listaCertificadoVO.size(); i++)
        	{
                PdfPCell row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getPeriodoCotizacion()));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);
                
                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getMontoOriginalDeuda()));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);

                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getOrigen()));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);

        	}
	        tabla.add(table);
	        document.add(tabla); 
        }
        
        Paragraph textoBajo_1 = new Paragraph();        
        addEmptyLine(textoBajo_1, 1);
        textoBajo_1.setAlignment(Element.ALIGN_JUSTIFIED);
        textoBajo_1.add(new Paragraph("Hacemos presente que los citados períodos se registra en el Boletín de Infractores Laborales N° 169", contenido));
        addEmptyLine(textoBajo_1, 1);
 
        String texto = "En relación al pago enunciado en el primer párrafo, si hubiese sido realizado mediante cheque(s), la validez del presente";
        texto += "certificado solo regirá en función de la debida recepción de los fondos respectivos.";

        textoBajo_1.setAlignment(Element.ALIGN_JUSTIFIED);
        textoBajo_1.add(new Paragraph(texto, contenido));
        document.add(textoBajo_1);
        
        Paragraph textoDespedida = new Paragraph();        
        addEmptyLine(textoDespedida, 1);
        textoDespedida.setAlignment(Element.ALIGN_JUSTIFIED);
        textoDespedida.add(new Paragraph("Se extiende el presente certificado, para los fines que estime necesario.", contenido));      

        addEmptyLine(textoDespedida, 1);
        textoDespedida.setAlignment(Element.ALIGN_JUSTIFIED);
        textoDespedida.add(new Paragraph("Saluda atentamente a usted,", contenido));          
        
        document.add(textoDespedida);
               
        
        Paragraph textoFooter = new Paragraph();        
        addEmptyLine(textoFooter, 1);
        textoFooter.setAlignment(Element.ALIGN_JUSTIFIED);
        textoFooter.add(new Paragraph("Folio N°: 2b3c303b-9493-47fc-8b93-368f09ffcab0", smallBold));  
        
        addEmptyLine(textoFooter, 1);
        textoFooter.setAlignment(Element.ALIGN_JUSTIFIED);
        textoFooter.add(new Paragraph("Este certificado tiene una validez de 30 días a contar de su fecha de emisión. La persona a la cual sea entregado, puede comprobar su validez ingresando a www.afphabitat.cl, presionando el link Validador de Certificados.", footerText));   
        document.add(textoFooter);
    }	
	
    
    
    private static void addContentCertMoraPresuntaEmpleador(	Document document,
    															java.util.List<CertificadoVO> listaCertificadoVO,
    															SolicitudCertificadoVO solicitudCertificadoVO) throws DocumentException 
    {
        Paragraph tituloCertificado = new Paragraph();
        tituloCertificado.setAlignment(Element.ALIGN_LEFT);
        tituloCertificado.add(new Paragraph("Certificado Empleador", tituloGrandeFont));
        document.add(tituloCertificado);
        
        Paragraph fechaCertificado = new Paragraph();        
        addEmptyLine(fechaCertificado, 1);
        fechaCertificado.setAlignment(Element.ALIGN_RIGHT);
        fechaCertificado.add(new Paragraph(""+ new Date(), smallBold));
        document.add(fechaCertificado);

        
        Paragraph tituloPequeno = new Paragraph();        
        addEmptyLine(tituloPequeno, 1);
        tituloPequeno.setAlignment(Element.ALIGN_CENTER);
        tituloPequeno.add(new Paragraph("Certificado Mora Presunta", tituloPequenoFont));
        document.add(tituloPequeno);
        
        Paragraph textoCertificado = new Paragraph();        
        addEmptyLine(textoCertificado, 1);
        StringBuffer sfTexto = new StringBuffer();
        sfTexto.append("ADMINISTRADORA DE FONDOS DE PENSIONES HABITAT S.A., certifica de acuerdo a lo dispuesto en la Circular N°");
        sfTexto.append("1187 de la Superintendencia de Administradora de Fondos de Pensiones, que el empleador CORPORACION");
        sfTexto.append("EDUCACIONAL SAN ANTONIO, RUT 65.115.285-2, posee la siguiente mora presunta");
        sfTexto.append("conforme al siguiente detalle:");
        
        textoCertificado.setAlignment(Element.ALIGN_JUSTIFIED);
        textoCertificado.add(new Paragraph(sfTexto.toString(), contenido));
        document.add(textoCertificado);
        
        Paragraph tituloLista = new Paragraph(); 
        addEmptyLine(tituloLista, 1);
        tituloLista.setAlignment(Element.ALIGN_LEFT);
        tituloLista.add(new Paragraph("Boletin", smallBold));
        document.add(tituloLista);        	

        /* tabla contenido */
        Paragraph tabla = new Paragraph(); 
        addEmptyLine(tabla, 1);
        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(100);
        
        PdfPCell c1 = new PdfPCell(new Phrase("Periodo Cotizado",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Origen",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("RUT Afiliado",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Nombre Afiliado",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Renta Imponible",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Producto",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("MontoMora",smallBold));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        table.setHeaderRows(1);      
        
        if (listaCertificadoVO.size() > 0)
        {
        	
        	for (int i=0; i < listaCertificadoVO.size(); i++)
        	{
                PdfPCell row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getPeriodoCotizacion(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);
                
                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getOrigenDeuda(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);
                
                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getRutString(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);

                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getNombreCompleto(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);

                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getMontoRentaImponible(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);
                
                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getProducto(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);
                
                row = new PdfPCell(new Phrase(""+listaCertificadoVO.get(i).getMontoMora(),small));
                row.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(row);                

        	}
	        tabla.add(table);
	        document.add(tabla); 
        }
        
        Paragraph textoBajo_1 = new Paragraph();        
        addEmptyLine(textoBajo_1, 1);
        textoBajo_1.setAlignment(Element.ALIGN_JUSTIFIED);
        textoBajo_1.add(new Paragraph("Hacemos presente que los citados períodos se registra en el Boletín de Infractores Laborales N° 169", contenido));
        addEmptyLine(textoBajo_1, 1);
 
        String texto = "En relación al pago enunciado en el primer párrafo, si hubiese sido realizado mediante cheque(s), la validez del presente";
        texto += "certificado solo regirá en función de la debida recepción de los fondos respectivos.";

        textoBajo_1.setAlignment(Element.ALIGN_JUSTIFIED);
        textoBajo_1.add(new Paragraph(texto, contenido));
        document.add(textoBajo_1);
        
        Paragraph textoDespedida = new Paragraph();        
        addEmptyLine(textoDespedida, 1);
        textoDespedida.setAlignment(Element.ALIGN_JUSTIFIED);
        textoDespedida.add(new Paragraph("Se extiende el presente certificado, para los fines que estime necesario.", contenido));      

        addEmptyLine(textoDespedida, 1);
        textoDespedida.setAlignment(Element.ALIGN_JUSTIFIED);
        textoDespedida.add(new Paragraph("Saluda atentamente a usted,", contenido));          
        
        document.add(textoDespedida);
               
        
        Paragraph textoFooter = new Paragraph();        
        addEmptyLine(textoFooter, 1);
        textoFooter.setAlignment(Element.ALIGN_JUSTIFIED);
        textoFooter.add(new Paragraph("Folio N°: 2b3c303b-9493-47fc-8b93-368f09ffcab0", smallBold));  
        
        addEmptyLine(textoFooter, 1);
        textoFooter.setAlignment(Element.ALIGN_JUSTIFIED);
        textoFooter.add(new Paragraph("Este certificado tiene una validez de 30 días a contar de su fecha de emisión. La persona a la cual sea entregado, puede comprobar su validez ingresando a www.afphabitat.cl, presionando el link Validador de Certificados.", footerText));   
        document.add(textoFooter);
    }
    
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }		
	
	
	
	
	
	
	
	
	
	
}
