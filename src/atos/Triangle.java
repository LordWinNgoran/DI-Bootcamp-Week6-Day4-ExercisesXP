//Exercise 2 : Perimeter Of A Triangle
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a program to print the area and perimeter of a triangle having 
* sides of 3, 4 and 5 units by creating a class named Triangle without any parameter 
* in its constructor.
* date: 03/02/2023
*/

package atos;

public class Triangle {
	private double firstSide;
    private double secondSide;
    private double thirdSide;
    
    public Triangle() {
        this.firstSide = 3;
        this.secondSide = 4;
        this.thirdSide = 5;
    }
    
    public void getPerimeter() {
        System.out.println(this.firstSide + this.secondSide + this.thirdSide);
    }
    
  

}
