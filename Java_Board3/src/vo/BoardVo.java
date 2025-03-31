package vo;

import lombok.Data;

@Data

public class BoardVo {
	private int board_no;
	private String title;
	private String content;
	private String reg_date;
	private int mem_no;
	private int cnt;
	private String delyn;
	private int code_no;
	
	//작성자
	private String name;
	
	//게시판 이름
	private String code_name;
}
