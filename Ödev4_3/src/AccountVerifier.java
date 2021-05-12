
public class AccountVerifier implements AccountVerifierServices {

	@Override
	public void verifyFirstName(User user) {
		System.out.println("İsim kontrol edildi. " + user.getFirstName());

	}

	@Override
	public void verifyLastName(User user) {
		System.out.println("Soy isim kontrol edildi. " + user.getLastName());
	}

	@Override
	public void verifyId(User user) {
		System.out.println("Id kontrol edildi. " + user.getId());
	}

	@Override
	public void verifydOB(User user) {
		System.out.println("Doğum tarihi kontrol edildi. " + user.getdOB());
	}

	@Override
	public void verifyNationalID(User user) {
		System.out.println("Kimlik numarası kontrol edildi. " + user.getNationalIdentity());
	}

	@Override
	public void verifyEMail(User user) {
		System.out.println("E-Mail kontrol edildi. " + user.geteMail());
	}

}
