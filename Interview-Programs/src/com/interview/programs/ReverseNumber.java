package com.interview.programs;

import java.util.Scanner;

/**
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("resource")
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Please enter a number ");
		int orgNum = scanner.nextInt(), revNum = 0, remainder = 0;
		System.err.println("Original number " + orgNum);
		while (orgNum != 0) {
			remainder = orgNum % 10;
			revNum = revNum * 10 + remainder;
			orgNum = orgNum / 10;
		}
		System.err.println("Reversed number " + revNum);
	}
}
