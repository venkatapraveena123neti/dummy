package com.cg.labNine.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NineOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer buffer=new StringBuffer();
try {
    FileReader	fileReader =new FileReader(new File("D://Users//learning//Desktop//NineOne.txt"));
	FileWriter  filewriter=new FileWriter(new File("D://Users//learning//Desktop//Target.txt"));
	BufferedReader br= new BufferedReader(fileReader);
	String data;
	while((data=br.readLine())!=null) {
		String[] words=data.split(" ");
		for (String a : words) {
         StringBuilder builder = new StringBuilder(a);
         StringBuilder b= new StringBuilder();
         b.append(builder.reverse().toString());
         b.append(" ");
         filewriter.write(b.toString());
         System.out.println(b);
		}
	}
	filewriter.close();
	fileReader.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}



}