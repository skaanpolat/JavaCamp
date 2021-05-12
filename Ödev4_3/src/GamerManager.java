
public class GamerManager implements GamerServices {

	@Override
	public void addGamer(Gamer gamer) {
		System.out.println(gamer.getNickName() + " adlı oyuncu " +  "sisteme kayıt oldu.");
	}

}
