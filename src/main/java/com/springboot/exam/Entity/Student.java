package com.springboot.exam.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Data
@Document(collection="students")
public class Student {
	
	@Id
	private String _id;
	private String studentname;
	private String studentaddress;
	private String moblie;
	
	
}
