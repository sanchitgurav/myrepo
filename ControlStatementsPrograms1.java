package ModuleQues;

import java.util.Scanner;

public class ControlStatementsPrograms1 {

	public static void main(String[] args) {
		program1();
		System.out.println();
		program2();
		System.out.println();
		program3();
		System.out.println();
		program4();
	}

	/**
	 * 1. WAP to insert three integer numbers at run time and print largest number.
	 */
	private static void program1() {
		Scanner s = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Enter three numbers to find the largest amoung them: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is the largest number.");
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2 + " is the largest number.");
		} else {
			System.out.println(n3 + " is the largest number.");
		}
	}

	/**
	 * 2. WAP to enter any character value & check the value is vowel or consonant.
	 */
	private static void program2() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an alphabetic character: ");
		char c = s.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			System.out.println(c + " is a Vowel");
		} else {
			System.out.println(c + " is a Consonant");
		}
		s.close();
	}

	/** 3. WAP to find even and odd numbers between 11 to 109 numbers. */
	private static void program3() {
		System.out.println("Even numbers between 11 to 109 are:");
		for (int i = 11; i <= 109; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers between 11 to 109 are:");
		for (int i = 11; i <= 109; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * 4. WAP to count total even and total odd numbers between 11 to 109 numbers.
	 */
	private static void program4() {
		System.out.println("Even numbers between 11 to 109 are:");
		int evenCount = 0;
		for (int i = 11; i <= 109; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				evenCount++;
			}
		}
		System.out.println("Total number of even numbers between 11 to 109: " + evenCount);

		System.out.println("Odd numbers between 11 to 109 are:");
		int oddCount = 0;
		for (int i = 11; i <= 109; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				oddCount++;
			}
		}
		System.out.println("Total number of odd numbers between 11 to 109: " + oddCount);
	}

}
