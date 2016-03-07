package base;

import java.lang.Math;

public class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle()
	{
		
	}
	public Triangle(double side1, double side2, double side3) 
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
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
	@Override
	public double getPerimeter() 
	{
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}
	
	public String toString()
	{
		return null;
	}
}