package service;

import java.util.List;

import dao.BoardDao;
import dao.MemberDao;
import vo.MemberVo;

public class MemberService {
	private static MemberService instance;

	private MemberService() {

	}

	public static MemberService getInstance() {
		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
	}

	MemberDao memberDao = MemberDao.getInstance();
	BoardDao boardDao = BoardDao.getInstance();
	
	public MemberVo login(List<Object> param) {
		return memberDao.login(param);
	}

}
