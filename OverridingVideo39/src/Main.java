
public class Main {

	public static void main(String[] args) {
		
		
		HiveGroups[] groups = new HiveGroups[] {new HiveTr(), new Ocd(), new Pinmapple()};
		for(HiveGroups group:groups) {
			System.out.println(group.instruction(3,3,1,1));
		}
		HiveGroups trListe = new HiveTr ();
		System.out.println("TR LİSTE " + trListe.instruction(3, 3, 1, 1));

	}

}
