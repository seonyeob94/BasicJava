package kr.or.ddit.thread.lamda;

import util.ScanUtil;

public class LamdaTest {
	public static void main(String[] args) {
		//람다식을 이용해서 입력받은 문자 길이를 출력하시오
		Print1 p1 = message -> System.out.println(message.length());
		//람다식을 이용해서 n까지의 짝수만 출력
//		int n = ScanUtil.nextInt("짝수 입력");
//		for(int i=2;i<=n;i+=2) {
//			System.out.println(i);
//		}
		
		Print2 p2 = num -> {
			for(int i = 2; i<= num; i += 2) {
				System.out.println(i);
			}
		};
		
		//람다식을 이용해서 1~n까지의 홀수값의 합을 리턴
		Sum s = num ->{
			int sum=0;
			for(int i =1 ; i<=num;i+=2) {
				sum+=i;
			}
			return sum;
		};
	}
}

interface Print1{
	public void printLenght(String word);
}

interface Print2{
	public void printNum(int num);
}

interface Sum{
	public int sum(int num);
}

