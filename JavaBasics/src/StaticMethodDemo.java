
public class StaticMethodDemo {
	public static void main(String[] args) {
		System.out.println("inside main");
		StaticMethodDemo.method();
	}

	static void method() {
		System.out.println("inside method 1");
	}
	
	static {
		System.out.println("static block");
	}
}
