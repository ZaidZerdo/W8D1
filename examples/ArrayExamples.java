package examples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {

	public static void example1() {
		Integer[] array = {5, 3, -3, 4, 5};
		
		for (Integer element : array) {
			element = 1;
			System.out.println(element);
		}
		
		for (int element : array) {
			System.out.println(element);
		}
		
		String[] array1 = {"AB", "CD", "EF"};
		for (String s : array1) {
			System.out.println(s);
		}
	}
	
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	// varargs
	public static void printAllNumbers(int i, int...array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = new int[]{1, 2, 3, 4, 5};
	
		//printArray(new int[]{1, 2, 3, 4, 5});
	
		printAllNumbers(2, 5, 3, 4, 1);
	}

}
