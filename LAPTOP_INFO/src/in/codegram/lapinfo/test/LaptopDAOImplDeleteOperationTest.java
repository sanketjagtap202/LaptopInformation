package in.codegram.lapinfo.test;

import java.util.List;

import in.codegram.lapinfo.dao.LaptopDAO;
import in.codegram.lapinfo.daoimpl.LaptopDAOImpl;
import in.codegram.lapinfo.domain.Laptop;

public class LaptopDAOImplDeleteOperationTest {

	public static void main(String[] args) {

		LaptopDAO laptopdao = new LaptopDAOImpl();

		laptopdao.delete(2);
		System.out.println("Laptop info deleted successfully!!!");
	}

}
