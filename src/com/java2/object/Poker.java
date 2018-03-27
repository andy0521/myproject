package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> cards = new ArrayList<>();
		cards.add(12);
		cards.add(13);
		cards.add(12);
		cards.add(17);
		cards.add(15);
		cards.set(1, 99);
		System.out.println(cards.size());
		System.out.println(cards.get(1));
		System.out.println("remove number:"+cards.remove(0));
	}

}
