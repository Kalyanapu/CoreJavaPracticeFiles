package multiThreading;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		
		if(age<=18) {
			throw new InvalidAgeException("You are not eligible to vote.");
			
		}else {
			System.out.println("your are eligible to vote.......");
		}

	}

}
