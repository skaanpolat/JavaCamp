public class InstructorManager {

	
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmenlere eklendi.");
	}

	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmenlerden ��kar�ld�!");
	}
}