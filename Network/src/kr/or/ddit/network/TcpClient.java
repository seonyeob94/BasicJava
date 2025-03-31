package kr.or.ddit.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 40000);
		
		String message = "Hello Server";
		
		FileInputStream fis = new FileInputStream("file/test.txt");
		
		
		byte[] bte = fis.readAllBytes();
		
//		socket.getOutputStream().write(message.getBytes());
		socket.getOutputStream().write(bte);
		
		socket.close();
		
	}
}
