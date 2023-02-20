package in.codegram.lapinfo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * We will store DB infor mation here including creating connection,
 * preparedStatement, closing resources etc
 * 
 * @author USER
 *
 */
public class DBUtil {

	// DB info:

	String url = "jdbc:mysql://localhost/laptopdb";
	String user = "root";
	String password = "admin";
	String jdbcDriver = "com.mysql.cj.jdbc.Driver"; //register driver

	// Creating connection:

	private Connection conn = null;

	private Connection connect() {
		try {
			Class c = Class.forName(jdbcDriver);  //load driver
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	//creating preparedStatement using connect():
	private PreparedStatement ps =null;
	
	public PreparedStatement preStatement(String sql) {
		
		try {
			ps = connect().prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ps;
		
	}

	public void closeResources() {
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
