package ModuleQues;

import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) {
		program1();
		System.out.println();
		program2();
		System.out.println();
		program3();
		System.out.println();
		program4();
		System.out.println();
		program5();
		System.out.println();
		program6();
	}

	/** 1. WAP to swap two integer values using third variable. */
	private static void program1() {
		System.out.println("Swapping using third variable:");
		int x = 10;
		int y = 20;
		int temp;
		System.out.println("Values of x & y before swapping:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("Values of x & y after swapping:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	/** 2. WAP to swap two integer values without using third variable. */
	private static void program2() {
		System.out.println("Swapping without using third variable:");
		int x = 10;
		int y = 20;
		System.out.println("Values of x & y before swapping:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		x = x + y; // 30
		y = x - y; // y=30-20=10
		x = x - y; // x=30-10=20
		System.out.println("Values of x & y after swapping:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	/** 3. WAP to convert temperature degree Centigrade to degree Fahrenheit. */
	private static void program3() {
		double c = 100;
		System.out.println("Temperature in Centrigrade is " + c);
		double f = (c * 9 / 5) + 32;
		System.out.println("Temperature converted to Fahrenheit: " + f);

	}

	/** 4. WAP to calculate area and perimeter of circle, square and rectangle. */
	private static void program4() {
		Scanner s = new Scanner(System.in);
		double radius = 10, side = 10, length = 10, breadth = 20;
		System.out.println("Radius of Circle is " + radius);
		System.out.println("Side of Square is " + side);
		System.out.println("Length of Rectanle is " + length);
		System.out.println("Breadth of Rectangle is " + breadth);
		System.out.println("==========================================");
		System.out.println("Finding Area and Perimeter of above shapes:");
		System.out.println("==========================================");
		double areaOfCicle = 3.14 * radius * radius;
		System.out.println("Area of Circle: " + areaOfCicle);
		double perimeterOfCicle = 2 * 3.14 * radius;
		System.out.println("Perimeter of Circle: " + perimeterOfCicle);
		double areaOfSq = side * side;
		System.out.println("Area of Square: " + areaOfSq);
		double perimeterOfSq = 4 * side;
		System.out.println("Perimeter of Square: " + perimeterOfSq);
		double areaOfRect = length * breadth;
		System.out.println("Area of Rectangle: " + areaOfRect);
		double perimeterOfRect = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle: " + perimeterOfRect);

	}

	/** 5. WAP to check the entered year is “Leap year” or “not Leap year”. */
	private static void program5() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year to check if it is a leap year or not:");
		double year = s.nextDouble();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("It is a Leap year");
		} else {
			System.out.println("It is not a Leap year");
		}
		s.close();
	}

	/**
	 * 6. WAP to calculate the total salary of an employee, where the basic salary
	 * of employee is 10,000 and TA is 10%,DA is 20% and HRA is 30% of basic salary.
	 */
	private static void program6() {
		int basicSalary = 10000;
		System.out.println("Employee's Basic Salary is " + basicSalary);
		double ta = basicSalary * 0.1;
		double da = basicSalary * 0.2;
		double hra = basicSalary * 0.3;
		double totalSalary = basicSalary + da + hra + ta;
		System.out.println("TA Allowance: " + ta);
		System.out.println("DA Allowance: " + da);
		System.out.println("HRA Allowance: " + hra);
		System.out.println("Total Salary of Employee: " + totalSalary);
	}

}
