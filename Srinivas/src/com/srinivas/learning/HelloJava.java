package com.srinivas.learning;

public class HelloJava {

	public static void main(String args[]) {
		System.out.println("Hey Srinivas, you have successfully configured your first Java Project");
		HelloJava java = new HelloJava();
		java.sayHello("Srinivas");
		
		//className variable = new className();
	}
	
	public void sayHello(String name) {
		System.out.println("Hello Java from "+name);
	}
	
}
