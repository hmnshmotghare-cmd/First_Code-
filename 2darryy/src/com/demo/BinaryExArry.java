package com.demo;
import java.util.Scanner;

public class BinaryExArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = {10,20,30,40,50,60};
		
		int low = 0;
		int high = a.length-1;
//		write a java program to swap the two array indexed given by a number; 
		int mid = (low+high)/2;
//		System.out.print(mid);
		int idx = 0;
		boolean found = false;
		System.out.print("Enter your Number :");
		int key = sc.nextInt();
		
		while(key>a[mid]) {
			
			if(a[mid] == key) {
				found = true;
				idx = mid;
				break;
			}
			else if(key<a[mid]) {
				high =mid -1;
				mid = (low+ high)/2;
			}
			else {
				low = mid+1;
				mid = (low+high)/2;
			}
			
		}
		if(found==true) {
			System.out.print("Key found at index :" +idx);
		}
		else {
			System.out.print("Key not found");
		}
			
		
	
		
		
		
		
		
	}

}
