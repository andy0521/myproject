package com.java2.object;

import java.util.Scanner;

public class ABTGame {

	public static void main(String[] args) {
		String secret = "9684";
		Scanner sc1 = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("Please enter your guess:");
			ABNumber n = new ABNumber(sc1.nextLine());
			result = n.validate(secret);
			System.out.println((result / 10) + "A" + (result % 10) + "B");
		}
	}
}
