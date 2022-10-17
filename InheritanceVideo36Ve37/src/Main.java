
public class Main {

	public static void main(String[] args) {
		
		AllFlat allFlat = new AllFlat () ;
		allFlat.cleaning = 150;
		allFlat.company = 0.1;
		allFlat.idNumber = "11111111111";
		allFlat.name = "Baki";
		allFlat.price = 500;
		allFlat.roomNumber = 23;
		
		
		SharedFlat sharedFlat = new SharedFlat();
		sharedFlat.cleanBedLinen = 50;
		sharedFlat.company = 0.2;
		sharedFlat.idNumber = "111111111112";
		sharedFlat.name = "Bak";
		sharedFlat.price = 200;
		sharedFlat.roomNumber = 23;
		
		
		
		HostelRoom hostelRoom = new HostelRoom ();
		hostelRoom.dailyMeal = 75;
		hostelRoom.company =0.02;
		hostelRoom.idNumber = "11111111113";
		hostelRoom.name = "Ba";
		hostelRoom.price = 750;
		hostelRoom.roomNumber = 19;
	
		
		BaseManager manager = new FlatManager () ;
		manager.profit(allFlat);
		manager.save(allFlat);
		

	}

}
