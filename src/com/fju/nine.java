package com.fju;

public class nine {
	public static void main(String[] args) {
		for (int n = 1; n < 10; n = n + 1) {
			for (int i = 1; i < 10; i = i + 1) {
				if ((n * i) < 10) {
					System.out.println(n + " X " + i + " =  " + (n * i));
				} else {
					if ((n * i) >= 10) {
						System.out.println(n + " X " + i + " = " + (n * i));

					}

					/*
					 * for (int i=5; i<10;i=i+1){ System.out.println("2" +" X "
					 * + " i " + " = " + (i*2) );
					 */
				}

			}
			System.out.println(" ");
		}
	}
}
