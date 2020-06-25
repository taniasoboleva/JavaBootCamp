package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I  {
	
	//Attributes
	private int salary;
	private String title;
	private String name;
	private int age;
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I(){ 
		System.out.println("I'm Student_I constructor"); 
	}
	
	// write getter for int salary
	public double getSalary() {
		return salary ;
	}
	
	// write setter for int salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// write getter for String title
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
	this.title = title;
}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		
		public int getAge() {
			return age;
		}

		
// write setter for int age
			public void setAge(int age) {
				this.age = age;
			}	
			
}