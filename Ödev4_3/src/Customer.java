
public class Customer extends User  {
	
	private int balance;

	public Customer(int id, String firstName, String lastName, int nationalIdentity, int dOB, String eMail,
			int balance) {
		super(id, firstName, lastName, nationalIdentity, dOB, eMail);
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
