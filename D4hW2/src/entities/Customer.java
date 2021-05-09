package entities;

import abstracts.CustomerService;

public class Customer implements CustomerService {

	int id;
	String firstName;
	String lastName;
	int collectedStars;
	String nationalID;
	int dateOfBirth;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, int collectedStars, String nationalID, int dateOfBirth) {

		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.collectedStars = collectedStars;
		this.nationalID = nationalID;
		this.dateOfBirth = dateOfBirth;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCollectedStars() {
		return collectedStars;
	}

	public void setCollectedStars(int i) {
		this.collectedStars = i;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(int i, int j, int k) {

	}

}
