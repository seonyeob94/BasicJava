package dao;

import java.util.List;
import java.util.Map;

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
		String sql = "INSERT INTO JAVA_MEMBER\r\n"
				+ "VALUES (?,?,?)";
		
		return jdbc.update(sql, param);
	}

	@Override
	public List<Map<String, Object>> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(List<Object> param) {

		String sql = "";
		
		return jdbc.update(sql,param);
	}

}
