package kr.or.ddit.homework01;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		//1970년 1월 1일
		// 1000ms -> 1s 
		Date date = new Date();
		
		long time = date.getTime();
//		1738656780454
		System.out.println(time);
		
		// x년 x일 x시 x분 x초 지났습니다
		
//		long a = 1000;
//		
//		long min = 60;
//		
//		long mins = a/min;
//		
//		a = a-min*mins;
//		System.out.println(mins);
//		System.out.println(a);
		
		
		
//		long year = time/365/24/60/60/1000;
//		long a = (time - year*365*24*60*60*1000); //년도 나머지
//		long day = a/24/60/60/1000;
//		long b = (a - day*24*60*60*1000); // 일수 나머지
//		long hour = b/60/60/1000;
//		long c = (b-hour*60*60*1000); // 시 나머지
//		long min = c/60/1000;
//		long d = (c- min*60*1000); // 분 나머지
//		long mins = d/1000;
//		
//		System.out.println(year+"년 "+day+"일 "+hour+"시 "+min+"분 "+mins+"초 지났습니다");
		
		
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = day*365;
		
		long years = time/year;
//		time = time - years*year;
		time %=year;
		
		long days = time/day;
//		time = time - days*day;
		time %=day;
		
		long hours = time/hour;
//		time = time - hours*hour;
		time %=hour;
		
		long mins = time/min;
//		time = time - mins*min;
		time %=min;
		
		long secs = time/sec;
//		time = time - secs*sec;
		time %=sec;


		
		System.out.println(years + "년 "+ days + "일 "+ hours + "시 "+ mins + "분 " + secs + "초 지났습니다");
		
		

		
		
	}

}
