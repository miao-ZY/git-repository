package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {
	private static Statement stat;
	private static void init() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("连接数据库...");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/escape","root","19980428");
        stat=conn.createStatement();
	}
	public static Statement getStatment() throws SQLException, ClassNotFoundException{
		if(stat==null)
			init();
		return stat;
		
	}

}
