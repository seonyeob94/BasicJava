package kr.or.ddit.study06.sec05;

public class BigLoad {
private static BigLoad instance;

private BigLoad() {
	
	System.out.println("로딩중");
	for(int i=0;i<3;i++) {
		 System.out.print(".");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	System.out.println(".");
	System.out.println("로딩완료");
}
public static BigLoad getInstance() {
	if (instance == null) {
		instance = new BigLoad();
	}
	return instance;
}




}
