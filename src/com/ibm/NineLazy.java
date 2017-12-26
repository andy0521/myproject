package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i >= 4 && i <= 8) {
					System.out.print("..."+"\t ");
				} else {
					System.out.print(j + "*" + i + " = " + (i * j) +" ");

				}

			}
			System.out.println();
		}
	}
}
