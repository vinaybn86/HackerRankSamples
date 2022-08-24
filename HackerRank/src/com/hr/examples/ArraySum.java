package com.hr.examples;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();
		
		int[] intArray = new int[arraySize];
		
		for (int i =0; i<arraySize;i++) {
			intArray[i] = in.nextInt();
		}
		
		arraySum(arraySize,intArray);

	}

	private static void arraySum(int arraySize, int[] intArray) {
		
		int sum=0;
		
		for (int i =0; i<arraySize;i++) {
			sum=sum + intArray[i];
		}
		
		System.out.println("Array Sum is:"+ sum);
		
	}

}
