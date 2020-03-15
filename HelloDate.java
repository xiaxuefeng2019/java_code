// 包将功能相似或相似的类组织在一起，包语句决定了文件位置
// package edu.pku.tds.ch02;

import java.util.*;

public class HelloDate{
	public static void main(String[] args){
		System.out.print("Hello, it's ");
		System.out.println(new java.util.Date());
	}
}

// 一个Java文件可以存在多个类，但只有一个public类
class Person{
	int age;
	String name;
	public void sayHello(){}
};