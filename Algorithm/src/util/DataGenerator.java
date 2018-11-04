package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataGenerator {
	
	private static final String PATH = "C:\\Users\\dahan\\Desktop\\test.txt";

	public static void main(String[] args) {
		DataGenerator dataGenerator = new DataGenerator();
		
		dataGenerator.generateNumbers(100000, 10);
	}
	
	public void generateNumbers(int count, int range) {
		File 			file			= null;
		FileWriter 		fileWriter 		= null;
		BufferedWriter 	bufferedWriter 	= null;
		
		try {
			file 			= new File(PATH);
			fileWriter 		= new FileWriter(file);
			bufferedWriter 	= new BufferedWriter(fileWriter);
			
			if (file.canWrite()) {
				int number = 0;
						
				for (int i = 0; i < count; i++ ) {
					number = (int)(Math.random() * range);
					bufferedWriter.write(i != count - 1 ? (number + " ") : (number + ""));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
