package kr.or.ddit.study11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.ddit.util.ScanUtil;

public class CalendarExample {
	public static void main(String[] args) {
		CalendarExample ce = new CalendarExample();
		ce.process();
	}
	
	public void process() {
//		method1();
		method2();
//		method3();
//		method4();
		
	}
	
	
	public void method4() {
		//2024.07.01
		// 10을 더하는데 주말 빼고
		
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 6, 1);
		
		int cnt= 1;
		while(cnt<=10) {
			
			cal.add(Calendar.DATE, 1);
			int day=cal.get(Calendar.DAY_OF_WEEK);
			if(!(day==1 || day==7)) cnt++;
		}
		System.out.println(cal.getTime());
		
	}
	
	public void method3() {
		Calendar cal = Calendar.getInstance();
		
		
//		cal.set(Calendar.YEAR, 2030);
//		cal.set(Calendar.DATE, 10);
		
		
		System.out.println("날짜 : "+cal.get(Calendar.DATE));
		System.out.println("요일(1[일]-7[토]) : "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+cal.get(Calendar.MONTH));
		//월만 0부터 시작
		
		
	}
	
	public void method2() {
		// 스캐너로 날짜를 입력받고 
		// 해당 날짜만큼 더한 날짜를 출력하시오
		// 출력 -> 2024.01.01
		int add=ScanUtil.nextInt("더할 날짜 : ");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -add);
		
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(d));
		
	}
	
	public void method1() {
		Calendar cal = Calendar.getInstance();
		//날짜 연산등 편리성을 위한 클래스
		
		cal.add(Calendar.YEAR, 1);
		Date d = cal.getTime();
		System.out.println(d);
		
		
	}
}
