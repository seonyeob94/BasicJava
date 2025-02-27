package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/*
		 * //2^4 -> 16개
		 *       -> 0.75 차면 확장
		 *       -> *2
		 *  HashMap
		 *    Key 와 vaule로 이루어짐
		 *    key 값은 중복을 허용하지 않고 순서가 보장되지 않음
		 *    
		 * Map 타입의 대표 컬렉션
		 * 
		 * 주요 메소드
		 *  .put(key, value)   : 데이터 입력 key 값은 중복 허용x
		 *                                 value값은 중복 허용
		 *  .get(key)          : value 값을 key 값을 통해 꺼내올 수 있음   
		 *  .containsKey(key)  : key값이 있는지 boolean값이 리턴됨
		 *  .keySet()          : key로 이루어진 hashSet 값을 가져옴
		 * 
		 */
		
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 81);
		map.put("이순신", 87);
		map.put("정몽주", 92);
		map.put("정몽주", 81);
		map.put("이성계", 80);
		
		//key 값이 중복되면 value값도 덮혀쓰여진다
		
		int hongScore = map.get("홍길동");
		System.out.println(hongScore);
		
		//정몽주, 이성계 점수 출력
		
		int joenScore = map.get("정몽주");
		int sunsinScore = map.get("이순신");
		
		System.out.println("정몽주 점수 : "+joenScore);
		System.out.println("이순신 점수 : "+sunsinScore);
		
		
		Set keySet= map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()){
			String key = it.next();
			int value = map.get(key);
			
			System.out.println(key+" : "+value);
		}
		
		
		
		
	}
}
