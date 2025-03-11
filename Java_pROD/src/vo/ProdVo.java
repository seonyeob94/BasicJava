package vo;

import lombok.Data;

@Data
public class ProdVo {
	private int prod_no;
	private String name;
	private String content;
	private int price;
	private String prod_type;
	private String prod_date;
}
