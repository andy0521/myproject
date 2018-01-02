package com.fju.oo;

import com.fju.aa.GraduatedStudent;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu =new Student("王曉明",77, 66, 55);
		stu.chinese= 65;
		stu.english = 67;
		stu.math=78;
		
		stu.print();
		
		int avg = stu.getAverage();
		System.out.println(stu.name+":" +avg);
	
	GraduatedStudent gstu = new GraduatedStudent();
		gstu.print();
	
	}}



