import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root","" ); 
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employeeinfo where name='rahul2'");
		while(rs.next())
		{
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("location"));
		System.out.println(rs.getInt("age"));
		}
	}

}
