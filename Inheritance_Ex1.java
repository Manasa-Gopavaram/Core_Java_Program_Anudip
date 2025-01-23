package ANP_D0453.com;

/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and
a method called "honk".
Create an object of the
Car class and call both the "drive" and "honk" methods.*/

//parent class 
class Vehicle{
	
	//Attributes
	String brand ="Audi";
	String model="Q5";
	int year=2024;

	// Method to drive
	public void drive()
	{
		System.out.println("This " +brand+" "+model+" "+year+  " is driving. " );
	}
}

//child class
class Car extends Vehicle{

	//Additional attribute 
	String color="Gray";

	//Method to honk
	public void honk()
	{
		System.out.println( "The " +color + " " +brand+ " " +model+" honks.");
	}

}
public class Inheritance_EX1 {

	public static void main(String[] args) {
		// Create an object of the car class
		Car obj = new Car();
		// Call both the drive and honk methods
		obj.drive();
		obj.honk();

	}

}


/*
This Audi Q5 2024 is driving. 
The Gray Audi Q5 honks.
*/