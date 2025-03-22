package kr.or.ddit.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlExample01 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		XmlExample01 obj = new XmlExample01();
		obj.process();

	}
	
	/*
	 * 
	 *  DoM 방식으로 XML 읽기
	 * 
	 *  XMl 문서를 트리 구조로 메모리에 로드하여 다룸
	 * 
	 *  XML 각 요소(Element)를 노드 형태로 저장하여 탐색 및 수정 가능
	 *  
	 *  장점 : XML을 반복 탐색하거나 특정요소를 찾기가 편함
	 *  단점 : XML 파일크기가 크면 메모리 사용량이 많아짐
	 *  
	 *  Sax 방식으로 XML읽기
	 *  xml 데이터를 한줄씩 읽어서 처리하기 때문에 대용량 XML처리에 적합
	 *  xml 읽으면서 이벤트 발생시키므로 속도 빠름
	 *  랜덤 접근 불가능
	 *  사용이 다소 복잡.
	 * 
	 */

	
	public void process() throws ParserConfigurationException, SAXException, IOException {
		File XmlFile = new File("xml/book.xml");

		DocumentBuilderFactory facatory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = facatory.newDocumentBuilder();

		Document doucument = builder.parse(XmlFile);

		Element root = doucument.getDocumentElement();
		System.out.println("Root Element : " + root.getNodeName());

		// root 밑에 있는 자식(요소) 리스트 가져오기
//		NodeList nodeList = root.getChildNodes();
//
//		for (int i = 0; i < nodeList.getLength(); i++) {
//			// book
//			Node node = nodeList.item(i);
//			if (node.getNodeType() == Node.ELEMENT_NODE) {
//
//				Element book = (Element) node;
//
//				String issn = book.getAttribute("issn");
//				System.out.println("issn : " + issn);
//
//				String name = book.getElementsByTagName("name").item(0).getTextContent();
//				System.out.println("name : "+ name);
//				
//				String writer = book.getElementsByTagName("writer").item(0).getTextContent();
//				System.out.println("writer : "+ writer);
//
//				String pub = book.getElementsByTagName("pub").item(0).getTextContent();
//				System.out.println("pub : "+ pub);
//			}
//
//		}

//		NodeList bookList = root.getElementsByTagName("book");
//		
//		for(int i =0;i<bookList.getLength();i++) {
//			Node node = bookList.item(i);
//			
//			Element book = (Element) node;
//			
//			NamedNodeMap atts = book.getAttributes();
//			for(int j=0; j<atts.getLength();j++) {
//				Node aNode = atts.item(i);
//				if(aNode==null) continue;
//				String att = aNode.getNodeName();
//				String val = aNode.getNodeValue();
//				System.out.println(att+" "+val);
//			}
//		}
		
		
		
		
	}

}
