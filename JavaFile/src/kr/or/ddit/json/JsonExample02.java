package kr.or.ddit.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample02 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("json/test.json");
			
			JSONParser parser = new JSONParser();
			
//			JSONObject jobj =(JSONObject)parser.parse(fr);
			JSONArray jarry =(JSONArray)parser.parse("[1,2,3]");
			
			System.out.println(jarry);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
