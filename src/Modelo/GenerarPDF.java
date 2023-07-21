
package Modelo;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;


public class GenerarPDF {
    
    public void generarPDFimpuestosAldia(JTable table, String filePath) {
    try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
        
        // Obtener la fecha actual
        Date fechaActual = new Date();
        
        // Formatear la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fechaActual);
        String texto = "Por medio de la presente,el La fecha actual ("+fechaFormateada+") se emite el siguiente documento con el fin de validar el estado activo de libertad o de pago en relación a los vehículos registrados\nEn caso de requerir aclaraciones adicionales o información complementaria, ponerse en contacto con la entidad encargada. ";
        Paragraph paragraph = new Paragraph(texto);
        document.add(paragraph);
        document.add(Chunk.NEWLINE); 
        
        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
       
        for (int i = 0; i < table.getColumnCount(); i++) {
            pdfTable.addCell(new Phrase(table.getColumnName(i)));
        }
        
        for (int row = 0; row < table.getRowCount(); row++) {
            for (int column = 0; column < table.getColumnCount(); column++) {
                pdfTable.addCell(table.getValueAt(row, column).toString());
            }
        }
        
        document.add(pdfTable);
        document.close();
        
        System.out.println("PDF generado exitosamente.");
    } catch (Exception ex) {
        System.out.println("Error al generar el PDF: " + ex.getMessage());
    }
}
    public void generarPDFVehiculos(JTable table, String filePath) {
    try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
         Date fechaActual = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fechaActual);
        String texto = "Por medio de la presente, en el día ("+fechaFormateada+") se emite el presente documento con el fin de comunicar y notificar de manera oficial la información concerniente a los vehículos debidamente registrados dentro del sistema. El propósito de esta comunicación es mantener un amplio control y un manejo eficiente de los datos correspondientes a dichos vehículos, garantizando la integridad y la precisión de la información consignada.";
        Paragraph paragraph = new Paragraph(texto);
        document.add(paragraph);
        document.add(Chunk.NEWLINE); 
        
        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
       
        for (int i = 0; i < table.getColumnCount(); i++) {
            pdfTable.addCell(new Phrase(table.getColumnName(i)));
        }
        
        for (int row = 0; row < table.getRowCount(); row++) {
            for (int column = 0; column < table.getColumnCount(); column++) {
                pdfTable.addCell(table.getValueAt(row, column).toString());
            }
        }
        
        document.add(pdfTable);
        document.close();
        
        System.out.println("PDF generado exitosamente.");
    } catch (Exception ex) {
        System.out.println("Error al generar el PDF: " + ex.getMessage());
    }
}
    
    public void generarPDFcomparendosAldia(JTable table, String filePath) {
    try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
         Date fechaActual = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fechaActual);
        String texto = "Por medio de la presente,en el dia de hoy ("+fechaFormateada+") se emite el presente documento con el propósito de verificar y confirmar el estado activo de los pagos relacionados con los comparendos registrados dentro del sistema. El objetivo principal de esta comunicación es asegurar que los pagos correspondientes a las multas y sanciones impuestas por infracciones de tránsito se encuentren debidamente registrados y actualizados en el sistema";
        Paragraph paragraph = new Paragraph(texto);
        document.add(paragraph);
        document.add(Chunk.NEWLINE); 
        
        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
       
        for (int i = 0; i < table.getColumnCount(); i++) {
            pdfTable.addCell(new Phrase(table.getColumnName(i)));
        }
        
        for (int row = 0; row < table.getRowCount(); row++) {
            for (int column = 0; column < table.getColumnCount(); column++) {
                pdfTable.addCell(table.getValueAt(row, column).toString());
            }
        }
        
        document.add(pdfTable);
        document.close();
        
        System.out.println("PDF generado exitosamente.");
    } catch (Exception ex) {
        System.out.println("Error al generar el PDF: " + ex.getMessage());
    }
}
    
    public void generarPDFImpuestoPorAño(JTable table, String filePath) {
    try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
         Date fechaActual = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fechaActual);
        String texto = "Por medio de la presente,en el dia de hoy ("+fechaFormateada+") se emite el presente documento con el propósito de visualizar todos los impuestos registrados en un año espesifico . El objetivo principal de esta comunicación es que los impuesto se encuentren debidamente registrados y actualizados en el sistema";
        Paragraph paragraph = new Paragraph(texto);
        document.add(paragraph);
        document.add(Chunk.NEWLINE); 
        
        PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
       
        for (int i = 0; i < table.getColumnCount(); i++) {
            pdfTable.addCell(new Phrase(table.getColumnName(i)));
        }
        
        for (int row = 0; row < table.getRowCount(); row++) {
            for (int column = 0; column < table.getColumnCount(); column++) {
                pdfTable.addCell(table.getValueAt(row, column).toString());
            }
        }
        
        document.add(pdfTable);
        document.close();
        
        System.out.println("PDF generado exitosamente.");
    } catch (Exception ex) {
        System.out.println("Error al generar el PDF: " + ex.getMessage());
    }
} 
    
    
}
