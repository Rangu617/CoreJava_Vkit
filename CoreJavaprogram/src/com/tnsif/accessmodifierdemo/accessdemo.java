package com.tnsif.accessmodifierdemo;
// demo for access modifier


//public
//private
//protected
//default

public class accessdemo {
	
	// public 
	 int a=9;
	String s="guru";
	
	public void display() {
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
		accessdemo obj=new accessdemo();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}

}