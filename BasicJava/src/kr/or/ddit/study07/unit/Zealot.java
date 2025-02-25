package kr.or.ddit.study07.unit;

public class Zealot extends Unit{

	
	
	@Override
	public void attack() {
		System.out.println("2번 공격");
	}
	
	
	@Override
	public void move() {
		System.out.println("지상 이동");
	}
}
