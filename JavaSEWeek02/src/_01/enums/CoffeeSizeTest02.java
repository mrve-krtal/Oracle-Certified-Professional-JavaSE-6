package _01.enums;

public class CoffeeSizeTest02 {

	public static void main(String[] args) {
		
		CoffeeSize coffeeSize = CoffeeSize.VENTI;
		
		System.out.println(coffeeSize.getPrice());
		System.out.println(coffeeSize.ordinal()); //Ventý'nýn sýralamasý dönecektir.
		
		
		System.out.println("-------------");
		
		for(CoffeeSize cs : CoffeeSize.values()) {
			System.out.println(cs +" ," + cs.getPrice());
		}
	}

}
