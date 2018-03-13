package p2;

import p1.A;

public class C extends A {
	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj.c);
		System.out.println(obj.d);

		A objx = new A();
		System.out.println(objx.d);
	}
}
