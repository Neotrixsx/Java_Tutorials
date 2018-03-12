
public class NonStatic {
	int num;

//	NonStatic() { // constructor
//		System.out.println("inside the constructor");
//	}

	{// non static block
		System.out.println("inside non static block");
	}

	public static void main(String[] args) {
		System.out.println("inside main method");
		new NonStatic();
		NonStatic obj= new NonStatic();
		obj.dosome();
	}
	
	
	static {// static block
		System.out.println("inside static block");
	}
	
	void dosome() {
		System.out.println("inside dosome");
	}
}
