package kr.or.ddit.study08.board;

import kr.or.ddit.util.ScanUtil;

public class BoardMain {
	public static void main(String[] args) {
		BoardMain bm = new BoardMain();
		bm.process();
	}

	
	public void process() {
		while(true) {
			System.out.println("1. 게시글 작성");
			System.out.println("2. 게시글 조회");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 수정");
			int sel = ScanUtil.select();
		}
	}
	
	IBoardService bs = new BoardService();
	
	
	public void boardInsert() {
		BoardVo board = new BoardVo();
		board.setTitle("제목");
		board.setContent("내용");
		bs.boardInsert(board);
	}
	
	
	public void boardPrint() {
		
	}
}
