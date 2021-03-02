package _01.enums;

public class EmployeeTest01 {

	public static void main(String[] args) {

		EmployeeType empType = EmployeeType.valueOf("FULL_TIME");

		System.out.println(empType == EmployeeType.FULL_TIME);
		System.out.println(empType.equals(EmployeeType.FULL_TIME));
		
		// == ve equals true olur
		// her enum degeri icin bir tane obje olusur.
 
	}

}
