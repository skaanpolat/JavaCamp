
public class User {

	private int id;
	private String firstName;
	private String lastName;
	private int nationalIdentity;
	private int dOB;
	private String eMail;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String firstName, String lastName, int nationalIdentity, int dOB, String eMail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dOB = dOB;
		this.eMail = eMail;
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

	public int getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(int nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getdOB() {
		return dOB;
	}

	public void setdOB(int dOB) {
		this.dOB = dOB;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
