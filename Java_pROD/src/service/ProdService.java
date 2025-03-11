package service;

import java.util.List;

import dao.ProdDao;
import vo.ProdVo;

public class ProdService {
	private static ProdService instance;

	private ProdService() {

	}

	public static ProdService getInstance() {
		if (instance == null) {
			instance = new ProdService();
		}
		return instance;
	}
	
	ProdDao prodDao = ProdDao.getInstance();
	
	public List<ProdVo> prodList(List<Object> param){
		return prodDao.prodlist(param);
	}

	public void insert(List<Object> param) {
		prodDao.insert(param);
	}
	
	public ProdVo detail(List<Object> param) {
		
		return prodDao.detail(param); 
	}
	
	public void delete(List<Object> param) {
		
		prodDao.delete(param);
	}
	
	public void updateprice(List<Object> param) {
		prodDao.updateprice(param);
	}
	
	public void updatecont(List<Object> param) {
		prodDao.updatecont(param);
	}
	
	public void updatename(List<Object> param) {
		prodDao.updatename(param);
	}

}
