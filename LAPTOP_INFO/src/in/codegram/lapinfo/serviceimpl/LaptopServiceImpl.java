package in.codegram.lapinfo.serviceimpl;

import java.util.List;

import in.codegram.lapinfo.dao.LaptopDAO;
import in.codegram.lapinfo.daoimpl.LaptopDAOImpl;
import in.codegram.lapinfo.domain.Laptop;
import in.codegram.lapinfo.service.LaptopService;

public class LaptopServiceImpl implements LaptopService {

		LaptopDAO laptopdao;
	public LaptopServiceImpl() {
	laptopdao=new LaptopDAOImpl();
	}
	
	@Override
	public void insertLaptopInfo(Laptop laptop) {
		laptopdao.save(laptop);
		
	}

	@Override
	public List<Laptop> showAllLaptops() {
		
		return laptopdao.findAll();
	}

	@Override
	public void removeLaptopInfo(int id) {
		laptopdao.delete(id);
		
	}

	@Override
	public void editLaptopInfo(Laptop laptop) {
		laptopdao.update(laptop);
		
	}

}
