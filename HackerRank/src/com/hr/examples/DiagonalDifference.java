package com.hr.examples;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int len = in.nextInt();
		
		int[][] matrix = new int[len][len];
		
		for (int i=0;i<len;i++){
			for(int j=0;j<len;j++) {
				matrix[i][j]= in.nextInt();
			}
		}
		
		int result = diagnolDifference(matrix);
		System.out.println("result"+ result);
		
		in.close();

	}

	private static int diagnolDifference(int[][] matrix) {
		
		int leftSum=0, rightSum =0;
		
		int n = matrix.length;
		
		for(int i=0;i<n;i++) {
			leftSum+=matrix[i][i];
			rightSum+=matrix[i][n-1-i];
		}
		
		System.out.println("leftSum"+ leftSum);
		System.out.println("rightSum"+ rightSum);
		
		int difference = Math.abs(leftSum-rightSum);
		
		return difference;
	}

}
