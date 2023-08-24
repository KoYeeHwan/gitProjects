package KH.OOP2;

import java.io.*;

public class Run {
	public static void main(String[] args) {
		String filePath = "myFile.txt";

		try {
			File file = new File(filePath);
			boolean isFileCrated = file.createNewFile();

			if (isFileCrated) {
				System.out.print("파일 생성 완료 : " + filePath);
			} else {
				System.out.print("파일 생성 실패");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (OutputStream out = new FileOutputStream(filePath)){
			String data = "7";
			out.write(data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (InputStream in = new FileInputStream(filePath)){
			int readByte = in.read();
			System.out.println((char) readByte);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
