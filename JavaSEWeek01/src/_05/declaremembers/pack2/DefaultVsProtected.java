package _05.declaremembers.pack2;

import _05.declaremembers.pack1.ModifierMembers;

public class DefaultVsProtected extends ModifierMembers{
	
	void testMethod() {
			
			//kalitim yoluyla protected uyeye erisim saglanabilir!
			//defaulta ise saglanamaz
			System.out.println(publicNumber);
			System.out.println(protectedNumber);
			//System.out.println(defaultNumber);
			
	//		ModifierMembers modifier = new ModifierMembers();
	//		System.out.println(modifier.defaultNumber);
	//		System.out.println(modifier.publicNumber);
	//		System.out.println(modifier.protectedNumber);
		}
}


