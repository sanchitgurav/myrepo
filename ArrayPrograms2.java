package ModuleQues;

import java.util.Scanner;

public class ArrayPrograms2 {

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
	 * WAP to insert 6 different integer values in 1D array and find the largest
	 * value and smallest values in array using any kind of sorting.
	 */
	private static void program5() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[6];
		System.out.println("Enter 6 different integers values in the array:");
		for (int i = 0; i < 6; i++) {
			System.out.print("Enter value at " + (i + 1) + ": ");
			array[i] = s.nextInt();
		}
		System.out.println("Values in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < 6; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Largest value in the array: " + max);
		System.out.println("Smallest value in the array: " + min);
	}

	/**
	 * WAP to count the even and odd number between 9 elements of an array.
	 */
	private static void program6() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[9];
		System.out.println("Enter 9 integers values in the array:");
		for (int i = 0; i < 9; i++) {
			System.out.print("Enter value at " + (i + 1) + ": ");
			array[i] = s.nextInt();
		}
		System.out.println("Values in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < 9; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of even values in the array: " + evenCount);
		System.out.println("Number of odd values in the array: " + oddCount);
	}

	/**
	 * WAP to find a particular number entered by user and match this number with
	 * five elements of an array. If number is found then print “found” otherwise
	 * print “Not found”.
	 */
	private static void program7() {
		Scanner s = new Scanner(System.in);
		int[] array = { 1, 2, 4, 5, 6, 9 };
		System.out.println("Values in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int flag = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}

	/**
	 * In program no. 7, if number is found then replace that number by another
	 * number.
	 */
	private static void program8() {
		Scanner s = new Scanner(System.in);
		int[] array = { 1, 2, 4, 5, 6, 9 };
		System.out.println("Values in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int flag = 0;
		int foundNumber = 0;
		int indexOfFoundNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				flag = 1;
				foundNumber = num;
				indexOfFoundNumber = i;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Found");
			System.out.println("Enter a number to replace " + foundNumber + ":");
			int newNumber = s.nextInt();
			array[indexOfFoundNumber] = newNumber;
			System.out.println("Values in the new array after replacement:");
			for (int value : array) {
				System.out.println(value);
			}
		} else {
			System.out.println("Not found");
		}
		s.close();
	}

}
