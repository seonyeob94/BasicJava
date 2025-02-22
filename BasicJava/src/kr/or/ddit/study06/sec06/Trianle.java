package kr.or.ddit.study06.sec06;

public class Trianle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	double area;
	

	
	
	public Trianle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.area = Math.abs((x1*y2+x2*y3+x3*y1)-(x1*y3+x2*y1+x3*y2))/2;
	}
	
	
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
	public int getX3() {
		return x3;
	}
	public int getY3() {
		return y3;
	}
	public double getArea() {
		return area;
	}
	}
	

