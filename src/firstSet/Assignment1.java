package firstSet;

import java.io.File;

public class Assignment1 {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Abesari\\smoothstack\\SmoothstackAssignments3");
		File [] fileList = folder.listFiles();
		
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isFile()) {
				System.out.print("File " + fileList[i].getName());
			} else if (fileList[i].isDirectory()) {
				System.out.println("Directory " + fileList[i].getName());
			}
		}
		
	}

}
