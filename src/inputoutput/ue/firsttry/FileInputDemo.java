package inputoutput.ue.firsttry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		
/*		Liest Datei aus mittels FIS.
		File file = new File("/pr2exercise/first.txt");
		
		FileInputStream fis = new FileInputStream(file);
		int byteRead;
		while((byteRead = fis.read()) != -1){
			char [] ch = Character.toChars(byteRead);
			System.out.println(ch[0]);
		}
		fis.close();
*/		
		//Liest Zeichen aus mit system.in bis ein "x" eingegeben wird -> wird nicht gespeichert.
		
		
		int byteRead = System.in.read();
		while(byteRead != -1){
			char [] ch = Character.toChars(byteRead);
			System.out.println(ch[0]);
			
			if(System.in.read() == 'x')
				break;
			
			byteRead = System.in.read();
		}
		
		
	}

}
