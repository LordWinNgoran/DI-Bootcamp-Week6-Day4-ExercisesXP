//Exercise 3 : Area Of Two Rectangles
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a program to print the area of two rectangles having sides (4,5) and (5,8)
*  respectively by creating a class named Rectangle with a method named Area which returns 
*  the area and length and breadth passed as parameters to its constructor
* date: 03/02/2023
*/
package atos;

public class Rectangle {
	 private double width;
	    private double height;
	    
	    public Rectangle() {
	        this.width = 4;
	        this.height = 5;
	    }
	    
	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    public double getArea() {
	        return this.height * this.width;
	    }
}
