package com.java2.object;

import java.awt.print.Printable;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Sever {
	int cost = 100;
	String name;
	private int price = 500;

	public Sever(String name) {

		this.name = name;

	}

	public void doctor () {
	String n1="1";
	String n2="2";
	String n3="3";
	
	}
	

	public void print() {
		System.out.println(name + " " + "掛號費:" + cost + " " + "診療費:" + " " + price);

	}
}
