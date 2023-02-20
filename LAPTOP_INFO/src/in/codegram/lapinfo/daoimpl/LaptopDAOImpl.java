/**
 * Here we will implememt the methods that are declaired in LaptopDAO interface.
 */
package in.codegram.lapinfo.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codegram.lapinfo.dao.LaptopDAO;
import in.codegram.lapinfo.domain.Laptop;
import in.codegram.lapinfo.util.DBUtil;

public class LaptopDAOImpl extends DBUtil implements LaptopDAO {

	@Override
	public void save(Laptop laptop) {
		String sql = "insert into laptops(lapi_type,specifications) values(?,?)";

		PreparedStatement pst = preStatement(sql);
		try {
			pst.setString(1, laptop.getLapi_type());
			pst.setString(2, laptop.getSpecifications());
			pst.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeResources();
		}

	}

	@Override
	public List<Laptop> findAll() {
		String sql = "select * from laptops";
		PreparedStatement pst = preStatement(sql);
		List<Laptop> laptops = new ArrayList<>(); // we need array to show all details of laptop.
		Laptop laptop;
		try {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				laptop = new Laptop();
				laptop.setId(rs.getInt("id"));
				laptop.setLapi_type(rs.getString("lapi_type"));
				laptop.setSpecifications(rs.getString("specifications"));
				laptops.add(laptop);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			closeResources();
		}

		return laptops;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from laptops where id=?";
		PreparedStatement pst = preStatement(sql);
			try {
				pst.setInt(1, id);
				pst.execute();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally {
				closeResources();
			}
	}

	@Override
	public void update(Laptop laptop) {
		String sql="update laptops SET lapi_type=?,specifications=? where id=?";
		
	PreparedStatement pst =	preStatement(sql);
			try {
				pst.setString(1, laptop.getLapi_type());
				pst.setString(2, laptop.getSpecifications());
				pst.setInt(3, laptop.getId());
				pst.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
