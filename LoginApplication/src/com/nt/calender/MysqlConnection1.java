package com.nt.calender;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class MysqlConnection1 {
	Connection con;
	
	public Connection getCon() {
		try {
			
		//Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql:///samiruldb1", "root", "root");
		JOptionPane.showMessageDialog(null, "Database Connection successful in MySQLConnect getcon method");
		return con;
		
		
		
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error in MySQLConnect getcon method"+e);
		}
		
		
		
		
		
		return con;
	}

}
