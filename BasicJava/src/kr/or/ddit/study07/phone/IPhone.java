package kr.or.ddit.study07.phone;

public class IPhone extends SmartPhone{
	
	public void appStroe() {
		System.out.println("앱스토어");
	}
	
	@Override  
	//컨트롤+스페이스에서 찾는다. 부모클래스의 메소드를 자식클래스에서 재정의할때 사용
	public void camera() {
		// TODO Auto-generated method stub
		super.camera();
		//super - 부모클래스의 매소드를 실행시킬때/ 생성자 메소드 필드 접근 가능
		//this 동일 클래스, super 상위 클래스
		System.out.println("모션 추가");
		
		
	}
	
	private void motion() {
		System.out.println("모션 인식 추가");
	}
}
