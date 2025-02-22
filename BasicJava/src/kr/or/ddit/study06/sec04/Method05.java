package kr.or.ddit.study06.sec04;

public class Method05 {
	public static void main(String[] args) {
		Method05 m = new Method05();
		m.process();	
	}
	
	public void process() {
		
		int[] num= {1,2,3};
		print(num);
		
	}
	
	public void print(int num1, int num2) {
		
	}
	
	
	public void print(int ...num) {
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
		}
	}
	
	
	
	
	
	
	
	
}
