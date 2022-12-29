package com.pooja.dao;

import java.util.List;

import com.pooja.model.Student;

public interface StudentDao {
	void save(Student student);
	List<Student> selectAllStd(int roll);
	void deleteById(int roll);
	void updateStd(Student student);
}
