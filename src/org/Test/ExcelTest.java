package org.Test;

import java.sql.*;

public class ExcelTest {
	

	public static void main(String[] args) throws Exception {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection
		con= DriverManager.getConnection("jdbcdbc:xlsdsn");
		
		//create the statement 
		Statement st = con.createStatement();
		
		//send & execute the query 
		ResultSet rs=st.executeQuery("select * from [SHeet1$]");
		
		while (rs.next())
		{ 
			System.out.println(rs.getInt(1)+"\t" +rs.getString(3)+"\t" +rs.getString(3));
			
		}
		
		//close the jdbc object 
		
		rs.close();
		st.close();
		con.close();
		
		
		
		
		
		
		
		
		
	}
}