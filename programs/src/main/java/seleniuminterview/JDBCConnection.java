package seleniuminterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
		
		java.sql.Statement stm=con.createStatement();
		
		String query="Select*from employees";
		
		ResultSet rs=stm.executeQuery(query);
		while(rs.next()) {
			String name=rs.getString("first_name");
			System.out.println(name);
		}
	}

}
