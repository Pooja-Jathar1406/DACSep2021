package com.pooja.dao;

import java.util.List;

import com.pooja.model.Expense;

public interface ExpenseDao {
	
	void save(Expense expense);
	List<Expense> selectAll(int uid);
	void deleteById(int id);
	Expense selectById(int id);
	void update(Expense expense);
}
