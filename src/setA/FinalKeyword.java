package setA;

// final class can not be extended
final class PatientInfo{
	
	// final characteristics can not be changed
	private final int id;
	private final String name;
	private final int age;
	
	public PatientInfo(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// final method can not be overridden by any child class
	public final void getPatientInfo() {
		System.out.println("Id is:"+ id);
		System.out.println("Name is:"+ name);
		System.out.println("age is: "+ age);
	}
	
}

public class FinalKeyword {

	public static void main(String[] args) {

		PatientInfo patient = new PatientInfo(1, "Sameer", 35);
		patient.getPatientInfo();
	}

}
