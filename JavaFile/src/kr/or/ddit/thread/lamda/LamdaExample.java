package kr.or.ddit.thread.lamda;



public class LamdaExample {
	public static void main(String[] args) {
		
		Function add =(a, b) -> a+b;
		// 빼기 만들기
		Function sub =(a, b) -> a-b;
		
		Function nul = new Function() {
			public int cal(int a, int b) {
				return a*b;
			}
		};
		
		System.out.println(add.cal(5, 8));
		System.out.println(sub.cal(8, 5));
	}
}

interface Function{
	int cal(int a ,int b);
}
