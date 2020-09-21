package com.micda.pfe.eboutique.testdb;

import java.sql.DriverManager;


public class testdb {

	public static void main(String[] args) {
		//String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String jdbcUrl="jdbc:mysql://localhost:3306/dba_name_eboutique";
		String user="hbstudent";
		String pass="hbstudent";
		
		try {
			
			System.out.println("connectiong to db" + jdbcUrl);
			
			DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("Connection Successful");
			
			
			
			
		} catch (Exception exc) {
			
			exc.printStackTrace();
			
		}

	}

}
