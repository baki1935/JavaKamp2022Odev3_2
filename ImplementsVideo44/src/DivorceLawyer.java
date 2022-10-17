
public class DivorceLawyer implements ILawyer, IEatable, IAlimonyAgreement{

	@Override
	public void meeting() {
		System.out.println("Sözleşme düzenlendi.");
		
	}

	@Override
	public void eat() {
		System.out.println("'. Katta yemek yanildi.");
		
	}

	@Override
	public void lawSuit() {
		System.out.println("Boşanma duruşmasına gidildi.");
		
	}

}
