public class InstructorManager {

	
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eðitmenlere eklendi.");
	}

	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eðitmenlerden çýkarýldý!");
	}
}