package com.cg.eigthOne.ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread {

	public CopyDataThread(FileInputStream fis , FileOutputStream fos) {
		int i;
		try {
			i=fis.read();
			int count=0;
			 while(i!=-1) {
				 fos.write(i);
				 i=fis.read();
				 count++;
				 
				 if(count==10) {
					 System.out.println("10 chars are printed");
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					 count=0;
				 }
			 }
			
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}
}
