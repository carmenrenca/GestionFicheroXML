package SAX;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				SAXParserFactory factory = SAXParserFactory.newInstance();
	            SAXParser saxParser = factory.newSAXParser();
			}catch (Exception e) {
	            e.printStackTrace();

			}
	}

}
