package _02.more.overloaded;

public class Example03 {

	public static void main(String[] args) {
		// 100 -> primitive int tipinde literal
		overloaded(100);
		// long calisir , obje tipi (Integer) yerine primitive tercih eder.
	}

	// int -> long widening
	public static void overloaded(long lo) {
		System.out.println("long");
	}

	// int -> Integer boxing
	public static void overloaded(Integer lo) {
		System.out.println("Integer");
	}
}
