package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import kr.or.ddit.util.ScanUtil;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
		de.process();
		
	}
	boolean debug = false;
	
	public void process() {
//		method1();
		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
		
	}
	
	public void method10() {
		
		String[] array = {"2024.07.01", "2024.09.24", "2025.01.10"};
		// 1번째 작업을 하는데 10일 ,2번째 작업을 하는데 20일 , 3번째 작업시 30일이 걸릴 경우
		// 완성 날짜를 각각 2024/07/01형태로 출력하시오.
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		
		long sec=1000;
		long min=sec*60;
		long hour=min*60;
		long day=hour*24;
		
		for(String day1 : array) {

			try {
				Date d1 = sdf1.parse(day1);
				
				long time =d1.getTime()+day*10;
			
				Date d2 = new Date(time);
				String result =sdf2.format(d2);
				System.out.println(result);
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void method9() {
		// 2025.09.03 몇일 남았는지 출력
//		long sec=1000;
//		long min=sec*60;
//		long hour=min*60;
//		long day=hour*24;
//		
//		Date d1= new Date();
//
//		long time1 = d1.getTime();
//		
//		Date d2 = new Date(time1);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//		String day1 = sdf.format(d2);
//		System.out.println(day1);
//		
//		String str = "2025.9.3";
//
//		try {
//			Date date = sdf.parse(str);
//			System.out.println(date);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
				
		String str= "2025.9.3";
		try {
			
			Date d1 = sdf.parse(str);
			Date d2 = new Date();
			
			long time =d1.getTime()-d2.getTime();
			System.out.println(time/86400/1000+"일 남았습니다.");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void method8() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		//String -> Date
		
		String str = "2024.7.1";
		
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void method7() {
		// 현재 날짜로부터 입력받은 날짜 만클 더한 날짜를 출력하시오
		// 출력 -> 2025.10.17
		long sec=1000;
		long min=sec*60;
		long hour=min*60;
		long day=hour*24;

		long add=ScanUtil.nextInt("더할 일수 : ");
		Date d1 = new Date();
		long time = d1.getTime()+day*add;
		Date d2 = new Date(time);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String result = sdf.format(time);
		
		System.out.println(result);
		
		
		
	}
	
	
	public void method6() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
		Date date = new Date();
		//자바에서 mm->분, MM->월
//		SimpleDateFormat
//		Date - > String , String -> Date로 변환하는 메소드 제공
//		format (Date -> String)
		
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
		
		
	}
	
	
	public void method5() {
		//100일 시간 출력
		
		//스캐너로 입력받은 날짜 만큼 더한 값을 출력
		long sec=1000;
		long min=sec*60;
		long hour=min*60;
		long day=hour*24;
		
		long add=ScanUtil.nextInt("날짜입력");
		Date d3 = new Date();
		long time = d3.getTime()+day*add;
		
		Date d4 = new Date(time);
		
		
		
		Date d1 = new Date();
		long time1 = d1.getTime()+day*100;
		
		Date d2 = new Date(time1);
		
		System.out.println("현재 시간 : "+d1);
		System.out.println("100일 후 시간 : "+d2);
		
		
	}
	
	
	public void method4() {
		Date d1 = new Date();
		
		long time = d1.getTime()+1000*60;
		
		Date d2 = new Date(time);
		
		System.out.println(d1);
		System.out.println(d2);
		
		
		
	}
	
	
	public void method3() {
		//1-100만까지 더하고 걸리는 시간을 출력 하시오

		
		int cnt = 100000000;
		long num=0;
		Date d1= new Date();
		//1-n까지의 합 -> n*(n+1)/2
//		long sum = cnt*(cnt+1)/2;
		
		for(int i=1;i<cnt;i++) {
			num+=i;
			if(debug) System.out.print(num);
		}

		Date d2 = new Date();
		long time = d2.getTime()-d1.getTime();
		System.out.println(time+"ms");
		
	}
	
	public void method2() {
		// 객체가 만들어진 시간(컴퓨터)을 가져옴.
		
		int cnt = 1000000;
		Date d1 = new Date();
		
		for(int i=0;i<cnt;i++) {
			
		}
		Date d2 = new Date();
		long time = d2.getTime()-d1.getTime();
		System.out.println(time+"ms");
		for(int i=0;i<cnt;i++) {
			if(debug) System.out.println(i);
		}
		if(debug) System.out.println();
		Date d3= new Date();
		long time2= d3.getTime()-d2.getTime();
		
		System.out.println(time2+"ms");
		
		
		
		
	}
	
	
	 public void method1() {

			//날짜 시간 관련 처리하는 클래스
			
			// 객체가 만들어진 시간(컴퓨터)을 가져옴.
			Date date = new Date();
			System.out.println(date);
			//getTime 1970년 1월 1일 0시부터 지난 시간을 나타냄
			//단위 ms
			long time = date.getTime();
			
			// 몇년 몇일 몇시 몇분 몇초가 지났는지 출력하시오
			
				long sec=1000;
				long min=sec*60;
				long hour=min*60;
				long day=hour*24;
				long year=day*365;
				
				
				long years=time/year;
				time%=year;
				long days=time/day;
				time%=day;
				long hours=time/hour;
				time%=hour;
				long mins=time/min;
				time%=min;
				long secs=time/sec;
						
				
				System.out.printf("%d년 %d일 %d시간 %d분 %d초",
						years, days, hours, mins, secs);
				//자바 시간과 오라클 시간이 다를수 있다.
				
				//도커 pc안에 pc를 깔아 가상머신을 이용함
	 }
}
