package com.java2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.List<Integer> list = new ArrayList<>();
list.add(4);
list.add(3);
list.add(4);
list.add(3);
System.out.println(list);
	Set <Integer> set = new HashSet<>();
	set.add(4);
	set.add(3);
	set.add(4);
	set.add(3);
	System.out.println(set);
	Set <String> set2 = new HashSet<>();
	set2.add("q");
	set2.add("q");
	
	set2.add("et");
	
	set2.add("et");
	System.out.println(set2);
	Map<String, String> stock = new TreeMap<String, String>();
	stock.put("11112rw","qqqe");
	stock.put("152rw","qqqe");
	stock.put("4444w","qqqe");
	stock.put("112354","qqqe");
	System.out.println(stock);
	}

}
