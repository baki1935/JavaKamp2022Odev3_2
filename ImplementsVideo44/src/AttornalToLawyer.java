
public class AttornalToLawyer implements ILawyer, IEatable {

	@Override
	public void lawSuit() {
		System.out.println("Hukuk mahkemesindeki duruşmaya gidildi.");
		
	}

	@Override
	public void eat() {
		System.out.println("3. Katta yemek yenildi.");
	}

}
