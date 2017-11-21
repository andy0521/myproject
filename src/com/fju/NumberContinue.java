package com.fju;

import java.util.Scanner;

public class NumberContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		for (int n=1;n<=13;n++){
			if (n % 3 == 0){
				continue;
			}
			System.out.print(n+" ");
		}

	}

}
