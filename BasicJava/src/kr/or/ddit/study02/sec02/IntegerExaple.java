package kr.or.ddit.study02.sec02;

public class IntegerExaple {
	public static void main(String[] args) {
		// 정수형
		// 1. byte	: 1byte (-128 ~ 127)
		// 2. short	: 2byte (-32768 ~ 32767)
		// 3. int	: 4byte (-2^31 ~ 2^31-1) 기본 정수형; 
		// 4. long	: 8byte (-2^63 ~ 2^63-1);
		//        	  데이터 끝에 L(l)을 추가
		
		byte b1 = 127;
		System.out.println("b1=" + b1);
//		byte b2 = 128; 컴파일 에러(범위 밖의 숫자를 입력해서)
		
		// 오버프로우/언더플로우
		b1++;
		System.out.println("b1="+b1); // 오버플로우 - 값이 넘쳐서. 메모리를 벗어났기 때문
		
		short s1 = 100;
		System.out.println("s1=" + s1);
		short s2 = (short)(s1+10); // 강제캐스팅
		
		int i1 = 100;
		System.out.println("i1="+i1);
		
		int i2 = i1 +10;
		System.out.println("i2="+i2);
		
		
		long l1 = 1000;
		long l2 = 1000000000000l; 
		
		long l3 = l1 +10; // 자동캐스팅
		
		// (중요도가 엄청 높지는 않음)
		int var1 = 200;
		int var2 = 0200;	// 8진법으로 인식하여 계산
		int var3 = 0x200;	// 16진법
		int var4 = 0b1010;	// 2진법
		
		System.out.println("var1="+var1);
		System.out.println("var2="+var2);
		System.out.println("var3="+var3);
		System.out.println("var4="+var4);
		
		
		
		
	}
}
