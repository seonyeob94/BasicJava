package kr.or.ddit.api;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        int port = 38080;
//        String responseMessage = "{'data' : 123, 'data2' :abc}"; // 기본 응답 메시지
//        WeatherVo weather = ApiExplorerUtil.getApi();
//        
//    
       
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new RootHandler("{'name':'이선엽', 'age':30}"));
        server.setExecutor(null);
        server.start();

        System.out.println("Server started on port " + port);
    }

    static class RootHandler implements HttpHandler {
        private final String message;

        public RootHandler(String message) {
            this.message = message;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            exchange.getResponseHeaders().set("Content-Type", "aplication/json; charset=UTF-8");
        	exchange.sendResponseHeaders(200, message.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        }
    }
}
