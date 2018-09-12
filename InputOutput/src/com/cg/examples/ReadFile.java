package com.cg.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		FileInputStream fileinputstream =null; 
		try {
			fileinputstream=new FileInputStream(new File("D:/Java/fd.txt"));

			int data;
			while ((data = fileinputstream.read()) != -1) {
				System.out.print((char) data);
				stringBuilder.append((char) data);
			}
			fileinputstream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Sorry! File Is Missing");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Reading Failed");
			e.printStackTrace();
		}
		System.out.println(stringBuilder);
		try {
		
			FileOutputStream fileOutputStream=new FileOutputStream(new File("D:/Java/dfs.txt"));
			fileOutputStream.write(stringBuilder.toString().getBytes());
			fileOutputStream.close();
		} 

		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Writing Failed");
			e.printStackTrace();
		}
	}

}
