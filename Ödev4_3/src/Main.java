
public class Main {

	public static void main(String[] args) {

		AccountVerifier accountVerifier = new AccountVerifier();
		ShopManager shopManager = new ShopManager();
		GamerManager gameManager = new GamerManager();

		Shop game1 = new Shop();
		Shop game2 = new Shop();
		game1.setGameName("GTA VI");
		game1.setGamePrice(275);
		game1.setDiscountRate(36);
		game2.setGameName("RDR2");
		game2.setGamePrice(450);
		game2.setDiscountRate(17);
		

		Gamer gamer1 = new Gamer();
		Gamer gamer2 = new Gamer();
		gamer1.setNickName("MIB2");
		gamer2.setNickName("3T");

		User user1 = new User();

		user1.setFirstName("Taner Kundakçı");
		user1.setdOB(2001);
		user1.seteMail("3T_taner@hotmail.com");
		user1.setId(1);
		user1.setLastName("Tarlacı");
		user1.setNationalIdentity(1234657);

		accountVerifier.verifyFirstName(user1);
		accountVerifier.verifydOB(user1);
		accountVerifier.verifyEMail(user1);
		accountVerifier.verifyId(user1);
		accountVerifier.verifyLastName(user1);
		accountVerifier.verifyNationalID(user1);
		System.out.println("***********************");

		gameManager.addGamer(gamer2);

		shopManager.buy(game1, gamer1);

		System.out.println("*************");

		shopManager.buyDiscount(game1, gamer1);
		
		
	}

}
