package kr.or.ddit.study13;

public class CustumArrayMain {
	public static void main(String[] args) {
		//다만 한계에 다할때 확장 복사를 속도가 느리다
		
		CustumArrayList list =new CustumArrayList();
		
		for(int i=1;i<=25;i++) list.add(i+"");
		
		String remove = list.remove(2);
		System.out.println("삭제된 값 : "+ remove);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	
	
	}
}
