package _03.referenceCasting;

public class Test02 {

	public static void main(String[] args) {

		Animal[] array = { new Animal(), new Dog(), new Animal(), new Cat() };

		for (Animal animal : array) {

			if (animal instanceof Dog) {
				Dog d = (Dog) animal;
				d.bark();
			}
		}
	}
}
