package kr.or.ddit.study05.sec03;

import kr.or.ddit.util.ScanUtil;

public class CalMain {
	public static void main(String[] args) {
		CalMain cm = new CalMain();
		cm.process();
	}
	
	public void process() {
//		int a = ScanUtil.nextInt("숫자 : ");
//		int b = ScanUtil.nextInt("숫자 : ");
//		String op = ScanUtil.next("연산자");
//		
//		int cal = cal(a,b, op);
//		System.out.println("결과값 : "+ cal);
		
		
		int cal = cal(10, 10, OP.ADD);
		
		
		
	}
	
	
	public int cal(int a, int b, OP op) {
		if(op==OP.ADD) return add(a, b);
		if(op==OP.SUB) return sub(a, b);
		if(op==OP.DIV) return div(a, b);
		if(op==OP.MUL) return mul(a, b);
		
		return 0;
		
	}
	
	
	public int cal(int a, int b, String op) {
		
		if(op.equals("+")) return add(a, b);
		if(op.equals("-")) return sub(a, b);
		if(op.equals("/")) return div(a, b);
		if(op.equals("*")) return mul(a, b);
		System.out.println("해당 연산자는 지원하지 않습니다.");
		return 0;
		
		
	}
	
	
	//+=/* 메소드 만들기
	
	private int add(int a, int b) {
		return a+b;
	}
	
	
	private int sub(int a, int b) {
		return a-b;
	}
	
	
	private int div(int a, int b) {
		return a/b;
	}
	
	
	private int mul(int a, int b) {
		return a*b;
	}
}
