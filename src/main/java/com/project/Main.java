package com.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String Continue = "y";
		String Id = "";
		Scanner scanner = new Scanner(System.in);

		while (Continue.toUpperCase().equals("Y")) {

			System.out.print("What length password do you require? ");

			String lengthS = scanner.next();
			int length = Integer.parseInt(lengthS);
			RandomId randomId = new RandomId();

			Id = randomId.generate(length);

			System.out.println("Here is a "+length+" character pasword: " + Id);

			System.out.print("Do you want another password? Y/N: ");
			Continue = scanner.next();
		}
		scanner.close();
		System.out.println("Thank you come again!");

	}
}
