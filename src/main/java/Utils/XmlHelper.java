package Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringWriter;

public class XmlHelper {
    public static String toXmlString(Object obj, Class classOfObj) {
        String objSerializedToXml = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(classOfObj);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter stringWriter = new StringWriter();

            jaxbMarshaller.marshal(obj, stringWriter);

            objSerializedToXml = stringWriter.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return objSerializedToXml;
    }

    public static Document toDocument(Object obj, Class classOfObj) {
        Document document = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(classOfObj);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            document = builder.newDocument();

            jaxbMarshaller.marshal(obj, document);

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return document;
    }
    public static Element parseElementFromXml(String xml) {
        Element element = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.newDocument();

            element = document.createElement("cp:data");


        }
        catch (Exception e) {

        }

        return element;
    }
}
