package kr.or.ddit.study06.sec04;

import java.util.Date;

public class Recrucive {
	public static void main(String[] args) {
		Recrucive r = new Recrucive();
		r.process();
	}
	
	public void process() {
		
		Date d1 = new Date();
		
		long febo = febo(50);
		Date d2 = new Date();
		
		long time = d2.getTime()- d1.getTime();
		System.out.println(time+"ms");
		
	}
	
	
	public void method1(int n) {
		
		//1_n 까지의 합을 구하시오.
		int sum=0;
		for (int i=0; i<=0; i++) sum +=1;
		
		sum = n*(n+1)/2;
		
		
	}
	
	
	
	
	//피보나치 수열
	// 1 1 2 3 5 8 13 21
	long[] arr = new long[500];
	public long febo(int num) {
		//febo(4) ->  1 + 1 + 1
		//febo(3) -> 1 + 1
		//febo(2) -> 1
		if(num==1||num==2) return 1;
		
		
		if(arr[num]!=0) return arr[num];
		else {
			long f1 =febo(num-1);
			long f2 =febo(num-2);
			arr[num] = f1+f2;
			return f1+f2;
		}
		
		
//		return febo(num-1) +febo(num-2);
//		
	}
	
//	n+(n+1)=n+2
	
	//11-> 8 +2 +1
	
	public void changeBit(int num) {
		//11
		// changeBit(5)
		// changeBit(2)
		// changeBit(1)
		// changeBit(0)
		
		if(num==0) return;
		changeBit(num/2);
		System.out.println(num%2);
	}
	
	
	
	//10-> 짝수 더하기
//	public int sub(int num) {
//		
//		if(num==2) return 2;
//		
//		if(num%2!=0) 
//		if(num%2==0) return num+sub(num-2);
//		
//	}
	
	
	// gop 1-5까지의 까지의 곱
	
	public long gop(int num) {
		//num->3
		//gop(3)->3*2*gop(1)
		//gop(2)->2*gop(1)
		//gop(1)->1
		
		
		if(num==1) return 1;
		
		return num*gop(num-1);
		
	}
	
	public int sum(int num) {
		//num->3
		//sum(3) -> 3+2+1
		//sum(2) -> 2+1
		//sum(1) -> 1
		if(num==1)return 1;
		//가능하면 반복문을 쓰는게 낫지만 간결하고 효과적인 경우가 있다
		//다만 속도가 느리고 코드를 실수하면 메모리 다쓰고 터지는 리스크가 있다
		
		return num+sum(num-1);
	}
}
