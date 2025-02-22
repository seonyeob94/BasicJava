package kr.or.ddit.homework14;

import java.util.Scanner;

public class HomeWork14 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork14 obj = new HomeWork14();
		obj.process();
	}

	public void process() {
		String str = "		<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/312/0000670977\"><em class=\"num no1\"><span class=\"blind\">1</span></em>[종합] 김종민, 결혼 전제 연애 인정했다…\"무조건 결혼을 전제로 사랑\" ('라베했어')</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/311/0001749593\"><em class=\"num no2\"><span class=\"blind\">2</span></em>\"기억 지워달라고\" 안재욱 '5억' 뇌수술 회상→육아 강박 고백 (꽃중년)</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/410/0001012239\"><em class=\"num no3\"><span class=\"blind\">3</span></em>“배 타고 어디가...” 김새론, 카페 알바 자숙 중→석양을 배경으로 V 의미는?</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/108/0003250891\"><em class=\"num no4\"><span class=\"blind\">4</span></em>장도연 \"男배우와 사귄다면? 손석구보다 이동욱\" [종합]</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/311/0001749609\"><em class=\"num no5\"><span class=\"blind\">5</span></em>진선규, 전현무 만났다가 \"이미지 나락 갈 듯\" 무슨 일? (현무카세)</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/410/0001012227\"><em class=\"num no6\"><span class=\"blind\">6</span></em>한선화, 의도한 노출인가? 시스루 브라탑에 크롭 멜빵-스커트 셋업 입고 우아한 미모 뽐내</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/410/0001012228\"><em class=\"num no7\"><span class=\"blind\">7</span></em>유이, 다낭 가서 머리 싹둑! 더 인형 같은 미모 뽐낸 베스트-미니스커트 휴양지룩</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/076/0004169589\"><em class=\"num no8\"><span class=\"blind\">8</span></em>전노민 “2009년 형 사망..자꾸 돈 달라고 해 절연했는데..” (이제 혼자다)</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/311/0001749642\"><em class=\"num no9\"><span class=\"blind\">9</span></em>\"선배 저 맘에 안들죠\" 예원 논란에…이본 \"싸울 수 있는 거 아냐?\" (돌싱포맨)[종합]</a>\r\n" + 
				"				</li>\r\n" + 
				"			\r\n" + 
				"				<li>\r\n" + 
				"					<a onclick=\"nclk(this, 'com.relist', '', '');\" href=\"https://m.entertain.naver.com/ranking/article/076/0004169619\"><em class=\"num no10\"><span class=\"blind\">10</span></em>\"저 괜찮아요\" 변우석, 보호하려는 대표 만류 '손 꼭'[SC이슈]</a>\r\n" + 
				"				</li>";
		
		
		
		
		String[] lines= str.split("\r\n");
		int i=0;
		for(String line : lines) {
			if(line.contains("</em>")) {
//				System.out.println(line.substring(line.indexOf("</em>"),line.indexOf("</a>")).replace("</em>",""));
			}
//			System.out.println(i+++line);
			
	}
		
		
	
		
		
		
		String[] lines1= str.split("\r\n");
		int i1=0;
		for(String line : lines1) {
			if(line.contains("</em>")) {
//			System.out.println(i1+++line);

			String[] lines11= line.split("</em>");
			System.out.println(lines11[1].replace("</a>", ""));
		}
			
	  }

		
		
		
		
		
		
	}
 
}
