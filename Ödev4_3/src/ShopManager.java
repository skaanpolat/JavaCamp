
public class ShopManager implements ShopServices {

	@Override
	public void buy(Shop shop, Gamer gamer) {
		System.out.println(gamer.getNickName() + " adlı oyuncu " + shop.getGameName() + " adlı oyunu satın aldı");

	}

	@Override
	public void refund(Shop shop, Gamer gamer) {
		System.out.println(gamer.getNickName() + " adlı oyuncu " + shop.getGameName() + " adlı oyunu iade aldı");
	}

	@Override
	public void buyDiscount(Shop shop, Gamer gamer) {
		System.out.println(gamer.getNickName() + " adlı oyuncu " + shop.getGameName() + " adlı oyunu indirim ile satın aldı");
		System.out.println("%" +shop.getDiscountRate() + " İndirim oranı ile " + ((shop.getGamePrice())-(shop.getGamePrice()/100)*((shop.getDiscountRate())) + "TL fiyata satın aldı."));
	}

}
