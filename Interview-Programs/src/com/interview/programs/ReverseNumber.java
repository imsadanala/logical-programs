package com.interview.programs;

/**
 * @author Suresh Sadanala
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {

		int orgNum = 12345, revNum = 0, remainder = 0;
		System.err.println("Original number " + orgNum);
		while (orgNum != 0) {
			remainder = orgNum % 10;
			revNum = revNum * 10 + remainder;
			orgNum = orgNum / 10;
		}
		System.err.println("Reversed number " + revNum);
	}
}
