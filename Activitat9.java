import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Activitat9 {
    public static void main(String[] args) {
        new Activitat9().inicio();
    }

    public void inicio() {
        try {
            File inputFile = new File("bookins.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLSAXHandler userHandler = new XMLSAXHandler();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}