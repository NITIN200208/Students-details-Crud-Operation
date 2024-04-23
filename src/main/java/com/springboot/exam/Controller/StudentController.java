package com.springboot.exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exam.Entity.Student;
import com.springboot.exam.Service.StudentService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public String saveStudent(@RequestBody Student students)
	{
		studentService.saveorUpdate(students);
		return students.getStudentname();
	}	
	
	@GetMapping("/getAll")
	public Iterable<Student>getStudents()
	{
		return studentService.listAll();
		
	}
	
	@PutMapping("/edit/{id}")
	public Student update(@RequestBody Student student, @PathVariable(name="id") String _id)
	{
		student.set_id(_id);
		studentService.saveorUpdate(student);
		return student;
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteStudent(@PathVariable("id") String _id)
	{
		studentService.deleteStudent(_id);
	}
	
	@RequestMapping("/search/{id}")
	private Student getStudents(@PathVariable(name="id")  String studentid)
	{
		return studentService.getStudentById(studentid);
		
	}
	

	
		
	
}
