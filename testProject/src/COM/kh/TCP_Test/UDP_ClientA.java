package COM.kh.TCP_Test;
import java.io.*;
import java.net.*;

public class UDP_ClientA {
	public static void main(String[] args) {
		System.out.println("Client A");
		
		// 1 DataGramSocket 객체생성
		DatagramSocket ds = null;
		
		try {
			ds = new DatagramSocket(10000);
		} catch(SocketException e) {
			e.printStackTrace();
		}
		
		byte[] sendData = "안녕하세요".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
			 new InetSocketAddress("loclahost", 20000));
		
		System.out.println(
				"발송 데이터 : " + new String(sendPacket.getData(), sendPacket.getOffset(), sendPacket.getLength()));
		try {
			ds.send(sendPacket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
