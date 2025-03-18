package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class JDBCMain {
	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
//		
//		String sql="SELECT *\r\n"
//				+ "FROM JAVA_MEMBER\r\n"
//				+ "WHERE ID= 'a'\r\n"
//				+ "AND PASS='a'";
//		Map<String, Object> map = jdbc.selectOne(sql);
//		
//		System.out.println(map);

		
//		String sql="SELECT *\r\n"
//				+ "FROM JAVA_MEMBER\r\n"
//				+ "WHERE ID= 'a'\r\n"
//				+ "AND PASS='a'";
//		List<Object> param = new ArrayList();
//		param.add("b");
//		param.add("b");
//			
//		
//		Map<String, Object> map = jdbc.selectOne(sql, param);
//		
//		System.out.println(map);
		

//		String sql="SELECT *\r\n"
//				+ "FROM JAVA_MEMBER\r\n";
//		
//			
//		
//		List<Map<String, Object>> list = jdbc.selectList(sql);
//		
//		System.out.println(list);
		

		

//		String sql="SELECT *\r\n"
//				+ "FROM JAVA_BOARD\r\n"
//				+ "WHERE TITLE LIKE '%'||?||'%' \r\n"
//				+ "ORDER BY NO";
//		
//			
//		List<Object> param = new ArrayList();
//		param.add("테스트");
//		
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		
//		System.out.println(list);
		
		
//		String sql = "INSERT INTO JAVA_MEMBER\r\n"
//			    	+ "VALUES ('e', 'e', 'e')";
//		
//		int update = jdbc.update(sql);
//		System.out.println(update);

		
		String sql = "  UPDATE JAVA_MEMBER\r\n"
				+ "     SET PASS = '?'\r\n"
				+ "    WHERE ID='e'; ";
		
		List<Object> param = new ArrayList();
		param.add("e3");
		
		int update = jdbc.update(sql, param);
		System.out.println(update);
	}

}
