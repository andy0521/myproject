package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	public class Poker {
		Random random = new Random();
//		int[] cards = new int[52];
		ArrayList<Integer> cards = new ArrayList<>(); 
		
		String flowers = "SHDC";
		public Poker() {
			
			for (int i = 0; i < cards.length; i++) {
				cards[i] = i;
				System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
			}
		}
		
		public void shuffle(){
			for (int i=0; i<cards.length; i++){
				int r =random.nextInt(52);
//				cards[i] <-> cards[r]
				int temp = cards[i];
				cards[i] = cards[r];
				cards[r] = temp;
			}
		}
		
		public void show(){
			for (int i=0; i<cards.length; i++){
				int c = cards[i];
				System.out.print((c%13)+1 + "" + (flowers.charAt(c/13)) + " ");
				if (i%13==0){
					System.out.println();
				}
			}
		}
	}}
