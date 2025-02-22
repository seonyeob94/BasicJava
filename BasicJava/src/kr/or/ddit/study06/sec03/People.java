package kr.or.ddit.study06.sec03;

public class People {
	// 이름 나이 필드를 만들고
	String nation;
	String name;
	String room;
	int age;
	
	public People(String name, int age) {
		this("405호", name, age);
	}
	
	
	public People(String room, String name, int age) {
		this("한국", room, name, age);
	}
	
	// 생성자를 통해 데이터를 입력하시오
	public People(String nation, String name, 
			String room, int age) {
		this.nation=nation;
		this.name=name;
		this.room=room;
		this.age=age;
		
	}


	@Override
	public String toString() {
		return "People [nation=" + nation + ", name=" + name + ", room=" + room + ", age=" + age + "]";
	}
	
	// PeopleMain에 객체 생성하기
}
