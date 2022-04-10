package com.pgr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//Registering Database driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");//creating connection object
		
		if(conn!=null){
			Statement st = conn.createStatement();//creating statement object
			//int empid = 101;
			//String selectQuery = "select * from emp where empid="+empid;//
			//String updateQuery = "update emp set salary=8000,name='Mahesh' WHERE empid=101;";
			String insertQuery = "insert into emp values(104,'Shiva',7000);";
			//String deleteQuery = "delete from emp where empid=102";

			int i = st.executeUpdate(insertQuery);
			if(i==1){
				System.out.println("Updated");
			}else{
				System.out.println("Not Updated");
			}
			/*ResultSet results = st.executeQuery(selectQuery);//executing query
			while (results.next()) {
				System.out.println(results.getInt(1) + " : " + results.getString(2) + " : " + results.getInt(3));
			}*/
			conn.close();//close the connection
		}else{
			System.out.println("Not Connnected");
		}
		
		
	}
}
