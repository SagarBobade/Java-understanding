package setA;

class Demo{

	public static Demo d = new Demo();

	public Demo() {
		System.out.println("in Demo()");
	}

	public static Demo getRef() {
		return Demo.d;
	}
}


public class SingletonClass {

	public static void main(String[] args) {

		Demo demo = Demo.getRef();
		Demo d2 = new Demo(); // this will give error
	}

}
