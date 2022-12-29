package com.pooja.service;

import java.util.List;

import com.pooja.dao.StudentDao;
import com.pooja.dao.StudentDaoImpl;
import com.pooja.model.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
	
	
	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
	}

	@Override
	public void add(Student student) {
		studentDao.save(student);
		
	}

	@Override
	public List<Student> showStd(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int roll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
	}

}
