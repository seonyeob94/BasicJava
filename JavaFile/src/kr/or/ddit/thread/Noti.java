package kr.or.ddit.thread;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import kr.or.ddit.api.restr.JDBCUtil;
import util.ScanUtil;

public class Noti {
	public static void main(String[] args) {
		//프로그램 사용중에 알림 보내기.
		
		Noti obj = new Noti();
		obj.process();
	}
	
	public void process() {
		Message m = new Message();
		m.start();
		while(true) {
			System.out.println("1. 게시글 리스트");
			System.out.println("2. 게시글 작성");
			
			int sel = ScanUtil.select();
		}
	}

}
class Message extends Thread{
	
	NotiDao notiDao = NotiDao.getInstance();
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List<Map<String,Object>> list = notiDao.getList();
			if(list==null) continue;
			System.out.println("**신규 공지**");
			for(Map<String,Object>map : list) {
				BigDecimal no = (BigDecimal)map.get("NO");
				notiDao.updateRead(no.intValue());
				System.out.println(map);
			}
			
		}
			
		
		
	}
	
}