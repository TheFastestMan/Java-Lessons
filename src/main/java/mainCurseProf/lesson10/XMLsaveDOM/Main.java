package mainCurseProf.lesson10.XMLsaveDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element rootElement = doc.createElement("Catalog");
            doc.appendChild(rootElement);
            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);
            Element author1 = doc.createElement("author");
            book1.appendChild(author1);

            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);
            Element author2 = doc.createElement("author");
            book2.appendChild(author2);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson10\\XMLsaveDOM\\1.xml"));
            t.transform(source,sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
