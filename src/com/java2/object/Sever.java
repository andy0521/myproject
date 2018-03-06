package com.java2.object;

import java.awt.print.Printable;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Sever {
	int cost;
	String name;
	private  int price=1000;
	public Sever(String name,int cost){
		this.cost = cost;
	this.name=name;
	print();
	}
	public void print(){
		System.out.println( name +" "+"掛號費:"+ cost+" "+ price);
				
			
		}
	
	}

