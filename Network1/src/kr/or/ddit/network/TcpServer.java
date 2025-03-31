package kr.or.ddit.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class TcpServer {
	public static void main(String[] args) throws IOException {
		// TCP / UDP
		// 순서가 있다 없다 차이
		System.out.println("서버 오픈");
		ServerSocket server = new ServerSocket(40000);
		
		Socket client = server.accept();
		
		System.out.println("클라이언트 접속 : "+ client.getInetAddress());
		
		InputStream is = client.getInputStream();
		
		int data = 0;
		
		while( (data = is.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println();
		
		client.close();
		server.close();
	}
}
