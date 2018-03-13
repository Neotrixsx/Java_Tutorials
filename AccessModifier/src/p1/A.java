package p1;

public class A {
	private int a = 100;
	int b = 80;
	protected int c = 60;
	public int d = 40;

	public static void main(String[] args) {
		A obj = new A();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
