package kr.or.ddit.api;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=" + "RhVnHBtN5sH%2BjNnuFYT77YCbndFwM1ROcYaK7sXvlxdivLxvpWqLXh2z0A%2B39QQgSaEeuRSa6kZCa5GUMCmQGw%3D%3D"
        		+ ""); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8")    + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8")  + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20250321", "UTF-8")); /*‘21년 6월 28일 발표*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("1400", "UTF-8")); /*06시 발표(정시단위) */
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8")        + "=" + URLEncoder.encode("68", "UTF-8")); /*예보지점의 X 좌표값*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8")        + "=" + URLEncoder.encode("100", "UTF-8")); /*예보지점의 Y 좌표값*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line+"\n");
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        JSONParser jparser = new JSONParser();
        
        try {
			JSONObject jobj = (JSONObject)jparser.parse(sb.toString());
			JSONObject response = (JSONObject)jobj.get("response");
			JSONObject body = (JSONObject)response.get("body");
			
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray) items.get("item");
			String rn1="";
			String t1h="";
			String reh="";
			
			for(int i =0; i<item.size();i++) {
				JSONObject data = (JSONObject) item.get(i);
				String category = (String) data.get("category");
				if(category.equals("RN1")) rn1 = (String) data.get("obsrValue");
				if(category.equals("T1H")) t1h = (String) data.get("obsrValue");
				if(category.equals("REH")) reh = (String) data.get("obsrValue");
			}
			
				
			System.out.println(rn1+", "+t1h+", "+reh);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}