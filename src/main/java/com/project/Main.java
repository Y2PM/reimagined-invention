package com.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String Continue = "y";
		String Id = "";
		Scanner scanner = new Scanner(System.in);

		while (Continue.toUpperCase().equals("Y")) {

			System.out.println("What length password do you require? ");

			String lengthS = scanner.next();
			int length = Integer.parseInt(lengthS);
			RandomId randomId = new RandomId();

			Id = randomId.generate(length);

			System.out.println("Here is your "+length+" length pasword: " + Id);

			System.out.println("Do you want another password? Y/N: ");
			Continue = scanner.next();
		}
		scanner.close();
		System.out.println(Continue + "? Thakyou come again!");

	}
}
