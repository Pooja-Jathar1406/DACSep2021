package com.pooja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.pooja.conn.MyConn;
import com.pooja.model.Student;

public class StudentDaoImpl implements StudentDao{
	 
	private MyConn myconn;
	
	public StudentDaoImpl() {
		myconn= new MyConn();
	}

	@Override
	public void save(Student student) {
		try {
			Connection con=myconn.getConn();
			String insertQry="insert into student(Roll, SName, Marks, Std, City) values(?,?,?,?,?)";
			PreparedStatement s = con.prepareStatement(insertQry);
			s.setInt(1, student.getRoll());
			s.setString(2, student.getName());
			s.setFloat(3, student.getMarks());
			s.setString(4, student.getStd());
			s.setString(5, student.getCity());
			
			int i=s.executeUpdate();
			
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {	 
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Student> selectAllStd(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int roll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStd(Student student) {
		// TODO Auto-generated method stub
		
	}

}
