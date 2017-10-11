package com.srinivas.learning;

public class Calculator {

	public static void main(String args[]) {
		System.out.println("I am going to create a calculator prog.");
		Calculator calcAdd = new Calculator();
		calcAdd.addition(3, 5);
		
		Calculator calcSubstraction = new Calculator();
		calcSubstraction.substraction(12, 6);
		
		Calculator calcMultiply = new Calculator();
		calcMultiply.multiply(2, 5);
		
		Calculator calcDivide = new Calculator();
		calcDivide.divide(24, 2);

		Calculator calcModulo = new Calculator();
		calcModulo.divide(36, 2);

	}
	
	public void addition(int num1, int num2) {
		System.out.println("Addition of num1 and num2 is : "+(num1+num2));
	}
	public void substraction(int num1, int num2) {
		System.out.println("Substraction of num2 and num1 is : "+(num1-num2));
	}
	public void multiply(int num1, int num2) {
		System.out.println("Multiplication of num1 and num2 is : "+(num1*num2));
	}
	public void divide(int num1, int num2) {
		System.out.println("Division of num1 by num2 is : "+(num1/num2));
	}
	public void modulo(int num1, int num2) {
		System.out.println("Remainder of num1 divided by num2 is : "+(num1%num2));
	}
	
}
