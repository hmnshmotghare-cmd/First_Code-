//Linear Search
package com.demo;
import java.util.Scanner;

public class CheckArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a[] = {10,20,30,50,40};
		System.out.print("Enter your Number :");
		int key = sc.nextInt();
		
		boolean found = false;
		int idx = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == key) {
				found = true;
				idx = i;
				break;
			}
		}
		if(found==true) {
			System.out.print("Key found at index :" +idx);
		}
		else {
			System.out.print("Key not found");
		}
		
		
//		if() {
////			System.out.print("The Number is Present :");
////		}
////		else {
////			System.out.print("The Number is not present :");
////		}


	}

}
