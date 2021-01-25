package _05.declaremembers.pack1;

public class ModifierMembers {

	private int privateNumber = 100;
	int defaultNumber = 200;
	protected int protectedNumber = 100;
	public int publicNumber = 100;
	
	private void method() {
		
		//private degiskene sadece ilgili sinif erisebilir.
		System.out.println(privateNumber);
	}
}
