package service;

import java.util.List;
import java.util.Map;

import controller.MainController;
import dao.MemberDaoImpl;

public class MemberServiceImpl implements MemberService {
	
	private static MemberServiceImpl instance;

	private MemberServiceImpl() {

	}

	public static MemberServiceImpl getInstance() {
		if (instance == null) {
			instance = new MemberServiceImpl();
		}
		return instance;
	}

	MemberDaoImpl memberDao = MemberDaoImpl.getInstance();


	@Override
	public boolean login(List<Object> param) {


		Map<String, Object> map = memberDao.login(param);
		if(map == null) return false;
		else {
			MainController.sessionStorage.put("login", map);
			return true;
		}
	}

	@Override
	public boolean join(List<Object> param) {
		int num = memberDao.join(param);
		if(num==0) return false;
		return true;
	}

	@Override
	public List<Map<String, Object>> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(List<Object> param) {
		
	   //int 내가마음대로이름 = 멤버다오.업데이트()
		
	
		
		return false;
		
	}

	
	
}
