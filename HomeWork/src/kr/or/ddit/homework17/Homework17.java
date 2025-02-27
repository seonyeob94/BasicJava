package kr.or.ddit.homework17;

import java.util.Calendar;

import kr.or.ddit.util.ScanUtil;

public class Homework17 {
	public static void main(String[] args) {
		Homework17 h = new Homework17();
		h.process();
	}

	public void process() {
		// 달력 만들기
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 1);
		
		while(true) {
			
			int lastDayMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

			
			System.out.println("\t\t\t"+cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월");

			System.out.println("===================================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("===================================================");
			for(int i=1; i<=lastDayMonth;i++) {
				if(i==1) {
					for(int j=1;j<cal.get(Calendar.DAY_OF_WEEK);j++) {
						System.out.print("\t");
					}
				}
				 System.out.print(i+"\t");
				
				if(cal.get(Calendar.DAY_OF_WEEK)==7) System.out.println();

				cal.add(Calendar.DATE, 1);
			}
			System.out.println();
			System.out.println("===================================================");
			
			cal.add(Calendar.MONTH, -1);
			
			String str = ScanUtil.next("<이전달\t\t\t\t\t\t다음달>");
			
			if(str.equals("다음달")) cal.add(Calendar.MONTH, 1);
			else if(str.equals("이전달")) cal.add(Calendar.MONTH, -1);
			else {
				System.out.println("이전달 혹은 다음달을 입력해주세요");
				continue;
			}
			
		}
		
	}
}
