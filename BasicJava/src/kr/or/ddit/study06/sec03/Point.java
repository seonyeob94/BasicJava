package kr.or.ddit.study06.sec03;

public class Point {
	//X, Y 좌표 값을 생성자를 통해서 입력 받을것
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}
	
	
}
