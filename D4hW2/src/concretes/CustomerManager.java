package concretes;

import entities.Customer;

public class CustomerManager extends Customer {

	int guncelY�ld�zSay�s� = 1;

	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adl� kullan�c� sisteme kaydedildi.");
		System.out.println("Mevcut y�ld�z say�s� : " + customer.getCollectedStars());

		for (guncelY�ld�zSay�s� = 0; guncelY�ld�zSay�s� <= customer.getCollectedStars(); guncelY�ld�zSay�s�++) {

		}
		customer.setCollectedStars(guncelY�ld�zSay�s�);
		System.out.println("G�ncel y�ld�z say�s� : " + guncelY�ld�zSay�s�);
	}
}
