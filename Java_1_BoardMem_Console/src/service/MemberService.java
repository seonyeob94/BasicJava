package service;

import java.util.List;
import java.util.Map;

public interface MemberService {

	
	
	public boolean login(List<Object> param);
	
	public boolean join(List<Object> param);
	
	public List<Map<String, Object>> list();
	
	public boolean update(List<Object> param);
	
	
}
