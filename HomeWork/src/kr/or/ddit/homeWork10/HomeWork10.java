package kr.or.ddit.homeWork10;

import java.util.Scanner;

public class HomeWork10 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork10 obj = new HomeWork10();
		obj.process();
	}

	public void process() {
		System.out.println("반지름 입력 하세요");
		int r = sc.nextInt();
		System.out.println("높이를 입력 하세요");
		int h = sc.nextInt();
		
		// 원기둥 부피 출력 
		// Math.pI;
		Circle c = new Circle(r);
		System.out.println(c);
		
		Cylinder v= new Cylinder(r,h);
		System.out.println(v);
		
	
	}
}
class Circle {
	int r; 
	double area;
	// 반지름을 입력 할때  원의 넓이를 구하시오.
	// Math.PI *r*r
	
	
	public Circle (int r) {
		this.r=r;
		this.area=Math.PI*(r*r);
	}


	@Override
	public String toString() {
		return "[반지름=" + r + ", 원의 넓이=" + area + "]";
	}
	
}
class Cylinder{
	int h;
	int r;
	double volume;
	Circle c;

	// 원기둥 부피
	// 원의 넓이 * 높이
	
	// 원 , 높이를 입력 받아 부피를 구하시오


	public Cylinder(Circle c,int h) {
		this.h=h;
		this.r=c.r;
		this.c=c;
		this.volume=c.area*r;
		
	}

	
		
	
	
	// 반지름 , 높이를 입력 받아 부피를 구하시오 
	
	public Cylinder(int r,int h) {
		this.h=h;
		this.r=r;
		this.c=new Circle(r);
		this.volume=c.area*h;
		
	}





	@Override
	public String toString() {
		return "Cylinder [높이=" + h + ", 반지름=" + r + ", 원기둥의 부피=" + volume + ", 원의 넓이=" + c.toString() + "]";
	}

	
	
	
}



