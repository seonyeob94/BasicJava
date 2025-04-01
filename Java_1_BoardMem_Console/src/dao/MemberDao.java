package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public interface MemberDao {

	
	public Map<String, Object> login(List<Object> param);
	
	public int join(List<Object> param);
	
	public List<Map<String, Object>> list();
	
	public int update(List<Object> param); 
	
	public int delete(List<Object> param);
}
