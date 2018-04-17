//package com.java2.io;
//
//import java.io.FileOutputStream;
//import java.io.PrintStream;
//import java.util.Scanner;
//
//public class Sogo {
//	Scanner sc1 = new Scanner(System.in);
//	  
//	public Sogo() {
//		Start();
//	}
//
//	public void function() {
//		 
//		int function = 3;
//		while (function != 3) {
//			ShowFunction();
//			function = sc1.nextInt();
//			switch (function) {
//			case 1:
//				inputSales();
//		
//				
//			}
//		}
//	}
//	public void Start(){
//		function();
//	}
//public void inputSales() {
//	try{
//		FileOutputStream fos = new FileOutputStream("sales.txt", true);
//		PrintStream out = new PrintStream(fos);
//		System.out.print("請輸入會員等級:");
//		int type = sc1.nextInt();
//		System.out.println("請輸入銷售額");
//		int amount =sc1.nextInt();
//		out.println(type+"\t"+amount);
//		out.flush();
//		out.close();
//	}catch (Exception e) {
//		// TODO: handle exception
//		e.printStackTrace();
//	}
//	
//}
//public void ShowFunction(){
//	System.out.println("請輸入功能(1~3):");
//	System.out.println("1)列出銷售紀錄:");
//	System.out.println("請輸入功能(1~3):");
//
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new Sogo();
//		Sogo.Start;
//	}}
package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fju.sogo.Customer;
import com.fju.sogo.GoldenCustomer;
import com.fju.sogo.SiliverCustomer;

public class Sogo {
	Scanner scanner = new Scanner(System.in);

	public Sogo() {

	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showFunctions();
			function = scanner.nextInt();
			switch (function) {
			case 1:
				inputSales();
				break;
			case 2:
				List<Sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Sales sales = new Sales(type, amount);
							list.add(sales);
						} catch (NumberFormatException e) {
							System.out.println("資料格式錯誤");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// report
				for (Sales sales: list){
					Customer customer = null;
					switch(sales.type){
					case 1: 
						customer = new Customer(sales.getAmount());
						break;
					case 2:
						customer = new SiliverCustomer(sales.getAmount());
						break;
					case 3:
						customer = new GoldenCustomer(sales.getAmount());
						break;
					}
					customer.print();
				}
				
				
				break;
			case 3:
				return;
			}
		}
	}

	public void inputSales() {
		try {
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int type = scanner.nextInt();
			System.out.print("請輸入銷售金額:");
			int amount = scanner.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showFunctions() {
		System.out.println("請輸入功能(1~3):");
		System.out.println("1) 輸入銷售記錄");
		System.out.println("2) 印出銷售報表");
		System.out.println("3) 結束程式");
	}

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}
}

