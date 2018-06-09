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
		Scanner sc1 = new Scanner(System.in);
		int data = -1;
		System.out.println("請投入硬幣"+"按0結束投幣");
		while (data != 0){
			
			System.out.println("餘額:"+total);
			data = sc1.nextInt();
			switch(data){
			case 0:
				data=0;
				System.out.println("結束投幣");
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
			case 1:
				total++;
				break;
			default:
					System.out.println("不支援此硬幣");
					break;
			}
		}
		System.out.println("請選擇飲料");
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		} 
		while (total!=0) {
			
			System.out.println("目前餘額:"+total);
			int d =sc1.nextInt();
			
			switch(d) {
			
			case 1:
				if(total<25) {
					System.out.println("餘額不足");
				}else {
					total=total-25;
					System.out.println("Beep!");
				}
				break;
			case 2:
				if(total<30) {
					System.out.println("餘額不足");
				}else {
					total=total-30;
					System.out.println("Beep!");
				}
				break;
			case 3:
				if(total<20) {
					System.out.println("餘額不足");
				}else {
					total=total-20;
					System.out.println("Beep!");
				}
				break;
			case 0:
				System.out.println("謝謝惠顧");
				System.out.println("將退還目前餘額:"+total);
				total=0;
				break;
			default :
				System.out.println("無此選項");
				break;
			}
		}
	}
}