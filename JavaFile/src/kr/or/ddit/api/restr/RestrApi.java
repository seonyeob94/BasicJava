package kr.or.ddit.api.restr;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import kr.or.ddit.vo.RestrVo;

public class RestrApi {
	String url="https://apis.data.go.kr/6300000/openapi2022/restrnt/getrestrnt";
	String serviceKey="RhVnHBtN5sH%2BjNnuFYT77YCbndFwM1ROcYaK7sXvlxdivLxvpWqLXh2z0A%2B39QQgSaEeuRSa6kZCa5GUMCmQGw%3D%3D";
	public static void main(String[] args) {
		RestrApi retrApi = new RestrApi();
		retrApi.process();
	}
	
	RestrDao restrDao = RestrDao.getInstance();
	
	private void process() {
//		System.out.println(getHtml());
		
//		List<RestrVo> list = getList(getHtml());
//		for(RestrVo restrVo : list) {
//			System.out.println(restrVo);
//		}
		
		String index= getHtml(1);
		
		
		int totalCount = totalCount(index);
		for(int i=1; i<=Math.ceil(totalCount/10.0);i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String html = getHtml(i);
			List<RestrVo> list = getList(html);
			for(RestrVo restrVo : list) {
				List<Object> param = new ArrayList<Object>();
				param.add(restrVo.getRestrnt_nm());
				param.add(restrVo.getRestrnt_zip());
				param.add(restrVo.getRestrnt_addr());
				param.add(restrVo.getRestrnt_dtl_addr());
				param.add(restrVo.getRestrnt_inqrtel());
//				param.add(restrVo.getRprs_fod());
				param.add(restrVo.getRprs_fod_name());
				param.add(restrVo.getRprs_fod_price());
				param.add(restrVo.getSals_time());
				param.add(restrVo.getHldy_guid());
				param.add(restrVo.getRestrnt_summ());
				param.add(restrVo.getMap_lat());
				param.add(restrVo.getMap_lot());
				
//				param.add(restrVo.getRrestrnt_nm());
//				param.add(restrVo.getRrestrnt_zip());
//				param.add(restrVo.getRrestrnt_addr());
//				param.add(restrVo.getRrestrnt_dtl_addr());
//				param.add(restrVo.getRrestrnt_inqrtel());
//				param.add(restrVo.getRrprs_fod());
//				param.add(restrVo.getRrprs_fod_price());
//				param.add(restrVo.getSsals_time());
//				param.add(restrVo.getHhldy_guid());
//				param.add(restrVo.getRrestrnt_summ());
//				param.add(restrVo.getMmap_lat());
//				param.add(restrVo.getMmap_lot());
				
				System.out.println("Param count: " + param.size());
				System.out.println("Parameters: " + param);

				restrDao.insertRestr(param);
				
			}
		}
	}
	

	
	public int totalCount(String html) {
		
		JSONParser jp = new JSONParser();
		
		try {
			JSONObject root =(JSONObject) jp.parse(html);
			JSONObject response = (JSONObject)root.get("response");
			JSONObject body = (JSONObject) response.get("body");
			int totalCount = (int)((long) body.get("totalCount"));
			return totalCount;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public List<RestrVo> getList(String html){
		List<RestrVo> list= new ArrayList();
		JSONParser jp = new JSONParser();
		try {
			JSONObject root =(JSONObject) jp.parse(html);
			JSONObject response = (JSONObject)root.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONArray items = (JSONArray) body.get("items");
			
			for(int i =0; i<items.size();i++) {
				JSONObject item = (JSONObject) items.get(i);
				
				RestrVo restrVo = new RestrVo();
				
				
				  String restrntNm      =(String) item.get("restrntNm");
		          String restrntZip      =(String) item.get("restrntZip");
		          String restrntAddr      =(String) item.get("restrntAddr");
		          String restrntDtlAddr      =(String) item.get("restrntDtlAddr");
		          String restrntInqrTel      =(String) item.get("restrntInqrTel");
		          String rprsFod      =(String) item.get("rprsFod");
		          String rprsFod_name      =null;
		          String rprsFod_price      =null;
		          if(rprsFod.split("/").length==1) {
		        	  rprsFod_name      =rprsFod.split("/")[0];
		        	  
		          }
		          if(rprsFod.split("/").length==2) {
		        	  rprsFod_name      =rprsFod.split("/")[0];
		        	  rprsFod_price      =rprsFod.split("/")[1];
		        	  
		          }
		          
		  		  String salsTime      =(String) item.get("salsTime");
		          String hldyGuid      =(String) item.get("hldyGuid");
		          String restrntSumm      =(String) item.get("restrntSumm");
		          String mapLat      =(String) item.get("mapLat");
		          String mapLot      =(String) item.get("mapLot");
		          
		          restrVo.setRestrnt_nm(restrntNm);
		          restrVo.setRestrnt_zip(restrntZip);
		          restrVo.setRestrnt_addr(restrntAddr);
		          restrVo.setRestrnt_inqrtel(restrntInqrTel);
		          restrVo.setRprs_fod_name(rprsFod_name);
		          restrVo.setRprs_fod_price(rprsFod_price);
		          restrVo.setSals_time(salsTime);
		          restrVo.setHldy_guid(hldyGuid);
		          restrVo.setRestrnt_summ(restrntSumm);
		          restrVo.setMap_lat(mapLat);
		          restrVo.setMap_lot(mapLot);
		          
		          list.add(restrVo);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONParser parser = new JSONParser();
		
		
		return list;
	}
	
	public String getHtml(int pageNoInt) {
		String pageNo =pageNoInt+"";
		String numOfRows ="10";
		String fullUrl=url+"?serviceKey="+serviceKey+"&pageNo="+pageNo+"&numOfRows="+numOfRows;
		
		String html=ApiUtil.httpConnect(fullUrl);
		
		return html;
	}
}
