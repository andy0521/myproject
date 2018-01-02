package com.fju.aa;

import com.fju.oo.Student;

public class GraduatedStudent extends Student {
	int thesis;
	
	
	public GraduatedStudent() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("123");
		// TODO Auto-generated constructor stub
		
			
		}
	@Override
	public void print() {
		
		System.out.println("pass");
		System.out.println(english+"\t"+math +"\t"+chinese+"\t"+thesis);
	}
	@Override
	public int getAverage(){
		return(english+math +chinese+thesis)/4;
		
	}
	}
	
	
