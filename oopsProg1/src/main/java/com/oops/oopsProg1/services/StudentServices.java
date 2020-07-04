package com.oops.oopsProg1.services;

import com.oops.oopsProg1.models.CheckValueType;
import com.oops.oopsProg1.models.Student;

public class StudentServices {
	
	public String read(Student book) {
		String message= "I am reading this book called " + book.getBook();
		return message;
		
	}

	public String write(Student book) {
		String output= "I am writing in this" + book.getBook();
		return output;
		
	}
	public String registration(Student method) {
		String process = "registration Process " +method.getRegistration();
		return process;
		
	}
	
	
	
	public Student studentDetails(String name, int id ,String grade,String book, String registration ) {
		Student student = new Student();
		student.setName(name);
		student.setId(id);
		student.setGrade(grade);
		student.setBook(book);
		student.setRegistration(registration);
		return student;
			
		
	}
	public static void add(int studentQuantity1, int studentQuantity2) {
		studentQuantity1 =3;
		studentQuantity2 =5;
	}
	
	public static void addString(String v1, String v2) {
		v1="inside the method v1";
		v2="inside the methos v2";
	}
	
	public static void add(CheckValueType valueType) {
		valueType.setStudentQuantity1(3);
		valueType.setStudentQuantity2(12);
	}
	
	public static void addString(CheckValueType valueType) {
		valueType.setV1("inside the method v1");
		valueType.setV2("inside the method v2");
				
	}
}
