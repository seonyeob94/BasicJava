package kr.or.ddit.homework19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import kr.or.ddit.util.ScanUtil;

public class HomeWork19 {
	private static final String String = null;

	public static void main(String[] args) {
		HomeWork19 obj = new HomeWork19();
		obj.process();
	}
	List<Map<String, String>> list;
	
	public void process() {
		insertData();
		
		
		//데이터 출력 해보기
//		printData();
		parkTime();
		
	}
	
	public void parkTime() {
		// 차량 번호별 주차시간 계산하기
		System.out.println("차량번호\t주차시간\t주차비");
		Set<String> carNumSet = new HashSet();
		for(int i=0; i<list.size();i++) {
			Map<String, String> map = list.get(i);
			String carNum =map.get("차량번호");
			carNumSet.add(carNum);
		}
		
		Iterator<String> it = carNumSet.iterator();
		while(it.hasNext()) {
			String carNum = it.next();
			int partTime = parkTimeDetail(carNum);
			int payMoney = payMony(partTime);
			System.out.println(carNum+"\t"+partTime+"\t"+payMoney);
		}
	}
	
	public int payMony(int partTime) {
		// 기본시간	기본요금	단위시간	단위요금
		// 120		5000	10분		600원
		int pay=5000;
		if(partTime>120) {
			int bonus = (partTime-120+9)/10;
			pay+=bonus*600;
		}
		return pay;
	}
	
	public int parkTimeDetail(String carNum) {
		// 한 차량의 주차시간
		int result = 0;
		for(int i=0;i<list.size();i++) {
			Map<String, String> map = list.get(i);
			String num = map.get("차량번호");
			String recod = map.get("내역");
			String time = map.get("time");
			int time1 = 0;
			
			if(num.equals(carNum)&&recod.equals("출차")) {
				time1+=(int)getTime((String)map.get("time"));
			}
			else if(num.equals(carNum)&&recod.equals("입차")) {

				time1-=(int)getTime((String)map.get("time"));
			}
			result+=time1;
		}
		
		
		return result;
	}
	
	
	public int getTime(String time) {
		int hour = Integer.parseInt(time.split(":")[0]);
		int min = Integer.parseInt(time.split(":")[1]);
		
		return hour*60+min;
	}
	
	
	public void printData() {
		//전체 데이터 출력
		System.out.println("전체 데이터 출력");
		System.out.println("시간\t차량번호\t내역");
		System.out.println("-------------------------");
		for(int i=0;i<list.size();i++) {
			Map<String, String> map = list.get(i);
			String time = (String)map.get("time");
			String carNum = (String)map.get("차량번호");
			String recod = (String)map.get("내역");
			System.out.println(time+"\t"+carNum+"\t"+recod);
			
		}
		System.out.println("-------------------------");
	}
	
	public void insertData() {
		// 시각	차량번호	내역
		//05:34	5961	입차
		//06:00	0000	입차
		//06:34	0000	출차
		//07:59	5961	출차
		//07:59 0148	입차
		//18:59	0000	입차
		//19:09	0148	출차
		//22:59	5961	입차
		//23:00	5961	출차
		//23:50	0000	출차
		
		//list에 넣기

		list = new ArrayList();
		Map<String, String> el =new HashMap();
		el.put("time", "05:34");
		el.put("차량번호", "5961");
		el.put("내역", "입차");
		list.add(el);

		Map<String, String> e2 =new HashMap();
		e2.put("time", "06:00");
		e2.put("차량번호", "0000");
		e2.put("내역", "입차");
		list.add(e2);

		Map<String, String> e3 =new HashMap();
		e3.put("time", "06:34");
		e3.put("차량번호", "0000");
		e3.put("내역", "출차");
		list.add(e3);

		Map<String, String> e4 =new HashMap();
		e4.put("time", "07:59");
		e4.put("차량번호", "5961");
		e4.put("내역", "출차");
		list.add(e4);

		Map<String, String> e5 =new HashMap();
		e5.put("time", "07:59");
		e5.put("차량번호", "0148");
		e5.put("내역", "입차");
		list.add(e5);

		Map<String, String> e6 =new HashMap();
		e6.put("time", "18:59");
		e6.put("차량번호", "0000");
		e6.put("내역", "입차");
		list.add(e6);

		Map<String, String> e7 =new HashMap();
		e7.put("time", "19:09");
		e7.put("차량번호", "0148");
		e7.put("내역", "출차");
		list.add(e7);

		Map<String, String> e8 =new HashMap();
		e8.put("time", "22:59");
		e8.put("차량번호", "5961");
		e8.put("내역", "입차");
		list.add(e8);

		Map<String, String> e9 =new HashMap();
		e9.put("time", "23:00");
		e9.put("차량번호", "5961");
		e9.put("내역", "출차");
		list.add(e9);

		Map<String, String> e10 =new HashMap();
		e10.put("time", "23:50");
		e10.put("차량번호", "0000");
		e10.put("내역", "출차");
		list.add(e10);
		
	}
}
