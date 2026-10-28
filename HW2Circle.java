//********************************************************************
// Class: HW2Circle
// Author: Keith Garfield
// Created: Sep 25, 2025
// Modified: n/a
//
// Purpose: Sample class used for course HW assignment 2
//
// Attributes:
//     xLoc: double -- x-location of center of circle
//     yLoc: double -- y-location of center of circle
//     radius: double -- radius of circle. 
//
// Methods (setters and getters not listed): 
//     printCircleAttributes(): void -- prints the xLoc, yLoc, and 
//                              radius of the circle on a single line. 
//
//********************************************************************



public class HW2Circle {
	private double xLoc;
	private double yLoc;
	private double radius;
	
	//***** Constructor Variations *****
	public HW2Circle() {
		xLoc = 0.0;
		yLoc = 0.0;
		radius = 0.0;
	}
	
	public HW2Circle( double newX, double newY, double newRadius) {
		xLoc = newX;
		yLoc = newY;
		radius = newRadius;
	}
	
	//***** Methods *****
	public void printCircleAttributes() {
		System.out.println("x-location " + xLoc + "; y-location = " + yLoc + "; radius = " + radius + ".");
	}
	
	//***** Setters and getters *****
	public void setXLoc( double newX) {
		xLoc = newX;
	}

	public void setYLoc( double newY) {
		yLoc = newY;
	}
	
	public void setRadius( double newRadius) {
		radius = newRadius;
	}
	
	public double getXLoc() {
		return xLoc;
	}
	
	public double getYLoc() {
		return yLoc;
	}
	
	public double getRadius() {
		return radius;
	}	
	
}