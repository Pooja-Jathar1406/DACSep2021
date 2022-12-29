package com.pooja.service;

import java.util.List;

import com.pooja.model.Student;

public interface StudentService {
	void add(Student student);
	List<Student> showStd(int roll);
	void delete(int roll);
	void update(Student student);
}
