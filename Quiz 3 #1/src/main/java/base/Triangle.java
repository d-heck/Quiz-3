package base;

import java.lang.Math;
import base.GeometricObject;

public class Triangle extends GeometricObject {
	
	//Create default triangle sides.
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	//Generate no-arg constructor.
	public Triangle()
	{	
	}
	
	//Generate Triangle Constructor.
	public Triangle(double side1, double side2, double side3) 
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Generate Getters
	public double getSide1() 
	{
		return this.side1;
	}
	public double getSide2() 
	{
		return this.side2;
	}
	public double getSide3()
	{
		return this.side3;
	}
	
	// Obtain the area of the triangle.
	@Override
	public double getArea() 
	{
		double a = side1;
		double b = side2;
		double c = side3;
		double hP = getPerimeter() * .5;
		double Area = Math.sqrt(hP*(hP-a)*(hP-b)*(hP-c));
		return Area;
	}
	
	// Obtain the perimeter of the triangle.
	@Override
	public double getPerimeter() 
	{
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	
	// Return description of triangle. 
	//(I'm not 100% sure how this was expected to be done, but I am just returning any value relating to the triagle.)
	@Override
	public String toString()
	{
		return "Side 1: " + side1 +"\n" + "Side 2: " + side2 + "\n" + "Side 3: " 
	           + side3 + "\n"  + "Perimeter: " + getPerimeter() + "\n" + "Area: " + getArea(); 
	}
}