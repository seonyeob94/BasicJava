package kr.or.ddit.study02.sec02;

public class FloatExample {
	public static void main(String[] args) {
		// 1.float	: 4byte // long보다 큰 범위 가능, 정수가 아닌 근사값 표기
		//	(부호 : 1bit, 지수 : 8bit, 가수 : 23bit)
		// 데이터 끝에 F(f)를 추가
		// 2.double	: 8byte
		//	(부호 : 1bit, 지수 : 11bit, 가수 : 52bit)
		// 실수 기본형
		
		float	f1 = 3.1415926f;
		double	d1 = 3.1415926;
				
		if(f1 == d1) {
			System.out.println("같은 값");
		}
		else {
			System.out.println("다른 값");
		}
	}
}
