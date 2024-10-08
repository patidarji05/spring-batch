package com.infybuzz.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.infybuzz.postgressql.entity.Student;

@Component
public class StudentProcesser implements ItemProcessor<Student, com.infybuzz.mysql.entity.Student>{

	@Override
	public com.infybuzz.mysql.entity.Student process(Student item) throws Exception {
		
		System.out.println(item.getId());
		
		com.infybuzz.mysql.entity.Student student= new com.infybuzz.mysql.entity.Student();
		
		student.setId(item.getId());
		student.setFirstName(item.getFirstName());
		student.setLastName(item.getLastName());
		student.setEmail(item.getEmail());
		student.setDeptId(item.getDeptId());
		student.setIsActive(item.getIsActive() != null ?
				Boolean.valueOf(item.getIsActive()): false);
		
		return student;
	}

}
