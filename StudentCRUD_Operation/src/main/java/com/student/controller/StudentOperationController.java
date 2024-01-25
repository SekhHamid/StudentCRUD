package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.IStudentMgmtService;


@RestController
public class StudentOperationController {
	@Autowired
	private IStudentMgmtService service;

	//Select Query
	@GetMapping("/select")
	public ResponseEntity<?> showEmployeeReport() {
		return new ResponseEntity<>(service.getAllStudent(),HttpStatus.OK);
	}
	
	//Insert Query
	@PostMapping("/insert")
	public ResponseEntity<String> addStudent(@RequestBody Student stud) {
		return new ResponseEntity<>(service.addStudent(stud),HttpStatus.CREATED);
	}
	
	//Delete Query
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestParam("rollNo")int rollNo) {
		return new ResponseEntity<>(service.deleteStudent(rollNo),HttpStatus.OK);
	}
	
	//Update Query
	@PostMapping("/update")
	public ResponseEntity<String> editEmployee(@RequestBody Student stud) {
		return new ResponseEntity<>(service.editStudent(stud),HttpStatus.OK);
	}
	
	//select a particular Student
	@PostMapping("/getStudent")
	public ResponseEntity<?> getStudentByROll(@RequestParam("rollNo") int rollNo) {
		return new ResponseEntity<>(service.getStudentByRollNo(rollNo),HttpStatus.OK);
	}
	
	
}
