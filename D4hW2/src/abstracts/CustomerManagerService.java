package abstracts;

import entities.Customer;

public interface CustomerManagerService {

	public static void save(Customer customer) {
		System.out.println(customer.getFirstName() + " adl� m��teri veritaban�na kaydedildi.");

	}
}
