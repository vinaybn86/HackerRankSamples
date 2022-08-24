package com.hr.examples;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int [] intArray = new int[n];
		
		for (int i=0;i<n;i++) {
			intArray[i] = in.nextInt();
		}
		
		plusMinus(n, intArray);
			
		in.close();

	}

	private static void plusMinus(int n, int[] intArray) {
		
		float postiveCount =0;
		float negativeCount =0;
		float zeroCount =0;
		
		for (int i=0;i<intArray.length;i++) {
			if(intArray[i] > 0) {
				postiveCount++;
			}else if (intArray[i] ==0) {
				negativeCount++;
			}else {
				zeroCount++;
			}
				
		}
		
		
		System.out.printf("%1.6f\n",postiveCount/n);
		System.out.printf("%1.6f\n",negativeCount/n);
		System.out.printf("%1.6f\n",zeroCount/n);
		//System.out.println(postiveCount/n);
		//System.out.println(negativeCount/n);
		//System.out.println(zeroCount/n);
		
	}

}
