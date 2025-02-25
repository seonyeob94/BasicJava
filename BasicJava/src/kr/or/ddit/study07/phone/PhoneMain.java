package kr.or.ddit.study07.phone;

public class PhoneMain {
	public static void main(String[] args) {
		//변경할때는 상위기능 하나만 변경하면 상속되어 전부 변경됨
		
		System.out.println("===폰========");
		Phone p = new Phone();
		p.tell();
		System.out.println("===스마트폰====");
		SmartPhone sp = new SmartPhone();
		sp.tell();
		sp.camera();
		sp.touch();
		System.out.println("===아이폰=====");
		IPhone ip = new IPhone();
		ip.tell();
		ip.camera();
		ip.touch();
		ip.appStroe();
		System.out.println("===아이폰10===");
		IPhone10 ipten = new IPhone10();
		ipten.tell();
		ipten.camera();
		ipten.touch();
		ipten.appStroe();
		ipten.ai();
		
	}
}
