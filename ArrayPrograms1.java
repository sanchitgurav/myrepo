package ModuleQues;

import java.util.Scanner;

public class ArrayPrograms1 {

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
	 * WAP to insert 7 integer values in 1D array and print them.
	 */
	private static void program1() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[7];
		System.out.println("Enter 7 integers values in the array:");
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter value at " + (i + 1) + ": ");
			array[i] = s.nextInt();

		}
		System.out.println("Values in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
	}

	/**
	 * WAP to take two 1D array of length five and insert integer values in each.
	 * Take a third 1D array that shows the output of addition of first two arrays.
	 */
	private static void program2() {
		System.out.println("Addition of two 1D arrays:");
		Scanner s = new Scanner(System.in);
		int[] array1 = new int[5];
		System.out.println("Enter 5 interger values in first array:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter value at " + (i + 1) + ": ");
			array1[i] = s.nextInt();

		}
		System.out.println("Values in first array are:");
		for (int value : array1) {
			System.out.println(value);
		}
		int[] array2 = new int[5];
		System.out.println("Enter 5 interger values in second array:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter value at " + (i + 1) + ": ");
			array2[i] = s.nextInt();
		}
		System.out.println("Values in second array are:");
		for (int value : array2) {
			System.out.println(value);
		}
		int[] array3 = new int[5];
		for (int i = 0; i < 5; i++) {
			array3[i] = array1[i] + array2[i];
		}
		System.out.println("Values in third array after addition of first and second array are:");
		for (int value : array3) {
			System.out.println(value);
		}
	}

	/**
	 * WAP to take two 2D array of length five and insert integer values in each.
	 * Take a third 2D array that shows the output of addition of first two arrays.
	 */
	private static void program3() {
		System.out.println("Addition of two 2D arrays:");
		Scanner s = new Scanner(System.in);
		int[][] array1 = new int[5][1];
		System.out.println("Enter 5 interger values in first array:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("Enter value at [" + i + "][" + j + "]: ");
				array1[i][j] = s.nextInt();
			}
		}
		System.out.println("Values in first array are:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(array1[i][j]);
			}
		}
		int[][] array2 = new int[5][1];
		System.out.println("Enter 5 interger values in second array:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("Enter value at [" + i + "][" + j + "]: ");
				array2[i][j] = s.nextInt();
			}
		}
		System.out.println("Values in second array are:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(array2[i][j]);
			}
		}
		int[][] array3 = new int[5][1];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		System.out.println("Values in third array after addition of first and second array are:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(array3[i][j]);
			}
		}
	}

	/**
	 * WAP to multiply two matrices of type 3x3 and print the appropriate output.
	 */
	private static void program4() {
		System.out.println("Multiplication of two 3x3 matrices:");
		Scanner s = new Scanner(System.in);
		int[][] array1 = new int[3][3];
		System.out.println("Enter values in first matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter value at [" + i + "][" + j + "]: ");
				array1[i][j] = s.nextInt();
			}
		}
		System.out.println("Values in first matrix are:");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		int[][] array2 = new int[3][3];
		System.out.println("Enter values in second matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter value at [" + i + "][" + j + "]: ");
				array2[i][j] = s.nextInt();
			}
		}
		System.out.println("Values in second matrix are:");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		int[][] array3 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					array3[i][j] = array3[i][j] + array1[i][k] * array2[k][j];
				}
			}
		}
		System.out.println("Values in third matrix after multiplication of first & second matrix are:");
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		s.close();
	}

}
