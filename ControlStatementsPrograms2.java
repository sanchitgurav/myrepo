package ModuleQues;

import java.util.Scanner;

public class ControlStatementsPrograms2 {

	public static void main(String[] args) {
		program5();
		System.out.println();
		program6();
		System.out.println();
		program7();
		System.out.println();
		program8();
	}

	/**
	 * 5. WAP to take a number at run time and check number is “prime” or “not
	 * prime”.
	 */
	private static void program5() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a Prime number or not:");
		int num = s.nextInt();
		int flag = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

	/**
	 * 6. WAP to take any number more than 3 digits and sum them using “while loop”.
	 */
	private static void program6() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a three digit number:");
		int num = s.nextInt();
		int originalNum = num;
		int sumOfDigits = 0;
		while (num > 0) {
			int digit = num % 10;
			sumOfDigits = sumOfDigits + digit;
			num = num / 10;
		}
		System.out.println("Sum of digits of " + originalNum + " = " + sumOfDigits);
	}

	/**
	 * 7. WAP to take a number more than 1 digit at run time and print the same
	 * number in reverse order. Hint: 1234 to 4321 or 53628 to 82635
	 */
	private static void program7() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number having more than one digit:");
		int num = s.nextInt();
		int originalNum = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse of " + originalNum + " = " + rev);
	}

	/**
	 * 8. WAP to take a number through keyboard & check number is palindrome number.
	 * Hint: 121, 12321, 54645 etc are palindrome number.
	 */
	private static void program8() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if it a Palindrome number or not:");
		int num = s.nextInt();
		int originalNum = num;
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if (rev == originalNum) {
			System.out.println(originalNum + " is a palindrome number");
		} else {
			System.out.println(originalNum + " is not a palindrome number");
		}
		s.close();
	}
}
