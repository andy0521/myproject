package com.java2.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream {

	public static void main(String[] args) {
		try{
			// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("data.txt");
		
		out.write(65);
		out.flush();
		out.close();
		}catch ( FileNotFoundException e) {
			System.out.print("file not found");
			// TODO: handle exception
		
	}catch (IOException e) {
		// TODO: handle exception
		System.out.print("file output problem");
	}
	}
	}