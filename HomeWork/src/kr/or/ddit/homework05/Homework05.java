package kr.or.ddit.homework05;

import java.util.Scanner;

public class Homework05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework05 obj = new Homework05();
		obj.process();

	}
	

	public void process() {

//		method0();
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		/*
		 *  row=4
		 *  ****
		 *  *  *
		 *  *  *
		 *  ****
		 * 
		 */
		System.out.println("숫자를 입력하시오");
		int row =sc.nextInt();

		
		for(int line=0;line<row;line++) {
			if(line==0||line==row-1) {
				for(int star=0;star<row;star++) {
					System.out.print("*");
				}
			}
			else {System.out.print("*");
				for(int blank=0;blank<row-2;blank++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

				System.out.println();
		}
		
		
		
//		for(int star=0;star<row;star++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int line=1;line<row-1;line++) {
//			for(int i=0;i<row;i++) {
//				if(i==0||i==row-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		for(int star=0;star<row;star++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		
	

		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<row;j++) {
//				if((0<j)&&(j<=(row-2))&&(0<i)&&(i<=(row-2))) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.print("\n");
//		}
		

	}
	
	
	public void method6() {

		/*   row = 4
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 */
		System.out.println("숫자를 입력하시오");
		int row = sc.nextInt();

		for (int line = 0; line < row; line++) {
			for (int blank = 0; blank < line; blank++) {
				System.out.print(" ");
			}
			for (int star = 0; star < (row-line)*2-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method5() {

		/*   row = 4
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 */
		System.out.println("숫자를 입력하시오");
		int row = sc.nextInt();
		for (int line = 0; line < row; line++) {
			for (int blank1 = 0; blank1 < row - line - 1; blank1++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2 * line + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method4() {

		/*   row = 4
		 *   ****
		 *   ***
		 *   **
		 *   *
		 */
		System.out.println("숫자를 입력하시오");
		int row =sc.nextInt();
		
		for(int line=0;line<row;line++) {
			for(int star=0;star<row-line;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method3() {

		/*   row = 4
		 *   ****
		 *    ***
		 *     **
		 *      *
		 */
		System.out.println("숫자를 입력하시오");
		int row =sc.nextInt();
		
		for(int line=0;line<row;line++) {
			for(int air=0;air<line;air++) {
				System.out.print(" ");
			}
			for(int star=0;star<row-line;star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*   row =4
		 *      *
		 *     **
		 *    ***
		 *   ****
		 * 
		 */

		System.out.println("숫자를 입력하시오");
		int row =sc.nextInt();
		
		for(int line=0; line<row;line++ ) {
			for(int blank=0;blank<row-line-1;blank++) {
				System.out.print(" ");
			}
			for(int sta=0;sta<line+1;sta++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method1() {
		/*   row = 4
		 *   *
		 *   **
		 *   ***
		 *   ****
		 */
		System.out.println("숫자를 입력하시오");
		int row =sc.nextInt();
		
		for(int line=0; line<row; line++) {
		
			for(int sta=0; sta<line+1;sta++){
			System.out.print("*");
		 } 
		System.out.println();
		}
	}
	
	public void method0() {
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<7; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
