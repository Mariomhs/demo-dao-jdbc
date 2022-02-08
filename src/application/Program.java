package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Mario", "mario@gmail.com", new Date(30/04/1985), 3000.00, obj);
		System.out.println(seller);

	}

}
