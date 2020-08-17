package ch.so.agi.av.meldesystem;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfName;
import com.itextpdf.kernel.pdf.PdfObject;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfStream;
import com.itextpdf.kernel.pdf.canvas.parser.EventType;
import com.itextpdf.kernel.pdf.canvas.parser.PdfCanvasProcessor;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import com.itextpdf.kernel.pdf.canvas.parser.data.IEventData;
import com.itextpdf.kernel.pdf.canvas.parser.data.TextRenderInfo;
import com.itextpdf.kernel.pdf.canvas.parser.filter.TextRegionEventFilter;
import com.itextpdf.kernel.pdf.canvas.parser.listener.FilteredEventListener;
import com.itextpdf.kernel.pdf.canvas.parser.listener.LocationTextExtractionStrategy;
import com.itextpdf.kernel.pdf.canvas.parser.listener.SimpleTextExtractionStrategy;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.BufferedWriter;

public class App {


    public static void main(String[] args) throws IOException {
        
        String SRC = "./src/test/data/Flumenthal-G-0007132-20160518.pdf";

        PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC));
        
        
//        SimpleTextExtractionStrategy simpleTextExtractionStrategy = new SimpleTextExtractionStrategy();
        FilteredEventListener listener = new FilteredEventListener();

        for (int i = 1; i <= pdfDoc.getNumberOfPages(); i++) {
            
            PdfPage pdfPage = pdfDoc.getPage(i);
            
            SimpleTextExtractionStrategy strategy = new SimpleTextExtractionStrategy();
            String currentText = PdfTextExtractor.getTextFromPage(pdfPage, strategy);
            System.out.println(currentText);
        }
        
//        int numberOfPdfObjects = pdfDoc.getNumberOfPdfObjects();
//        for (int i = 1; i <= numberOfPdfObjects; i++) {
//            
//            PdfObject obj = pdfDoc.getPdfObject(i);
//            
//            if (obj != null) {
//                System.out.println(i);
//                System.out.println(obj.toString());
//                System.out.println(obj.getClass());
//                System.out.println(obj.getType());
//                if (obj.isStream()) {
//                    byte[] b = ((PdfStream) obj).getBytes();
//                } 
//                if (obj.isDictionary()) {
//                }
//
//            }
//
//            
//            
//        }
        
        
        
        
        
        
        System.out.println("Hallo Stefan");
    }
}
