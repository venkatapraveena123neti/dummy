package com.cg.eigthOne.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("D:/Users/learning/Desktop/sneha.txt");
			fos = new FileOutputStream("D:/Users/learning/Desktop/target.txt");
			
			CopyDataThread obj = new CopyDataThread(fis,fos);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
