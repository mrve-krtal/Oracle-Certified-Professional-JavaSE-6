package _05.flow.control;

public class NotesForIfElse {

	public static void main(String[] args) {

		int number = 10;

		// tek ifade/tek satir bile olsa if else icin suslu parantez KULLAN !
		int number2;
		if (number > 15)
			number2 = 20;
		int number3 = 50;

		if (number > 15) {
			number2 = 20;
		}

		int x = 1;
		int y = 10;
		if (x > 3)
			if (y > 5)
				System.out.println("y>5");
			else
				System.out.println("else");

		if (x > 3) {
			if (y > 5) {
				System.out.println("y>5");
			} else {
				System.out.println("else");
			}
		}

		Person person = new Person("admin", 30);
		Address address = new Address("istanbul", "tr");
		
		// 1 - if blogununu mumkun mertebe kisa tut
		// 2 - & | noktasinda algoritmaya gore  parantezlere dikkat et.
		// 3 - if blogunu bol
		if( person.getAge() > 20 && person.getName().equals("admin")&& address.getCity().equals("istanbul")) {
			
		}
		
		boolean personCheck = person.getAge() > 20 && person.getName().equals("admin");
		boolean addressCheck = address.getCity().equals("istanbul");
		
		if(personCheck && addressCheck) {
			
		}
	}
}

// if(booleanExpression) {
//
// }

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Address {
	String city;
	String country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}