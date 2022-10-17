
public class CriminalLawyer implements ILawyer,IEatable,IPrisonInterview {

	@Override
	public void lawSuit() {
		System.out.println("Ceza mahkemesindeki duruşmaya gidildi");
		
	}

	@Override
	public void visit() {
		System.out.println("Mahkumla görüşüldü.");
		
	}

	@Override
	public void eat() {
		System.out.println("1. Katta yemek yenildi");
		
	}

}
