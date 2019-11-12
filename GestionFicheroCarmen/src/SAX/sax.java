package SAX;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class sax {
	   boolean bNombre = false;
       boolean bUsername = false;
       boolean bPassword = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				SAXParserFactory fact=SAXParserFactory.newInstance();
				SAXParser saxParser=fact.newSAXParser();
	            
	            DefaultHandler handler = new DefaultHandler() {
	                boolean bnombre = false;
	                boolean bedad = false;
	      
	                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	             
	                   
	                    if (qName.equalsIgnoreCase("nombre")) {
	                        bnombre = true;
	                    }
	                    if (qName.equalsIgnoreCase("edad")) {
	                        bedad = true;
	                    }
	                }
	              

	                public void endElement(String uri, String localName, String qName) throws SAXException {
	                //   System.out.println("finaliza elemento:" + qName);
	                }
	                
	                public void characters(char ch[], int start, int length) throws SAXException {
	                
	                    if (bnombre) {
	                        System.out.println("Nombre: " + new String(ch, start, length));
	                        bnombre = false;
	                    }
	                    if (bedad) {
	                        System.out.println("Edad: " + new String(ch, start, length));
	                        bedad = false;
	                    }
	                  
	                }
	            };
	            File file = new File("alumnos.xml");
	            InputStream inputStream = new FileInputStream(file);
	            Reader reader = new InputStreamReader(inputStream, "UTF-8");
	           InputSource is = new InputSource(reader);
	            is.setEncoding("UTF-8");
	            saxParser.parse(is, handler);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	}
	
