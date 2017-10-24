package com.fju;

import java.util.Scanner;

public class HelloWorld {
     public static void main(String[]args){
    	 System.out.println("請輸入你的名字");
    	/*Person p = new Person();
    	 p.sayHello();*/
    	 Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Hello," + line);
        System.out.println("你幾歲");
        line = scanner.nextLine();
        int age = Integer.parseInt(line);
        System.out.println(age);
        System.out.println(age > 25);

     }
}