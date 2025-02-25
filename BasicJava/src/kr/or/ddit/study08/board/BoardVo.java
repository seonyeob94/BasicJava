package kr.or.ddit.study08.board;

public class BoardVo {
	// 번호 제목 내용 작성자 시간
	
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String time;
	
	public int getBoardNo() {
		return boardNo;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public String getTime() {
		return time;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	@Override
	public String toString() {
		return "BoardVo [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", time=" + time + "]";
	}
	
	

}
