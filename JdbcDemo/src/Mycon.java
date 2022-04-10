import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mycon {

	public static void main(String args[]) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo","root","root");
			if(con!=null) {
				System.out.println("Connected with : "+con);
			}else {
				System.out.println("Database is not connected");

			}
			//Statement st = con.createStatement();
			//int empid = Integer.parseInt(args[0]);
			int empid = 101;
			String selectQuery = "select * from emp where empid='"+empid+"';" ;
			String insertQuery = "insert into emp values(104,'Shiva',7000);";
			String updateQuery = "update emp set salary=9000 WHERE empid=102;";
			String deleteQuery = "delete from emp where empid=101";
			String insertQueryWithPositionParatmeters = "insert into emp values(?,?,?);";
			String updateQueryWithPositionParatmeters = "update emp set salary=? WHERE empid=?;";
			String deleteQueryWithPositionParatmeters = "delete from emp where empid=?";
			String seelectQueryWithPositionParatmeters = "select * from emp where empid=?;" ;
			
			/*PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
			ps.setString(1,"Reddy");  
			  
			FileInputStream fin=new FileInputStream("D:\\core java ppt\\j1.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  */

			PreparedStatement ps = con
					.prepareStatement("select * from imgtable");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob(2);// 2 means 2nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first
																// image

				FileOutputStream fout = new FileOutputStream("d:\\reddy.jpg");
				fout.write(barr);

				fout.close();
			}
			/*PreparedStatement ps = con.prepareStatement(seelectQueryWithPositionParatmeters);
			ps.setInt(1, 102);*/
		//	ps.setString(2, "PG Reddy");
			//ps.setInt(2, 101);
			
			
		//	int i = st.executeUpdate(deleteQuery);
			/*
			 * int i = ps.executeUpdate();
			 * 
			 * if(i==1) { System.out.println("Inserted"); }else {
			 * System.out.println("Not Inserted"); }
			 */			
			/*ResultSet results = ps.executeQuery();
			while (results.next()) {
				System.out.println(results.getInt(1) + " : " + results.getString(2) + " : " + results.getInt(3));
			}*/
			 	con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}