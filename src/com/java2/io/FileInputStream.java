package com.java2.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;

import org.omg.PortableServer.POAPackage.WrongAdapterHelper;

public class FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
	Write();
			// TODO Auto-generated method stub
	
	}
	public static  void Write() throws FileNotFoundException {
	FileOutputStream out = new FileOutputStream("data.txt");
	try{
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
		// TODO Auto-generated method stub

	}
	}