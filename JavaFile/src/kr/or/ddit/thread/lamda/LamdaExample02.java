package kr.or.ddit.thread.lamda;

public class LamdaExample02 {
	public static void main(String[] args) {
		
		//람다식을 완성하여 문구를 출력
		Printer p = new Printer() {
			
			@Override
			public void print(String message) {
				System.out.println("출력 : " +message);
				
			}
		};
		
		Printer p2 = message 
				    -> System.out.println("출력 : "+ message); 
				    
		p2.print("메세지 입력");		    
	}
}

interface Printer{
	void print(String message);
}
