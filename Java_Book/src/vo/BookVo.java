package vo;

import lombok.Data;

@Data
public class BookVo {
	private int book_no;
	private String name;
	private String content;
	private String writer;
	private String book_type;
	private String pub_date;
	
	
	@Override
	public String toString() {
		return book_no+"\t"+name+"\t\t"+content+"\t"+writer+"\t"+book_type+"\t"+pub_date;
	}



	
}
