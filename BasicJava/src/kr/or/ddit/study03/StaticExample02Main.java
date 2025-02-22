package kr.or.ddit.study03;

public class StaticExample02Main {
	public static void main(String[] args) {
	StaticExample02 se1 = new StaticExample02();
	StaticExample02 se2 = new StaticExample02();
	
	se1.method01();
	//a=6
	se1.method02(se1);
	//a=6
	se1.method03();
	
	se2.method03();
	
	se1.method01();
	
	se1.method04();
	
	
	
	
	
}
}
