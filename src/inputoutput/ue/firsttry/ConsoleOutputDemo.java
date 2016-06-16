package inputoutput.ue.firsttry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleOutputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/pr2exercise/second.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		String line = "Hello World - first Output (Yeah!)";
		for (char c : line.toCharArray()) {
			fos.write((int) c);
		}
		fos.flush();
		fos.close();
	}

}
