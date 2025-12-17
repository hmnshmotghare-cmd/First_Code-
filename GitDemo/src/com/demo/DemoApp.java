package com.demo;

public class DemoApp {
	public static void main(String[] args) {
		class Car{
			String model;
			String color;
			int model_id;
			
		void Auto(){
			System.out.println("Car is Running");
			System.out.println("Car model is: " + model);
			System.out.println("Car color is: " + color);
			System.out.println("Car model_id is: " + model_id);
			

		}
		}
		Car C1 = new Car();
		
		C1.model = "BMW";
		C1.color = "Black";
		C1.model_id = 0217;
		C1.Auto();
		
	}
	
	


}
