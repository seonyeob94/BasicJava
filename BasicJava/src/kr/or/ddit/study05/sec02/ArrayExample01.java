package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
		method8();
//		method9();
//		method10();
	
	}
	
	
	public void method10() {
		// 버블정렬
		
		int[] array = {80, 41, 92, 75, 100};

		for(int i=0;i<array.length-1;i++) {
			boolean pass = false;
			for(int j=0; j<array.length-1;j++) {
				if(array[j]<array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					pass=true;
				}
				
			}
			if(!pass) break;
			
		}
		
	}
	
	
	public void method9() {
		// 버블정렬
		
		int[] array = {80, 41, 92, 75, 100};
//		int[] array = {2, 1, 3, 4, 5};
		//41 80 75 92 100
		//
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0; j<array.length-1;j++) {
				if(array[j]<array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		
	}
	
	
	public void method8() {
		//깊은 복사(deep copy)
		// - 배열 공간을 별도로 확보
		//	1.반복문 이용
		//	2.system.arraycopy()
		//	3.clone();
		
		
		//1 반복문 사용
//		int[] source= {1,2,3,4,5};
//		int[] target= new int[source.length];
//		
//		for(int i=0;i<source.length;i++) {
//			target[i]= source[i];
//		}
			
		
		//2.system.arraycopy()
		int[] source= {1,2,3,4,5};
		int[] target= new int[source.length];
		
		System.arraycopy(source, 1, target, 2, 3);
		
		
		// clone

//		int[] source= {1,2,3,4,5};
//		int[] target= source.clone();
//		
//		
//		for(int i=0;i<source.length;i++) {
//			target[i]= source[i];
//		}
				
				
		for(int i=0; i<source.length;i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();

		for(int i=0; i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		target[2]=10;
		
		for(int i=0; i<source.length;i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();

		for(int i=0; i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
	}
	
	public void method7() {
		// 얕은 복사, 깊은복사
		// 얕은복사(shallow copy)
		// 복사된 배열이나 원본 배열이 변경될때 서로간의 값이 같이 변경
		// (주소값이 복사)
		
		
		int[] source= {1,2,3,4,5};
		int[] target= source;
		
		for(int i=0; i<source.length;i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();

		for(int i=0; i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		target[2]=10;
		
		for(int i=0; i<source.length;i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();

		for(int i=0; i<target.length;i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
	}
	
	public void method6() {
		int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		System.out.println("거스르몬 입력 : ");
		int money = sc.nextInt();
		
		//43200->10000*4 1000*3,100*2
		for(int i=0;i<coin.length;i++) {
			int cnt = money/coin[i];
			money%=coin[i];
			if(cnt==0) continue;
			System.out.println(coin[i]+" "+cnt+"개");
		}
		
	}
	
	
	public void method5() {
		//80 90 87 65 82 값을 배열에 넣고 출력
		
//		int[] arr = new int[5];
//		arr[0]= 80;
//		arr[1]= 90;
		
		int[] arr= {80,90,87,65,82,34,55,200,-40};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 배열 값 중 최대값 구하기
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) max= arr[i];


		}

		
		// 배열 값 중 최소값 구하기


		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) min= arr[i];


		}
		System.out.println("최대값은 : "+ max);
		System.out.println("최소값은 : "+ min);
		
		
	}
	
	
	public void method4() {
		
		//int 배열을 만들고 90 80 77 값을 입력하시오
		
		int[] arr = new int[3];
		
		//a=90;
		arr[0]=90;
		arr[1]=80;
		arr[2]=77;
		//배열의 길이 -> arr.length
		
		
		//출력해보자
		int[] answer = {};
		for(int i=0; i<arr.length; i++) {
			
			answer[i]=arr[i];
			
			System.out.println(answer);
		
		}
		// 총합 구하기
		int sum=0;

		for(int j =0;j<arr.length;j++) {
			sum+=arr[j];
			
		}
		
		System.out.println("총합 : "+sum);
		
	}
	
	public void method3(){
		// 배열 선언 방법
		
		// int a
		int[] arr = new int[5];
		int arr2[] = new int[5];
		
		//int a = 10;
		
		int[] arr3 = {1,2,3,4,5};
		
		
		
		
		
		
	}
	
	
	public void method2() {
		
		//배열은 보통 반복문이랑 같이 쓰인다.
		
		int[] arr= new int[5];
		
		arr[0]=10;
		arr[1]=12;
		arr[2]=14;
		arr[3]=18;
		arr[4]=22;
		
		int sum=0;
		for(int i=0; i<5; i++) {
			sum+=arr[i];
		}
		
	}
	
	public void method1() {
		int a1 = 10;
		int a2 = 12;
		int a3 = 14;
		int a4 = 18;
		int a5 = 22;
		
		int sum = a1+a2+a3+a4+a5;
		
		
	}
}
