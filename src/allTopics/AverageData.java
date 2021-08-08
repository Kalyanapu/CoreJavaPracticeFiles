package allTopics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageData {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the numbers you want to calculate:");
			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();

				float avg = (a + b + c) / 3;
				float avg1 = (d + e) / 2;
				System.out.println("The avg values of first three entered numbers:" + avg);

				System.out.println("The avg value of last two entered numbers:" + avg1);

				if (avg > avg1) {
					System.out.println("The avg values of first three numbers are greater");
				} else {
					System.out.println("The last two values average is  greater");
				}
				System.out.println("This application is developed by Naveen kumar.k");
			} catch (InputMismatchException e) {
				System.out.println("please enter the valid input");
				e.printStackTrace();
			}

		}
	}

}
