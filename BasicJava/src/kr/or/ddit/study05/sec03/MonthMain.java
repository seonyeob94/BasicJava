package kr.or.ddit.study05.sec03;

public class MonthMain {
	public static void main(String[] args) {
		MonthMain mm = new MonthMain();
		mm.process();
	}
	
	public void process() {
		month(Month.FEB);
//		1jan
//		2feb
//		3mar
//		4apr
//		5may
//		6june
//		7july
//		8aug
//		9sept
//		10oct
//		11nov
//		12des
	}
	
	public void month(Month m) {
		if(m==Month.JAN) System.out.println();
	}
	
	
	
}
