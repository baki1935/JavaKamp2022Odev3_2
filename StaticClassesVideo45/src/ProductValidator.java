
public class ProductValidator {
	static {
		System.out.println("Statik yapıcı blok çalıştı.");
	}
	public static boolean isValid (Product product) {
		if(product.id>0 && !product.name.isEmpty()) {
			
			return true;
		} else {
			
			return false;
		}
		
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	public void delete() {
		
	}

}
