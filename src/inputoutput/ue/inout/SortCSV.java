package inputoutput.ue.inout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SortCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File unsorted = new File("/pr2exercise/unsortet.txt");
		File sorted = new File("/pr2exercise/sorted.txt");
		
		BufferedOutputStream bosunsorted = new BufferedOutputStream(new FileOutputStream(unsorted));
		BufferedReader br = new BufferedReader(new FileReader(unsorted));
		BufferedWriter bw = new BufferedWriter(new FileWriter(sorted));
	
		int count = 0;
		int data = 0;
		while((data = System.in.read()) != -1){
			if(data=='x'){
				break;
			}
			else
				bosunsorted.write(data);
				if(data==';'){
					count++;
				}
			
		}
		bosunsorted.flush();
		bosunsorted.close();
		
		String line;
		while((line = br.readLine()) !=null){
			String [] s = line.split(";");
			for(int i = 0; i < count+1;i++){
				bw.write(s[i]);
				bw.newLine();
				
			}
		}
		bw.flush();
		bw.close();
		
	}

}
