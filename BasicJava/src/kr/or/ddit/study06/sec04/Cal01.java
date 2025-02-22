package kr.or.ddit.study06.sec04;
		

public class Cal01 {
	// 파라미터는 int a, int b
	// 더하기 빼기 나누기 곱하기 메소드 만들고 출력하기
public static void main(String[] args) {
	Cal01 c1 = new Cal01();
	c1.add(10, 11);
	c1.sub(10, 11);
	c1.div(10, 11);
	c1.mul(10, 11);
	
	
}

public void add(int a, int b) {
	System.out.println(a+"+"+b+"="+(a+b));
}

public void sub(int a, int b) {
	System.out.println(a+"-"+b+"="+(a-b));
	
}

public void div(int a, int b) {
	System.out.println(a+"/"+b+"="+(a/b));
	
}

public void mul(int a, int b) {
	System.out.println(a+"*"+b+"="+(a*b));
	
}
}
