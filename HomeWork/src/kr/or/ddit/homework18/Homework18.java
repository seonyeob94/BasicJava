package kr.or.ddit.homework18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import kr.or.ddit.util.ScanUtil;

public class Homework18 {
	public static void main(String[] args) {
		Homework18 obj = new Homework18();
		obj.process();
		
	}


	
	public void process() {
		insertDate();
		
		printData();
		int max = MaxSalary();
		System.out.println("salary 최대값 : "+max);
		int min = minSalary();
		System.out.println("salary 최소값 : "+min);
		String empId = ScanUtil.next("empId(203,122,115,137,200) 입력 :");
		selectOne(empId);
		String dept = ScanUtil.next("dept(10,30,40,50) 입력 : ");
		selectDept(dept);
	}
	
	
	public void sumDept() {
		//부서별 월급 총합을 구하고 출력하기
		Map<Integer, Integer> sumMap = new HashMap();
		
		// containskey 활용
	}
	
	public void selectDept(String dept) {
		//dept에 해당하는 사람 정보 출력하기
		
             for(int i=0; i<list.size();i++) {
			

			Map<String, Object> map =list.get(i);
			if(map.containsKey("dept") && map.get("dept").equals(dept)) {
				Map<String, Object> deptt;
		       for(int j=0; j<list.size();j++) {
		    	   deptt=list.get(j);
				
				Set<String> keySet = map.keySet();
				Iterator<String> it = keySet.iterator();
				
				while(it.hasNext()) {
					String key = it.next();
					Object value = map.get(key);
				
					System.out.println(key+" : "+value);				
				}	
		       }
			
			}
	
		}
	}
	
	public void selectOne(String empId) {
		//empId에 해당하는 사람 정보 출력하기


		for(int i=0; i<list.size();i++) {
			

			Map<String, Object> map =list.get(i);
			if(map.containsKey("empId") && map.get("empId").equals(empId)) {
				
				Set<String> keySet = map.keySet();
				Iterator<String> it = keySet.iterator();
				
				while(it.hasNext()) {
					String key = it.next();
					Object value = map.get(key);
				
					System.out.println(key+" : "+value);
				
				
				}	
			}
	
		}
		
		
	}
	
	
	public int minSalary() {
		//월급 최소값 찾기
		int min =MaxSalary();
		
		for(int i=0; i<list.size();i++) {
			Map<String, Object> map = list.get(i);
			
			int sel = (int)map.get("SALARY");
			if(sel<min) min=sel;
		

		}
		
		return min;
	}
	
	
	public int MaxSalary() {
		//월급 최대값 찾기
		//object가 부모니 강제 캐스팅
		int max=0;
		
		for(int i=0; i<list.size();i++) {
			Map<String, Object> map = list.get(i);
			
			int sel = (int)map.get("SALARY");
			if(sel>max) max=sel;
		

		}
		return max;
		
		
	}
	
	
	public void printData() {
		//전체 출력하기
		

		System.out.println("전체 출력");
		for(int i=0; i<list.size();i++) {
		Map<String, Object> map =list.get(i);
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Object value = map.get(key);
			System.out.println(key+" : "+value);
		}	
		System.out.println("===================");
	  }
	}
	
	
	List<Map<String,Object>> list;
	//List 안에 Map을 넣겠다 
	
	
	
	public void insertDate() {
		list = new ArrayList();
		
		//Map<String,Object>
		//String -> 컬럼 이름
		//Object -> 컬럼 값
		
//		empId   ENAME      DEPT     SALARY

//		203	Susan Jacobs	40		6500
//		122	Payam Kaufling	50		7900
//		115	Alexander Khoo	30		3100
//		137	Renske Ladwig	50		3600
//		200	Jennifer Whalen	10		4400
		
		
		//list 데이터 담기
		
		Map<String, Object> el = new HashMap();
		el.put("empId", "203");
		el.put("ENAME", "SUASN Jacobs");
		el.put("DEPT", 40);
		el.put("SALARY", 6500);
		list.add(el);
		
		Map<String, Object> e2 = new HashMap();
		e2.put("empId", "122");
		e2.put("ENAME", "Payam Kaufling");
		e2.put("DEPT", 50);
		e2.put("SALARY", 7900);
		list.add(e2);
		
		Map<String, Object> e3 = new HashMap();
		e3.put("empId", "115");
		e3.put("ENAME", "Alexander Khoo");
		e3.put("DEPT", 30);
		e3.put("SALARY", 3100);
		list.add(e3);
		
		Map<String, Object> e4 = new HashMap();
		e4.put("empId", "137");
		e4.put("ENAME", "Renske Ladwig");
		e4.put("DEPT", 50);
		e4.put("SALARY", 3600);
		list.add(e4);
		
		Map<String, Object> e5 = new HashMap();
		e5.put("empId", "200");
		e5.put("ENAME", "Jennifer Whalen");
		e5.put("DEPT", 10);
		e5.put("SALARY", 4400);
		list.add(e5);
		

		
	}
}
