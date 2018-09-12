package com.cg.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		StringBuffer buffer = new StringBuffer();
		try {
			fileReader = new FileReader(new File("D:/Java/fd.txt"));
			int ch;
			while ((ch = fileReader.read()) != -1) {
				buffer.append((char) ch);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
		//	@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter(new File("D:/Java/df45.txt"));
			fileWriter.write(buffer.toString());
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(buffer);
	}
}
