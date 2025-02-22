package kr.or.ddit.homework13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.or.ddit.util.ScanUtil;

public class MemberMain {
	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.process();
	}

	Connection conn;
	Statement stmt;
	ResultSet rs;

	public void process() {
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int sel = ScanUtil.nextInt("선택 : ");
			if (sel == 1)
				memberJoin();
			if (sel == 2)
				memberLogin();
			if (sel == 3)
				break;

		}

	}

	// rs =stmt.executeQuery(sql);로 날린다

	public void memberJoin() {
		// 인서트 쿼리 작성

		String id = ScanUtil.next("ID : ");
		
		
		//System.out.println("ID를 정해주세요 : ");
		String setid = ScanUtil.next("ID를 정해주세요 : ");
		System.out.println("비밀번호를 정해주세요 : ");
		String setpa = ScanUtil.next();
		System.out.println("이름를 입력해주세요 : ");
		String setna = ScanUtil.next();

		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO JAVA_MEMBER VALUES('" + setid + "','" + setpa + "','" + setna + "')";

			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("회원가입이 완료되었습니다.");

	}

	public void memberLogin() {
		//select 쿼리 작성
		//로그인 됬다고 하면 회원 정보 출력
		//로그인 안되면 실패했다고 출력while(rs.next()) 

		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement();

			System.out.println("ID를 입력해주세요 : ");
			String id = ScanUtil.next();
			System.out.println("비밀번호를 입력해주세요 : ");
			String pa = ScanUtil.next();
			
			String sql = "SELECT * FROM JAVA_MEMBER";
			rs = stmt.executeQuery(sql);

			boolean fa =false;
			while(rs.next()) {
				String reid = rs.getString("ID");
				String repa = rs.getString("PASS");
				String rena = rs.getString("NAME");

				
				
				
				if((id.equals(reid))&&(pa.equals(repa))) {
					System.out.println("확인");
					System.out.println(reid+"\t"+repa+"\t"+rena);
					fa=true;
					break;
					}
					
				}
					if(!fa) {
						System.out.println("로그인에 실패하였습니다");
				
				
			
			
			
			}
		
		
		
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	
	}
}