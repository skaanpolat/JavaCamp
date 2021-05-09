package concretes;

import entities.Customer;

public class CustomerManager extends Customer {

	int guncelYýldýzSayýsý = 1;

	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý kullanýcý sisteme kaydedildi.");
		System.out.println("Mevcut yýldýz sayýsý : " + customer.getCollectedStars());

		for (guncelYýldýzSayýsý = 0; guncelYýldýzSayýsý <= customer.getCollectedStars(); guncelYýldýzSayýsý++) {

		}
		customer.setCollectedStars(guncelYýldýzSayýsý);
		System.out.println("Güncel yýldýz sayýsý : " + guncelYýldýzSayýsý);
	}
}
