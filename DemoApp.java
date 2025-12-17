package com.demo;

public class DemoApp {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		
////		Question 1:
//		
//		for(int i=1; i<=5;i++) {
//			System.out.println("*");
//			
//		}
		
//		Question 2:
		
//		for(int k=1;k<=5;k++) {
//			for(int j=0;j<=k;j++) {
//				System.out.print("*");
//			}
//			System.out.println("*");
//			
//		}
//		
//		question 3:
//		for(int k=0;k<=5;k++) {
//			for(int j=0;j<=5;j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println(" ");
//			
//		}
		

//		for(int j=0;j<=5;j++) {
//			System.out.print("*");
//		}
//		System.out.println(" ");
//
//		for(int j=0;j<=5;j++) {
//			System.out.print("*");
//		}
//		System.out.println(" ");
//
//		for(int j=0;j<=5;j++) {
//			System.out.print("*");
//		}
//		System.out.println(" ");
//		for(int j=0;j<=5;j++) {
//			System.out.print("*");
//		}
		
		
		
		
//		Question 4:
//		for(int i=1;i<=5;i++) {
//			System.out.print("*");
//		}
//		for(int i=1;i<=1;i++) {
//			System.out.print("* ");
//		}
		
		
		
//		for(int j=1;j<=5;j+=4) {
//			System.out.print("*");
//			
//		}
		
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

		
		
		
		
	}

}
