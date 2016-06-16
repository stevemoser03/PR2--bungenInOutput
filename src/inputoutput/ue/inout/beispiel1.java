package inputoutput.ue.inout;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class beispiel1 {

	public static void main(String[] args) throws IOException {

		
		File file = new File("/pr2exercise/beispiel1.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
		
		int data = 0;
		
		while((data = System.in.read()) != -1){
			if(data == 'x'){
				break;
			}
			else
				bos.write(data);
		}
		bos.flush();
		bos.close();
	}
	}


