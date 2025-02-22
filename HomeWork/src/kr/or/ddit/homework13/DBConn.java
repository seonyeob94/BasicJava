package kr.or.ddit.homework13;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	private static Connection conn;
	
	public static Connection getConnection(){
		//포트를 열어야 다른 사람컴퓨터로 접속가능하다
		if(conn==null) {
			System.out.println(" 디비 접속 시도 ");
			String url = "jdbc:oracle:thin:@192.168.145.34:1521:xe";
			String user= "c##sy94";
			String pwd= "java";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("디비 접속 완료");
			
		}
		
		return conn;
	}
}
