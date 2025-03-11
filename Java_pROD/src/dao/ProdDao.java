package dao;

import java.util.List;

import util.JDBCUtil;
import vo.ProdVo;

public class ProdDao {
	private static ProdDao instance;

	private ProdDao() {

	}

	public static ProdDao getInstance() {
		if (instance == null) {
			instance = new ProdDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<ProdVo> prodlist (List<Object> param) {
		
		String sql = "SELECT *\r\n"
				+ "FROM JAVA_PROD\r\n"
				+ "ORDER BY PROD_TYPE";
		
		return jdbc.selectList(sql, param, ProdVo.class);
		
	}
	
	public void insert(List<Object> param) {
		String sql = 
				"INSERT INTO JAVA_PROD(PROD_NO, NAME, CONTENT, PRICE, PROD_TYPE, PROD_DATE)\r\n"
				+ "VALUES ((SELECT NVL(MAX(PROD_NO),0)+1 FROM JAVA_PROD),\r\n"
				+ "         ?, ?, ?, ?, SYSDATE)";
		jdbc.update(sql,param);
	}
	
	public ProdVo detail(List<Object>param) {
		String sql="SELECT *\r\n"
				+ "FROM JAVA_PROD\r\n"
				+ "WHERE PROD_NO = ?\r\n"
				+ "ORDER BY PROD_TYPE";
		return jdbc.selectOne(sql, param, ProdVo.class);
	}
	
	public void delete(List<Object> param) {
		String sql =
				"DELETE FROM JAVA_PROD\r\n"
				+ "WHERE PROD_NO = ?";
		jdbc.update(sql, param);
	}
	
	public void updateprice(List<Object> param) {
		String sql ="UPDATE JAVA_PROD\r\n"
				+ "SET PRICE=?\r\n"
				+ "WHERE PROD_NO = ?";
		jdbc.update(sql, param);
	}
	
	public void updatecont(List<Object> param) {
		String sql ="UPDATE JAVA_PROD\r\n"
				+ "SET CONTENT=?\r\n"
				+ "WHERE PROD_NO = ?";
		jdbc.update(sql, param);
	}
	
	public void updatename(List<Object> param) {
		String sql ="UPDATE JAVA_PROD\r\n"
				+ "SET NAME=?\r\n"
				+ "WHERE PROD_NO = ?";
		jdbc.update(sql, param);
	}

}
