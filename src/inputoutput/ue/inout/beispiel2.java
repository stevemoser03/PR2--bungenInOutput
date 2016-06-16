package inputoutput.ue.inout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class beispiel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/pr2exercise/beispiel1.txt");
		File file1 = new File("/pr2exercise/beispiel1copy.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file1));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		
		int byteRead = 0;
		
		while((byteRead = bis.read()) != -1){
			bos.write(byteRead);
		}
		bos.flush();
		bos.close();
		
	}

}
