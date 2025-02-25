package kr.or.ddit.study08;

import kr.or.ddit.util.ScanUtil;

public class AnimalMain {
	public static void main(String[] args) {
		Animal ani = null;
		
		System.out.println("1. 고양이 2.강아지");
		int sel = ScanUtil.select();
		
		if(sel==1) ani = new Cat();
		if(sel==2) ani = new Dog();
		
		ani.cry();
	}
}
