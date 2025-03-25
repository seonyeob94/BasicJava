package kr.or.ddit.thread;

import java.util.List;
import java.util.Map;

import kr.or.ddit.api.restr.JDBCUtil;

public class NotiDao {
	private static NotiDao instance;

	private NotiDao() {

	}

	public static NotiDao getInstance() {
		if (instance == null) {
			instance = new NotiDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> getList(){
		String sql ="SELECT *\r\n"
				+ "FROM NOTI\r\n"
				+ "WHERE READ ='N'";
		return jdbc.selectList(sql);
				
	}
	
	public void updateRead(int no) {
		String sql="UPDATE NOTI\r\n"
				+ "SET READ='Y'\r\n"
				+ "WHERE NO="+no;
		
		jdbc.update(sql);
	}

}
