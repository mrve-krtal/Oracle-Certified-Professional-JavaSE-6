package _05.declaremembers.pack2;

import _05.declaremembers.pack1.ModifierMembers;

public class MemberDifferentPackageTest {

	public static void main(String[] args) {

		ModifierMembers modifier = new ModifierMembers();
		//System.out.println(modifier.defaultNumber); //compile error
		System.out.println(modifier.publicNumber);
		//System.out.println(modifier.protectedNumber); // compile error
		//farkli paketten sadece public'e erisim saglanabilir!
	}
}
