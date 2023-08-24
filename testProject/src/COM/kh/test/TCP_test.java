package COM.kh.test;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_test {
	public void server() {
		int port = 3000;
		
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
			} 
		}
	}
}
