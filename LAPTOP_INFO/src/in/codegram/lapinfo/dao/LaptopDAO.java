package in.codegram.lapinfo.dao;

import java.util.List;

import in.codegram.lapinfo.domain.Laptop;

/**
 * Here we will create CRUD operation methods
 * @author USER
 *
 */
public interface LaptopDAO {

	void save(Laptop laptop); // to save laptop info
	
	List<Laptop> findAll(); // to list all laptops
	 
	void delete(int id);    // to delete laptop from db
	
	void update(Laptop laptop); // to update laptop info
	
}
