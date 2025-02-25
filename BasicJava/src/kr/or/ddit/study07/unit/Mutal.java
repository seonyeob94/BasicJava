package kr.or.ddit.study07.unit;

public class Mutal extends Unit{

	@Override
	public void attack() {
		System.out.println("스플래시 공격");
	}
	
	@Override
	public void move() {
		System.out.println("공중 이동");
	}
}
