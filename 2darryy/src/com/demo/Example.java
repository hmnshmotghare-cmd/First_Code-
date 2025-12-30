package com.demo;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Student Present in the Class : ");
//		int n;
		int n = sc.nextInt();
		int mark[] = new int[n];	
		
		
//		mark[0] = 21;
//		mark[1] = 43;
//		mark[2] = 73;
//		mark[3] = 56;
//		mark[4] = 98;
		
//		mark[0] = sc.nextInt();
//		mark[1] = sc.nextInt();
//		mark[2] = sc.nextInt();
//		mark[3] = sc.nextInt();
//		mark[4] = sc.nextInt();
		
		
		for(int i=0;i<mark.length;i++) {
			System.out.print("Enter the marks of Student" +i+": ");
			mark[i] = sc.nextInt();

		}
//		System.out.print("Enter the marks of Student 1:");
//		mark[0] = sc.nextInt();
//		System.out.print("Enter the marks of Student 2:");
//		mark[1] = sc.nextInt();
//		System.out.print("Enter the marks of Student 3:");
//		mark[2] = sc.nextInt();
//		System.out.print("Enter the marks of Student 4:");
//		mark[3] = sc.nextInt();
//		System.out.print("Enter the marks of Student 5:");
//		mark[4] = sc.nextInt();
		
		
		for(int i=0;i<mark.length;i++) {
			System.out.print(mark[i]+" ");
		}
//		System.out.print(mark[0]+" ");
//		System.out.print(mark[1]+" ");
//		System.out.print(mark[2]+" ");
//		System.out.print(mark[3]+" ");
//		System.out.print(mark[4]+" ");
	

	}

}
