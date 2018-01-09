package com.fju.sogo;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<>();
		customer.add(new Customer(100000));
		customer.add(new SiliverCustomer(100000,0.1f));
		customer.add(new GoldenCustomer(10000,0.1f));
		Customer.print();
		
//		ArrayList<Integer> list = new ArrayList<>();
//		Customer.add()
//	 	list.add(94);
//	 	list.add(88);
//	 	list.add(65);
//	 	list.add(45);
//	 	System.out.println(list.get(1));
//	 	System.out.println(list.size());
//	 	for (int i=0;i<list.size();i++){
//	 		System.out.println(list.get(i));
//	 	}
//		Customer c1 = new Customer(1000);
//		c1.print();
//		SiliverCustomer c2 = new SiliverCustomer();
//		c2.print();
//		
	}
}
