package com.java2.object;



import java.util.Random;
import java.util.*;
public class Poker2 {
	
		Random r1 = new Random();
		// int[] cards = new int[52];
		 List<Integer> cards = new ArrayList<>();
		 String flowers = "SHDC";

		public void poker() {
			for (int i = 0; i < 52; i++) {
				cards.add(i);
				}
		}
		
			
	
		public void shuffle() {
			for (int i = 0; i < cards.size(); i++) {
				int r = r1.nextInt(51);
				int temp = cards.get(i);
				cards.set(i, cards.get(r));
				cards.set(r, temp);

				//// cards[i] <-> cards[r]
				// int temp = cards[i];
				// cards[i] = cards[r];
				// cards[r] = temp;
			}
		}

		public void show() {
			for (int i = 0; i < cards.size(); i++) {
				int c = cards.get(i);

				System.out.print((c % 13) + 1 + "" + (flowers.charAt(c / 13)) + " ");
				if (i % 13 == 0) {
					System.out.println();
				}
			}
		}
	}


	