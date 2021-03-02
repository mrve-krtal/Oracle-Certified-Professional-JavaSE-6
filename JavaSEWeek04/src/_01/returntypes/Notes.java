package _01.returntypes;

public class Notes {

}


//covariant return type
//override metotlarda donus tipi degismez.
//fakat covariant return type olabilir!



class Computer {
	
}

class Laptop extends Computer {
	
}


class Store  {
	
	public Computer buyComputer() {
		return new Computer();
	}
}

class EStore extends Store {
	
	@Override
	// override metotlarda donus tipi sub-class olabilir.
	// covarian return type adi verilir.
	public Laptop buyComputer() {
		return new Laptop();
	}
}




