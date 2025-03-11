package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.BookVo;

public class BookDao {
	private static BookDao instance;

	private BookDao() {

	}

	public static BookDao getInstance() {
		if (instance == null) {
			instance = new BookDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<BookVo> bookList(List<Object> param){
		String sql="SELECT B.*\r\n"
				+ "FROM (SELECT ROWNUM RN, A.*\r\n"
				+ "      FROM (SELECT BOOK_NO, NAME, CONTENT, WRITER, BOOK_TYPE, PUB_DATE\r\n"
				+ "            FROM JAVA_BOOK\r\n"
				+ "            ORDER BY NAME)A \r\n"
				+ "     ) B\r\n"
				+ "WHERE (RN>=? AND RN<=? )";
		return jdbc.selectList(sql, param, BookVo.class);
	}
	
	
	public Map<String, Object> bookCount() {
		String sql = "ELECT COUNT(*)+1 CNT\r\n"
				+ "FROM JAVA_BOOK";
		
		return jdbc.selectOne(sql);
	}
	
	public BookVo getbookNo() {
		String sql="SELECT COUNT(*)+1 BOOK_NO\r\n"
				+ "FROM JAVA_BOOK";
		
		return jdbc.selectOne(sql, BookVo.class);
	}
	
	public void bookInsert(List<Object> param) {
		String sql=
				"INSERT INTO JAVA_BOOK\r\n"
				+ "VALUES(?,?,?,?,?,TO_DATE(?,'YYYY.MM.DD'))";
		
		jdbc.update(sql, param);
	}
	
	public BookVo bookDetail(List<Object> param) {
		String sql=
				  "SELECT * \r\n"
				+ "FROM JAVA_BOOK\r\n"
				+ "WHERE BOOK_NO=?";
		
		return jdbc.selectOne(sql, param, BookVo.class);
	}
	
	public void bookDelete(List<Object> param) {
		String sql=
				"DELETE FROM JAVA_BOOK\r\n"
				+ "WHERE BOOK_NO = ?";
		jdbc.update(sql, param);
	}
	
	public void bookUpdate(List<Object> param) {
		String sql=
				"UPDATE JAVA_BOOK\r\n"
				+ "SET NAME=?,\r\n"
				+ "    WRITER=?,\r\n"
				+ "    BOOK_TYPE=?\r\n"
				+ "WHERE BOOK_NO = ?";
		jdbc.update(sql, param);
	}
}
