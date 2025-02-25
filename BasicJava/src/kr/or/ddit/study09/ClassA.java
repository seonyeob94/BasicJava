package kr.or.ddit.study09;

public class ClassA {
	public static void main(String[] args) {
		//ClassB 필드 b에 값 10 넣기
		ClassB cb = new ClassA().new ClassB();
		cb.b = 10;
		
		//ClassC 필드 c에 값 20 넣기
		ClassC cc = new ClassA.ClassC();
		cc.c= 20;
		
		
	}
	
	class ClassB{
		int b;
	}
	
	static class ClassC{
		int c;
	}

}
