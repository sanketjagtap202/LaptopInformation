package in.codegram.lapinfo.test;

import java.util.List;

import in.codegram.lapinfo.dao.LaptopDAO;
import in.codegram.lapinfo.daoimpl.LaptopDAOImpl;
import in.codegram.lapinfo.domain.Laptop;

public class LaptopDAOImplUpdateOperationTest {

	public static void main(String[] args) {

		LaptopDAO laptopdao = new LaptopDAOImpl();
		Laptop laptop=new Laptop();
		laptop.setId(3);
		laptop.setLapi_type("DELL");
		laptop.setSpecifications("500GB HDD, 8GBRAM, Touch Screen");
		laptopdao.update(laptop);
		System.out.println("Laptop info updated succesfully!!!!");
		

		
	}

}
