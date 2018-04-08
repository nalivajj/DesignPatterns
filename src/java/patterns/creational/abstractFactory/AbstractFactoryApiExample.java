package patterns.creational.abstractFactory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;

public class AbstractFactoryApiExample {
    public static void main(String[] args) throws Exception {
        String xml = "<document><body><stock>AAPL</stock></body></document";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(bais);

        document.getDocumentElement().normalize();

        System.out.println("Root element: " + document.getDocumentElement().getNodeName());

        System.out.println(documentBuilderFactory.getClass());
        System.out.println(documentBuilder.getClass());
    }
}
