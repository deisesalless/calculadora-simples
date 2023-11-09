package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, write first number: ");
		double number1 = input.nextDouble();
		System.out.println("Please, write second number: ");
		double number2 = input.nextDouble();
		
		MathOperations calculator = new MathOperations ();
		calculator.add(number1, number2);
		calculator.subtract(number1, number2);
		calculator.multiply(number1, number2);
		calculator.divide(number1, number2);
		
		input.close();
		
		

	}

}
