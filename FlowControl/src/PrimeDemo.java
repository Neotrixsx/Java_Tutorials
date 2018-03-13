import java.util.Scanner;

public class PrimeDemo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		reader.close();

		boolean primeFlag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				primeFlag = false;
			}

		}
		if (primeFlag) {
			System.out.println("prime no.");
		} else {
			System.out.println("not prime no.");
		}
	}
}
