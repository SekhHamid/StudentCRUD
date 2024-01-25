package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface IStudentMgmtService {
	
	public List<Student> getAllStudent();

	public String addStudent(Student stud);

	public String deleteStudent(int rollNo);

	public String editStudent(Student stud);

	public Student getStudentByRollNo(int rollNo);
}
