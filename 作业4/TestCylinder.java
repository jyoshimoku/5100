package hw4;

import java.security.PublicKey;

class Circle {
	
	double radius;
	String color;
	double areaOfCircle;
	public double getRadius () {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	//calculate the area of circle
	public double getArea() {
		
		areaOfCircle= Math.PI*(radius*radius);
		
		return areaOfCircle;
	}
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public Circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	
	
}	
	
	

class Cylinder extends Circle{

	double height,volume;
	
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getVolume() {
		volume=super.getArea()*height;
		
		return volume;
	}
	
	public  Cylinder() {
		
	}
	
	public  Cylinder(double height) {
		this.height=height;
	}
	
	public  Cylinder(double height,double radius) {
		this.height=height;
		this.radius=radius;
}
	
	public  Cylinder(double height,double radius, String color) {
		this.height=height;
		this.radius=radius;
		this.color=color;
	}
	// Override the getArea() method inherited from superclass Circle
	/*
	 * @Override public double getArea() { double
	 * area=2*Math.PI*radius*(radius+height); return area; }
	 */
}





public class TestCylinder {

	public static void main(String[] args) {
		
		   
	      
		//Constructed a Circle with Circle()
		Circle a = new Circle(2.0, "yellow");
		//Constructed a Cylinder with Cylinder(height, radius)
		Cylinder b = new Cylinder(1.0,1.0,"red");
		Cylinder c =new Cylinder(5.0, 2.0, "red");
		//Radius is 2.0, Color is yellow, Base area is (your answer)
		System.out.println(String.format("Radius is %f, Color is %s, Base area is (%f)",a.getRadius(),a.getColor(),a.getArea()));
		
		//Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)
	    System.out.println(String.format("Radius is %f, Height is %f, Color is %s, Base area is (%f), Volume is (%f) ",b.getRadius(),b.getHeight(),b.getColor(),b.getArea(),b.getVolume()));
	    
	    //Compute the surface area of the cylinder
	    //System.out.println(String.format("Radius is %f, Height is %f, Color is %s, Surface area is (%f) ",b.getRadius(),b.getHeight(),b.getColor(),b.getArea()));
	    		
	    //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
	    System.out.println(String.format("Radius is %f, Height is %f, Color is %s, Base area is (%f), Volume is (%f) ",c.getRadius(),c.getHeight(),c.getColor(),c.getArea(),c.getVolume()));
	    
	    //Compute the surface area of the cylinder
	    //System.out.println(String.format("Radius is %f, Height is %f, Color is %s, Surface area is (%f) ",c.getRadius(),c.getHeight(),c.getColor(),c.getArea()));
	
	}
	
}
