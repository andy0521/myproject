package com.java2.maze;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p = true;
		int n = -1;
		while (/* p */n != 0) {
			Scanner sc1 = new Scanner(System.in);
			n = sc1.nextInt();
			switch (n) {
			case 4:
				System.out.println("向左");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 2:
				System.out.println("向下");
				break;
			}
		}
	}
}
