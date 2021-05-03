public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setEmail("e.demirog@siteadi.com");
		instructor1.setCourse("JavaCamp");
		instructor1.setId(1);

		System.out.println("Eðitmenin Adý: " + instructor1.getFirstName() + " " + instructor1.getLastName() + " ID : " + instructor1.getId());

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		System.out.println("Devam eden eðitim : " + instructor1.getCourse());
		
		Student student1 = new Student();
		student1.setFirstName("Kaan");
		student1.setLastName("POLAT");
		student1.setCourse("JavaCamp");
		student1.setId(1);
		student1.setEmail("skaanpolat@gmail.com");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		
		System.out.println("Öðrencinin Adý: " + student1.getFirstName() + " " + student1.getLastName() + " ID : " + student1.getId());
		
		
	}
	
	

	
}
