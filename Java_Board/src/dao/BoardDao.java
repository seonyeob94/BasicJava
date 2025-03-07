package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {
	private static BoardDao instance;

	private BoardDao() {

	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<Map<String, Object>> list(List<Object> param){
		String sql ="SELECT BOARD_NO, TITLE, CONTENT, \r\n"
				+ "       TO_CHAR(REG_DATE,'YYYY.MM.DD') AS REG_DATE, B.MEM_NO,\r\n"
				+ "       CNT, NAME, B.CODE_NO, CODE_NAME, B.DELYN\r\n"
				+ "FROM BOARD B, JAVA_MEMBER M, CODE C\r\n"
				+ "WHERE B.MEM_NO = M.MEM_NO\r\n"
				+ "AND B.CODE_NO=C.CODE_NO\r\n"
				+ "AND B.CODE_NO=?\r\n"
				+ "ORDER BY BOARD_NO DESC";
		
		return jdbc.selectList(sql, param);
	}
	
	public void insert(List<Object> param) {
		String sql = "INSERT INTO BOARD(BOARD_NO, TITLE, CONTENT, REG_DATE, MEM_NO, CNT, DELYN, CODE_NO)\r\n"
				+ "VALUES ((SELECT NVL(MAX(BOARD_NO),0)+1 FROM BOARD), ?, ?,\r\n"
				+ "        SYSDATE, ?, 0, 'N',?)";
		
		jdbc.update(sql,param);
	}

	public Map<String, Object> detail(int boardNo){
		String sql = 
				"SELECT BOARD_NO, TITLE, CONTENT, \r\n"
				+ "       TO_CHAR(REG_DATE,'YYYY.MM.DD') AS REG_DATE, B.MEM_NO, CNT, B.CODE_NO,\r\n"
				+ "       NAME, CODE_NAME, B.DELYN\r\n"
				+ "FROM BOARD B, JAVA_MEMBER M, CODE C\r\n"
				+ "WHERE B.MEM_NO = M.MEM_NO\r\n"
				+ "AND B.CODE_NO = C.CODE_NO\r\n"
				+ "AND B.BOARD_NO = "+boardNo;
		
		return jdbc.selectOne(sql);
	}
	
	public void updateCnt(int boardNo) {
		String sql =
				"UPDATE BOARD\r\n"
				+ "SET CNT = CNT+1\r\n"
				+ "WHERE BOARD_NO="+boardNo;
		
		jdbc.update(sql);
	}
	
	public void update(List<Object> param) {
		String sql =
				  "UPDATE BOARD\r\n"
				  + "SET TITLE =?,\r\n"
				  + "    CONTENT =?\r\n"
				  + "WHERE BOARD_NO=?";
		
		jdbc.update(sql, param);
	}
	
	public void delete(List<Object> param) {
		String sql =
				"UPDATE BOARD\r\n"
				+ "SET DELYN ='Y'\r\n"
				+ "WHERE BOARD_NO=?\r\n"
				+ "AND DELYN ='N'";
		jdbc.update(sql, param);
	}
	
	
	
}
