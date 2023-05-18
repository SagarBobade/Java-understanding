package general;

class Demo{

	// Creating object of class
	public static Demo d = new Demo();

	public Demo() {
		System.out.println("in Demo()");
	}

	// Returning reference of created object 
	public static Demo getRef() {
		return Demo.d;
	}
}


public class SingletonClass {

	public static void main(String[] args) {

		// Getting reference of created object inside class
		Demo demo = Demo.getRef();
		Demo d2 = new Demo(); // this will give error - we will have to use object which is created inside class
	}

}
