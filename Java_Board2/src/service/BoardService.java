package service;

import java.util.List;

import javax.swing.plaf.basic.BasicDesktopIconUI;

import dao.BoardDao;
import vo.BoardVo;
import vo.CodeVo;

public class BoardService {
  private static BoardService instance;

private BoardService() {

}

public static BoardService getInstance() {
	if (instance == null) {
		instance = new BoardService();
	}
	return instance;
}

	BoardDao boardDao = BoardDao.getInstance();
	
	public List<CodeVo> codeList(){
		return boardDao.codeList();
	}
	
	public List <BoardVo> boardList(List<Object> param){
		return  boardDao.boardList(param);
	}
	
	public void insert(List<Object> param) {
		boardDao.insert(param);
	}
	
	public BoardVo detail(List<Object> param) {
		
		boardDao.updateCnt(param);
		
		return boardDao.detail(param);
	}

	public void update(List<Object> param) {
		// TODO Auto-generated method stub
		boardDao.update(param);
	}

	public void delete(List<Object> param) {
		boardDao.delete(param);
		
	}

	public List<BoardVo> boardListSearch(List<Object> param) {
		
		return boardDao.boardListSearch(param);
	}
}
