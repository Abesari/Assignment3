package firstSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment3 {

	public static void main(String[] args) {
        

        String fileName = args[0];
        char targetChar = args[1].charAt(0);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int currentChar;
            while ((currentChar = reader.read()) != -1) {
                if (currentChar == targetChar) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(2);
        }

        System.out.println("The character '" + targetChar + "' appears " + count + " times in the file " + fileName + ".");
    }
}