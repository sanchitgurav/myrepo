package ModuleQues;

import java.util.Scanner;
import java.math.*;

public class ControlStatementsPrograms3 {

	public static void main(String[] args) {
		program9();
		System.out.println();
		program10();
		System.out.println();
		program11();
		System.out.println();
		program12();
	}

	/**
	 * 9. WAP to take any three digit number and check number is Armstrong.(Hint:
	 * 153=1*1*1+5*5*5+3*3*3)
	 */
	private static void program9() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a three digit number to check if it is a Armstrong number or not:");
		int num = s.nextInt();
		int originalNum = num;
		double sumOfCubeOfDigits = 0;
		while (num > 0) {
			int digit = num % 10;
			sumOfCubeOfDigits = sumOfCubeOfDigits + Math.pow(digit, 3);
			num = num / 10;
		}
		if (sumOfCubeOfDigits == originalNum) {
			System.out.println(originalNum + " is a armstrong number.");
		} else {
			System.out.println(originalNum + " is not a armstrong number.");
		}
	}

	/** 10. WAP to print the table of a number.(Hint: 2*1=2,2*2=4,2*3=6….2*10=20) */
	private static void program10() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print it's table:");
		int num = s.nextInt();
		System.out.println("Table of " + num + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
	}

	/** 11. WAP to find the factorial of any number.(Hint: !5=5*4*3*2*1=120) */
	private static void program11() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial:");
		int num = s.nextInt();
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is: " + factorial);
	}

	/**
	 * 12. WAP to find the Fibonacci series up to 10 terms.(Hint: 0 1 1 2 3 5 8 13
	 * 21 34 55 89).
	 */
	private static void program12() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number terms in the Fibonacci series:");
		int numberOfTerms = s.nextInt();
		int num1 = 0;
		int num2 = 1;
		System.out.print("Fibonacci series upto " + numberOfTerms + " terms: " + num1 + ", " + num2);
		for (int i = 2; i < numberOfTerms; i++) {
			int num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
		s.close();
	}

}
