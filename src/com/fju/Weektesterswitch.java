package com.fju;

import java.util.Scanner;

public class Weektesterswitch {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String line =sc1.nextLine();
		int n =Integer.parseInt(line);
		switch (n) {
		case 1:
			System.out.println("星期一");
			break;	
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			
			default:System.out.println("星期日");
				break;
		}

	}

}
