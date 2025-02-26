package kr.or.ddit.homework99;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import kr.or.ddit.util.ScanUtil;

public class Homework17 {
	public static void main(String[] args) {
		Homework17 h = new Homework17();
		h.process();
	}
	
	public void process() {
		// 달력만들기
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2025);
		
		
		while(true) {			
			for(int mon=1; mon<=12; ) {
				
				cal.set(Calendar.MONTH, mon);
				cal.set(Calendar.WEEK_OF_MONTH, mon);

//				cal.set(Calendar.DATE, 1);
				
				System.out.println("\t\t\t"+(cal.get(Calendar.MONTH)+1)+"월"); 
			
			int lastDayMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// 달력의 마지막 날짜.	
				
			System.out.println("==================================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("==================================================");
			cal.get(Calendar.MONTH);	
			int cnt = cal.get(Calendar.DATE);
			int dayW = cal.get(Calendar.DAY_OF_WEEK);
				
			for(int d=1; d<=7; d++) {
				if(d==cnt) {
					break;
				}
				else
				 System.out.print("\t");
			}
	
			for(int i=1; i<=lastDayMonth; i++) {			 
				cnt++;
				if(cnt<8){	
					
					System.out.print(i+"\t");
					
				}
				else  {					
					System.out.println(i+"\t");
					cnt = 1;
				}				      			
			} 
			System.out.println("\t");
			System.out.println("==================================================");

			String str = ScanUtil.next("<이전달 다음달>");
			// 이전달 누르면 이전달, 다음달 누르면 다음달로
				if(str.equals("다음달")) {
					cal.add(Calendar.MONTH, 1);

				}				
				else if(str.equals("이전달")) {
					cal.add(Calendar.MONTH, -1);			    
				}
			}		
			
		}
		
	}
		
}
