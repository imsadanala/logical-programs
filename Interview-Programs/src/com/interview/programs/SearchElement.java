package com.interview.programs;

/**
 * @author Suresh Sadanala
 *
 */
public class SearchElement {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 1, 6, 2, 9, 3, 5 };
		int searchEle = 11;
		search(array, searchEle);
	}

	/**
	 * 
	 * @param array
	 * @param searchEle
	 */
	private static void search(int[] array, int searchEle) {
		boolean isFound = false;
		int i;
		for (i = 0; i < array.length; i++) {
			if (searchEle == array[i]) {
				isFound = true;
				System.err.println(String.format("%d is found in the array ", searchEle));
				break;
			}
		}
		if (Boolean.FALSE.equals(isFound)) {
			System.err.println(String.format("%d is not found in the array ", searchEle));
		}

	}

}
