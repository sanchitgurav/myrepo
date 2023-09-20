/**
 * Java switch case program to take name and marks of 10 students as input and display there grades according to these conditions:
 * If marks above 90 then A grade
 * If marks between 90-80 then B grade
 * If marks between 80-70 then C grade
 * If marks between 70-60 then D grade
 * Else E grade 
 */

package Basics;

import java.util.Scanner;

public class StudentGrade {

	public static char calGrade(int marks) {
		if (marks > 90) {
			return 'A';
		} else if (marks <= 90 || marks >= 80) {
			return 'B';
		} else if (marks <= 80 || marks >= 70) {
			return 'C';
		} else if (marks <= 70 || marks >= 60) {
			return 'D';
		} else {
			return 'E';
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numberOfStudents = 10, marks;
		String[] studentNames = new String[numberOfStudents];
		char[] grades = new char[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter name of student " + (i + 1) + ": ");
			studentNames[i] = s.nextLine();
			System.out.println("Enter marks of " + studentNames[i] + ": ");
			marks = s.nextInt();
			s.nextLine();
			switch (calGrade(marks)) {
			case 'A':
				grades[i] = 'A';
				break;
			case 'B':
				grades[i] = 'B';
				break;
			case 'C':
				grades[i] = 'C';
				break;
			case 'D':
				grades[i] = 'D';
				break;
			case 'E':
				grades[i] = 'E';
				break;
			default:
				System.out.println("Invalid entry");
			}
		}
		s.close();
		System.out.println("Grades of students are: ");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Grades of " + studentNames[i] + ": " + grades[i]);
		}
	}

}
