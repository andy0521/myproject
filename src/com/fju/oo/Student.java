package com.fju.oo;

public class Student {
	String name;
 /*private*/public  int english;//private 只能在這使用
public int math;
protected int chinese;//protected 可以給子類別使用 和同package
static int pass;//將變數統合至類別
 public Student(String name,int english,int math,int chinese){
	this.name= name;
	this.english=english;
	this.math=math ;
	this.chinese=chinese;
	//this.name = name;
}
public void print() {
	// TODO Auto-generated method stub	
	System.out.println(english+"\t"+math +"\t"+chinese);
}
public int getAverage(){
	return (english+math+chinese)/3;
	
}
public   Student(){

}
}

