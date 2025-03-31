package kr.or.ddit.jsoup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Step1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String domain ="https://www.yes24.com";
		String url = "https://www.yes24.com/product/category/display/001001019001";
		
		Document doc = Jsoup.connect(url).get();
//		
//		File list = new File("book/step1/index.html");
		
//		Files.write(Paths.get("book/step1/index.html"), doc.html().getBytes());
//		System.out.println(doc.html());
		
		Element li = doc.getElementById("category001");
		
//		System.out.println(li.html());
		
		Elements catelLi = li.getElementsByTag("li");
		
		for(int i  = 0; i<catelLi.size(); i++) {
			Element catel = catelLi.get(i);
			
			System.out.println(catel.html());
			Element atag =  catel.getElementsByTag("a").get(0);
			Element em = catel.getElementsByTag("em").get(0);
			
			String name = em.html().replace("/", "_");
			String link =atag.attr("href");
			
//			System.out.println(atag.attr("href"));
//			System.out.println(em.html());
			
			System.out.println(name +"\t"+link);
			
			Document doc2 = Jsoup.connect(domain+link).get();
			Files.write(Paths.get("book/step1/"+name+".html"), doc2.html().getBytes());
			
			Thread.sleep(1000);
		}
	}
}
