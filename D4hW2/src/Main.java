import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {

		StarbucksCustomerManager starCustomerManager = new StarbucksCustomerManager();
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setFirstName("S.Kaan");
		customer.setLastName("POLAT");
		customer.setDateOfBirth(1991, 8, 31);
		customer.setNationalID("12345678910");
		customer.setCollectedStars(17);
		
		
		
		starCustomerManager.CheckIfReal(customer);
		System.out.println("***********************************************");
		neroCustomerManager.save(customer);
		
		
	}

}
