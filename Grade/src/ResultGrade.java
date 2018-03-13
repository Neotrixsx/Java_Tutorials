
public class ResultGrade {
	public static void main(String[] args) {
		int math = 90, physics = 60, chemistry = 90;
		if (math > 35 && physics > 35 && chemistry > 35) {
			int avg = (math + physics + chemistry) / 3;
			if (avg <= 59) {
				System.out.println("your grade is C");
			} else if (avg <= 69) {
				System.out.println("your grade is B");
			} else if (avg >= 70) {
				System.out.println("your grade is A");
			}
		} else {
			System.out.println("Result is failure");
		}
	}
}
