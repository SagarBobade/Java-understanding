package general;

class Demo2{
	
	public int A;  //non-static characteristic
	public static int B; // static characteristic
	
	public Demo2() {
		A = 10;
		B = 10;		
		System.out.println(B);
	}
	
	public static void staticMethod() {  // static method
	//	A = 10;   // this will give error
		B = 30;
		System.out.println(B);
	}

	static { // static block - this will execute before constructor
	//	A = 10; // this will give error
		B = 20;
		System.out.println(B);
	}
	
	public void nonStaticMethod() {
		A = 10;
//		B = 20;		
		System.out.println(B);
	}
}


public class StaticInJava {

	public static void main(String[] args) {

		Demo2 demo = new Demo2();
		Demo2.B = 30;
		
		Demo2.staticMethod(); // static method called using classname/without creating/using object
		
		demo.nonStaticMethod(); //value of B remains changed
		
//		Demo2 demo2 = new Demo2();
//		System.out.println(demo2.B);
//		System.out.println(Demo2.B);
	}

}
