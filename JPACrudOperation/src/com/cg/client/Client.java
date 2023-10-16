package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {
	
	public static void main(String[] args) {
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		//Create
//		student.setStudentId(13);
//		student.setName("Mina");
//		service.addStudent(student);
		
		//Retrieve
//		service.getStudentById(1);
//		System.out.println("Id is: " + student.getStudentId());
//		System.out.println("Name is: " + student.getName());
		
		//Update
//		service.getStudentById(2);
//		student.setName("Sujit Adhav");
//		service.updateStudent(student);
		
		//Delete
//		service.getStudentById(2);
//		service.removeStudent(student);
//		System.out.println("Data is removed");
	}

}
