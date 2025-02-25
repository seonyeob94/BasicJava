package kr.or.ddit.study07.animal;

import kr.or.ddit.util.ScanUtil;

public class AnimalMain {
	public static void main(String[] args) {
		
		
//		Animal ani = new Animal();
//		
//		Cat cat = (Cat) ani;
//		//부모타입을 자식타입으로 넣을때 강제변환
//		
//		Dog dog = new Dog();
//		
//		Animal ani2 = dog;
//		//자식타입을 부모타입으로 넣을때 자동변환
		
		
		// 1. 고양이
		// 2. 강아지
		
//		System.out.println("1.고양이");
//		System.out.println("2.강아지");
//
//		int sel =ScanUtil.nextInt("선택 : ");
//		
//		if(sel == 1) {
//			Cat cat = new Cat();
//			cat.cry();
//		}
//		
//		if(sel == 2) {
//			Dog dog = new Dog();
//			dog.cry();
//		}
//		
		//선택한 값에 따라 울음소리 출력하기
		
		System.out.println("1.고양이");
		System.out.println("2.강아지");

		int sel =ScanUtil.nextInt("선택 : ");
		
		//다형성을 기준으로 효율적으로 

		Animal ani = null;// 초기화
		if(sel == 1) {
			ani = new Cat();
		}
		
		if(sel == 2) {
			ani = new Dog();
		}
		ani.cry();		
		//다형성은 부모와 자식의 공통된 메소드를 구현
		//자식 클래스에만 별도로 있으면 구현안됨
		ani.move();
	}
}
