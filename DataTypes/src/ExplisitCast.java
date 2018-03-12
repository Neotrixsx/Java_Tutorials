
public class ExplisitCast {
	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;
		System.out.println(b);
		int x = 97;
		char ch = (char) x;
		System.out.println(ch);

		// Careful Example beyond limit
		int y = 130;
		byte z = (byte) y;
		System.out.println(z);

		int n = 612;
		byte t = (byte) n;
		char cht = (char) t;
		System.out.println(cht);
	}
}
