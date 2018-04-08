package patterns.creational.abstractFactory;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class AbstractFactoryApiExample {
    public static void main(String[] args) throws Exception {
        String xml = "<document><body><stock>AAPL</stock></body></document";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(byteArrayInputStream);
        document.getDocumentElement().normalize();

        System.out.println("Root element: " + document.getDocumentElement().getNodeName());
        System.out.println(documentBuilderFactory.getClass());
        System.out.println(documentBuilder.getClass());
    }
}
