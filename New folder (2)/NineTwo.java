package com.cg.labNine.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NineTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("D://Users//learning//Desktop//numbers.txt");
try {
	Scanner scanner = new Scanner(file);
	scanner.useDelimiter("\\D");
	while(scanner.hasNext()) {
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.println(num);
		}
	}
	scanner.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
