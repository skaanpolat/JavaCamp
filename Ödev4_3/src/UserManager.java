
public class UserManager implements UserServices{

	public void addUser(User user) {
		System.out.println("Kullanıcı sisteme eklendi : " + user.getFirstName());

	};

	public void updateUser(User user) {
		System.out.println("Kullanıcı güncellendi : " + user.getFirstName());
	};

	public void deleteUser(User user) {
		System.out.println("Kullanıcı sistemden silindi : " + user.getFirstName());
	};

}
