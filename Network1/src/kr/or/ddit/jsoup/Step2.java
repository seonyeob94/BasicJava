package kr.or.ddit.jsoup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Step2 {
	public static void main(String[] args) throws IOException {

		String domain ="https://www.yes24.com";
		String url = "https://www.yes24.com/product/category/display/001001019001";
		
		File f = new File("book/step2/인문_교양.html");
		
		Document doc = null;
		if(!f.exists()) {
			doc = Jsoup.connect(url).get();
		}
		else {
			byte[] bte = Files.readAllBytes(Paths.get(f.getPath()));
			String str = new String(bte);
			
//			doc= new Document(str);
			doc= Jsoup.parse(str);
		}
		
		Element uiPagen = doc.getElementsByClass("yesUI_pagen").get(1);
		Element elLast = uiPagen.getElementsByClass("end").get(0);
		
		int lastNum = Integer.parseInt(elLast.attr("title"));
		System.out.println(uiPagen.html());
		System.out.println(lastNum);
	}
}
