package kr.or.ddit.study06.sec04;

public class Cal02 {
	// 파라미터는 int a, int b
	// 더하기 빼기 나누기 곱하기 메소드 만들고 return
	public static void main(String[] args) {
		Cal02 c2 = new Cal02();
		int a=10;
		int b=5;
		int mathod1 = c2.add(a, b);
		int mathod2 = c2.sub(a, b);
		int mathod3 = c2.div(a, b);
		int mathod4 = c2.mul(a, b);
		
		System.out.println(a+"+"+b+"="+mathod1);
		System.out.println(a+"-"+b+"="+mathod2);
		System.out.println(a+"/"+b+"="+mathod3);
		System.out.println(a+"*"+b+"="+mathod4);
	}
	
	
	public int add(int a, int b) {
	
		
		int result = a+b;
		return result;
	}
	
	public int sub(int a, int b) {
		
		int result = a-b;
		return result;
	}
	
	public int div(int a, int b) {
		
		int result = a/b;
		return result;
	}
	
	public int mul(int a, int b) {
		
		int result = a*b;
		return result;
	}

}
