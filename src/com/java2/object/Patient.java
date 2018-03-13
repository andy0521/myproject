package com.java2.object;

import java.util.Scanner;

public class Patient {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter your name");
		Scanner sc1 = new Scanner(System.in);
		String n = sc1.nextLine();
		Sever s = new Sever(n);
		s.doctor();
		s.print();
	}

}
