package kr.or.ddit.study06.sec06;

public class People {
	//이름 나이
	private String name;
	private int age;
	
	//getter/setter
	//set +필드명
	//get +필드명
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0) {
			System.out.println("음수는 입력할 수 없습니다.");
		return;
		}
		
		if(age>125) {
			System.out.println("유효하지 않은 값입니다");
			return;
		}
		this.age = age;
	}
}
