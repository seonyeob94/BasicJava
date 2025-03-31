package kr.or.ddit.chat;
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("서버 연결됨!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        // 서버 메시지 수신을 위한 스레드
        new Thread(() -> {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("서버: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        // 사용자 입력 메시지 서버로 전송
        String userMessage;
        while ((userMessage = userInput.readLine()) != null) {
            out.println(userMessage);
        }

        socket.close();
    }
}
