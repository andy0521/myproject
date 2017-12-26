package com.ibm;

import java.util.Scanner;

public class AutoMachine {

	public static void main(String[] args) {
		boolean t = true;
		int sum = 0;

		while (t) {

			Scanner sc1 = new Scanner(System.in);
			String line = sc1.nextLine();

			switch (line) {

			case "1":
				sum = sum + 1;
				System.out.println(sum);
				break;
			case "5":
				sum = sum + 5;
				System.out.println(sum);
				break;
			case "10":
				sum = sum + 10;
				System.out.println(sum);

				break;
			case "a":
				sum = sum - 15;
				System.out.println(sum);
				if (sum <= 0) {
					System.out.println("BEEP!");
				} else {
					System.out.println("Don!");
				}
				break;
			case "b":
				sum = sum - 20;
				System.out.println(sum);
				if (sum <= 0) {
					System.out.println("BEEP!");
				} else {
					System.out.println("Don!");
				}
				break;

			case "c":
				sum = sum - 30;
				System.out.println(sum);
				if (sum <= 0) {
					System.out.println("BEEP!");
				} else {
					System.out.println("Don!");
				}
				break;

			}
			if (sum <= 0) {
			t = false;
			}
		}

	}
}
