package _05.declaremembers.pack1;

public class MembersTest {

	public static void main(String[] args) {
		
		ModifierMembers modifier = new ModifierMembers();
		
		System.out.println(modifier.defaultNumber);
		System.out.println(modifier.publicNumber);
		System.out.println(modifier.protectedNumber);
		//System.out.println(modifier.privateNumber);
		
		//private bir degiskene ya da methoda sadece AYNI sinif icerisinden erisim saglanabilir!
		//farkli bir siniftan erisim saglanamaz!
		// KALITIM bile olsa private degiskene erisim saglanamaz!
	
	}

}
