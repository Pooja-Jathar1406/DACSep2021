package com.pooja.conn;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
	private static final String DRIVER_CLASS ="com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/adv_java?useSSL=false";
	private static final String USER_NAME ="root";
	private static final String PASSWORD ="pooja123"; 
	private Connection con;
	
	public Connection getConn() throws ClassNotFoundException, SQLException {
		//if connection is nt present or it is closed , in both the cases new conn shd return
		if(con==null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			con=DriverManager.getConnection(URL,USER_NAME,PASSWORD );
		}
		return con;
	}
}
