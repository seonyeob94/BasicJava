package kr.or.ddit.api;

import lombok.Data;

@Data
public class WeatherVo {
	
	private int weatherNo;
	private String nx;
	private String ny;
	
	private String baseDate;
	private String baseTime;
	
	private String r1h;
	private String t1h;
	private String reh;
}
