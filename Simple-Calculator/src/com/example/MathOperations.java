package com.example;

public class MathOperations {
	
	public void plus(double number1, double number2) {
		double result = number1 + number2;
		System.out.printf("The addition of de numbers is: %.2f", result);	
	}
	
	public void minus(double number1, double number2) {
		double result = number1 - number2;
		System.out.printf("\nThe subtraction between the numbers is: %.2f", result);	
	}
	
	public void times(double number1, double number2) {
		double result = number1 * number2;
		System.out.printf("\nThe multiplication between the numbers is: %.2f", result);	
	}
	
	public void dividedBy(double number1, double number2) {
		double result = number1 / number2;
		System.out.printf("\nThe division between the numbers is: %.2f", result);	
	}

}
