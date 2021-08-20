package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_ASSIGNMENT {

	public static void main(String[] args) throws ClassNotFoundException, SQLException,ArrayIndexOutOfBoundsException  {
		// TODO Auto-generated method stub
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="yashaswini";
		String password="yashaswini";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,username,password);
	System.out.println("connection created");
	Statement s1= con.createStatement();
	String sql ="insert into info10 values('3','maggie','india')";
	s1.executeUpdate(sql);
	String updateQuery="UPDATE info10 set city='india' where id=3";
	s1.executeUpdate(updateQuery);
	String sql1 = "select * from info10 where id = '3'";
	ResultSet rs = s1.executeQuery(sql1);
	while(rs.next()) 
	{
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	
	
	
	con.close();
	}
}



