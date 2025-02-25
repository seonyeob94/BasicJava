package kr.or.ddit.study07.unit;

public class ZergRing extends Unit{

	@Override
	public void attack() {
		System.out.println("약하게 공격");
	}
	
	@Override
	public void move() {
		System.out.println("빠르게 이동");
	}
}
