package convertirHTML;

import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{

			   TransformerFactory tFactory = TransformerFactory.newInstance();

			   Source xslDoc = new StreamSource("estilosxl.xsl");

			   Source xmlDoc = new StreamSource("alumnos.xml");

			   String outputFileName = "report.html";

			   OutputStream htmlFile = new FileOutputStream(outputFileName);

			   Transformer trasform = tFactory.newTransformer(xslDoc);

			   trasform.transform(xmlDoc, new StreamResult(htmlFile));

			  } catch (Exception e)

			  {

			   e.printStackTrace();

			  }
	}

}
