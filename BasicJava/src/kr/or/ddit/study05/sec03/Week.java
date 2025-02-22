package kr.or.ddit.study05.sec03;

public enum Week {
	SUN("일요일"), MON("월요일"), TUE("화요일"), 
	WED("수요일"), THU("목요일"), FRI("금요일"), SAT("토요일");//열거가 끝났다는 의미로 세미클론
	
	
	String day;
	Week(String day) {
		this.day = day;
	}
}
