
public class FirstProject {

	FirstProject() {
		System.out.println("constructor with class name");
	}

	{
		System.out.println("constructor without class name");
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	
	
	static {
		System.out.println("static block");
	}
}
