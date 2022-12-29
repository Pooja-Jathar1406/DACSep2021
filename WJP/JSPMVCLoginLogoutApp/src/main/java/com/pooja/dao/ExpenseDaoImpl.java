package com.pooja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pooja.conn.MyConn;
import com.pooja.model.Expense;

public class ExpenseDaoImpl implements ExpenseDao{
	  
	private MyConn myConn;
	
	public ExpenseDaoImpl() {
		 myConn=new MyConn();
	}

	@Override
	public void save(Expense expense) {
		try {
			Connection con=myConn.getConn();
			String insertQry="insert into Expense(Item,Price,Quantity,Edate,Uid) values(?,?,?,?,?)";
			PreparedStatement s= con.prepareStatement(insertQry);
			s.setString(1, expense.getItem());
			s.setFloat(2, expense.getPrice());
			s.setInt(3, expense.getQuantity());
			s.setString(4, expense.getEdate());
			s.setInt(5, expense.getUid());
			
			int i = s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace();
		} 
		
	}

	@Override
	public List<Expense> selectAll(int uid) {
		List<Expense> lst = new ArrayList<Expense>();
		try {
			Connection con=myConn.getConn();
			String selectQry="select * from expense where uid=?";
			PreparedStatement s= con.prepareStatement(selectQry);
			s.setInt(1, uid);
			
			ResultSet rs= s.executeQuery();
			while(rs.next()) {
				//set the properties to bean object
				Expense expense=new Expense();
				expense.setId(rs.getInt(1));
				expense.setItem(rs.getString(2));
				expense.setPrice(rs.getFloat(3));
				expense.setQuantity(rs.getInt(4));
				expense.setEdate(rs.getString(5));
				expense.setUid(rs.getInt(6));
				
				//store bean obj in list
				lst.add(expense);
			}
			 
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace();
		}
		//return the list created by us 
		return lst; 
	}

	@Override
	public void deleteById(int id) {
		try {
			Connection con=myConn.getConn();
			String deleteQry="delete from expense where id=?";
			PreparedStatement s= con.prepareStatement(deleteQry);
			s.setInt(1,id);
			int i=s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace();
		} 
		
	}

	@Override
	public Expense selectById(int id) {
		Expense expense = new Expense();
		try {
			Connection con=myConn.getConn();
			String selectQry="select * from expense where id=?";
			PreparedStatement s= con.prepareStatement(selectQry);
			s.setInt(1, id);
			
			ResultSet rs= s.executeQuery();
			if(rs.next()) {
				//storing the table data intto exepnse object
				expense.setId(rs.getInt(1));
				expense.setItem(rs.getString(2));
				expense.setPrice(rs.getFloat(3));
				expense.setQuantity(rs.getInt(4));
				expense.setEdate(rs.getString(5));
				expense.setUid(rs.getInt(6));
				
			}
			 
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace();
		}
		//return the expense object 
		return expense; 
	}

	@Override
	public void update(Expense expense) {
		try {
			Connection con=myConn.getConn();
			String updateQry="update expense set item=?, price=?, quantity =?, edate=? where id=?";
			PreparedStatement s= con.prepareStatement(updateQry);
			s.setString(1, expense.getItem());
			s.setFloat(2, expense.getPrice());
			s.setInt(3, expense.getQuantity());
			s.setString(4, expense.getEdate());
			s.setInt(5, expense.getId());
			
			int i = s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace();
		} 
		
	}
	
}
