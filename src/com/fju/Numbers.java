package com.fju;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number: ");
		Scanner n1 = new Scanner(System.in);
		int i = n1.nextInt();
		int j =1;
		while (j<=i){
			System.out.println(j);
			j++;
			if(i>10){
				break;
				
			}
		}
	}

}
