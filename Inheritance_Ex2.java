/*
  Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
  Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and
  a method called "study". 
  Create an object of the Student class and call both
  the "speak" and "study" methods.
*/

package ANP_D0453.com;

//Parent Class
class Person1{
	// Attributes
	String name = "Kalyani";
	int age = 21;

	//Method to speak
	public void speak()
	{
		System.out.println("She is speaking.....");
	}	
}

//Child Class
class Student extends Person1{

	//  Additional attribute of student grade
	String Grade = "Grade A";

	//Method to study
	public void study() {
		System.out.println("Student is studying.....");
		System.out.println("Student Name : "+name );
		System.out.println( "Student Grade: " + Grade);
	}
}

public class Inheritance_Ex2 {

	public static void main(String[] args) {

		// Create an object of the Student class
		Student obj = new Student();

		// Call both the speak and study methods
		obj.speak();
		obj.study();

	}

}


/*
She is speaking.....
Student is studying.....
Student Name : Kalyani
Student Grade: Grade A
*/