package sef.module6.activity;


public class Rectangle extends Shape{
	
		private double lenght;
		private double breadth;
		
		public Rectangle(){ 
			System.out.println("I'm an Rectangle Constructor"); 
		}
		
		public double getLenght() {
			return lenght;
		}

		public void setLenght(int lenght) {
			this.lenght = lenght;
		}

		public double getBreadth() {
			return breadth;
		}

		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
		
		
		@Override
		public double calculateArea() {
			return lenght*breadth;
		}		
		

		@Override
		public double calculatePerimeter() {
			return 2*(lenght+breadth);
		}
}