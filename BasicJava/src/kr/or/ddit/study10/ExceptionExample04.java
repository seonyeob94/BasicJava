package kr.or.ddit.study10;

import kr.or.ddit.util.ScanUtil;

public class ExceptionExample04 {
	public static void main(String[] args) {
		ExceptionExample04 obj = new ExceptionExample04();
		obj.process();
	}
	public void process() {
		
		while(true) {
		try {
			String nick = inputNick();
			break;
		} catch (NicknameException e) {
			System.out.println(e);
		}catch (NicknameLengthException e) {
			System.out.println(e.getMessage());
		}
			
		}
		
	}
	
	public String inputNick() throws NicknameException, NicknameLengthException {
		
		String nick = ScanUtil.next("닉네임 ");
		
		if(nick.length()<2 || nick.length()>5) {
			throw new NicknameLengthException();
		}
		
		if(nick.contains("바보")) {
			throw new NicknameException();
		}
		return nick;
		
	}
	
	
}
class NicknameException extends Exception{
	public NicknameException () {
		super("부적절한 닉네임");
	}
}

class NicknameLengthException extends Exception{
	public NicknameLengthException () {
		super("닉네임 길이2~5");
	}
}