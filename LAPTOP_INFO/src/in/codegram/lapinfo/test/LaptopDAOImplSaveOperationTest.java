package in.codegram.lapinfo.test;

import in.codegram.lapinfo.dao.LaptopDAO;
import in.codegram.lapinfo.daoimpl.LaptopDAOImpl;
import in.codegram.lapinfo.domain.Laptop;

public class LaptopDAOImplSaveOperationTest {

	public static void main(String[] args) {

		LaptopDAO laptopdao = new LaptopDAOImpl();
		Laptop laptop=new Laptop();
		laptop.setLapi_type("HP");
		laptop.setSpecifications("1TBHDD,Graphics card,4GBRAM");
		laptopdao.save(laptop);
		System.out.println("Laptop added successfully!!!");
				
	}

}
