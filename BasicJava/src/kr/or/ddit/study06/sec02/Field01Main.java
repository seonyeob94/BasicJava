package kr.or.ddit.study06.sec02;

public class Field01Main {
	public static void main(String[] args) {
		
		
		Field01 f1 = new Field01(); //객체
		//저장할수 있는 공간이 만듦
		//생성자를 통해 만들었을때 비로소 공간이 만들어짐 
		
		f1.kor = 90;
		f1.eng = 80;
		f1.math = 70;
		f1.sum= f1.kor+f1.eng+f1.math;
		f1.avg= f1.sum/3.0;
		f1.rank= 2;
		f1.name= "장세진";
//		[0][0] = 10;
		
		
		Field01 f2 = new Field01();
		f2.kor= 84;
		f2.eng= 72;
		f2.math= 65;
		f2.sum= f2.kor+f2.eng+f2.math;
		f2.avg= f2.sum/3.0;
		f2.rank= 4;
		f2.name= "이선엽";
		
		System.out.println(f1.name+"\t"+f1.kor);
		System.out.println(f2.name+"  "+f1.kor+" / "+f2.eng+" / "+f2.math+" / "+f2.sum+" / "+f2.avg+" / "+f2.rank);
		
	}
}
