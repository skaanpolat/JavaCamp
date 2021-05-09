package concretes;

import abstracts.CustomerManagerService;
import entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	boolean nameCheck = true;

	public void CheckIfReal(Customer customer) {

		if (customer.getFirstName() == abstracts.CustomerCheckService.personFirstName) {
			System.out.println("Kullan�c� bilgileri teyid edildi.");

			CustomerManagerService.save(customer);

			System.out.println("Mevcut y�ld�z say�s� : " + customer.getCollectedStars());

			for (guncelY�ld�zSay�s� = 0; guncelY�ld�zSay�s� <= customer.getCollectedStars(); guncelY�ld�zSay�s�++) {

			}
			customer.setCollectedStars(guncelY�ld�zSay�s�);
			System.out.println("G�ncel y�ld�z say�s� : " + guncelY�ld�zSay�s�);

		}

		if (customer.getFirstName() != abstracts.CustomerCheckService.personFirstName) {
			nameCheck = false;
			System.out.println("Kullan�c� teyid edilemedi.");
		}

	}
}
