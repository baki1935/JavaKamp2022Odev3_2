
public class Main {

	public static void main(String[] args) {
		/*EngineerStudent[] students = new EngineerStudent[] {new ComputerEngineerStudent(), new IndustrialEngineerStudent(), new CivilEngineerStudent()};
		 for(EngineerStudent student:students) {
			student.lesson(5);
		 }
	}*/
	StudentManager manager = new StudentManager(new ComputerEngineerStudent());
	
	manager.lessonNumber(null);
	
	}
	   
	
}
