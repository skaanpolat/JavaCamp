package concretes;

import abstracts.CustomerManagerService;
import entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	boolean nameCheck = true;

	public void CheckIfReal(Customer customer) {

		if (customer.getFirstName() == abstracts.CustomerCheckService.personFirstName) {
			System.out.println("Kullanýcý bilgileri teyid edildi.");

			CustomerManagerService.save(customer);

			System.out.println("Mevcut yýldýz sayýsý : " + customer.getCollectedStars());

			for (guncelYýldýzSayýsý = 0; guncelYýldýzSayýsý <= customer.getCollectedStars(); guncelYýldýzSayýsý++) {

			}
			customer.setCollectedStars(guncelYýldýzSayýsý);
			System.out.println("Güncel yýldýz sayýsý : " + guncelYýldýzSayýsý);

		}

		if (customer.getFirstName() != abstracts.CustomerCheckService.personFirstName) {
			nameCheck = false;
			System.out.println("Kullanýcý teyid edilemedi.");
		}

	}
}
