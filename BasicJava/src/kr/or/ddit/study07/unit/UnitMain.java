package kr.or.ddit.study07.unit;

import kr.or.ddit.util.ScanUtil;

public class UnitMain {
	public static void main(String[] args) {
		while(true) {
			
			Unit unit = SelectUnit();
			
			int sel = ScanUtil.select();
			if(sel==1) unit.move();
			if(sel==2) unit.attack();
		}
	}
	
	public static Unit SelectUnit() {
		System.out.println("1. 질럿");
		System.out.println("2. 저글링");
		System.out.println("3. 뮤탈");
		
		int sel = ScanUtil.select();
		
		Unit unit = null;
		if(sel ==1) unit = new Zealot();
		if(sel ==2) unit = new ZergRing();
		if(sel ==3) unit = new Mutal();
		
		System.out.println("1. 이동");
		System.out.println("2. 공격");
		return unit;
		
	}
}
