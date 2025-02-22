package kr.or.ddit.study10;

import kr.or.ddit.util.ScanUtil;

public class ExceptionExample02 {
	public static void main(String[] args) {
		ExceptionExample02 ee = new ExceptionExample02();
		ee.process();
	}
	
	public void process() {
		int[] arr = {1,2,0};
		try {
			int num = ScanUtil.nextInt("배열 번호 : ");
			int result = 10/arr[num];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 벗어남");
		} catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없음.");
	 } 
		catch(Exception e) {
		 System.out.println("예외발생");
	 }
	}
	
}
