//Exercise 1 : Class Named ‘Student’
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a class named Student with String variable name and integer variable roll_no.
* Assign the value of roll_no as 2 and that of name as “John” by creating an object of the 
* class Student.
* date: 03/02/2023
*/

package atos;

public class Student {
	//Declaration part
	private String name;
    private int roll_no;
    
    
	public String show() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}

	// the default constructor
    public Student() {
        
    }
    
    //constructor with two parameters
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    
    
   // we create a object of Student with parameters
   public static void main(String[] args) {
	   Student student = new Student("John", 2);
	   System.out.println(student.show());
}

}
