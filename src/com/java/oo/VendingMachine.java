package com.java.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	
	List<Drink> drinks = new ArrayList<>();
	
	public void on(){
		int total = 0;
		
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int data = -1;
		while (data != 0){
			System.out.println("Please insert coins...");
			System.out.println("餘額:"+total);
			data = scanner.nextInt();
			switch(data){
			case 0:
				data=0;
				break;
			case 5:
				total=total+5;
				break;
			case 10:
				total=total+10;
				break;
			case 50:
				total=total+50;
				break;
			}
		}
	}
}