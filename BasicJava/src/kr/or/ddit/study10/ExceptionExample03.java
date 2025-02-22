package kr.or.ddit.study10;

import kr.or.ddit.util.ScanUtil;

/*
 *  throw : 예외 상제 발생
 *         - 일반 메소드 내부에서 사용
 *         - 사용형식
 *           throw 예외 클래스 객체명
 *           -> IOExcption io = new IOExcption();
 *              ex) throw new Exption();
 *                  throw io;
 */
public class ExceptionExample03 {
	public static void main(String[] args) {
		
		ExceptionExample03 e = new ExceptionExample03();
		e.process();
	}
	
	public void process() {
	
		while(true) {	
			try {
				getNum();
				break;
			} catch (Exception e) {
				System.out.println("0보다 큰수 입력");
			}
		}
	}
	
	
	
	public int getNum() throws Exception {
		int num = ScanUtil.nextInt("숫자 : ");
		if(num<0) {
			throw new Exception();
		}
		
		return num;
		
		
	}
	
	
	
}
