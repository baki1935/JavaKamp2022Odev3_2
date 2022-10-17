
public class BaseManager {
	public void profit (Hostels hostels) {
		System.out.println("Ücret hesabınıza gönderildi: " + hostels.price);
	}
	
	public void save (Hostels hostels) {
		System.out.println("Sisteme kayıt gerçekleştiridi: " + hostels.idNumber );
	}

}
