package com.pooja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pooja.conn.MyConn;
import com.pooja.model.User;

public class UserDaoImpl implements UserDao{
	private MyConn myConn;
	
	public UserDaoImpl() {
		myConn = new MyConn();
	}
	
	@Override
	public void save(User user) {
		try {
			Connection con= myConn.getConn();
			PreparedStatement s= con.prepareStatement("insert into User(UName,UPass,Email,Mobile) values(?, ?,?,?)");
			s.setString(1, user.getUname());
			s.setString(2, user.getUpass());
			s.setString(3, user.getEmailId());
			s.setString(4, user.getMobile());
			
			int i=s.executeUpdate();
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean login(User user) {
		boolean flag =false;
		try {
			Connection con= myConn.getConn();
			PreparedStatement s= con.prepareStatement("select * from user where UName=? and UPass=?");
			
			s.setString(1, user.getUname());
			s.setString(2, user.getUpass());
			
			ResultSet rs=s.executeQuery();
			
			if(rs.next()) {
				flag=true;
			} 
			s.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void upload(int uid, String image) {
		// TODO Auto-generated method stub
		
	}

		
}
