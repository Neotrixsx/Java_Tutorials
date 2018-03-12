
public class StringConcat {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "xyg";
		System.out.println(s1 + s2);

		int a = 10, b = 20, c = 30;

		System.out.println(a + b + c);

		System.out.println("value " + s1 + a + b + c + s2);
		System.out.println("value " + a + b + c + s2);
		System.out.println( a + b + c + s2); // based on first value
	}
}
