package _02.constructor;

public class ConstructorNotes01 {

}

//Javada butun siniflarda constructor olmak zorundadir!
//bu kurala abstract classlar da dahildir! yani abstract classlar icin de constructor olmalidir!
//interfaceler icin bu durum soz konusu degildir! interfacelerin constructorlar'ý yoktur.

//eger bir sinif/class icin biz constructor tanimlamazsak , java bizim icin bir tane constructor tanimlar!
//arka planda default cosntructor tanimlanir.
//bu constructor da no-arg / parametre almayan constructordir.

//class Person {
//	
//}

class Person {

	// java bizim icin bu sekilde bir constructor tanimlar!
	Person() {

	}
}

//eger biz bir constructor tanimlarsak , java otomatik olarak baska bir constructor TANIMLAMAZ!
//
class Employee {

	private String name;

	Employee(String name) {
		this.name = name;
	}
	
	// eger yukaridaki gibi bir constructor tanimlarsak , artik java bizim icin no-arg/parametre almayan bir constructor TANIMLAMAZ.
	// yani bizim isimize karismaz. sen ne yapiyorsan eyvallah der!
	//	Employee() {
	//	 // ARKA PLANDA TANIMLANMAZ!!!	
	//	}
	
	
	// dolayisiyla ister biz tanimlayalim, ister java tanimlasin her class icn en az 1 tane constructor TANIMLANIR!

}
