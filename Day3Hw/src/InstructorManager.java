public class InstructorManager {

	
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eğitmenlere eklendi.");
	}

	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eğitmenlerden çıkarıldı!");
	}
}