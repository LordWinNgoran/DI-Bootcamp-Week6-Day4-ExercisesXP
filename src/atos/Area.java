//Exercise 4 : Area Of A Rectangle
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a program to print the area of a rectangle by creating a 
* class named Area taking the values of its length and breadth as parameters of 
* its constructor and having a method named returnArea which returns the area of the rectangle. 
* Length and breadth of rectangle are entered through keyboard.
* date: 03/02/2023
*/
package atos;

public class Area {
	//declaration part
	private double length;
    private double breadth;
    
    //constructor with two parameters
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    //method return a double = multiplicity 
    public double returnArea() {
        return this.length * this.breadth;
    }
    public static void main(String[] args) {
    	//We create a new object of Area 
		Area area = new Area(4, 5);
		System.out.println("The Area is : "+area.returnArea());
		
	}
}
