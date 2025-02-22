package kr.or.ddit.study06.sec05;

public class PeopleMain {
	public static void main(String[] args) {
		People .year = 2024;
		
		People p1 = new People();
		p1.name= "주태현";
		
		People p2 = new People();
		p2.name= "박준형";
		
		System.out.println(People.year + "년 "+p1.name);
		System.out.println(People.year + "년 "+p2.name);
		
		System.out.println("1년 후 ");
		People.year++;

		System.out.println(People.year + "년 "+p1.name);
		System.out.println(People.year + "년 "+p2.name);
		
		
		
	}
}
