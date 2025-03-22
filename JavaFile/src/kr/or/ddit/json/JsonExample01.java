package kr.or.ddit.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.transform.OutputKeys;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonExample01 {
	public static void main(String[] args) {
		//map 과 같은 형태로 key, value로 이루어짐
		JSONObject jobj = new JSONObject();
	
		jobj.put("data1", "값1");
		jobj.put("data2", "값2");
		
		System.out.println(jobj.get("data1"));
		System.out.println(jobj.get("data2"));
		
		if(jobj.containsKey("data1")){
			System.out.println("datal이 포함됨");
		}
		
		Iterator it = jobj.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String) it.next();
			String value = (String) jobj.get(key);
			System.out.println(key+" : "+value);
		}
		
		JSONArray jArr = new JSONArray();
		
		jArr.add(1);
		jArr.add("ABC");
		jArr.add(true);
		
		JSONObject member = new JSONObject();
		member.put("name", "이효재");
		member.put("age", 19);
		jArr.add(member);
		
		jobj.put("배열", jArr);
		
		System.out.println(jobj);
		System.out.println(jArr);
		try {
			FileWriter fw = new FileWriter("json/test.json");
			fw.write(jobj.toJSONString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
