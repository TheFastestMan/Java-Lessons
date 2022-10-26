package mainCurseProf.lesson10;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Main {
    public static void main(String[] args) throws XMLStreamException {
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = xmlOutputFactory.createXMLStreamWriter(System.out);
        //StAX parser21
        writer.writeStartDocument("1");
        writer.writeStartElement("catalog");
        writer.writeStartElement("book");
        writer.writeStartElement("author");
        writer.writeStartElement("bratvaNeStrelyte");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();

        writer.flush();
        writer.close();

    }
}
