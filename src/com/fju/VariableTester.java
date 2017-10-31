package com.fju;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) 
{
		int age =0;
		float weight =/*(float)*/69.5f;
		char c =65;
		char c2 = 'z';
		int i =c2;
		System.out.println((int)c2);
		
		System.out.println(i);

		System.out.println(c2);
		System.out.println(c);
		System.out.println(weight);
		boolean pass =false;
		System.out.println(!pass);
		System.out.println(pass);
		
		
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		int n4 = r.nextInt(6)+1;
	
		System.out.println(3 <= 2);
		//算
		String s =new String("Hello");
		int len = s.length();
		System.out.println("len" + len);
		System.out.println(s.charAt(0));
		  float f = 6.7f;
	        int x = 5;
	        int y = 3;
	        int z = x /y;//  int z = x %y ;  =餘數
	        System.out.println(z);
	        System.out.println(3>>1);
	        System.out.println(3<<1);
	       x++;// x= x+1
	        x--; // x=x-1
	        System.out.println(x);
	        x+=2;
	        System.out.println(x);
	        //字串轉整數
	        String data = "123";
	        int n = Integer.parseInt(data);
	        //整數轉字串
	        String mydata = String.valueOf(n);
	        
	        	
	     }
				
				
}

