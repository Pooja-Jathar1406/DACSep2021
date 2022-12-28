package com.pooja.service;

import java.util.List;

import com.pooja.dao.ExpenseDao;
import com.pooja.dao.ExpenseDaoImpl;
import com.pooja.model.Expense;

public class ExpenseServiceImpl implements ExpenseService{

	//to call dao methods a dao object is needed
	private ExpenseDao expenseDao;
	
	public ExpenseServiceImpl() {
		expenseDao = new ExpenseDaoImpl();
	}

	@Override
	public void add(Expense expense) {
		 //call the save method
		expenseDao.save(expense);
		
	}

	@Override
	public List<Expense> getAll(int uid) {
		//call selectAll method from expenseDao
		return expenseDao.selectAll(uid);
	}

	@Override
	public void removeById(int id) {
		expenseDao.deleteById(id);
		
	}

	@Override
	public Expense getById(int id) {
		return expenseDao.selectById(id);
	}

	@Override
	public void modify(Expense expense) {
		expenseDao.update(expense);
		
	}
	
}
