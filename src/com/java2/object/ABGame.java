package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "9837";
		
		int length = secret.length();
			int a =0;
		while (a!= 4) {
		a=0;
		int b = 0;
			Scanner sc1 =new Scanner(System.in);
			String num =sc1.nextLine();
			for (int i = 0; i < length; i++) {

				char c = num.charAt(i);

				for (int j = 0; j < length; j++) {
					if (c == secret.charAt(j)) {

						if (i == j) {
							a++;
						} else {
							b++;
						}
					}

				}
			}System.out.println(a + "A" + b + "B");
		}
		
	}
}
