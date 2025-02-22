package kr.or.ddit.study06.sec03;

public class TriangleMain {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0,10,10,0,10,10);
		System.out.println(t1);
		
		Point p1 = new Point(5,0);
		Point p2 = new Point(0,5);
		Point p3 = new Point(5,5);
		
		Triangle t2= new Triangle(p1,p2,p3);
		System.out.println(t2);
	}
}
