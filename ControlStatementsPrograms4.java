package ModuleQues;

import java.util.Scanner;

public class ControlStatementsPrograms4 {

	public static void main(String[] args) {
		program13();
		System.out.println();
		program14();
		System.out.println();
		program15();
		System.out.println();
		program16();
	}

	/** 13. WAP to convert decimal number to binary. */
	private static void program13() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a decimal number to convert it into binary number:");
		int decimalNumber = s.nextInt();
		int copyOfDecimalNumber = decimalNumber;
		System.out.println(
				"Converting by using Integer.toBinaryString() method: " + Integer.toBinaryString(decimalNumber));
		if (decimalNumber == 0) {
			System.out.println("0");
		}
		int rem;
		String binaryNumber = "";
		while (decimalNumber > 0) {
			rem = decimalNumber % 2;
			binaryNumber = rem + binaryNumber;
			decimalNumber = decimalNumber / 2;
		}
		System.out.println(copyOfDecimalNumber + " converted to binary number: " + binaryNumber);
	}

	/** 14. WAP to convert binary number to decimal. */
	private static void program14() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number to convert it into decimal number:");
		int binaryNumber = s.nextInt();
		int copyOfBinaryNumber = binaryNumber;
		double decimalNumber = 0;
		int power = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimalNumber = decimalNumber + temp * Math.pow(2, power);
				binaryNumber = binaryNumber / 10;
				power++;
			}
		}
		System.out.println(copyOfBinaryNumber + " coverted to deciaml number: " + decimalNumber);
	}

	/**
	 * 15. WAP to “add”, ”subtract”, ”multiply”, ”division” using “switch”.(Press 1
	 * for add, 2 for subtract, 3 for multiply and default for division).
	 */
	private static void program15() {
		Scanner s = new Scanner(System.in);
		System.out.print("Press 1 for Addition\n" + "Press 2 for Subtraction\n" + "Press 3 for Multiplication\n"
				+ "Press any number for Division\n");
		System.out.print("Enter your choice: ");
		int option = s.nextInt();
		System.out.println("Enter first number:");
		double num1 = s.nextDouble();
		System.out.println("Enter second number:");
		double num2 = s.nextDouble();
		switch (option) {
		case 1:
			double sum = num1 + num2;
			System.out.println("Result: " + sum);
			break;
		case 2:
			double difference = num1 - num2;
			System.out.println("Result: " + difference);
			break;
		case 3:
			double product = num1 * num2;
			System.out.println("Result: " + product);
			break;
		default:
			double quotient = num1 / num2;
			System.out.println("Result: " + quotient);
			break;
		}
	}

	/**
	 * 16. WAP to print 7 days of a week using switch.(a for Sunday,..., f for
	 * Friday, default for Saturday)
	 */
	private static void program16() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a letter from a to f: ");
		String character = s.next();
		switch (character) {
		case "a":
			System.out.println("Sunday");
			break;
		case "b":
			System.out.println("Monday");
			break;
		case "c":
			System.out.println("Tuesday");
			break;
		case "d":
			System.out.println("Wednesday");
			break;
		case "e":
			System.out.println("Thursday");
			break;
		case "f":
			System.out.println("Friday");
			break;
		default:
			System.out.println("Saturday");
			break;
		}
		s.close();
	}

}
