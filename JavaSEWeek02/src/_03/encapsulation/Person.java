package _03.encapsulation;

public class Person {

	private int age;
	private String name;

	
	//legaldir fakat encapsulation icin uygun degildir!
	//encapsulation i�in private �zellik tan�mlamak daha do�rudur.
	public String surname; // n tane noktadan erisim saglanabilir.

	//
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			age = 0;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
