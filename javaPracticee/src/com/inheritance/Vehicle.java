package com.inheritance;

class Vehicle {
	  protected String brand = "Ford";
	  public void honk() {
	    System.out.println("Tuut, tuut!");
	  }
	}

class Car extends Vehicle{
	private String modelName = "Mustang"; // Car attribute

	public static void main(String[] args) {

		// Create a myCar object
		Car myFastCar = new Car();

		// Call the honk() method (from the Vehicle class) on the myCar object
		myFastCar.honk();

		// Display the value of the brand attribute (from the Vehicle class) and the
		// value of the modelName from the Car class
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
}
