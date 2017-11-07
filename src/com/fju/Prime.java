package com.fju;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner n1 = new Scanner(System.in);

		int n = 5;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;

			}
			
			}
			if (prime) {
				System.out.println(n + " IS PRIME NUMBER ");
			} else {
				System.out.println(n + " NOTprime ");
		}
	}
}
