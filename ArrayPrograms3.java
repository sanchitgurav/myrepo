package ModuleQues;

import java.util.Scanner;

public class ArrayPrograms3 {

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
	 * WAP to insert 7 integer values in an array and store even/odd numbers in
	 * different two arrays.
	 */
	private static void program9() {
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
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < 7; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];
		int x = 0, y = 0;
		for (int i = 0; i < 7; i++) {
			if (array[i] % 2 == 0) {
				evenArray[x] = array[i];
				x++;
			} else {
				oddArray[y] = array[i];
				y++;
			}
		}
		System.out.println("Even values in the array: ");
		for (int value : evenArray) {
			System.out.println(value);
		}
		System.out.println("Odd values in the array: ");
		for (int value : oddArray) {
			System.out.println(value);
		}
	}

	/**
	 * WAP to insert 10 integer values and count all prime numbers and its values.
	 */
	private static void program10() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter 10 integers values in the array:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter value at " + (i + 1) + ": ");
			array[i] = s.nextInt();
		}
		System.out.println("Values in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		int primeCount = 0;
		for (int i = 0; i < 10; i++) {
			int flag = 0;
			if (array[i] <= 1) {
				flag = 1;
			} else {
				for (int j = 2; j <= array[i] / 2; j++) {
					if (array[i] % j == 0) {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0) {
				primeCount++;
				int[] primeArray = new int[primeCount];
				int x = 0;
				for (int k = 0; k < primeCount; k++) {
					primeArray[x] = array[k];
					x++;
				}
				System.out.println("Prime numbers in the array:");
				for (int value : primeArray) {
					System.out.println(value);
				}
			}
		}
		System.out.println("Number of prime numbers in the array: " + primeCount);
	}

	/**
	 * WAP to accept and categorize 20 employees in the age group of 22-30, 31-40,
	 * 41-50, 51-60
	 */
	private static void program11() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[20];
		System.out.println("Enter ages of 20 employees in the array:");
		for (int i = 0; i < 20; i++) {
			System.out.print("Enter age of employee " + (i + 1) + ": ");
			array[i] = s.nextInt();
		}
		System.out.println("Employee ages in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		int ageGroup1Count = 0, x1 = 0;
		int ageGroup2Count = 0, x2 = 0;
		int ageGroup3Count = 0, x3 = 0;
		int ageGroup4Count = 0, x4 = 0;
		for (int i = 0; i < 20; i++) {
			if (array[i] >= 22 && array[i] <= 30) {
				ageGroup1Count++;
			} else if (array[i] >= 31 && array[i] <= 40) {
				ageGroup2Count++;
			} else if (array[i] >= 41 && array[i] <= 50) {
				ageGroup3Count++;
			} else if (array[i] >= 51 && array[i] <= 60) {
				ageGroup4Count++;
			}
		}
		int[] ageGroup1 = new int[ageGroup1Count];
		int[] ageGroup2 = new int[ageGroup2Count];
		int[] ageGroup3 = new int[ageGroup3Count];
		int[] ageGroup4 = new int[ageGroup4Count];
		for (int i = 0; i < 20; i++) {
			if (array[i] >= 22 && array[i] <= 30) {
				ageGroup1[x1] = array[i];
				x1++;
			} else if (array[i] >= 31 && array[i] <= 40) {
				ageGroup2[x2] = array[i];
				x2++;
			} else if (array[i] >= 41 && array[i] <= 50) {
				ageGroup3[x3] = array[i];
				x3++;
			} else if (array[i] >= 51 && array[i] <= 60) {
				ageGroup4[x4] = array[i];
				x4++;
			}
		}
		System.out.println("Catergorizing employees according to age group:");
		System.out.println("Employees in age group 22-30:");
		for (int value : ageGroup1) {
			System.out.println(value);
		}
		System.out.println("Employees in age group 31-40:");
		for (int value : ageGroup2) {
			System.out.println(value);
		}
		System.out.println("Employees in age group 41-50:");
		for (int value : ageGroup3) {
			System.out.println(value);
		}
		System.out.println("Employees in age group 51-60:");
		for (int value : ageGroup4) {
			System.out.println(value);
		}
	}

	/**
	 * WAP to accept salary of 20 employees and find out people who are earning more
	 * than rupees 50000 per month.
	 */
	private static void program12() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[20];
		System.out.println("Enter salaries of 20 employees in the array:");
		for (int i = 0; i < 20; i++) {
			System.out.print("Enter salary of employee " + (i + 1) + ": ");
			array[i] = s.nextInt();
		}
		System.out.println("Employee salaries in the array are:");
		for (int value : array) {
			System.out.println(value);
		}
		int salaryCount = 0;

		for (int i = 0; i < 20; i++) {
			if (array[i] >= 50000) {
				salaryCount++;
			}
		}
		System.out.println("Number of employees with salaries more than 50000: " + salaryCount);
		s.close();
	}

}
