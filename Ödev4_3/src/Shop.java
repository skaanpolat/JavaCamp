
public class Shop {
	
	private String gameName;
	private int gamePrice;
	private int discountRate;
	private int gamePriceAfterDiscount= (int) ((this.getGamePrice())-(this.getGamePrice()*this.getDiscountRate())/100);
	
	public Shop () {};
	
	public Shop(String gameName, int gamePrice, int discountRate, int gamePriceAfterDiscount) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.discountRate = discountRate;
		this.gamePriceAfterDiscount = gamePriceAfterDiscount;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getGamePriceAfterDiscount() {
		return gamePriceAfterDiscount;
	}

	public void setGamePriceAfterDiscount(int gamePriceAfterDiscount ) {
		
	}

}
