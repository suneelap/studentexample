package com.oops.oopsProg1;

import java.util.Scanner;

import com.oops.oopsProg1.models.CheckValueType;
import com.oops.oopsProg1.models.Student;
import com.oops.oopsProg1.services.StudentServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*
    	Scanner input = new Scanner(System.in);
    	System.out.println("enter student name");
    	String name= input.nextLine();
    	System.out.println("enter student id");
    	int id= input.nextInt();    
    	Scanner input1 = new Scanner(System.in);
    	System.out.println("enter student grade");
    	String grade= input1.nextLine();
    	System.out.println("enter student book ");
    	String book= input1.nextLine();
    	System.out.println("registration process");
    	String registration=input1.nextLine();
    	
    	StudentServices studentServices = new StudentServices();
    	Student myStudent = studentServices.studentDetails(name, id, grade, book, registration);
    	
    	System.out.println(studentServices.registration(myStudent));
    	System.out.println(studentServices.read(myStudent));
    	System.out.println(studentServices.write(myStudent));
    	
    	CHECK VALUE TYPE
    	int studentQuantity1 =2; // int , string ,double (java provided us , the value remain the same)
    	int studentQuantity2 = 1;
    	
    	StudentServices newStudent = new StudentServices();
   
    	StudentServices.add(studentQuantity1,studentQuantity2);
    	
    	System.out.println("StudentQuantity1" +" " + studentQuantity1);
    	System.out.println("StudentQuantity2" + " "+ studentQuantity2);
    	
    	String x = "outside  the method v1";
    	String y = "outside the method v2 ";
    			
    	StudentServices.addString(x ,y);
    	System.out.println("v1 :" + x);
    	System.out.println("v2 :" + y); */
    	
    	//CHECK REFERENCE TYPE
    	CheckValueType myValueObject = new CheckValueType();
    	myValueObject.setStudentQuantity1(2);
    	myValueObject.setStudentQuantity2(1);
    	
    	StudentServices.add(myValueObject);
    	System.out.println("studentQuantity1 :" + myValueObject.getStudentQuantity1());
    	System.out.println("studentQuantity2 :" + myValueObject.getStudentQuantity2());



    }
}

