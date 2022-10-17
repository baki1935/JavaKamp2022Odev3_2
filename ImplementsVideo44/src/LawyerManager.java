
public class LawyerManager {
	
	private ILawyer lawyer;
	private IEatable eat;
	private IPrisonInterview prison;
	private IAlimonyAgreement agreemnet;
	
	public LawyerManager(ILawyer lawyer, IEatable eat, IPrisonInterview prison, IAlimonyAgreement agreemnet) {
		
		this.lawyer = lawyer;
		this.eat = eat;
		this.prison = prison;
		this.agreemnet = agreemnet;
		
		
	}
	
	

	

	 





	public void endDay () {
		lawyer.lawSuit();
		eat.eat();
		prison.visit();
		agreemnet.meeting();
	}
	
	
	

}
