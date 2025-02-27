package kr.or.ddit.study13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/* 
		 *   HashSet
		 *     Key로 이루어짐
		 *     Key값은 중복을 허용하지 않고 순서가 보장되지 않음.
		 *     
		 *   Set 타입의 대표 컬렉션
		 *    
		 *   주요 메소드
		 *   .add(key)      : 값 추가
		 *   .remove(key)   : 값 삭제
		 *   .contains(key) : 포함여부
		 *   .iterator()    : 전체 출력을 위한 이터레이터
		 * 
		 *  디비 레벨->자바메모리(해쉬처리) 
		 *    기본적으로 속도 중요한 곳에서 많이 사용됨 
		 * 
		 */
		
		
//		Set set = new HashSet();
//		set.add("가");
//		set.add("a");
//		set.add(1);
//		set.add(2);
//		set.add(2);
//		
//		System.out.println(set);
		
		Set<Integer> lotto = new HashSet();
		
		while(lotto.size()<6) {
			lotto.add(new Random().nextInt(45)+1);
			
		}
		System.out.println(lotto);
	}

}
