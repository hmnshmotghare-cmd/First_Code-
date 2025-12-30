//JACKED Array
package com.demo;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Please enter the no of classes :");
		int n = sc.nextInt();
		int a[][] = new int[n][];
		
		for(int i=0;i<n;i++) {
			System.out.print("Please enter the no.of student present in the class :"+i+": ");
			int b = sc.nextInt();
			a[i] = new int[b];
		}
		
//		System.out.print("Please enter the no.of student present in the class 0");
//		int b = sc.nextInt();
//		a[0] = new int[b];
//		
//		System.out.print("Please enter the no.of student present in the class 0");
//		b = sc.nextInt();
//		a[1] = new int[b];
//		
//		System.out.print("Please enter the no.of student present in the class 0");
//		b = sc.nextInt();
//		a[2] = new int[b];
		
		System.out.print("");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter the value of X :");
				a[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");	
			}
			System.out.println(" ");
		}
		

	}

}
