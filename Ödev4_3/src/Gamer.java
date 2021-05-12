
public class Gamer extends User {

	private String nickName;
	private String[] gameInventory;

	public Gamer() {}

	public Gamer(int id, String firstName, String lastName, int nationalIdentity, int dOB, String eMail) {
		super(id, firstName, lastName, nationalIdentity, dOB, eMail);

	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String[] getGameInventory() {
		return gameInventory;
	}

	public void setGameInventory(String[] gameInventory) {
		this.gameInventory = gameInventory;
	}
}