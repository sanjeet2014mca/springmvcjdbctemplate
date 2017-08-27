package net.codejava.spring.config;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class MysqlCon{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/test","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt= (Statement) con.createStatement(); 
			System.out.println("connection established:"+stmt);
			/*ResultSet rs=stmt.executeQuery("select * from ");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  */
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  
}  