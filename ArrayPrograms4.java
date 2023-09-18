package ModuleQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class ArrayPrograms4 {

	public static void main(String[] args) {
		program13();
		System.out.println();
		program14();
		System.out.println();
		program15();
		System.out.println();
		program16();
		System.out.println();
		program17();
	}

	/**
	 * WAP to accept names and temperature of 10 cities and find the city which has
	 * the maximum temperature.
	 */
	private static void program13() {
		Scanner s = new Scanner(System.in);
		String[] cityNames = new String[10];
		int[] temperatures = new int[10];

		System.out.println("Enter names of 10 cities in the array:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter name of city " + (i + 1) + ": ");
			cityNames[i] = s.next();
			System.out.print("Enter temperature of " + cityNames[i] + ": ");
			temperatures[i] = s.nextInt();
		}
		System.out.println("Names of cities in the array are:");
		for (String value : cityNames) {
			System.out.println(value);
		}
		System.out.println("Temperatures of cities in the array are:");
		for (int value : temperatures) {
			System.out.println(value);
		}
		int maxTemperature = temperatures[0];
		int maxTemperatureCity = 0;
		for (int i = 0; i < 10; i++) {
			if (temperatures[i] > maxTemperature) {
				maxTemperature = temperatures[i];
				maxTemperatureCity = i;
			}
		}
		System.out.println("Maximum temperature among the cities: " + maxTemperature);
		System.out.println("City which has maximum temperature: " + cityNames[maxTemperatureCity]);
	}

	/**
	 * WAP to accept marks of 10 students in computer application subject and
	 * display the name of the student who has got maximum marks.
	 */
	private static void program14() {
		Scanner s = new Scanner(System.in);
		String[] studentNames = new String[10];
		int[] studentMarks = new int[10];

		System.out.println("Enter names of 10 students in the array:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter name of student " + (i + 1) + ": ");
			studentNames[i] = s.next();
			System.out.print("Enter marks of " + studentNames[i] + " in computer application: ");
			studentMarks[i] = s.nextInt();
		}
		System.out.println("Names of students in the array are:");
		for (String value : studentNames) {
			System.out.println(value);
		}
		System.out.println("Marks of students in the array are:");
		for (int value : studentMarks) {
			System.out.println(value);
		}
		int maxMarks = studentMarks[0];
		int maxMarksStudent = 0;
		for (int i = 0; i < 10; i++) {
			if (studentMarks[i] > maxMarks) {
				maxMarks = studentMarks[i];
				maxMarksStudent = i;
			}
		}
		System.out.println("Maximum marks among the students: " + maxMarks);
		System.out.println("Student who got maximum marks: " + studentNames[maxMarksStudent]);
	}

	/**
	 * Find the highest and smallest number of following array? Int[] arr
	 * ={45,3,6,7,21,5,62,9};
	 */
	private static void program15() {
		int[] arr = { 45, 3, 6, 7, 21, 5, 62, 9 };
		System.out.println("Numbers in the array are:");
		for (int value : arr) {
			System.out.println(value);
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Largest number in the array: " + max);
		System.out.println("Smallest number in the array: " + min);
	}

	/**
	 * WAP to remove duplicates from the following array? Int[] arr
	 * ={2,3,4,5,2,3,3,2,4,5,4,5};
	 */
	private static void program16() {
		int[] arr = { 2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5 };
		System.out.println("Numbers in the array are:");
		for (int value : arr) {
			System.out.println(value);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int value : arr) {
			if (!list.contains(value)) {
				list.add(value);
			}
		}
		int[] uniqueArr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			uniqueArr[i] = list.get(i);
		}
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
		System.out.println();
		System.out.println("Using Set to remove duplicate values:");
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int num : arr) { // adding in list
			set.add(num);
		}
		System.out.println("After removing duplicates, values are: " + set);
	}

	/**
	 * WAP to find number of occurrences from the following array? Int[] arr=
	 * {2,3,4,5,2,3,3,2,4,5,4,5};
	 */
	private static void program17() {
		int[] arr = { 2, 3, 4, 5, 2, 3, 3, 2, 4, 5, 4, 5 };
		System.out.println("Numbers in the array are:");
		for (int value : arr) {
			System.out.println(value);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int value : arr) {
			list.add(value);
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (Integer unqiueValue : set) {
			map.put(unqiueValue, Collections.frequency(list, unqiueValue));
		}
		System.out.println("Number of occurrences of each value in the array are:");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " occures " + entry.getValue() + " times");
		}
	}

}
