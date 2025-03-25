package kr.or.ddit.thread;

import oracle.jdbc.logging.runtime.Traceable;

public class ThreadExample02 {
	public static void main(String[] args) {
		//여러군데 활용할때 재사용할때
//		Thread t1 = new Thread(new ThreadJob2());
//		
//		t1.start();
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("사용 가능한 CPU 코어 수 : "+ cores);
		
		//이 쓰레드 내용을 한번만 사용할때
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5;i++) {
					System.out.println("동작 중");
				}
			}
		});
		
		Thread t3 = new Thread(()->{
			for(int i=0; i<5;i++) {
				System.out.println("동작 중");
			}
		});
	}

}
class ThreadJob2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("동작 중");
		}
	}
	
}
