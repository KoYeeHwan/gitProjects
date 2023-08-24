package COM.kh.TCP_Test;
import java.io.*;
import java.net.*;

public class UDP_ClientB {
	public static void main(String[] args) {
		System.out.println("Client B");
		
		DatagramSocket ds = null;
		
		try {
			ds = new DatagramSocket(20000);
		} catch(SocketException e) {
			e.printStackTrace();
		}
		
		byte[] receiveData = "안녕하세요".getBytes();
		DatagramPacket receiveData = new DatagramPacket(receiveData, receiveData.length);
		
		System.out.println("발송 데이터 : " + new String(sendPacket.getData(), sendPacket.getOffset(), sendPacket.getLength()));
		try {
			ds.receive(receivePacket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 데이터 발송
		InetSocketAddress is = new InetSocketAddress("loclahost", 10000);

		byte[] receiveData = new byte[65000];
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		try {
			ds.receive(receivePacket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("수신 데이터 :" 
				+ new String(receivePacket.getData(), receivePacket.getOffset(), receivePacket.getLength()));
	}
}
