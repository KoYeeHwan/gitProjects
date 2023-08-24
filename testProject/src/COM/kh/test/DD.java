package COM.kh.test;

import java.io.FileWriter;
import java.io.IOException;

public class DD {
	public void output() {
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("text.txt");
			fw.write(97);
			fw.write(65);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
