
public class EstateManager {
	private IRealEstate realEstate;

	public EstateManager(IRealEstate realEstate) {
		
		this.realEstate = realEstate;
	}
	public void message () {
		realEstate.information();
	}
	
	

}
