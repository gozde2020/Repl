package com.syntax.homework;

import java.util.Scanner;

public class Tasks23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the boolean value");
		boolean answer = scanner.nextBoolean();
		
		if(answer) {
			System.out.println("The value is true");
		} else {
			System.out.println("The value is false");
		}
		
	}

}
