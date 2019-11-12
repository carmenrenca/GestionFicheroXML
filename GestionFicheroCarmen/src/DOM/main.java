package DOM;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("alumnos.xml");
		
		try {
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  Document doc = dBuilder.parse(file);
			  doc.getDocumentElement().normalize();
			  NodeList nList = doc.getElementsByTagName("alumno");
			  
			  
			  for(int i=0; i<nList.getLength(); i++) {
		Node nNode = nList.item(i);
				  if(nNode.getNodeType()==Node.ELEMENT_NODE){
					Element eElement =(Element) nNode;
					System.out.println("Nombre: "+eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("Edad: "+eElement.getElementsByTagName("edad").item(0).getTextContent());
				  }
			  }
			  
			  
			  
			  
			} catch(Exception e) {
			  e.printStackTrace();
			}
	}

}
