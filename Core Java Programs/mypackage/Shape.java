package mypackage;

	abstract class Shape {
	    abstract void area();
	}
	class Rectangle extends Shape {
	    int length = 4;
	    int width = 6;

	    void area() {
	        int result = length * width;
	        System.out.println("Area of Rectangle: " + result);
	    }
	}
	

	