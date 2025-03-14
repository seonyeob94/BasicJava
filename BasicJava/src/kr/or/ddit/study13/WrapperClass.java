package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Map;

public class WrapperClass {
	public static void main(String[] args) {
		
		
//		int -> Integer
//		double -> Double
		
		
		int i1 = 0;
		//박싱
		Integer i2 = i1;
		
		Double d1 = new Double("10.23");
		
		//언박싱
		double de = d1;
		
		String str1 = "10";
		
		int num = Integer.parseInt(str1);
		
		Map<Integer, Integer> map = new HashMap();
		
		map.put(1, 10);
		
		int key = map.get(1);
		
		int key2 = -1;
		if(map.containsKey(2)) {
			key2 = map.get(2);
			System.out.println(key);
			
		}
	}
}
