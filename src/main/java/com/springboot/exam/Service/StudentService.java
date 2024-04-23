package com.springboot.exam.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.exam.Entity.Student;
import com.springboot.exam.Repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private  StudentRepo repo;

	public void saveorUpdate(Student students) {
		// TODO Auto-generated method stub
		repo.save(students);
		
	}

	public Iterable<Student> listAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();		
	}

	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	public  Student getStudentById(String studentid) {
		// TODO Auto-generated method stub
		return repo.findById(studentid).get();
	}

}
