package kr.or.ddit.study07.phone;

public class SmartPhone extends Phone{
	
	
	@Override
	public void tell() {
		System.out.println("4G 전화기능");
	}
	
	public void touch() {
		System.out.println("터치 기능");
	}
	
	public void camera() {
		System.out.println("카메라 기능"); 
	}
	
	
	
}
