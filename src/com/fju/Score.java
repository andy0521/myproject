package com.fju;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter your score:");
		Scanner sc1 = new Scanner(System.in);
		int score =sc1.nextInt();
		
		int level = score/10; 
		switch(level){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			System.out.println("Failed");
			break;
			case 6:
				System.out.println("Passed");
				break;
			case 7:
				System.out.println("Good");
				break;
			case 8:
				System.out.println("Great");
				break;
			case 9:
			case 10:
				System.out.println("Exllent");
				break;
		}
	}

}
