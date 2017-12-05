package com.fju.oo;

public class Student {
	String name;
int english;
int math;
int chinese;
public Student(String n,int e,int m,int c){
	name= n;
	english=e;
	math=m ;
	chinese=c;
	
}
public void print() {
	// TODO Auto-generated method stub	
	System.out.println(english+"\t"+math +"\t"+chinese);
}
public int getAverage(){
	return (english+math+chinese)/3;
	
}
}

