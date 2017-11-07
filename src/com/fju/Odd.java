package com.fju;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n % 2 == 1) {
			System.out.println("是奇數");
		} else {
			System.out.println("是偶數");

			System.out.println("請輸入年齡");
			String line2 = scanner.nextLine();
			int age = Integer.parseInt(line2);
			if (age <= 12) {
				System.out.println("小學");
			} else {
				if (age <= 15) {
					System.out.println("中學");
				} else {
					if (age <= 18) {
						System.out.println("高中");
					} else {
						if (age > 18) {
							System.out.println("....");

						}
					}
				}
			}
		}
	}
}
