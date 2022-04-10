import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {

	public static void main(String args[]) {
		try {
		//	Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			/*Connection con = DriverManager.getConnection(
					"jdbc:mysql://root@localhost:3306/demo","root","root");*/
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/demo?user=root&password=root"); 

			System.out.println(connection);
			
			String selectProcedure = "{CALL SelectAllEmployees};";
			String insertProcedure = "{CALL InsertEmployee(?,?,?)};";

			CallableStatement callSt = connection.prepareCall(selectProcedure);
			//callSt.setInt(1, 106);
		/*	callSt.setString(2, "Teja");
			callSt.setInt(3, 4000);
			
			boolean i = callSt.execute();
			System.out.println(i);
			if (i == false) {
				System.out.println("Inserted");
			} else {
				System.out.println("Not Inserted");
			}*/
			
			/*
			 * CLOB,BLOB
			 */
			 	
			
			ResultSet results  = callSt.executeQuery();
			while (results.next()) {
				System.out.println(results.getInt(1) + " : " + results.getString(2) + " : " + results.getInt(3));
			}
			//System.out.println(set);
			//System.out.println(callSt);
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
