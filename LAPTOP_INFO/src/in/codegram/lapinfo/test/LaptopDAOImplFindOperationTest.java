package in.codegram.lapinfo.test;

import java.util.List;

import in.codegram.lapinfo.dao.LaptopDAO;
import in.codegram.lapinfo.daoimpl.LaptopDAOImpl;
import in.codegram.lapinfo.domain.Laptop;

public class LaptopDAOImplFindOperationTest {

	public static void main(String[] args) {

		LaptopDAO laptopdao = new LaptopDAOImpl();

		List<Laptop> laptops = laptopdao.findAll();
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
	}

}
