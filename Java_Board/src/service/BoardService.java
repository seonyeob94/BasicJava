package service;

import java.util.List;
import java.util.Map;

import dao.BoardDao;

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
	
	public  List<Map<String, Object>> list(List<Object> param){
	
		return boardDao.list(param);
	}
	
	public void insert(List<Object> param) {
		boardDao.insert(param);
	}
	
	public Map<String, Object> detail(int boardNo){
		
		boardDao.updateCnt(boardNo);
		
		return boardDao.detail(boardNo);
	}
	
	public void update(List<Object> param) {
		boardDao.update(param);
	}
	
	public void delete(List<Object> param) {
		boardDao.delete(param);
	}
	
	
	
	

}
