package kr.or.ddit.api.restr;

import java.util.List;

import kr.or.ddit.vo.RestrVo;

public class RestrDao {
	private static RestrDao instance;
	
	private RestrDao() {
		
	}

	public static RestrDao getInstance() {
		if (instance == null) {
			instance = new RestrDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public void insertRestr(List<Object> param) {
		String sql ="INSERT INTO RESTR\r\n"
				+ "VALUES ((SELECT NVL(MAX(RESTR_NO),0)+1 FROM RESTR), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	
		jdbc.update(sql,param);
	}
	
	public List<RestrVo> getList(List<Object> param){
		String sql ="WITH B AS (\r\n"
				+ "SELECT ROWNUM RN, A.*\r\n"
				+ "  FROM\r\n"
				+ "    (SELECT *\r\n"
				+ "     FROM RESTR\r\n"
				+ "      ORDER BY RESTR_NO) A\r\n"
				+ ")\r\n"
				+ "SELECT *\r\n"
				+ "FROM B\r\n"
				+ "WHERE RN>=? AND RN<=?";
		return jdbc.selectList(sql,param,RestrVo.class);
		
	}

}
