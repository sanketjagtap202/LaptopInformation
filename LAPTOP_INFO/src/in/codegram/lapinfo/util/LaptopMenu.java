package in.codegram.lapinfo.util;

import java.util.List;
import java.util.Scanner;

import in.codegram.lapinfo.domain.Laptop;
import in.codegram.lapinfo.service.LaptopService;
import in.codegram.lapinfo.serviceimpl.LaptopServiceImpl;

public class LaptopMenu {
	LaptopService laptopservice;
	public LaptopMenu()    // constructor
	{
	laptopservice = new LaptopServiceImpl();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String contiChoice;
		do {
			showMenu();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				createLaptopInfo(sc);
				break;
			case 2:
				listAllLaptopInfo();
				
				break;
			case 3:
				
				deleteLaptopInfo(sc);
				break;
			case 4:
				Laptop laptop=new Laptop();
				
				System.out.println("Enter a ID of laptop to be updated: ");
				laptop.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter new laptop Type: ");
				laptop.setLapi_type(sc.nextLine());
				System.out.println("Enter new laptop specifications: ");
				laptop.setSpecifications(sc.nextLine());
				laptopservice.editLaptopInfo(laptop);
				System.out.println("laptop info updated successfully!!!");
				break;
			case 0:
				System.out.println("Thanks for visit. ");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice. try again.");
				break;
			}
			
			System.out.println("Do you want to continue:(yes/no)");
			 contiChoice = sc.next();
		} while (contiChoice.equals("yes"));
		
		
	}

	private void deleteLaptopInfo(Scanner sc) {
		System.out.println("Enter a ID of Laptop to delete: ");
		laptopservice.removeLaptopInfo(sc.nextInt());
		System.out.println("Laptop Info deleted successfully!!!");
	}

	private void listAllLaptopInfo() {
		System.out.println("List of laptops details: ");
		List<Laptop>laptops =laptopservice.showAllLaptops();
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
	}

	private void createLaptopInfo(Scanner sc) {
		System.out.println("Enter laptops details below: ");
		Laptop laptop=new Laptop();
		sc.nextLine();
		System.out.println("Enter Laptop Type: ");
		laptop.setLapi_type(sc.nextLine());
		System.out.println("Enter Specifications: ");
		laptop.setSpecifications(sc.nextLine());
		laptopservice.insertLaptopInfo(laptop);
		System.out.println("Laptop info added successfully!!!");
	}

	private void showMenu() {
		System.out.println("---------Menu----------");
		System.out.println("1. Insert New Laptop Info");
		System.out.println("2. List All Laptops Info");
		System.out.println("3. Remove Laptop Info");
		System.out.println("4. Update Laptop Info");
	}

}
