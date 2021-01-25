package _05.declaremembers.final_;

public class FinalMethodTest {

}

final class FinalClass {
	
}

//class SubFinalClass extends FinalClass {}		//final class'lar extends edilemez.

class SuperClass {
	
	void testMethod() {
		
	}
	
	final void finalMethod () {
		
	}
	
}


class SubClass extends SuperClass {
	
	@Override
	void testMethod() {
		
	}
	
	//final methodlar override edilemezler!
	//void finalMethod () {}
	
}
