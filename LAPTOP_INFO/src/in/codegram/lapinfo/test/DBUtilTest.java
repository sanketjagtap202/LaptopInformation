package in.codegram.lapinfo.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.codegram.lapinfo.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
	DBUtil dbutil =	new DBUtil();
		
	String sql="insert into laptops(lapi_type,specifications) values(?,?)";
 PreparedStatement pst =	dbutil.preStatement(sql);
	try {
		pst.setString(1, "SONY");
		pst.setString(2, " processor, hdd");
		pst.execute();
		System.out.println("Added successfully!!!");
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
	finally {
		dbutil.closeResources();
	}
	
		

	}

}
