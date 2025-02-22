package kr.or.ddit.study05.sec01;

public class ReferenceExample01 {

	public static void main(String[] args) {
		ReferenceExample01 obj = new ReferenceExample01();
		obj.process();
	}

	public void process() {

//		int a = 10;
//		
//		if(a==10) {
//			int b = 13;
//			
//			int c = 15;
//		
//		}//<- 
//		
//		int d = 17;
		method1();

	}

	public void method1() {
		int a = 10;
		//1

		if (++a > 10) {
			int b = 11;
			//2	
			int c = 13;
			//3
			int sum = 0;
			//4
			for (int d = 0; d < 4; d++) {
				//5
				sum += d;
				//6
			}
			System.out.println(a);

		} else {

			int b = 11;
			//2
			int c = 13;
			//3
			int sum = 0;
			//4
			for (int d = 0; d < 4; d++) {
				sum += d;
				//5
			}
		}
		System.out.println(a);
		
		
	}
	

}
