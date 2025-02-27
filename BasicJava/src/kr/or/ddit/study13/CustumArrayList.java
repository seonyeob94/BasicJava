package kr.or.ddit.study13;

public class CustumArrayList {
	
	// 배열의 단점
	// 크기가 정해져야 된다.-> ArrayList
	// 동적으로 크기가 확장된다
	
	private String[] array;
	private int cnt;
	
	public CustumArrayList() {
		array = new String[10];
	}
	
	public CustumArrayList(int size) {
		array = new String[size];
	}
	
	public void add(String str) {
		
		if(cnt == array.length) {
			String[] temp = new String[array.length+10];
			for(int i=0; i<array.length; i++) {
				temp[i]=array[i];
			}
			array = temp;
			
		}
		array[cnt++] = str;
		
	}
	
	
	public String get(int num) {
		return array[num];
	}
	
	public int size() {
		return cnt;
	}
	
	
	public String remove(int num) {
		String remove = get(num);
		for(int i=num;i<cnt;i++) {
			if(i!=array.length-1) 
			array[i]= array[i+1];
		}
		cnt--;
		return remove;
		
	}
	

}
