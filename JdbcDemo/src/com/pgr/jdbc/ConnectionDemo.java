package com.pgr.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");//Registering Database driver
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");//creating connection object
		conn.setAutoCommit(false);
		if(conn!=null){
			//Statement st = conn.createStatement();//creating statement object
			String insertQueryWithPositionParatmeters = "insert into emp values(?,?,?);";
			String updateQueryWithPositionParatmeters = "update emp set salary=? WHERE empid=?;";
			String deleteQueryWithPositionParatmeters = "delete from emp where empid=?";
			String selectQueryWithPositionParatmeters = "select * from emp where empid=?;" ;
			
			
			/*PreparedStatement ps = conn.prepareStatement(insertQueryWithPositionParatmeters);//Positional Parameters
			ps.setInt(1, 104);
			ps.setString(2, "Naga");
			ps.setInt(3, 2000);
*/			//String selectQuery = "select * from emp1";//Select all employee data
		//	String selectOneRecord= "select * from emp where empid=101";//Selecting 1 employee record
			/*ResultSet results = ps.executeQuery();//executing query
			
			while (results.next()) {
				System.out.println(results.getInt("empid") + " : " + results.getString("name") + " : " + results.getInt("salary"));
			}*/
			
			//String updateQuery = "update emp set salary=90000,name='Perla Reddy' WHERE empid=101;";
			//String insertQuery = "insert into emp values(103,'Dhatrika',40000);";
			//String deleteQuery = "delete from emp where empid=103";//
			/*PreparedStatement ps1 = conn.prepareStatement(selectQueryWithPositionParatmeters);//Positional Parameters
			ps1.setInt(1, 104);
			
			ResultSet rs = ps1.executeQuery();
			int empid=0;
			String name = null;
			while(rs.next()){
				empid = rs.getInt(1);
				name = rs.getString(2);
			}
			
			if("Naga"==name){
				int i = ps.executeUpdate();
				System.out.println(i);
				if(i==1){
					System.out.println("Inserted");
					
				}else{
					System.out.println("Not Inserted");
				}
				conn.commit();
			}else{
				System.out.println("Roll Back ");
				conn.rollback();
			}*/
			String selectProcedure = "{CALL SelectAllEmployees};";
			String insertProcedure = "{CALL InsertEmployee(?,?,?)};";
			
			CallableStatement cs = conn.prepareCall(insertProcedure);
			cs.setInt(1, 123);
			cs.setString(2, "Perla Reddy");
			cs.setInt(3, 7000);
			boolean flag = cs.execute();
			System.out.println(flag);
			/*ResultSet results  = cs.executeQuery();
			while (results.next()) {
				System.out.println(results.getInt(1) + " : " + results.getString(2) + " : " + results.getInt(3));
			}*/
			
			conn.commit();
			conn.close();//close the connection
		}else{
			System.out.println("Not Connected");
		}

	}
}
