package kr.or.ddit.xml;

import java.io.File;
import java.lang.module.ModuleDescriptor.Builder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlExample02 {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		XmlExample02 obj = new XmlExample02();
		obj.process();
	}
	
	public void process() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder bilder = factory.newDocumentBuilder();
		
		Document doc = bilder.newDocument();
		
		Element root = doc.createElement("book2");
		
		Element book1 = doc.createElement("book");
		book1.setAttribute("issn", "1000");
		
		Element name1 = doc.createElement("name");
		Element writer1 = doc.createElement("writer");
		Element pub1 = doc.createElement("pub");
		name1.setTextContent("책1");
		writer1.setTextContent("저자1");
		pub1.setTextContent("출판사1");
		
		book1.appendChild(name1);
		book1.appendChild(writer1);
		book1.appendChild(pub1);
		
		root.appendChild(book1);

		Element book2 = doc.createElement("book");
		book2.setAttribute("issn", "1001");
		
		Element name2 = doc.createElement("name");
		Element writer2 = doc.createElement("writer");
		Element pub2 = doc.createElement("pub");
		
		name2.setTextContent("책2");
		writer2.setTextContent("저자2");
		pub2.setTextContent("출판사2");
		
		book2.appendChild(name2);
		book2.appendChild(writer2);
		book2.appendChild(pub2);
		
		root.appendChild(book2);
		
		doc.appendChild(root);
		
		TransformerFactory transgormerFactory =TransformerFactory.newInstance();
		Transformer transformer = transgormerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("xml/book2.xml"));
		
		transformer.transform(source, result);
		
		
		
		
	}
}
