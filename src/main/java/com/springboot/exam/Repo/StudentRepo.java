package com.springboot.exam.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.exam.Entity.Student;

public interface StudentRepo extends MongoRepository<Student,String> {

}
