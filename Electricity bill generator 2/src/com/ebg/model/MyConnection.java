package com.ebg.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection buildConnection() throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricitybill","root", "Pravendra12");
		 return con;
		
	}

}
