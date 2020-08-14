package pomtests;

import java.sql.*;

public class DataBase {

	public static void main(String[] args) {
		try{  
			int count=0;
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","system");  
			Statement stmt=con.createStatement();  
			String query="insert into emp Values(145,'kishor',29000,50)";
	        int rs=stmt.executeUpdate(query);
	if(rs!=0)
	{
		count++;
		System.out.println(count +  " rows  inserted");
		
	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
