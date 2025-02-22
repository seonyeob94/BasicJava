package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
		obj.process();

	}

	public void process() {
//		method1();
		method2();
//		method3();
//		method4();
//		method5();
//		method6();
	}
	
	public void method6() {
		// 홍길동 강감찬 이순신
		// 국영수
		int[][] score = {{90,80,88},
			        	 {84,65,49},
			        	 {74,99,91}
			        	 };
		//홍길동 국어출력
		System.out.println(score[0][0]);
		
		//강감찬 수학출력
		System.out.println(score[1][2]);
		
		//이순신 영어출력
		System.out.println(score[2][1]);
		
		
		//홍길동 점수 평균
		
		double sum=0;
		for(int i=0;i<score[0].length;i++) {
			sum+=score[0][i];
		}
		
//		int[]hong= 
		
		System.out.println("홍길동의 평균 : "+sum/score[0].length);
		
		//국어 점수 평균
		
		double kor=0;
		
		for(int i=0;i<score.length;i++) {
			kor+=score[i][0];
			
		}
		
		System.out.println("국어점수의 평균 : "+kor/score.length);
		
		//전체 출력
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();	
		}
		
		
	}
	
	
	public void method5() {
		//2차원 배열 선언
		
		int[][] arr1= new int[2][3];
		int[][] arr2= { {1,2,3}, {4,5,6}};
		int[][] arr3= new int[2][];
		
	}
	
	
	public void method4() {
		
		String[] strList = {"abc", "def","aaa"};
		
		//String -> char[]
		
	}
	
	
	public void method3() {
		// 2차원 배열 
		
		int[][] arr= new int[3][5];
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {6,7,8,9,10};
		int[] a3 = {11,12,3,14,15};
		
		arr[0]= a1;
		arr[1]= a2;
		arr[2]= a3;
		
		System.out.println(a1[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][3]);
		System.out.println(arr[2][1]);
		
		
	}
	
	public void method2() {
		
		int[] nums= {20, 15, 37, 40};
		
		//i값이 필요하면
		for(int i=0; i<nums.length;i++) {
			int num= nums[i];
			System.out.println(num+"\t");
		}
		
		//향상된 for문
		//그저 값을 꺼낼때
		for(int num : nums) {

			System.out.print(num+"\t");
		}
		
		
	}
	
	public void method1() {
		// 로또 생성 프로그램
		
		//크기 45짜리 배열을 만들고 값을 1-45까지 넣기
		int[] temp= new int[45];
		
		for(int i=0;i<45;i++) {
			temp[i]= i+1;
		}
		
		
		//값 섞기 어제 과제 참조
		for(int i=0;i<10000;i++) {
		int ran = (int)(Math.random()*temp.length);
		int aaa=temp[0];
		temp[0]=temp[ran];
		temp[ran]=aaa;
		
		
		}
		
		// lotto에 temp 값 6개 차례대로 넣기
		int[] lotto= new int[6];
		
		System.arraycopy(temp, 0, lotto, 0, 6);

		
		
		//정렬하기
		for(int i=0;i<lotto.length-1;i++) {
			for(int j=0; j<lotto.length-1;j++) {
				if(lotto[j]>lotto[j+1]) {
					int aa=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=aa;
				}
			}
		}
		
		//출력하기

		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
	}


}
