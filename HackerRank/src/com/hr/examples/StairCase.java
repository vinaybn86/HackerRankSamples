package com.hr.examples;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		stairCase(n);
		in.close();

	}

	private static void stairCase(int n) {
		
		for(int i = 1; i<=n; i++) { // this is for number of rows
			
			for(int j=0; j<n-i;j++) {
				System.out.print(" "); // no of spaces which is n-i
			}
			
			for(int k=0; k<i;k++) { // no of # symbols equal to row number i
				System.out.print("#");
			}	
			
			System.out.println();
		}
		
	}

}
