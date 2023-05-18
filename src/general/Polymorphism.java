package general;

class MedicalTest{
	
	// properties
	private String testName;
	private String testResult;
	
	// constructor
	public MedicalTest(String testName) {
		this.testName = testName;
		this.testResult = "";
	}

	// methods
	public void performTest(Patient patient) {
		System.out.println("Performing test: "+ this.testName+"On patient: "+ patient.getName());
		this.testResult = "Positive";
	}
	
	// getters	
	public String getTestName() {
		return testName;
	}

	public String getTestResult() {
		return testResult;
	}

	// setters
	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}		
}

class BloodTest extends MedicalTest{

	private String bloodType;	
	
	public BloodTest(String bloodType) {
		super("Blood");
		this.bloodType = bloodType;
	}
	
	// method overriding OR runtime polymorphism
	public void PerformTest(Patient patient) {
		System.out.println("Taking blood from patient: "+ patient.getName()+" of blood type:"+ this.getBloodType());
		this.setTestResult("Positive");
	}
	
	// method overloading or compiletime polymorphism
	public void PerformTest(Patient patient, String purpose) {
		System.out.println("Taking blood from patient: "+ patient.getName()+" for:"+ purpose);
		this.setTestResult("Negative");
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	
}

class Patient{
	
	public String name;
	public int age;
	
	public Patient(String name, int age) {
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

public class Polymorphism {

	public static void main(String[] args) {

		Patient patient1 = new Patient("Sameer", 35);
		MedicalTest medicalTest1 = new MedicalTest("Temperature");
		BloodTest bloodTest1 = new BloodTest("A");
		
		medicalTest1.performTest(patient1);
		System.out.println("Test resutl is: "+medicalTest1.getTestResult());

		bloodTest1.PerformTest(patient1);
		System.out.println("Test result is: "+ bloodTest1.getTestResult());
		
		bloodTest1.PerformTest(patient1, "General purpose");
		System.out.println("Test result is: "+ bloodTest1.getTestResult());
	}

}
