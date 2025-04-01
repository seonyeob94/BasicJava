package dao;

import java.util.List;
import java.util.Map;

import lombok.extern.jbosslog.JBossLog;
import util.JDBCUtil;

public class MemberDaoImpl implements MemberDao {
	
	private static MemberDaoImpl instance;

	private MemberDaoImpl() {

	}

	public static MemberDaoImpl getInstance() {
		if (instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}

	


	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	@Override
			//반환타입(아웃풋)	<==>	 //파라미터(인풋)
	public Map<String, Object> login(List<Object> param) {
		
		String sql = "SELECT *\r\n"
				+ "FROM JAVA_MEMBER\r\n"
				+ "WHERE ID=?\r\n"
				+ "AND PASS=?";
		
		return jdbc.selectOne(sql, param);
	}

	@Override
	public int join(List<Object> param) {
		String sql = "INSERT INTO JAVA_MEMBER(MEM_NO, ID, PASS, NAME)\r\n"
				+ "VALUES((SELECT NVL((MAX(MEM_NO)+1),0) FROM JAVA_MEMBER),?,?,?)";
		
		return jdbc.update(sql, param);
	}

	@Override
	public List<Map<String, Object>> list() {
		String sql ="SELECT *\r\n"
				+ "FROM JAVA_MEMBER\r\n"
				+ "WHERE DELYN ='N'";
		return jdbc.selectList(sql);
	}

	@Override
	public int update(List<Object> param) {

		String sql = "UPDATE JAVA_MEMBER\r\n"
				+ "SET ID=?, \r\n"
				+ "PASS=?\r\n"
				+ "WHERE MEM_NO=?";
		
		return jdbc.update(sql,param);
	}

	@Override
	public int delete(List<Object> param) {
		String sql ="UPDATE JAVA_MEMBER\r\n"
				+ "SET DELYN = 'Y'\r\n"
				+ "WHERE MEM_NO=?"
				+ "AND DELYN ='N'";
		return jdbc.update(sql, param);
	}

}
