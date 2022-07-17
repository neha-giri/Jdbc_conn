package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import statement..

//load driver----petrol
//creat connection...keys
//create statement....gear change
//execute statement----race with cluch release
//show result ---reach place
//close connection....stop 

public class DBManager {
	
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/dbtest";
	private String uid="root";
	private String passwd="root";
	
	public void selectRecords() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uid,passwd);
			Statement stmt=con.createStatement();
			ResultSet result = stmt.executeQuery("select * from tbl_student");
			 while(result.next()) {
				 System.out.println("sid="+result.getInt(1));
				 System.out.println("sname="+result.getString(2));
				 System.out.println("student dept="+result.getString(3));
				 System.out.println("student age="+result.getInt(4));
			 }
			 con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//insertion, updation ,deletion
	
	public boolean RecordsManipulation(String query) {
		boolean flag=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uid,passwd);
			Statement stmt=con.createStatement();
			flag = stmt.executeUpdate(query) >0 ? true: false;
			con.close();
			 
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
  
}
