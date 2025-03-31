package dao;

import java.util.List;

import util.JDBCUtil;
import vo.BoardVo;
import vo.CodeVo;

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
	
	public List<CodeVo> codeList(){
		String sql="SELECT *\r\n"
				+ "FROM CODE";
		
		return jdbc.selectList(sql, CodeVo.class);
	}
	
	public List <BoardVo> boardList(List<Object> param){
		String sql =
				"SELECT BOARD_NO, TITLE, CONTENT, REG_DATE, B.MEM_NO, CNT, B.DELYN, B.CODE_NO,\r\n"
				+ "       NAME, CODE_NAME\r\n"
				+ "FROM BOARD B , JAVA_MEMBER M, CODE C\r\n"
				+ "WHERE B.MEM_NO=M.MEM_NO\r\n"
				+ "AND C.CODE_NO=B.CODE_NO\r\n"
				+ "AND B.CODE_NO=?\r\n"
				+ "AND B.DELYN='N'";
		
		return jdbc.selectList(sql, param,BoardVo.class);
	}
	
	public void insert(List<Object> param) {
		String sql=
				"INSERT INTO BOARD (BOARD_NO, TITLE, CONTENT, REG_DATE, MEM_NO, CNT, DELYN, CODE_NO)\r\n"
				+ "VALUES ((SELECT NVL(MAX(BOARD_NO),0)+1 FROM BOARD),\r\n"
				+ "          ?, ?, SYSDATE, ?, 0 ,'N', ?)";
		jdbc.update(sql, param);
		
	}
	
	public BoardVo detail(List<Object> param) {
		String sql="SELECT BOARD_NO, TITLE, CONTENT, REG_DATE, B.MEM_NO, CNT, NAME\r\n"
				+ "FROM BOARD B, JAVA_MEMBER M\r\n"
				+ "WHERE B.MEM_NO=M.MEM_NO\r\n"
				+ "AND BOARD_NO=?";
		return jdbc.selectOne(sql, param, BoardVo.class);
	}
	
	public void updateCnt(List<Object> param) {
		String sql="UPDATE BOARD\r\n"
				+ "SET CNT=CNT+1\r\n"
				+ "WHERE BOARD_NO=?";
		jdbc.update(sql,param);
	}

	public void update(List<Object> param) {
		String sql="UPDATE BOARD\r\n"
				+ "SET TITLE=?,\r\n"
				+ "    CONTENT =?\r\n"
				+ "WHERE BOARD_NO=?";
		
		jdbc.update(sql, param);
		
	}

	
	public void delete(List<Object> param) {
		String sql =
				"UPDATE BOARD\r\n"
				+ "SET DELYN = 'Y'\r\n"
				+ "WHERE BOARD_NO=?";
		jdbc.update(sql, param);
	}

	public List<BoardVo> boardListSearch(List<Object> param) {
		String sql =
				"SELECT BOARD_NO, TITLE, CONTENT, REG_DATE, B.MEM_NO, CNT, \r\n"
				+ "       B.CODE_NO, NAME, CODE_NAME\r\n"
				+ "FROM BOARD B, JAVA_MEMBER M, CODE C\r\n"
				+ "WHERE B.MEM_NO=M.MEM_NO\r\n"
				+ "AND C.CODE_NO=B.CODE_NO\r\n"
				+ "AND B.CODE_NO=?\r\n"
				+ "AND B.DELYN='N'\r\n"
				+ "AND B.CONTENT LIKE '%'||?||'%'\r\n"
				+ "ORDER BY BOARD_NO DESC";
		
		
		return jdbc.selectList(sql, param,BoardVo.class);
	}
}
