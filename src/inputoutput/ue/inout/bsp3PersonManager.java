package inputoutput.ue.inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

public class bsp3PersonManager {

	private ArrayList<bsp3Person> list = new ArrayList<>();
	
	public bsp3PersonManager() {
		super();
	}

	public void addPerson(bsp3Person p){
		list.add(p);
	}
	
	public void load(String path)
				throws PersonManagerException{
		
		File file = new File(path);
		
		try (
			BufferedReader br = new BufferedReader(new FileReader(file));){
			
			String inputline;
			while((inputline = br.readLine())!=null){
				String[] colums = inputline.split(",");
				if(colums.length != 3){
					throw new PersonManagerException("Ungültige Zeile "+inputline);
				}
				
				bsp3Person p = new bsp3Person(colums[0], colums[1], colums[2]);
				list.add(p);
				Collections.sort(list, new comparePerson());
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}


	public void savePerson(String path){
		
		File file = new File(path);
			
		try (
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));){

			String line = list.toString();
			while(true){
				for (bsp3Person p : list) {
					bw.write(line);
					bw.newLine();
					
					
				}
				break;
			}bw.flush();
				bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
