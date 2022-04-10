package com.roshmi;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("abc.txt");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Finally block wll execute always");
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
