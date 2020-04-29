package com.cg.iter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.dao.StudentDao;
import com.cg.iter.entity.Student;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sDao;
	public StudentServiceImpl() {
		System.out.println(sDao);
	}
	public Boolean create(Student stud) {
		
		return sDao.create(stud);
	}
	public Boolean update(Student stud) {
		
		return sDao.update(stud);
	}
	public Student getStudent(int id) {
		
		return sDao.getStudent(id);
	}
	public Boolean delete(Student stud) {
		
		return sDao.delete(stud);
	}

}
