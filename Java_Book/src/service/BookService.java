package service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import dao.BookDao;
import vo.BookVo;

public class BookService {
	private static BookService instance;

	private BookService() {

	}

	public static BookService getInstance() {
		if (instance == null) {
			instance = new BookService();
		}
		return instance;
	}
	
	BookDao bookDao = BookDao.getInstance();
	
	public List<BookVo> bookList(List<Object> param){
	
		return bookDao.bookList(param);
	}
	
	public int getBookNo() {
//		Map<String, Object> map= bookDao.bookCount();
//		BigDecimal cnt=	(BigDecimal)map.get("CNT");
//		
//		return cnt.intValue();
		
		return bookDao.getbookNo().getBook_no();
	}
	
	public void bookInsert(List<Object> param) {
		bookDao.bookInsert(param);
	}
	
	public BookVo bookDetail(List<Object> param) {
		return bookDao.bookDetail(param);
	}
	
	public void bookDelete(List<Object> param) {
		bookDao.bookDelete(param);
	
	}
	
	public void bookUpdate(List<Object> param) {
		bookDao.bookUpdate(param);
	}

}
