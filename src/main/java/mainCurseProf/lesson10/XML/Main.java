package mainCurseProf.lesson10.XML;

import mainCurseProf.lesson10.XML.XMLParser;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args)throws UnsupportedEncodingException {
        XMLParser xml = new XMLParser("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson10\\2.xml");

        String value = xml.get("catalog/book/author");
        System.out.println(value);

    }
}
