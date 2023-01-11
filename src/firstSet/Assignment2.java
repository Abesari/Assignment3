package firstSet;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Assignment2 {

	public static void main(String[] args) {
		try {
			File file = new File("append.txt");
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			StringBuffer sb = new StringBuffer();
			String s;
			while ((s = bufferedReader.readLine()) != null) {
				sb.append(s);
				sb.append("\n");
			}
			fileReader.close();
			
			sb.append("very important text");
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(sb.toString());
			fileWriter.close();
			
			System.out.println("Imporant text appended!");
				
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("not appended :(");
				}
		
	
	}
}
	
