package _01.enums;

//enumlar java.lang.Enum sinifini (public abstract class Enum<E extends Enum<E>>)
//kalitmaktadir. dolayisiyla bir baska sinifi kalitamaz!

public enum EmployeeType {
	
	FULL_TIME, PART_TIME, INTERN, CONSULTANT;
}
 
	//
	class EmployeeType2 {
		public static final EmployeeType2 FULL_TIME = new EmployeeType2();
		public static final EmployeeType2 PART_TIME = new EmployeeType2();
		public static final EmployeeType2 INTERN = new EmployeeType2();
		public static final EmployeeType2 CONSULTANT = new EmployeeType2();
	}