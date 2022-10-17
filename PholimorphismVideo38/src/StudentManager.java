
public class StudentManager {
	private EngineerStudent lessons;

	public StudentManager(EngineerStudent lessons) {
		
		this.lessons = lessons;
	}
	
	public void lessonNumber (EngineerStudent lessons) {
		System.out.println("How many lessons you have?");
		this.lessons.lesson(5);
	}
	
	

}
