package kr.or.ddit.homework07;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}

	public void process() {
		// 문자 맞추기 게임 
		String[] words = {"airplane", "apple", "bicycle", "cloud", "fruits"};
		
		
		int wordSel = (int)(Math.random()*words.length);
		
		String word = words[wordSel];
//		System.out.println(word);
		
		// 문자열 -> 문자 배열 
		// toCharArray
		char[] wordChars = word.toCharArray();
		
//		for(int i=0; i<wordChars.length; i++) {
//			System.out.println(wordChars[i]);
//		}
		
		for(int i=0; i<10000; i++) {
			int ran = (int)(Math.random()*wordChars.length);
			// f
			char temp      = wordChars[0];
			// f              u
			wordChars[0]   = wordChars[ran];
			// u              f
			wordChars[ran] = temp;
		}
		//String[] words = {"airplane", "apple", "bicycle", "cloud", "fruits"};
		
		int cnt =0;
		while(true) {
			// 섞인 문자열을 출력 하고 
			// 정답을 맞추세요 
			//      정답이 틀린경우 계속 진행 
			//      정답을 맞춘경우 반복문 종료 후 몇번 시행 했는지 출력 
			//
			cnt++;
			for(int an=0;an<wordChars.length;an++) {
				System.out.print(wordChars[an]);
			}
			System.out.print("\n"+"정답을 입력하시오"+"\n");
			String anwser = sc.nextLine();
				
			if(anwser.equals(word)) break;	
			
		}
		
		System.out.println(cnt+" 번 만에 맞추셨습니다.");
		
	}
}
