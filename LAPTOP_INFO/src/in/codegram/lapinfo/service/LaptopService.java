package in.codegram.lapinfo.service;

import java.util.List;

import in.codegram.lapinfo.domain.Laptop;

/**
 * Here we will write a business logic
 * @author USER
 *
 */
public interface LaptopService {
	
	void insertLaptopInfo(Laptop laptop);
	
	List<Laptop> showAllLaptops();
	
	void removeLaptopInfo(int id);
	
	void editLaptopInfo(Laptop laptop);

}
