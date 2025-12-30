package com.demo;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of Class :");
		int n = sc.nextInt();
		
		System.out.print("Enter the Number of Student :");
		int m = sc.nextInt();
		
		int x[][] = new int[n][m];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("Enter the value of X :");
				x[i][j] = sc.nextInt();
				
			}
		}
		
//		x[0][0] = sc.nextInt();
//		x[0][1] = sc.nextInt();
//		x[0][2] = sc.nextInt();
//		x[0][3] = sc.nextInt();
//		x[0][4] = sc.nextInt();
//		
//	
//		x[1][0] = sc.nextInt();
//		x[1][1] = sc.nextInt();
//		x[1][2] = sc.nextInt();
//		x[1][3] = sc.nextInt();
//		x[1][4] = sc.nextInt();
//	
//		x[2][0] = sc.nextInt();
//		x[2][1] = sc.nextInt();
//		x[2][2] = sc.nextInt();
//		x[2][3] = sc.nextInt();
//		x[2][4] = sc.nextInt();
		
//		x[0][0] = 11;
//		x[0][1] = 12;
//		x[0][2] = 13;
//		x[0][3] = 14;
//		x[0][4] = 15;
//	
//		x[1][0] = 21;
//		x[1][1] = 22;
//		x[1][2] = 23;
//		x[1][3] = 24;
//		x[1][4] = 25;
//	
//		x[2][0] = 31;
//		x[2][1] = 32;
//		x[2][2] = 33;
//		x[2][3] = 34;
//		x[2][4] = 34;S
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(x[i][j]+" ");	
			}
			System.out.println(" ");
		}
		
//		System.out.print(x[0][0]+" ");
//		System.out.print(x[0][1]+" ");
//		System.out.print(x[0][2]+" ");
//		System.out.print(x[0][3]+" ");
//		System.out.print(x[0][4]+" ");
//		System.out.println();
//		System.out.print(x[1][0]+" ");
//		System.out.print(x[1][1]+" ");
//		System.out.print(x[1][2]+" ");
//		System.out.print(x[1][3]+" ");
//		System.out.print(x[1][4]+" ");
//		System.out.println();
//		System.out.print(x[2][0]+" ");
//		System.out.print(x[2][1]+" ");
//		System.out.print(x[2][2]+" ");
//		System.out.print(x[2][3]+" ");
//		System.out.print(x[2][4]+" ");
		
		
	}

}
