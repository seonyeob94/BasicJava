package kr.or.ddit.study06.sec05;

public class BigLoadMain {
	public static void main(String[] args) {
		
		BigLoad b1 = BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		System.out.println("완료");
	}

}
